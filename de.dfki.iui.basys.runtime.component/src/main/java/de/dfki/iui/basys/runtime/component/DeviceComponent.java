package de.dfki.iui.basys.runtime.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.runtime.component.packml.ActiveStatesHandler;
import de.dfki.iui.basys.runtime.component.packml.CommandInterface;
import de.dfki.iui.basys.runtime.component.packml.Mode;
import de.dfki.iui.basys.runtime.component.packml.PackMLUnit;
import de.dfki.iui.basys.runtime.component.packml.State;
import de.dfki.iui.basys.runtime.component.packml.StatusInterface;
import de.dfki.iui.basys.runtime.component.packml.UnitConfiguration;
import de.dfki.iui.basys.runtime.component.packml.WaitStatesHandler;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.communication.Notification;

public abstract class DeviceComponent extends ServiceComponent implements StatusInterface, CommandInterface, ActiveStatesHandler, WaitStatesHandler {

	protected final Logger LOGGER = LoggerFactory.getLogger(DeviceComponent.class);

	protected PackMLUnit unit;

	protected String deviceConnectionString;
	protected boolean connectedToDevice = false;

	public DeviceComponent(String id) {
		super(id);
	}
	
	public DeviceComponent(String id, ServiceRegistry registry) {
		super(id, registry);
		// TODO Auto-generated constructor stub
	}

	public void activate() {
		unit = new PackMLUnit(id);
		unit.setActiveStatesHandler(this);
		unit.setWaitStatesHandler(this);
		unit.initialize();

		connectToDevice();
		// if device connection is established, ideally perform unit.stop() and unit.reset():
		// STOPPED -> RESETTING -> IDLE = ready for production
		if (connectedToDevice) {
			unit.stop();
			unit.reset();
		}

		super.activate();
	}

	public void deactivate() {
		super.deactivate();
		
		if (connectedToDevice) {
			unit.stop();
		}
		disconnectFromDevice();
		
		unit.dispose();
	}

	public boolean isConnectedToDevice() {
		return connectedToDevice;
	}
	
	public void connectToDevice() {
		// Try to connect to actual device or enter some kind of simulation mode	
	}

	public void disconnectFromDevice() {
		
	}
	
	/*
	 * StatusInterface
	 */
		
	@Override	
	public State getState() {
		return unit.getState();
	}
	
	@Override
	public Mode getMode() {
		return unit.getMode();
	}
	
	@Override
	public UnitConfiguration getConfig() {
		return unit.getConfig();
	}
	

	/*
	 * CommandInterface
	 */	

	@Override
	public void setMode(Mode mode) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void setConfig(UnitConfiguration config) {
		// TODO Auto-generated method stub		
	}
	
	@Override
	public void reset() {
		unit.reset();		
	}

	@Override
	public void start() {
		unit.start();		
	}

	@Override
	public void stop() {
		unit.stop();		
	}

	@Override
	public void hold() {
		unit.hold();		
	}

	@Override
	public void unhold() {
		unit.unhold();		
	}

	@Override
	public void suspend() {
		unit.suspend();		
	}

	@Override
	public void unsuspend() {
		unit.unsuspend();
	}

	@Override
	public void abort() {
		unit.abort();
	}

	@Override
	public void clear() {
		unit.clear();
	}
	
	/*
	 * default WaitStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onStopped() {
		// TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("stopped");
		channel.sendNotification(not);
	}

	@Override
	public void onIdle() {
		// TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("idle");
		channel.sendNotification(not);
	}

	@Override
	public void onComplete() {
		// TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("complete");
		channel.sendNotification(not);
	}

	@Override
	public void onHeld() {
		// TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("held");
		channel.sendNotification(not);
	}

	@Override
	public void onSuspended() {
		// TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("suspended");
		channel.sendNotification(not);
	}

	@Override
	public void onAborted() {
		// TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("aborted");
		channel.sendNotification(not);
	}

	public class Status {

		
	}


}
