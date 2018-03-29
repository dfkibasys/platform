package de.dfki.iui.basys.runtime.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.runtime.component.packml.ActiveStatesHandler;
import de.dfki.iui.basys.runtime.component.packml.CommandInterface;
import de.dfki.iui.basys.runtime.component.packml.Mode;
import de.dfki.iui.basys.runtime.component.packml.PackMLException;
import de.dfki.iui.basys.runtime.component.packml.PackMLUnit;
import de.dfki.iui.basys.runtime.component.packml.State;
import de.dfki.iui.basys.runtime.component.packml.StatusInterface;
import de.dfki.iui.basys.runtime.component.packml.UnitConfiguration;
import de.dfki.iui.basys.runtime.component.packml.WaitStatesHandler;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistrationException;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.communication.Notification;

public abstract class DeviceComponent extends ServiceComponent
		implements StatusInterface, CommandInterface, ActiveStatesHandler, WaitStatesHandler {

	protected PackMLUnit unit;

	protected boolean connectedToDevice = false;

	public DeviceComponent(String id) {
		super(id);
	}

	public DeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	public void activate(ComponentContext context) {		
		//PackML FSA has to be created and initialized before component registration via super.activate() 
		//TODO: expand PackML to represent also active and inactivate states from a service perspective in order to generate a complete event trace in the middleware
		unit = new PackMLUnit(id);
		unit.setActiveStatesHandler(this);
		unit.setWaitStatesHandler(this);
		unit.initialize();

		
		super.activate(context);

		if (componentConfig.getDeviceConnectionString() != null) {			
			try {
				connectToDevice();
				connectedToDevice = true;	
			} catch (ServiceComponentException e) {
				LOGGER.error(e.getMessage());
				e.printStackTrace();
			}		
		} else {
			LOGGER.warn("no device connection string provided, enter simulation mode");
			// enter some kind of simulation mode like so: 
			//unit.setActiveStatesHandler(simulationActHandler);
			//unit.setWaitStatesHandler(simulationWaitHandler);
		}
		
		// make unit ready for production
		unit.stop();
		unit.reset();
	}

	public void deactivate() {
		
		// regardless of connection to real device (e.g. in simulation) do:
		unit.stop();		

		super.deactivate();
		
		if (connectedToDevice) {			
			disconnectFromDevice();
			connectedToDevice = false;
		}

		unit.dispose();
	}

	public boolean isConnectedToDevice() {
		return connectedToDevice;
	}

	public abstract void connectToDevice() throws ServiceComponentException;

	public abstract void disconnectFromDevice();// throws ServiceComponentException;
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
	public void setMode(Mode mode) throws PackMLException {
		if (getMode() == mode) return;
		
		unit.setMode(mode);
		
		if (outChannel != null && outChannel.isOpen()) {
			Notification not = cf.createNotification("mode_changed");
			outChannel.sendNotification(not);
		}
		if (registration != null)
		{
			try {
				registration.update();
			} catch (ServiceRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void setConfig(UnitConfiguration config) throws PackMLException {
		unit.setConfig(config);
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
		if (outChannel != null && outChannel.isOpen()) {
			Notification not = cf.createNotification("stopped");
			outChannel.sendNotification(not);
		}
		if (registration != null)
		{
			try {
				registration.update();
			} catch (ServiceRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onIdle() {
		// TODO: something like:Notification not = createStatusUpdate();
		if (outChannel != null && outChannel.isOpen()) {
			Notification not = cf.createNotification("idle");
			outChannel.sendNotification(not);
		}
		if (registration != null)
		{
			try {
				registration.update();
			} catch (ServiceRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onComplete() {
		// TODO: something like:Notification not = createStatusUpdate();
		if (outChannel != null && outChannel.isOpen()) {
			Notification not = cf.createNotification("complete");
			outChannel.sendNotification(not);
		}
		if (registration != null)
		{
			try {
				registration.update();
			} catch (ServiceRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onHeld() {
		// TODO: something like:Notification not = createStatusUpdate();
		if (outChannel != null && outChannel.isOpen()) {
			Notification not = cf.createNotification("held");
			outChannel.sendNotification(not);
		}
		if (registration != null)
		{
			try {
				registration.update();
			} catch (ServiceRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onSuspended() {
		// TODO: something like:Notification not = createStatusUpdate();
		if (outChannel != null && outChannel.isOpen()) {
			Notification not = cf.createNotification("suspended");
			outChannel.sendNotification(not);
		}
		if (registration != null)
		{
			try {
				registration.update();
			} catch (ServiceRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onAborted() {
		// TODO: something like:Notification not = createStatusUpdate();
		if (outChannel != null && outChannel.isOpen()) {
			Notification not = cf.createNotification("aborted");
			outChannel.sendNotification(not);
		}
		if (registration != null)
		{
			try {
				registration.update();
			} catch (ServiceRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public class Status {

	}

}
