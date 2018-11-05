/**
 */
package de.dfki.iui.basys.model.domain.processinstance;

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
 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ProcessinstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "processinstance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/processinstance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "processinstance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessinstancePackage eINSTANCE = de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceImpl <em>Process Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl#getProcessInstance()
	 * @generated
	 */
	int PROCESS_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Process Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__PROCESS_DEFINITION = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__ORDER = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__PRODUCT_INSTANCE = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__STATE = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Task Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__TASK_INSTANCES = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Process Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Process Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.processinstance.impl.TaskInstanceImpl <em>Task Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.processinstance.impl.TaskInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl#getTaskInstance()
	 * @generated
	 */
	int TASK_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__STATE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__TASK = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceStoreImpl <em>Process Instance Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceStoreImpl
	 * @see de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl#getProcessInstanceStore()
	 * @generated
	 */
	int PROCESS_INSTANCE_STORE = 2;

	/**
	 * The feature id for the '<em><b>Process Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE_STORE__PROCESS_INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Process Instance Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE_STORE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Process Instance Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE_STORE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance <em>Process Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessInstance
	 * @generated
	 */
	EClass getProcessInstance();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Definition</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProcessDefinition()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EReference getProcessInstance_ProcessDefinition();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getOrder()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EReference getProcessInstance_Order();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProductInstance()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EReference getProcessInstance_ProductInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getState()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EAttribute getProcessInstance_State();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getTaskInstances <em>Task Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Instances</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getTaskInstances()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EReference getProcessInstance_TaskInstances();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.processinstance.TaskInstance <em>Task Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.TaskInstance
	 * @generated
	 */
	EClass getTaskInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.processinstance.TaskInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.TaskInstance#getState()
	 * @see #getTaskInstance()
	 * @generated
	 */
	EAttribute getTaskInstance_State();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.processinstance.TaskInstance#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.TaskInstance#getTask()
	 * @see #getTaskInstance()
	 * @generated
	 */
	EReference getTaskInstance_Task();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstanceStore <em>Process Instance Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Instance Store</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessInstanceStore
	 * @generated
	 */
	EClass getProcessInstanceStore();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstanceStore#getProcessInstances <em>Process Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Instances</em>'.
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessInstanceStore#getProcessInstances()
	 * @see #getProcessInstanceStore()
	 * @generated
	 */
	EReference getProcessInstanceStore_ProcessInstances();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessinstanceFactory getProcessinstanceFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceImpl <em>Process Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl#getProcessInstance()
		 * @generated
		 */
		EClass PROCESS_INSTANCE = eINSTANCE.getProcessInstance();

		/**
		 * The meta object literal for the '<em><b>Process Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE__PROCESS_DEFINITION = eINSTANCE.getProcessInstance_ProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE__ORDER = eINSTANCE.getProcessInstance_Order();

		/**
		 * The meta object literal for the '<em><b>Product Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE__PRODUCT_INSTANCE = eINSTANCE.getProcessInstance_ProductInstance();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INSTANCE__STATE = eINSTANCE.getProcessInstance_State();

		/**
		 * The meta object literal for the '<em><b>Task Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE__TASK_INSTANCES = eINSTANCE.getProcessInstance_TaskInstances();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.processinstance.impl.TaskInstanceImpl <em>Task Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.processinstance.impl.TaskInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl#getTaskInstance()
		 * @generated
		 */
		EClass TASK_INSTANCE = eINSTANCE.getTaskInstance();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_INSTANCE__STATE = eINSTANCE.getTaskInstance_State();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INSTANCE__TASK = eINSTANCE.getTaskInstance_Task();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceStoreImpl <em>Process Instance Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceStoreImpl
		 * @see de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl#getProcessInstanceStore()
		 * @generated
		 */
		EClass PROCESS_INSTANCE_STORE = eINSTANCE.getProcessInstanceStore();

		/**
		 * The meta object literal for the '<em><b>Process Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE_STORE__PROCESS_INSTANCES = eINSTANCE.getProcessInstanceStore_ProcessInstances();

	}

} //ProcessinstancePackage
