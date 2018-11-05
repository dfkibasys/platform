package de.dfki.iui.basys.runtime.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.iui.basys.model.domain.topology.TopologyElement;
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

	public void testGetEnterprise() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetTopologyElement() {
		// Site
		String idSite = "_m9aUIDB4Eei1bbwBPPZWOA";
		TopologyElement instanceSite = service.getTopologyElement(idSite);

		assertEquals(idSite, instanceSite.getId());
		assertEquals("CeBIT Hannover", instanceSite.getName());

		// Area
		String idArea = "_nb0HYDB4Eei1bbwBPPZWOA";
		TopologyElement instanceArea = service.getTopologyElement(idArea);

		assertEquals(idArea, instanceArea.getId());
		assertEquals("BMBF Stand", instanceArea.getName());

//		// Work Center
//		String idWorkCenter = "_nuSXcjB4Eei1bbwBPPZWOA";
//		TopologyElement instanceWorkCenter = service.getTopologyElement(idWorkCenter);
//
//		assertEquals(idWorkCenter, instanceWorkCenter.getId());
//		assertEquals("Montage", instanceWorkCenter.getName());

		// Work Cell
		String idWorkCell = "_zr-RcTB4Eei1bbwBPPZWOA";
		TopologyElement instanceWorkCell = service.getTopologyElement(idWorkCell);

		assertEquals(idWorkCell, instanceWorkCell.getId());
		assertEquals("Endmontage", instanceWorkCell.getName());

		// Station
		String idStation = "_1yPaZzB4Eei1bbwBPPZWOA";
		TopologyElement instanceStation = service.getTopologyElement(idStation);

		assertEquals(idStation, instanceStation.getId());
		assertEquals("S1", instanceStation.getName());
	}

	@Test
	public void testGetParentTopologyElement() {
//		String idWorkCell = "_zr-RcTB4Eei1bbwBPPZWOA";
//		String idStation = "_1yPaZzB4Eei1bbwBPPZWOA";
//		TopologyElement workCell = service.getParentTopologyElement(idStation);
//
//		assertEquals(idWorkCell, workCell.getId());
	}
}
