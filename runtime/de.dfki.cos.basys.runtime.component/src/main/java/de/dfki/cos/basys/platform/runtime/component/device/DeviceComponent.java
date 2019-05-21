package de.dfki.cos.basys.platform.runtime.component.device;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ChannelException;
import de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ChangeModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.CommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse;
import de.dfki.cos.basys.platform.model.runtime.component.ControlCommand;
import de.dfki.cos.basys.platform.model.runtime.component.ControlMode;
import de.dfki.cos.basys.platform.model.runtime.component.RequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.State;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl;
import de.dfki.cos.basys.platform.model.runtime.component.impl.SimulationConfigurationImpl;
import de.dfki.cos.basys.platform.runtime.component.BaseComponent;
import de.dfki.cos.basys.platform.runtime.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.packml.ActiveStatesHandler;
import de.dfki.cos.basys.platform.runtime.component.packml.CommandInterface;
import de.dfki.cos.basys.platform.runtime.component.packml.PackMLComponent;
import de.dfki.cos.basys.platform.runtime.component.packml.PackMLStatesHandlerFacade;
import de.dfki.cos.basys.platform.runtime.component.packml.PackMLUnit;
import de.dfki.cos.basys.platform.runtime.component.packml.SimulatedStatesHandler;
import de.dfki.cos.basys.platform.runtime.component.packml.StatusInterface;
import de.dfki.cos.basys.platform.runtime.component.packml.UnitConfiguration;
import de.dfki.cos.basys.platform.runtime.component.packml.WaitStatesHandler;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistrationException;

public abstract class DeviceComponent extends PackMLComponent {

	protected boolean resetOnComplete, resetOnStopped, initialStartOnIdle, initialSuspendOnExecute = false;

	private BlockingQueue<CapabilityRequest> requestQueue = new LinkedBlockingQueue<CapabilityRequest>(32);
	
	protected boolean simulated = false;	
		
	public DeviceComponent(ComponentConfiguration config) {
		super(config);
		
		allowedControlModes = new HashSet<>(Arrays.asList(ControlMode.PRODUCTION, ControlMode.SIMULATION));	

		if (config.getSimulationConfiguration() == null) {
			config.setSimulationConfiguration(new SimulationConfigurationImpl.Builder().build());
		} else {
			LOGGER.debug("using provided simulation config");
		}		
		
		if (config.getProperty("resetOnComplete") != null) {
			resetOnComplete = Boolean.parseBoolean(config.getProperty("resetOnComplete").getValue());
			LOGGER.info("resetOnComplete = " + resetOnComplete);
		}
		
		if (config.getProperty("resetOnStopped") != null) {
			resetOnStopped = Boolean.parseBoolean(config.getProperty("resetOnStopped").getValue());
			LOGGER.info("resetOnStopped = " + resetOnStopped);
		}		

		if (config.getProperty("observeExternalConnection") != null) {
			observeExternalConnection = Boolean.parseBoolean(config.getProperty("observeExternalConnection").getValue());
			LOGGER.info("observeExternalConnection = " + observeExternalConnection);
		}

		if (config.getProperty("initialStartOnIdle") != null) {
			initialStartOnIdle = Boolean.parseBoolean(config.getProperty("initialStartOnIdle").getValue());
			LOGGER.info("initialStartOnIdle = " + initialStartOnIdle);
		}
		
		if (config.getProperty("initialSuspendOnExecute") != null) {
			initialSuspendOnExecute = Boolean.parseBoolean(config.getProperty("initialSuspendOnExecute").getValue());
			LOGGER.info("initialSuspendOnExecute = " + initialSuspendOnExecute);
		}
		
		if (config.getProperty("simulated") != null) {
			simulated = Boolean.parseBoolean(config.getProperty("simulated").getValue());
			if (simulated) {
				packmlUnit.setMode(ControlMode.SIMULATION);
				observeExternalConnection = false;
				LOGGER.info("component is in SIMULATION mode");
			}
		}
		
//		packmlUnit.setSimStatesHandler(new SimulatedStatesHandler(this));
//		if (simulated) {
//			packmlUnit.setMode(ControlMode.SIMULATION);
//			observeExternalConnection = false;
//		}	
	}

	@Override
	protected boolean canConnectToExternal() {
		return !simulated;
	}

	@Override
	protected ComponentRequestStatus handleCapabilityRequest(CapabilityRequest req)	{
		ComponentRequestStatus status = super.handleCapabilityRequest(req);
		
		if (status.getStatus() == RequestStatus.REJECTED)
			return status;
				
		if (currentCapabilityRequest == null && getState() == State.IDLE) {
			LOGGER.info(String.format("Execute capability request '%s'", req.getCapabilityVariant().getName()));
			currentCapabilityRequest = req;
			UnitConfiguration config = translateCapabilityRequest(currentCapabilityRequest);		
			status = setUnitConfig(config);		
			if (status.getStatus() != RequestStatus.REJECTED) {				
				status = start();
			}
		} else {
			LOGGER.info(String.format("Enqueue capability request '%s'", req.getCapabilityVariant().getName()));
			if (requestQueue.remainingCapacity()>0) {
				requestQueue.add(req);
				status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.QUEUED).message("capability request enqueued").build();
			} else {
				status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.REJECTED).message("capability request queue full").build();
			}
		}
		
		return status;
	}
	
	protected abstract UnitConfiguration translateCapabilityRequest(CapabilityRequest req);
	
	/*
	 * CommandInterface
	 */
	
	@Override
	protected ComponentRequestStatus canSetMode(ControlMode mode) {
		ComponentRequestStatus status;
		if (simulated) {
			status = new ComponentRequestStatusImpl.Builder().componentId(getId()).status(RequestStatus.REJECTED).message("not allowed").build();
		} else {
			status = super.canSetMode(mode);
		}		
		return status;
	}
	
	/*
	 * default WaitStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onStopped() {		
		super.onStopped();
		
		if (resetOnStopped) {
			reset();
		}
	}

	@Override
	public void onIdle() {
		super.onIdle();
		
		if (initialStartOnIdle) {
			initialStartOnIdle = false;
			// TODO: what about handling a capability request instead? The translate method could then be used for configuring a sensor device
			start();			
		} else {		
			CapabilityRequest queuedRequest = requestQueue.poll();
			if (queuedRequest != null) {				 
				try {
					ComponentRequestStatus status = handleCapabilityRequest(queuedRequest);
					String payload = JsonUtils.toString(status);
					Notification not = cf.createNotification(payload);
					this.outChannel.sendNotification(not);
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
			}		
		}
	}
	
	@Override
	public void onExecute() {	
		super.onExecute();
		if (initialSuspendOnExecute) {
			initialSuspendOnExecute = false;
			suspend();
		} 
	}

	@Override
	public void onComplete() {
		super.onComplete();
		
		if (resetOnComplete) {
			reset();
		}
	}
	
	/*
	 * default ActiveStatesHandler implementation -> trigger logic on device
	 */

	@Override
	public void onCompleting() {
		handleCapabilityResponse(ResponseStatus.OK, getErrorCode());
	}

	@Override
	public void onStopping() {
		handleCapabilityResponse(ResponseStatus.NOT_OK, getErrorCode());
	}


}
