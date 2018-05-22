/**
 */
package de.dfki.iui.basys.model.domain.topology.impl;

import de.dfki.iui.basys.model.domain.topology.*;

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
public class TopologyFactoryImpl extends EFactoryImpl implements TopologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopologyFactory init() {
		try {
			TopologyFactory theTopologyFactory = (TopologyFactory)EPackage.Registry.INSTANCE.getEFactory(TopologyPackage.eNS_URI);
			if (theTopologyFactory != null) {
				return theTopologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TopologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyFactoryImpl() {
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
			case TopologyPackage.ENTERPRISE: return createEnterprise();
			case TopologyPackage.SITE: return createSite();
			case TopologyPackage.AREA: return createArea();
			case TopologyPackage.PROCESS_CELL: return createProcessCell();
			case TopologyPackage.PRODUCTION_UNIT: return createProductionUnit();
			case TopologyPackage.PRODUCTION_LINE: return createProductionLine();
			case TopologyPackage.STORAGE_ZONE: return createStorageZone();
			case TopologyPackage.UNIT: return createUnit();
			case TopologyPackage.PROCESS_UNIT: return createProcessUnit();
			case TopologyPackage.STORAGE_UNIT: return createStorageUnit();
			case TopologyPackage.WORK_CELL: return createWorkCell();
			case TopologyPackage.EQUIPMENT_MODULE: return createEquipmentModule();
			case TopologyPackage.CONTROL_MODULE: return createControlModule();
			case TopologyPackage.STATION: return createStation();
			case TopologyPackage.AGV_STATION: return createAGVStation();
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
	public Station createStation() {
		StationImpl station = new StationImpl();
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGVStation createAGVStation() {
		AGVStationImpl agvStation = new AGVStationImpl();
		return agvStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessUnit createProcessUnit() {
		ProcessUnitImpl processUnit = new ProcessUnitImpl();
		return processUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPackage getTopologyPackage() {
		return (TopologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TopologyPackage getPackage() {
		return TopologyPackage.eINSTANCE;
	}

} //TopologyFactoryImpl
