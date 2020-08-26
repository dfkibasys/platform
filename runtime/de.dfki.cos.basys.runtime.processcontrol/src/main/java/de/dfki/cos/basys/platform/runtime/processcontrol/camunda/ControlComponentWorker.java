package de.dfki.cos.basys.platform.runtime.processcontrol.camunda;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.camunda.bpm.client.task.ExternalTask;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.dfki.cos.basys.controlcomponent.ExecutionCommand;
import de.dfki.cos.basys.controlcomponent.ExecutionMode;
import de.dfki.cos.basys.controlcomponent.OccupationCommand;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ExecutionCommandRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ExecutionModeRequest;
import de.dfki.cos.basys.platform.runtime.component.model.OccupationCommandRequest;
import de.dfki.cos.basys.platform.runtime.component.model.OperationModeRequest;
import de.dfki.cos.basys.platform.runtime.component.model.Variable;
import de.dfki.cos.basys.platform.runtime.processcontrol.ComponentRequestExecutionManager;

public class ControlComponentWorker extends CamundaExternalTaskWorker {

	public ControlComponentWorker(Properties config) {
		super(config);
	}

	public ComponentRequest createComponentRequest(ExternalTask externalTask) {		
		
		ComponentRequest r = null;
		
		String requestType = externalTask.getVariable("requestType");
		if (requestType == null) {
			externalTaskService.handleFailure(externalTask, "No requestType", "ExternalTask does not contain a requestType", maxRetryCount, retryTimeout);
			return null;
		}
		
		String componentId = externalTask.getVariable("componentId");
		if (componentId == null) {
			externalTaskService.handleFailure(externalTask, "No componentId", "ExternalTask does not contain a componentId", maxRetryCount, retryTimeout);
			return null;
		}
		
		String token = externalTask.getVariable("token");
		if (token == null) {
			externalTaskService.handleFailure(externalTask, "No token", "ExternalTask does not contain a token", maxRetryCount, retryTimeout);
			return null;
		}
		
		switch (requestType) {
		case "ExecutionCommandRequest":
			r = new ExecutionCommandRequest();
			((ExecutionCommandRequest)r).setExecutionCommand(ExecutionCommand.get(token));
			break;
		case "ExecutionModeRequest":
			r = new ExecutionModeRequest();
			((ExecutionModeRequest)r).setExecutionMode(ExecutionMode.get(token));
			break;
		case "OccupationCommandRequest":
			r = new OccupationCommandRequest();
			((OccupationCommandRequest)r).setOccupationCommand(OccupationCommand.get(token));
			break;
		case "OperationModeRequest":
			r = new OperationModeRequest();
			OperationModeRequest req = (OperationModeRequest) r;
			req.setOperationMode(token);
			ObjectMapper mapper = new ObjectMapper();
			try {		
				
				String input = externalTask.getVariable("inputParameters");
				String output = externalTask.getVariable("outputParameters");		
				
				if (input != null) {
					List<Variable> inputParameters = mapper.readValue(input,new TypeReference<List<Variable>>(){});
					LOGGER.debug(inputParameters.toString());
					req.getInputParameters().addAll(inputParameters);
				}
				if (output != null) {
					List<Variable> outputParameters = mapper.readValue(output,new TypeReference<List<Variable>>(){});			
					LOGGER.debug(outputParameters.toString());		
					req.getOutputParameters().addAll(outputParameters);
				}
				
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		default:
			break;
		}
		
		r.setCorrelationId(externalTask.getId());
		r.setOccupierId(externalTask.getProcessInstanceId());				
		r.setComponentId(componentId);					
		
		return r;
	}


	
}
