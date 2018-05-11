package de.dfki.iui.basys.runtime.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistration;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistrationException;

public class BaseComponent implements Component, ChannelListener {

	public final Logger LOGGER = LoggerFactory.getLogger(getClass().getName());

	protected ComponentConfiguration componentConfig;
	protected ComponentContext context;

	protected ClientFactory cf = ClientFactory.getInstance();
	protected Client privateClient;
	protected Channel inChannel;
	protected Channel outChannel;
	protected Channel statusChannel;
	// protected Channel telemetryChannel;

	protected ComponentRegistration registration;

	private boolean connectedToExternal = false;
	private boolean activated = false;

	public BaseComponent(ComponentConfiguration config) {
		this.componentConfig = config;
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
		if (!activated) {

			if (context == null)
				throw new ComponentException("Context must not be null!");

			// use copy constructor. if sharedChannelPool is null, it can be set afterwards for reuse in dependent components, e.g. DeviceComponentController
			this.context = new ComponentContext(context);

			if (componentConfig.getExternalConnectionString() != null) {
				try {
					connectToExternal();
					connectedToExternal = true;
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
		ChannelPool pool = context.getSharedChannelPool();

		if (pool == null) {
			privateClient = cf.createClient(getId(), cf.createAuthentication(getId(), "secret", null));
			pool = cf.connectChannelPool(privateClient, componentConfig.getCommunicationProviderConnectionString(), componentConfig.getCommunicationProviderImplementationJavaClass());
			context.setSharedChannelPool(pool);
		}

		statusChannel = cf.openChannel(pool, statusChannelName, false, null);
		// telemetryChannel = cf.openChannel(pool, componentConfig.getComponentId() + "#telemetry" , false, null);

		if (componentConfig.getInChannelName() != null && !componentConfig.getInChannelName().equals(""))
			inChannel = cf.openChannel(pool, componentConfig.getInChannelName(), false, this);
		if (componentConfig.getOutChannelName() != null && !componentConfig.getOutChannelName().equals(""))
			outChannel = cf.openChannel(pool, componentConfig.getOutChannelName(), false, null);
	}

	protected void disconnectFromBasys() {
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
	}

	protected void register() throws ComponentRegistrationException {
		if (context.getComponentRegistry() != null) {
			registration = context.getComponentRegistry().createRegistration(this);
			registration.register();
		}
	}

	protected void unregister() throws ComponentRegistrationException {
		if (registration != null) {
			registration.unregister();
		}
	}

	/*
	 * ChannelListener interface
	 */

	@Override
	public void handleMessage(String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleNotification(Notification not) {
		// TODO Auto-generated method stub

	}

	@Override
	public Response handleRequest(Request req) {
		// TODO Auto-generated method stub
		return null;
	}

}
