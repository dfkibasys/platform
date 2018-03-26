/**
 */
package de.dfki.iui.basys.model.domain.resourcetype;

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
 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourcetypeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ResourcetypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourcetype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/resourcetype";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resourcetype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcetypePackage eINSTANCE = de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeCatalogueCollectionImpl <em>Resource Type Catalogue Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeCatalogueCollectionImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getResourceTypeCatalogueCollection()
	 * @generated
	 */
	int RESOURCE_TYPE_CATALOGUE_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Catalogues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_CATALOGUE_COLLECTION__CATALOGUES = 0;

	/**
	 * The number of structural features of the '<em>Resource Type Catalogue Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_CATALOGUE_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Type Catalogue Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_CATALOGUE_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeCatalogueImpl <em>Resource Type Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeCatalogueImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getResourceTypeCatalogue()
	 * @generated
	 */
	int RESOURCE_TYPE_CATALOGUE = 1;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_CATALOGUE__MANUFACTURER = 1;

	/**
	 * The number of structural features of the '<em>Resource Type Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_CATALOGUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Type Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 2;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CAPABILITY_REQUIREMENT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__DOCUMENTATION = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.DiscreteManufacturingEquipmentModuleImpl <em>Discrete Manufacturing Equipment Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.DiscreteManufacturingEquipmentModuleImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getDiscreteManufacturingEquipmentModule()
	 * @generated
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE = 3;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT = RESOURCE_TYPE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__DOCUMENTATION = RESOURCE_TYPE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ToolImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 4;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DOCUMENTATION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.StationaryToolImpl <em>Stationary Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.StationaryToolImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getStationaryTool()
	 * @generated
	 */
	int STATIONARY_TOOL = 5;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__CAPABILITY_REQUIREMENT = TOOL__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_TOOL__DOCUMENTATION = TOOL__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.MovableToolImpl <em>Movable Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.MovableToolImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getMovableTool()
	 * @generated
	 */
	int MOVABLE_TOOL = 6;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__CAPABILITY_REQUIREMENT = TOOL__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_TOOL__DOCUMENTATION = TOOL__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.TransportImpl <em>Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.TransportImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getTransport()
	 * @generated
	 */
	int TRANSPORT = 7;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__DOCUMENTATION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.StorageImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 8;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__DOCUMENTATION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.FixtureImpl <em>Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.FixtureImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getFixture()
	 * @generated
	 */
	int FIXTURE = 9;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__DOCUMENTATION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.GateImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getGate()
	 * @generated
	 */
	int GATE = 10;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__DOCUMENTATION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.RobotImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 11;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__DOCUMENTATION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.CarrierImpl <em>Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.CarrierImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getCarrier()
	 * @generated
	 */
	int CARRIER = 12;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__DOCUMENTATION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.MachineImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 13;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__DOCUMENTATION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.StaticObjectImpl <em>Static Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.StaticObjectImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getStaticObject()
	 * @generated
	 */
	int STATIC_OBJECT = 14;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__CAPABILITY_REQUIREMENT = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OBJECT__DOCUMENTATION = DISCRETE_MANUFACTURING_EQUIPMENT_MODULE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.HorizontalTransportImpl <em>Horizontal Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.HorizontalTransportImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getHorizontalTransport()
	 * @generated
	 */
	int HORIZONTAL_TRANSPORT = 23;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__CAPABILITY_REQUIREMENT = TRANSPORT__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_TRANSPORT__DOCUMENTATION = TRANSPORT__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.TurnableImpl <em>Turnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.TurnableImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getTurnable()
	 * @generated
	 */
	int TURNABLE = 15;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__CAPABILITY_REQUIREMENT = HORIZONTAL_TRANSPORT__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNABLE__DOCUMENTATION = HORIZONTAL_TRANSPORT__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 16;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__CAPABILITY_REQUIREMENT = HORIZONTAL_TRANSPORT__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__DOCUMENTATION = HORIZONTAL_TRANSPORT__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.VerticalTransportImpl <em>Vertical Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.VerticalTransportImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getVerticalTransport()
	 * @generated
	 */
	int VERTICAL_TRANSPORT = 22;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__CAPABILITY_REQUIREMENT = TRANSPORT__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_TRANSPORT__DOCUMENTATION = TRANSPORT__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.LiftingTableImpl <em>Lifting Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.LiftingTableImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getLiftingTable()
	 * @generated
	 */
	int LIFTING_TABLE = 17;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__CAPABILITY_REQUIREMENT = VERTICAL_TRANSPORT__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFTING_TABLE__DOCUMENTATION = VERTICAL_TRANSPORT__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.AVGImpl <em>AVG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.AVGImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getAVG()
	 * @generated
	 */
	int AVG = 18;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__CAPABILITY_REQUIREMENT = HORIZONTAL_TRANSPORT__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__DOCUMENTATION = HORIZONTAL_TRANSPORT__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.TransposerImpl <em>Transposer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.TransposerImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getTransposer()
	 * @generated
	 */
	int TRANSPOSER = 19;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__CAPABILITY_REQUIREMENT = TRANSPORT__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPOSER__DOCUMENTATION = TRANSPORT__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.CarrierHandlingSystemImpl <em>Carrier Handling System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.CarrierHandlingSystemImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getCarrierHandlingSystem()
	 * @generated
	 */
	int CARRIER_HANDLING_SYSTEM = 20;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__CAPABILITY_REQUIREMENT = TRANSPORT__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_HANDLING_SYSTEM__DOCUMENTATION = TRANSPORT__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.LiftImpl <em>Lift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.LiftImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getLift()
	 * @generated
	 */
	int LIFT = 21;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__CAPABILITY_REQUIREMENT = VERTICAL_TRANSPORT__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__DOCUMENTATION = VERTICAL_TRANSPORT__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.RollerbedImpl <em>Rollerbed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.RollerbedImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getRollerbed()
	 * @generated
	 */
	int ROLLERBED = 24;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__CAPABILITY_REQUIREMENT = HORIZONTAL_TRANSPORT__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLERBED__DOCUMENTATION = HORIZONTAL_TRANSPORT__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.LoaderImpl <em>Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.LoaderImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getLoader()
	 * @generated
	 */
	int LOADER = 25;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__CAPABILITY_REQUIREMENT = STORAGE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__DOCUMENTATION = STORAGE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.UnloaderImpl <em>Unloader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.UnloaderImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getUnloader()
	 * @generated
	 */
	int UNLOADER = 26;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__CAPABILITY_REQUIREMENT = STORAGE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOADER__DOCUMENTATION = STORAGE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.BodyStoreImpl <em>Body Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.BodyStoreImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getBodyStore()
	 * @generated
	 */
	int BODY_STORE = 27;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__CAPABILITY_REQUIREMENT = STORAGE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_STORE__DOCUMENTATION = STORAGE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ClampImpl <em>Clamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ClampImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getClamp()
	 * @generated
	 */
	int CLAMP = 28;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__CAPABILITY_REQUIREMENT = FIXTURE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP__DOCUMENTATION = FIXTURE__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.BeltConveyorImpl <em>Belt Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.BeltConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getBeltConveyor()
	 * @generated
	 */
	int BELT_CONVEYOR = 29;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__CAPABILITY_REQUIREMENT = CONVEYOR__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELT_CONVEYOR__DOCUMENTATION = CONVEYOR__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.RollConveyorImpl <em>Roll Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.RollConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getRollConveyor()
	 * @generated
	 */
	int ROLL_CONVEYOR = 30;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__CAPABILITY_REQUIREMENT = CONVEYOR__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_CONVEYOR__DOCUMENTATION = CONVEYOR__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ChainConveyorImpl <em>Chain Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ChainConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getChainConveyor()
	 * @generated
	 */
	int CHAIN_CONVEYOR = 31;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__CAPABILITY_REQUIREMENT = CONVEYOR__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONVEYOR__DOCUMENTATION = CONVEYOR__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.PalletConveyorImpl <em>Pallet Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.PalletConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getPalletConveyor()
	 * @generated
	 */
	int PALLET_CONVEYOR = 32;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__CAPABILITY_REQUIREMENT = CONVEYOR__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_CONVEYOR__DOCUMENTATION = CONVEYOR__DOCUMENTATION;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.OverheadConveyorImpl <em>Overhead Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.OverheadConveyorImpl
	 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getOverheadConveyor()
	 * @generated
	 */
	int OVERHEAD_CONVEYOR = 33;

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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__CAPABILITY_REQUIREMENT = CONVEYOR__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_CONVEYOR__DOCUMENTATION = CONVEYOR__DOCUMENTATION;

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
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogueCollection <em>Resource Type Catalogue Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type Catalogue Collection</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogueCollection
	 * @generated
	 */
	EClass getResourceTypeCatalogueCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogueCollection#getCatalogues <em>Catalogues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalogues</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogueCollection#getCatalogues()
	 * @see #getResourceTypeCatalogueCollection()
	 * @generated
	 */
	EReference getResourceTypeCatalogueCollection_Catalogues();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue <em>Resource Type Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type Catalogue</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue
	 * @generated
	 */
	EClass getResourceTypeCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Types</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue#getResourceTypes()
	 * @see #getResourceTypeCatalogue()
	 * @generated
	 */
	EReference getResourceTypeCatalogue_ResourceTypes();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue#getManufacturer()
	 * @see #getResourceTypeCatalogue()
	 * @generated
	 */
	EAttribute getResourceTypeCatalogue_Manufacturer();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getCapabilityAssertion <em>Capability Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Assertion</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getCapabilityAssertion()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_CapabilityAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getCapabilityRequirement <em>Capability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Requirement</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getCapabilityRequirement()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_CapabilityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getDocumentation()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Documentation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.DiscreteManufacturingEquipmentModule <em>Discrete Manufacturing Equipment Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Manufacturing Equipment Module</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.DiscreteManufacturingEquipmentModule
	 * @generated
	 */
	EClass getDiscreteManufacturingEquipmentModule();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.StationaryTool <em>Stationary Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stationary Tool</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.StationaryTool
	 * @generated
	 */
	EClass getStationaryTool();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.MovableTool <em>Movable Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movable Tool</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.MovableTool
	 * @generated
	 */
	EClass getMovableTool();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Transport
	 * @generated
	 */
	EClass getTransport();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Fixture
	 * @generated
	 */
	EClass getFixture();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Carrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Carrier
	 * @generated
	 */
	EClass getCarrier();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.StaticObject <em>Static Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Object</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.StaticObject
	 * @generated
	 */
	EClass getStaticObject();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Turnable <em>Turnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnable</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Turnable
	 * @generated
	 */
	EClass getTurnable();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.LiftingTable <em>Lifting Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifting Table</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.LiftingTable
	 * @generated
	 */
	EClass getLiftingTable();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.AVG <em>AVG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVG</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.AVG
	 * @generated
	 */
	EClass getAVG();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Transposer <em>Transposer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transposer</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Transposer
	 * @generated
	 */
	EClass getTransposer();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.CarrierHandlingSystem <em>Carrier Handling System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Handling System</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.CarrierHandlingSystem
	 * @generated
	 */
	EClass getCarrierHandlingSystem();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Lift <em>Lift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lift</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Lift
	 * @generated
	 */
	EClass getLift();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.VerticalTransport <em>Vertical Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Transport</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.VerticalTransport
	 * @generated
	 */
	EClass getVerticalTransport();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.HorizontalTransport <em>Horizontal Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Transport</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.HorizontalTransport
	 * @generated
	 */
	EClass getHorizontalTransport();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Rollerbed <em>Rollerbed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rollerbed</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Rollerbed
	 * @generated
	 */
	EClass getRollerbed();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Loader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loader</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Loader
	 * @generated
	 */
	EClass getLoader();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Unloader <em>Unloader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unloader</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Unloader
	 * @generated
	 */
	EClass getUnloader();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.BodyStore <em>Body Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Store</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.BodyStore
	 * @generated
	 */
	EClass getBodyStore();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.Clamp <em>Clamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.Clamp
	 * @generated
	 */
	EClass getClamp();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.BeltConveyor <em>Belt Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belt Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.BeltConveyor
	 * @generated
	 */
	EClass getBeltConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.RollConveyor <em>Roll Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roll Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.RollConveyor
	 * @generated
	 */
	EClass getRollConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.ChainConveyor <em>Chain Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ChainConveyor
	 * @generated
	 */
	EClass getChainConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.PalletConveyor <em>Pallet Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pallet Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.PalletConveyor
	 * @generated
	 */
	EClass getPalletConveyor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourcetype.OverheadConveyor <em>Overhead Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overhead Conveyor</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.OverheadConveyor
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
	ResourcetypeFactory getResourcetypeFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeCatalogueCollectionImpl <em>Resource Type Catalogue Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeCatalogueCollectionImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getResourceTypeCatalogueCollection()
		 * @generated
		 */
		EClass RESOURCE_TYPE_CATALOGUE_COLLECTION = eINSTANCE.getResourceTypeCatalogueCollection();

		/**
		 * The meta object literal for the '<em><b>Catalogues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE_CATALOGUE_COLLECTION__CATALOGUES = eINSTANCE.getResourceTypeCatalogueCollection_Catalogues();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeCatalogueImpl <em>Resource Type Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeCatalogueImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getResourceTypeCatalogue()
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
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE_CATALOGUE__MANUFACTURER = eINSTANCE.getResourceTypeCatalogue_Manufacturer();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getResourceType()
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
		 * The meta object literal for the '<em><b>Capability Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__CAPABILITY_REQUIREMENT = eINSTANCE.getResourceType_CapabilityRequirement();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__DOCUMENTATION = eINSTANCE.getResourceType_Documentation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.DiscreteManufacturingEquipmentModuleImpl <em>Discrete Manufacturing Equipment Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.DiscreteManufacturingEquipmentModuleImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getDiscreteManufacturingEquipmentModule()
		 * @generated
		 */
		EClass DISCRETE_MANUFACTURING_EQUIPMENT_MODULE = eINSTANCE.getDiscreteManufacturingEquipmentModule();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ToolImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.StationaryToolImpl <em>Stationary Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.StationaryToolImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getStationaryTool()
		 * @generated
		 */
		EClass STATIONARY_TOOL = eINSTANCE.getStationaryTool();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.MovableToolImpl <em>Movable Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.MovableToolImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getMovableTool()
		 * @generated
		 */
		EClass MOVABLE_TOOL = eINSTANCE.getMovableTool();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.TransportImpl <em>Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.TransportImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getTransport()
		 * @generated
		 */
		EClass TRANSPORT = eINSTANCE.getTransport();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.StorageImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.FixtureImpl <em>Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.FixtureImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getFixture()
		 * @generated
		 */
		EClass FIXTURE = eINSTANCE.getFixture();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.GateImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.RobotImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.CarrierImpl <em>Carrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.CarrierImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getCarrier()
		 * @generated
		 */
		EClass CARRIER = eINSTANCE.getCarrier();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.MachineImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.StaticObjectImpl <em>Static Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.StaticObjectImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getStaticObject()
		 * @generated
		 */
		EClass STATIC_OBJECT = eINSTANCE.getStaticObject();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.TurnableImpl <em>Turnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.TurnableImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getTurnable()
		 * @generated
		 */
		EClass TURNABLE = eINSTANCE.getTurnable();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.LiftingTableImpl <em>Lifting Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.LiftingTableImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getLiftingTable()
		 * @generated
		 */
		EClass LIFTING_TABLE = eINSTANCE.getLiftingTable();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.AVGImpl <em>AVG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.AVGImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getAVG()
		 * @generated
		 */
		EClass AVG = eINSTANCE.getAVG();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.TransposerImpl <em>Transposer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.TransposerImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getTransposer()
		 * @generated
		 */
		EClass TRANSPOSER = eINSTANCE.getTransposer();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.CarrierHandlingSystemImpl <em>Carrier Handling System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.CarrierHandlingSystemImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getCarrierHandlingSystem()
		 * @generated
		 */
		EClass CARRIER_HANDLING_SYSTEM = eINSTANCE.getCarrierHandlingSystem();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.LiftImpl <em>Lift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.LiftImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getLift()
		 * @generated
		 */
		EClass LIFT = eINSTANCE.getLift();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.VerticalTransportImpl <em>Vertical Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.VerticalTransportImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getVerticalTransport()
		 * @generated
		 */
		EClass VERTICAL_TRANSPORT = eINSTANCE.getVerticalTransport();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.HorizontalTransportImpl <em>Horizontal Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.HorizontalTransportImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getHorizontalTransport()
		 * @generated
		 */
		EClass HORIZONTAL_TRANSPORT = eINSTANCE.getHorizontalTransport();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.RollerbedImpl <em>Rollerbed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.RollerbedImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getRollerbed()
		 * @generated
		 */
		EClass ROLLERBED = eINSTANCE.getRollerbed();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.LoaderImpl <em>Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.LoaderImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getLoader()
		 * @generated
		 */
		EClass LOADER = eINSTANCE.getLoader();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.UnloaderImpl <em>Unloader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.UnloaderImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getUnloader()
		 * @generated
		 */
		EClass UNLOADER = eINSTANCE.getUnloader();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.BodyStoreImpl <em>Body Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.BodyStoreImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getBodyStore()
		 * @generated
		 */
		EClass BODY_STORE = eINSTANCE.getBodyStore();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ClampImpl <em>Clamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ClampImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getClamp()
		 * @generated
		 */
		EClass CLAMP = eINSTANCE.getClamp();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.BeltConveyorImpl <em>Belt Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.BeltConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getBeltConveyor()
		 * @generated
		 */
		EClass BELT_CONVEYOR = eINSTANCE.getBeltConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.RollConveyorImpl <em>Roll Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.RollConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getRollConveyor()
		 * @generated
		 */
		EClass ROLL_CONVEYOR = eINSTANCE.getRollConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ChainConveyorImpl <em>Chain Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ChainConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getChainConveyor()
		 * @generated
		 */
		EClass CHAIN_CONVEYOR = eINSTANCE.getChainConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.PalletConveyorImpl <em>Pallet Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.PalletConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getPalletConveyor()
		 * @generated
		 */
		EClass PALLET_CONVEYOR = eINSTANCE.getPalletConveyor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourcetype.impl.OverheadConveyorImpl <em>Overhead Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.OverheadConveyorImpl
		 * @see de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl#getOverheadConveyor()
		 * @generated
		 */
		EClass OVERHEAD_CONVEYOR = eINSTANCE.getOverheadConveyor();

	}

} //ResourcetypePackage
