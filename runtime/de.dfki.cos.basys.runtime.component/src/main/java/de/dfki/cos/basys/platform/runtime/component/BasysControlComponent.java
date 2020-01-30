package de.dfki.cos.basys.platform.runtime.component;

import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.controlcomponent.ComponentOrderStatus;
import de.dfki.cos.basys.controlcomponent.ExecutionCommand;
import de.dfki.cos.basys.controlcomponent.ExecutionMode;
import de.dfki.cos.basys.controlcomponent.OccupationCommand;
import de.dfki.cos.basys.controlcomponent.OccupationState;
import de.dfki.cos.basys.controlcomponent.OrderStatus;
import de.dfki.cos.basys.controlcomponent.ParameterInfo;
import de.dfki.cos.basys.controlcomponent.client.ControlComponentClient;
import de.dfki.cos.basys.controlcomponent.client.ControlComponentClientImpl;
import de.dfki.cos.basys.controlcomponent.packml.PackMLWaitStatesHandler;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequestStatus;
import de.dfki.cos.basys.platform.runtime.component.model.ExecutionCommandRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ExecutionModeRequest;
import de.dfki.cos.basys.platform.runtime.component.model.OccupationCommandRequest;
import de.dfki.cos.basys.platform.runtime.component.model.OperationModeRequest;
import de.dfki.cos.basys.platform.runtime.component.model.RequestStatus;
import de.dfki.cos.basys.platform.runtime.component.model.Variable;
import de.dfki.cos.basys.platform.runtime.component.model.VariableType;

public class BasysControlComponent extends BasysComponent<ControlComponentClient> implements PackMLWaitStatesHandler {
	
	OperationModeRequest currentOperationModeRequest;
	
	public BasysControlComponent(Properties config) {
		super(config);
		
		 ControlComponentClientImpl serviceProvider = new ControlComponentClientImpl(config, this);
		 serviceManager = new ServiceManagerImpl<ControlComponentClient>(config, serviceProvider);			
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
		} else if (cr instanceof OccupationCommandRequest) {
			OccupationCommandRequest req = (OccupationCommandRequest) cr;
			status = handleOccupationCommandRequest(req);
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
		status = getService().occupy(occupierId);
		if (status.getStatus() == OrderStatus.DONE) {
			currentOperationModeRequest = req;
			status = getService().reset(occupierId);
		}
		
		ComponentRequestStatus result = new ComponentRequestStatus.Builder()
				.status(RequestStatus.get(status.getStatus().getLiteral()))
				.message(status.getMessage())
				.build();

		LOGGER.info(String.format("handleOperationModeRequest '%s' - finished", req.getOperationMode()));		
		return result;		
	}

	protected ComponentRequestStatus handleExecutionCommandRequest(ExecutionCommandRequest req) {
		LOGGER.info(String.format("handleExecutionCommandRequest '%s' (occupierId = %s)", req.getExecutionCommand(), req.getOccupierId()));
		
		ComponentOrderStatus order = getService().raiseExecutionCommand(ExecutionCommand.get(req.getExecutionCommand().getLiteral()), req.getOccupierId());
	
		ComponentRequestStatus status = new ComponentRequestStatus.Builder()
				.status(RequestStatus.get(order.getStatus().getLiteral()))
				.message(order.getMessage())
				.build();

		LOGGER.info(String.format("handleExecutionCommandRequest '%s' - finished", req.getExecutionCommand()));		
		return status;		
	}

	protected ComponentRequestStatus handleExecutionModeRequest(ExecutionModeRequest req) {
		LOGGER.info(String.format("handleExecutionModeRequest '%s' (occupierId = %s)", req.getExecutionMode(), req.getOccupierId()));
		
		ControlComponentClient client = getService();
		ComponentOrderStatus order = client.setExecutionMode(ExecutionMode.get(req.getExecutionMode().getLiteral()), req.getOccupierId());
	
		ComponentRequestStatus status = new ComponentRequestStatus.Builder()
				.status(RequestStatus.get(order.getStatus().getLiteral()))
				.message(order.getMessage())
				.build();

		LOGGER.info(String.format("handleExecutionModeRequest '%s' - finished", req.getExecutionMode()));
		return status;
	}

	protected ComponentRequestStatus handleOccupationCommandRequest(OccupationCommandRequest req) {
		LOGGER.info(String.format("handleOccupationCommandRequest '%s' (occupierId = %s)", req.getOccupationCommand(), req.getOccupierId()));
		
		ComponentOrderStatus order = getService().occupy(req.getOccupationCommand(), req.getOccupierId());
	
		ComponentRequestStatus status = new ComponentRequestStatus.Builder()
				.status(RequestStatus.get(order.getStatus().getLiteral()))
				.message(order.getMessage())
				.build();

		LOGGER.info(String.format("handleOccupationCommandRequest '%s' - finished", req.getOccupationCommand()));
		return status;
	}

	@Override
	public void onIdle() {
		if (currentOperationModeRequest != null) {		
			
			try {
				ComponentOrderStatus status = context.getScheduledExecutorService().submit(new Callable<ComponentOrderStatus>() {
					@Override
					public ComponentOrderStatus call() throws Exception {
						ComponentOrderStatus status;
						status = getService().setOperationMode(currentOperationModeRequest.getOperationMode(), currentOperationModeRequest.getOccupierId());
						if (status.getStatus() == OrderStatus.DONE) {
							for (Variable var : currentOperationModeRequest.getInputParameters()) {								
								//TODO: put switch block into Variable class, test date parsing and setting via opcua																				
								getService().setParameterValue(var.getName(), var.castValue());
							}			
							status = getService().start(currentOperationModeRequest.getOccupierId());
						}			
						return status;
						
					}
				}).get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public void onComplete() {
		if (currentOperationModeRequest != null) {
			try {
				ComponentOrderStatus status = context.getScheduledExecutorService().submit(new Callable<ComponentOrderStatus>() {
					@Override
					public ComponentOrderStatus call() throws Exception {
						ComponentOrderStatus status;					
						status = getService().free(currentOperationModeRequest.getOccupierId());
						
						int n = currentOperationModeRequest.getOutputParameters().size();
						if (n==0) {
							sendComponentResponse(currentOperationModeRequest, RequestStatus.OK, getService().getErrorCode());	
						} else {							
							for (Variable var : currentOperationModeRequest.getOutputParameters()) {								
								ParameterInfo p = getService().getParameter(var.getName());
								var.setValue(p.getValue());
								if (var.getType() != VariableType.fromOpcUa(p.getType())) {
									LOGGER.warn("output parameter {} : retrieved type {} does not match expected type {}!", var.getName(), VariableType.fromOpcUa(p.getType()), p.getType());
								}								
							}							
							sendComponentResponse(currentOperationModeRequest, RequestStatus.OK, getService().getErrorCode(), currentOperationModeRequest.getOutputParameters());							
						}
						
						currentOperationModeRequest = null;
						return status;
						
					}
				}).get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
		}		
	}

	@Override
	public void onStopped() {
		if (currentOperationModeRequest != null) {
			try {
				ComponentOrderStatus status = context.getScheduledExecutorService().submit(new Callable<ComponentOrderStatus>() {
					@Override
					public ComponentOrderStatus call() throws Exception {
						ComponentOrderStatus status;						
						status = getService().free(currentOperationModeRequest.getOccupierId());
						
						int n = currentOperationModeRequest.getOutputParameters().size();
						if (n==0) {
							sendComponentResponse(currentOperationModeRequest, RequestStatus.NOT_OK, getService().getErrorCode());	
						} else {
							for (Variable var : currentOperationModeRequest.getOutputParameters()) {								
								ParameterInfo p = getService().getParameter(var.getName());
								var.setValue(p.getValue());
								if (var.getType() != VariableType.fromOpcUa(p.getType())) {
									LOGGER.warn("output parameter {} : retrieved type {} does not match expected type {}!", var.getName(), VariableType.fromOpcUa(p.getType()), p.getType());
								}								
							}							
							sendComponentResponse(currentOperationModeRequest, RequestStatus.NOT_OK, getService().getErrorCode(), currentOperationModeRequest.getOutputParameters());						
						}
						
						currentOperationModeRequest = null;
						return status;
						
					}
				}).get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
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
