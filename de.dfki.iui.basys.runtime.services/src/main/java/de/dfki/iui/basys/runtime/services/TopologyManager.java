package de.dfki.iui.basys.runtime.services;

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

public interface TopologyManager {

	Enterprise getEnterprise();
	
	Site getSite(String id);
	Site getSiteByName(String name);
	List<Site> getSites();
	
	Area getArea(String id);
	Area getAreaByName(String name);
	List<Area> getAreasBySite(String siteId);
	List<Area> getAreasBySiteName(String siteName);
	List<Area> getAllAreas();

	WorkCenter getWorkCenter(String id);
	WorkCenter getWorkCenterByName(String name);
	List<WorkCenter> getWorkCentersByArea(String areaId);
	List<WorkCenter> getWorkCentersByAreaName(String areaName);
	List<WorkCenter> getWorkCentersBySite(String siteId);
	List<WorkCenter> getPWorkCentersBySiteName(String siteName);
		
	ProductionLine getProductionLine(String id);
	ProductionLine getProductionLineByName(String name);
	List<ProductionLine> getProductionLinesByArea(String areaId);
	List<ProductionLine> getProductionLinesByAreaName(String areaName);
	List<ProductionLine> getProductionLinesBySite(String siteId);
	List<ProductionLine> getProductionLinesBySiteName(String siteName);

	StorageZone getStorageZone(String id);
	StorageZone getStorageZoneByName(String name);
	List<StorageZone> getStorageZonesByArea(String areaId);
	List<StorageZone> getStorageZonesByAreaName(String areaName);
	List<StorageZone> getStorageZonesBySite(String siteId);
	List<StorageZone> getStorageZonesBySiteName(String siteName);
	
	WorkCell getWorkCell(String id);
	WorkCell getWorkCellByName(String name);
	List<WorkCell> getWorkCellsByProductionLine(String productionLineId);
	List<WorkCell> getWorkCellsByProductionLineName(String productionLineName);
	
	Station getStation(String id);
	Station getStationByName(String name);
	List<Station> getStationsByWorkCell(String workCellId);
	List<Station> getStationsByWorkCellName(String workCellName);
	List<Station> getStationsByProductionLine(String productionLineId);
	List<Station> getStationsByProductionLineName(String productionLineName);

	EquipmentModule getEquipmentModule(String id);
	EquipmentModule getEquipmentModuleByName(String name);

	List<EquipmentModule> getEquipmentModulesByStation(String stationId);
	List<EquipmentModule> getEquipmentModulesByStationName(String stationName);

	List<EquipmentModule> getEquipmentModulesByWorkUnit(String workCellId);
	List<EquipmentModule> getEquipmentModulesByWorkUnitName(String workCellName);
	List<EquipmentModule> getAllEquipmentModulesByWorkUnit(String workCellId);
	List<EquipmentModule> getAllEquipmentModulesByWorkUnitName(String workCellName);

	List<EquipmentModule> getEquipmentModulesByWorkCenter(String workCenterId);
	List<EquipmentModule> getEquipmentModulesByWorkCenterName(String workCenterName);
	List<EquipmentModule> getAllEquipmentModulesByWorkCenter(String workCenterId);
	List<EquipmentModule> getAllEquipmentModulesByWorkCenterName(String workCenterName);	

	List<EquipmentModule> getEquipmentModulesByArea(String areaId);
	List<EquipmentModule> getEquipmentModulesByAreaName(String areaName);
	List<EquipmentModule> getAllEquipmentModulesByArea(String areaId);
	List<EquipmentModule> getAllEquipmentModulesByAreaName(String areaName);
	

	
}
