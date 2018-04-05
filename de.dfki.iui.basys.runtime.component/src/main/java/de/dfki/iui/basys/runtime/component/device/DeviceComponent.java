package de.dfki.iui.basys.runtime.component.device;

import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.runtime.component.BaseComponent;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.device.packml.ActiveStatesHandler;
import de.dfki.iui.basys.runtime.component.device.packml.CommandInterface;
import de.dfki.iui.basys.runtime.component.device.packml.Mode;
import de.dfki.iui.basys.runtime.component.device.packml.PackMLException;
import de.dfki.iui.basys.runtime.component.device.packml.PackMLUnit;
import de.dfki.iui.basys.runtime.component.device.packml.State;
import de.dfki.iui.basys.runtime.component.device.packml.StatusInterface;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.basys.runtime.component.device.packml.WaitStatesHandler;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistrationException;


public abstract class DeviceComponent extends BaseComponent
		implements StatusInterface, CommandInterface, ActiveStatesHandler, WaitStatesHandler {
	
	protected PackMLUnit unit;

	protected boolean connectedToDevice = false;
	

	public DeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	public void activate(ComponentContext context) {		
		//PackML FSA has to be created and initialized before component registration via super.activate() 
		//TODO: expand PackML to represent also active and inactivate states from a service perspective in order to generate a complete event trace in the middleware
		unit = new PackMLUnit(getId());
		unit.setActiveStatesHandler(this);
		unit.setWaitStatesHandler(this);
		unit.initialize();
		
		super.activate(context);
		
		// make unit ready for production
		unit.stop();
		unit.reset();
	}

	public void deactivate() {
		
		// regardless of connection to real device (e.g. in simulation) do:
		unit.stop();		

		super.deactivate();

		unit.dispose();
	}

	public boolean isConnectedToDevice() {
		return connectedToDevice;
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
	public UnitConfiguration getUnitConfig() {
		return unit.getUnitConfig();
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
			} catch (ComponentRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void setUnitConfig(UnitConfiguration config) throws PackMLException {
		unit.setUnitConfig(config);
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
			} catch (ComponentRegistrationException e) {
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
			} catch (ComponentRegistrationException e) {
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
			} catch (ComponentRegistrationException e) {
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
			} catch (ComponentRegistrationException e) {
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
			} catch (ComponentRegistrationException e) {
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
			} catch (ComponentRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public class Status {

	}

}
