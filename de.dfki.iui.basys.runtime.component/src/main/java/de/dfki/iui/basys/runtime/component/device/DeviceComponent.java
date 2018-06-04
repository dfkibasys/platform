package de.dfki.iui.basys.runtime.component.device;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelException;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ChangeModeRequest;
import de.dfki.iui.basys.model.runtime.component.CommandRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentInfo;
import de.dfki.iui.basys.model.runtime.component.ComponentPackage;
import de.dfki.iui.basys.model.runtime.component.ComponentRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.ComponentResponse;
import de.dfki.iui.basys.model.runtime.component.ControlCommand;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.RequestStatus;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.StatusRequest;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentRequestStatusImpl;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentResponseImpl;
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
	
	protected ComponentRequest pendingRequest;

	public DeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {

		NotifyingStatesHandlerFacade handler = new NotifyingStatesHandlerFacade(this);

		packmlUnit = new PackMLUnit(getId());
		packmlUnit.setActiveStatesHandler(handler);
		packmlUnit.setWaitStatesHandler(handler);
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
	public Response handleRequest(Channel channel, Request request) {
		ComponentRequestStatus status = null;
		try {
			EObject ob = JsonUtils.fromString(request.getPayload(), EObject.class);
			if (ob instanceof ComponentRequest) {
				ComponentRequest cr = (ComponentRequest) ob;

				if (!getId().equals(cr.getComponentId())) {
					// don't make the same mistake as BMW: https://www.heise.de/newsticker/meldung/ConnectedDrive-Der-BMW-Hack-im-Detail-2540786.html
					status = new ComponentRequestStatusImpl.Builder().componentId(cr.getComponentId()).status(RequestStatus.REJECTED).message("componentId does not match").build();
				} else {
					if (cr instanceof ChangeModeRequest) {
						ChangeModeRequest req = (ChangeModeRequest) cr;
						status = handleChangeModeRequest(req);
					} else if (cr instanceof CommandRequest) {
						CommandRequest req = (CommandRequest) cr;
						status = handleCommandRequest(req);
					} else if (cr instanceof CapabilityRequest) {
						CapabilityRequest req = (CapabilityRequest) cr;
						status = handleCapabilityRequest(req);
					} else if (cr instanceof StatusRequest) {
						StatusRequest req = (StatusRequest) cr;
						status = handleStatusRequest(req);
					}
				}
			} else {
				status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.REJECTED).message("unknown request").build();
			}
			String payload = JsonUtils.toString(status);
			return cf.createResponse(request.getId(), payload);
		} catch (IOException e) {
			e.printStackTrace();
			status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.REJECTED).message(e.getMessage()).build();
			try {
				String payload = JsonUtils.toString(status);
				return cf.createResponse(request.getId(), payload);
			} catch (IOException e1) {
				e1.printStackTrace();
				return cf.createResponse(request.getId(), e1.getMessage());
			}
		}
	}

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
		
		return status;
	}

	public ComponentRequestStatus canExecuteCapabilityRequest(CapabilityRequest req) {
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.ACCEPTED).build();
		return status;
	}
	
	protected abstract UnitConfiguration translateCapabilityRequest(CapabilityRequest req);
	
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

	protected ComponentRequestStatus handleChangeModeRequest(ChangeModeRequest req) {
		ComponentRequestStatus status = setMode(req.getMode());
		return status;
	}


	protected ComponentRequestStatus handleStatusRequest(StatusRequest req) {
		ComponentRequestStatus status;
		
		if (statusChannel != null && statusChannel.isOpen()) {
			status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.ACCEPTED).build();
			LOGGER.info("send status update notification upon explicit request");
			try {
				ComponentInfo info = getComponentInfo();
				Notification not = cf.createNotification(JsonUtils.toString(info));
				//TODO ggf auf eigenem Thread?
				statusChannel.sendNotification(not);
				
			} catch (ChannelException | JsonProcessingException e) {
				e.printStackTrace();
			}
		} else {
			status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.REJECTED).message("status channel not available").build();
		}
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

	protected void sendComponentResponse(ResponseStatus status, int statusCode) {
		if (pendingRequest == null) {
			LOGGER.error("Cannot send response to null request. Skipping.");
			return;
		}
		
		ComponentRequest r = EcoreUtil.copy(pendingRequest);
	
		ComponentResponse response = new ComponentResponseImpl.Builder().componentId(getId()).status(status).statusCode(statusCode).request(pendingRequest).build();
		response.setRequest(r);
		try {
			String payload = JsonUtils.toString(response);
			Notification not = cf.createNotification(payload);
			outChannel.sendNotification(not);			
			
			pendingRequest = null;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected boolean isCapabilityRequestPending() {
		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getCapabilityRequest())) 
			return true;
		return false;
	}
	
	protected boolean isCommandRequestPending() {
		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getCommandRequest())) 
			return true;
		return false;
	}
	
	protected boolean isChangeModeRequestPending() {
		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getChangeModeRequest())) 
			return true;
		return false;
	}
	
	protected void sleep(long seconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * CommandInterface
	 */

	@Override
	public ComponentRequestStatus setMode(ControlMode mode) {
		ComponentRequestStatus status = packmlUnit.setMode(mode);

		if (status.getStatus() == RequestStatus.ACCEPTED) {
			updateRegistrationAndNotify();
		}

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				sleep(1);
				if (isChangeModeRequestPending()) {
					ChangeModeRequest r = (ChangeModeRequest) pendingRequest;
					if (r.getMode() == getMode()) {
						sendComponentResponse(ResponseStatus.OK, 0);
					} else {
						sendComponentResponse(ResponseStatus.NOT_OK, 0);
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
