package de.dfki.iui.basys.runtime.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.Mode;
import de.dfki.iui.basys.runtime.component.device.packml.State;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistration;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistrationException;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;

public class BaseComponent implements Component {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	protected ComponentConfiguration componentConfig;
	protected ComponentContext context;

	protected ClientFactory cf = ClientFactory.getInstance();
	protected Client privateClient;
	protected Channel inChannel;
	protected Channel outChannel;
	
	protected ComponentRegistration registration;

	private boolean connectedToExternal = false;

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
	public Mode getMode() {
		return Mode.PRODUCTION;
	}
	
	@Override
	public void activate(ComponentContext context) {
		this.context = context;
		
		if (componentConfig.getExternalConnectionString() != null) {			
			try {
				connectToExternal();
				connectedToExternal = true;	
			} catch (ComponentException e) {
				LOGGER.error(e.getMessage());
				e.printStackTrace();
			}		
		} 
//		else {
//			LOGGER.warn("no device connection string provided, enter simulation mode");
//			// enter some kind of simulation mode like so: 
//			//unit.setActiveStatesHandler(simulationActHandler);
//			//unit.setWaitStatesHandler(simulationWaitHandler);
//		}
				
		if (context.getSharedChannelPool() != null || componentConfig.getCommunicationProviderImplementationJavaClass() != null) {
			connectToBasys();
			register();
		}
	}

	@Override
	public void deactivate() {
		if (context.getSharedChannelPool() != null || componentConfig.getCommunicationProviderImplementationJavaClass() !=null) {
			unregister();
			disconnectFromBasys();
		}
		if (connectedToExternal) {			
			disconnectFromExternal();
			connectedToExternal = false;
		}
	}

	public boolean isConnectedToExternal() {
		return connectedToExternal;
	}

	public void connectToExternal() throws ComponentException {};

	public void disconnectFromExternal() {};
	
	protected void connectToBasys() {
		ChannelPool pool = context.getSharedChannelPool();

		if (pool == null) {
			privateClient = cf.createClient(getId(), cf.createAuthentication(getId(), "secret", null));
			pool = cf.connectChannelPool(privateClient, componentConfig.getCommunicationProviderConnectionString(), componentConfig.getCommunicationProviderImplementationJavaClass());
		}

		if (componentConfig.getInChannelName() != null)
			inChannel = cf.openChannel(pool, componentConfig.getInChannelName(), false, new ComponentChannelListener(this));
		if (componentConfig.getOutChannelName() != null)
			outChannel = cf.openChannel(pool, componentConfig.getOutChannelName(), false, null);
	}

	protected void disconnectFromBasys() {
		if (inChannel != null)
			inChannel.close();
		if (outChannel != null)
			outChannel.close();

		if (privateClient != null) {
			privateClient.disconnect();
			privateClient = null;
		}
	}

	protected void register() {
		if (context.getComponentRegistry() != null) {
			try {
				registration = context.getComponentRegistry().createRegistration(this);
				registration.register();
			} catch (ComponentRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected void unregister() {
		if (registration != null) {
			try {
				registration.unregister();
			} catch (ComponentRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
