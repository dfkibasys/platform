package de.dfki.cos.basys.platform.runtime.component;

import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

import de.dfki.cos.basys.common.component.ComponentOrderStatus;
import de.dfki.cos.basys.common.component.OrderStatus;
import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;
import de.dfki.cos.basys.controlcomponent.ExecutionCommand;
import de.dfki.cos.basys.controlcomponent.ExecutionMode;
import de.dfki.cos.basys.controlcomponent.OccupationLevel;
import de.dfki.cos.basys.controlcomponent.ParameterInfo;
import de.dfki.cos.basys.controlcomponent.client.ControlComponentClient;
import de.dfki.cos.basys.controlcomponent.packml.PackMLWaitStatesHandler;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest;
import de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.RequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;
import de.dfki.cos.basys.platform.model.runtime.component.VariableType;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl;
import de.dfki.cos.basys.platform.model.runtime.component.impl.VariableImpl;

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
		
		ComponentRequestStatus result = new ComponentRequestStatusImpl.Builder()
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
	
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder()
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
	
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder()
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
								Object value = null;
								
								switch (var.getType()) {
								case BOOLEAN:
									value = Boolean.parseBoolean(var.getValue());
									break;
								case DATE:
									value = DateFormat.getDateInstance().parse(var.getValue());
									break;
								case DOUBLE:
									value = Double.parseDouble(var.getValue());
									break;
								case INTEGER:
									value = Integer.parseInt(var.getValue());
									break;
								case LONG:
									value = Long.parseLong(var.getValue());
									break;
								default:
									value = var.getValue();
									break;
								}
								
								
								client.setParameterValue(var.getName(), value);
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
							sendComponentResponse(currentOperationModeRequest, ResponseStatus.OK, client.getErrorCode());	
						} else {
							List<Variable> variables = new ArrayList<>(n);
							for (String name : currentOperationModeRequest.getOutputParameters()) {
								//Object value = client.getParameterValue(name);
								ParameterInfo p = client.getParameter(name);
								Variable var = new VariableImpl.Builder()
										.name(name)
										.value(p.getValue().toString())
										.type(VariableType.fromOpcUa(p.getType()))
										.build();
								variables.add(var);
							}							
							sendComponentResponse(currentOperationModeRequest, ResponseStatus.OK, client.getErrorCode(), variables);							
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
							sendComponentResponse(currentOperationModeRequest, ResponseStatus.OK, client.getErrorCode());	
						} else {
							List<Variable> variables = new ArrayList<>(n);
							for (String name : currentOperationModeRequest.getOutputParameters()) {
								//Object value = client.getParameterValue(name);
								ParameterInfo p = client.getParameter(name);
								Variable var = new VariableImpl.Builder()
										.name(name)
										.value(p.getValue().toString())
										.type(VariableType.fromOpcUa(p.getType()))
										.build();
								variables.add(var);
							}							
							sendComponentResponse(currentOperationModeRequest, ResponseStatus.NOT_OK, client.getErrorCode(), variables);							
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