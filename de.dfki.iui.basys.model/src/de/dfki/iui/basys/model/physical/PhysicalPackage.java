/**
 */
package de.dfki.iui.basys.model.physical;

import de.dfki.iui.basys.model.base.BasePackage;

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
 * @see de.dfki.iui.basys.model.physical.PhysicalFactory
 * @model kind="package"
 * @generated
 */
public interface PhysicalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "physical";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/physical";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "physical";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhysicalPackage eINSTANCE = de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.EnterpriseImpl <em>Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.EnterpriseImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getEnterprise()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.SiteImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getSite()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.AreaImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getArea()
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
	 * The feature id for the '<em><b>Work Centers</b></em>' containment reference.
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.WorkCenter <em>Work Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.WorkCenter
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getWorkCenter()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.ProcessCellImpl <em>Process Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.ProcessCellImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getProcessCell()
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
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__UNITS = WORK_CENTER_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.ProductionUnitImpl <em>Production Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.ProductionUnitImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getProductionUnit()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.ProductionLineImpl <em>Production Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.ProductionLineImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getProductionLine()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.StorageZoneImpl <em>Storage Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.StorageZoneImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getStorageZone()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.WorkUnit <em>Work Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.WorkUnit
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getWorkUnit()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.UnitImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getUnit()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.WorkCellImpl <em>Work Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.WorkCellImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getWorkCell()
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
	 * The number of structural features of the '<em>Work Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Work Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL_OPERATION_COUNT = WORK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.StorageUnitImpl <em>Storage Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.StorageUnitImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getStorageUnit()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.EquipmentModuleImpl <em>Equipment Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.EquipmentModuleImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getEquipmentModule()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.ControlModuleImpl <em>Control Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.ControlModuleImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getControlModule()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.ProductionLineSectionImpl <em>Production Line Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.ProductionLineSectionImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getProductionLineSection()
	 * @generated
	 */
	int PRODUCTION_LINE_SECTION = 14;

	/**
	 * The number of structural features of the '<em>Production Line Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_SECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Production Line Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.physical.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.physical.impl.StationImpl
	 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 15;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.Enterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise</em>'.
	 * @see de.dfki.iui.basys.model.physical.Enterprise
	 * @generated
	 */
	EClass getEnterprise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.physical.Enterprise#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sites</em>'.
	 * @see de.dfki.iui.basys.model.physical.Enterprise#getSites()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_Sites();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see de.dfki.iui.basys.model.physical.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.physical.Site#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see de.dfki.iui.basys.model.physical.Site#getAreas()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Areas();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see de.dfki.iui.basys.model.physical.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.physical.Area#getWorkCenters <em>Work Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Work Centers</em>'.
	 * @see de.dfki.iui.basys.model.physical.Area#getWorkCenters()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_WorkCenters();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.WorkCenter <em>Work Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Center</em>'.
	 * @see de.dfki.iui.basys.model.physical.WorkCenter
	 * @generated
	 */
	EClass getWorkCenter();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.ProcessCell <em>Process Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Cell</em>'.
	 * @see de.dfki.iui.basys.model.physical.ProcessCell
	 * @generated
	 */
	EClass getProcessCell();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.physical.ProcessCell#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see de.dfki.iui.basys.model.physical.ProcessCell#getUnits()
	 * @see #getProcessCell()
	 * @generated
	 */
	EReference getProcessCell_Units();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.ProductionUnit <em>Production Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Unit</em>'.
	 * @see de.dfki.iui.basys.model.physical.ProductionUnit
	 * @generated
	 */
	EClass getProductionUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.physical.ProductionUnit#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see de.dfki.iui.basys.model.physical.ProductionUnit#getUnits()
	 * @see #getProductionUnit()
	 * @generated
	 */
	EReference getProductionUnit_Units();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.ProductionLine <em>Production Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Line</em>'.
	 * @see de.dfki.iui.basys.model.physical.ProductionLine
	 * @generated
	 */
	EClass getProductionLine();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.physical.ProductionLine#getWorkCells <em>Work Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Cells</em>'.
	 * @see de.dfki.iui.basys.model.physical.ProductionLine#getWorkCells()
	 * @see #getProductionLine()
	 * @generated
	 */
	EReference getProductionLine_WorkCells();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.StorageZone <em>Storage Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Zone</em>'.
	 * @see de.dfki.iui.basys.model.physical.StorageZone
	 * @generated
	 */
	EClass getStorageZone();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.physical.StorageZone#getStorageUnits <em>Storage Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storage Units</em>'.
	 * @see de.dfki.iui.basys.model.physical.StorageZone#getStorageUnits()
	 * @see #getStorageZone()
	 * @generated
	 */
	EReference getStorageZone_StorageUnits();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.WorkUnit <em>Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Unit</em>'.
	 * @see de.dfki.iui.basys.model.physical.WorkUnit
	 * @generated
	 */
	EClass getWorkUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.physical.WorkUnit#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.iui.basys.model.physical.WorkUnit#getEquipmentModules()
	 * @see #getWorkUnit()
	 * @generated
	 */
	EReference getWorkUnit_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see de.dfki.iui.basys.model.physical.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.WorkCell <em>Work Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Cell</em>'.
	 * @see de.dfki.iui.basys.model.physical.WorkCell
	 * @generated
	 */
	EClass getWorkCell();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.StorageUnit <em>Storage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Unit</em>'.
	 * @see de.dfki.iui.basys.model.physical.StorageUnit
	 * @generated
	 */
	EClass getStorageUnit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.EquipmentModule <em>Equipment Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment Module</em>'.
	 * @see de.dfki.iui.basys.model.physical.EquipmentModule
	 * @generated
	 */
	EClass getEquipmentModule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.physical.EquipmentModule#getControlModules <em>Control Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Modules</em>'.
	 * @see de.dfki.iui.basys.model.physical.EquipmentModule#getControlModules()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_ControlModules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.physical.EquipmentModule#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.iui.basys.model.physical.EquipmentModule#getEquipmentModules()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.ControlModule <em>Control Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Module</em>'.
	 * @see de.dfki.iui.basys.model.physical.ControlModule
	 * @generated
	 */
	EClass getControlModule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.physical.ControlModule#getControlModules <em>Control Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Modules</em>'.
	 * @see de.dfki.iui.basys.model.physical.ControlModule#getControlModules()
	 * @see #getControlModule()
	 * @generated
	 */
	EReference getControlModule_ControlModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.ProductionLineSection <em>Production Line Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Line Section</em>'.
	 * @see de.dfki.iui.basys.model.physical.ProductionLineSection
	 * @generated
	 */
	EClass getProductionLineSection();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.physical.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see de.dfki.iui.basys.model.physical.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhysicalFactory getPhysicalFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.EnterpriseImpl <em>Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.EnterpriseImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getEnterprise()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.SiteImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getSite()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.AreaImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Work Centers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__WORK_CENTERS = eINSTANCE.getArea_WorkCenters();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.WorkCenter <em>Work Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.WorkCenter
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getWorkCenter()
		 * @generated
		 */
		EClass WORK_CENTER = eINSTANCE.getWorkCenter();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.ProcessCellImpl <em>Process Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.ProcessCellImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getProcessCell()
		 * @generated
		 */
		EClass PROCESS_CELL = eINSTANCE.getProcessCell();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_CELL__UNITS = eINSTANCE.getProcessCell_Units();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.ProductionUnitImpl <em>Production Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.ProductionUnitImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getProductionUnit()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.ProductionLineImpl <em>Production Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.ProductionLineImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getProductionLine()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.StorageZoneImpl <em>Storage Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.StorageZoneImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getStorageZone()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.WorkUnit <em>Work Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.WorkUnit
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getWorkUnit()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.UnitImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.WorkCellImpl <em>Work Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.WorkCellImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getWorkCell()
		 * @generated
		 */
		EClass WORK_CELL = eINSTANCE.getWorkCell();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.StorageUnitImpl <em>Storage Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.StorageUnitImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getStorageUnit()
		 * @generated
		 */
		EClass STORAGE_UNIT = eINSTANCE.getStorageUnit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.EquipmentModuleImpl <em>Equipment Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.EquipmentModuleImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getEquipmentModule()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.ControlModuleImpl <em>Control Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.ControlModuleImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getControlModule()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.ProductionLineSectionImpl <em>Production Line Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.ProductionLineSectionImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getProductionLineSection()
		 * @generated
		 */
		EClass PRODUCTION_LINE_SECTION = eINSTANCE.getProductionLineSection();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.physical.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.physical.impl.StationImpl
		 * @see de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

	}

} //PhysicalPackage
