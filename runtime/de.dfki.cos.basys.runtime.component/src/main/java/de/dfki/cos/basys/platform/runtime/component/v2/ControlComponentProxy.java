package de.dfki.cos.basys.platform.runtime.component.v2;

import java.util.Properties;
import java.util.function.Supplier;


import de.dfki.cos.basys.common.component.ComponentOrderStatus;
import de.dfki.cos.basys.common.component.OrderStatus;
import de.dfki.cos.basys.common.component.impl.ConnectionManagerImpl;
import de.dfki.cos.basys.controlcomponent.ExecutionCommand;
import de.dfki.cos.basys.controlcomponent.ExecutionMode;
import de.dfki.cos.basys.controlcomponent.OccupationLevel;
import de.dfki.cos.basys.controlcomponent.OccupationStatus;
import de.dfki.cos.basys.controlcomponent.client.ControlComponentClient;
import de.dfki.cos.basys.controlcomponent.packml.PackMLWaitStatesHandler;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ChangeModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.CommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest;
import de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.RequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.StatusRequest;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl;

public class ControlComponentProxy extends BasysComponent implements PackMLWaitStatesHandler {

	ControlComponentClient client;
	
	OperationModeRequest currentOperationModeRequest;
	
	public ControlComponentProxy(Properties config) {
		super(config);
		connectionManager = new ConnectionManagerImpl(config, new Supplier<ControlComponentClient>() {
			@Override
			public ControlComponentClient get() {
				ControlComponentClient client = new ControlComponentClient(config);
				return client;
			}
		});
	}
	
	@Override
	protected ComponentRequestStatus handleComponentRequest(ComponentRequest cr) {
		ComponentRequestStatus status = null;
		
		if (cr instanceof OperationModeRequest) {
			OperationModeRequest req = (OperationModeRequest) cr;
			status = handleOperationModeRequest(req);
		} else if (cr instanceof ExecutionCommandRequest) {
			ExecutionCommandRequest req = (ExecutionCommandRequest) cr;
			status = handleExecutionCommandRequest(req);
		} else if (cr instanceof ExecutionModeRequest) {
			ExecutionModeRequest req = (ExecutionModeRequest) cr;
			status = handleExecutionModeRequest(req);
		} else if (cr instanceof OccupationLevelRequest) {
			OccupationLevelRequest req = (OccupationLevelRequest) cr;
			status = handleOccupationLevelRequest(req);
		} else {
			status = super.handleComponentRequest(cr);
		}
				
		return status;
	}

	protected ComponentRequestStatus handleOperationModeRequest(OperationModeRequest req) {
		LOGGER.info(String.format("handleOperationModeRequest '%s' (occupierId = %s)", req.getOperationMode(), req.getOccupierId()));

		/*
		 * Prerequisites:
		 *  - free
		 *  - stopped or completed execution state
		 * 
		 * Steps to perform:
		 *  - occupy
		 *  - reset
		 *  - [wait for IDLE state]
		 *  - set operation mode
		 *  - set input parameters
		 *  - start
		 *  - [wait for COMPLETED or STOPPED state]
		 *  - read output parameters
		 *  - send response to process  
		 *  - free 
		 */
		
		ComponentOrderStatus status = null;		
		String occupierId = req.getOccupierId();
		status = client.occupy(occupierId);
		if (status.getStatus() == OrderStatus.DONE) {
			currentOperationModeRequest = req;
			status = client.reset(occupierId);
		}
		
		ComponentRequestStatus result = new ComponentRequestStatusImpl.Builder()
				.status(RequestStatus.get(status.getStatus().getLiteral()))
				.message(status.getMessage())
				.build();

		LOGGER.info(String.format("handleOperationModeRequest '%s' - finished", req.getOperationMode()));		
		return result;		
	}

	protected ComponentRequestStatus handleExecutionCommandRequest(ExecutionCommandRequest req) {
		LOGGER.info(String.format("handleExecutionCommandRequest '%s' (occupierId = %s)", req.getExecutionCommand(), req.getOccupierId()));
		
		ComponentOrderStatus order = client.raiseExecutionCommand(ExecutionCommand.get(req.getExecutionCommand().getLiteral()), req.getOccupierId());
	
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder()
				.status(RequestStatus.get(order.getStatus().getLiteral()))
				.message(order.getMessage())
				.build();

		LOGGER.info(String.format("handleExecutionCommandRequest '%s' - finished", req.getExecutionCommand()));		
		return status;		
	}

	protected ComponentRequestStatus handleExecutionModeRequest(ExecutionModeRequest req) {
		LOGGER.info(String.format("handleExecutionModeRequest '%s' (occupierId = %s)", req.getExecutionMode(), req.getOccupierId()));
		
		ComponentOrderStatus order = client.setExecutionMode(ExecutionMode.get(req.getExecutionMode().getLiteral()), req.getOccupierId());
	
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder()
				.status(RequestStatus.get(order.getStatus().getLiteral()))
				.message(order.getMessage())
				.build();

		LOGGER.info(String.format("handleExecutionModeRequest '%s' - finished", req.getExecutionMode()));
		return status;
	}

	protected ComponentRequestStatus handleOccupationLevelRequest(OccupationLevelRequest req) {
		LOGGER.info(String.format("handleOccupationLevelRequest '%s' (occupierId = %s)", req.getOccupationLevel(), req.getOccupierId()));
		
		ComponentOrderStatus order = client.occupy(OccupationLevel.get(req.getOccupationLevel().getLiteral()), req.getOccupierId());
	
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder()
				.status(RequestStatus.get(order.getStatus().getLiteral()))
				.message(order.getMessage())
				.build();

		LOGGER.info(String.format("handleOccupationLevelRequest '%s' - finished", req.getOccupationLevel()));
		return status;
	}

	@Override
	public void onIdle() {
		if (currentOperationModeRequest != null) {
			ComponentOrderStatus status;
			status = client.setOperationMode(currentOperationModeRequest.getOperationMode(), currentOperationModeRequest.getOccupierId());
			if (status.getStatus() == OrderStatus.DONE) {
				for (Variable var : currentOperationModeRequest.getInputParameters()) {
					// TODO: set input parameters
				}			
			}			
			status = client.start(currentOperationModeRequest.getOccupierId());
		}
	}

	@Override
	public void onComplete() {
		if (currentOperationModeRequest != null) {
			currentOperationModeRequest = null;
			ComponentOrderStatus status;
			//TODO: get output parameters
			//TODO: notify process
			status = client.free(currentOperationModeRequest.getOccupierId());
		}		
	}

	@Override
	public void onStopped() {
		if (currentOperationModeRequest != null) {
			currentOperationModeRequest = null;
			ComponentOrderStatus status;
			//TODO: get output parameters
			//TODO: notify process
			status = client.free(currentOperationModeRequest.getOccupierId());
		}
	}
	
	@Override
	public void onHeld() {
		if (currentOperationModeRequest != null) {
			
		}
	}

	@Override
	public void onSuspended() {
		if (currentOperationModeRequest != null) {
			
		}
	}

	@Override
	public void onAborted() {
		if (currentOperationModeRequest != null) {
			
		}
	}
	
}
