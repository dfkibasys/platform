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
import de.dfki.cos.basys.controlcomponent.ComponentOrderStatus;
import de.dfki.cos.basys.controlcomponent.ExecutionCommand;
import de.dfki.cos.basys.controlcomponent.ExecutionMode;
import de.dfki.cos.basys.controlcomponent.OccupationLevel;
import de.dfki.cos.basys.controlcomponent.OrderStatus;
import de.dfki.cos.basys.controlcomponent.ParameterInfo;
import de.dfki.cos.basys.controlcomponent.client.ControlComponentClient;
import de.dfki.cos.basys.controlcomponent.packml.PackMLWaitStatesHandler;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequestStatus;
import de.dfki.cos.basys.platform.runtime.component.model.ExecutionCommandRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ExecutionModeRequest;
import de.dfki.cos.basys.platform.runtime.component.model.OccupationLevelRequest;
import de.dfki.cos.basys.platform.runtime.component.model.OperationModeRequest;
import de.dfki.cos.basys.platform.runtime.component.model.RequestStatus;
import de.dfki.cos.basys.platform.runtime.component.model.Variable;
import de.dfki.cos.basys.platform.runtime.component.model.VariableType;

public class BasysControlComponent extends BasysComponent implements PackMLWaitStatesHandler {
	
	OperationModeRequest currentOperationModeRequest;
	
	public BasysControlComponent(Properties config) {
		super(config);
		serviceManager = new ServiceManagerImpl<ControlComponentClient>(config, new Supplier<ControlComponentClient>() {
			@Override
			public ControlComponentClient get() {
				ControlComponentClient client = new ControlComponentClient(config);
				client.setExecutionStateChangedHandler(BasysControlComponent.this);
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
		ControlComponentClient client = getService();
		status = client.occupy(occupierId);
		if (status.getStatus() == OrderStatus.DONE) {
			currentOperationModeRequest = req;
			status = client.reset(occupierId);
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
		
		ControlComponentClient client = getService();
		ComponentOrderStatus order = client.raiseExecutionCommand(ExecutionCommand.get(req.getExecutionCommand().getLiteral()), req.getOccupierId());
	
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

	protected ComponentRequestStatus handleOccupationLevelRequest(OccupationLevelRequest req) {
		LOGGER.info(String.format("handleOccupationLevelRequest '%s' (occupierId = %s)", req.getOccupationLevel(), req.getOccupierId()));
		
		ControlComponentClient client = getService();
		ComponentOrderStatus order = client.occupy(OccupationLevel.get(req.getOccupationLevel().getLiteral()), req.getOccupierId());
	
		ComponentRequestStatus status = new ComponentRequestStatus.Builder()
				.status(RequestStatus.get(order.getStatus().getLiteral()))
				.message(order.getMessage())
				.build();

		LOGGER.info(String.format("handleOccupationLevelRequest '%s' - finished", req.getOccupationLevel()));
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
						ControlComponentClient client = getService();
						status = client.setOperationMode(currentOperationModeRequest.getOperationMode(), currentOperationModeRequest.getOccupierId());
						if (status.getStatus() == OrderStatus.DONE) {
							for (Variable var : currentOperationModeRequest.getInputParameters()) {								
								//TODO: put switch block into Variable class, test date parsing and setting via opcua																				
								client.setParameterValue(var.getName(), var.getValue());
							}			
							status = client.start(currentOperationModeRequest.getOccupierId());
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
						ControlComponentClient client = getService();						
						status = client.free(currentOperationModeRequest.getOccupierId());
						
						int n = currentOperationModeRequest.getOutputParameters().size();
						if (n==0) {
							sendComponentResponse(currentOperationModeRequest, RequestStatus.OK, client.getErrorCode());	
						} else {
							List<Variable> variables = new ArrayList<>(n);
							for (String name : currentOperationModeRequest.getOutputParameters()) {
								//Object value = client.getParameterValue(name);
								ParameterInfo p = client.getParameter(name);
								Variable var = new Variable.Builder()
										.name(name)
										.valueString(p.getValue().toString())
										.type(VariableType.fromOpcUa(p.getType()))
										.build();
								variables.add(var);
							}							
							sendComponentResponse(currentOperationModeRequest, RequestStatus.OK, client.getErrorCode(), variables);							
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
						ControlComponentClient client = getService();						
						status = client.free(currentOperationModeRequest.getOccupierId());
						
						int n = currentOperationModeRequest.getOutputParameters().size();
						if (n==0) {
							sendComponentResponse(currentOperationModeRequest, RequestStatus.NOT_OK, client.getErrorCode());	
						} else {
							List<Variable> variables = new ArrayList<>(n);
							for (String name : currentOperationModeRequest.getOutputParameters()) {
								//Object value = client.getParameterValue(name);
								ParameterInfo p = client.getParameter(name);
								Variable var = new Variable.Builder()
										.name(name)
										.valueString(p.getValue().toString())
										.type(VariableType.fromOpcUa(p.getType()))
										.build();
								variables.add(var);
							}							
							sendComponentResponse(currentOperationModeRequest, RequestStatus.NOT_OK, client.getErrorCode(), variables);							
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
