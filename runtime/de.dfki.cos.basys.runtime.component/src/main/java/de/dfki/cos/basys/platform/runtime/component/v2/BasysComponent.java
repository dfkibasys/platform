package de.dfki.cos.basys.platform.runtime.component.v2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.ComponentInfo;
import de.dfki.cos.basys.common.component.impl.BaseComponent;
import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ChannelException;
import de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ChangeModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.CommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse;
import de.dfki.cos.basys.platform.model.runtime.component.ControlMode;
import de.dfki.cos.basys.platform.model.runtime.component.RequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.State;
import de.dfki.cos.basys.platform.model.runtime.component.StatusRequest;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl;
import de.dfki.cos.basys.platform.model.runtime.component.impl.SimulationConfigurationImpl;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.util.BasysResourceSetImpl;

public class BasysComponent extends BaseComponent implements ChannelListener {
	
	protected BasysComponentContext context;

	protected CommFactory cf = CommFactory.getInstance();
	protected Client privateClient;
	protected Channel inChannel;
	protected Channel outChannel;
	protected Channel statusChannel;
	// protected Channel telemetryChannel;
	
	protected boolean connectedToBasys = false;
	
	//protected ComponentRequest pendingRequest;

	public BasysComponent(Properties config) {
		super(config);
		JsonUtils.factory = new BasysResourceSetImpl.Factory();
	}
	
	@Override
	public void activate(ComponentContext context) throws ComponentException {
		this.context = (BasysComponentContext) context; 
		super.activate(context);
	}
	
	@Override
	protected void doActivate() throws ComponentException {
		if (context.getSharedChannelPool() != null || config.containsKey(StringConstants.communicationProviderImplementationJavaClass)) {
			connectToBasys();
		}
	}
	
	@Override
	protected void doDeactivate() throws ComponentException {
		if (context.getSharedChannelPool() != null || config.containsKey(StringConstants.communicationProviderImplementationJavaClass)) {			
			disconnectFromBasys();
		}
	}
	
	protected void connectToBasys() {
		LOGGER.debug("connectToBasys");
		ChannelPool pool = context.getSharedChannelPool();

		if (pool == null 
				&& config.containsKey(StringConstants.communicationProviderImplementationJavaClass)
				&& config.containsKey(StringConstants.communicationProviderConnectionString)) {
			LOGGER.info("no shared channel pool, creating an internal pool");
			privateClient = cf.createClient(getId(), cf.createAuthentication(getId(), "secret", null));
			pool = cf.connectChannelPool(					
					privateClient, 
					config.getProperty(StringConstants.communicationProviderConnectionString), 
					config.getProperty(StringConstants.communicationProviderImplementationJavaClass));
			context.setSharedChannelPool(pool);
		}

		statusChannel = cf.openChannel(pool, StringConstants.baseStatusChannelName + "#" + getId(), false, null);

		if (config.containsKey(StringConstants.inChannelName)) {
			String channelName = config.getProperty(StringConstants.inChannelName);			
			if (!channelName.isEmpty()) {
				LOGGER.debug("open inChannel " + channelName);
				inChannel = cf.openChannel(pool, channelName, false, this);
			} else {
				LOGGER.debug("no input channel specified - empty");
			}
		} else {
			LOGGER.debug("no input channel specified - null");
		}
		
		if (config.containsKey(StringConstants.outChannelName)) {
			String channelName = config.getProperty(StringConstants.outChannelName);
			if (!channelName.isEmpty()) {
				LOGGER.debug("open outChannel " + channelName);
				outChannel = cf.openChannel(pool, channelName, false, null);
			} else {
				LOGGER.debug("no output channel specified - empty");
			}			
		} else {
			LOGGER.debug("no output channel specified - null");
		}
		connectedToBasys = true;
		LOGGER.debug("connectToBasys finished");
	}

	protected void disconnectFromBasys() {
		LOGGER.debug("disconnectFromBasys");
		if (inChannel != null) {
			inChannel.close();
			inChannel = null;
		}
		if (outChannel != null) {
			outChannel.close();
			outChannel = null;			
		}
		if (statusChannel != null) {
			statusChannel.close();
			statusChannel = null;
		}
		if (privateClient != null) {
			privateClient.disconnect();
			privateClient = null;
		}
		connectedToBasys = false;
		LOGGER.debug("disconnectFromBasys - finished");
	}


	
	@Override
	public ComponentInfo getInfo() {
		ComponentInfo info = super.getInfo();		
		info.putAll(config);
		info.setProperty(StringConstants.statusChannelName, StringConstants.baseStatusChannelName + "#" + getId());					
		return info;
	}
	
	public boolean isConnectedToBasys() {
		return connectedToBasys;
	}
	
	@Override
	protected void notifyChange() {
		super.notifyChange();
		// TODO: something like:Notification not = createStatusUpdate();

		//LOGGER.info(String.format("component '%s' (id=%s) is now in state %s and mode %s", getName(), getId(), getState(), getMode()));

//		if (statusChannel != null && statusChannel.isOpen()) {
//			LOGGER.trace("send status update notification");
//			try {
//				ComponentInfo info = getComponentInfo();
//				Notification not = cf.createNotification(JsonUtils.toString(info));
//				statusChannel.sendNotification(not);
//			} catch (ChannelException | JsonProcessingException e) {
//				LOGGER.warn("could not send status update notification");
//				LOGGER.warn(e.getMessage());
//				e.printStackTrace();
//			}
//		} else {
//			LOGGER.info("cannot send status update notification");
//		}
	}
	
	/*
	 * ChannelListener interface
	 */

	@Override
	public void handleMessage(Channel channel, String msg) {
	}

	@Override
	public void handleNotification(Channel channel, Notification not) {		

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
					status = handleComponentRequest(cr);
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
	
	protected ComponentRequestStatus handleComponentRequest(ComponentRequest cr) {
		ComponentRequestStatus status;
		
		if (cr instanceof StatusRequest) {
			StatusRequest req = (StatusRequest) cr;
			status = handleStatusRequest(req);
		} else {
			status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.REJECTED).message("unknown request").build();
		}
		
		return status;
	}
	
	protected ComponentRequestStatus handleStatusRequest(StatusRequest req) {
		ComponentRequestStatus status;
		
		if (statusChannel != null && statusChannel.isOpen()) {
			status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.ACCEPTED).build();
			LOGGER.info("send status update notification upon explicit request");
			try {
				ComponentInfo info = getInfo();
				//TODO: check serialization
				String payload = "";
				Gson gson = new Gson();
				payload = gson.toJson(info);
				Notification not = cf.createNotification(payload);
				//TODO: ggf auf eigenem Thread?
				statusChannel.sendNotification(not);
				
			} catch (ChannelException e) {
				e.printStackTrace();
			}
		} else {
			status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.REJECTED).message("status channel not available").build();
		}
		return status;
	}
	
	protected void sendComponentResponse(ComponentRequest request, ResponseStatus status, int statusCode) {
		List<Variable> resultVariables = new ArrayList<>(0);
		sendComponentResponse(request, status, statusCode, resultVariables);
	}
	
	protected void sendComponentResponse(ComponentRequest request, ResponseStatus status, int statusCode, Variable resultVariable) {
		List<Variable> resultVariables = new ArrayList<>(1);
		// Copy variable(s) is important for simulation: Variables are 'contained' in a SimulationConfiguration
		resultVariables.add(EcoreUtil.copy(resultVariable));
		sendComponentResponse(request, status, statusCode, resultVariables);
	}
	
	protected void sendComponentResponse(ComponentRequest request, ResponseStatus status, int statusCode, List<Variable> resultVariables) {
		if (request == null) {
			LOGGER.error("Cannot send response to null request. Skipping.");
			return;
		}
		
		ComponentRequest r = EcoreUtil.copy(request);
	
		ComponentResponse response = new ComponentResponseImpl.Builder().componentId(getId()).status(status).statusCode(statusCode).request(r).build();
		
		if (resultVariables != null) {
			// Copy variable(s) is important for simulation: Variables are 'contained' in a SimulationConfiguration
			response.getOutputParameters().addAll(EcoreUtil.copyAll(resultVariables));
		}
		try {
			String payload = JsonUtils.toString(response);
			Notification not = cf.createNotification(payload);
			outChannel.sendNotification(not);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	protected boolean isCapabilityRequestPending() {
//		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getCapabilityRequest())) 
//			return true;
//		return false;
//	}
//	
//	protected boolean isCommandRequestPending() {
//		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getCommandRequest())) 
//			return true;
//		return false;
//	}
//	
//	protected boolean isChangeModeRequestPending() {
//		if (pendingRequest != null && pendingRequest.eClass().equals(ComponentPackage.eINSTANCE.getChangeModeRequest())) 
//			return true;
//		return false;
//	}
	
	protected void sleep(long seconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
