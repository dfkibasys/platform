package de.dfki.iui.basys.runtime.component.device;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.basys.common.emf.JsonUtils;
import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.runtime.component.BaseComponent;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
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
	
	protected PackMLUnit packmlUnit;

	public DeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	public void activate(ComponentContext context) throws ComponentException {	

		NotifyingStatesHandlerFacade handler = new NotifyingStatesHandlerFacade(this);

		packmlUnit = new PackMLUnit(getId());		
		packmlUnit.setActiveStatesHandler(handler);
		packmlUnit.setWaitStatesHandler(handler);
		packmlUnit.initialize();
		
		super.activate(context);
		
		// make unit ready for production
		//no, should be done from outside
//		packmlUnit.reset();
//		
//		while (getState() != State.IDLE) {
//			try {
//				TimeUnit.MILLISECONDS.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		LOGGER.info("activated");
	}

	public void deactivate() throws ComponentException {
		
		// regardless of connection to real device (e.g. in simulation) do:
		// no, should be done from outside
//		packmlUnit.stop();		
//
//		while (getState() != State.STOPPED) {
//			try {
//				TimeUnit.MILLISECONDS.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		super.deactivate();

		packmlUnit.dispose();

		LOGGER.info("deactivated");
	}


	/*
	 * StatusInterface
	 */

	@Override
	public State getState() {
		return packmlUnit.getState();
	}

	@Override
	public Mode getMode() {
		return packmlUnit.getMode();
	}

	@Override
	public UnitConfiguration getUnitConfig() {
		return packmlUnit.getUnitConfig();
	}
	
	@Override
	public Response handleRequest(Request req) {
		try {
			EObject ob = JsonUtils.fromJsonString(req.getPayload(), EObject.class);
			if (ob instanceof Capability) {
				boolean status = handleCapabilityRequest((Capability)ob);
			} else {
				
			}
			return cf.createResponse(req.getId(), "io");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return cf.createResponse(req.getId(), "nio");
		}
	}

	public boolean handleCapabilityRequest(Capability ob) {
		// "translate"
		// set config
		// start();		
		// es sollte eine Art Status zurückgegeben werden, der ausdrückt, ob und wann der Request angenommen/in Auftrag gegeben wurde.
		return true;
	}

	/*
	 * CommandInterface
	 */

	@Override
	public void setMode(Mode mode) throws PackMLException {
		if (getMode() == mode) return;
		
		packmlUnit.setMode(mode);
		
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
		packmlUnit.setUnitConfig(config);
	}

	@Override
	public void reset() {
		packmlUnit.reset();
	}

	@Override
	public void start() {
		packmlUnit.start();
	}

	@Override
	public void stop() {
		packmlUnit.stop();
	}

	@Override
	public void hold() {
		packmlUnit.hold();
	}

	@Override
	public void unhold() {
		packmlUnit.unhold();
	}

	@Override
	public void suspend() {
		packmlUnit.suspend();
	}

	@Override
	public void unsuspend() {
		packmlUnit.unsuspend();
	}

	@Override
	public void abort() {
		packmlUnit.abort();
	}

	@Override
	public void clear() {
		packmlUnit.clear();
	}

	protected void notifyAndUpdateRegistration() {
		// TODO: something like:Notification not = createStatusUpdate();
		String state = getState().toString();
		
		LOGGER.info(String.format("device with id %s is now in state %s", getId(), state));
		
		if (outChannel != null && outChannel.isOpen()) {
			Notification not = cf.createNotification(state);
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
	
	/*
	 * default WaitStatesHandler implementation -> notify Basys Middleware
	 */
	
	@Override
	public void onStopped() {
	
	}

	@Override
	public void onIdle() {
	
	}

	@Override
	public void onComplete() {
	
	}

	@Override
	public void onHeld() {
	
	}

	@Override
	public void onSuspended() {
	
	}

	@Override
	public void onAborted() {
	
	}
	
	

}
