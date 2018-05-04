package de.dfki.iui.basys.runtime.component.device.opcua;


import static com.google.common.collect.Lists.newArrayList;
import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;
import static org.eclipse.milo.opcua.stack.core.util.ConversionUtil.l;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfig;
import org.eclipse.milo.opcua.sdk.client.api.identity.AnonymousProvider;
import org.eclipse.milo.opcua.sdk.client.api.identity.IdentityProvider;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaMonitoredItem;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaSubscription;
import org.eclipse.milo.opcua.stack.client.UaTcpStackClient;
import org.eclipse.milo.opcua.stack.core.AttributeId;
import org.eclipse.milo.opcua.stack.core.UaException;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.enumerated.MonitoringMode;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.CallMethodRequest;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoredItemCreateRequest;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoringParameters;
import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.AsyncDeviceComponent;

public class OpcUaDeviceComponent extends AsyncDeviceComponent {

	protected OpcUaClient opcuaClient;
	protected SecurityPolicy opcuaSecurityPolicy = SecurityPolicy.None;
	protected IdentityProvider opcuaIdentityProvider = AnonymousProvider.INSTANCE;

    private final AtomicLong clientHandles = new AtomicLong(1L);
    
	public OpcUaDeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	// TODO: Code for communicating with the actual device, here via OPC-UA.

	@Override
	public void connectToExternal() throws ComponentException {
		try {
			opcuaClient = createClient(componentConfig.getExternalConnectionString());
			//opcuaClient.connect().whenComplete((c, ex) -> this.isConnectedToExternal() = true).get();
			opcuaClient.connect().get();
		} catch (Exception  e) {
			throw new ComponentException(e);
		}
	}

	@Override
	public void disconnectFromExternal() {
		try {
			//opcuaClient.disconnect().whenComplete((c, ex) -> this.connectedToDevice = false).get();
			opcuaClient.disconnect().get();
			opcuaClient = null;
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	private OpcUaClient createClient(String connectionString) throws Exception {
		File securityTempDir = new File(System.getProperty("java.io.tmpdir"), "security");
		if (!securityTempDir.exists() && !securityTempDir.mkdirs()) {
			throw new Exception("unable to create security dir: " + securityTempDir);
		}
		LOGGER.info("security temp dir: {}", securityTempDir.getAbsolutePath());

		KeyStoreLoader loader = new KeyStoreLoader().load(securityTempDir);

		SecurityPolicy securityPolicy = getSecurityPolicy();

		EndpointDescription[] endpoints;

		try {
			endpoints = UaTcpStackClient.getEndpoints(connectionString).get();
		} catch (Throwable ex) {
			// try the explicit discovery endpoint as well
			String discoveryUrl = connectionString + "/discovery";
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

//	public <T> T invokeVoidMethod(final NodeId objectNode, final NodeId methodNode, final Object... inputs) throws OpcUaException  {
//		try {
//			return (T) _invokeMethod(objectNode, methodNode, inputs).get();
//		} catch (InterruptedException | ExecutionException e) {
//			throw new OpcUaException(e);
//		}
//	}
	
	
	public <T> CompletableFuture<T> _invokeMethod(final NodeId objectNode, final NodeId methodNode, final Object... inputs) {

		Variant[] inVariants = new Variant[inputs.length];
		for (int i = 0; i < inputs.length; i++) {
			inVariants[i] = new Variant(inputs[i]);
		}
		final CallMethodRequest request = new CallMethodRequest(objectNode, methodNode, inVariants);

		return opcuaClient.call(request).thenCompose(result -> {
			final StatusCode statusCode = result.getStatusCode();

			if (statusCode.isGood()) {
				if (result.getOutputArguments() != null && result.getOutputArguments().length > 0) {				
					final T value = (T) l(result.getOutputArguments()).get(0).getValue();
					return CompletableFuture.completedFuture(value);
				} else {
					return CompletableFuture.completedFuture(null);
				}
			} else {
				final CompletableFuture<T> f = new CompletableFuture<>();
				f.completeExceptionally(new UaException(statusCode));
				return f;
			}
		});
	}

//	public CompletableFuture<Void> _invokeVoidMethod(final NodeId objectNode, final NodeId methodNode, final Object... inputs) {
//
//		Variant[] inVariants = new Variant[inputs.length];
//		for (int i = 0; i < inputs.length; i++) {
//			inVariants[i] = new Variant(inputs[i]);
//		}
//		final CallMethodRequest request = new CallMethodRequest(objectNode, methodNode, inVariants);
//
//		return opcuaClient.call(request).thenCompose(result -> {
//			final StatusCode statusCode = result.getStatusCode();
//
//			if (statusCode.isGood()) {
//				return CompletableFuture.completedFuture(null);
//			} else {
//				final CompletableFuture<Void> f = new CompletableFuture<>();
//				f.completeExceptionally(new UaException(statusCode));
//				return f;
//			}
//		});
//	}

	
    public void subscribeToValue(NodeId node) throws Exception {
  

        // create a subscription @ 1000ms
        UaSubscription subscription = opcuaClient.getSubscriptionManager().createSubscription(1000.0).get();

        // subscribe to the Value attribute of the server's CurrentTime node
        ReadValueId readValueId = new ReadValueId(
            node,
            AttributeId.Value.uid(), null, QualifiedName.NULL_VALUE);

        // important: client handle must be unique per item
        UInteger clientHandle = uint(clientHandles.getAndIncrement());

        MonitoringParameters parameters = new MonitoringParameters(
            clientHandle,
            1000.0,     // sampling interval
            null,       // filter, null means use default
            uint(10),   // queue size
            true        // discard oldest
        );

        MonitoredItemCreateRequest request = new MonitoredItemCreateRequest(
            readValueId, MonitoringMode.Reporting, parameters);

        // when creating items in MonitoringMode.Reporting this callback is where each item needs to have its
        // value/event consumer hooked up. The alternative is to create the item in sampling mode, hook up the
        // consumer after the creation call completes, and then change the mode for all items to reporting.
        BiConsumer<UaMonitoredItem, Integer> onItemCreated =
            (item, id) -> item.setValueConsumer(this::onSubscriptionValue);

        List<UaMonitoredItem> items = subscription.createMonitoredItems(
            TimestampsToReturn.Both,
            newArrayList(request),
            onItemCreated
        ).get();

        for (UaMonitoredItem item : items) {
            if (item.getStatusCode().isGood()) {
                LOGGER.info("item created for nodeId={}", item.getReadValueId().getNodeId());
            } else {
                LOGGER.warn(
                    "failed to create item for nodeId={} (status={})",
                    item.getReadValueId().getNodeId(), item.getStatusCode());
            }
        }

    }

    protected void onSubscriptionValue(UaMonitoredItem item, DataValue value) {
        LOGGER.info(
                "subscription value received: item={}, value={}",
                item.getReadValueId().getNodeId(), value.getValue());
        
        System.out.println("subscription value received: item="+ item.getReadValueId().getNodeId() + ", value=" + value.getValue() + " (" + getState() + ")");
    }
	
	
	
	
	
	
	
	
	

}
