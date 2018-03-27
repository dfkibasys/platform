package de.dfki.iui.basys.runtime.component;

import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;

public class MirComponent extends TecsComponent {

	public MirComponent(String id) {
		super(id);
	}
	
	public MirComponent(ComponentConfiguration config) {
		super(config);
	}


	//protected MIRClient client;
	
	@Override
	public void connectToDevice() {
		// TODO Auto-generated method stub
		super.connectToDevice();
		//client = new MIRClient(protocol);
		//client.open();
		
	}
	
	@Override
	public void disconnectFromDevice() {
		// TODO Auto-generated method stub
		super.disconnectFromDevice();
		//client.close();		
	}

	@Override
	public void onResetting() {
		super.onResetting();
		// clear missions via TECS, etc.
	}

	@Override
	public void onExecute() {
		super.onExecute();
		// execute specific command
		// z.B. Goto
		//position from prior setConfig();
		//client.gotoNamedPosition(position);
		//	... wait ...
		//
	}

	@Override
	public void onCompleting() { 
		super.onCompleting();
			
	}
	
	@Override
	public void onStopping() {
		// TODO Auto-generated method stub
		super.onStopping();
		// execute specific command
		// z.B. Stop
	}
	
}
