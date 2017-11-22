/**
 */
package de.dfki.iui.basys.model.domain.topology;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.topology.TopologyFactory
 * @model kind="package"
 * @generated
 */
public interface TopologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "topology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/topology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "topology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopologyPackage eINSTANCE = de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.EnterpriseImpl <em>Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.EnterpriseImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getEnterprise()
	 * @generated
	 */
	int ENTERPRISE = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Sites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__SITES = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.SiteImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__AREAS = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.AreaImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Work Centers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__WORK_CENTERS = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.WorkCenterImpl <em>Work Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.WorkCenterImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getWorkCenter()
	 * @generated
	 */
	int WORK_CENTER = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The number of structural features of the '<em>Work Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Work Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ProcessCellImpl <em>Process Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.ProcessCellImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getProcessCell()
	 * @generated
	 */
	int PROCESS_CELL = 4;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__METADATA = WORK_CENTER__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Process Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__PROCESS_UNITS = WORK_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL_FEATURE_COUNT = WORK_CENTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL_OPERATION_COUNT = WORK_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ProductionUnitImpl <em>Production Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.ProductionUnitImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getProductionUnit()
	 * @generated
	 */
	int PRODUCTION_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__METADATA = WORK_CENTER__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__UNITS = WORK_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Production Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT_FEATURE_COUNT = WORK_CENTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Production Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT_OPERATION_COUNT = WORK_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ProductionLineImpl <em>Production Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.ProductionLineImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getProductionLine()
	 * @generated
	 */
	int PRODUCTION_LINE = 6;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__METADATA = WORK_CENTER__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Work Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__WORK_CELLS = WORK_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Production Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_FEATURE_COUNT = WORK_CENTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Production Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_OPERATION_COUNT = WORK_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StorageZoneImpl <em>Storage Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.StorageZoneImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStorageZone()
	 * @generated
	 */
	int STORAGE_ZONE = 7;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__METADATA = WORK_CENTER__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Storage Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__STORAGE_UNITS = WORK_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE_FEATURE_COUNT = WORK_CENTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Storage Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE_OPERATION_COUNT = WORK_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.WorkUnitImpl <em>Work Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.WorkUnitImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getWorkUnit()
	 * @generated
	 */
	int WORK_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__EQUIPMENT_MODULES = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.UnitImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 9;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__METADATA = WORK_UNIT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__EQUIPMENT_MODULES = WORK_UNIT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = WORK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.WorkCellImpl <em>Work Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.WorkCellImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getWorkCell()
	 * @generated
	 */
	int WORK_CELL = 10;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__METADATA = WORK_UNIT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__EQUIPMENT_MODULES = WORK_UNIT__EQUIPMENT_MODULES;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__STATIONS = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL_OPERATION_COUNT = WORK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StorageUnitImpl <em>Storage Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.StorageUnitImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStorageUnit()
	 * @generated
	 */
	int STORAGE_UNIT = 11;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__METADATA = WORK_UNIT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__EQUIPMENT_MODULES = WORK_UNIT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Storage Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT_OPERATION_COUNT = WORK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.EquipmentModule <em>Equipment Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.EquipmentModule
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getEquipmentModule()
	 * @generated
	 */
	int EQUIPMENT_MODULE = 12;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__CONTROL_MODULES = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__EQUIPMENT_MODULES = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.ControlModule <em>Control Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.ControlModule
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getControlModule()
	 * @generated
	 */
	int CONTROL_MODULE = 13;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__CONTROL_MODULES = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.StationImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 14;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__EQUIPMENT_MODULES = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TransitionImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 15;

	/**
	 * The feature id for the '<em><b>Component Id src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COMPONENT_ID_SRC = 0;

	/**
	 * The feature id for the '<em><b>Component Id target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COMPONENT_ID_TARGET = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DISTANCE = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.AssemblyStationImpl <em>Assembly Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.AssemblyStationImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getAssemblyStation()
	 * @generated
	 */
	int ASSEMBLY_STATION = 16;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_STATION__METADATA = STATION__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_STATION__ID = STATION__ID;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_STATION__EQUIPMENT_MODULES = STATION__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Assembly Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_STATION_FEATURE_COUNT = STATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assembly Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_STATION_OPERATION_COUNT = STATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.BufferStationImpl <em>Buffer Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.BufferStationImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getBufferStation()
	 * @generated
	 */
	int BUFFER_STATION = 17;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_STATION__METADATA = STATION__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_STATION__ID = STATION__ID;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_STATION__EQUIPMENT_MODULES = STATION__EQUIPMENT_MODULES;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_STATION__CAPACITY = STATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Buffer Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_STATION_FEATURE_COUNT = STATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Buffer Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_STATION_OPERATION_COUNT = STATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ProcessUnitImpl <em>Process Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.ProcessUnitImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getProcessUnit()
	 * @generated
	 */
	int PROCESS_UNIT = 18;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT__METADATA = WORK_UNIT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT__EQUIPMENT_MODULES = WORK_UNIT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Process Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT_OPERATION_COUNT = WORK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.DiscreteManufacturingEquipmentModule <em>Discrete Manufacturing Equipment Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.DiscreteManufacturingEquipmentModule
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getDiscreteManufacturingEquipmentModule()
	 * @generated
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE = 19;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA = EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID = EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CONTROL_MODULES = EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__EQUIPMENT_MODULES = EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Discrete Manufacturing Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT = EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discrete Manufacturing Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT = EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.ToolImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 20;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CONTROL_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__EQUIPMENT_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StationaryToolImpl <em>Stationary Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.StationaryToolImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStationaryTool()
	 * @generated
	 */
	int STATIONARY_TOOL = 21;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__METADATA = TOOL__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__ID = TOOL__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__CONTROL_MODULES = TOOL__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__EQUIPMENT_MODULES = TOOL__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Stationary Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL_FEATURE_COUNT = TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stationary Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL_OPERATION_COUNT = TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.MovableToolImpl <em>Movable Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.MovableToolImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getMovableTool()
	 * @generated
	 */
	int MOVABLE_TOOL = 22;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__METADATA = TOOL__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__ID = TOOL__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__CONTROL_MODULES = TOOL__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__EQUIPMENT_MODULES = TOOL__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Movable Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL_FEATURE_COUNT = TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Movable Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL_OPERATION_COUNT = TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.TransportImpl <em>Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TransportImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getTransport()
	 * @generated
	 */
	int TRANSPORT = 23;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__CONTROL_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__EQUIPMENT_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_FEATURE_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_OPERATION_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.StorageImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 24;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CONTROL_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__EQUIPMENT_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.FixtureImpl <em>Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.FixtureImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getFixture()
	 * @generated
	 */
	int FIXTURE = 25;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__CONTROL_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__EQUIPMENT_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_FEATURE_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_OPERATION_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.GateImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 26;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CONTROL_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__EQUIPMENT_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.RobotImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 27;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__CONTROL_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__EQUIPMENT_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.CarrierImpl <em>Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.CarrierImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getCarrier()
	 * @generated
	 */
	int CARRIER = 28;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__CONTROL_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__EQUIPMENT_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_FEATURE_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_OPERATION_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.MachineImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 29;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CONTROL_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__EQUIPMENT_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StaticObjectImpl <em>Static Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.StaticObjectImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStaticObject()
	 * @generated
	 */
	int STATIC_OBJECT = 30;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__CONTROL_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__EQUIPMENT_MODULES = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Static Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT_FEATURE_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Static Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT_OPERATION_COUNT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.HorizontalTransportImpl <em>Horizontal Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.HorizontalTransportImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getHorizontalTransport()
	 * @generated
	 */
	int HORIZONTAL_TRANSPORT = 39;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__METADATA = TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__ID = TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__CONTROL_MODULES = TRANSPORT__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__EQUIPMENT_MODULES = TRANSPORT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Horizontal Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT_FEATURE_COUNT = TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT_OPERATION_COUNT = TRANSPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.TurnableImpl <em>Turnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TurnableImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getTurnable()
	 * @generated
	 */
	int TURNABLE = 31;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__METADATA = HORIZONTAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__ID = HORIZONTAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__CONTROL_MODULES = HORIZONTAL_TRANSPORT__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__EQUIPMENT_MODULES = HORIZONTAL_TRANSPORT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Turnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE_FEATURE_COUNT = HORIZONTAL_TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE_OPERATION_COUNT = HORIZONTAL_TRANSPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.ConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 32;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__METADATA = HORIZONTAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__ID = HORIZONTAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__CONTROL_MODULES = HORIZONTAL_TRANSPORT__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__EQUIPMENT_MODULES = HORIZONTAL_TRANSPORT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = HORIZONTAL_TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = HORIZONTAL_TRANSPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.VerticalTransportImpl <em>Vertical Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.VerticalTransportImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getVerticalTransport()
	 * @generated
	 */
	int VERTICAL_TRANSPORT = 38;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__METADATA = TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__ID = TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__CONTROL_MODULES = TRANSPORT__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__EQUIPMENT_MODULES = TRANSPORT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Vertical Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT_FEATURE_COUNT = TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vertical Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT_OPERATION_COUNT = TRANSPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.LiftingTableImpl <em>Lifting Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.LiftingTableImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getLiftingTable()
	 * @generated
	 */
	int LIFTING_TABLE = 33;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__METADATA = VERTICAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__ID = VERTICAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__CONTROL_MODULES = VERTICAL_TRANSPORT__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__EQUIPMENT_MODULES = VERTICAL_TRANSPORT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Lifting Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE_FEATURE_COUNT = VERTICAL_TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lifting Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE_OPERATION_COUNT = VERTICAL_TRANSPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.AVGImpl <em>AVG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.AVGImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getAVG()
	 * @generated
	 */
	int AVG = 34;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__METADATA = HORIZONTAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__ID = HORIZONTAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__CONTROL_MODULES = HORIZONTAL_TRANSPORT__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__EQUIPMENT_MODULES = HORIZONTAL_TRANSPORT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>AVG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_FEATURE_COUNT = HORIZONTAL_TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AVG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_OPERATION_COUNT = HORIZONTAL_TRANSPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.TransposerImpl <em>Transposer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TransposerImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getTransposer()
	 * @generated
	 */
	int TRANSPOSER = 35;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__METADATA = TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__ID = TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__CONTROL_MODULES = TRANSPORT__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__EQUIPMENT_MODULES = TRANSPORT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Transposer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER_FEATURE_COUNT = TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transposer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER_OPERATION_COUNT = TRANSPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.CarrierHandlingSystemImpl <em>Carrier Handling System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.CarrierHandlingSystemImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getCarrierHandlingSystem()
	 * @generated
	 */
	int CARRIER_HANDLING_SYSTEM = 36;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__METADATA = TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__ID = TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__CONTROL_MODULES = TRANSPORT__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__EQUIPMENT_MODULES = TRANSPORT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Carrier Handling System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM_FEATURE_COUNT = TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Carrier Handling System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM_OPERATION_COUNT = TRANSPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.LiftImpl <em>Lift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.LiftImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getLift()
	 * @generated
	 */
	int LIFT = 37;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__METADATA = VERTICAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__ID = VERTICAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__CONTROL_MODULES = VERTICAL_TRANSPORT__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__EQUIPMENT_MODULES = VERTICAL_TRANSPORT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Lift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_FEATURE_COUNT = VERTICAL_TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_OPERATION_COUNT = VERTICAL_TRANSPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.RollerbedImpl <em>Rollerbed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.RollerbedImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getRollerbed()
	 * @generated
	 */
	int ROLLERBED = 40;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__METADATA = HORIZONTAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__ID = HORIZONTAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__CONTROL_MODULES = HORIZONTAL_TRANSPORT__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__EQUIPMENT_MODULES = HORIZONTAL_TRANSPORT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Rollerbed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED_FEATURE_COUNT = HORIZONTAL_TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rollerbed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED_OPERATION_COUNT = HORIZONTAL_TRANSPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.LoaderImpl <em>Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.LoaderImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getLoader()
	 * @generated
	 */
	int LOADER = 41;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__METADATA = STORAGE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__ID = STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__CONTROL_MODULES = STORAGE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__EQUIPMENT_MODULES = STORAGE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER_FEATURE_COUNT = STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER_OPERATION_COUNT = STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.UnloaderImpl <em>Unloader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.UnloaderImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getUnloader()
	 * @generated
	 */
	int UNLOADER = 42;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__METADATA = STORAGE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__ID = STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__CONTROL_MODULES = STORAGE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__EQUIPMENT_MODULES = STORAGE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Unloader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER_FEATURE_COUNT = STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unloader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER_OPERATION_COUNT = STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.BodyStoreImpl <em>Body Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.BodyStoreImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getBodyStore()
	 * @generated
	 */
	int BODY_STORE = 43;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__METADATA = STORAGE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__ID = STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__CONTROL_MODULES = STORAGE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__EQUIPMENT_MODULES = STORAGE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Body Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE_FEATURE_COUNT = STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Body Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE_OPERATION_COUNT = STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ClampImpl <em>Clamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.ClampImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getClamp()
	 * @generated
	 */
	int CLAMP = 44;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__METADATA = FIXTURE__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__ID = FIXTURE__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__CONTROL_MODULES = FIXTURE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__EQUIPMENT_MODULES = FIXTURE__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Clamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP_FEATURE_COUNT = FIXTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP_OPERATION_COUNT = FIXTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.BeltConveyorImpl <em>Belt Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.BeltConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getBeltConveyor()
	 * @generated
	 */
	int BELT_CONVEYOR = 45;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__METADATA = CONVEYOR__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__ID = CONVEYOR__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__CONTROL_MODULES = CONVEYOR__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__EQUIPMENT_MODULES = CONVEYOR__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Belt Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR_FEATURE_COUNT = CONVEYOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Belt Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR_OPERATION_COUNT = CONVEYOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.RollConveyorImpl <em>Roll Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.RollConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getRollConveyor()
	 * @generated
	 */
	int ROLL_CONVEYOR = 46;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__METADATA = CONVEYOR__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__ID = CONVEYOR__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__CONTROL_MODULES = CONVEYOR__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__EQUIPMENT_MODULES = CONVEYOR__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Roll Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR_FEATURE_COUNT = CONVEYOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Roll Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR_OPERATION_COUNT = CONVEYOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ChainConveyorImpl <em>Chain Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.ChainConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getChainConveyor()
	 * @generated
	 */
	int CHAIN_CONVEYOR = 47;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__METADATA = CONVEYOR__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__ID = CONVEYOR__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__CONTROL_MODULES = CONVEYOR__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__EQUIPMENT_MODULES = CONVEYOR__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Chain Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR_FEATURE_COUNT = CONVEYOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chain Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR_OPERATION_COUNT = CONVEYOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.PalletConveyorImpl <em>Pallet Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.PalletConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getPalletConveyor()
	 * @generated
	 */
	int PALLET_CONVEYOR = 48;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__METADATA = CONVEYOR__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__ID = CONVEYOR__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__CONTROL_MODULES = CONVEYOR__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__EQUIPMENT_MODULES = CONVEYOR__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Pallet Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR_FEATURE_COUNT = CONVEYOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pallet Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR_OPERATION_COUNT = CONVEYOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.topology.impl.OverheadConveyorImpl <em>Overhead Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.topology.impl.OverheadConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getOverheadConveyor()
	 * @generated
	 */
	int OVERHEAD_CONVEYOR = 49;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__METADATA = CONVEYOR__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__ID = CONVEYOR__ID;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__CONTROL_MODULES = CONVEYOR__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__EQUIPMENT_MODULES = CONVEYOR__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Overhead Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR_FEATURE_COUNT = CONVEYOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Overhead Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR_OPERATION_COUNT = CONVEYOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Enterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Enterprise
	 * @generated
	 */
	EClass getEnterprise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.Enterprise#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sites</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Enterprise#getSites()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_Sites();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.Site#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Site#getAreas()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Areas();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.Area#getWorkCenters <em>Work Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Centers</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Area#getWorkCenters()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_WorkCenters();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.WorkCenter <em>Work Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Center</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.WorkCenter
	 * @generated
	 */
	EClass getWorkCenter();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.ProcessCell <em>Process Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Cell</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.ProcessCell
	 * @generated
	 */
	EClass getProcessCell();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.ProcessCell#getProcessUnits <em>Process Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Units</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.ProcessCell#getProcessUnits()
	 * @see #getProcessCell()
	 * @generated
	 */
	EReference getProcessCell_ProcessUnits();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.ProductionUnit <em>Production Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.ProductionUnit
	 * @generated
	 */
	EClass getProductionUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.ProductionUnit#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.ProductionUnit#getUnits()
	 * @see #getProductionUnit()
	 * @generated
	 */
	EReference getProductionUnit_Units();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.ProductionLine <em>Production Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Line</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.ProductionLine
	 * @generated
	 */
	EClass getProductionLine();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.ProductionLine#getWorkCells <em>Work Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Cells</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.ProductionLine#getWorkCells()
	 * @see #getProductionLine()
	 * @generated
	 */
	EReference getProductionLine_WorkCells();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.StorageZone <em>Storage Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Zone</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.StorageZone
	 * @generated
	 */
	EClass getStorageZone();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.StorageZone#getStorageUnits <em>Storage Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storage Units</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.StorageZone#getStorageUnits()
	 * @see #getStorageZone()
	 * @generated
	 */
	EReference getStorageZone_StorageUnits();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.WorkUnit <em>Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.WorkUnit
	 * @generated
	 */
	EClass getWorkUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.WorkUnit#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.WorkUnit#getEquipmentModules()
	 * @see #getWorkUnit()
	 * @generated
	 */
	EReference getWorkUnit_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.WorkCell <em>Work Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Cell</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.WorkCell
	 * @generated
	 */
	EClass getWorkCell();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.WorkCell#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.WorkCell#getStations()
	 * @see #getWorkCell()
	 * @generated
	 */
	EReference getWorkCell_Stations();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.StorageUnit <em>Storage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.StorageUnit
	 * @generated
	 */
	EClass getStorageUnit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.EquipmentModule <em>Equipment Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment Module</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.EquipmentModule
	 * @generated
	 */
	EClass getEquipmentModule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.EquipmentModule#getControlModules <em>Control Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Modules</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.EquipmentModule#getControlModules()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_ControlModules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.EquipmentModule#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.EquipmentModule#getEquipmentModules()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.ControlModule <em>Control Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Module</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.ControlModule
	 * @generated
	 */
	EClass getControlModule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.ControlModule#getControlModules <em>Control Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Modules</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.ControlModule#getControlModules()
	 * @see #getControlModule()
	 * @generated
	 */
	EReference getControlModule_ControlModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.topology.Station#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Station#getEquipmentModules()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.topology.Transition#getComponentId_src <em>Component Id src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id src</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Transition#getComponentId_src()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ComponentId_src();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.topology.Transition#getComponentId_target <em>Component Id target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id target</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Transition#getComponentId_target()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ComponentId_target();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.topology.Transition#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Transition#getDistance()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Distance();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.AssemblyStation <em>Assembly Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Station</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.AssemblyStation
	 * @generated
	 */
	EClass getAssemblyStation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.BufferStation <em>Buffer Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Station</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.BufferStation
	 * @generated
	 */
	EClass getBufferStation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.topology.BufferStation#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.BufferStation#getCapacity()
	 * @see #getBufferStation()
	 * @generated
	 */
	EAttribute getBufferStation_Capacity();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.ProcessUnit <em>Process Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.ProcessUnit
	 * @generated
	 */
	EClass getProcessUnit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.DiscreteManufacturingEquipmentModule <em>Discrete Manufacturing Equipment Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Manufacturing Equipment Module</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.DiscreteManufacturingEquipmentModule
	 * @generated
	 */
	EClass getDiscreteManufacturingEquipmentModule();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.StationaryTool <em>Stationary Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stationary Tool</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.StationaryTool
	 * @generated
	 */
	EClass getStationaryTool();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.MovableTool <em>Movable Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movable Tool</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.MovableTool
	 * @generated
	 */
	EClass getMovableTool();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Transport
	 * @generated
	 */
	EClass getTransport();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Fixture
	 * @generated
	 */
	EClass getFixture();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Carrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Carrier
	 * @generated
	 */
	EClass getCarrier();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.StaticObject <em>Static Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Object</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.StaticObject
	 * @generated
	 */
	EClass getStaticObject();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Turnable <em>Turnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnable</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Turnable
	 * @generated
	 */
	EClass getTurnable();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.LiftingTable <em>Lifting Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifting Table</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.LiftingTable
	 * @generated
	 */
	EClass getLiftingTable();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.AVG <em>AVG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVG</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.AVG
	 * @generated
	 */
	EClass getAVG();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Transposer <em>Transposer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transposer</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Transposer
	 * @generated
	 */
	EClass getTransposer();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.CarrierHandlingSystem <em>Carrier Handling System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Handling System</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.CarrierHandlingSystem
	 * @generated
	 */
	EClass getCarrierHandlingSystem();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Lift <em>Lift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lift</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Lift
	 * @generated
	 */
	EClass getLift();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.VerticalTransport <em>Vertical Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Transport</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.VerticalTransport
	 * @generated
	 */
	EClass getVerticalTransport();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.HorizontalTransport <em>Horizontal Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Transport</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.HorizontalTransport
	 * @generated
	 */
	EClass getHorizontalTransport();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Rollerbed <em>Rollerbed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rollerbed</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Rollerbed
	 * @generated
	 */
	EClass getRollerbed();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Loader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loader</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Loader
	 * @generated
	 */
	EClass getLoader();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Unloader <em>Unloader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unloader</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Unloader
	 * @generated
	 */
	EClass getUnloader();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.BodyStore <em>Body Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Store</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.BodyStore
	 * @generated
	 */
	EClass getBodyStore();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.Clamp <em>Clamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.Clamp
	 * @generated
	 */
	EClass getClamp();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.BeltConveyor <em>Belt Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belt Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.BeltConveyor
	 * @generated
	 */
	EClass getBeltConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.RollConveyor <em>Roll Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roll Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.RollConveyor
	 * @generated
	 */
	EClass getRollConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.ChainConveyor <em>Chain Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.ChainConveyor
	 * @generated
	 */
	EClass getChainConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.PalletConveyor <em>Pallet Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pallet Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.PalletConveyor
	 * @generated
	 */
	EClass getPalletConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.topology.OverheadConveyor <em>Overhead Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overhead Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.topology.OverheadConveyor
	 * @generated
	 */
	EClass getOverheadConveyor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TopologyFactory getTopologyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.EnterpriseImpl <em>Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.EnterpriseImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getEnterprise()
		 * @generated
		 */
		EClass ENTERPRISE = eINSTANCE.getEnterprise();

		/**
		 * The meta object literal for the '<em><b>Sites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE__SITES = eINSTANCE.getEnterprise_Sites();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.SiteImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__AREAS = eINSTANCE.getSite_Areas();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.AreaImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Work Centers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__WORK_CENTERS = eINSTANCE.getArea_WorkCenters();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.WorkCenterImpl <em>Work Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.WorkCenterImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getWorkCenter()
		 * @generated
		 */
		EClass WORK_CENTER = eINSTANCE.getWorkCenter();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ProcessCellImpl <em>Process Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.ProcessCellImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getProcessCell()
		 * @generated
		 */
		EClass PROCESS_CELL = eINSTANCE.getProcessCell();

		/**
		 * The meta object literal for the '<em><b>Process Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_CELL__PROCESS_UNITS = eINSTANCE.getProcessCell_ProcessUnits();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ProductionUnitImpl <em>Production Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.ProductionUnitImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getProductionUnit()
		 * @generated
		 */
		EClass PRODUCTION_UNIT = eINSTANCE.getProductionUnit();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_UNIT__UNITS = eINSTANCE.getProductionUnit_Units();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ProductionLineImpl <em>Production Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.ProductionLineImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getProductionLine()
		 * @generated
		 */
		EClass PRODUCTION_LINE = eINSTANCE.getProductionLine();

		/**
		 * The meta object literal for the '<em><b>Work Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE__WORK_CELLS = eINSTANCE.getProductionLine_WorkCells();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StorageZoneImpl <em>Storage Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.StorageZoneImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStorageZone()
		 * @generated
		 */
		EClass STORAGE_ZONE = eINSTANCE.getStorageZone();

		/**
		 * The meta object literal for the '<em><b>Storage Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_ZONE__STORAGE_UNITS = eINSTANCE.getStorageZone_StorageUnits();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.WorkUnitImpl <em>Work Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.WorkUnitImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getWorkUnit()
		 * @generated
		 */
		EClass WORK_UNIT = eINSTANCE.getWorkUnit();

		/**
		 * The meta object literal for the '<em><b>Equipment Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_UNIT__EQUIPMENT_MODULES = eINSTANCE.getWorkUnit_EquipmentModules();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.UnitImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.WorkCellImpl <em>Work Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.WorkCellImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getWorkCell()
		 * @generated
		 */
		EClass WORK_CELL = eINSTANCE.getWorkCell();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_CELL__STATIONS = eINSTANCE.getWorkCell_Stations();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StorageUnitImpl <em>Storage Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.StorageUnitImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStorageUnit()
		 * @generated
		 */
		EClass STORAGE_UNIT = eINSTANCE.getStorageUnit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.EquipmentModule <em>Equipment Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.EquipmentModule
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getEquipmentModule()
		 * @generated
		 */
		EClass EQUIPMENT_MODULE = eINSTANCE.getEquipmentModule();

		/**
		 * The meta object literal for the '<em><b>Control Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_MODULE__CONTROL_MODULES = eINSTANCE.getEquipmentModule_ControlModules();

		/**
		 * The meta object literal for the '<em><b>Equipment Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_MODULE__EQUIPMENT_MODULES = eINSTANCE.getEquipmentModule_EquipmentModules();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.ControlModule <em>Control Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.ControlModule
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getControlModule()
		 * @generated
		 */
		EClass CONTROL_MODULE = eINSTANCE.getControlModule();

		/**
		 * The meta object literal for the '<em><b>Control Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MODULE__CONTROL_MODULES = eINSTANCE.getControlModule_ControlModules();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.StationImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Equipment Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__EQUIPMENT_MODULES = eINSTANCE.getStation_EquipmentModules();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TransitionImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Component Id src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__COMPONENT_ID_SRC = eINSTANCE.getTransition_ComponentId_src();

		/**
		 * The meta object literal for the '<em><b>Component Id target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__COMPONENT_ID_TARGET = eINSTANCE.getTransition_ComponentId_target();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__DISTANCE = eINSTANCE.getTransition_Distance();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.AssemblyStationImpl <em>Assembly Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.AssemblyStationImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getAssemblyStation()
		 * @generated
		 */
		EClass ASSEMBLY_STATION = eINSTANCE.getAssemblyStation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.BufferStationImpl <em>Buffer Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.BufferStationImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getBufferStation()
		 * @generated
		 */
		EClass BUFFER_STATION = eINSTANCE.getBufferStation();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER_STATION__CAPACITY = eINSTANCE.getBufferStation_Capacity();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ProcessUnitImpl <em>Process Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.ProcessUnitImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getProcessUnit()
		 * @generated
		 */
		EClass PROCESS_UNIT = eINSTANCE.getProcessUnit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.DiscreteManufacturingEquipmentModule <em>Discrete Manufacturing Equipment Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.DiscreteManufacturingEquipmentModule
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getDiscreteManufacturingEquipmentModule()
		 * @generated
		 */
		EClass DISCRETE_MANUFACTURING_EQUIPMENT_MODULE = eINSTANCE.getDiscreteManufacturingEquipmentModule();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.ToolImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StationaryToolImpl <em>Stationary Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.StationaryToolImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStationaryTool()
		 * @generated
		 */
		EClass STATIONARY_TOOL = eINSTANCE.getStationaryTool();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.MovableToolImpl <em>Movable Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.MovableToolImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getMovableTool()
		 * @generated
		 */
		EClass MOVABLE_TOOL = eINSTANCE.getMovableTool();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.TransportImpl <em>Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TransportImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getTransport()
		 * @generated
		 */
		EClass TRANSPORT = eINSTANCE.getTransport();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.StorageImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.FixtureImpl <em>Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.FixtureImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getFixture()
		 * @generated
		 */
		EClass FIXTURE = eINSTANCE.getFixture();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.GateImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.RobotImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.CarrierImpl <em>Carrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.CarrierImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getCarrier()
		 * @generated
		 */
		EClass CARRIER = eINSTANCE.getCarrier();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.MachineImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.StaticObjectImpl <em>Static Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.StaticObjectImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getStaticObject()
		 * @generated
		 */
		EClass STATIC_OBJECT = eINSTANCE.getStaticObject();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.TurnableImpl <em>Turnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TurnableImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getTurnable()
		 * @generated
		 */
		EClass TURNABLE = eINSTANCE.getTurnable();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.ConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.LiftingTableImpl <em>Lifting Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.LiftingTableImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getLiftingTable()
		 * @generated
		 */
		EClass LIFTING_TABLE = eINSTANCE.getLiftingTable();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.AVGImpl <em>AVG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.AVGImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getAVG()
		 * @generated
		 */
		EClass AVG = eINSTANCE.getAVG();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.TransposerImpl <em>Transposer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TransposerImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getTransposer()
		 * @generated
		 */
		EClass TRANSPOSER = eINSTANCE.getTransposer();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.CarrierHandlingSystemImpl <em>Carrier Handling System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.CarrierHandlingSystemImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getCarrierHandlingSystem()
		 * @generated
		 */
		EClass CARRIER_HANDLING_SYSTEM = eINSTANCE.getCarrierHandlingSystem();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.LiftImpl <em>Lift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.LiftImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getLift()
		 * @generated
		 */
		EClass LIFT = eINSTANCE.getLift();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.VerticalTransportImpl <em>Vertical Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.VerticalTransportImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getVerticalTransport()
		 * @generated
		 */
		EClass VERTICAL_TRANSPORT = eINSTANCE.getVerticalTransport();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.HorizontalTransportImpl <em>Horizontal Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.HorizontalTransportImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getHorizontalTransport()
		 * @generated
		 */
		EClass HORIZONTAL_TRANSPORT = eINSTANCE.getHorizontalTransport();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.RollerbedImpl <em>Rollerbed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.RollerbedImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getRollerbed()
		 * @generated
		 */
		EClass ROLLERBED = eINSTANCE.getRollerbed();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.LoaderImpl <em>Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.LoaderImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getLoader()
		 * @generated
		 */
		EClass LOADER = eINSTANCE.getLoader();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.UnloaderImpl <em>Unloader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.UnloaderImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getUnloader()
		 * @generated
		 */
		EClass UNLOADER = eINSTANCE.getUnloader();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.BodyStoreImpl <em>Body Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.BodyStoreImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getBodyStore()
		 * @generated
		 */
		EClass BODY_STORE = eINSTANCE.getBodyStore();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ClampImpl <em>Clamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.ClampImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getClamp()
		 * @generated
		 */
		EClass CLAMP = eINSTANCE.getClamp();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.BeltConveyorImpl <em>Belt Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.BeltConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getBeltConveyor()
		 * @generated
		 */
		EClass BELT_CONVEYOR = eINSTANCE.getBeltConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.RollConveyorImpl <em>Roll Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.RollConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getRollConveyor()
		 * @generated
		 */
		EClass ROLL_CONVEYOR = eINSTANCE.getRollConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.ChainConveyorImpl <em>Chain Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.ChainConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getChainConveyor()
		 * @generated
		 */
		EClass CHAIN_CONVEYOR = eINSTANCE.getChainConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.PalletConveyorImpl <em>Pallet Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.PalletConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getPalletConveyor()
		 * @generated
		 */
		EClass PALLET_CONVEYOR = eINSTANCE.getPalletConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.topology.impl.OverheadConveyorImpl <em>Overhead Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.topology.impl.OverheadConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl#getOverheadConveyor()
		 * @generated
		 */
		EClass OVERHEAD_CONVEYOR = eINSTANCE.getOverheadConveyor();

	}

} //TopologyPackage
