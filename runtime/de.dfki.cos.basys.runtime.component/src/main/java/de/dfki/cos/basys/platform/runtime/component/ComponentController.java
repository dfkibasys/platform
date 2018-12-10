package de.dfki.cos.basys.platform.runtime.component;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.device.packml.StatusInterface;
import de.dfki.cos.basys.platform.runtime.component.device.packml.UnitConfiguration;
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
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.RequestStatus;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.impl.CapabilityRequestImpl;

public class ComponentController implements ChannelListener, StatusInterface {

	protected String componentId;

	protected CommFactory cf = CommFactory.getInstance();

	protected ComponentContext context = null;

	protected Channel componentInChannel = null;
	protected Channel componentOutChannel = null;
	protected Channel componentStatusChannel = null;

	protected ComponentInfo componentInfo = null;

	protected ChannelListener listener = null;

	protected boolean isConnected = false;
	
	private Lock lock;
	private Condition executeCondition;

	public ComponentController(String componentId) {
		this(componentId,null);		
	}

	public ComponentController(String componentId, ChannelListener listener) {
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
	
	public CompletableFuture<ComponentResponse> executeCapabilityFuture(CapabilityVariant<?,?> capability) {
		CapabilityRequest cr = new CapabilityRequestImpl.Builder().componentId(componentId).capabilityVariant(capability)
				.build();
		return executeComponentRequest(cr);
	}	

	@Override
	public void handleMessage(Channel channel, String msg) {
		if (listener != null) {
			listener.handleMessage(channel, msg);
		}

	}

	@Override
	public void handleNotification(Channel channel, Notification not) {
		//TODO: schöner machen: envelop ist nur gesetzt, falls executeComponentRequest aufgerufen wurde (dp, 30.05.2018)
		if (channel.getName().equals(componentOutChannel.getName()) && envelop != null) {
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
		throw new UnsupportedOperationException("method not implemented in component controller.");
	}

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