package de.dfki.iui.basys.runtime.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentInfo;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentInfoImpl;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistration;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistrationException;
import de.dfki.iui.basys.runtime.component.util.BasysResourceSetImpl;

public class BaseComponent implements Component, ChannelListener {

	public final Logger LOGGER;

	protected ComponentConfiguration componentConfig;
	protected ComponentContext context;

	protected boolean simulated = false;
	
	protected CommFactory cf = CommFactory.getInstance();
	protected Client privateClient;
	protected Channel inChannel;
	protected Channel outChannel;
	protected Channel statusChannel;
	// protected Channel telemetryChannel;

	protected ComponentRegistration registration;

	private boolean connectedToExternal = false;
	private boolean activated = false;

	public BaseComponent(ComponentConfiguration config) {
		JsonUtils.factory = new BasysResourceSetImpl.Factory();
		this.componentConfig = config;
		LOGGER = LoggerFactory.getLogger("basys.component." + componentConfig.getComponentName().replaceAll(" ", "-"));
		if (config.getProperty("simulated") != null) {
			simulated = Boolean.parseBoolean(config.getProperty("simulated").getValue());
			LOGGER.info("component is in SIMULATION mode");
		}
		
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
		if (simulated)
			return ControlMode.SIMULATION;
		return ControlMode.PRODUCTION;
	}

	@Override
	public boolean isActivated() {
		return activated;
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		LOGGER.debug("activate");
		if (!activated) {

			if (context == null) {
				LOGGER.error("Context must not be null!");
				throw new ComponentException("Context must not be null!");
			}
			// use copy constructor. if sharedChannelPool is null, it can be set afterwards for reuse in dependent components, e.g. DeviceComponentController
			this.context = new ComponentContext(context);

			if (componentConfig.getExternalConnectionString() != null && !componentConfig.getExternalConnectionString().equals("")) {
				
				LOGGER.debug("connectToExternal: " + getConfig().getExternalConnectionString());
				try {
					if (simulated) {
						LOGGER.info("component is simulated, skipping connectToExternal()");
					} else {
						connectToExternal();
						connectedToExternal = true;
					}
					LOGGER.debug("connectToExternal - finished");
				} catch (ComponentException e) {
					LOGGER.error(e.getMessage());
					e.printStackTrace();
				}
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
			LOGGER.debug("activate - finished");
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
				disconnectFromExternal();
				connectedToExternal = false;
			}
			activated = false;
		}
	}

	public boolean isConnectedToExternal() {
		return connectedToExternal;
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
	public Response handleRequest(Channel channel, Request req) {
		// TODO Auto-generated method stub
		return null;
	}

}
