package de.dfki.cos.basys.platform.runtime.component;

import java.io.IOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import de.dfki.cos.basys.common.component.ComponentInfo;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequestEnvelop;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequestStatus;

public class ComponentController implements ChannelListener {

	protected String componentId;

	protected CommFactory cf = CommFactory.getInstance();

	protected BasysComponentContext context = null;

	protected Channel componentInChannel = null;
	protected Channel componentOutChannel = null;
	protected Channel componentStatusChannel = null;

	protected ComponentInfo componentInfo = null;

	protected ChannelListener listener = null;

	protected boolean isConnected = false;
//
//	private Lock lock;
//	private Condition executeCondition;
//
//	ComponentRequestEnvelop envelop;
	
	
	public ComponentController(String componentId) {
		this(componentId, null);
	}

	public ComponentController(String componentId, ChannelListener listener) {
		this.componentId = componentId;
		this.listener = listener;
		//this.lock = new ReentrantLock();
		//this.executeCondition = lock.newCondition();
	}

	public synchronized void connect(BasysComponentContext context) {

		if (isConnected)
			return;

		// TODO: controller should register itself at remote device component in order
		// to avoid two controllers can control a component at the same time.
		this.context = context;

		componentInfo = context.getComponentRegistry().getComponentById(StringConstants.categoryDevice, componentId);
		
		String inChannelName = componentInfo.getProperty(StringConstants.inChannelName);
		String outChannelName = componentInfo.getProperty(StringConstants.outChannelName);
		String statusChannelName = componentInfo.getProperty(StringConstants.statusChannelName);

		if (inChannelName != null && !inChannelName.equals(""))
			componentInChannel = cf.openChannel(context.getSharedChannelPool(), inChannelName, false, null);
		if (outChannelName != null && !outChannelName.equals(""))
			componentOutChannel = cf.openChannel(context.getSharedChannelPool(), outChannelName, false, this);
		if (statusChannelName != null && !statusChannelName.equals(""))
			componentStatusChannel = cf.openChannel(context.getSharedChannelPool(), statusChannelName, false, this);
		

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
			String payload = context.getObjectMapper().writeValueAsString(request);
			Request message = cf.createRequest(payload);
			Response response = componentInChannel.sendRequest(message);
			String result = response.getPayload();
			status = context.getObjectMapper().readValue(result, ComponentRequestStatus.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
//
//
//	public CompletableFuture<ComponentResponse> executeComponentRequest(ComponentRequest request) {
//		CompletableFuture<ComponentResponse> cf = CompletableFuture.supplyAsync(() -> {
//			envelop = new ComponentRequestEnvelop(request);
//			ComponentRequestStatus status = sendComponentRequest(request);
//			if (status.getStatus() == RequestStatus.ACCEPTED || status.getStatus() == RequestStatus.QUEUED) {
//				lock.lock();
//				try {
//					executeCondition.await();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				} finally {
//					lock.unlock();
//				}
//				return envelop.getResponse();
//			} else {
//				ComponentResponse response = new ComponentResponse.Builder().request(request).componentId(componentId)
//						.message(status.getMessage()).status(RequestStatus.NOT_OK).build();
//
//				return response;
//			}
//		});
//		return cf;
//	}
//
//	public void signalExecuteComplete() {
//		lock.lock();
//		executeCondition.signalAll();
//		lock.unlock();
//	}

	@Override
	public void handleMessage(Channel channel, String msg) {
		if (listener != null) {
			listener.handleMessage(channel, msg);
		}
	}

	@Override
	public void handleNotification(Channel channel, Notification not) {
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

}
