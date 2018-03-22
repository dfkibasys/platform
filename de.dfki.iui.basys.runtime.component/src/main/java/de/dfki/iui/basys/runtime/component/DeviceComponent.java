package de.dfki.iui.basys.runtime.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.runtime.component.packml.ActiveStatesHandler;
import de.dfki.iui.basys.runtime.component.packml.Mode;
import de.dfki.iui.basys.runtime.component.packml.PackMLUnit;
import de.dfki.iui.basys.runtime.component.packml.State;
import de.dfki.iui.basys.runtime.component.packml.WaitStatesHandler;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.communication.Notification;

public abstract class DeviceComponent extends ServiceComponent implements ActiveStatesHandler, WaitStatesHandler {

	protected final Logger LOGGER = LoggerFactory.getLogger(DeviceComponent.class);

	protected PackMLUnit unit;

	protected ClientFactory cf = ClientFactory.getInstance();
	protected Client client;
	protected String connectionString;
	protected Channel channel;

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

		super.activate();
	}

	public void deactivate() {
		super.deactivate();

		disconnectFromDevice();

		unit.dispose();
	}

	public State getState() {
		return unit.getState();
	}
	
	public Mode getMode() {
		return unit.getMode();
	}

	public boolean isConnectedToDevice() {
		return connectedToDevice;
	}
	
	public void connectToDevice() {
		// Try to connect to actual device or enter some kind of simulation mode

		// if device connection is established, ideally perform unit.stop() and
		// unit.reset():
		// STOPPED -> RESETTING -> IDLE = ready for production
	}

	public void disconnectFromDevice() {
		// perform unit.stop()?
	}

	/*
	 * default WaitStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onStopped() {
		// TODO: something like:Notification not = createStatusUpdate();
		Status status = new Status();
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
