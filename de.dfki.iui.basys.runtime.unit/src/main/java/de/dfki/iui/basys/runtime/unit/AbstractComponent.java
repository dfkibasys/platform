package de.dfki.iui.basys.runtime.unit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.communication.ClientFactory;
import de.dfki.iui.basys.communication.provider.MqttCommunicationProvider;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.communication.CommunicationProvider;
import de.dfki.iui.basys.runtime.unit.packml.ActiveStatesHandler;
import de.dfki.iui.basys.runtime.unit.packml.PackMLUnit;
import de.dfki.iui.basys.runtime.unit.packml.WaitStatesHandler;

public abstract class AbstractComponent implements ActiveStatesHandler, WaitStatesHandler {
	
	protected final Logger LOGGER = LoggerFactory.getLogger(AbstractComponent.class.getName());
	
	protected String id;
	
	protected PackMLUnit unit;	
	
	protected ClientFactory cf = ClientFactory.getInstance();
	protected Client client;
	protected String connectionString;
	protected CommunicationProvider provider;
	
	public AbstractComponent(String id) {
		this.id = id;
		
	}

	public void activate() {
		unit = new PackMLUnit(id);
		unit.setActiveStatesHandler(this);
		unit.setWaitStatesHandler(this);
		unit.initialize();
		
		connectToDevice();
		connectToBasys();
	}
	
	public void deactivate() {
		disconnectFromDevice();
		disconnectFromBasys();
		
		unit.dispose();
	}
		
	public void connectToDevice() {
		//Try to connect to actual device or enter some kind of simulation mode
		
		//if device connection is established, ideally perform unit.stop() and unit.reset(): 
		//STOPPED -> RESETTING -> IDLE = ready for production
	}
	
	public void disconnectFromDevice() {
		// perform unit.stop()?
	}
	
	public void connectToBasys() {
		if (client == null) {		
			client = cf.createClient(id, cf.createAuthentication(id, "secret", null));
			//TODO: either discover automatically or set externally
			//TODO: configure channelPool (MQTT usage and connectionString) externally
			connectionString = "tcp://iot.eclipse.org:1883";		
			provider = new MqttCommunicationProvider();
			cf.connectChannelPool(client, connectionString, provider);
			
			//TODO: register service at service registry
		}
	}
	
	public void disconnectFromBasys() {
		if (client != null) {
			//TODO: unregister service at service registry
			client.disconnect();
			client = null;
		}
	}

	//TODO: Code for communicating with the Basys Middleware: process incoming requests, notify task completion and errors back
	

	/*
	 * default WaitStatesHandler implementation -> notify Basys Middleware
	 */
	
	@Override
	public void onStopped() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onIdle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onHold() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSuspend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAborted() {
		// TODO Auto-generated method stub
		
	}

}
