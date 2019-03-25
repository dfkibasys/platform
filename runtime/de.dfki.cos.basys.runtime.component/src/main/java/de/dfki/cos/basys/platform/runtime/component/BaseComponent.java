package de.dfki.cos.basys.platform.runtime.component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;

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
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
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
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl;
import de.dfki.cos.basys.platform.model.runtime.component.impl.SimulationConfigurationImpl;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistration;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistrationException;
import de.dfki.cos.basys.platform.runtime.component.util.BasysResourceSetImpl;

public class BaseComponent implements Component, ChannelListener {

	public final Logger LOGGER;

	protected ComponentConfiguration componentConfig;
	protected ComponentContext context;

	
	protected CommFactory cf = CommFactory.getInstance();
	protected Client privateClient;
	protected Channel inChannel;
	protected Channel outChannel;
	protected Channel statusChannel;
	// protected Channel telemetryChannel;

	protected ComponentRegistration registration;

	protected boolean connectedToExternal = false;
	protected boolean observeExternalConnection = false;
	private ScheduledFuture<?> externalConnectionHandle = null;
	private boolean activated = false;
	
	//protected ComponentRequest pendingRequest;

	public BaseComponent(ComponentConfiguration config) {
		JsonUtils.factory = new BasysResourceSetImpl.Factory();
		this.componentConfig = config;
		LOGGER = LoggerFactory.getLogger("basys.component." + componentConfig.getComponentName().replaceAll(" ", "-"));

		
	}

	@Override
	public String getId() {
		return componentConfig.getComponentId();
	}

	@Override
	public String getName() {
		return componentConfig.getComponentName();
	}

	@Override
	public ComponentCategory getCategory() {
		return componentConfig.getComponentCategory();
	}

	@Override
	public ComponentConfiguration getConfig() {
		return componentConfig;
	}

	@Override
	public State getState() {
		return State.EXECUTE;
	}

	@Override
	public ControlMode getMode() {
		return ControlMode.PRODUCTION;
	}

	@Override
	public boolean isActivated() {
		return activated;
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		LOGGER.info("activate");
		if (!activated) {

			if (context == null) {
				LOGGER.error("Context must not be null!");
				throw new ComponentException("Context must not be null!");
			}
			// use copy constructor. if sharedChannelPool is null, it can be set afterwards for reuse in dependent components, e.g. DeviceComponentController
			this.context = new ComponentContext(context);

			if (componentConfig.getExternalConnectionString() != null && !componentConfig.getExternalConnectionString().equals("")) {
								
				LOGGER.info("connectToExternal: " + getConfig().getExternalConnectionString());
				try {
					if (canConnectToExternal()) {
						connectToExternal();
						connectedToExternal = true;
					} else {
						LOGGER.warn("component cannot connectToExternal(), skip ...");
					}
					LOGGER.debug("connectToExternal - finished");
				} catch (ComponentException e) {
					LOGGER.error(e.getMessage());
					LOGGER.warn("component could not connectToExternal()");
					//e.printStackTrace();
					connectedToExternal = false;
				}
				
				observeExternalConnection();
				
			}
			// else {
			// LOGGER.warn("no device connection string provided, enter simulation mode");
			// // enter some kind of simulation mode like so:
			// //unit.setActiveStatesHandler(simulationActHandler);
			// //unit.setWaitStatesHandler(simulationWaitHandler);
			// }

			if (context.getSharedChannelPool() != null || componentConfig.getCommunicationProviderImplementationJavaClass() != null) {
				connectToBasys();
				try {
					register();
				} catch (ComponentRegistrationException e) {
					throw new ComponentException(e);
				}
			}
			activated = true;
			LOGGER.info("activate - finished");
		} else {
			LOGGER.info("already activated");
		}
	}
	
	@Override
	public void deactivate() throws ComponentException {
		if (activated) {

			if (context.getSharedChannelPool() != null || componentConfig.getCommunicationProviderImplementationJavaClass() != null) {
				try {
					unregister();
				} catch (ComponentRegistrationException e) {
					throw new ComponentException(e);
				}
				disconnectFromBasys();
			}
			if (connectedToExternal) {				
				unobserveExternalConnection();
				disconnectFromExternal();
				connectedToExternal = false;
			}
			activated = false;
		}
	}
	
	private void observeExternalConnection() {
		if (observeExternalConnection) {
			LOGGER.info("observeExternalConnection()");
			externalConnectionHandle = context.getComponentManager().getScheduledExecutorService().scheduleWithFixedDelay(new Runnable() {
				
				@Override
				public void run() {			
					
					if (!isConnectedToExternal()) {
						LOGGER.info("connectToExternal: " + getConfig().getExternalConnectionString());
						try {
							if (canConnectToExternal()) {
								connectToExternal();
								//connectedToExternal = true;
							} else {
								LOGGER.warn("component cannot connectToExternal(), retry ...");
							}
							LOGGER.debug("connectToExternal - finished");
						} catch (ComponentException e) {
							LOGGER.error(e.getMessage());
							LOGGER.warn("component could not connectToExternal(), retry ...");
							e.printStackTrace();
						}
					}
					
				}
				
			}, 5000, 5000, TimeUnit.MILLISECONDS);
		}				
	}
	
	private void unobserveExternalConnection() {
		if (observeExternalConnection) {
			LOGGER.info("unobserveExternalConnection()");
			externalConnectionHandle.cancel(true);
		}
	}

	public boolean isConnectedToExternal() {
		return connectedToExternal;
	}
	
	protected boolean canConnectToExternal() throws ComponentException {
		return true;
	}

	public void connectToExternal() throws ComponentException {
	};

	public void disconnectFromExternal() {
	};

	protected void connectToBasys() {
		LOGGER.debug("connectToBasys");
		ChannelPool pool = context.getSharedChannelPool();

		if (pool == null) {
			LOGGER.info("no shared channel pool, creating an internal pool");
			privateClient = cf.createClient(getId(), cf.createAuthentication(getId(), "secret", null));
			pool = cf.connectChannelPool(privateClient, componentConfig.getCommunicationProviderConnectionString(), componentConfig.getCommunicationProviderImplementationJavaClass());
			context.setSharedChannelPool(pool);
		}

		statusChannel = cf.openChannel(pool, baseStatusChannelName + "#" + getId(), false, null);

		if (componentConfig.getInChannelName() != null && !componentConfig.getInChannelName().equals("")) {
			LOGGER.debug("open inChannel " + componentConfig.getInChannelName());
			inChannel = cf.openChannel(pool, componentConfig.getInChannelName(), false, this);
		} else {
			LOGGER.debug("no input channel specified");
		}
		
		if (componentConfig.getOutChannelName() != null && !componentConfig.getOutChannelName().equals("")) {
			LOGGER.debug("open outChannel " + componentConfig.getOutChannelName());
			outChannel = cf.openChannel(pool, componentConfig.getOutChannelName(), false, null);
		} else {
			LOGGER.debug("no output channel specified");
		}
		LOGGER.debug("connectToBasys finished");
	}

	protected void disconnectFromBasys() {
		LOGGER.debug("disconnectFromBasys");
		if (inChannel != null)
			inChannel.close();
		if (outChannel != null)
			outChannel.close();
		if (statusChannel != null)
			statusChannel.close();

		if (privateClient != null) {
			privateClient.disconnect();
			privateClient = null;
		}
		LOGGER.debug("disconnectFromBasys - finished");
	}

	protected void register() throws ComponentRegistrationException {
		LOGGER.debug("register");
		if (context.getComponentRegistry() != null) {
			registration = context.getComponentRegistry().createRegistration(this);
			registration.register();
			LOGGER.debug("register - finished");
		} else {
			LOGGER.info("no component registry available");
		}
	}

	protected void unregister() throws ComponentRegistrationException {
		LOGGER.debug("unregister");
		if (registration != null) {
			registration.unregister();
			LOGGER.debug("unregister - finished");
		} else {
			LOGGER.debug("not registered");
		}
	}
	
	@Override
	public ComponentInfo getComponentInfo() {
		ComponentInfo componentInfo = new ComponentInfoImpl.Builder()
				.componentId(getId())
				.componentName(getName())
				.componentCategory(getCategory())
				.communicationProvider(getConfig().getCommunicationProviderImplementationJavaClass())
				.connectionString(getConfig().getCommunicationProviderConnectionString())
				.inChannelName(getConfig().getInChannelName())
				.outChannelName(getConfig().getOutChannelName())
				.statusChannelName(Component.baseStatusChannelName + "#" + getId())
				.currentState(getState())
				.currentMode(getMode())
				.isConnected(isConnectedToExternal())
				//.properties(getConfig().getProperties())
				.build();
		return componentInfo;		
	}
	
	/*
	 * ChannelListener interface
	 */

	@Override
	public void handleMessage(Channel channel, String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleNotification(Channel channel, Notification not) {
		// TODO Auto-generated method stub

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
	

	protected ComponentRequestStatus handleCapabilityRequest(CapabilityRequest req) {
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.REJECTED).message("not supported").build();
		return status;
	}

	protected ComponentRequestStatus handleCommandRequest(CommandRequest req) {
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.REJECTED).message("not supported").build();
		return status;
	}

	protected ComponentRequestStatus handleChangeModeRequest(ChangeModeRequest req) {
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.REJECTED).message("not supported").build();
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
