package de.dfki.iui.basys.runtime.component.device.tecs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.tecs.Event;
import de.dfki.tecs.ps.PSClient;

public abstract class TecsDeviceComponent extends DeviceComponent {
	
	public TecsDeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	// TODO: Code for communicating with the actual device, here via TECS.
	// Could also be done in some kind of "IntegrationProvider" implementation.

	protected TSocket socket;
	protected TProtocol protocol;
	protected String host;
	protected int port;
	protected PSClient psClient;
	
	@Override
	public void connectToExternal() throws ComponentException {
		String patternString = "tecs.tcp:\\/\\/(?<host>.*):(?<port>\\d*)";

		Pattern pattern = Pattern.compile(patternString);

		Matcher matcher = pattern.matcher(componentConfig.getExternalConnectionString());
		boolean matches = matcher.matches();
		if (!matches) {
			throw new ComponentException("Invalid external connection string! " + componentConfig.getExternalConnectionString() + " does not match the expected pattern " + patternString);
		}

		host = matcher.group("host");
		port = Integer.parseInt(matcher.group("port"));

		socket = new TSocket(host, port);
		protocol = new TBinaryProtocol(socket);

		try {
			open();
		} catch (TTransportException e) {
			throw new ComponentException("Could not open the protocol!", e);
		}
	}
	
	/*
	 * Connect to Tecs server for publish subscribe.
	 * clientId = the id of the client
	 * subscribeTo = array of events to subscribe.
	 * ip = ip of the tecs server
	 * port = port of the tecs server
	 */
	public void connectToTecs(String clientID, String[] subscribeTo, String ip, int port) {
		if (simulated)
			return;
		
		psClient = new PSClient(clientID, ip, port);
		
		for (String sub: subscribeTo)
			psClient.subscribe(sub);
		
		psClient.connect();
		
		Thread receiverThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					Event e = psClient.recv();
					handleTecsEvent(e);
				}
			}
		});
		
		receiverThread.setDaemon(true);
		receiverThread.start();
	}
	
	protected abstract void handleTecsEvent(Event event);
	
	@Override
	public void disconnectFromExternal() {
		close();
		psClient.disconnect();
	}

	protected void open() throws TTransportException {
		if (!simulated)
			protocol.getTransport().open();
	}

	// close communication to TECS
	protected void close() {
		if (!simulated)
			protocol.getTransport().close();
	}
	
}
