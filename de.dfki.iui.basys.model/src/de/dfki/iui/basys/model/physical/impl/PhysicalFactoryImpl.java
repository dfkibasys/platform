/**
 */
package de.dfki.iui.basys.model.physical.impl;

import de.dfki.iui.basys.model.physical.*;

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
public class PhysicalFactoryImpl extends EFactoryImpl implements PhysicalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhysicalFactory init() {
		try {
			PhysicalFactory thePhysicalFactory = (PhysicalFactory)EPackage.Registry.INSTANCE.getEFactory(PhysicalPackage.eNS_URI);
			if (thePhysicalFactory != null) {
				return thePhysicalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PhysicalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFactoryImpl() {
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
			case PhysicalPackage.ENTERPRISE: return createEnterprise();
			case PhysicalPackage.SITE: return createSite();
			case PhysicalPackage.AREA: return createArea();
			case PhysicalPackage.PROCESS_CELL: return createProcessCell();
			case PhysicalPackage.PRODUCTION_UNIT: return createProductionUnit();
			case PhysicalPackage.PRODUCTION_LINE: return createProductionLine();
			case PhysicalPackage.STORAGE_ZONE: return createStorageZone();
			case PhysicalPackage.UNIT: return createUnit();
			case PhysicalPackage.WORK_CELL: return createWorkCell();
			case PhysicalPackage.STORAGE_UNIT: return createStorageUnit();
			case PhysicalPackage.EQUIPMENT_MODULE: return createEquipmentModule();
			case PhysicalPackage.CONTROL_MODULE: return createControlModule();
			case PhysicalPackage.PRODUCTION_LINE_SECTION: return createProductionLineSection();
			case PhysicalPackage.STATION: return createStation();
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
	public EquipmentModule createEquipmentModule() {
		EquipmentModuleImpl equipmentModule = new EquipmentModuleImpl();
		return equipmentModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlModule createControlModule() {
		ControlModuleImpl controlModule = new ControlModuleImpl();
		return controlModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionLineSection createProductionLineSection() {
		ProductionLineSectionImpl productionLineSection = new ProductionLineSectionImpl();
		return productionLineSection;
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
	public PhysicalPackage getPhysicalPackage() {
		return (PhysicalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PhysicalPackage getPackage() {
		return PhysicalPackage.eINSTANCE;
	}

} //PhysicalFactoryImpl
