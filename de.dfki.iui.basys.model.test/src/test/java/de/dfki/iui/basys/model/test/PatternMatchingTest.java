package de.dfki.iui.basys.model.test;

import java.util.UUID;

import de.dfki.iui.basys.common.emf.computation.*;
import de.dfki.iui.basys.common.emf.computation.MatchReport.MatchResult;
import de.dfki.iui.basys.model.base.datatypes.BInteger;
import de.dfki.iui.basys.model.domain.capability.*;
import de.dfki.iui.basys.model.pattern.*;
import junit.framework.TestCase;

public class PatternMatchingTest extends TestCase {

	private PPattern capabilityAssertion;

	protected void setUp() throws Exception {
		super.setUp();
		
		
		
		PObject pressenPattern = PatternFactory.eINSTANCE.createPObject();
		pressenPattern.setType(CapabilityPackage.eINSTANCE.getPressen());

		PSlot pressenDruck = PatternFactory.eINSTANCE.createPSlot();
		pressenDruck.setFeature(CapabilityPackage.eINSTANCE.getPressen_Druck());		
		PValue pressenDruckValue = PatternFactory.eINSTANCE.createPValue();				
		PRestrictions pressenDruckValueRestrictions = PatternFactory.eINSTANCE.createPRestrictions();	
		PRestriction pressenDruckValueRestrictionMin = PatternFactory.eINSTANCE.createPIntegerRestriction();
		pressenDruckValueRestrictionMin.setFunction(PNumberRestrictionEnum.GREATER_EQUALS);
		pressenDruckValueRestrictionMin.setValue(new BInteger(100));		
		PRestriction pressenDruckValueRestrictionMax = PatternFactory.eINSTANCE.createPIntegerRestriction();
		pressenDruckValueRestrictionMax.setFunction(PNumberRestrictionEnum.LESS_EQUALS);
		pressenDruckValueRestrictionMax.setValue(new BInteger(250));		
		
		
		
		PSlot pressenHub = PatternFactory.eINSTANCE.createPSlot();
		pressenHub.setFeature(CapabilityPackage.eINSTANCE.getPressen_Hub());
		PValue pressenHubValue = PatternFactory.eINSTANCE.createPValue();		
		PRestrictions pressenHubValueRestrictions = PatternFactory.eINSTANCE.createPRestrictions();		
		PRestriction pressenHubValueRestrictionMin = PatternFactory.eINSTANCE.createPIntegerRestriction();
		pressenHubValueRestrictionMin.setFunction(PNumberRestrictionEnum.GREATER_EQUALS);
		pressenHubValueRestrictionMin.setValue(new BInteger(10));
		PRestriction pressenHubValueRestrictionMax = PatternFactory.eINSTANCE.createPIntegerRestriction();
		pressenHubValueRestrictionMax.setFunction(PNumberRestrictionEnum.LESS_EQUALS);
		pressenHubValueRestrictionMax.setValue(new BInteger(75));	
		
		
		pressenPattern.getSlot().add(pressenDruck);
		pressenDruck.getRange().add(pressenDruckValue);
		pressenDruckValue.setRestrictions(pressenDruckValueRestrictions);
		pressenDruckValueRestrictions.getRestriction().add(pressenDruckValueRestrictionMin);
		pressenDruckValueRestrictions.getRestriction().add(pressenDruckValueRestrictionMax);
		

		pressenPattern.getSlot().add(pressenHub);
		pressenHub.getRange().add(pressenHubValue);
		pressenHubValue.setRestrictions(pressenHubValueRestrictions);
		pressenHubValueRestrictions.getRestriction().add(pressenHubValueRestrictionMin);
		pressenHubValueRestrictions.getRestriction().add(pressenHubValueRestrictionMax);
		
		capabilityAssertion = pressenPattern;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMatchCapability1() {		
		Pressen pressen = CapabilityFactory.eINSTANCE.createPressen();
		pressen.setDruck(200);
		pressen.setHub(50);				
		
		MatchReport result = Matches.matches(pressen, capabilityAssertion);

		assertTrue(result.result == MatchResult.MATCH_SUCCESS);
	}
	
	public void testMatchCapability2() {
		
		Pressen pressen = CapabilityFactory.eINSTANCE.createPressen();
		pressen.setDruck(99);
		pressen.setHub(50);				
		
		MatchReport result = Matches.matches(pressen, capabilityAssertion);
		assertTrue(result.result == MatchResult.VALUE_MATCH_FAILED);
	}

}
