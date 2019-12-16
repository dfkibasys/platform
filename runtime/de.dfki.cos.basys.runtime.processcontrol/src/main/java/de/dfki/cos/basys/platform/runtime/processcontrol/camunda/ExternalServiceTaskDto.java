package de.dfki.cos.basys.platform.runtime.processcontrol.camunda;

import java.util.Date;

public class ExternalServiceTaskDto {

	public static class ValueInfo {
		public String objectTypeName;
		public String serializationDataFormat;
	}
	
	public static class Variable {
		public String type;
		public String value;
		public ValueInfo valueInfo;
	}

	public static class Variables {
		public Variable componentId;
		public Variable requestType;
		public Variable token;
		public Variable inputParameters;
		public Variable outputParameters;
	}

	public String activityId;
	public String activityInstanceId;
	public String errorMessage;
	public String errorDetails;
	public String executionId;
	public String id;
	public Date lockExpirationTime;
	public String processDefinitionId;
	public String processDefinitionKey;
	public String processInstanceId;
	public Integer retries;
	public Boolean suspended;
	public String workerId;
	public String topicName;
	public String tenantId;
	public Variables variables;
	public Integer priority;
	public String businessKey;

}
