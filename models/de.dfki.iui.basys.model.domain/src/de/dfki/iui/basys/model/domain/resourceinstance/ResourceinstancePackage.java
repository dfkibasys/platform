/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance;

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
 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ResourceinstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourceinstance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/resourceinstance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resourceinstance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceinstancePackage eINSTANCE = de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceRepositoryImpl <em>Resource Instance Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceRepositoryImpl
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getResourceInstanceRepository()
	 * @generated
	 */
	int RESOURCE_INSTANCE_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Resource Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Resource Instance Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Instance Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getResourceInstance()
	 * @generated
	 */
	int RESOURCE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__SERIAL_NUMBER = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__RESOURCE_TYPE = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__CAPABILITY_APPLICATIONS = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__ROLE = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityApplicationImpl <em>Capability Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityApplicationImpl
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getCapabilityApplication()
	 * @generated
	 */
	int CAPABILITY_APPLICATION = 2;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityVariantImpl <em>Capability Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityVariantImpl
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getCapabilityVariant()
	 * @generated
	 */
	int CAPABILITY_VARIANT = 3;

	/**
	 * The feature id for the '<em><b>Capability Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_APPLICATION__CAPABILITY_ASSERTION = 0;

	/**
	 * The feature id for the '<em><b>Capability Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_APPLICATION__CAPABILITY_VARIANTS = 1;

	/**
	 * The number of structural features of the '<em>Capability Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Capability Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VARIANT__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VARIANT__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VARIANT__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VARIANT__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VARIANT__CAPABILITY = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VARIANT__APPLIED_ON = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VARIANT_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Capability Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VARIANT_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ManufacturingCapabilityVariantImpl <em>Manufacturing Capability Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ManufacturingCapabilityVariantImpl
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getManufacturingCapabilityVariant()
	 * @generated
	 */
	int MANUFACTURING_CAPABILITY_VARIANT = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_VARIANT__BINDING = CAPABILITY_VARIANT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_VARIANT__ID = CAPABILITY_VARIANT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_VARIANT__NAME = CAPABILITY_VARIANT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_VARIANT__METADATA = CAPABILITY_VARIANT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_VARIANT__CAPABILITY = CAPABILITY_VARIANT__CAPABILITY;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_VARIANT__APPLIED_ON = CAPABILITY_VARIANT__APPLIED_ON;

	/**
	 * The number of structural features of the '<em>Manufacturing Capability Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_VARIANT_FEATURE_COUNT = CAPABILITY_VARIANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manufacturing Capability Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_VARIANT_OPERATION_COUNT = CAPABILITY_VARIANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.LogisticsCapabilityVariantImpl <em>Logistics Capability Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.LogisticsCapabilityVariantImpl
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getLogisticsCapabilityVariant()
	 * @generated
	 */
	int LOGISTICS_CAPABILITY_VARIANT = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY_VARIANT__BINDING = CAPABILITY_VARIANT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY_VARIANT__ID = CAPABILITY_VARIANT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY_VARIANT__NAME = CAPABILITY_VARIANT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY_VARIANT__METADATA = CAPABILITY_VARIANT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY_VARIANT__CAPABILITY = CAPABILITY_VARIANT__CAPABILITY;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY_VARIANT__APPLIED_ON = CAPABILITY_VARIANT__APPLIED_ON;

	/**
	 * The number of structural features of the '<em>Logistics Capability Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY_VARIANT_FEATURE_COUNT = CAPABILITY_VARIANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logistics Capability Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY_VARIANT_OPERATION_COUNT = CAPABILITY_VARIANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.GeneralCapabilityVariantImpl <em>General Capability Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.GeneralCapabilityVariantImpl
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getGeneralCapabilityVariant()
	 * @generated
	 */
	int GENERAL_CAPABILITY_VARIANT = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY_VARIANT__BINDING = CAPABILITY_VARIANT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY_VARIANT__ID = CAPABILITY_VARIANT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY_VARIANT__NAME = CAPABILITY_VARIANT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY_VARIANT__METADATA = CAPABILITY_VARIANT__METADATA;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY_VARIANT__CAPABILITY = CAPABILITY_VARIANT__CAPABILITY;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY_VARIANT__APPLIED_ON = CAPABILITY_VARIANT__APPLIED_ON;

	/**
	 * The number of structural features of the '<em>General Capability Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY_VARIANT_FEATURE_COUNT = CAPABILITY_VARIANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General Capability Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY_VARIANT_OPERATION_COUNT = CAPABILITY_VARIANT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository <em>Resource Instance Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance Repository</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository
	 * @generated
	 */
	EClass getResourceInstanceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository#getResourceInstances <em>Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Instances</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository#getResourceInstances()
	 * @see #getResourceInstanceRepository()
	 * @generated
	 */
	EReference getResourceInstanceRepository_ResourceInstances();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance
	 * @generated
	 */
	EClass getResourceInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getSerialNumber()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_SerialNumber();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getResourceType()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_ResourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getCapabilityApplications <em>Capability Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Applications</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getCapabilityApplications()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_CapabilityApplications();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getRole()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_Role();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication <em>Capability Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Application</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication
	 * @generated
	 */
	EClass getCapabilityApplication();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication#getCapabilityAssertion <em>Capability Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability Assertion</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication#getCapabilityAssertion()
	 * @see #getCapabilityApplication()
	 * @generated
	 */
	EReference getCapabilityApplication_CapabilityAssertion();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication#getCapabilityVariants <em>Capability Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Variants</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication#getCapabilityVariants()
	 * @see #getCapabilityApplication()
	 * @generated
	 */
	EReference getCapabilityApplication_CapabilityVariants();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant <em>Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Variant</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant
	 * @generated
	 */
	EClass getCapabilityVariant();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant#getCapability()
	 * @see #getCapabilityVariant()
	 * @generated
	 */
	EReference getCapabilityVariant_Capability();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant#getAppliedOn <em>Applied On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied On</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant#getAppliedOn()
	 * @see #getCapabilityVariant()
	 * @generated
	 */
	EReference getCapabilityVariant_AppliedOn();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourceinstance.ManufacturingCapabilityVariant <em>Manufacturing Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manufacturing Capability Variant</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ManufacturingCapabilityVariant
	 * @generated
	 */
	EClass getManufacturingCapabilityVariant();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourceinstance.LogisticsCapabilityVariant <em>Logistics Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistics Capability Variant</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.LogisticsCapabilityVariant
	 * @generated
	 */
	EClass getLogisticsCapabilityVariant();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourceinstance.GeneralCapabilityVariant <em>General Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Capability Variant</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.GeneralCapabilityVariant
	 * @generated
	 */
	EClass getGeneralCapabilityVariant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourceinstanceFactory getResourceinstanceFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceRepositoryImpl <em>Resource Instance Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceRepositoryImpl
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getResourceInstanceRepository()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE_REPOSITORY = eINSTANCE.getResourceInstanceRepository();

		/**
		 * The meta object literal for the '<em><b>Resource Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES = eINSTANCE.getResourceInstanceRepository_ResourceInstances();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getResourceInstance()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE = eINSTANCE.getResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__SERIAL_NUMBER = eINSTANCE.getResourceInstance_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__RESOURCE_TYPE = eINSTANCE.getResourceInstance_ResourceType();

		/**
		 * The meta object literal for the '<em><b>Capability Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__CAPABILITY_APPLICATIONS = eINSTANCE.getResourceInstance_CapabilityApplications();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__ROLE = eINSTANCE.getResourceInstance_Role();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityApplicationImpl <em>Capability Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityApplicationImpl
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getCapabilityApplication()
		 * @generated
		 */
		EClass CAPABILITY_APPLICATION = eINSTANCE.getCapabilityApplication();

		/**
		 * The meta object literal for the '<em><b>Capability Assertion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_APPLICATION__CAPABILITY_ASSERTION = eINSTANCE.getCapabilityApplication_CapabilityAssertion();

		/**
		 * The meta object literal for the '<em><b>Capability Variants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_APPLICATION__CAPABILITY_VARIANTS = eINSTANCE.getCapabilityApplication_CapabilityVariants();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityVariantImpl <em>Capability Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityVariantImpl
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getCapabilityVariant()
		 * @generated
		 */
		EClass CAPABILITY_VARIANT = eINSTANCE.getCapabilityVariant();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_VARIANT__CAPABILITY = eINSTANCE.getCapabilityVariant_Capability();

		/**
		 * The meta object literal for the '<em><b>Applied On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_VARIANT__APPLIED_ON = eINSTANCE.getCapabilityVariant_AppliedOn();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ManufacturingCapabilityVariantImpl <em>Manufacturing Capability Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ManufacturingCapabilityVariantImpl
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getManufacturingCapabilityVariant()
		 * @generated
		 */
		EClass MANUFACTURING_CAPABILITY_VARIANT = eINSTANCE.getManufacturingCapabilityVariant();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.LogisticsCapabilityVariantImpl <em>Logistics Capability Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.LogisticsCapabilityVariantImpl
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getLogisticsCapabilityVariant()
		 * @generated
		 */
		EClass LOGISTICS_CAPABILITY_VARIANT = eINSTANCE.getLogisticsCapabilityVariant();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.GeneralCapabilityVariantImpl <em>General Capability Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.GeneralCapabilityVariantImpl
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getGeneralCapabilityVariant()
		 * @generated
		 */
		EClass GENERAL_CAPABILITY_VARIANT = eINSTANCE.getGeneralCapabilityVariant();

	}

} //ResourceinstancePackage
