package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.topology.Area;
import de.dfki.iui.basys.model.domain.topology.Enterprise;
import de.dfki.iui.basys.model.domain.topology.EquipmentModule;
import de.dfki.iui.basys.model.domain.topology.ProductionLine;
import de.dfki.iui.basys.model.domain.topology.Site;
import de.dfki.iui.basys.model.domain.topology.Station;
import de.dfki.iui.basys.model.domain.topology.StorageZone;
import de.dfki.iui.basys.model.domain.topology.WorkCell;
import de.dfki.iui.basys.model.domain.topology.WorkCenter;

@Path("/topology")
public interface TopologyManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/enterprise")
	Enterprise getEnterprise();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/site/{siteId}")
	Site getSite(@PathParam("siteId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/site/{name}")
	Site getSiteByName(@PathParam("name") String name);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/site")
	List<Site> getSites();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/area/{areaId}")
	Area getArea(@PathParam("areaId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/area/name/{name}")
	Area getAreaByName(@PathParam("name") String name);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/area/site/{siteId}")
	List<Area> getAreasBySite(@PathParam("siteId") String siteId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/area/site/name/{siteName}")
	List<Area> getAreasBySiteName(@PathParam("siteName") String siteName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/area")
	List<Area> getAllAreas();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/workCenter/{workCenterId}")
	WorkCenter getWorkCenter(@PathParam("workCenterId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/workCenter/name/{name}")
	WorkCenter getWorkCenterByName(@PathParam("name") String name);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/workCenter/area/{areaId}")
	List<WorkCenter> getWorkCentersByArea(@PathParam("areaId") String areaId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/workCenter/area/name/{areaName}")
	List<WorkCenter> getWorkCentersByAreaName(@PathParam("areaName") String areaName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/workCenter/site/{siteId}")
	List<WorkCenter> getWorkCentersBySite(@PathParam("siteId") String siteId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/workCenter/site/name/{siteName}")
	List<WorkCenter> getPWorkCentersBySiteName(@PathParam("siteName") String siteName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/productionLine/{lineId}")
	ProductionLine getProductionLine(@PathParam("lineId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/productionLine/name/{name}")
	ProductionLine getProductionLineByName(@PathParam("name") String name);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/productionLine/area/{areaId}")
	List<ProductionLine> getProductionLinesByArea(@PathParam("areaId") String areaId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/productionLine/area/name/{areaName}")
	List<ProductionLine> getProductionLinesByAreaName(@PathParam("areaName") String areaName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/productionLine/site/{siteId}")
	List<ProductionLine> getProductionLinesBySite(@PathParam("siteId") String siteId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/productionLine/site/name/{siteName}")
	List<ProductionLine> getProductionLinesBySiteName(@PathParam("siteName") String siteName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/storageZone/{storageZoneId}")
	StorageZone getStorageZone(@PathParam("storageZoneId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/storageZone/name/{name}")
	StorageZone getStorageZoneByName(@PathParam("name") String name);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/storageZone/area/{areaId}")
	List<StorageZone> getStorageZonesByArea(@PathParam("areaId") String areaId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/storageZone/area/name/{areaName}")
	List<StorageZone> getStorageZonesByAreaName(@PathParam("areaName") String areaName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/storageZone/site/{siteId}")
	List<StorageZone> getStorageZonesBySite(@PathParam("siteId") String siteId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/storageZone/site/name/{siteName}")
	List<StorageZone> getStorageZonesBySiteName(@PathParam("siteName") String siteName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/workCell/{workCellId}")
	WorkCell getWorkCell(@PathParam("workCellId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/workCell/name/{name}")
	WorkCell getWorkCellByName(@PathParam("name") String name);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/workCell/productionLine/{productionLineId}")
	List<WorkCell> getWorkCellsByProductionLine(@PathParam("productionLineId") String productionLineId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/workCell/productionLine/name/{productionLineName}")
	List<WorkCell> getWorkCellsByProductionLineName(@PathParam("productionLineName") String productionLineName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/station/{stationId}")
	Station getStation(@PathParam("stationId") String stationId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/station/name/{name}")
	Station getStationByName(@PathParam("name") String name);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/station/workCell/{workCellId}")
	List<Station> getStationsByWorkCell(@PathParam("workCellId") String workCellId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/station/workCell/name/{workCellName}")
	List<Station> getStationsByWorkCellName(@PathParam("workCellName") String workCellName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/station/productionLine/{productionLineId}")
	List<Station> getStationsByProductionLine(@PathParam("productionLineId") String productionLineId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/station/productionLine/name/{productionLineName}")
	List<Station> getStationsByProductionLineName(@PathParam("productionLineName") String productionLineName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/{equipmentModuleId}")
	EquipmentModule getEquipmentModule(@PathParam("equipmentModuleId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/name/{name}")
	EquipmentModule getEquipmentModuleByName(@PathParam("name") String name);

	// gibt id des EquipmentModules zurück
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/{parentId}")
	String addEquipmentModule(EquipmentModule equipmentModule, @PathParam("parentId") String parentId);

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/{equipmentModuleId}")
	void removeEquipmentModule(@PathParam("equipmentModuleId") String equipmentModuleId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/station/{stationId}")
	List<EquipmentModule> getEquipmentModulesByStation(@PathParam("stationId") String stationId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/station/name/{stationName}")
	List<EquipmentModule> getEquipmentModulesByStationName(@PathParam("stationName") String stationName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/workUnit/{workCellId}")
	List<EquipmentModule> getEquipmentModulesByWorkUnit(@PathParam("workCellId") String workCellId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/workUnit/name/{workCellName}")
	List<EquipmentModule> getEquipmentModulesByWorkUnitName(@PathParam("workCellName") String workCellName);

	// TODO: The same as getEquipmentModulesByWorkUnit?
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/workUnit/{workCellId}")
	List<EquipmentModule> getAllEquipmentModulesByWorkUnit(@PathParam("workCellId") String workCellId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/workUnit/name/{workCellName}")
	List<EquipmentModule> getAllEquipmentModulesByWorkUnitName(@PathParam("workCellName") String workCellName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/workCenter/{workCenterId}")
	List<EquipmentModule> getEquipmentModulesByWorkCenter(@PathParam("workCenterId") String workCenterId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/workCenter/name/{workCenterName}")
	List<EquipmentModule> getEquipmentModulesByWorkCenterName(@PathParam("workCenterName") String workCenterName);

	// TODO: The same as getEquipmentModulesByWorkCenter?
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/workCenter/{workCenterId}")
	List<EquipmentModule> getAllEquipmentModulesByWorkCenter(@PathParam("siteId") String workCenterId);

	// TODO: The same as getEquipmentModulesByWorkCenterName?
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/workCenter/name/{workCenterName}")
	List<EquipmentModule> getAllEquipmentModulesByWorkCenterName(@PathParam("workCenterName") String workCenterName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/area/{areaId}")
	List<EquipmentModule> getEquipmentModulesByArea(@PathParam("areaId") String areaId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/area/name/{areaName}")
	List<EquipmentModule> getEquipmentModulesByAreaName(@PathParam("areaName") String areaName);

	// TODO: The same as getEquipmentModulesByArea?
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/area/{areaId}")
	List<EquipmentModule> getAllEquipmentModulesByArea(@PathParam("areaId") String areaId);

	// TODO: The same as getEquipmentModulesByAreaName?
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/equipmentModule/area/name/{areaName}")
	List<EquipmentModule> getAllEquipmentModulesByAreaName(@PathParam("areaName") String areaName);

}
