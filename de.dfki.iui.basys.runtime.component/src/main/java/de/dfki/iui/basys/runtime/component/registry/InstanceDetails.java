package de.dfki.iui.basys.runtime.component.registry;

import javax.swing.RowFilter.ComparisonType;

import de.dfki.iui.basys.runtime.component.DeviceComponent;
import de.dfki.iui.basys.runtime.component.ServiceComponent;
import de.dfki.iui.basys.runtime.component.packml.Mode;
import de.dfki.iui.basys.runtime.component.packml.State;

public class InstanceDetails {

	private String id;
	private String inChannel;
	private String outChannel;

	private State currentState;
	private Mode currentMode;

	public InstanceDetails() {
		// TODO Auto-generated constructor stub
	}

	public InstanceDetails(String id, String inChannel, String outChannel) {
		this.id = id;
		this.inChannel = inChannel;
		this.outChannel = outChannel;
	}

	public InstanceDetails(ServiceComponent component, String inChannel, String outChannel) {
		this.id = component.getId();

		if (component instanceof DeviceComponent) {
			//FIXME: Fehlerursache bei ServiceRegistryTest
			this.currentState = ((DeviceComponent) component).getState();
			this.currentMode = ((DeviceComponent) component).getMode();
		}

		this.inChannel = inChannel;
		this.outChannel = outChannel;
	}

	public String getId() {
		return id;
	}

	public State getCurrentState() {
		return currentState;
	}

	public Mode getCurrentMode() {
		return currentMode;
	}

	public String getInChannel() {
		return inChannel;
	}

	public void setInChannel(String inChannel) {
		this.inChannel = inChannel;
	}

	public String getOutChannel() {
		return outChannel;
	}

	public void setOutChannel(String outChannel) {
		this.outChannel = outChannel;
	}
}
