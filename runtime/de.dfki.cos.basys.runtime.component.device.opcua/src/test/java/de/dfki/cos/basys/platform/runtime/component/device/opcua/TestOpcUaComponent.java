package de.dfki.cos.basys.platform.runtime.component.device.opcua;

import static org.junit.Assert.assertEquals;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;

import de.dfki.cos.basys.platform.runtime.component.device.opcua.OpcUaDeviceComponent;
import de.dfki.cos.basys.platform.runtime.component.device.opcua.OpcUaException;
import de.dfki.cos.basys.platform.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;

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
		// to avoid async behavior
		//super.onExecute();
		
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
			assertEquals(5, out);
		} catch (OpcUaException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void onStopping() {
		// to avoid async behavior
		//super.onStopping();
	}


	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

}
