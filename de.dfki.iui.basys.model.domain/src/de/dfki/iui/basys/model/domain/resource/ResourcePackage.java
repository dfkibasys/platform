/**
 */
package de.dfki.iui.basys.model.domain.resource;

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
 * @see de.dfki.iui.basys.model.domain.resource.ResourceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ResourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resource";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/resource";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resource";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcePackage eINSTANCE = de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ResourceTypeCatalogueImpl <em>Type Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourceTypeCatalogueImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getResourceTypeCatalogue()
	 * @generated
	 */
	int RESOURCE_TYPE_CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Type Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_CATALOGUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ResourceTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourceTypeImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CAPABILITY_ASSERTION = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CAPABILITY_REQUIREMENT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.DiscreteManufacturingEquipmentModuleImpl <em>Discrete Manufacturing Equipment Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.DiscreteManufacturingEquipmentModuleImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getDiscreteManufacturingEquipmentModule()
	 * @generated
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING = RESOURCE_TYPE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID = RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA = RESOURCE_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_ASSERTION = RESOURCE_TYPE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT = RESOURCE_TYPE__CAPABILITY_REQUIREMENT;

	/**
	 * The number of structural features of the '<em>Discrete Manufacturing Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discrete Manufacturing Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE_OPERATION_COUNT = RESOURCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ToolImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__BINDING = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CAPABILITY_ASSERTION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.StationaryToolImpl <em>Stationary Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.StationaryToolImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getStationaryTool()
	 * @generated
	 */
	int STATIONARY_TOOL = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__BINDING = TOOL__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__ID = TOOL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__NAME = TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__METADATA = TOOL__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__CAPABILITY_ASSERTION = TOOL__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__CAPABILITY_REQUIREMENT = TOOL__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.MovableToolImpl <em>Movable Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.MovableToolImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getMovableTool()
	 * @generated
	 */
	int MOVABLE_TOOL = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__BINDING = TOOL__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__ID = TOOL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__NAME = TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__METADATA = TOOL__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__CAPABILITY_ASSERTION = TOOL__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__CAPABILITY_REQUIREMENT = TOOL__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.TransportImpl <em>Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.TransportImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getTransport()
	 * @generated
	 */
	int TRANSPORT = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__BINDING = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__NAME = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__CAPABILITY_ASSERTION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.StorageImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__BINDING = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NAME = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CAPABILITY_ASSERTION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.FixtureImpl <em>Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.FixtureImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getFixture()
	 * @generated
	 */
	int FIXTURE = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__BINDING = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__NAME = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__CAPABILITY_ASSERTION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.GateImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getGate()
	 * @generated
	 */
	int GATE = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__BINDING = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CAPABILITY_ASSERTION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.RobotImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__BINDING = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__CAPABILITY_ASSERTION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.CarrierImpl <em>Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.CarrierImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getCarrier()
	 * @generated
	 */
	int CARRIER = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__BINDING = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__NAME = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__CAPABILITY_ASSERTION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.MachineImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__BINDING = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CAPABILITY_ASSERTION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.StaticObjectImpl <em>Static Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.StaticObjectImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getStaticObject()
	 * @generated
	 */
	int STATIC_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__BINDING = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__ID = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__NAME = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__METADATA = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__CAPABILITY_ASSERTION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.HorizontalTransportImpl <em>Horizontal Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.HorizontalTransportImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getHorizontalTransport()
	 * @generated
	 */
	int HORIZONTAL_TRANSPORT = 22;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__BINDING = TRANSPORT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__ID = TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__NAME = TRANSPORT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__METADATA = TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__CAPABILITY_ASSERTION = TRANSPORT__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__CAPABILITY_REQUIREMENT = TRANSPORT__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.TurnableImpl <em>Turnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.TurnableImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getTurnable()
	 * @generated
	 */
	int TURNABLE = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__BINDING = HORIZONTAL_TRANSPORT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__ID = HORIZONTAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__NAME = HORIZONTAL_TRANSPORT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__METADATA = HORIZONTAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__CAPABILITY_ASSERTION = HORIZONTAL_TRANSPORT__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__CAPABILITY_REQUIREMENT = HORIZONTAL_TRANSPORT__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 15;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__BINDING = HORIZONTAL_TRANSPORT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__ID = HORIZONTAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NAME = HORIZONTAL_TRANSPORT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__METADATA = HORIZONTAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__CAPABILITY_ASSERTION = HORIZONTAL_TRANSPORT__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__CAPABILITY_REQUIREMENT = HORIZONTAL_TRANSPORT__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.VerticalTransportImpl <em>Vertical Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.VerticalTransportImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getVerticalTransport()
	 * @generated
	 */
	int VERTICAL_TRANSPORT = 21;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__BINDING = TRANSPORT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__ID = TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__NAME = TRANSPORT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__METADATA = TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__CAPABILITY_ASSERTION = TRANSPORT__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__CAPABILITY_REQUIREMENT = TRANSPORT__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.LiftingTableImpl <em>Lifting Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.LiftingTableImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getLiftingTable()
	 * @generated
	 */
	int LIFTING_TABLE = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__BINDING = VERTICAL_TRANSPORT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__ID = VERTICAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__NAME = VERTICAL_TRANSPORT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__METADATA = VERTICAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__CAPABILITY_ASSERTION = VERTICAL_TRANSPORT__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__CAPABILITY_REQUIREMENT = VERTICAL_TRANSPORT__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.AVGImpl <em>AVG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.AVGImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getAVG()
	 * @generated
	 */
	int AVG = 17;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__BINDING = HORIZONTAL_TRANSPORT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__ID = HORIZONTAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__NAME = HORIZONTAL_TRANSPORT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__METADATA = HORIZONTAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__CAPABILITY_ASSERTION = HORIZONTAL_TRANSPORT__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__CAPABILITY_REQUIREMENT = HORIZONTAL_TRANSPORT__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.TransposerImpl <em>Transposer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.TransposerImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getTransposer()
	 * @generated
	 */
	int TRANSPOSER = 18;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__BINDING = TRANSPORT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__ID = TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__NAME = TRANSPORT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__METADATA = TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__CAPABILITY_ASSERTION = TRANSPORT__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__CAPABILITY_REQUIREMENT = TRANSPORT__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.CarrierHandlingSystemImpl <em>Carrier Handling System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.CarrierHandlingSystemImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getCarrierHandlingSystem()
	 * @generated
	 */
	int CARRIER_HANDLING_SYSTEM = 19;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__BINDING = TRANSPORT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__ID = TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__NAME = TRANSPORT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__METADATA = TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__CAPABILITY_ASSERTION = TRANSPORT__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__CAPABILITY_REQUIREMENT = TRANSPORT__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.LiftImpl <em>Lift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.LiftImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getLift()
	 * @generated
	 */
	int LIFT = 20;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__BINDING = VERTICAL_TRANSPORT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__ID = VERTICAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__NAME = VERTICAL_TRANSPORT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__METADATA = VERTICAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__CAPABILITY_ASSERTION = VERTICAL_TRANSPORT__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__CAPABILITY_REQUIREMENT = VERTICAL_TRANSPORT__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.RollerbedImpl <em>Rollerbed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.RollerbedImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getRollerbed()
	 * @generated
	 */
	int ROLLERBED = 23;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__BINDING = HORIZONTAL_TRANSPORT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__ID = HORIZONTAL_TRANSPORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__NAME = HORIZONTAL_TRANSPORT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__METADATA = HORIZONTAL_TRANSPORT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__CAPABILITY_ASSERTION = HORIZONTAL_TRANSPORT__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__CAPABILITY_REQUIREMENT = HORIZONTAL_TRANSPORT__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.LoaderImpl <em>Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.LoaderImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getLoader()
	 * @generated
	 */
	int LOADER = 24;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__BINDING = STORAGE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__ID = STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__NAME = STORAGE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__METADATA = STORAGE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__CAPABILITY_ASSERTION = STORAGE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__CAPABILITY_REQUIREMENT = STORAGE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.UnloaderImpl <em>Unloader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.UnloaderImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getUnloader()
	 * @generated
	 */
	int UNLOADER = 25;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__BINDING = STORAGE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__ID = STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__NAME = STORAGE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__METADATA = STORAGE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__CAPABILITY_ASSERTION = STORAGE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__CAPABILITY_REQUIREMENT = STORAGE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.BodyStoreImpl <em>Body Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.BodyStoreImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getBodyStore()
	 * @generated
	 */
	int BODY_STORE = 26;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__BINDING = STORAGE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__ID = STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__NAME = STORAGE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__METADATA = STORAGE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__CAPABILITY_ASSERTION = STORAGE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__CAPABILITY_REQUIREMENT = STORAGE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ClampImpl <em>Clamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ClampImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getClamp()
	 * @generated
	 */
	int CLAMP = 27;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__BINDING = FIXTURE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__ID = FIXTURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__NAME = FIXTURE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__METADATA = FIXTURE__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__CAPABILITY_ASSERTION = FIXTURE__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__CAPABILITY_REQUIREMENT = FIXTURE__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.BeltConveyorImpl <em>Belt Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.BeltConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getBeltConveyor()
	 * @generated
	 */
	int BELT_CONVEYOR = 28;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__BINDING = CONVEYOR__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__ID = CONVEYOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__NAME = CONVEYOR__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__METADATA = CONVEYOR__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__CAPABILITY_ASSERTION = CONVEYOR__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__CAPABILITY_REQUIREMENT = CONVEYOR__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.RollConveyorImpl <em>Roll Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.RollConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getRollConveyor()
	 * @generated
	 */
	int ROLL_CONVEYOR = 29;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__BINDING = CONVEYOR__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__ID = CONVEYOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__NAME = CONVEYOR__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__METADATA = CONVEYOR__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__CAPABILITY_ASSERTION = CONVEYOR__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__CAPABILITY_REQUIREMENT = CONVEYOR__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ChainConveyorImpl <em>Chain Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ChainConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getChainConveyor()
	 * @generated
	 */
	int CHAIN_CONVEYOR = 30;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__BINDING = CONVEYOR__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__ID = CONVEYOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__NAME = CONVEYOR__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__METADATA = CONVEYOR__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__CAPABILITY_ASSERTION = CONVEYOR__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__CAPABILITY_REQUIREMENT = CONVEYOR__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.PalletConveyorImpl <em>Pallet Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.PalletConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getPalletConveyor()
	 * @generated
	 */
	int PALLET_CONVEYOR = 31;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__BINDING = CONVEYOR__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__ID = CONVEYOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__NAME = CONVEYOR__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__METADATA = CONVEYOR__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__CAPABILITY_ASSERTION = CONVEYOR__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__CAPABILITY_REQUIREMENT = CONVEYOR__CAPABILITY_REQUIREMENT;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resource.impl.OverheadConveyorImpl <em>Overhead Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resource.impl.OverheadConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getOverheadConveyor()
	 * @generated
	 */
	int OVERHEAD_CONVEYOR = 32;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__BINDING = CONVEYOR__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__ID = CONVEYOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__NAME = CONVEYOR__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__METADATA = CONVEYOR__METADATA;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__CAPABILITY_ASSERTION = CONVEYOR__CAPABILITY_ASSERTION;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__CAPABILITY_REQUIREMENT = CONVEYOR__CAPABILITY_REQUIREMENT;

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
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.ResourceTypeCatalogue <em>Type Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Catalogue</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.ResourceTypeCatalogue
	 * @generated
	 */
	EClass getResourceTypeCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.resource.ResourceTypeCatalogue#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Types</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.ResourceTypeCatalogue#getResourceTypes()
	 * @see #getResourceTypeCatalogue()
	 * @generated
	 */
	EReference getResourceTypeCatalogue_ResourceTypes();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.ResourceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.resource.ResourceType#getCapabilityAssertion <em>Capability Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Assertion</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.ResourceType#getCapabilityAssertion()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_CapabilityAssertion();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.resource.ResourceType#getCapabilityRequirement <em>Capability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability Requirement</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.ResourceType#getCapabilityRequirement()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_CapabilityRequirement();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.DiscreteManufacturingEquipmentModule <em>Discrete Manufacturing Equipment Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Manufacturing Equipment Module</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.DiscreteManufacturingEquipmentModule
	 * @generated
	 */
	EClass getDiscreteManufacturingEquipmentModule();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.StationaryTool <em>Stationary Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stationary Tool</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.StationaryTool
	 * @generated
	 */
	EClass getStationaryTool();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.MovableTool <em>Movable Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movable Tool</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.MovableTool
	 * @generated
	 */
	EClass getMovableTool();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Transport
	 * @generated
	 */
	EClass getTransport();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Fixture
	 * @generated
	 */
	EClass getFixture();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Carrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Carrier
	 * @generated
	 */
	EClass getCarrier();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.StaticObject <em>Static Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Object</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.StaticObject
	 * @generated
	 */
	EClass getStaticObject();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Turnable <em>Turnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnable</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Turnable
	 * @generated
	 */
	EClass getTurnable();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.LiftingTable <em>Lifting Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifting Table</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.LiftingTable
	 * @generated
	 */
	EClass getLiftingTable();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.AVG <em>AVG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVG</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.AVG
	 * @generated
	 */
	EClass getAVG();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Transposer <em>Transposer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transposer</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Transposer
	 * @generated
	 */
	EClass getTransposer();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.CarrierHandlingSystem <em>Carrier Handling System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Handling System</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.CarrierHandlingSystem
	 * @generated
	 */
	EClass getCarrierHandlingSystem();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Lift <em>Lift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lift</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Lift
	 * @generated
	 */
	EClass getLift();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.VerticalTransport <em>Vertical Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Transport</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.VerticalTransport
	 * @generated
	 */
	EClass getVerticalTransport();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.HorizontalTransport <em>Horizontal Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Transport</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.HorizontalTransport
	 * @generated
	 */
	EClass getHorizontalTransport();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Rollerbed <em>Rollerbed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rollerbed</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Rollerbed
	 * @generated
	 */
	EClass getRollerbed();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Loader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loader</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Loader
	 * @generated
	 */
	EClass getLoader();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Unloader <em>Unloader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unloader</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Unloader
	 * @generated
	 */
	EClass getUnloader();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.BodyStore <em>Body Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Store</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.BodyStore
	 * @generated
	 */
	EClass getBodyStore();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.Clamp <em>Clamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.Clamp
	 * @generated
	 */
	EClass getClamp();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.BeltConveyor <em>Belt Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belt Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.BeltConveyor
	 * @generated
	 */
	EClass getBeltConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.RollConveyor <em>Roll Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roll Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.RollConveyor
	 * @generated
	 */
	EClass getRollConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.ChainConveyor <em>Chain Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.ChainConveyor
	 * @generated
	 */
	EClass getChainConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.PalletConveyor <em>Pallet Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pallet Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.PalletConveyor
	 * @generated
	 */
	EClass getPalletConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resource.OverheadConveyor <em>Overhead Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overhead Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resource.OverheadConveyor
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
	ResourceFactory getResourceFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ResourceTypeCatalogueImpl <em>Type Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourceTypeCatalogueImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getResourceTypeCatalogue()
		 * @generated
		 */
		EClass RESOURCE_TYPE_CATALOGUE = eINSTANCE.getResourceTypeCatalogue();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES = eINSTANCE.getResourceTypeCatalogue_ResourceTypes();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ResourceTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourceTypeImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Capability Assertion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__CAPABILITY_ASSERTION = eINSTANCE.getResourceType_CapabilityAssertion();

		/**
		 * The meta object literal for the '<em><b>Capability Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__CAPABILITY_REQUIREMENT = eINSTANCE.getResourceType_CapabilityRequirement();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.DiscreteManufacturingEquipmentModuleImpl <em>Discrete Manufacturing Equipment Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.DiscreteManufacturingEquipmentModuleImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getDiscreteManufacturingEquipmentModule()
		 * @generated
		 */
		EClass DISCRETE_MANUFACTURING_EQUIPMENT_MODULE = eINSTANCE.getDiscreteManufacturingEquipmentModule();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ToolImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.StationaryToolImpl <em>Stationary Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.StationaryToolImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getStationaryTool()
		 * @generated
		 */
		EClass STATIONARY_TOOL = eINSTANCE.getStationaryTool();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.MovableToolImpl <em>Movable Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.MovableToolImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getMovableTool()
		 * @generated
		 */
		EClass MOVABLE_TOOL = eINSTANCE.getMovableTool();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.TransportImpl <em>Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.TransportImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getTransport()
		 * @generated
		 */
		EClass TRANSPORT = eINSTANCE.getTransport();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.StorageImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.FixtureImpl <em>Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.FixtureImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getFixture()
		 * @generated
		 */
		EClass FIXTURE = eINSTANCE.getFixture();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.GateImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.RobotImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.CarrierImpl <em>Carrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.CarrierImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getCarrier()
		 * @generated
		 */
		EClass CARRIER = eINSTANCE.getCarrier();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.MachineImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.StaticObjectImpl <em>Static Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.StaticObjectImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getStaticObject()
		 * @generated
		 */
		EClass STATIC_OBJECT = eINSTANCE.getStaticObject();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.TurnableImpl <em>Turnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.TurnableImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getTurnable()
		 * @generated
		 */
		EClass TURNABLE = eINSTANCE.getTurnable();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.LiftingTableImpl <em>Lifting Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.LiftingTableImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getLiftingTable()
		 * @generated
		 */
		EClass LIFTING_TABLE = eINSTANCE.getLiftingTable();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.AVGImpl <em>AVG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.AVGImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getAVG()
		 * @generated
		 */
		EClass AVG = eINSTANCE.getAVG();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.TransposerImpl <em>Transposer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.TransposerImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getTransposer()
		 * @generated
		 */
		EClass TRANSPOSER = eINSTANCE.getTransposer();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.CarrierHandlingSystemImpl <em>Carrier Handling System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.CarrierHandlingSystemImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getCarrierHandlingSystem()
		 * @generated
		 */
		EClass CARRIER_HANDLING_SYSTEM = eINSTANCE.getCarrierHandlingSystem();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.LiftImpl <em>Lift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.LiftImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getLift()
		 * @generated
		 */
		EClass LIFT = eINSTANCE.getLift();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.VerticalTransportImpl <em>Vertical Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.VerticalTransportImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getVerticalTransport()
		 * @generated
		 */
		EClass VERTICAL_TRANSPORT = eINSTANCE.getVerticalTransport();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.HorizontalTransportImpl <em>Horizontal Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.HorizontalTransportImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getHorizontalTransport()
		 * @generated
		 */
		EClass HORIZONTAL_TRANSPORT = eINSTANCE.getHorizontalTransport();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.RollerbedImpl <em>Rollerbed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.RollerbedImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getRollerbed()
		 * @generated
		 */
		EClass ROLLERBED = eINSTANCE.getRollerbed();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.LoaderImpl <em>Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.LoaderImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getLoader()
		 * @generated
		 */
		EClass LOADER = eINSTANCE.getLoader();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.UnloaderImpl <em>Unloader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.UnloaderImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getUnloader()
		 * @generated
		 */
		EClass UNLOADER = eINSTANCE.getUnloader();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.BodyStoreImpl <em>Body Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.BodyStoreImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getBodyStore()
		 * @generated
		 */
		EClass BODY_STORE = eINSTANCE.getBodyStore();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ClampImpl <em>Clamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ClampImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getClamp()
		 * @generated
		 */
		EClass CLAMP = eINSTANCE.getClamp();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.BeltConveyorImpl <em>Belt Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.BeltConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getBeltConveyor()
		 * @generated
		 */
		EClass BELT_CONVEYOR = eINSTANCE.getBeltConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.RollConveyorImpl <em>Roll Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.RollConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getRollConveyor()
		 * @generated
		 */
		EClass ROLL_CONVEYOR = eINSTANCE.getRollConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.ChainConveyorImpl <em>Chain Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ChainConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getChainConveyor()
		 * @generated
		 */
		EClass CHAIN_CONVEYOR = eINSTANCE.getChainConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.PalletConveyorImpl <em>Pallet Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.PalletConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getPalletConveyor()
		 * @generated
		 */
		EClass PALLET_CONVEYOR = eINSTANCE.getPalletConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resource.impl.OverheadConveyorImpl <em>Overhead Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resource.impl.OverheadConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl#getOverheadConveyor()
		 * @generated
		 */
		EClass OVERHEAD_CONVEYOR = eINSTANCE.getOverheadConveyor();

	}

} //ResourcePackage
