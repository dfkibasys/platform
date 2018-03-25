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
	 * The feature id for the '<em><b>Bom Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_APPLICATION__BOM_ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Capability Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_APPLICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capability Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceStatusImpl <em>Resource Instance Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceStatusImpl
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getResourceInstanceStatus()
	 * @generated
	 */
	int RESOURCE_INSTANCE_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Resource Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS__RESOURCE_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceStatusChangeEventImpl <em>Resource Instance Status Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceStatusChangeEventImpl
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getResourceInstanceStatusChangeEvent()
	 * @generated
	 */
	int RESOURCE_INSTANCE_STATUS_CHANGE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS_CHANGE_EVENT__BINDING = RESOURCE_INSTANCE_STATUS__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS_CHANGE_EVENT__ID = RESOURCE_INSTANCE_STATUS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS_CHANGE_EVENT__NAME = RESOURCE_INSTANCE_STATUS__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS_CHANGE_EVENT__METADATA = RESOURCE_INSTANCE_STATUS__METADATA;

	/**
	 * The feature id for the '<em><b>Resource Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS_CHANGE_EVENT__RESOURCE_INSTANCE_ID = RESOURCE_INSTANCE_STATUS__RESOURCE_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS_CHANGE_EVENT__TIMESTAMP = RESOURCE_INSTANCE_STATUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Instance Status Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS_CHANGE_EVENT_FEATURE_COUNT = RESOURCE_INSTANCE_STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Instance Status Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_STATUS_CHANGE_EVENT_OPERATION_COUNT = RESOURCE_INSTANCE_STATUS_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication#getBomEntries <em>Bom Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bom Entries</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication#getBomEntries()
	 * @see #getCapabilityApplication()
	 * @generated
	 */
	EReference getCapabilityApplication_BomEntries();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatus <em>Resource Instance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatus
	 * @generated
	 */
	EClass getResourceInstanceStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatus#getResourceInstanceId <em>Resource Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatus#getResourceInstanceId()
	 * @see #getResourceInstanceStatus()
	 * @generated
	 */
	EAttribute getResourceInstanceStatus_ResourceInstanceId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatusChangeEvent <em>Resource Instance Status Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance Status Change Event</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatusChangeEvent
	 * @generated
	 */
	EClass getResourceInstanceStatusChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatusChangeEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatusChangeEvent#getTimestamp()
	 * @see #getResourceInstanceStatusChangeEvent()
	 * @generated
	 */
	EAttribute getResourceInstanceStatusChangeEvent_Timestamp();

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
		 * The meta object literal for the '<em><b>Bom Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_APPLICATION__BOM_ENTRIES = eINSTANCE.getCapabilityApplication_BomEntries();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceStatusImpl <em>Resource Instance Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceStatusImpl
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getResourceInstanceStatus()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE_STATUS = eINSTANCE.getResourceInstanceStatus();

		/**
		 * The meta object literal for the '<em><b>Resource Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE_STATUS__RESOURCE_INSTANCE_ID = eINSTANCE.getResourceInstanceStatus_ResourceInstanceId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceStatusChangeEventImpl <em>Resource Instance Status Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceStatusChangeEventImpl
		 * @see de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl#getResourceInstanceStatusChangeEvent()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE_STATUS_CHANGE_EVENT = eINSTANCE.getResourceInstanceStatusChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE_STATUS_CHANGE_EVENT__TIMESTAMP = eINSTANCE.getResourceInstanceStatusChangeEvent_Timestamp();

	}

} //ResourceinstancePackage
