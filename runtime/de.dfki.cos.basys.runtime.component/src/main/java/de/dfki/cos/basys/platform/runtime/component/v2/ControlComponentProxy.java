package de.dfki.cos.basys.platform.runtime.component.v2;

import java.io.IOException;
import java.util.Properties;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;

import de.dfki.cos.basys.common.component.ComponentOrderStatus;
import de.dfki.cos.basys.common.component.OrderStatus;
import de.dfki.cos.basys.common.component.impl.ConnectionManagerImpl;
import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.controlcomponent.ExecutionCommand;
import de.dfki.cos.basys.controlcomponent.ExecutionMode;
import de.dfki.cos.basys.controlcomponent.OccupationLevel;
import de.dfki.cos.basys.controlcomponent.client.ControlComponentClient;
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

public class ControlComponentProxy extends BasysComponent {

	ControlComponentClient client;
	
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
		}
		
		if (status == null) {
			status = super.handleComponentRequest(cr);
		}
				
		return status;
	}


	protected ComponentRequestStatus handleOperationModeRequest(OperationModeRequest req) {
		LOGGER.info(String.format("handleOperationModeRequest '%s' (occupierId = %s)", req.getOperationMode(), req.getOccupierId()));

		/*
		 * Prerequisites:
		 *  - free
		 *  - idle execution state
		 * 
		 * Steps to perform:
		 *  - occupy
		 *  - set operation mode
		 *  - set input parameters
		 *  - start
		 *  - wait for completed or stopped state
		 *  - read output parameters
		 *  - send response to process
		 *  - reset
		 *  - free 
		 */
		
		
		// TODO: Check for Occupation and Execution State. If possible/neccessary set everything. 
		
//		if (client.getOccupierId() !=
//		
//		ComponentOrderStatus order

		
		
		
		ComponentOrderStatus order = client.setOperationMode(req.getOperationMode(), req.getOccupierId());
	
		if (order.getStatus() == OrderStatus.ACCEPTED) {
			for (Variable var : req.getInputParameters()) {
				// TODO: set parameters
			}			
		}
		
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder()
				.status(RequestStatus.get(order.getStatus().getLiteral()))
				.message(order.getMessage())
				.build();

		LOGGER.info(String.format("handleOperationModeRequest '%s' - finished", req.getOperationMode()));		
		return status;		
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
	
}
