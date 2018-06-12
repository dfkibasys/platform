package de.dfki.iui.basys.runtime.component.device.tecs;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.QAVisualisationCapability;
import de.dfki.iui.basys.model.domain.resourceinstance.GeneralCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.tecs.Event;

public class HueLightsComponent extends TecsDeviceComponent {

	private HueLightsNotifier client;
	private final String lid;
	private final long duration = 5000;
	
	public HueLightsComponent(ComponentConfiguration config) {
		super(config);
		this.lid = "2";
	}

	@Override
	protected void handleTecsEvent(Event event) {/* do nothing */}

	
	String capability = "{\n" + 
			"    \"eClass\" : \"http://www.dfki.de/iui/basys/model/component#//CapabilityRequest\",\n" + 
			"    \"capabilityVariant\" : {\n" + 
			"      \"eClass\" : \"http://www.dfki.de/iui/basys/model/resourceinstance#//GeneralCapabilityVariant\",\n" + 
			"      \"id\" : \"_oONl82sWEeiPYI9_h6Hhzw\",\n" + 
			"      \"name\" : \"Signal IO\",\n" + 
			"      \"capability\" : {\n" + 
			"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/capability#//QAVisualisationCapability\",\n" + 
			"        \"id\" : \"_pyvT22sWEeiPYI9_h6Hhzw\",\n" + 
			"        \"qaResult\" : true\n" + 
			"      }\n" + 
			"    }\n" + 
			"  }";
	
	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		
		UnitConfiguration config = new UnitConfiguration();

		if (req.getCapabilityVariant().eClass()
				.equals(ResourceinstancePackage.eINSTANCE.getGeneralCapabilityVariant())) {
			GeneralCapabilityVariant variant = (GeneralCapabilityVariant) req.getCapabilityVariant();
			if (variant.getCapability().eClass().equals(CapabilityPackage.eINSTANCE.getQAVisualisationCapability())) {
				QAVisualisationCapability capability = (QAVisualisationCapability) variant.getCapability();
				if (capability.isQaResult()) {
					config.setRecipe(1);
				} else {
					config.setRecipe(0);
				}
			}
		}
		
		return config;

	}

	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new HueLightsNotifier(protocol, lid);
	}
	
	@Override
	public void onResetting() {
		reconnect();
	}

	@Override
	public void onStarting() {		
		int state = getUnitConfig().getRecipe();
		client.enableForTime(state > 0, duration);
	}

	@Override
	public void onExecute() {
		while(client.isOn()) {
			/* wait until off */
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onCompleting() {
		sendComponentResponse(ResponseStatus.OK, 0);
	}

	@Override
	public void onStopping() {
		sendComponentResponse(ResponseStatus.NOT_OK, 0);
	}

//	@Override
//	public void onAborting() {}
//
//	@Override
//	public void onClearing() {
//		// perform reconecct
//		close();
//		try {
//			open();
//		} catch (TTransportException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void onHolding() {}
//
//	@Override
//	public void onUnholding() {}
//
//	@Override
//	public void onSuspending() {}
//
//	@Override
//	public void onUnsuspending() {}

}
