/**
 */
package de.dfki.iui.basys.model.physical.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.base.impl.BasePackageImpl;

import de.dfki.iui.basys.model.domain.DomainPackage;

import de.dfki.iui.basys.model.domain.impl.DomainPackageImpl;

import de.dfki.iui.basys.model.physical.Area;
import de.dfki.iui.basys.model.physical.ControlModule;
import de.dfki.iui.basys.model.physical.Enterprise;
import de.dfki.iui.basys.model.physical.EquipmentModule;
import de.dfki.iui.basys.model.physical.PhysicalFactory;
import de.dfki.iui.basys.model.physical.PhysicalPackage;
import de.dfki.iui.basys.model.physical.ProcessCell;
import de.dfki.iui.basys.model.physical.ProductionLine;
import de.dfki.iui.basys.model.physical.ProductionLineSection;
import de.dfki.iui.basys.model.physical.ProductionUnit;
import de.dfki.iui.basys.model.physical.Site;
import de.dfki.iui.basys.model.physical.Station;
import de.dfki.iui.basys.model.physical.StorageUnit;
import de.dfki.iui.basys.model.physical.StorageZone;
import de.dfki.iui.basys.model.physical.Unit;
import de.dfki.iui.basys.model.physical.WorkCell;
import de.dfki.iui.basys.model.physical.WorkCenter;
import de.dfki.iui.basys.model.physical.WorkUnit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalPackageImpl extends EPackageImpl implements PhysicalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionLineSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.iui.basys.model.physical.PhysicalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PhysicalPackageImpl() {
		super(eNS_URI, PhysicalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PhysicalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PhysicalPackage init() {
		if (isInited) return (PhysicalPackage)EPackage.Registry.INSTANCE.getEPackage(PhysicalPackage.eNS_URI);

		// Obtain or create and register package
		PhysicalPackageImpl thePhysicalPackage = (PhysicalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PhysicalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PhysicalPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);

		// Create package meta-data objects
		thePhysicalPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		thePhysicalPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePhysicalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PhysicalPackage.eNS_URI, thePhysicalPackage);
		return thePhysicalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterprise() {
		return enterpriseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterprise_Sites() {
		return (EReference)enterpriseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSite() {
		return siteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSite_Areas() {
		return (EReference)siteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_WorkCenters() {
		return (EReference)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkCenter() {
		return workCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessCell() {
		return processCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessCell_Units() {
		return (EReference)processCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionUnit() {
		return productionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionUnit_Units() {
		return (EReference)productionUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionLine() {
		return productionLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLine_WorkCells() {
		return (EReference)productionLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageZone() {
		return storageZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageZone_StorageUnits() {
		return (EReference)storageZoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkUnit() {
		return workUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkUnit_EquipmentModules() {
		return (EReference)workUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkCell() {
		return workCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageUnit() {
		return storageUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipmentModule() {
		return equipmentModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipmentModule_ControlModules() {
		return (EReference)equipmentModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipmentModule_EquipmentModules() {
		return (EReference)equipmentModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlModule() {
		return controlModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlModule_ControlModules() {
		return (EReference)controlModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionLineSection() {
		return productionLineSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStation() {
		return stationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFactory getPhysicalFactory() {
		return (PhysicalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		enterpriseEClass = createEClass(ENTERPRISE);
		createEReference(enterpriseEClass, ENTERPRISE__SITES);

		siteEClass = createEClass(SITE);
		createEReference(siteEClass, SITE__AREAS);

		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__WORK_CENTERS);

		workCenterEClass = createEClass(WORK_CENTER);

		processCellEClass = createEClass(PROCESS_CELL);
		createEReference(processCellEClass, PROCESS_CELL__UNITS);

		productionUnitEClass = createEClass(PRODUCTION_UNIT);
		createEReference(productionUnitEClass, PRODUCTION_UNIT__UNITS);

		productionLineEClass = createEClass(PRODUCTION_LINE);
		createEReference(productionLineEClass, PRODUCTION_LINE__WORK_CELLS);

		storageZoneEClass = createEClass(STORAGE_ZONE);
		createEReference(storageZoneEClass, STORAGE_ZONE__STORAGE_UNITS);

		workUnitEClass = createEClass(WORK_UNIT);
		createEReference(workUnitEClass, WORK_UNIT__EQUIPMENT_MODULES);

		unitEClass = createEClass(UNIT);

		workCellEClass = createEClass(WORK_CELL);

		storageUnitEClass = createEClass(STORAGE_UNIT);

		equipmentModuleEClass = createEClass(EQUIPMENT_MODULE);
		createEReference(equipmentModuleEClass, EQUIPMENT_MODULE__CONTROL_MODULES);
		createEReference(equipmentModuleEClass, EQUIPMENT_MODULE__EQUIPMENT_MODULES);

		controlModuleEClass = createEClass(CONTROL_MODULE);
		createEReference(controlModuleEClass, CONTROL_MODULE__CONTROL_MODULES);

		productionLineSectionEClass = createEClass(PRODUCTION_LINE_SECTION);

		stationEClass = createEClass(STATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		enterpriseEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		siteEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		areaEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		workCenterEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		processCellEClass.getESuperTypes().add(this.getWorkCenter());
		productionUnitEClass.getESuperTypes().add(this.getWorkCenter());
		productionLineEClass.getESuperTypes().add(this.getWorkCenter());
		storageZoneEClass.getESuperTypes().add(this.getWorkCenter());
		workUnitEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		unitEClass.getESuperTypes().add(this.getWorkUnit());
		workCellEClass.getESuperTypes().add(this.getWorkUnit());
		storageUnitEClass.getESuperTypes().add(this.getWorkUnit());
		equipmentModuleEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		controlModuleEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(enterpriseEClass, Enterprise.class, "Enterprise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnterprise_Sites(), this.getSite(), null, "sites", null, 1, -1, Enterprise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siteEClass, Site.class, "Site", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSite_Areas(), this.getArea(), null, "areas", null, 0, -1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_WorkCenters(), this.getWorkCenter(), null, "workCenters", null, 0, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workCenterEClass, WorkCenter.class, "WorkCenter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processCellEClass, ProcessCell.class, "ProcessCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessCell_Units(), this.getUnit(), null, "units", null, 1, -1, ProcessCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionUnitEClass, ProductionUnit.class, "ProductionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductionUnit_Units(), this.getUnit(), null, "units", null, 1, -1, ProductionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionLineEClass, ProductionLine.class, "ProductionLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductionLine_WorkCells(), this.getWorkCell(), null, "workCells", null, 1, -1, ProductionLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageZoneEClass, StorageZone.class, "StorageZone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorageZone_StorageUnits(), this.getStorageUnit(), null, "storageUnits", null, 1, -1, StorageZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workUnitEClass, WorkUnit.class, "WorkUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkUnit_EquipmentModules(), this.getEquipmentModule(), null, "equipmentModules", null, 0, -1, WorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workCellEClass, WorkCell.class, "WorkCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageUnitEClass, StorageUnit.class, "StorageUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equipmentModuleEClass, EquipmentModule.class, "EquipmentModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquipmentModule_ControlModules(), this.getControlModule(), null, "controlModules", null, 0, -1, EquipmentModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquipmentModule_EquipmentModules(), this.getEquipmentModule(), null, "equipmentModules", null, 0, -1, EquipmentModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlModuleEClass, ControlModule.class, "ControlModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlModule_ControlModules(), this.getControlModule(), null, "controlModules", null, 0, -1, ControlModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionLineSectionEClass, ProductionLineSection.class, "ProductionLineSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PhysicalPackageImpl
