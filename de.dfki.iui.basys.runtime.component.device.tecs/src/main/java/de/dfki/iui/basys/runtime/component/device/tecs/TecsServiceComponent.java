package de.dfki.iui.basys.runtime.component.device.tecs;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;
import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.DeviceControllerServiceComponent;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;
import de.dfki.tecs.ps.PSClient;

public class TecsServiceComponent extends ServiceComponent{

	protected TSocket socket;
	protected TProtocol protocol;
	protected String host;
	protected int port;
	protected PSClient psClient;
	
	public TecsServiceComponent(ComponentConfiguration config) {
		super(config);
	}

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
	
	protected void open() throws TTransportException {
		protocol.getTransport().open();
	}

	// close communication to TECS
	protected void close() {
		protocol.getTransport().close();
	}
	
	
//	@Override
//	public Response handleRequest(Channel channel, Request req) {
//		String payload = req.getPayload();
//		try {
//			EObject obj = JsonUtils.fromString(payload, EObject.class);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		Response response = CommFactory.getInstance().createResponse(req.getId(), payload);
//		return response;
//	}
}
