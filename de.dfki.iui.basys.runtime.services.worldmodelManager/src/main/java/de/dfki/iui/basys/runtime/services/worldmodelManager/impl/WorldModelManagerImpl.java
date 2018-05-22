package de.dfki.iui.basys.runtime.services.worldmodelManager.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository;
import de.dfki.iui.basys.model.domain.topology.TopologyElement;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.Property;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;
import de.dfki.iui.basys.runtime.services.ProductInstanceManager;
import de.dfki.iui.basys.runtime.services.ResourceInstanceManager;
import de.dfki.iui.basys.runtime.services.worldmodelManager.WorldModelManager;
import de.dfki.iui.basys.runtime.services.worldmodelManager.WorldModelManager.StaticWorldModel;
import de.dfki.iui.basys.runtime.services.worldmodelManager.WorldModelManager.StaticWorldModel.WMPathTimes;
import de.dfki.iui.basys.runtime.services.worldmodelManager.WorldModelManager.StaticWorldModel.WMPathTimes.WMPathTime;
import de.dfki.iui.basys.runtime.services.worldmodelManager.WorldModelManager.WorldModel;
import de.dfki.iui.basys.runtime.services.worldmodelManager.WorldModelManager.WorldModel.WMProductInstance;
import de.dfki.iui.basys.runtime.services.worldmodelManager.WorldModelManager.WorldModel.WMResourceInstance;

public class WorldModelManagerImpl extends ServiceComponent implements WorldModelManager {

	private Map<String, Date> mEstimatedStepCompletionTimestamp = new HashMap<>();
	private Map<String, TopologyElement> mCurrentProductPositions = new HashMap<>();

	// TODO
	// Workplan

	public WorldModelManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		super.activate(context);

	}

	@Override
	public WorldModel getCurrentWorld() {

		ProductInstanceManager pim = (ProductInstanceManager) context.getComponentManager()
				.getLocalComponentById("product-instance-manager");
		List<ProductInstance> productInstances = pim.getProductInstanceStore().getProductInstances();

		ResourceInstanceManager rim = (ResourceInstanceManager) context.getComponentManager()
				.getLocalComponentById("resource-instance-manager");
		
		ResourceInstanceRepository repo = rim.getResourceInstanceRepository();
		Resource r = repo.eResource();
		
		List<ResourceInstance> resourceInstances = repo.getResourceInstances();
		WorldModel wm = new WorldModel();

		List<WMProductInstance> wpis = new ArrayList<>();
		for (ProductInstance pi : productInstances) {
			String serialNumber = pi.getSerialNumber();
			TopologyElement currentPosition = mCurrentProductPositions.get(serialNumber);
			String positionName = currentPosition == null ? "" : currentPosition.getName();
			long eta;
			if (currentPosition == null) {
				eta = 0;
			} else {
				eta = 0; // TODO mEstimatedStepCompletionTimestamp.get(serialNumber).getTime() - System.currentTimeMillis();
			}
			if (eta <= 0) {
				eta = 1;
			}
			wpis.add(wm.new WMProductInstance(serialNumber, positionName, currentPosition == null, eta,
					pi.getManufacturedComponent().getName()));

		}
		wm.setProductInstances(wpis);

		List<WMResourceInstance> wris = new ArrayList<>();
		for (ResourceInstance ri : resourceInstances) {

			switch (ri.getResourceType().getName()) {

			case "AVG":

				try {
					ComponentConfiguration avgConfig = context.getComponentManager().getLocalComponentById(ri.getId())
							.getConfig();
					Property sourceProperty = avgConfig.getProperty("sourceLocation");
					String sourceName = "";
					if (sourceProperty != null) {
						TopologyElement source = (TopologyElement) JsonUtils.fromString(sourceProperty.getValue(),
								TopologyElement.class);
						sourceName = source.getName();
					}

					Property targetProperty = avgConfig.getProperty("targetLocation");
					String targetName = "";
					if (targetProperty != null) {
						TopologyElement target = (TopologyElement) JsonUtils.fromString(targetProperty.getValue(),
								TopologyElement.class);
						targetName = target.getName();
					}

					Long eta = (Long) JsonUtils.fromString(avgConfig.getProperty("robotPosition").getValue(),
							Long.class);
					wris.add(wm.new WMResourceInstance(ri.getSerialNumber(), sourceName, targetName, eta,
							ri.getCapabilityApplications()));

				} catch (IOException e) {
					e.printStackTrace();
				}

				break;

			}

		}
		wm.setResourceInstances(wris);

		return wm;

	}

	@Override
	public StaticWorldModel getStaticWorld() {

		StaticWorldModel swm = new StaticWorldModel();
		List<WMPathTimes> pathTimes = new ArrayList<>();

		WMPathTimes pathTimesStationQA = swm.new WMPathTimes("Station-QA");
		List<WMPathTime> QATimes = new ArrayList<>();
		QATimes.add(pathTimesStationQA.new WMPathTime("Station-TeachIn", 10000));
		QATimes.add(pathTimesStationQA.new WMPathTime("Station-Cola", 20000));
		QATimes.add(pathTimesStationQA.new WMPathTime("Station-BaSys", 30000));
		QATimes.add(pathTimesStationQA.new WMPathTime("Station-Wait", 40000));
		QATimes.add(pathTimesStationQA.new WMPathTime("Station-Festo", 50000));
		pathTimesStationQA.setPathTimes(QATimes);
		pathTimes.add(pathTimesStationQA);

		WMPathTimes pathTimesStationTeachIn = swm.new WMPathTimes("Station-TeachIn");
		List<WMPathTime> teachInTimes = new ArrayList<>();
		teachInTimes.add(pathTimesStationTeachIn.new WMPathTime("Station-QA", 10000));
		teachInTimes.add(pathTimesStationTeachIn.new WMPathTime("Station-Cola", 20000));
		teachInTimes.add(pathTimesStationTeachIn.new WMPathTime("Station-BaSys", 30000));
		teachInTimes.add(pathTimesStationTeachIn.new WMPathTime("Station-Wait", 40000));
		teachInTimes.add(pathTimesStationTeachIn.new WMPathTime("Station-Festo", 50000));
		pathTimesStationTeachIn.setPathTimes(teachInTimes);
		pathTimes.add(pathTimesStationTeachIn);

		WMPathTimes pathTimesStationCola = swm.new WMPathTimes("Station-Cola");
		List<WMPathTime> colaTimes = new ArrayList<>();
		colaTimes.add(pathTimesStationCola.new WMPathTime("Station-QA", 20000));
		colaTimes.add(pathTimesStationCola.new WMPathTime("Station-TeachIn", 20000));
		colaTimes.add(pathTimesStationCola.new WMPathTime("Station-BaSys", 30000));
		colaTimes.add(pathTimesStationCola.new WMPathTime("Station-Wait", 40000));
		colaTimes.add(pathTimesStationCola.new WMPathTime("Station-Festo", 50000));
		pathTimesStationCola.setPathTimes(colaTimes);
		pathTimes.add(pathTimesStationCola);

		WMPathTimes pathTimesStationBaSys = swm.new WMPathTimes("Station-BaSys");
		List<WMPathTime> baSysTimes = new ArrayList<>();
		baSysTimes.add(pathTimesStationBaSys.new WMPathTime("Station-QA", 30000));
		baSysTimes.add(pathTimesStationBaSys.new WMPathTime("Station-TeachIn", 30000));
		baSysTimes.add(pathTimesStationBaSys.new WMPathTime("Station-Cola", 30000));
		baSysTimes.add(pathTimesStationBaSys.new WMPathTime("Station-Wait", 40000));
		baSysTimes.add(pathTimesStationBaSys.new WMPathTime("Station-Festo", 50000));
		pathTimesStationBaSys.setPathTimes(baSysTimes);
		pathTimes.add(pathTimesStationBaSys);

		WMPathTimes pathTimesStationWait = swm.new WMPathTimes("Station-Wait");
		List<WMPathTime> waitTimes = new ArrayList<>();
		waitTimes.add(pathTimesStationWait.new WMPathTime("Station-QA", 40000));
		waitTimes.add(pathTimesStationWait.new WMPathTime("Station-TeachIn", 40000));
		waitTimes.add(pathTimesStationWait.new WMPathTime("Station-Cola", 40000));
		waitTimes.add(pathTimesStationWait.new WMPathTime("Station-BaSys", 40000));
		waitTimes.add(pathTimesStationWait.new WMPathTime("Station-Festo", 50000));
		pathTimesStationWait.setPathTimes(waitTimes);
		pathTimes.add(pathTimesStationWait);

		WMPathTimes pathTimesStationFesto = swm.new WMPathTimes("Station-Festo");
		List<WMPathTime> festoTimes = new ArrayList<>();
		festoTimes.add(pathTimesStationFesto.new WMPathTime("Station-QA", 50000));
		festoTimes.add(pathTimesStationFesto.new WMPathTime("Station-TeachIn", 50000));
		festoTimes.add(pathTimesStationFesto.new WMPathTime("Station-Cola", 50000));
		festoTimes.add(pathTimesStationFesto.new WMPathTime("Station-BaSys", 50000));
		festoTimes.add(pathTimesStationFesto.new WMPathTime("Station-Wait", 50000));
		pathTimesStationFesto.setPathTimes(festoTimes);
		pathTimes.add(pathTimesStationFesto);

		swm.setPathTimes(pathTimes);

		return swm;
	}

}
