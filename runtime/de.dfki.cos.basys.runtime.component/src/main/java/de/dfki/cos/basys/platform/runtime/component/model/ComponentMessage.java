package de.dfki.cos.basys.platform.runtime.component.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use=Id.CLASS, include=As.PROPERTY)
public interface ComponentMessage {
	String getComponentId();
	RequestStatus getStatus();
	String getMessage();
}
