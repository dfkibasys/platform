/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dfki.cos.basys.platform.runtime.processcontrol.v2.camunda;

import java.util.Date;
import java.util.Map;

/**
 *
 * @author chbu02
 */
public class ExternalServiceTaskDto {

	public static class ValueInfo {
		String objectTypeName;
		String serializationDataFormat;

		public String getObjectTypeName() {
			return objectTypeName;
		}

		public void setObjectTypeName(String objectTypeName) {
			this.objectTypeName = objectTypeName;
		}

		public String getSerializationDataFormat() {
			return serializationDataFormat;
		}

		public void setSerializationDataFormat(String serializationDataFormat) {
			this.serializationDataFormat = serializationDataFormat;
		}

	}
	
	public static class Command {
		String type;
		String value;
		ValueInfo valueInfo;
		
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		
		public ValueInfo getValueInfo() {
			return valueInfo;
		}
		
		public void setValueInfo(ValueInfo valueInfo) {
			this.valueInfo = valueInfo;
		}

	}

	public static class Parameters {
		String type;
		Map<String, String> value;
		ValueInfo valueInfo;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Map<String, String> getValue() {
			return value;
		}

		public void setValue(Map<String, String> value) {
			this.value = value;
		}

		public ValueInfo getValueInfo() {
			return valueInfo;
		}

		public void setValueInfo(ValueInfo valueInfo) {
			this.valueInfo = valueInfo;
		}

	}

	public static class Assignee {
		String type;
		String value;
		ValueInfo valueInfo;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		
		public ValueInfo getValueInfo() {
			return valueInfo;
		}
		
		public void setValueInfo(ValueInfo valueInfo) {
			this.valueInfo = valueInfo;
		}

	}

	public static class Variables {
		Command command;
		Parameters parameters;
		Assignee assignee;

		public Command getCommand() {
			return command;
		}

		public void setCommand(Command command) {
			this.command = command;
		}
		
		public Parameters getParameters() {
			return parameters;
		}
		
		public void setParameters(Parameters parameters) {
			this.parameters = parameters;
		}

		public Assignee getAssignee() {
			return assignee;
		}

		public void setAssignee(Assignee assignee) {
			this.assignee = assignee;
		}

	}

	String activityId;
	String activityInstanceId;
	String errorMessage;
	String errorDetails;
	String executionId;
	String id;
	Date lockExpirationTime;
	String processDefinitionId;
	String processDefinitionKey;
	String processInstanceId;
	Integer retries;
	Boolean suspended;
	String workerId;
	String topicName;
	String tenantId;
	Variables variables;
	Integer priority;
	String businessKey;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityInstanceId() {
		return activityInstanceId;
	}

	public void setActivityInstanceId(String activityInstanceId) {
		this.activityInstanceId = activityInstanceId;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getLockExpirationTime() {
		return lockExpirationTime;
	}

	public void setLockExpirationTime(Date lockExpirationTime) {
		this.lockExpirationTime = lockExpirationTime;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public Integer getRetries() {
		return retries;
	}

	public void setRetries(Integer retries) {
		this.retries = retries;
	}

	public Boolean getSuspended() {
		return suspended;
	}

	public void setSuspended(Boolean suspended) {
		this.suspended = suspended;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Variables getVariables() {
		return variables;
	}

	public void setVariables(Variables variables) {
		this.variables = variables;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

}
