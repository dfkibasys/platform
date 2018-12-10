package de.dfki.cos.basys.platform.runtime.gateway;

public interface Gateway {
	
	public void installOutgoingChannel(String internalChannelName, String externalChannelName);

	public void installIncomingChannel(String externalChannelName, String internalChannelName);
	
}
