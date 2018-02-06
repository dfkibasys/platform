/**
 */
package de.dfki.iui.basys.model.domain.workplan;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanFactory
 * @model kind="package"
 * @generated
 */
public interface WorkplanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workplan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/workplan";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workplan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkplanPackage eINSTANCE = de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkplanInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkplanInstance()
	 * @generated
	 */
	int WORKPLAN_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE__PRODUCT_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workstep Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE__WORKSTEP_INSTANCES = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl <em>Workstep Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstance()
	 * @generated
	 */
	int WORKSTEP_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__NAME = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__COMPONENT_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Automatic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__IS_AUTOMATIC = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workstep Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workstep Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusImpl <em>Workstep Instance Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusImpl
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstanceStatus()
	 * @generated
	 */
	int WORKSTEP_INSTANCE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS__STATUS = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS__PRODUCT_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Workstep Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workstep Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workstep Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusChangeEventImpl <em>Workstep Instance Status Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusChangeEventImpl
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstanceStatusChangeEvent()
	 * @generated
	 */
	int WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT__BINDING = WORKSTEP_INSTANCE_STATUS__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT__ID = WORKSTEP_INSTANCE_STATUS__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT__METADATA = WORKSTEP_INSTANCE_STATUS__METADATA;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT__STATUS = WORKSTEP_INSTANCE_STATUS__STATUS;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT__PRODUCT_INSTANCE_ID = WORKSTEP_INSTANCE_STATUS__PRODUCT_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Workstep Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT__WORKSTEP_INSTANCE_ID = WORKSTEP_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT__TIMESTAMP = WORKSTEP_INSTANCE_STATUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workstep Instance Status Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT_FEATURE_COUNT = WORKSTEP_INSTANCE_STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Workstep Instance Status Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT_OPERATION_COUNT = WORKSTEP_INSTANCE_STATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Workstep Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__WORKSTEP_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__AGENT_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__AVERAGE = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__STANDARD_DEVIATION = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusEnum <em>Workstep Instance Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusEnum
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstanceStatusEnum()
	 * @generated
	 */
	int WORKSTEP_INSTANCE_STATUS_ENUM = 5;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.workplan.WorkplanInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanInstance
	 * @generated
	 */
	EClass getWorkplanInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkplanInstance#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanInstance#getProductInstanceId()
	 * @see #getWorkplanInstance()
	 * @generated
	 */
	EAttribute getWorkplanInstance_ProductInstanceId();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.workplan.WorkplanInstance#getWorkstepInstances <em>Workstep Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workstep Instances</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanInstance#getWorkstepInstances()
	 * @see #getWorkplanInstance()
	 * @generated
	 */
	EReference getWorkplanInstance_WorkstepInstances();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance <em>Workstep Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstep Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstance
	 * @generated
	 */
	EClass getWorkstepInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getName()
	 * @see #getWorkstepInstance()
	 * @generated
	 */
	EAttribute getWorkstepInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getComponentId()
	 * @see #getWorkstepInstance()
	 * @generated
	 */
	EAttribute getWorkstepInstance_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#isIsAutomatic <em>Is Automatic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Automatic</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#isIsAutomatic()
	 * @see #getWorkstepInstance()
	 * @generated
	 */
	EAttribute getWorkstepInstance_IsAutomatic();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatus <em>Workstep Instance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstep Instance Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatus
	 * @generated
	 */
	EClass getWorkstepInstanceStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatus#getStatus()
	 * @see #getWorkstepInstanceStatus()
	 * @generated
	 */
	EAttribute getWorkstepInstanceStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatus#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatus#getProductInstanceId()
	 * @see #getWorkstepInstanceStatus()
	 * @generated
	 */
	EAttribute getWorkstepInstanceStatus_ProductInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatus#getWorkstepInstanceId <em>Workstep Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatus#getWorkstepInstanceId()
	 * @see #getWorkstepInstanceStatus()
	 * @generated
	 */
	EAttribute getWorkstepInstanceStatus_WorkstepInstanceId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusChangeEvent <em>Workstep Instance Status Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstep Instance Status Change Event</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusChangeEvent
	 * @generated
	 */
	EClass getWorkstepInstanceStatusChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusChangeEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusChangeEvent#getTimestamp()
	 * @see #getWorkstepInstanceStatusChangeEvent()
	 * @generated
	 */
	EAttribute getWorkstepInstanceStatusChangeEvent_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.workplan.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getWorkstepInstanceId <em>Workstep Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration#getWorkstepInstanceId()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_WorkstepInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getAgentId <em>Agent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration#getAgentId()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_AgentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration#getAverage()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Average();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration#getStandardDeviation()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_StandardDeviation();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusEnum <em>Workstep Instance Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Workstep Instance Status Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusEnum
	 * @generated
	 */
	EEnum getWorkstepInstanceStatusEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkplanFactory getWorkplanFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkplanInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkplanInstance()
		 * @generated
		 */
		EClass WORKPLAN_INSTANCE = eINSTANCE.getWorkplanInstance();

		/**
		 * The meta object literal for the '<em><b>Product Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKPLAN_INSTANCE__PRODUCT_INSTANCE_ID = eINSTANCE.getWorkplanInstance_ProductInstanceId();

		/**
		 * The meta object literal for the '<em><b>Workstep Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKPLAN_INSTANCE__WORKSTEP_INSTANCES = eINSTANCE.getWorkplanInstance_WorkstepInstances();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl <em>Workstep Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstance()
		 * @generated
		 */
		EClass WORKSTEP_INSTANCE = eINSTANCE.getWorkstepInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE__NAME = eINSTANCE.getWorkstepInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE__COMPONENT_ID = eINSTANCE.getWorkstepInstance_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Is Automatic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE__IS_AUTOMATIC = eINSTANCE.getWorkstepInstance_IsAutomatic();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusImpl <em>Workstep Instance Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusImpl
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstanceStatus()
		 * @generated
		 */
		EClass WORKSTEP_INSTANCE_STATUS = eINSTANCE.getWorkstepInstanceStatus();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE_STATUS__STATUS = eINSTANCE.getWorkstepInstanceStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Product Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE_STATUS__PRODUCT_INSTANCE_ID = eINSTANCE.getWorkstepInstanceStatus_ProductInstanceId();

		/**
		 * The meta object literal for the '<em><b>Workstep Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID = eINSTANCE.getWorkstepInstanceStatus_WorkstepInstanceId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusChangeEventImpl <em>Workstep Instance Status Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusChangeEventImpl
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstanceStatusChangeEvent()
		 * @generated
		 */
		EClass WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT = eINSTANCE.getWorkstepInstanceStatusChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT__TIMESTAMP = eINSTANCE.getWorkstepInstanceStatusChangeEvent_Timestamp();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Workstep Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__WORKSTEP_INSTANCE_ID = eINSTANCE.getDuration_WorkstepInstanceId();

		/**
		 * The meta object literal for the '<em><b>Agent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__AGENT_ID = eINSTANCE.getDuration_AgentId();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__AVERAGE = eINSTANCE.getDuration_Average();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__STANDARD_DEVIATION = eINSTANCE.getDuration_StandardDeviation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusEnum <em>Workstep Instance Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusEnum
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstanceStatusEnum()
		 * @generated
		 */
		EEnum WORKSTEP_INSTANCE_STATUS_ENUM = eINSTANCE.getWorkstepInstanceStatusEnum();

	}

} //WorkplanPackage
