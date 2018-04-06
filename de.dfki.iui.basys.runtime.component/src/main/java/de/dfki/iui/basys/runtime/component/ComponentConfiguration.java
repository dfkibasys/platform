package de.dfki.iui.basys.runtime.component;

public class ComponentConfiguration {

	private String componentId;
	private String componentName;
	private ComponentCategory componentCategory;
	private String componentImplementationJavaClass;
	private String communicationProviderImplementationJavaClass;
	private String communicationProviderConnectionString;
	private String inChannelName;
	private String outChannelName;
	private String externalConnectionString;

	
	/**
	 * @return the componentId
	 */
	public String getComponentId() {
		return componentId;
	}

	/**
	 * @return the componentName
	 */
	public String getComponentName() {
		return componentName;
	}

	/**
	 * @return the componentCategory
	 */
	public ComponentCategory getComponentCategory() {
		return componentCategory;
	}

	/**
	 * @return the componentImplementationJavaClass
	 */
	public String getComponentImplementationJavaClass() {
		return componentImplementationJavaClass;
	}

	/**
	 * @return the communicationProviderImplementationJavaClass
	 */
	public String getCommunicationProviderImplementationJavaClass() {
		return communicationProviderImplementationJavaClass;
	}

	/**
	 * @return the communicationProviderConnectionString
	 */
	public String getCommunicationProviderConnectionString() {
		return communicationProviderConnectionString;
	}

	/**
	 * @return the inChannelName
	 */
	public String getInChannelName() {
		return inChannelName;
	}

	/**
	 * @return the outChannelName
	 */
	public String getOutChannelName() {
		return outChannelName;
	}

	/**
	 * @return the externalConnectionString
	 */
	public String getExternalConnectionString() {
		return externalConnectionString;
	}

	public static class Builder {
		private String componentId;
		private String componentName;
		private ComponentCategory componentCategory = ComponentCategory.NONE;
		private String componentImplementationJavaClass;
		private String communicationProviderImplementationJavaClass;
		private String communicationProviderConnectionString;
		private String inChannelName;
		private String outChannelName;
		private String externalConnectionString;

		public Builder componentId(String componentId) {
			this.componentId = componentId;
			return this;
		}

		public Builder componentName(String componentName) {
			this.componentName = componentName;
			return this;
		}

		public Builder componentCategory(ComponentCategory componentCategory) {
			this.componentCategory = componentCategory;
			return this;
		}

		public Builder componentImplementationJavaClass(String componentImplementationJavaClass) {
			this.componentImplementationJavaClass = componentImplementationJavaClass;
			return this;
		}

		public Builder communicationProviderImplementationJavaClass(
				String communicationProviderImplementationJavaClass) {
			this.communicationProviderImplementationJavaClass = communicationProviderImplementationJavaClass;
			return this;
		}

		public Builder communicationProviderConnectionString(String communicationProviderConnectionString) {
			this.communicationProviderConnectionString = communicationProviderConnectionString;
			return this;
		}

		public Builder inChannelName(String inChannelName) {
			this.inChannelName = inChannelName;
			return this;
		}

		public Builder outChannelName(String outChannelName) {
			this.outChannelName = outChannelName;
			return this;
		}

		public Builder externalConnectionString(String externalConnectionString) {
			this.externalConnectionString = externalConnectionString;
			return this;
		}

		public ComponentConfiguration build() {
			return new ComponentConfiguration(this);
		}
	}

	private ComponentConfiguration(Builder builder) {
		this.componentId = builder.componentId;
		this.componentName = builder.componentName;
		this.componentCategory = builder.componentCategory;
		this.componentImplementationJavaClass = builder.componentImplementationJavaClass;
		this.communicationProviderImplementationJavaClass = builder.communicationProviderImplementationJavaClass;
		this.communicationProviderConnectionString = builder.communicationProviderConnectionString;
		this.inChannelName = builder.inChannelName;
		this.outChannelName = builder.outChannelName;
		this.externalConnectionString = builder.externalConnectionString;
	}
}
