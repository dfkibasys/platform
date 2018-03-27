package de.dfki.iui.basys.runtime.component;

import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;

public class TecsComponent extends DeviceComponent {

	public TecsComponent(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public TecsComponent(String id, ServiceRegistry registry) {
		super(id, registry);
		// TODO Auto-generated constructor stub
	}
	
	// TODO: Code for communicating with the actual device, here via TECS. 
	// Could also be done in some kind of "IntegrationProvider" implementation.
	
	// protected TSocket socket;
	// TBinaryProtocol protocol;
	// protected String host;
	// protected int port;

	@Override
	public void connectToDevice() {
		// TODO Auto-generated method stub
		super.connectToDevice();
		
		//socket = new TSocket(host,port);
		//protocol = new TBinaryProtocol(socket);
	}
	
	@Override
	public void disconnectFromDevice() {
		// TODO Auto-generated method stub
		super.disconnectFromDevice();
		
		// socket.close();		
	}
	

	/*
	 * default ActiveStatesHandler implementation -> trigger logic on device
	 */
	
	@Override
	public void onResetting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStarting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onExecute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onCompleting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onHolding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUnholding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSuspending() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUnsuspending() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAborting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClearing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStopping() {
		// TODO Auto-generated method stub

	}
	


}
