package de.dfki.cos.basys.platform.runtime.processcontrol.camunda;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

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

	public ComponentRequest createComponentRequest(ExternalServiceTaskDto task) {		
		ComponentRequest r = null;
		
		switch (task.variables.requestType.value) {
		case "ExecutionCommandRequest":
			r = new ExecutionCommandRequest();
			((ExecutionCommandRequest)r).setExecutionCommand(ExecutionCommand.get(task.variables.token.value));
			break;
		case "ExecutionModeRequest":
			r = new ExecutionModeRequest();
			((ExecutionModeRequest)r).setExecutionMode(ExecutionMode.get(task.variables.token.value));
			break;
		case "OccupationCommandRequest":
			r = new OccupationCommandRequest();
			((OccupationCommandRequest)r).setOccupationCommand(OccupationCommand.get(task.variables.token.value));
			break;
		case "OperationModeRequest":
			r = new OperationModeRequest();
			OperationModeRequest req = (OperationModeRequest) r;
			req.setOperationMode(task.variables.token.value);
			ObjectMapper mapper = new ObjectMapper();
			try {
				
				List<Variable> inputParameters = mapper.readValue(task.variables.inputParameters.value,new TypeReference<List<Variable>>(){});
				LOGGER.debug(inputParameters.toString());					
				for (Variable var : inputParameters) {
					//Variable var = new Variable.Builder().name(entry.getKey()).valueString(entry.getValue()).build();
					req.getInputParameters().add(var);						
				    //System.out.println(entry.getKey() + "/" + entry.getValue());
				}
									
				List<Variable> output = mapper.readValue(task.variables.outputParameters.value,new TypeReference<List<Variable>>(){});			
				LOGGER.debug(output.toString());		
				req.getOutputParameters().addAll(output);
				
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
		
		r.setCorrelationId(task.id);
		r.setOccupierId(task.processInstanceId);				
		r.setComponentId(task.variables.componentId.value);					
		
		return r;
	}


	
}
