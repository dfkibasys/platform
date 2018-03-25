/**
 */
package de.dfki.iui.basys.model.domain.roletopology;

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
 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyFactory
 * @model kind="package"
 * @generated
 */
public interface RoletopologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roletopology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/roletopology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roletopology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoletopologyPackage eINSTANCE = de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.EnterpriseImpl <em>Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.EnterpriseImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getEnterprise()
	 * @generated
	 */
	int ENTERPRISE = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Sites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__SITES = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.SiteImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__AREAS = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.AreaImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Work Centers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__WORK_CENTERS = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Discretemanufacturingequipmentmodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__DISCRETEMANUFACTURINGEQUIPMENTMODULES = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.WorkCenterImpl <em>Work Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.WorkCenterImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getWorkCenter()
	 * @generated
	 */
	int WORK_CENTER = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The number of structural features of the '<em>Work Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Work Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.ProcessCellImpl <em>Process Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.ProcessCellImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getProcessCell()
	 * @generated
	 */
	int PROCESS_CELL = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__BINDING = WORK_CENTER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__NAME = WORK_CENTER__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__METADATA = WORK_CENTER__METADATA;

	/**
	 * The number of structural features of the '<em>Process Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL_FEATURE_COUNT = WORK_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL_OPERATION_COUNT = WORK_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.ProductionUnitImpl <em>Production Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.ProductionUnitImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getProductionUnit()
	 * @generated
	 */
	int PRODUCTION_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__BINDING = WORK_CENTER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__NAME = WORK_CENTER__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__METADATA = WORK_CENTER__METADATA;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.ProductionLineImpl <em>Production Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.ProductionLineImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getProductionLine()
	 * @generated
	 */
	int PRODUCTION_LINE = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__BINDING = WORK_CENTER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__NAME = WORK_CENTER__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__METADATA = WORK_CENTER__METADATA;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.StorageZoneImpl <em>Storage Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.StorageZoneImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getStorageZone()
	 * @generated
	 */
	int STORAGE_ZONE = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__BINDING = WORK_CENTER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__NAME = WORK_CENTER__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__METADATA = WORK_CENTER__METADATA;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.WorkUnitImpl <em>Work Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.WorkUnitImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getWorkUnit()
	 * @generated
	 */
	int WORK_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__EQUIPMENT_MODULES = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.UnitImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__BINDING = WORK_UNIT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__METADATA = WORK_UNIT__METADATA;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.WorkCellImpl <em>Work Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.WorkCellImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getWorkCell()
	 * @generated
	 */
	int WORK_CELL = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__BINDING = WORK_UNIT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__METADATA = WORK_UNIT__METADATA;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.StorageUnitImpl <em>Storage Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.StorageUnitImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getStorageUnit()
	 * @generated
	 */
	int STORAGE_UNIT = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__BINDING = WORK_UNIT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__METADATA = WORK_UNIT__METADATA;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.EquipmentModuleImpl <em>Equipment Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.EquipmentModuleImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getEquipmentModule()
	 * @generated
	 */
	int EQUIPMENT_MODULE = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__CONTROL_MODULES = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__EQUIPMENT_MODULES = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.ControlModuleImpl <em>Control Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.ControlModuleImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getControlModule()
	 * @generated
	 */
	int CONTROL_MODULE = 13;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__CONTROL_MODULES = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.StationImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__EQUIPMENT_MODULES = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.TransitionImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getTransition()
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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.DiscreteManufacturingEquipmentModuleImpl <em>Discrete Manufacturing Equipment Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.DiscreteManufacturingEquipmentModuleImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getDiscreteManufacturingEquipmentModule()
	 * @generated
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING = EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID = EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME = EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA = EQUIPMENT_MODULE__METADATA;

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
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__REQUIREMENTS = EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Manufacturing Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT = EQUIPMENT_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Discrete Manufacturing Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT = EQUIPMENT_MODULE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RequirementImpl
	 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 17;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Value Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VALUE_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__UNIT = 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.Enterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Enterprise
	 * @generated
	 */
	EClass getEnterprise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.Enterprise#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sites</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Enterprise#getSites()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_Sites();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.Site#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Site#getAreas()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Areas();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.Area#getWorkCenters <em>Work Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Centers</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Area#getWorkCenters()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_WorkCenters();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.Area#getDiscretemanufacturingequipmentmodules <em>Discretemanufacturingequipmentmodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discretemanufacturingequipmentmodules</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Area#getDiscretemanufacturingequipmentmodules()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Discretemanufacturingequipmentmodules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.WorkCenter <em>Work Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Center</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.WorkCenter
	 * @generated
	 */
	EClass getWorkCenter();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.ProcessCell <em>Process Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Cell</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.ProcessCell
	 * @generated
	 */
	EClass getProcessCell();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.ProductionUnit <em>Production Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.ProductionUnit
	 * @generated
	 */
	EClass getProductionUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.ProductionUnit#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.ProductionUnit#getUnits()
	 * @see #getProductionUnit()
	 * @generated
	 */
	EReference getProductionUnit_Units();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.ProductionLine <em>Production Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Line</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.ProductionLine
	 * @generated
	 */
	EClass getProductionLine();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.ProductionLine#getWorkCells <em>Work Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Cells</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.ProductionLine#getWorkCells()
	 * @see #getProductionLine()
	 * @generated
	 */
	EReference getProductionLine_WorkCells();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.StorageZone <em>Storage Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Zone</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.StorageZone
	 * @generated
	 */
	EClass getStorageZone();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.StorageZone#getStorageUnits <em>Storage Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storage Units</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.StorageZone#getStorageUnits()
	 * @see #getStorageZone()
	 * @generated
	 */
	EReference getStorageZone_StorageUnits();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.WorkUnit <em>Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.WorkUnit
	 * @generated
	 */
	EClass getWorkUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.WorkUnit#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.WorkUnit#getEquipmentModules()
	 * @see #getWorkUnit()
	 * @generated
	 */
	EReference getWorkUnit_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.WorkCell <em>Work Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Cell</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.WorkCell
	 * @generated
	 */
	EClass getWorkCell();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.WorkCell#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.WorkCell#getStations()
	 * @see #getWorkCell()
	 * @generated
	 */
	EReference getWorkCell_Stations();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.StorageUnit <em>Storage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.StorageUnit
	 * @generated
	 */
	EClass getStorageUnit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.EquipmentModule <em>Equipment Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment Module</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.EquipmentModule
	 * @generated
	 */
	EClass getEquipmentModule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.EquipmentModule#getControlModules <em>Control Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Modules</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.EquipmentModule#getControlModules()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_ControlModules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.EquipmentModule#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.EquipmentModule#getEquipmentModules()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.ControlModule <em>Control Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Module</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.ControlModule
	 * @generated
	 */
	EClass getControlModule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.ControlModule#getControlModules <em>Control Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Modules</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.ControlModule#getControlModules()
	 * @see #getControlModule()
	 * @generated
	 */
	EReference getControlModule_ControlModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.Station#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Station#getEquipmentModules()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.roletopology.Transition#getComponentId_src <em>Component Id src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id src</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Transition#getComponentId_src()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ComponentId_src();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.roletopology.Transition#getComponentId_target <em>Component Id target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id target</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Transition#getComponentId_target()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ComponentId_target();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.roletopology.Transition#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Transition#getDistance()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Distance();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.DiscreteManufacturingEquipmentModule <em>Discrete Manufacturing Equipment Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Manufacturing Equipment Module</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.DiscreteManufacturingEquipmentModule
	 * @generated
	 */
	EClass getDiscreteManufacturingEquipmentModule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.roletopology.DiscreteManufacturingEquipmentModule#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.DiscreteManufacturingEquipmentModule#getRequirements()
	 * @see #getDiscreteManufacturingEquipmentModule()
	 * @generated
	 */
	EReference getDiscreteManufacturingEquipmentModule_Requirements();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.roletopology.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.roletopology.Requirement#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Requirement#getProperty()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Property();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.roletopology.Requirement#getValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Range</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Requirement#getValueRange()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ValueRange();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.roletopology.Requirement#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.roletopology.Requirement#getUnit()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Unit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoletopologyFactory getRoletopologyFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.EnterpriseImpl <em>Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.EnterpriseImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getEnterprise()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.SiteImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getSite()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.AreaImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getArea()
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
		 * The meta object literal for the '<em><b>Discretemanufacturingequipmentmodules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__DISCRETEMANUFACTURINGEQUIPMENTMODULES = eINSTANCE.getArea_Discretemanufacturingequipmentmodules();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.WorkCenterImpl <em>Work Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.WorkCenterImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getWorkCenter()
		 * @generated
		 */
		EClass WORK_CENTER = eINSTANCE.getWorkCenter();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.ProcessCellImpl <em>Process Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.ProcessCellImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getProcessCell()
		 * @generated
		 */
		EClass PROCESS_CELL = eINSTANCE.getProcessCell();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.ProductionUnitImpl <em>Production Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.ProductionUnitImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getProductionUnit()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.ProductionLineImpl <em>Production Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.ProductionLineImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getProductionLine()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.StorageZoneImpl <em>Storage Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.StorageZoneImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getStorageZone()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.WorkUnitImpl <em>Work Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.WorkUnitImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getWorkUnit()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.UnitImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.WorkCellImpl <em>Work Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.WorkCellImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getWorkCell()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.StorageUnitImpl <em>Storage Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.StorageUnitImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getStorageUnit()
		 * @generated
		 */
		EClass STORAGE_UNIT = eINSTANCE.getStorageUnit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.EquipmentModuleImpl <em>Equipment Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.EquipmentModuleImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getEquipmentModule()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.ControlModuleImpl <em>Control Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.ControlModuleImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getControlModule()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.StationImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getStation()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.TransitionImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getTransition()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.DiscreteManufacturingEquipmentModuleImpl <em>Discrete Manufacturing Equipment Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.DiscreteManufacturingEquipmentModuleImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getDiscreteManufacturingEquipmentModule()
		 * @generated
		 */
		EClass DISCRETE_MANUFACTURING_EQUIPMENT_MODULE = eINSTANCE.getDiscreteManufacturingEquipmentModule();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__REQUIREMENTS = eINSTANCE.getDiscreteManufacturingEquipmentModule_Requirements();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.roletopology.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RequirementImpl
		 * @see de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PROPERTY = eINSTANCE.getRequirement_Property();

		/**
		 * The meta object literal for the '<em><b>Value Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VALUE_RANGE = eINSTANCE.getRequirement_ValueRange();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__UNIT = eINSTANCE.getRequirement_Unit();

	}

} //RoletopologyPackage
