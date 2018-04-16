package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.roletopology.ProductionLine;
import de.dfki.iui.basys.model.domain.topology.Area;
import de.dfki.iui.basys.model.domain.topology.Enterprise;
import de.dfki.iui.basys.model.domain.topology.EquipmentModule;
import de.dfki.iui.basys.model.domain.topology.Site;
import de.dfki.iui.basys.model.domain.topology.Station;
import de.dfki.iui.basys.model.domain.topology.StorageZone;
import de.dfki.iui.basys.model.domain.topology.WorkCell;
import de.dfki.iui.basys.model.domain.topology.WorkCenter;
import de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl;
import de.dfki.iui.basys.model.domain.topology.util.TopologyResourceFactoryImpl;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.TopologyManager;

public class TopologyManagerImpl extends EmfServiceComponent implements TopologyManager {

	public TopologyManagerImpl(ComponentConfiguration config) {
		super(config);
		TopologyPackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("topology", new TopologyResourceFactoryImpl());

	}

	@Override
	public Enterprise getEnterprise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Site getSite(String id) {
		return getEntity(id);
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
		return getEntity(id);
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
		return getEntity(id);
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
		return getEntity(id);
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
		return getEntity(id);
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
		return getEntity(id);
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
	public Station getStation(String id) {
		return getEntity(id);
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
		return getEntity(id);
	}

	@Override
	public EquipmentModule getEquipmentModuleByName(String name) {
		// TODO Auto-generated method stub
		return null;
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
