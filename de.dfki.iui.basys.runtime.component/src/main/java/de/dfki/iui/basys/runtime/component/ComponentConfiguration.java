package de.dfki.iui.basys.runtime.component;

public class ComponentConfiguration {
	
	public enum CommunicationProviderEnum { NONE, MQTT, JMS }
	

	private CommunicationProviderEnum communicationProvider = CommunicationProviderEnum.JMS;
	private String id;
	private String basysConnectionString;
	private String implementationJavaClass;
	private String deviceConnectionString;

	private String inChannel;
	private String outChannel;
	
	/**
	 * @return the communicationProvider
	 */
	public CommunicationProviderEnum getCommunicationProvider() {
		return communicationProvider;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @return the basysConnectionString
	 */
	public String getBasysConnectionString() {
		return basysConnectionString;
	}
	
	/**
	 * @return the implementationJavaClass
	 */
	public String getImplementationJavaClass() {
		return implementationJavaClass;
	}
	
	/**
	 * @return the deviceConnectionString
	 */
	public String getDeviceConnectionString() {
		return deviceConnectionString;
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
	 * @param communicationProvider the communicationProvider to set
	 * @return the ComponentConfiguration instance
	 */
	public ComponentConfiguration setCommunicationProvider(CommunicationProviderEnum communicationProvider) {
		this.communicationProvider = communicationProvider;
		return this;
	}

	/**
	 * @param id the id to set
	 * @return the ComponentConfiguration instance
	 */
	public ComponentConfiguration setId(String id) {
		this.id = id;
		this.inChannel = id + "#in";
		this.outChannel = id + "#out";
		return this;
	}
	
	/**
	 * @param basysConnectionString the basysConnectionString to set
	 * @return the ComponentConfiguration instance
	 */
	public ComponentConfiguration setBasysConnectionString(String basysConnectionString) {
		this.basysConnectionString = basysConnectionString;
		return this;
	}
	
	/**
	 * @param implementationJavaClass the implementationJavaClass to set
	 * @return the ComponentConfiguration instance
	 */
	public ComponentConfiguration setImplementationJavaClass(String implementationJavaClass) {
		this.implementationJavaClass = implementationJavaClass;
		return this;
	}
	
	/**
	 * @param deviceConnectionString the deviceConnectionString to set
	 * @return the ComponentConfiguration instance
	 */
	public ComponentConfiguration setDeviceConnectionString(String deviceConnectionString) {
		this.deviceConnectionString = deviceConnectionString;
		return this;
	}

	/**
	 * @param inChannel the inChannel to set
	 * @return the ComponentConfiguration instance
	 */
	public ComponentConfiguration setInChannel(String inChannel) {
		this.inChannel = inChannel;
		return this;
	}

	/**
	 * @param outChannel the outChannel to set
	 * @return the ComponentConfiguration instance
	 */
	public ComponentConfiguration setOutChannel(String outChannel) {
		this.outChannel = outChannel;
		return this;
	}

	
}
