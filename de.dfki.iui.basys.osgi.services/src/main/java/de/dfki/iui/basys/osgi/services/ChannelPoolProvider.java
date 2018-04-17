package de.dfki.iui.basys.osgi.services;

import de.dfki.iui.basys.model.runtime.communication.ChannelPool;

public interface ChannelPoolProvider {
	ChannelPool getSharedChannelPool();
}
