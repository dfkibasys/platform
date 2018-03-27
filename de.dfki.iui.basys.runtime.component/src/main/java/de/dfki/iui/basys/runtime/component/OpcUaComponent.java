package de.dfki.iui.basys.runtime.component;

import static java.util.Arrays.asList;
import static java.util.Collections.nCopies;
import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;
import static org.eclipse.milo.opcua.stack.core.util.ConversionUtil.l;

import java.io.File;
import java.util.ArrayList;
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
import org.eclipse.milo.opcua.stack.core.UaException;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.CallMethodRequest;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;

import de.dfki.iui.basys.runtime.component.opcua.KeyStoreLoader;
import de.dfki.iui.basys.runtime.component.opcua.OpcUaException;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;

public class OpcUaComponent extends DeviceComponent {

	public static final String HOST = System.getProperty("opcua.host", "localhost");
	public static final int PORT = Integer.getInteger("opcua.port", 4841);

	protected OpcUaClient opcuaClient;
	protected SecurityPolicy opcuaSecurityPolicy = SecurityPolicy.None;
	protected IdentityProvider opcuaIdentityProvider = AnonymousProvider.INSTANCE;

	public OpcUaComponent(String id) {
		super(id);
	}

	public OpcUaComponent(ComponentConfiguration config) {
		super(config);
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

	public <T> T readValue(final NodeId nodeId) throws OpcUaException {
		CompletableFuture<DataValue> cf = opcuaClient.readValue(0, TimestampsToReturn.Both, nodeId);
		try {
			return (T) cf.get().getValue().getValue();
		} catch (InterruptedException | ExecutionException e) {
			throw new OpcUaException(e);
		}
	}

	public <T> List<T> readValues(final List<NodeId> nodeIds) throws OpcUaException {
		CompletableFuture<List<DataValue>> cf = opcuaClient.readValues(0, TimestampsToReturn.Both, nodeIds);
		try {
			List<T> result = new ArrayList<T>(nodeIds.size());
			final List<DataValue> values = cf.get();
			values.forEach(val -> result.add((T) val.getValue().getValue()));
			return result;
		} catch (InterruptedException | ExecutionException e) {
			throw new OpcUaException(e);
		}
	}

	protected StatusCode writeValue(final NodeId nodeId, final Object value) throws OpcUaException {
		CompletableFuture<StatusCode> cf = opcuaClient.writeValue(nodeId, new DataValue(new Variant(value)));
		try {
			StatusCode result = cf.get();
			return result;
		} catch (InterruptedException | ExecutionException e) {
			throw new OpcUaException(e);
		}
	}

	protected List<StatusCode> writeValues(final List<NodeId> nodeIds, final List<Object> values)
			throws OpcUaException {
		List<DataValue> val = new ArrayList<DataValue>(values.size());
		CompletableFuture<List<StatusCode>> cf = opcuaClient.writeValues(nodeIds, val);
		try {
			List<StatusCode> result = cf.get();
			return result;
		} catch (InterruptedException | ExecutionException e) {
			throw new OpcUaException(e);
		}
	}

	public <T> T invokeMethod(final NodeId objectNode, final NodeId methodNode, final Object... inputs) throws OpcUaException  {
		try {
			return (T) _invokeMethod(objectNode, methodNode, inputs).get();
		} catch (InterruptedException | ExecutionException e) {
			throw new OpcUaException(e);
		}
	}
	
	public <T> CompletableFuture<T> _invokeMethod(final NodeId objectNode, final NodeId methodNode, final Object... inputs) {

		Variant[] inVariants = new Variant[inputs.length];
		for (int i = 0; i < inputs.length; i++) {
			inVariants[i] = new Variant(inputs[i]);
		}
		final CallMethodRequest request = new CallMethodRequest(objectNode, methodNode, inVariants);

		return opcuaClient.call(request).thenCompose(result -> {
			final StatusCode statusCode = result.getStatusCode();

			if (statusCode.isGood()) {
				final T value = (T) l(result.getOutputArguments()).get(0).getValue();
				return CompletableFuture.completedFuture(value);
			} else {
				final CompletableFuture<T> f = new CompletableFuture<>();
				f.completeExceptionally(new UaException(statusCode));
				return f;
			}
		});
	}

	/*
	 * default ActiveStatesHandler implementation -> trigger logic on device
	 */

	@Override
	public void onResetting() {
		LOGGER.info("onResetting");

	}

	@Override
	public void onStarting() {
		LOGGER.info("onResetting");

	}

	@Override
	public void onExecute() {
		LOGGER.info("onResetting");

	}

	@Override
	public void onCompleting() {
		LOGGER.info("onResetting");

	}

	@Override
	public void onHolding() {
		LOGGER.info("onResetting");

	}

	@Override
	public void onUnholding() {
		LOGGER.info("onResetting");

	}

	@Override
	public void onSuspending() {
		LOGGER.info("onResetting");

	}

	@Override
	public void onUnsuspending() {
		LOGGER.info("onResetting");

	}

	@Override
	public void onAborting() {
		LOGGER.info("onResetting");

	}

	@Override
	public void onClearing() {
		LOGGER.info("onResetting");

	}

	@Override
	public void onStopping() {
		LOGGER.info("onResetting");

	}

}
