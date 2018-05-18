package de.dfki.iui.basys.runtime.component.device.laser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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
import de.dfki.iui.basys.model.data.RobotPositionInformation;
import de.dfki.iui.basys.model.data.impl.CartesianCoordinateImpl;
import de.dfki.iui.basys.model.data.impl.DataFactoryImpl;
import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;
import de.dfki.iui.basys.model.domain.capability.ProjectETA;
import de.dfki.iui.basys.model.domain.capability.ProjectPath;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.DeviceControllerServiceComponent;

public class LaserServiceComponent extends DeviceControllerServiceComponent {

	Channel mirOut;
	ExecutorService executor;
	List<CartesianCoordinate> mPath;
	CartesianCoordinate mMIRPosition;

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

	private static double getDistance(CartesianCoordinate cc1, CartesianCoordinate cc2) {
		return Math.sqrt(Math.pow((cc2.getX() - cc1.getX()), 2) + Math.pow((cc2.getY() - cc1.getY()), 2)
				+ Math.pow((cc2.getZ() - cc1.getZ()), 2));
	}

	private static double getLength(CartesianCoordinate cc) {
		return Math.sqrt(Math.pow(cc.getX(), 2) + Math.pow(cc.getY(), 2) + Math.pow(cc.getZ(), 2));
	}

	private static CartesianCoordinate getDirectionVector(CartesianCoordinate cc1, CartesianCoordinate cc2) {

		return new CartesianCoordinateImpl.Builder().x(cc2.getX() - cc1.getX()).y(cc2.getY() - cc1.getY())
				.z(cc2.getZ() - cc1.getZ()).build();
	}

	private static CartesianCoordinate norm(CartesianCoordinate cc) {
		double length = getLength(cc);
		return new CartesianCoordinateImpl.Builder().x(cc.getX() / length).y(cc.getY() / length).z(cc.getZ() / length)
				.build();
	}

	private static CartesianCoordinate scalarProduct(CartesianCoordinate cc, double scalar) {
		return new CartesianCoordinateImpl.Builder().x(cc.getX() * scalar).y(cc.getY() * scalar).z(cc.getZ() * scalar)
				.build();
	}

	private static CartesianCoordinate add(CartesianCoordinate cc1, CartesianCoordinate cc2) {
		return new CartesianCoordinateImpl.Builder().x(cc1.getX() + cc2.getX()).y(cc1.getY() + cc2.getY())
				.z(cc1.getZ() + cc2.getZ()).build();
	}

	private static List<CartesianCoordinate> beautifyPath(List<CartesianCoordinate> coords, double pathLengthToCover,
			double interArrowDistance) {
		if (coords == null) {
			return new ArrayList<>();
		}
		if (coords.size() < 2) {
			return coords;
		}
		List<CartesianCoordinate> result = new ArrayList<CartesianCoordinate>();
		result.add(coords.get(0));

		double currentDesiredDistance = interArrowDistance;

		for (int x = 1; x < coords.size(); x++) {

			CartesianCoordinate cc1 = coords.get(x - 1);
			CartesianCoordinate cc2 = coords.get(x);

			double remainingSegmentLength = getDistance(cc1, cc2);
			CartesianCoordinate normedSegmentDirectionVector = norm(getDirectionVector(cc1, cc2));

			CartesianCoordinate baseCoordinate = cc1;

			while (remainingSegmentLength > currentDesiredDistance && pathLengthToCover > 0) {

				baseCoordinate = add(baseCoordinate,
						scalarProduct(normedSegmentDirectionVector, currentDesiredDistance));
				result.add(baseCoordinate);
				remainingSegmentLength -= currentDesiredDistance;
				pathLengthToCover -= interArrowDistance;
				currentDesiredDistance = interArrowDistance;
			}
			currentDesiredDistance -= remainingSegmentLength;
		}

		return result;
	}

	public static void main(String[] args) {
		List<CartesianCoordinate> input = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/fkerber/Downloads/MIR100.csv"));
			String str = null;
			while ((str = br.readLine()) != null) {
				String[] spl = str.split(";");

				input.add(new CartesianCoordinateImpl.Builder().x(Double.parseDouble(spl[0]))
						.y(Double.parseDouble(spl[1])).z(0).build());
			}
			br.close();

			CartesianCoordinate mir1 = new CartesianCoordinateImpl.Builder().x(1.27).y(4.03).z(0).build();

			BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/fkerber/Downloads/MIR100_beauty.csv"));
			for (CartesianCoordinate cc : beautifyPath(input, 15, .1)) {
				String xString = cc.getX() + "";
				String yString = cc.getY() + "";
				xString = xString.replace(".", ",");
				yString = yString.replace(".", ",");
				bw.write(xString + ";" + yString + "\n");
			}
			bw.close();

			CartesianCoordinate mir2 = new CartesianCoordinateImpl.Builder().x(1.238023998).y(3.93520143).z(0).build();

			if (getDistance(mir2, input.get(0)) < 0.11) {
				input.remove(0);
			}
			input.add(0, mir2);

			bw = new BufferedWriter(new FileWriter("/Users/fkerber/Downloads/MIR100_2_beauty.csv"));
			for (CartesianCoordinate cc : beautifyPath(input, 15, .1)) {
				String xString = cc.getX() + "";
				String yString = cc.getY() + "";
				xString = xString.replace(".", ",");
				yString = yString.replace(".", ",");
				bw.write(xString + ";" + yString + "\n");
			}
			bw.close();

			CartesianCoordinate mir3 = new CartesianCoordinateImpl.Builder().x(1.206047997).y(3.840500287).z(0).build();

			input.remove(0);
			if (getDistance(mir3, input.get(0)) < 0.11) {
				input.remove(0);
			}
			input.add(0, mir3);

			bw = new BufferedWriter(new FileWriter("/Users/fkerber/Downloads/MIR100_3_beauty.csv"));
			for (CartesianCoordinate cc : beautifyPath(input, 15, .1)) {
				String xString = cc.getX() + "";
				String yString = cc.getY() + "";
				xString = xString.replace(".", ",");
				yString = yString.replace(".", ",");
				bw.write(xString + ";" + yString + "\n");
			}
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private boolean coordEquals(CartesianCoordinate cc1, CartesianCoordinate cc2) {

		double epsilon = 0.00001;
		return doubleEquals(cc1.getX(), cc2.getX(), epsilon) && doubleEquals(cc1.getY(), cc2.getY(), epsilon)
				&& doubleEquals(cc1.getZ(), cc2.getZ(), epsilon);
	}

	private boolean doubleEquals(double d1, double d2, double epsilon) {
		return Math.abs(d1 - d2) < epsilon;
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

								if (payload.eClass().equals(DataPackage.eINSTANCE.getRobotPositionInformation())) {
									RobotPositionInformation MIRPosition = (RobotPositionInformation) payload;

									CartesianCoordinate MIRPos = MIRPosition.getPosition();

									if (mMIRPosition == null || !coordEquals(MIRPos, mMIRPosition)) {

										System.out.println("POSITION RECEIVED: " + MIRPos.getX() + " - " + MIRPos.getY()
												+ " - " + MIRPos.getZ());
										stopDevice();

										// TODO handle path start

										if (MIRPosition.getEta() < 60 && MIRPosition.getEta() > 15) {

											ProjectETA capability = CapabilityFactory.eINSTANCE.createProjectETA();

											capability.setEta((long) MIRPosition.getEta() * 1000);
											// TODO where to project

											// ComponentRequestStatus status = device.executeCapability(capability);

										} else {
											if (MIRPosition.getEta() <= 15) {

												if (mPath != null && getDistance(MIRPos, mPath.get(0)) < 0.11) {
													mPath.remove(0);
												}

												Path path = new DataFactoryImpl().createPath();
												path.getCoordinates().addAll(beautifyPath(mPath, 5, 0.2));

												ProjectPath capability = CapabilityFactory.eINSTANCE
														.createProjectPath();
												capability.setPath(path);
												capability.setDelay(1000);
												capability.setArrowCount(3);
												capability.setColor(0);
												// ComponentRequestStatus status = device.executeCapability(capability);
											}
										}

									}

									mMIRPosition = MIRPos;

								}

								if (payload.eClass().equals(DataPackage.eINSTANCE.getPath())) {

									System.out.println("PATH RECEIVED");

									stopDevice();
									Path path = (Path) payload;
									mPath.addAll(path.getCoordinates());
								}

							} catch (IOException e) {
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
