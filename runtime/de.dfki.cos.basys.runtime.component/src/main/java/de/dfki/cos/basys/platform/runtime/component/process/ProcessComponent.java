package de.dfki.cos.basys.platform.runtime.component.process;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.packml.PackMLComponent;


public abstract class ProcessComponent extends PackMLComponent {
	
	public ProcessComponent(ComponentConfiguration config) {
		super(config);
		
		//initial state should be IDLE: STOPPED -> RESETTING -> IDLE
		packmlUnit.reset();
	
	}

	@Override
	public void onResetting() {
		// TODO Auto-generated method stub
		super.onResetting();
	}
	
	
}
