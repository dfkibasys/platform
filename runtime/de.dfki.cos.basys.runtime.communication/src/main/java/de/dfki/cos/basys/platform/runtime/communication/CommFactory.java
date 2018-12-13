package de.dfki.cos.basys.platform.runtime.communication;

import de.dfki.cos.basys.platform.model.runtime.communication.Authentication;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationFactory;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationProvider;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.CommunicationException;
import de.dfki.cos.basys.platform.runtime.communication.provider.JmsCommunicationProvider;
import de.dfki.cos.basys.platform.runtime.communication.provider.MqttCommunicationProvider;
import de.dfki.cos.basys.platform.runtime.communication.provider.WsCommunicationProvider;

public class CommFactory {

	private static CommFactory _instance;

	public static CommFactory getInstance() {
		if (_instance == null)
			_instance = new CommFactory();
		return _instance;
	}

	protected CommFactory() {
	}

	public Notification createNotification(String payload) {
		Notification not = CommunicationFactory.eINSTANCE.createNotification();
		not.setPayload(payload);
		return not;
	}

	public Request createRequest(String payload) {
		Request req = CommunicationFactory.eINSTANCE.createRequest();
		req.setPayload(payload);
		return req;
	}

	public Response createResponse(String requestId, String payload) {
		Response res = CommunicationFactory.eINSTANCE.createResponse();
		res.setRequestId(requestId);
		res.setPayload(payload);
		return res;
	}

	public Authentication createAuthentication(String username, String password, String cert) {
		Authentication auth = CommunicationFactory.eINSTANCE.createAuthentication();
		auth.setUsername(username);
		auth.setPassword(password);
		auth.setCertificate(cert);
		return auth;
	}

	public Client createClient(String name, Authentication auth) {
		Client client = CommunicationFactory.eINSTANCE.createClient();
		// client.setId(id);
		client.setName(name);
		client.setAuthentication(auth);
		return client;
	}

	public ChannelPool createChannelPool(String uri, CommunicationProvider provider) {
		ChannelPool pool = CommunicationFactory.eINSTANCE.createChannelPool();
		pool.setUri(uri);
		pool.setProvider(provider);
		return pool;
	}

	public ChannelPool connectChannelPool(Client client, String uri, CommunicationProvider provider) {
		ChannelPool pool = createChannelPool(uri, provider);
		client.getPools().add(pool);
		pool.connect();

		return pool;
	}

	public ChannelPool createChannelPool(String uri, String communicationProviderImplementationJavaClass) {
		Class c = null;
		try {
			c = Class.forName(communicationProviderImplementationJavaClass);
		} catch (ClassNotFoundException e) {
			throw new CommunicationException(e);
		}

		CommunicationProvider provider;
		try {
			provider = (CommunicationProvider) c.newInstance();
			return createChannelPool(uri, provider);
		} catch (InstantiationException | IllegalAccessException e) {
			throw new CommunicationException(e);
		}
	}

	public ChannelPool connectChannelPool(Client client, String uri, String communicationProviderImplementationJavaClass) {
		ChannelPool pool = createChannelPool(uri, communicationProviderImplementationJavaClass);
		client.getPools().add(pool);
		pool.connect();

		return pool;
	}

	public ChannelPool createJmsChannelPool(String uri) {
		CommunicationProvider provider = new JmsCommunicationProvider();
		return createChannelPool(uri, provider);
	}

	public ChannelPool connectJmsChannelPool(Client client, String uri) {
		CommunicationProvider provider = new JmsCommunicationProvider();
		return connectChannelPool(client, uri, provider);
	}

	public ChannelPool createMqttChannelPool(String uri) {
		CommunicationProvider provider = new MqttCommunicationProvider();
		return createChannelPool(uri, provider);
	}

	public ChannelPool connectMqttChannelPool(Client client, String uri) {
		CommunicationProvider provider = new MqttCommunicationProvider();
		return connectChannelPool(client, uri, provider);
	}

	public ChannelPool createWsChannelPool(String uri) {
		CommunicationProvider provider = new WsCommunicationProvider();
		return createChannelPool(uri, provider);
	}

	public ChannelPool connectWsChannelPool(Client client, String uri) {
		CommunicationProvider provider = new WsCommunicationProvider();
		return connectChannelPool(client, uri, provider);
	}

	public Channel createChannel(String name, boolean queued, ChannelListener listener) {
		Channel channel = CommunicationFactory.eINSTANCE.createChannel();
		// channel.setId(id);
		channel.setName(name);
		channel.setQueued(queued);
		channel.setListener(listener);
		return channel;
	}

	public Channel openChannel(ChannelPool pool, String name, boolean queued, ChannelListener listener) {

//		Channel channel = pool.getChannelByName(name);
//		if (channel == null) {
//			channel = createChannel(name, queued, listener);
//			pool.getChannels().add(channel);
//		}
		Channel channel = createChannel(name, queued, listener);
		pool.getChannels().add(channel);
		channel.open();

		return channel;
	}

	public String createResponseTopic(Request req) {
		return "response#" + req.getId();
	}

}
