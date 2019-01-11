package de.dfki.cos.basys.platform.runtime.component.device;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ChannelException;
import de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ChangeModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.CommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse;
import de.dfki.cos.basys.platform.model.runtime.component.ControlCommand;
import de.dfki.cos.basys.platform.model.runtime.component.ControlMode;
import de.dfki.cos.basys.platform.model.runtime.component.RequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.State;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl;
import de.dfki.cos.basys.platform.runtime.component.BaseComponent;
import de.dfki.cos.basys.platform.runtime.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.device.packml.ActiveStatesHandler;
import de.dfki.cos.basys.platform.runtime.component.device.packml.CommandInterface;
import de.dfki.cos.basys.platform.runtime.component.device.packml.PackMLUnit;
import de.dfki.cos.basys.platform.runtime.component.device.packml.StatusInterface;
import de.dfki.cos.basys.platform.runtime.component.device.packml.UnitConfiguration;
import de.dfki.cos.basys.platform.runtime.component.device.packml.WaitStatesHandler;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistrationException;

public abstract class DeviceComponent extends BaseComponent implements StatusInterface, CommandInterface, ActiveStatesHandler, WaitStatesHandler {

	protected PackMLUnit packmlUnit;

	protected boolean resetOnComplete, resetOnStopped = false;

	private BlockingQueue<CapabilityRequest> requestQueue = new LinkedBlockingQueue<CapabilityRequest>(32);
	protected CommandRequest currentCommandRequest;
	protected ChangeModeRequest currentChangeModeRequest;
	protected CapabilityRequest currentCapabilityRequest;
	
	
	private Lock lock;
	private Condition executeCondition;
	PackMLStatesHandlerFacade handlerFacade = null;	
	
	public DeviceComponent(ComponentConfiguration config) {
		super(config);
		
		if (config.getProperty("resetOnComplete") != null) {
			resetOnComplete = Boolean.parseBoolean(config.getProperty("resetOnComplete").getValue());
			LOGGER.info("resetOnComplete = " + resetOnComplete);
		}
		if (config.getProperty("resetOnStopped") != null) {
			resetOnStopped = Boolean.parseBoolean(config.getProperty("resetOnStopped").getValue());
			LOGGER.info("resetOnStopped = " + resetOnStopped);
		}
		
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
				
		if (currentCapabilityRequest == null && getState() == State.IDLE) {
			LOGGER.info("Execute capability request");
			currentCapabilityRequest = req;
			UnitConfiguration config = translateCapabilityRequest(currentCapabilityRequest);		
			status = setUnitConfig(config);					
			status = start();	
		} else {
			LOGGER.info("Enqueue capability request");
			if (requestQueue.remainingCapacity()>0) {
				requestQueue.add(req);
				status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("capability request enqueued").build();
			} else {
				status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.REJECTED).message("capability request queue full").build();
			}
		}
		
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
			currentCommandRequest = req;
		
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
	
	protected void handleCapabilityResponse(ResponseStatus status, int statusCode) {
		if (currentCapabilityRequest != null) {
			sendComponentResponse(currentCapabilityRequest, status, statusCode);
			currentCapabilityRequest = null;
		} else {
			// might occur in onStopping if stop() is triggered externally without executing capability request
			LOGGER.info("no current capability request to respond to");
		}
	}
	
	protected void handleCapabilityResponse(ResponseStatus status, int statusCode, Variable resultVariable) {
		if (currentCapabilityRequest != null) {
			sendComponentResponse(currentCapabilityRequest, status, statusCode, resultVariable);
			currentCapabilityRequest = null;
		} else {
			// might occur in onStopping if stop() is triggered externally without executing capability request
			LOGGER.info("no current capability request to respond to");
		}
	}
	
	protected void handleCapabilityResponse(ResponseStatus status, int statusCode, List<Variable> resultVariables) {
		if (currentCapabilityRequest != null) {
			sendComponentResponse(currentCapabilityRequest, status, statusCode, resultVariables);
			currentCapabilityRequest = null;
		} else {
			// might occur in onStopping if stop() is triggered externally without executing capability request
			LOGGER.info("no current capability request to respond to");
		}
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
				if (currentChangeModeRequest != null) {					
					if (simulated) {
						sendComponentResponse(currentChangeModeRequest, ResponseStatus.OK, 0);
					} else {
						if (currentChangeModeRequest.getMode() == getMode()) {
							sendComponentResponse(currentChangeModeRequest, ResponseStatus.OK, 0);
						} else {
							sendComponentResponse(currentChangeModeRequest, ResponseStatus.NOT_OK, 0);
						}		
					}
					currentChangeModeRequest = null;
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
		if (currentCommandRequest != null) {
			if (currentCommandRequest.getControlCommand() == ControlCommand.STOP || currentCommandRequest.getControlCommand() == ControlCommand.CLEAR) {
				sendComponentResponse(currentCommandRequest, ResponseStatus.OK, 0);
			} else {
				sendComponentResponse(currentCommandRequest, ResponseStatus.NOT_OK, 0);
			} 
			currentCommandRequest = null;
		}
		
		if (resetOnStopped) {
			reset();
		}
	}

	@Override
	public void onIdle() {
		if (currentCommandRequest != null) {
			if (currentCommandRequest.getControlCommand() == ControlCommand.RESET) {
				sendComponentResponse(currentCommandRequest, ResponseStatus.OK, 0);
			} else {
				sendComponentResponse(currentCommandRequest, ResponseStatus.NOT_OK, 0);
			} 
			currentCommandRequest = null;			
		}
		
		CapabilityRequest queuedRequest = requestQueue.poll();
		if (queuedRequest != null) {
			handleCapabilityRequest(queuedRequest);
		}
		
	}

	@Override
	public void onComplete() {
		if (currentCommandRequest != null) {
			if (currentCommandRequest.getControlCommand() == ControlCommand.START) {
				sendComponentResponse(currentCommandRequest, ResponseStatus.OK, 0);
			} else {
				sendComponentResponse(currentCommandRequest, ResponseStatus.NOT_OK, 0);
			} 
			currentCommandRequest = null;			
		}
		
		if (resetOnComplete) {
			reset();
		}
	}

	@Override
	public void onHeld() {
		if (currentCommandRequest != null) {
			if (currentCommandRequest.getControlCommand() == ControlCommand.HOLD) {
				sendComponentResponse(currentCommandRequest, ResponseStatus.OK, 0);
			} else {
				sendComponentResponse(currentCommandRequest, ResponseStatus.NOT_OK, 0);
			} 
			currentCommandRequest = null;			
		}
	}

	@Override
	public void onSuspended() {
		if (currentCommandRequest != null) {
			if (currentCommandRequest.getControlCommand() == ControlCommand.SUSPEND) {
				sendComponentResponse(currentCommandRequest, ResponseStatus.OK, 0);
			} else {
				sendComponentResponse(currentCommandRequest, ResponseStatus.NOT_OK, 0);
			} 
			currentCommandRequest = null;			
		}
	}

	@Override
	public void onAborted() {
		if (currentCommandRequest != null) {
			if (currentCommandRequest.getControlCommand() == ControlCommand.ABORT) {
				sendComponentResponse(currentCommandRequest, ResponseStatus.OK, 0);
			} else {
				sendComponentResponse(currentCommandRequest, ResponseStatus.NOT_OK, 0);
			} 
			currentCommandRequest = null;			
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
		handleCapabilityResponse(ResponseStatus.OK, getErrorCode());
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
		handleCapabilityResponse(ResponseStatus.NOT_OK, getErrorCode());
	}


}
