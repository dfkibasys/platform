package de.dfki.cos.basys.platform.osgi.services;

import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;

public interface ChannelPoolProvider {
	ChannelPool getSharedChannelPool();
}
