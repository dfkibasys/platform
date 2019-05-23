package de.dfki.cos.basys.platform.runtime.component.packml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
import de.dfki.cos.basys.platform.model.runtime.component.impl.SimulationConfigurationImpl;
import de.dfki.cos.basys.platform.runtime.component.BaseComponent;
import de.dfki.cos.basys.platform.runtime.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.packml.ActiveStatesHandler;
import de.dfki.cos.basys.platform.runtime.component.packml.CommandInterface;
import de.dfki.cos.basys.platform.runtime.component.packml.PackMLUnit;
import de.dfki.cos.basys.platform.runtime.component.packml.StatusInterface;
import de.dfki.cos.basys.platform.runtime.component.packml.UnitConfiguration;
import de.dfki.cos.basys.platform.runtime.component.packml.WaitStatesHandler;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistrationException;

public abstract class PackMLComponent extends BaseComponent implements StatusInterface, CommandInterface, ActiveStatesHandler, WaitStatesHandler {

	protected PackMLUnit packmlUnit;

	protected CommandRequest currentCommandRequest;
	protected ChangeModeRequest currentChangeModeRequest;
	protected CapabilityRequest currentCapabilityRequest;
	
	protected Set<ControlCommand> allowedControlCommands = new HashSet<>(Arrays.asList(ControlCommand.RESET, ControlCommand.START, ControlCommand.STOP));
	protected Set<ControlMode> allowedControlModes = new HashSet<>(Arrays.asList(ControlMode.PRODUCTION));	
	
	private Lock lock;
	private Condition executeCondition;
	PackMLStatesHandlerFacade handlerFacade = null;	
	
	public PackMLComponent(ComponentConfiguration config) {
		super(config);			

		if (config.getSimulationConfiguration() == null) {
			config.setSimulationConfiguration(new SimulationConfigurationImpl.Builder().build());
		} else {
			LOGGER.debug("using provided simulation config");
		}
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {	
		
		lock = new ReentrantLock();
		executeCondition = lock.newCondition();		
		
		handlerFacade = new PackMLStatesHandlerFacade(this);
		
		packmlUnit = new PackMLUnit(getId(), getName());
		packmlUnit.setActiveStatesHandler(handlerFacade);
		packmlUnit.setWaitStatesHandler(handlerFacade);		
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

	protected void updateRegistrationAndNotify() {

		LOGGER.trace("updateRegistrationAndNotify");
		// TODO: something like:Notification not = createStatusUpdate();

		LOGGER.info(String.format("component '%s' (id=%s) is now in state %s and mode %s", getName(), getId(), getState(), getMode()));

		if (statusChannel != null && statusChannel.isOpen()) {
			LOGGER.trace("send status update notification");
			try {
				ComponentInfo info = getComponentInfo();
				Notification not = cf.createNotification(JsonUtils.toString(info));
				statusChannel.sendNotification(not);
			} catch (ChannelException | JsonProcessingException e) {
				LOGGER.warn("could not send status update notification");
				LOGGER.warn(e.getMessage());
				e.printStackTrace();
			}
		} else {
			LOGGER.info("cannot send status update notification");
		}
		if (registration != null) {
			try {
				LOGGER.trace("update registration");
				registration.update();
			} catch (ComponentRegistrationException e) {
				LOGGER.warn("could not update registration");
				LOGGER.warn(e.getMessage());
				e.printStackTrace();
			}
		} else {
			LOGGER.info("cannot update registration, not registered");
		}

		LOGGER.trace("updateRegistrationAndNotify - finished");
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
	protected ComponentRequestStatus handleCommandRequest(CommandRequest req) {
		LOGGER.info(String.format("Execute command request '%s'", req.getControlCommand()));
		
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
		ComponentRequestStatus status;
		if (allowedControlModes.contains(req.getMode())) {
			status = setMode(req.getMode());
		} else {
			status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.REJECTED).message("not allowed").build();
		}
		return status;
	}
	
	@Override
	protected ComponentRequestStatus handleCapabilityRequest(CapabilityRequest req)	{
		ComponentRequestStatus status = canExecuteCapabilityRequest(req);
				
		return status;		
	}
	
	public ComponentRequestStatus canExecuteCapabilityRequest(CapabilityRequest req) {
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.ACCEPTED).build();
		return status;
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
		ComponentRequestStatus status = canSetMode(mode);
		
		if (status.getStatus() == RequestStatus.ACCEPTED) {
		
			status = packmlUnit.setMode(mode);
		
			if (status.getStatus() == RequestStatus.ACCEPTED) {
				updateRegistrationAndNotify();
			}
	
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					sleep(1);
					if (currentChangeModeRequest != null) {
						if (currentChangeModeRequest.getMode() == getMode()) {
							sendComponentResponse(currentChangeModeRequest, ResponseStatus.OK, 0);
						} else {
							sendComponentResponse(currentChangeModeRequest, ResponseStatus.NOT_OK, 0);
						}							
						currentChangeModeRequest = null;
					}				
				}
				
			}, "responseSender").start();	
			
		}
		return status;
	}
	
	protected ComponentRequestStatus canSetMode(ControlMode mode) {
		ComponentRequestStatus status;
		if (!allowedControlModes.contains(mode)) {
			status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.REJECTED).message("not allowed").build();
		} else {
			status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.ACCEPTED).message("allowed").build();
		}
		return status;
	}
	
	protected ComponentRequestStatus canExecuteCommand(ControlCommand command) {
		ComponentRequestStatus status;
		if (!allowedControlCommands.contains(command)) {
			status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.REJECTED).message("not allowed").build();
		} else {
			status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.ACCEPTED).message("allowed").build();
		}
		return status;
	}

	@Override
	public ComponentRequestStatus setUnitConfig(UnitConfiguration config) {
		return packmlUnit.setUnitConfig(config);
	}

	@Override
	public ComponentRequestStatus reset() {
		ComponentRequestStatus status = canExecuteCommand(ControlCommand.RESET);
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			status = packmlUnit.reset();
		}
		return status;
	}

	@Override
	public ComponentRequestStatus start() {
		ComponentRequestStatus status = canExecuteCommand(ControlCommand.START);
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			status = packmlUnit.start();
		}
		return status;
	}

	@Override
	public ComponentRequestStatus stop() {
		ComponentRequestStatus status = canExecuteCommand(ControlCommand.STOP);
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			status = packmlUnit.stop();
		}
		return status;
	}

	@Override
	public ComponentRequestStatus hold() {
		ComponentRequestStatus status = canExecuteCommand(ControlCommand.HOLD);
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			status = packmlUnit.hold();
		}
		return status;
	}

	@Override
	public ComponentRequestStatus unhold() {
		ComponentRequestStatus status = canExecuteCommand(ControlCommand.UNHOLD);
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			status = packmlUnit.unhold();
		}
		return status;
	}

	@Override
	public ComponentRequestStatus suspend() {
		ComponentRequestStatus status = canExecuteCommand(ControlCommand.SUSPEND);
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			status = packmlUnit.suspend();
		}
		return status;
	}

	@Override
	public ComponentRequestStatus unsuspend() {
		ComponentRequestStatus status = canExecuteCommand(ControlCommand.UNSUSPEND);
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			status = packmlUnit.unsuspend();
		}
		return status;
	}

	@Override
	public ComponentRequestStatus abort() {
		ComponentRequestStatus status = canExecuteCommand(ControlCommand.ABORT);
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			status = packmlUnit.abort();
		}
		return status;
	}

	@Override
	public ComponentRequestStatus clear() {
		ComponentRequestStatus status = canExecuteCommand(ControlCommand.CLEAR);
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			status = packmlUnit.clear();
		}
		return status;
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
