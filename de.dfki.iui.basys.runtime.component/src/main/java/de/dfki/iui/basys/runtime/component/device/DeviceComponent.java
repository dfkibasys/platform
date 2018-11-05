package de.dfki.iui.basys.runtime.component.device;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelException;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ChangeModeRequest;
import de.dfki.iui.basys.model.runtime.component.CommandRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentInfo;
import de.dfki.iui.basys.model.runtime.component.ComponentPackage;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.ControlCommand;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.RequestStatus;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.Variable;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentRequestStatusImpl;
import de.dfki.iui.basys.runtime.component.BaseComponent;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.ActiveStatesHandler;
import de.dfki.iui.basys.runtime.component.device.packml.CommandInterface;
import de.dfki.iui.basys.runtime.component.device.packml.PackMLUnit;
import de.dfki.iui.basys.runtime.component.device.packml.StatusInterface;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.basys.runtime.component.device.packml.WaitStatesHandler;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistrationException;

public abstract class DeviceComponent extends BaseComponent implements StatusInterface, CommandInterface, ActiveStatesHandler, WaitStatesHandler {

	protected PackMLUnit packmlUnit;

	protected boolean resetOnComplete, resetOnStopped = false;

	private Lock lock;
	private Condition executeCondition;
	PackMLStatesHandlerFacade handlerFacade = null;	
	
	public DeviceComponent(ComponentConfiguration config) {
		super(config);
		
		lock = new ReentrantLock();
		executeCondition = lock.newCondition();		
		handlerFacade = new PackMLStatesHandlerFacade(this);

		packmlUnit = new PackMLUnit(getId(), getName());
		packmlUnit.setActiveStatesHandler(handlerFacade);
		packmlUnit.setSimStatesHandler(new SimulatedStatesHandler(this));
		packmlUnit.setWaitStatesHandler(handlerFacade);
		if (simulated) {
			packmlUnit.setMode(ControlMode.SIMULATION);
		}	
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {

			
		packmlUnit.initialize();

		super.activate(context);

		LOGGER.info("activated");
	}

	@Override
	public void deactivate() throws ComponentException {
		super.deactivate();

		packmlUnit.dispose();

		LOGGER.info("deactivated");
	}

	public void awaitExecuteComplete() {
		lock.lock();
		try {
			executeCondition.await();						
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		} finally {
			lock.unlock();
		}
	}
	
	public void signalExecuteComplete() {
		lock.lock();
		executeCondition.signalAll();
		lock.unlock();
	}
	
	public int getErrorCode() {
		return packmlUnit.getErrorCode();
	}

	public void setErrorCode(int errorCode) {
		packmlUnit.setErrorCode(errorCode);
	}

	/*
	 * StatusInterface
	 */

	@Override
	public State getState() {
		return getState(false);
	}
	
	public State getState(boolean fromRecord) {
		if (fromRecord)
			return handlerFacade.getLastState();
		else 
			return packmlUnit.getState();
	}

	@Override
	public ControlMode getMode() {
		return packmlUnit.getMode();
	}

	@Override
	public UnitConfiguration getUnitConfig() {
		return packmlUnit.getUnitConfig();
	}


	@Override
	protected ComponentRequestStatus handleCapabilityRequest(CapabilityRequest req)	{
		ComponentRequestStatus status = canExecuteCapabilityRequest(req);
		
		if (status.getStatus() == RequestStatus.REJECTED)
			return status;
		
		// "translate"
		UnitConfiguration config = translateCapabilityRequest(req);
		// set config
		status = setUnitConfig(config);
		
		if (status.getStatus() == RequestStatus.REJECTED)
			return status;
		
		status = start();
		
		if (status.getStatus() == RequestStatus.ACCEPTED)
			pendingRequest = req;
		else
			LOGGER.info("NOT ACCEPTED");
		
		return status;
	}

	public ComponentRequestStatus canExecuteCapabilityRequest(CapabilityRequest req) {
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.ACCEPTED).build();
		return status;
	}
	
	protected abstract UnitConfiguration translateCapabilityRequest(CapabilityRequest req);
	
	@Override
	protected ComponentRequestStatus handleCommandRequest(CommandRequest req) {
		ComponentRequestStatus status = null;
		switch (req.getControlCommand()) {
		case ABORT:
			// if (getState() != State.ABORTED && getState() != State.ABORTING)
			status = abort();
			break;
		case CLEAR:
			status = clear();
			break;
		case HOLD:
			status = hold();
			break;
		case RESET:
			status = reset();
			break;
		case START:
			status = start();
			break;
		case STOP:
			status = stop();
			break;
		case SUSPEND:
			status = suspend();
			break;
		case UNHOLD:
			status = unhold();
			break;
		case UNSUSPEND:
			status = unsuspend();
			break;
		case NO_COMMAND:
		default:
			status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.REJECTED).message("unknown command").build();
			break;
		}
		
		if (status.getStatus() == RequestStatus.ACCEPTED)
			pendingRequest = req;
		
		return status;
	}

	@Override
	protected ComponentRequestStatus handleChangeModeRequest(ChangeModeRequest req) {
		ComponentRequestStatus status = setMode(req.getMode());
		return status;
	}

	protected void updateRegistrationAndNotify() {

		LOGGER.debug("updateRegistrationAndNotify");
		// TODO: something like:Notification not = createStatusUpdate();

		LOGGER.info(String.format("component '%s' (id=%s) is now in state %s and mode %s", getName(), getId(), getState(), getMode()));

		if (statusChannel != null && statusChannel.isOpen()) {
			LOGGER.debug("send status update notification");
			try {
				ComponentInfo info = getComponentInfo();
				Notification not = cf.createNotification(JsonUtils.toString(info));
				statusChannel.sendNotification(not);
			} catch (ChannelException | JsonProcessingException e) {
				e.printStackTrace();
			}
		} else {
			LOGGER.info("cannot send status update notification");
		}
		if (registration != null) {
			try {
				LOGGER.debug("update registration");
				registration.update();
			} catch (ComponentRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			LOGGER.info("cannot update registration, not registered");
		}

		LOGGER.debug("updateRegistrationAndNotify - finished");
	}	
	
	@Override
	protected void sendComponentResponse(ResponseStatus status, int statusCode) {	
		super.sendComponentResponse(status, statusCode);
	}
	
	@Override
	protected void sendComponentResponse(ResponseStatus status, int statusCode, Variable resultVariable) {
		super.sendComponentResponse(status, statusCode, resultVariable);
	}
	
	@Override
	protected void sendComponentResponse(ResponseStatus status, int statusCode, List<Variable> resultVariables) {	
		super.sendComponentResponse(status, statusCode, resultVariables);
	}
	
	@Override
	protected boolean isCapabilityRequestPending() {
		return super.isCapabilityRequestPending();
	}
	
	/*
	 * CommandInterface
	 */

	@Override
	public ComponentRequestStatus setMode(ControlMode mode) {
		ComponentRequestStatus status;
		
		if (simulated) {
			LOGGER.info("in SIMULATION mode: pretend mode switch");
			status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.NOOP).message(String.format("pretending mode switch to {} in SIMULATION mode", mode)).build();
			
		} else {		
			status = packmlUnit.setMode(mode);
		}
		
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			updateRegistrationAndNotify();
		}

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				sleep(1);
				if (isChangeModeRequestPending()) {
					ChangeModeRequest r = (ChangeModeRequest) pendingRequest;
					if (simulated) {
						sendComponentResponse(ResponseStatus.OK, 0);
					} else {
						if (r.getMode() == getMode()) {
							sendComponentResponse(ResponseStatus.OK, 0);
						} else {
							sendComponentResponse(ResponseStatus.NOT_OK, 0);
						}		
					}
				}
				
			}
		}, "responseSender").start();	
		
		return status;
	}

	@Override
	public ComponentRequestStatus setUnitConfig(UnitConfiguration config) {
		return packmlUnit.setUnitConfig(config);
	}

	@Override
	public ComponentRequestStatus reset() {
		return packmlUnit.reset();
	}

	@Override
	public ComponentRequestStatus start() {
		return packmlUnit.start();
	}

	@Override
	public ComponentRequestStatus stop() {
		return packmlUnit.stop();
	}

	@Override
	public ComponentRequestStatus hold() {
		return packmlUnit.hold();
	}

	@Override
	public ComponentRequestStatus unhold() {
		return packmlUnit.unhold();
	}

	@Override
	public ComponentRequestStatus suspend() {
		return packmlUnit.suspend();
	}

	@Override
	public ComponentRequestStatus unsuspend() {
		return packmlUnit.unsuspend();
	}

	@Override
	public ComponentRequestStatus abort() {
		return packmlUnit.abort();
	}

	@Override
	public ComponentRequestStatus clear() {
		return packmlUnit.clear();
	}

	/*
	 * default WaitStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onStopped() {
		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getCommandRequest())) {
			CommandRequest r = (CommandRequest) pendingRequest;
			if (r.getControlCommand() == ControlCommand.STOP || r.getControlCommand() == ControlCommand.CLEAR) {
				sendComponentResponse(ResponseStatus.OK, 0);
			}			
		}
		
		
		if (resetOnStopped) {
			reset();
		}
	}

	@Override
	public void onIdle() {
		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getCommandRequest())) {
			CommandRequest r = (CommandRequest) pendingRequest;
			if (r.getControlCommand() == ControlCommand.RESET) {
				sendComponentResponse(ResponseStatus.OK, 0);
			}			
		}
	}

	@Override
	public void onComplete() {
		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getCommandRequest())) {
			CommandRequest r = (CommandRequest) pendingRequest;
			if (r.getControlCommand() == ControlCommand.START) {
				sendComponentResponse(ResponseStatus.OK, 0);
			}			
		}
		
		if (resetOnComplete) {
			reset();
		}
	}

	@Override
	public void onHeld() {
		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getCommandRequest())) {
			CommandRequest r = (CommandRequest) pendingRequest;
			if (r.getControlCommand() == ControlCommand.HOLD) {
				sendComponentResponse(ResponseStatus.OK, 0);
			}			
		}
	}

	@Override
	public void onSuspended() {
		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getCommandRequest())) {
			CommandRequest r = (CommandRequest) pendingRequest;
			if (r.getControlCommand() == ControlCommand.SUSPEND) {
				sendComponentResponse(ResponseStatus.OK, 0);
			}			
		}
	}

	@Override
	public void onAborted() {
		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getCommandRequest())) {
			CommandRequest r = (CommandRequest) pendingRequest;
			if (r.getControlCommand() == ControlCommand.ABORT) {
				sendComponentResponse(ResponseStatus.OK, 0);
			}			
		}
	}

	/*
	 * default ActiveStatesHandler implementation -> trigger logic on device
	 */

	@Override
	public void onResetting() {
	}

	@Override
	public void onStarting() {
	}

	@Override
	public void onExecute() {
	}

	@Override
	public void onCompleting() {
	}

	@Override
	public void onHolding() {
	}

	@Override
	public void onUnholding() {
	}

	@Override
	public void onSuspending() {
	}

	@Override
	public void onUnsuspending() {
	}

	@Override
	public void onAborting() {
	}

	@Override
	public void onClearing() {
	}

	@Override
	public void onStopping() {
	}

}
