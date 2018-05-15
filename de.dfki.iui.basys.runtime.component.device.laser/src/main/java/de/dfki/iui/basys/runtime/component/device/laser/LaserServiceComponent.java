package de.dfki.iui.basys.runtime.component.device.laser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.data.CartesianCoordinate;
import de.dfki.iui.basys.model.data.DataPackage;
import de.dfki.iui.basys.model.data.Path;
import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;
import de.dfki.iui.basys.model.domain.capability.ProjectETA;
import de.dfki.iui.basys.model.domain.capability.ProjectPath;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.DeviceControllerServiceComponent;

public class LaserServiceComponent extends DeviceControllerServiceComponent {

	Channel mirOut;
	ExecutorService executor;

	public LaserServiceComponent(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	private void stopDevice() {
		if (device.getState() != State.IDLE) {
			device.stop();

			while (device.getState() != State.IDLE) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		super.activate(context);

		executor = Executors.newCachedThreadPool();

		mirOut = ClientFactory.getInstance().openChannel(context.getSharedChannelPool(), "mir-component#out", false,
				new ChannelListener() {

					@Override
					public Response handleRequest(Channel channel, Request req) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public void handleNotification(Channel channel, Notification not) {

						CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

						executor.submit(() -> {

							try {
								EObject payload = JsonUtils.fromString(not.getPayload(), EObject.class);

								if (payload.eClass().equals(DataPackage.eINSTANCE.getPath())) {

									stopDevice();

									Path path = (Path) payload;
									List<CartesianCoordinate> completePath = new ArrayList<>();
									completePath.addAll(path.getCoordinates());

									if (path.getEta() > 60000) {

										ProjectPath capability = CapabilityFactory.eINSTANCE.createProjectPath();
										path.getCoordinates().clear();
										path.getCoordinates().addAll(completePath.subList(0, 5));

										capability.setPath(path);
										capability.setDelay(1000);
										capability.setArrowCount(3);
										capability.setColor(0);

										ComponentRequestStatus status = device.executeCapability(capability);
									}
									Thread t = new Thread(new Runnable() {

										@Override
										public void run() {
											try {
												Thread.sleep(5000);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											stopDevice();

											try {
												Thread.sleep(path.getEta() - 55000);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											ProjectETA etaCap = CapabilityFactory.eINSTANCE.createProjectETA();
											etaCap.setEta(60000);
											etaCap.setPosition(
													path.getCoordinates().get(path.getCoordinates().size() - 1));
											etaCap.setRadius(.3);
											etaCap.setColor(0);
											ComponentRequestStatus status = device.executeCapability(etaCap);
											try {
												Thread.sleep(45000);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											stopDevice();
											ProjectPath capability = CapabilityFactory.eINSTANCE.createProjectPath();
											path.getCoordinates().clear();
											path.getCoordinates().addAll(
													completePath.subList(completePath.size() - 5, completePath.size()));
											capability.setPath(path);
											capability.setDelay(1000);
											capability.setArrowCount(3);
											capability.setColor(0);

											status = device.executeCapability(capability);

										}
									});
									t.start();

								}

							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							cf.complete(true);
							return null;
						});

					}

					@Override
					public void handleMessage(Channel channel, String msg) {
						// TODO Auto-generated method stub

					}
				});

	}

	@Override
	public void deactivate() throws ComponentException {
		// TODO Auto-generated method stub
		super.deactivate();

		try {
			System.out.println("attempt to shutdown executor");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println("tasks interrupted");
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("cancel non-finished tasks");
			}
			executor.shutdownNow();
			System.out.println("shutdown finished");
		}
	}

	@Override
	public void handleNotification(Channel channel, Notification not) {

	}

	@Override
	public Response handleRequest(Channel channel, Request req) {
		return super.handleRequest(channel, req);
	}

}
