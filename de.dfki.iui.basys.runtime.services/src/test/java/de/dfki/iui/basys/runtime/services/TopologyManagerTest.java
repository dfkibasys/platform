package de.dfki.iui.basys.runtime.services;

import org.junit.After;
import org.junit.Before;

import de.dfki.iui.basys.runtime.services.impl.TopologyManagerImpl;

public class TopologyManagerTest extends BaseEmfServiceComponentTest<TopologyManagerImpl> {

	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.TopologyManagerImpl";
		file = "model.topology";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
/*
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
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testSites(sites, expectedIds);
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
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testAreas(areas, expectedIds);
	}

	@Test
	public void testGetAreasBySiteName() {
		// TODO:set properties
		String siteName = "";
		List<Area> areas = service.getAreasBySiteName(siteName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testAreas(areas, expectedIds);
	}

	@Test
	public void testGetAllAreas() {
		// TODO:set properties
		List<Area> areas = service.getAllAreas();
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testAreas(areas, expectedIds);
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
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testWorkCenters(workCenters, expectedIds);

	}

	@Test
	public void testGetWorkCentersByAreaName() {
		// TODO:set properties
		String areaName = "";
		List<WorkCenter> workCenters = service.getWorkCentersByAreaName(areaName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testWorkCenters(workCenters, expectedIds);

	}

	@Test
	public void testGetWorkCentersBySite() {
		// TODO:set properties
		String siteId = "";
		List<WorkCenter> workCenters = service.getWorkCentersBySite(siteId);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testWorkCenters(workCenters, expectedIds);

	}

	@Test
	public void testGetWorkCentersBySiteName() {
		// TODO:set properties
		String siteName = "";
		List<WorkCenter> workCenters = service.getPWorkCentersBySiteName(siteName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testWorkCenters(workCenters, expectedIds);

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
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testProductionLines(productionLines, expectedIds);
	}

	@Test
	public void testGetProductionLinesByAreaName() {
		// TODO:set properties
		String areaName = "";
		List<ProductionLine> productionLines = service.getProductionLinesByAreaName(areaName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testProductionLines(productionLines, expectedIds);
	}

	@Test
	public void testGetProductionLinesBySite() {
		// TODO:set properties
		String siteId = "";
		List<ProductionLine> productionLines = service.getProductionLinesBySite(siteId);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testProductionLines(productionLines, expectedIds);
	}

	@Test
	public void testGetProductionLinesBySiteName() {
		// TODO:set properties
		String siteName = "";
		List<ProductionLine> productionLines = service.getProductionLinesBySiteName(siteName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testProductionLines(productionLines, expectedIds);
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
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testStorageZones(storageZones, expectedIds);
	}

	@Test
	public void testGetStorageZonesByAreaName() {
		// TODO:set properties
		String areaName = "";
		List<StorageZone> storageZones = service.getStorageZonesByAreaName(areaName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testStorageZones(storageZones, expectedIds);
	}

	@Test
	public void testGetStorageZonesBySite() {
		// TODO:set properties
		String siteId = "";
		List<StorageZone> storageZones = service.getStorageZonesBySite(siteId);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testStorageZones(storageZones, expectedIds);
	}

	@Test
	public void testGetStorageZonesBySiteName() {
		// TODO:set properties
		String siteName = "";
		List<StorageZone> storageZones = service.getStorageZonesBySiteName(siteName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testStorageZones(storageZones, expectedIds);
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
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testWorkCells(workCells, expectedIds);
	}

	@Test
	public void testGetWorkCellsByProductionLineName() {
		// TODO:set properties
		String productionLineName = "";
		List<WorkCell> workCells = service.getWorkCellsByProductionLineName(productionLineName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testWorkCells(workCells, expectedIds);
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
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testStations(stations, expectedIds);
	}

	@Test
	public void testGetStationsByWorkCellName() {
		// TODO:set properties
		String workCellName = "";
		List<Station> stations = service.getStationsByWorkCellName(workCellName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testStations(stations, expectedIds);
	}

	@Test
	public void testGetStationsByProductionLine() {
		// TODO:set properties
		String productionLineId = "";
		List<Station> stations = service.getStationsByProductionLine(productionLineId);
	List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testStations(stations, expectedIds);
	}

	@Test
	public void testGetStationsByProductionLineName() {
		// TODO:set properties
		String productionLineName = "";
		List<Station> stations = service.getStationsByProductionLineName(productionLineName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testStations(stations, expectedIds);
	}

	@Test
	public void testGetEquipmentModule() {
		// TODO:set properties
		String id = "";
		EquipmentModule equipmentModule = service.getEquipmentModule(id);

		assertEquals(id, equipmentModule.getId());
		assertEquals("", equipmentModule.getName());
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
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetEquipmentModulesByStationName() {
		// TODO:set properties
		String stationName = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByStationName(stationName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetEquipmentModulesByWorkUnit() {
		// TODO:set properties
		String workCellId = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByWorkUnit(workCellId);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetEquipmentModulesByWorkUnitName() {
		// TODO:set properties
		String workCellName = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByWorkUnitName(workCellName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetAllEquipmentModulesByWorkUnit() {
		// TODO:set properties
		String workCellId = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByWorkUnit(workCellId);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetAllEquipmentModulesByWorkUnitName() {
		// TODO:set properties
		String workCellName = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByWorkUnitName(workCellName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetEquipmentModulesByWorkCenter() {
		// TODO:set properties
		String workCenterId = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByWorkCenter(workCenterId);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetEquipmentModulesByWorkCenterName() {
		// TODO:set properties
		String workCenterName = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByWorkCenterName(workCenterName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetAllEquipmentModulesByWorkCenter() {
		// TODO:set properties
		String workCenterId = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByWorkCenter(workCenterId);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetAllEquipmentModulesByWorkCenterName() {
		// TODO:set properties
		String workCenterName = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByWorkCenterName(workCenterName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetEquipmentModulesByArea() {
		// TODO:set properties
		String areaId = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByArea(areaId);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetEquipmentModulesByAreaName() {
		// TODO:set properties
		String areaName = "";
		List<EquipmentModule> equipmentModules = service.getEquipmentModulesByAreaName(areaName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetAllEquipmentModulesByArea() {
		// TODO:set properties
		String areaId = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByArea(areaId);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}

	@Test
	public void testGetAllEquipmentModulesByAreaName() {
		// TODO:set properties
		String areaName = "";
		List<EquipmentModule> equipmentModules = service.getAllEquipmentModulesByAreaName(areaName);
		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		
		testEquipmentModules(equipmentModules, expectedIds);
	}
	
	//------------------------
	
	private void testEquipmentModules(List<EquipmentModule> modules , List<String> expectedIds) {
		assertNotNull(modules);
		List<String> ids = modules.stream().map(equipmentModule -> equipmentModule.getId()).sorted().collect(Collectors.toList());

		expectedIds.stream().sorted().collect(Collectors.toList());
		
		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
	}
	
	private void testStations(List<Station> stations , List<String> expectedIds) {
		assertNotNull(stations);
		List<String> ids = stations.stream().map(equipmentModule -> equipmentModule.getId()).sorted().collect(Collectors.toList());

		expectedIds.stream().sorted().collect(Collectors.toList());
		
		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
	}
	
	private void testWorkCells(List<WorkCell> workCells , List<String> expectedIds) {
		assertNotNull(workCells);
		List<String> ids = workCells.stream().map(equipmentModule -> equipmentModule.getId()).sorted().collect(Collectors.toList());

		expectedIds.stream().sorted().collect(Collectors.toList());
		
		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
	}
	
	private void testStorageZones(List<StorageZone> storageZones , List<String> expectedIds) {
		assertNotNull(storageZones);
		List<String> ids = storageZones.stream().map(equipmentModule -> equipmentModule.getId()).sorted().collect(Collectors.toList());

		expectedIds.stream().sorted().collect(Collectors.toList());
		
		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
	}
	
	private void testProductionLines(List<ProductionLine> productionLines , List<String> expectedIds) {
		assertNotNull(productionLines);
		List<String> ids = productionLines.stream().map(equipmentModule -> equipmentModule.getId()).sorted().collect(Collectors.toList());

		expectedIds.stream().sorted().collect(Collectors.toList());
		
		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
	}

	private void testWorkCenters(List<WorkCenter> workCenters , List<String> expectedIds) {
		assertNotNull(workCenters);
		List<String> ids = workCenters.stream().map(equipmentModule -> equipmentModule.getId()).sorted().collect(Collectors.toList());

		expectedIds.stream().sorted().collect(Collectors.toList());
		
		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
	}
	
	private void testAreas(List<Area> areas , List<String> expectedIds) {
		assertNotNull(areas);
		List<String> ids = areas.stream().map(equipmentModule -> equipmentModule.getId()).sorted().collect(Collectors.toList());

		expectedIds.stream().sorted().collect(Collectors.toList());
		
		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
	}
	
	private void testSites(List<Site> sites , List<String> expectedIds) {
		assertNotNull(sites);
		List<String> ids = sites.stream().map(equipmentModule -> equipmentModule.getId()).sorted().collect(Collectors.toList());

		expectedIds.stream().sorted().collect(Collectors.toList());
		
		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
	}
	*/
}
