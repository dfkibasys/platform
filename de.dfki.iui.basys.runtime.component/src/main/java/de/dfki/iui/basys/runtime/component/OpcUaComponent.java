package de.dfki.iui.basys.runtime.component;

import static java.util.Arrays.asList;
import static java.util.Collections.nCopies;
import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfig;
import org.eclipse.milo.opcua.sdk.client.api.identity.AnonymousProvider;
import org.eclipse.milo.opcua.sdk.client.api.identity.IdentityProvider;
import org.eclipse.milo.opcua.stack.client.UaTcpStackClient;
import org.eclipse.milo.opcua.stack.core.AttributeId;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;

import de.dfki.iui.basys.runtime.component.opcua.KeyStoreLoader;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;

public class OpcUaComponent extends DeviceComponent {

	public static final String HOST = System.getProperty("opcua.host", "localhost");
	public static final int PORT = Integer.getInteger("opcua.port", 4841);

	protected OpcUaClient opcuaClient;
	protected SecurityPolicy opcuaSecurityPolicy = SecurityPolicy.None;
	protected IdentityProvider opcuaIdentityProvider = AnonymousProvider.INSTANCE;

	public OpcUaComponent(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public OpcUaComponent(String id, ServiceRegistry registry) {
		super(id, registry);
		// TODO Auto-generated constructor stub
	}

	// TODO: Code for communicating with the actual device, here via OPC-UA.

	@Override
	public void connectToDevice() {
		this.deviceConnectionString = String.format("opc.tcp://%s:%s", HOST, PORT);
		super.connectToDevice();

		try {
			opcuaClient = createClient();
			opcuaClient.connect().whenComplete((c, ex) -> this.connectedToDevice = true).get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void disconnectFromDevice() {
		try {
			opcuaClient.disconnect().whenComplete((c, ex) -> this.connectedToDevice = false).get();
			opcuaClient = null;
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		super.disconnectFromDevice();
	}

	public SecurityPolicy getSecurityPolicy() {
		return opcuaSecurityPolicy;
	}

	public void setSecurityPolicy(SecurityPolicy opcuaSecurityPolicy) {
		this.opcuaSecurityPolicy = opcuaSecurityPolicy;
	}

	public IdentityProvider getIdentityProvider() {
		return opcuaIdentityProvider;
	}

	public void setIdentityProvider(IdentityProvider opcuaIdentityProvider) {
		this.opcuaIdentityProvider = opcuaIdentityProvider;
	}

	private OpcUaClient createClient() throws Exception {
		File securityTempDir = new File(System.getProperty("java.io.tmpdir"), "security");
		if (!securityTempDir.exists() && !securityTempDir.mkdirs()) {
			throw new Exception("unable to create security dir: " + securityTempDir);
		}
		LOGGER.info("security temp dir: {}", securityTempDir.getAbsolutePath());

		KeyStoreLoader loader = new KeyStoreLoader().load(securityTempDir);

		SecurityPolicy securityPolicy = getSecurityPolicy();

		EndpointDescription[] endpoints;

		try {
			endpoints = UaTcpStackClient.getEndpoints(deviceConnectionString).get();
		} catch (Throwable ex) {
			// try the explicit discovery endpoint as well
			String discoveryUrl = deviceConnectionString + "/discovery";
			LOGGER.info("Trying explicit discovery URL: {}", discoveryUrl);
			endpoints = UaTcpStackClient.getEndpoints(discoveryUrl).get();
		}

		EndpointDescription endpoint = Arrays.stream(endpoints)
				.filter(e -> e.getSecurityPolicyUri().equals(securityPolicy.getSecurityPolicyUri())).findFirst()
				.orElseThrow(() -> new Exception("no desired endpoints returned"));

		LOGGER.info("Using endpoint: {} [{}]", endpoint.getEndpointUrl(), securityPolicy);

		OpcUaClientConfig config = OpcUaClientConfig.builder()
				.setApplicationName(LocalizedText.english("eclipse milo opc-ua client"))
				.setApplicationUri("urn:eclipse:milo:examples:client").setCertificate(loader.getClientCertificate())
				.setKeyPair(loader.getClientKeyPair()).setEndpoint(endpoint).setIdentityProvider(getIdentityProvider())
				.setRequestTimeout(uint(5000)).build();

		return new OpcUaClient(config);
	}

	
	public <T> T readValue(final NodeId nodeId) {
		CompletableFuture<DataValue> cf = read(nodeId);
		try {
			return (T) cf.get().getValue().getValue();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	protected CompletableFuture<DataValue> read(final NodeId nodeId) {
		return opcuaClient.readValue(0, TimestampsToReturn.Both, nodeId);
	}
	
	protected CompletableFuture<List<DataValue>> read(final NodeId... nodeIds) {
		return opcuaClient.readValues(0, TimestampsToReturn.Both, asList(nodeIds));
	}

	protected CompletableFuture<List<DataValue>> read(final AttributeId attributeId, final NodeId... nodeIds) {
		return opcuaClient.read(0, TimestampsToReturn.Both, asList(nodeIds), nCopies(nodeIds.length, attributeId.uid()));
	}

	/*
	 * default ActiveStatesHandler implementation -> trigger logic on device
	 */

	@Override
	public void onResetting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStarting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onExecute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onCompleting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onHolding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUnholding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSuspending() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUnsuspending() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAborting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClearing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStopping() {
		// TODO Auto-generated method stub

	}

}
