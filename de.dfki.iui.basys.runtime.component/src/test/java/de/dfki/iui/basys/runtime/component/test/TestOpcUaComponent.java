package de.dfki.iui.basys.runtime.component.test;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import de.dfki.iui.basys.runtime.component.OpcUaComponent;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;

public class TestOpcUaComponent extends OpcUaComponent {

	final NodeId NODE_VARIABLE_IN = new NodeId(1, 50190);
	final NodeId NODE_VARIABLE_OUT = new NodeId(1, 50195);

	private short result = 0;
	
	public TestOpcUaComponent(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public TestOpcUaComponent(String id, ServiceRegistry registry) {
		super(id, registry);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onResetting() {
		super.onResetting();
		
		// write in var = 0
	}

	@Override
	public void onExecute() {
		super.onExecute();

		// call method
		//result = 0;

	}

	@Override
	public void onCompleting() { 
		super.onCompleting();

		// write result to in var		
		//short out = readValue(NODE_VARIABLE_OUT);
	}

}
