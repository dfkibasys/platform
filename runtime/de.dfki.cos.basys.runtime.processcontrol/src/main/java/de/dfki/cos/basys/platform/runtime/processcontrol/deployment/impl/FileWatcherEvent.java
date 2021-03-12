package de.dfki.cos.basys.platform.runtime.processcontrol.deployment.impl;

import de.dfki.cos.basys.common.component.Component;

public class FileWatcherEvent {
	public enum Type {
		FILE_CREATED,
		FILE_DELETED,
		FILE_MODIFIED
	};
	
	public Type type;
	public String value;
	public Component component;
	
	public FileWatcherEvent(Type type, String value) {
		this.type = type;
		this.value = value;
	}
	
	public FileWatcherEvent(Type type, String value, Component component) {
		this.type = type;
		this.value = value;
		this.component = component;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getValue() {
		return value;
	}

	public Component getComponent() {
		return component;
	}
	
	@Override
	public String toString() {
		return "FileManagerEvent [type=" + type + ", value=" + value + "]";
	}
	
	
}
