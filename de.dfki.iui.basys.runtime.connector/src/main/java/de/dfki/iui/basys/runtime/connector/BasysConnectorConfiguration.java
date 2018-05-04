package de.dfki.iui.basys.runtime.connector;

import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;

public class BasysConnectorConfiguration extends ComponentConfigurationImpl {

	private int caaResourceId;
	private String caaInTopic;
	private String caaOutTopic;

	/**
	 * @return the caaResourceId
	 */
	public int getCaaResourceId() {
		return caaResourceId;
	}

	/**
	 * @return the caaInTopic
	 */
	public String getCaaInTopic() {
		return caaInTopic;
	}

	/**
	 * @return the caaOutTopic
	 */
	public String getCaaOutTopic() {
		return caaOutTopic;
	}
	
	public static class Builder extends ComponentConfigurationImpl.Builder {
		private int caaResourceId;
		private String caaInTopic;
		private String caaOutTopic;

		public Builder caaResourceId(int caaResourceId) {
			this.caaResourceId = caaResourceId;
			return this;
		}

		public Builder caaInTopic(String caaInTopic) {
			this.caaInTopic = caaInTopic;
			return this;
		}

		public Builder caaOutTopic(String caaOutTopic) {
			this.caaOutTopic = caaOutTopic;
			return this;
		}
		
		@Override
		public BasysConnectorConfiguration build() {
			return new BasysConnectorConfiguration(this);
		}
	}

	protected BasysConnectorConfiguration(Builder builder) {
		super(builder);
		this.caaResourceId = builder.caaResourceId;
		this.caaInTopic = builder.caaInTopic;
		this.caaOutTopic = builder.caaOutTopic;
	}
}
