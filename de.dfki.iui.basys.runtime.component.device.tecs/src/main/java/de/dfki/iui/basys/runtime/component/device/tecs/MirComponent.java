package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.hrc.generalrobots.Path;
import de.dfki.iui.hrc.mir100.MIR.Client;

public class MirComponent extends TecsDeviceComponent {

	
	
	public MirComponent(ComponentConfiguration config) {
		super(config);
	}


	protected Client client;
	
	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		try {
			Path p = client.getPath();
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//client = new MIRClient(protocol);
		//client.open();
		
	}
	
	@Override
	public void disconnectFromExternal() {
		//client.close();		
		super.disconnectFromExternal();
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
