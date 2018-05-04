package de.dfki.iui.basys.runtime.component.device;

import java.io.IOException;

import de.dfki.iui.basys.common.emf.JsonUtils;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.ControlCommand;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.impl.ChangeModeRequestImpl;
import de.dfki.iui.basys.model.runtime.component.impl.CommandRequestImpl;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.device.packml.CommandInterface;
import de.dfki.iui.basys.runtime.component.device.packml.PackMLException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

public class DeviceComponentController implements CommandInterface {

	private String componentId;

	protected ClientFactory cf = ClientFactory.getInstance();
	private Channel componentInChannel;
	private Channel componentOutChannel;

	public DeviceComponentController(String componentId) {
		this.componentId = componentId;
	}

	public void connect(ComponentContext context) {

	}

	public void disconnect() {

	}


	private ComponentRequestStatus sendCommandRequest(ControlCommand command) {
		ComponentRequest cr = new CommandRequestImpl.Builder().componentId(componentId).controlCommand(command).build();
		return sendComponentRequest(cr);
	}

	private ComponentRequestStatus sendChangeModeRequest(ControlMode mode) {
		ComponentRequest cr = new ChangeModeRequestImpl.Builder().componentId(componentId).mode(mode).build();
		return sendComponentRequest(cr);
	}
	
	private ComponentRequestStatus sendComponentRequest(ComponentRequest request) {
		ComponentRequestStatus status = null;
		try {
			String payload = JsonUtils.toJsonString(request);
			Request message = cf.createRequest(payload);
			Response response = componentInChannel.sendRequest(message);
			String result = response.getPayload();
			status = JsonUtils.fromJsonString(result, ComponentRequestStatus.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}



	@Override
	public void setMode(ControlMode mode) throws PackMLException {
		ComponentRequestStatus status = sendChangeModeRequest(mode);
	}

	@Override
	public void setUnitConfig(UnitConfiguration config) throws PackMLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void reset() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.RESET);
	}

	@Override
	public void start() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.START);
	}

	@Override
	public void stop() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.STOP);
	}

	@Override
	public void hold() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.HOLD);
	}

	@Override
	public void unhold() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.UNHOLD);
	}

	@Override
	public void suspend() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.SUSPEND);
	}

	@Override
	public void unsuspend() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.UNSUSPEND);
	}

	@Override
	public void abort() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.ABORT);
	}

	@Override
	public void clear() {
		ComponentRequestStatus status = sendCommandRequest(ControlCommand.CLEAR);
	}

}
