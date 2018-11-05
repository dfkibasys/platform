package de.dfki.iui.basys.model.test;

import org.eclipse.emf.ecore.EClass;

import de.dfki.iui.basys.model.base.computation.MatchReport;
import de.dfki.iui.basys.model.base.computation.MatchReport.MatchResult;
import de.dfki.iui.basys.model.base.computation.Matches;
import de.dfki.iui.basys.model.base.datatypes.BDouble;
import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;
import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.Pressing;
import de.dfki.iui.basys.model.pattern.PNumberRestrictionEnum;
import de.dfki.iui.basys.model.pattern.PObject;
import de.dfki.iui.basys.model.pattern.PPattern;
import de.dfki.iui.basys.model.pattern.PRestriction;
import de.dfki.iui.basys.model.pattern.PRestrictions;
import de.dfki.iui.basys.model.pattern.PSlot;
import de.dfki.iui.basys.model.pattern.PValue;
import de.dfki.iui.basys.model.pattern.PatternFactory;
import junit.framework.TestCase;

public class PatternMatchingTest extends TestCase {

	private PPattern capabilityAssertion;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
			
		PObject pressenPattern = PatternFactory.eINSTANCE.createPObject();		
		EClass pressenClass = CapabilityPackage.eINSTANCE.getPressing();
		
		pressenPattern.setType(pressenClass);

		PSlot pressenDruck = PatternFactory.eINSTANCE.createPSlot();
		pressenDruck.setFeature(CapabilityPackage.eINSTANCE.getPressing_Pressure());		
		PValue pressenDruckValue = PatternFactory.eINSTANCE.createPValue();				
		PRestrictions pressenDruckValueRestrictions = PatternFactory.eINSTANCE.createPRestrictions();	
		PRestriction pressenDruckValueRestrictionMin = PatternFactory.eINSTANCE.createPDoubleRestriction();
		pressenDruckValueRestrictionMin.setFunction(PNumberRestrictionEnum.GREATER_EQUALS);
		pressenDruckValueRestrictionMin.setValue(new BDouble(100));		
		PRestriction pressenDruckValueRestrictionMax = PatternFactory.eINSTANCE.createPDoubleRestriction();
		pressenDruckValueRestrictionMax.setFunction(PNumberRestrictionEnum.LESS_EQUALS);
		pressenDruckValueRestrictionMax.setValue(new BDouble(250));		
		
		
		PSlot pressenHub = PatternFactory.eINSTANCE.createPSlot();
		pressenHub.setFeature(CapabilityPackage.eINSTANCE.getPressing_Stroke());
		PValue pressenHubValue = PatternFactory.eINSTANCE.createPValue();		
		PRestrictions pressenHubValueRestrictions = PatternFactory.eINSTANCE.createPRestrictions();		
		PRestriction pressenHubValueRestrictionMin = PatternFactory.eINSTANCE.createPDoubleRestriction();
		pressenHubValueRestrictionMin.setFunction(PNumberRestrictionEnum.GREATER_EQUALS);
		pressenHubValueRestrictionMin.setValue(new BDouble(10));
		PRestriction pressenHubValueRestrictionMax = PatternFactory.eINSTANCE.createPDoubleRestriction();
		pressenHubValueRestrictionMax.setFunction(PNumberRestrictionEnum.LESS_EQUALS);
		pressenHubValueRestrictionMax.setValue(new BDouble(75));	
		
		
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

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMatchCapability1() {		
		Pressing pressen = CapabilityFactory.eINSTANCE.createPressing();
		pressen.setPressure(200);
		pressen.setStroke(50);				
		
		MatchReport result = Matches.matches(pressen, capabilityAssertion);

		assertTrue(result.result == MatchResult.MATCH_SUCCESS);
	}
	
	public void testMatchCapability2() {
		Pressing pressen = CapabilityFactory.eINSTANCE.createPressing();
		pressen.setPressure(99);
		pressen.setStroke(50);				
		
		MatchReport result = Matches.matches(pressen, capabilityAssertion);
		assertTrue(result.result == MatchResult.VALUE_MATCH_FAILED);
	}

}
