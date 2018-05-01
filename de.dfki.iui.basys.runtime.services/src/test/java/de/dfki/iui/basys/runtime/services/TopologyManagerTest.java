package de.dfki.iui.basys.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.model.domain.topology.Area;
import de.dfki.iui.basys.model.domain.topology.Enterprise;
import de.dfki.iui.basys.model.domain.topology.EquipmentModule;
import de.dfki.iui.basys.model.domain.topology.ProductionLine;
import de.dfki.iui.basys.model.domain.topology.Site;
import de.dfki.iui.basys.model.domain.topology.Station;
import de.dfki.iui.basys.model.domain.topology.StorageZone;
import de.dfki.iui.basys.model.domain.topology.WorkCell;
import de.dfki.iui.basys.model.domain.topology.WorkCenter;
import de.dfki.iui.basys.runtime.services.impl.TopologyManagerImpl;

public class TopologyManagerTest extends BaseEmfServiceComponentTest<TopologyManagerImpl> {

	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.TopologyManagerImpl";
		file = "cebit.topology";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetEnterprise() {
		// TODO:more checks
		Enterprise enterprise = service.getEnterprise();

		assertNotNull(enterprise);
	}

	@Test
	public void testGetSite() {
		// TODO:set properties
		String id = "";
		Site site = service.getSite(id);

		assertEquals(id, site.getId());
		assertEquals("", site.getName());
	}

	@Test
	public void testGetSiteByName() {
		// TODO:set properties
		String name = "";
		Site site = service.getSiteByName(name);

		assertEquals(name, site.getName());
		assertEquals("", site.getId());
	}

	@Test
	public void testGetSites() {
		List<Site> sites = service.getSites();

	}

	@Test
	public void testGetArea() {
		// TODO:set properties
		String id = "";
		Area area = service.getArea(id);

		assertEquals(id, area.getId());
		assertEquals("", area.getName());
	}

	@Test
	public void testGetAreaByName() {
		String name = "";
		Area area = service.getAreaByName(name);

		assertEquals("", area.getId());
		assertEquals(name, area.getName());
	}

	@Test
	public void testGetAreasBySite() {
		// TODO:set properties
		String siteId = "";
		List<Area> areas = service.getAreasBySite(siteId);

	}

	@Test
	public void testGetAreasBySiteName() {
		// TODO:set properties
		String siteName = "";
		List<Area> areas = service.getAreasBySiteName(siteName);

	}

	@Test
	public void testGetAllAreas() {
		// TODO:set properties
		List<Area> areas = service.getAllAreas();
	}

	@Test
	public void testGetWorkCenter() {
		// TODO:set properties
		String id = "";
		WorkCenter workCenter = service.getWorkCenter(id);

		assertEquals(id, workCenter.getId());
		assertEquals("", workCenter.getName());
	}

	@Test
	public void testGetWorkCenterByName() {
		// TODO:set properties
		String name = "";
		WorkCenter workCenter = service.getWorkCenterByName(name);

		assertEquals(name, workCenter.getName());
		assertEquals("", workCenter.getId());
	}

	@Test
	public void testGetWorkCentersByArea() {
		// TODO:set properties
		String areaId = "";
		List<WorkCenter> workCenters = service.getWorkCentersByArea(areaId);

	}

	@Test
	public void testGetWorkCentersByAreaName() {
		// TODO:set properties
		String areaName = "";
		List<WorkCenter> workCenters = service.getWorkCentersByAreaName(areaName);

	}

	@Test
	public void testGetWorkCentersBySite() {
		// TODO:set properties
		String siteId = "";
		List<WorkCenter> workCenters = service.getWorkCentersBySite(siteId);

	}

	@Test
	public void testGetWorkCentersBySiteName() {
		// TODO:set properties
		String siteName = "";
		List<WorkCenter> workCenters = service.getPWorkCentersBySiteName(siteName);

	}

	@Test
	public void testGetProductionLine() {
		// TODO:set properties
		String id = "";
		ProductionLine productionLine = service.getProductionLine(id);

		assertEquals(id, productionLine.getId());
		assertEquals("", productionLine.getName());
	}

	@Test
	public void testGetProductionLineByName() {
		// TODO:set properties
		String name = "";
		ProductionLine productionLine = service.getProductionLineByName(name);

		assertEquals(name, productionLine.getName());
		assertEquals("", productionLine.getId());
	}

	@Test
	public void testGetProductionLinesByArea() {
		// TODO:set properties
		String areaId = "";
		List<ProductionLine> productionLines = service.getProductionLinesByArea(areaId);
	}

	@Test
	public void testGetProductionLinesByAreaName() {
		// TODO:set properties
		String areaName = "";
		List<ProductionLine> productionLines = service.getProductionLinesByAreaName(areaName);
	}

	@Test
	public void testGetProductionLinesBySite() {
		// TODO:set properties
		String siteId = "";
		List<ProductionLine> productionLines = service.getProductionLinesBySite(siteId);
	}

	@Test
	public void testGetProductionLinesBySiteName() {
		// TODO:set properties
		String siteName = "";
		List<ProductionLine> productionLines = service.getProductionLinesBySiteName(siteName);
	}

	@Test
	public void testGetStorageZone() {
		// TODO:set properties
		String id = "";
		StorageZone storageZone = service.getStorageZone(id);

		assertEquals(id, storageZone.getId());
		assertEquals("", storageZone.getName());
	}

	@Test
	public void testGetStorageZoneByName() {
		// TODO:set properties
		String name = "";
		StorageZone storageZone = service.getStorageZoneByName(name);

		assertEquals(name, storageZone.getName());
		assertEquals("", storageZone.getId());
	}

	@Test
	public void testGetStorageZonesByArea() {
		// TODO:set properties
		String areaId = "";
		List<StorageZone> storageZones = service.getStorageZonesByArea(areaId);

	}

	@Test
	public void testGetStorageZonesByAreaName() {
		// TODO:set properties
		String areaName = "";
		List<StorageZone> storageZones = service.getStorageZonesByAreaName(areaName);

	}

	@Test
	public void testGetStorageZonesBySite() {
		// TODO:set properties
		String siteId = "";
		List<StorageZone> storageZones = service.getStorageZonesBySite(siteId);

	}

	@Test
	public void testGetStorageZonesBySiteName() {
		// TODO:set properties
		String siteName = "";
		List<StorageZone> storageZones = service.getStorageZonesBySiteName(siteName);

	}

	@Test
	public void testGetWorkCell() {
		// TODO:set properties
		String id = "";
		WorkCell workCell = service.getWorkCell(id);

		assertEquals(id, workCell.getId());
		assertEquals("", workCell.getName());
	}

	@Test
	public void testGetWorkCellByName() {
		// TODO:set properties
		String name = "";
		WorkCell workCell = service.getWorkCellByName(name);

		assertEquals(name, workCell.getName());
		assertEquals("", workCell.getId());
	}

	@Test
	public void testGetWorkCellsByProductionLine() {
		// TODO:set properties
		String productionLineId = "";
		List<WorkCell> workCells = service.getWorkCellsByProductionLine(productionLineId);

	}

	@Test
	public void testGetWorkCellsByProductionLineName() {
		// TODO:set properties
		String productionLineName = "";
		List<WorkCell> workCells = service.getWorkCellsByProductionLineName(productionLineName);

	}

	@Test
	public void testGetStation() {
		// TODO:set properties
		String id = "";
		Station station = service.getStation(id);

		assertEquals(id, station.getId());
		assertEquals("", station.getName());
	}

	@Test
	public void testGetStationByName() {
		// TODO:set properties
		String name = "";
		Station station = service.getStationByName(name);

		assertEquals(name, station.getName());
		assertEquals("", station.getId());
	}

	@Test
	public void testGetStationsByWorkCell() {
		// TODO:set properties
		String workCellId = "";
		List<Station> stations = service.getStationsByWorkCell(workCellId);

	}

	@Test
	public void testGetStationsByWorkCellName() {
		// TODO:set properties
		String workCellName = "";
		List<Station> stations = service.getStationsByWorkCellName(workCellName);

	}

	@Test
	public void testGetStationsByProductionLine() {
		// TODO:set properties
		String productionLineId = "";
		List<Station> stations = service.getStationsByProductionLine(productionLineId);

	}

	@Test
	public void testGetStationsByProductionLineName() {
		// TODO:set properties
		String productionLineName = "";
		List<Station> stations = service.getStationsByProductionLineName(productionLineName);

	}

	@Test
	public void testGetEquipmentModule() {
		// TODO:set properties
		String id = "";
		EquipmentModule equipmentModule = service.getEquipmentModule(id);

		assertEquals(id, equipmentModule.getId());
		assertEquals("UR3", equipmentModule.getName());
	}

	@Test
	public void testGetEquipmentModuleByName() {
		// TODO:set properties
		String name = "";
		EquipmentModule equipmentModule = service.getEquipmentModuleByName(name);

		assertEquals(name, equipmentModule.getName());
		assertEquals("", equipmentModule.getId());
	}

	@Test
	public void testAddEquipmentModule() {
		// TODO:set properties
	}

	@Test
	public void testRemoveEquipmentModule() {
		// TODO:set properties
	}

	@Test
	public void testGetEquipmentModulesByStation() {
		// TODO:set properties
		String stationId = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByStation(stationId);

	}

	@Test
	public void testGetEquipmentModulesByStationName() {
		// TODO:set properties
		String stationName = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByStationName(stationName);

	}

	@Test
	public void testGetEquipmentModulesByWorkUnit() {
		// TODO:set properties
		String workCellId = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByWorkUnit(workCellId);

	}

	@Test
	public void testGetEquipmentModulesByWorkUnitName() {
		// TODO:set properties
		String workCellName = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByWorkUnitName(workCellName);

	}

	@Test
	public void testGetAllEquipmentModulesByWorkUnit() {
		// TODO:set properties
		String workCellId = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByWorkUnit(workCellId);

	}

	@Test
	public void testGetAllEquipmentModulesByWorkUnitName() {
		// TODO:set properties
		String workCellName = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByWorkUnitName(workCellName);

	}

	@Test
	public void testGetEquipmentModulesByWorkCenter() {
		// TODO:set properties
		String workCenterId = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByWorkCenter(workCenterId);

	}

	@Test
	public void testGetEquipmentModulesByWorkCenterName() {
		// TODO:set properties
		String workCenterName = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByWorkCenterName(workCenterName);

	}

	@Test
	public void testGetAllEquipmentModulesByWorkCenter() {
		// TODO:set properties
		String workCenterId = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByWorkCenter(workCenterId);

	}

	@Test
	public void testGetAllEquipmentModulesByWorkCenterName() {
		// TODO:set properties
		String workCenterName = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByWorkCenterName(workCenterName);

	}

	@Test
	public void testGetEquipmentModulesByArea() {
		// TODO:set properties
		String areaId = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByArea(areaId);

	}

	@Test
	public void testGetEquipmentModulesByAreaName() {
		// TODO:set properties
		String areaName = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByAreaName(areaName);

	}

	@Test
	public void testGetAllEquipmentModulesByArea() {
		// TODO:set properties
		String areaId = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByArea(areaId);

	}

	@Test
	public void testGetAllEquipmentModulesByAreaName() {
		// TODO:set properties
		String areaName = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByAreaName(areaName);

	}

}
