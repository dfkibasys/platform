package de.dfki.iui.basys.runtime.component.registry;

import com.fasterxml.jackson.annotation.JsonRootName;

import de.dfki.iui.basys.runtime.component.device.packml.Mode;
import de.dfki.iui.basys.runtime.component.device.packml.State;

@JsonRootName("componentInfo")
public class ComponentInfo {

	public ComponentInfo() {
		// TODO Auto-generated constructor stub
	}
	
	private String id;
	private String name;
	private String category;
	private String connectionString;
	private String communicationProvider;
	private String inChannel;
	private String outChannel;

	private State currentState;
	private Mode currentMode;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the connectionString
	 */
	public String getConnectionString() {
		return connectionString;
	}

	/**
	 * @return the communicationProvider
	 */
	public String getCommunicationProvider() {
		return communicationProvider;
	}

	/**
	 * @return the inChannel
	 */
	public String getInChannel() {
		return inChannel;
	}

	/**
	 * @return the outChannel
	 */
	public String getOutChannel() {
		return outChannel;
	}

	/**
	 * @return the currentState
	 */
	public State getCurrentState() {
		return currentState;
	}

	/**
	 * @return the currentMode
	 */
	public Mode getCurrentMode() {
		return currentMode;
	}

	public static class Builder {
		private String id;
		private String name;
		private String category;
		private String connectionString;
		private String communicationProvider;
		private String inChannel;
		private String outChannel;
		private State currentState;
		private Mode currentMode;

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder category(String category) {
			this.category = category;
			return this;
		}

		public Builder connectionString(String connectionString) {
			this.connectionString = connectionString;
			return this;
		}

		public Builder communicationProvider(String communicationProvider) {
			this.communicationProvider = communicationProvider;
			return this;
		}

		public Builder inChannel(String inChannel) {
			this.inChannel = inChannel;
			return this;
		}

		public Builder outChannel(String outChannel) {
			this.outChannel = outChannel;
			return this;
		}

		public Builder currentState(State currentState) {
			this.currentState = currentState;
			return this;
		}

		public Builder currentMode(Mode currentMode) {
			this.currentMode = currentMode;
			return this;
		}

		public ComponentInfo build() {
			return new ComponentInfo(this);
		}
	}

	private ComponentInfo(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.category = builder.category;
		this.connectionString = builder.connectionString;
		this.communicationProvider = builder.communicationProvider;
		this.inChannel = builder.inChannel;
		this.outChannel = builder.outChannel;
		this.currentState = builder.currentState;
		this.currentMode = builder.currentMode;
	}
}
