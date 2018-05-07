package de.dfki.iui.basys.osgi.services.internal;

import java.util.List;
import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.iui.basys.model.domain.topology.Area;
import de.dfki.iui.basys.model.domain.topology.Enterprise;
import de.dfki.iui.basys.model.domain.topology.EquipmentModule;
import de.dfki.iui.basys.model.domain.topology.ProductionLine;
import de.dfki.iui.basys.model.domain.topology.Site;
import de.dfki.iui.basys.model.domain.topology.Station;
import de.dfki.iui.basys.model.domain.topology.StorageZone;
import de.dfki.iui.basys.model.domain.topology.WorkCell;
import de.dfki.iui.basys.model.domain.topology.WorkCenter;
import de.dfki.iui.basys.osgi.services.BasysOsgiComponent;
import de.dfki.iui.basys.runtime.component.manager.ComponentManager;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;
import de.dfki.iui.basys.runtime.services.TopologyManager;
import de.dfki.iui.basys.runtime.services.impl.TopologyManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class TopologyManagerServiceImpl extends BasysOsgiComponent implements TopologyManager {

	ComponentManager componentManager;
	TopologyManagerImpl impl;

	public TopologyManagerServiceImpl() {
		LOGGER.info(getClass().getSimpleName() + " created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new TopologyManagerImpl(config);
		try {
			componentManager.addLocalComponent(impl);
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	@Modified
	public void modified(ComponentContext context, Map<String, Object> properties) {
		if (super.context == null)
			return;

		super.modified(context, properties);
	}

	@Override
	@Deactivate
	public void deactivate(ComponentContext context, int reason) {
		super.deactivate(context, reason);
	}

	@Reference
	void setComponentManager(ComponentManager componentManager) {
		this.componentManager = componentManager;
	}

	void unsetComponentManager(ComponentManager componentManager) {
		this.componentManager = null;
	}


	/*
	 * Service interface
	 */
	
	@Override
	public Enterprise getEnterprise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Site getSite(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Site getSiteByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Site> getSites() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Area getArea(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Area getAreaByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> getAreasBySite(String siteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> getAreasBySiteName(String siteName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> getAllAreas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WorkCenter getWorkCenter(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WorkCenter getWorkCenterByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkCenter> getWorkCentersByArea(String areaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkCenter> getWorkCentersByAreaName(String areaName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkCenter> getWorkCentersBySite(String siteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkCenter> getPWorkCentersBySiteName(String siteName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductionLine getProductionLine(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductionLine getProductionLineByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductionLine> getProductionLinesByArea(String areaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductionLine> getProductionLinesByAreaName(String areaName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductionLine> getProductionLinesBySite(String siteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductionLine> getProductionLinesBySiteName(String siteName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StorageZone getStorageZone(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StorageZone getStorageZoneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StorageZone> getStorageZonesByArea(String areaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StorageZone> getStorageZonesByAreaName(String areaName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StorageZone> getStorageZonesBySite(String siteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StorageZone> getStorageZonesBySiteName(String siteName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WorkCell getWorkCell(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WorkCell getWorkCellByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkCell> getWorkCellsByProductionLine(String productionLineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkCell> getWorkCellsByProductionLineName(String productionLineName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Station getStation(String stationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Station getStationByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Station> getStationsByWorkCell(String workCellId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Station> getStationsByWorkCellName(String workCellName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Station> getStationsByProductionLine(String productionLineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Station> getStationsByProductionLineName(String productionLineName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EquipmentModule getEquipmentModule(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EquipmentModule getEquipmentModuleByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addEquipmentModule(EquipmentModule equipmentModule, String parentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEquipmentModule(String equipmentModuleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EquipmentModule> getEquipmentModulesByStation(String stationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getEquipmentModulesByStationName(String stationName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getEquipmentModulesByWorkUnit(String workCellId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getEquipmentModulesByWorkUnitName(String workCellName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getAllEquipmentModulesByWorkUnit(String workCellId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getAllEquipmentModulesByWorkUnitName(String workCellName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getEquipmentModulesByWorkCenter(String workCenterId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getEquipmentModulesByWorkCenterName(String workCenterName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getAllEquipmentModulesByWorkCenter(String workCenterId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getAllEquipmentModulesByWorkCenterName(String workCenterName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getEquipmentModulesByArea(String areaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getEquipmentModulesByAreaName(String areaName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getAllEquipmentModulesByArea(String areaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipmentModule> getAllEquipmentModulesByAreaName(String areaName) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
