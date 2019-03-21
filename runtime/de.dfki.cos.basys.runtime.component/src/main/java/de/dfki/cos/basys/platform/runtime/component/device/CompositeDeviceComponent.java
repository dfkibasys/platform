package de.dfki.cos.basys.platform.runtime.component.device;

import java.util.UUID;

import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.packml.UnitConfiguration;

public class CompositeDeviceComponent extends DeviceComponent {

	private String correlationId;
	
	public CompositeDeviceComponent(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		UnitConfiguration config = new UnitConfiguration();
		
		String processKey = null;
		
		// TODO: select key
		// TODO: make method abstract again!!!
		
		config.setPayload(processKey);
		return config;		
	}

	@Override
	public void onResetting() {
		// TODO Auto-generated method stub
		super.onResetting();
		this.correlationId = null;
	}
	
	@Override
	public void onStarting() {
		super.onStarting();
		//TODO: create reservations
		//TODO: subscribe to status channel of subcomponents
		
		if (getUnitConfig().getPayload() != null) {
			this.correlationId = UUID.randomUUID().toString();
			//TODO: start process instance by key with businesskey = correlationId
			//TODO: store processinstanceid in order to subscribe to updates 
			// (if businesskey is not sufficient) and delete the instance on error
		}
		
	}
	
	public void onExecute() {
		//TODO: wait until notification arrives on input channel, see DeviceComponentController
	};
	
	@Override
	public void onCompleting() {
		super.onCompleting();
		//TODO: delete reservations
		//TODO: unsubscribe from status channels
	}
	
	@Override
	public void onStopping() {
		super.onStopping();
		//TODO: delete reservations
		//TODO: unsubscribe from status channels
		//TODO: ?delete process instance?
	}
	
	@Override
	public void handleNotification(Channel channel, Notification not) {
		// incoming: status updates of subcomponents
		// incoming: process execution updates
	}
}
