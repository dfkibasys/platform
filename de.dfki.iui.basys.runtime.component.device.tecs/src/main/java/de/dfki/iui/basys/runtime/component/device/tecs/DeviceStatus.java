package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;

import de.dfki.iui.hrc.hybritcommand.CommandResponse;

public interface DeviceStatus {

	CommandResponse getCommandState() throws TException;
	
}
