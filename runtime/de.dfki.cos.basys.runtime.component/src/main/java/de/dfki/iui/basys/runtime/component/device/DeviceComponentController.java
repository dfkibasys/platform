package de.dfki.iui.basys.runtime.component.device;

import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.ControlCommand;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.impl.CapabilityRequestImpl;
import de.dfki.iui.basys.model.runtime.component.impl.ChangeModeRequestImpl;
import de.dfki.iui.basys.model.runtime.component.impl.CommandRequestImpl;
import de.dfki.iui.basys.runtime.component.ComponentController;
import de.dfki.iui.basys.runtime.component.device.packml.CommandInterface;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

public class DeviceComponentController extends ComponentController implements CommandInterface {

	public DeviceComponentController(String componentId) {
		super(componentId,null);		
	}

	public DeviceComponentController(String componentId, ChannelListener listener) {
		super(componentId, listener);
	}
	
	private ComponentRequestStatus sendCommandRequest(ControlCommand command) {
		ComponentRequest cr = new CommandRequestImpl.Builder().componentId(componentId).controlCommand(command).build();
		return sendComponentRequest(cr);
	}

	private ComponentRequestStatus sendChangeModeRequest(ControlMode mode) {
		ComponentRequest cr = new ChangeModeRequestImpl.Builder().componentId(componentId).mode(mode).build();
		return sendComponentRequest(cr);
	}

	private ComponentRequestStatus sendCapabilityRequest(CapabilityVariant capability) {
		CapabilityRequest cr = new CapabilityRequestImpl.Builder().componentId(componentId).capabilityVariant(capability)
				.build();
		return sendComponentRequest(cr);
	}

	public ComponentRequestStatus executeCapability(CapabilityVariant<?,?> capability) {
		ComponentRequestStatus status = sendCapabilityRequest(capability);
		return status;
	}
	
	
	/*
	 * Command Interface
	 */
	
	@Override
	public ComponentRequestStatus setMode(ControlMode mode) {
		ComponentRequestStatus status = sendChangeModeRequest(mode);
		return status;
	}

	@Override
	public ComponentRequestStatus setUnitConfig(UnitConfiguration config) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComponentRequestStatus reset() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.RESET);
		return status;
	}

	@Override
	public ComponentRequestStatus start() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.START);
		return status;
	}

	@Override
	public ComponentRequestStatus stop() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.STOP);
		return status;
	}

	@Override
	public ComponentRequestStatus hold() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.HOLD);
		return status;
	}

	@Override
	public ComponentRequestStatus unhold() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.UNHOLD);
		return status;
	}

	@Override
	public ComponentRequestStatus suspend() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.SUSPEND);
		return status;
	}

	@Override
	public ComponentRequestStatus unsuspend() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.UNSUSPEND);
		return status;
	}

	@Override
	public ComponentRequestStatus abort() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.ABORT);
		return status;
	}

	@Override
	public ComponentRequestStatus clear() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.CLEAR);
		return status;
	}

	
}
