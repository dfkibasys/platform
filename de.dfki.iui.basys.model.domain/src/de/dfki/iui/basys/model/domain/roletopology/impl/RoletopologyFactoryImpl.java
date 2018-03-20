/**
 */
package de.dfki.iui.basys.model.domain.roletopology.impl;

import de.dfki.iui.basys.model.domain.roletopology.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoletopologyFactoryImpl extends EFactoryImpl implements RoletopologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoletopologyFactory init() {
		try {
			RoletopologyFactory theRoletopologyFactory = (RoletopologyFactory)EPackage.Registry.INSTANCE.getEFactory(RoletopologyPackage.eNS_URI);
			if (theRoletopologyFactory != null) {
				return theRoletopologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RoletopologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoletopologyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RoletopologyPackage.ENTERPRISE: return createEnterprise();
			case RoletopologyPackage.SITE: return createSite();
			case RoletopologyPackage.AREA: return createArea();
			case RoletopologyPackage.PROCESS_CELL: return createProcessCell();
			case RoletopologyPackage.PRODUCTION_UNIT: return createProductionUnit();
			case RoletopologyPackage.PRODUCTION_LINE: return createProductionLine();
			case RoletopologyPackage.STORAGE_ZONE: return createStorageZone();
			case RoletopologyPackage.UNIT: return createUnit();
			case RoletopologyPackage.WORK_CELL: return createWorkCell();
			case RoletopologyPackage.STORAGE_UNIT: return createStorageUnit();
			case RoletopologyPackage.STATION: return createStation();
			case RoletopologyPackage.TRANSITION: return createTransition();
			case RoletopologyPackage.DISCRETE_MANUFACTURING_EQUIPMENT_MODULE: return createDiscreteManufacturingEquipmentModule();
			case RoletopologyPackage.REQUIREMENT: return createRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enterprise createEnterprise() {
		EnterpriseImpl enterprise = new EnterpriseImpl();
		return enterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessCell createProcessCell() {
		ProcessCellImpl processCell = new ProcessCellImpl();
		return processCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionUnit createProductionUnit() {
		ProductionUnitImpl productionUnit = new ProductionUnitImpl();
		return productionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionLine createProductionLine() {
		ProductionLineImpl productionLine = new ProductionLineImpl();
		return productionLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageZone createStorageZone() {
		StorageZoneImpl storageZone = new StorageZoneImpl();
		return storageZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCell createWorkCell() {
		WorkCellImpl workCell = new WorkCellImpl();
		return workCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageUnit createStorageUnit() {
		StorageUnitImpl storageUnit = new StorageUnitImpl();
		return storageUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station createStation() {
		StationImpl station = new StationImpl();
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteManufacturingEquipmentModule createDiscreteManufacturingEquipmentModule() {
		DiscreteManufacturingEquipmentModuleImpl discreteManufacturingEquipmentModule = new DiscreteManufacturingEquipmentModuleImpl();
		return discreteManufacturingEquipmentModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoletopologyPackage getRoletopologyPackage() {
		return (RoletopologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RoletopologyPackage getPackage() {
		return RoletopologyPackage.eINSTANCE;
	}

} //RoletopologyFactoryImpl
