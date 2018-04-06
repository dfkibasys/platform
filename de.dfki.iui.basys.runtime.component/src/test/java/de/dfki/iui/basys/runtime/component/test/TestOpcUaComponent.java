package de.dfki.iui.basys.runtime.component.test;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.device.OpcUaDeviceComponent;
import de.dfki.iui.basys.runtime.component.device.opcua.OpcUaException;

public class TestOpcUaComponent extends OpcUaDeviceComponent {
	
	final NodeId NODE_VARIABLE_IN = new NodeId(1, 50190);
	final NodeId NODE_VARIABLE_OUT = new NodeId(1, 50195);

    final NodeId NODE_OBJECT = new NodeId(1, 50191);
    final NodeId NODE_METHOD = new NodeId(1, 50192);

	private short result = 0;
	
	public TestOpcUaComponent(ComponentConfiguration config) {
		super(config);
	}


	@Override
	public void onResetting() {
		super.onResetting();
		
		try {
			result = 0;
			StatusCode status = writeValue(NODE_VARIABLE_IN, result);
		} catch (OpcUaException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onExecute() {
		super.onExecute();
		
		try {
			result = invokeMethod(NODE_OBJECT, NODE_METHOD, (short) 2, (short) 3);
			StatusCode status = writeValue(NODE_VARIABLE_IN, result);
		} catch (OpcUaException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void onCompleting() { 
		super.onCompleting();
		
		try {
			short out = readValue(NODE_VARIABLE_OUT);
		} catch (OpcUaException e) {
			e.printStackTrace();
		}		
	}

}
