package de.dfki.iui.basys.runtime.services.worldmodelManager.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;
import de.dfki.iui.basys.model.domain.capability.MoveToLocation;
import de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment;
import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;
import de.dfki.iui.basys.model.domain.linebalancing.StaticWorldModel;
import de.dfki.iui.basys.model.domain.linebalancing.WMPathTime;
import de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes;
import de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance;
import de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance;
import de.dfki.iui.basys.model.domain.linebalancing.WorldModel;
import de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingFactoryImpl;
import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.order.OrderPackage;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.GeneralCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstanceFactory;
import de.dfki.iui.basys.model.domain.topology.TopologyElement;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentFactory;
import de.dfki.iui.basys.model.runtime.component.Property;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.processcontrol.TaskDescription;
import de.dfki.iui.basys.runtime.processcontrol.impl.CamundaTaskScheduler;
import de.dfki.iui.basys.runtime.services.ProductInstanceManager;
import de.dfki.iui.basys.runtime.services.ResourceInstanceManager;
import de.dfki.iui.basys.runtime.services.TopologyManager;
import de.dfki.iui.basys.runtime.services.worldmodelManager.WorldModelManager;

public class WorldModelManagerImpl extends EmfServiceComponent implements WorldModelManager {

	private Map<String, TopologyElement> mCurrentProductPositions = new HashMap<>();
	private long mEta;
	private ExecutorService executor;
	private Client client = ClientBuilder.newClient();

	// TODO
	// CurrentProductPosition

	public WorldModelManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	public static class LinebalancingAnswer {

		@JsonProperty
		private String resourceInstanceId;

	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		super.activate(context);

		// handle ProductMovements

		executor = Executors.newCachedThreadPool();

		CommFactory.getInstance().openChannel(context.getSharedChannelPool(), "order-manager#out", false,
				new ChannelListener() {

					@Override
					public Response handleRequest(Channel channel, Request req) {
						return null;
					}

					@Override
					public void handleNotification(Channel channel, Notification not) {

						CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
						System.out.println(">>>>>>" + not);
						String payl = not.getPayload();
						try {

							// FIXME
							EObject payload = JsonUtils.fromString(payl, EObject.class);

							executor.submit(() -> {

								if (payload.eClass().equals(OrderPackage.eINSTANCE.getOrder())) {

									LinebalancingAnswer lba = client.target("http://10.2.0.81:9001/services/optimizer/")
											.request(MediaType.APPLICATION_JSON).accept("application/json")
											.get(LinebalancingAnswer.class);

									System.out.println("===============================");
									System.out.println(lba.resourceInstanceId);
									System.out.println("===============================");

									LineBalancingAssignment lbass = new LinebalancingFactoryImpl()
											.createLineBalancingAssignment();
									lbass.setResourceInstanceId(lba.resourceInstanceId);
									lbass.setOrder((Order) payload);

									String outPayload = JsonUtils.toString(lbass);
									Notification outNot = CommFactory.getInstance().createNotification(outPayload);
									outChannel.sendNotification(outNot);

									CamundaTaskScheduler cts = (CamundaTaskScheduler) context.getComponentManager()
											.getLocalComponentById("task-scheduler");
									TopologyManager tm = (TopologyManager) context.getComponentManager()
											.getLocalComponentById("topology-manager");

									MoveToLocation moveRequest = CapabilityFactory.eINSTANCE.createMoveToLocation();
									moveRequest.setTargetLocation(tm.getTopologyElement("_zzNG4V2TEeit97PGgoQOAQ"));

									GeneralCapabilityVariant variant = ResourceinstanceFactory.eINSTANCE
											.createGeneralCapabilityVariant();
									variant.setCapability(moveRequest);

									de.dfki.iui.basys.model.runtime.component.CapabilityRequest req = ComponentFactory.eINSTANCE
											.createCapabilityRequest();
									req.setCapabilityVariant(variant);
									req.setComponentId("_rUJzsDJhEei1p5hKOf5Slw");

									TaskDescription task = new TaskDescription(req);
									if (lba.resourceInstanceId.equals("_jJdx4DD7EeiuBvcKgWzd3Q")) {
										cts.scheduleTask(task);
									} else {
										cts.scheduleTask(task, 10000); // TODO fine tuning
									}
								}

								cf.complete(true);
								return null;
							});
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}

					@Override
					public void handleMessage(Channel channel, String msg) {
					}

				});

	}

	@Override
	public WorldModel getCurrentWorld() {

		ProductInstanceManager pim = (ProductInstanceManager) context.getComponentManager()
				.getLocalComponentById("product-instance-manager");
		List<ProductInstance> productInstances = pim.getProductInstanceStore().getProductInstances();

		ResourceInstanceManager rim = (ResourceInstanceManager) context.getComponentManager()
				.getLocalComponentById("resource-instance-manager");

		ResourceInstanceRepository repo = rim.getResourceInstanceRepository();

		List<ResourceInstance> resourceInstances = repo.getResourceInstances();
		WorldModel wm = new LinebalancingFactoryImpl().createWorldModel();

		for (ResourceInstance ri : resourceInstances) {

			switch (ri.getResourceType().getName()) {

			case "MiR 100":

				try {
					ComponentConfiguration avgConfig = context.getComponentManager().getLocalComponentById(ri.getId())
							.getConfig();
					Property sourceProperty = avgConfig.getProperty("sourceLocation");
					TopologyElement source = null;
					if (sourceProperty != null) {
						source = JsonUtils.fromString(sourceProperty.getValue(), TopologyElement.class);
					}

					Property targetProperty = avgConfig.getProperty("targetLocation");
					TopologyElement target = null;
					if (targetProperty != null) {
						target = JsonUtils.fromString(targetProperty.getValue(), TopologyElement.class);
					}

					mEta = 0;
					Property etaProperty = avgConfig.getProperty("estimatedETA");
					if (etaProperty != null) {
						mEta = Long.parseLong(etaProperty.getValue());
					}

					WMResourceInstance wmri = new LinebalancingFactoryImpl().createWMResourceInstance();
					wmri.setSerialId(ri.getId());
					wmri.setFrom_position(source);
					wmri.setTo_position(target);
					wmri.setEta(mEta);
					// Laut Metamodell ist das Feature capabilityApplication ein Containment
					// Feature.
					// Die folgende Zeile führt nun dazu, dass der Inhalt, also die
					// CapabilityApplications
					// ihren Container wechseln. Sie ziehen quasi um und haben leider keine
					// Nachsendeadresse
					// hinterlassen.
					// wmri.getCapabilities().addAll(ri.getCapabilityApplications());
					// darum (Achtung: EcoreUtil wird erst nach einem 'mvn install' gefunden, das
					// Manifest muss neu gebaut werden):
					wmri.getCapabilities().addAll(EcoreUtil.copyAll(ri.getCapabilityApplications()));
					wm.getResourceInstances().add(wmri);

				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case "UR3":

				WMResourceInstance wmri = new LinebalancingFactoryImpl().createWMResourceInstance();
				wmri.setSerialId(ri.getId());
				// siehe oben
				// wmri.getCapabilities().addAll(ri.getCapabilityApplications());
				wmri.getCapabilities().addAll(EcoreUtil.copyAll(ri.getCapabilityApplications()));
				wm.getResourceInstances().add(wmri);
				break;
			}
		}
		TopologyManager tm = (TopologyManager) context.getComponentManager().getLocalComponentById("topology-manager");
		for (ProductInstance pi : productInstances) {
			String serialNumber = pi.getSerialNumber();
			TopologyElement currentPosition = mCurrentProductPositions.get(serialNumber);
			long eta;
			if (currentPosition == null) {
				eta = mEta;
			} else {
				eta = 10000L; // TODO fine tuning
			}
			if (eta <= 0) {
				eta = 1;
			}
			WMProductInstance wmpi = new LinebalancingFactoryImpl().createWMProductInstance();
			wmpi.setSerialId(serialNumber);
			wmpi.setPosition(tm.getTopologyElement("_14ta0V2TEeit97PGgoQOAQ"));
			wmpi.setEta(eta);
			wmpi.setVariant(pi.getManufacturedComponent());
			wmpi.setIn_transit(currentPosition == null);
			wm.getProductInstances().add(wmpi);

		}

		return wm;

	}

	@Override
	public StaticWorldModel getStaticWorld() {

		return getFirstEntity(LinebalancingPackage.eINSTANCE.getStaticWorldModel());

	}

	@Override
	public long getEstimatedETA(TopologyElement sourceLocation, TopologyElement targetLocation) {

		for (WMPathTimes times : getStaticWorld().getPathTimes()) {
			if (times.getFrom().equals(sourceLocation)) {

				for (WMPathTime time : times.getTo()) {
					if (time.getTo().equals(targetLocation)) {
						return time.getTime();
					}
				}
			}
		}
		return -1;
	}

}
