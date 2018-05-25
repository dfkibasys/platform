package de.dfki.iui.basys.runtime.component.device;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentFactory;
import de.dfki.iui.basys.model.runtime.component.ComponentInfo;
import de.dfki.iui.basys.model.runtime.component.ComponentRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.ComponentResponse;
import de.dfki.iui.basys.model.runtime.component.ControlCommand;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.RequestStatus;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.impl.CapabilityRequestImpl;
import de.dfki.iui.basys.model.runtime.component.impl.ChangeModeRequestImpl;
import de.dfki.iui.basys.model.runtime.component.impl.CommandRequestImpl;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.device.packml.CommandInterface;
import de.dfki.iui.basys.runtime.component.device.packml.StatusInterface;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

public class DeviceComponentController implements CommandInterface, ChannelListener, StatusInterface {

	private String componentId;

	protected CommFactory cf = CommFactory.getInstance();

	private ComponentContext context = null;

	private Channel componentInChannel = null;
	private Channel componentOutChannel = null;
	private Channel componentStatusChannel = null;

	private ComponentInfo componentInfo = null;

	private ChannelListener listener = null;

	boolean isConnected = false;
	
	private Lock lock;
	private Condition executeCondition;

	public DeviceComponentController(String componentId) {
		this(componentId,null);		
	}

	public DeviceComponentController(String componentId, ChannelListener listener) {
		this.componentId = componentId;
		this.listener = listener;
		this.lock = new ReentrantLock();
		this.executeCondition = lock.newCondition();
	}

	public void lazyConnect(ComponentContext context) {
		// TODO: controller should register itself at remote device component in order
		// to avoid two controllers can control a component at the same time.
		this.context = context;
	}

	public synchronized void connect(ComponentContext context) {

		if (isConnected)
			return;

		// TODO: controller should register itself at remote device component in order
		// to avoid two controllers can control a component at the same time.
		this.context = context;

		componentInfo = context.getComponentRegistry().getComponentById(ComponentCategory.DEVICE_COMPONENT,
				componentId);
		//synchronized (componentInfo) {
			if (componentInfo.getInChannelName() != null && !componentInfo.getInChannelName().equals(""))
				componentInChannel = cf.openChannel(context.getSharedChannelPool(), componentInfo.getInChannelName(),
						false, null);
			if (componentInfo.getOutChannelName() != null && !componentInfo.getOutChannelName().equals(""))
				componentOutChannel = cf.openChannel(context.getSharedChannelPool(), componentInfo.getOutChannelName(),
						false, this);
			if (componentInfo.getStatusChannelName() != null && !componentInfo.getStatusChannelName().equals(""))
				componentStatusChannel = cf.openChannel(context.getSharedChannelPool(),
						componentInfo.getStatusChannelName(), false, this);
		//}

		isConnected = true;
	}

	public void disconnect() {

		if (!isConnected)
			return;

		// TODO: unregister at remote device controller
		if (componentInChannel != null)
			componentInChannel.close();
		if (componentOutChannel != null)
			componentOutChannel.close();
		if (componentStatusChannel != null)
			componentStatusChannel.close();

		isConnected = false;
	}

	public ComponentInfo getComponentInfo() {
		return componentInfo;
	}
	
	private ComponentRequestStatus sendCommandRequest(ControlCommand command) {
		ComponentRequest cr = new CommandRequestImpl.Builder().componentId(componentId).controlCommand(command).build();
		return sendComponentRequest(cr);
	}

	private ComponentRequestStatus sendChangeModeRequest(ControlMode mode) {
		ComponentRequest cr = new ChangeModeRequestImpl.Builder().componentId(componentId).mode(mode).build();
		return sendComponentRequest(cr);
	}

	private ComponentRequestStatus sendCapabilityRequest(CapabilityVariant capability) {
		CapabilityRequest cr = new CapabilityRequestImpl.Builder().componentId(componentId).capabilityVariant(capability)
				.build();
		return sendComponentRequest(cr);
	}

	
	//TODO: public ist hier nicht schön, ggf Klasse in processcontrol verschieben?
	public ComponentRequestStatus sendComponentRequest(ComponentRequest request) {

		connect(this.context);

		ComponentRequestStatus status = null;
		try {
			String payload = JsonUtils.toString(request);
			Request message = cf.createRequest(payload);
			Response response = componentInChannel.sendRequest(message);
			String result = response.getPayload();
			status = JsonUtils.fromString(result, ComponentRequestStatus.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	ComponentRequestEnvelop envelop;
	
	public CompletableFuture<ComponentResponse> executeComponentRequest(ComponentRequest request) {
		CompletableFuture<ComponentResponse> cf = CompletableFuture.supplyAsync(() -> {
			envelop = new ComponentRequestEnvelop(request);
			ComponentRequestStatus status = sendComponentRequest(request);
			if (status.getStatus() == RequestStatus.ACCEPTED) {
				lock.lock();
				try {
					executeCondition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();				
				} finally {
					lock.unlock();
				}
				return envelop.getResponse();
			} else {
				ComponentResponse response = ComponentFactory.eINSTANCE.createComponentResponse();
				// TODO: ggf. eContainer-Wechsel?
				response.setRequest(request);
				response.setComponentId(getId());
				response.setMessage(status.getMessage());
				response.setStatus(ResponseStatus.NOT_OK);	
				return response;
			} 
		});
		return cf;	
	}
	
		
	public void signalExecuteComplete() {
		lock.lock();
		executeCondition.signalAll();
		lock.unlock();
	}
	
	public CompletableFuture<ComponentResponse> executeCapabilityFuture(CapabilityVariant<?> capability) {
		CapabilityRequest cr = new CapabilityRequestImpl.Builder().componentId(componentId).capabilityVariant(capability)
				.build();
		return executeComponentRequest(cr);
	}

	public ComponentRequestStatus executeCapability(CapabilityVariant<?> capability) {
		ComponentRequestStatus status = sendCapabilityRequest(capability);
		return status;
	}
	
	@Override
	public ComponentRequestStatus setMode(ControlMode mode) {
		ComponentRequestStatus status = sendChangeModeRequest(mode);
		return status;
	}

	@Override
	public ComponentRequestStatus setUnitConfig(UnitConfiguration config) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComponentRequestStatus reset() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.RESET);
		return status;
	}

	@Override
	public ComponentRequestStatus start() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.START);
		return status;
	}

	@Override
	public ComponentRequestStatus stop() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.STOP);
		return status;
	}

	@Override
	public ComponentRequestStatus hold() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.HOLD);
		return status;
	}

	@Override
	public ComponentRequestStatus unhold() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.UNHOLD);
		return status;
	}

	@Override
	public ComponentRequestStatus suspend() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.SUSPEND);
		return status;
	}

	@Override
	public ComponentRequestStatus unsuspend() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.UNSUSPEND);
		return status;
	}

	@Override
	public ComponentRequestStatus abort() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.ABORT);
		return status;
	}

	@Override
	public ComponentRequestStatus clear() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.CLEAR);
		return status;
	}

	@Override
	public void handleMessage(Channel channel, String msg) {
		if (listener != null) {
			listener.handleMessage(channel, msg);
		}

	}

	@Override
	public void handleNotification(Channel channel, Notification not) {
		
		if (channel.getName().equals(componentOutChannel.getName())) {
			try {
				ComponentResponse response = JsonUtils.fromString(not.getPayload(), ComponentResponse.class);
				envelop.setResponse(response);
				signalExecuteComplete();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		

		if (channel.getName().equals(componentStatusChannel.getName())) {
			//synchronized (componentInfo) {
				try {
					componentInfo = JsonUtils.fromString(not.getPayload(), ComponentInfo.class);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//}
		}

		if (listener != null) {
			listener.handleNotification(channel, not);
		}
	}

	@Override
	public Response handleRequest(Channel channel, Request req) {
		if (listener != null) {
			return listener.handleRequest(channel, req);
		}

		return null;
	}

	@Override
	public String getId() {
		return componentId;
	}

	@Override
	public State getState() {
		connect(context);
		return componentInfo.getCurrentState();

	}

	@Override
	public ControlMode getMode() {
		connect(context);
		return componentInfo.getCurrentMode();

	}

	@Override
	public UnitConfiguration getUnitConfig() {
		throw new UnsupportedOperationException("method not implemented in device component controller.");
	}
	
//	public void resetAsync(ComponentResponseCallback cb) {
//		ComponentRequestStatus status = sendCommandRequest(ControlCommand.RESET);
//		return status;
//	};
//	
//	public interface ComponentResponseCallback {
//		void handleComponentResponse(ComponentResponse response);
//	}

	public class ComponentRequestEnvelop {

		ComponentRequest request;
		ComponentResponse response;
		
		public ComponentRequestEnvelop(ComponentRequest request) {
			this.request = request;
		}
		
		public ComponentRequest getRequest() {
			return request;
		}
		
		public ComponentResponse getResponse() {
			return response;
		}
		
		public void setResponse(ComponentResponse response) {
			this.response = response;
		}
		
		
	}
	
}
