/**
 */
package de.dfki.iui.basys.model.domain.process;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.dfki.iui.basys.model.domain.process.ProcessFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ProcessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "process";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/process";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "process";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessPackage eINSTANCE = de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.ProcessDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessDefinitionImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getProcessDefinition()
	 * @generated
	 */
	int PROCESS_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__NODES = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__EDGES = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.NodeImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.EdgeImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE_REF = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET_REF = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.FlowNodeImpl <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.FlowNodeImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__BINDING = NODE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__METADATA = NODE__METADATA;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__INCOMING = NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskFlowImpl <em>Task Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskFlowImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskFlow()
	 * @generated
	 */
	int TASK_FLOW = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW__BINDING = EDGE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW__ID = EDGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW__METADATA = EDGE__METADATA;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW__SOURCE_REF = EDGE__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW__TARGET_REF = EDGE__TARGET_REF;

	/**
	 * The feature id for the '<em><b>Source State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW__SOURCE_STATE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW__TARGET_STATE = EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW__CONDITION = EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW_FEATURE_COUNT = EDGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOW_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskDependencyImpl <em>Task Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskDependencyImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskDependency()
	 * @generated
	 */
	int TASK_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__BINDING = EDGE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__ID = EDGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__METADATA = EDGE__METADATA;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__SOURCE_REF = EDGE__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__TARGET_REF = EDGE__TARGET_REF;

	/**
	 * The feature id for the '<em><b>Source State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__SOURCE_STATE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__TARGET_STATE = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY_FEATURE_COUNT = EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.GatewayImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__BINDING = FLOW_NODE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__METADATA = FLOW_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__TYPE = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BINDING = FLOW_NODE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__METADATA = FLOW_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Min Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MIN_ITERATIONS = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MAX_ITERATIONS = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__URI = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUT_DATA = FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUT_DATA = FLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.DataFlowImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__BINDING = EDGE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ID = EDGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__METADATA = EDGE__METADATA;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE_REF = EDGE__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TARGET_REF = EDGE__TARGET_REF;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TRANSFORMATION = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.DataImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getData()
	 * @generated
	 */
	int DATA = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BINDING = NODE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__METADATA = NODE__METADATA;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Available On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__AVAILABLE_ON = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TASK_REF = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PATTERN = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__INSTANCE = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MAPPINGS = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.DataMappingImpl <em>Data Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.DataMappingImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getDataMapping()
	 * @generated
	 */
	int DATA_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING__SOURCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING__SOURCE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING__TARGET_NAME = 2;

	/**
	 * The feature id for the '<em><b>Target Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING__TARGET_PATH = 3;

	/**
	 * The number of structural features of the '<em>Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.DataTransformationImpl <em>Data Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.DataTransformationImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getDataTransformation()
	 * @generated
	 */
	int DATA_TRANSFORMATION = 11;

	/**
	 * The number of structural features of the '<em>Data Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFORMATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFORMATION___APPLY__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Data Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFORMATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskStateImpl <em>Task State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskStateImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskState()
	 * @generated
	 */
	int TASK_STATE = 12;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE__TIMESTAMP = 0;

	/**
	 * The number of structural features of the '<em>Task State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>To Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE___TO_ENUM = 0;

	/**
	 * The number of operations of the '<em>Task State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskInactiveImpl <em>Task Inactive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskInactiveImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskInactive()
	 * @generated
	 */
	int TASK_INACTIVE = 13;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INACTIVE__TIMESTAMP = TASK_STATE__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Task Inactive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INACTIVE_FEATURE_COUNT = TASK_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INACTIVE___TO_ENUM = TASK_STATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Inactive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INACTIVE_OPERATION_COUNT = TASK_STATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskActiveImpl <em>Task Active</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskActiveImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskActive()
	 * @generated
	 */
	int TASK_ACTIVE = 14;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVE__TIMESTAMP = TASK_STATE__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Task Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVE_FEATURE_COUNT = TASK_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVE___TO_ENUM = TASK_STATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVE_OPERATION_COUNT = TASK_STATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskPausedImpl <em>Task Paused</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskPausedImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskPaused()
	 * @generated
	 */
	int TASK_PAUSED = 15;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PAUSED__TIMESTAMP = TASK_ACTIVE__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Task Paused</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PAUSED_FEATURE_COUNT = TASK_ACTIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PAUSED___TO_ENUM = TASK_ACTIVE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Paused</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PAUSED_OPERATION_COUNT = TASK_ACTIVE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskExecutingImpl <em>Task Executing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskExecutingImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskExecuting()
	 * @generated
	 */
	int TASK_EXECUTING = 16;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTING__TIMESTAMP = TASK_ACTIVE__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Task Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTING_FEATURE_COUNT = TASK_ACTIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTING___TO_ENUM = TASK_ACTIVE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Executing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTING_OPERATION_COUNT = TASK_ACTIVE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskFinishedImpl <em>Task Finished</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskFinishedImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskFinished()
	 * @generated
	 */
	int TASK_FINISHED = 17;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FINISHED__TIMESTAMP = TASK_STATE__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Task Finished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FINISHED_FEATURE_COUNT = TASK_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FINISHED___TO_ENUM = TASK_STATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Finished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FINISHED_OPERATION_COUNT = TASK_STATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskSuccessfulImpl <em>Task Successful</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskSuccessfulImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskSuccessful()
	 * @generated
	 */
	int TASK_SUCCESSFUL = 18;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SUCCESSFUL__TIMESTAMP = TASK_FINISHED__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Task Successful</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SUCCESSFUL_FEATURE_COUNT = TASK_FINISHED_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SUCCESSFUL___TO_ENUM = TASK_FINISHED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Successful</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SUCCESSFUL_OPERATION_COUNT = TASK_FINISHED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskFailedImpl <em>Task Failed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskFailedImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskFailed()
	 * @generated
	 */
	int TASK_FAILED = 19;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FAILED__TIMESTAMP = TASK_FINISHED__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Task Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FAILED_FEATURE_COUNT = TASK_FINISHED_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FAILED___TO_ENUM = TASK_FINISHED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FAILED_OPERATION_COUNT = TASK_FINISHED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskCancelledImpl <em>Task Cancelled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.impl.TaskCancelledImpl
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskCancelled()
	 * @generated
	 */
	int TASK_CANCELLED = 20;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CANCELLED__TIMESTAMP = TASK_FINISHED__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Task Cancelled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CANCELLED_FEATURE_COUNT = TASK_FINISHED_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CANCELLED___TO_ENUM = TASK_FINISHED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Cancelled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CANCELLED_OPERATION_COUNT = TASK_FINISHED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.GatewayTypeEnum <em>Gateway Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.GatewayTypeEnum
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getGatewayTypeEnum()
	 * @generated
	 */
	int GATEWAY_TYPE_ENUM = 21;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.process.TaskStateEnum <em>Task State Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.process.TaskStateEnum
	 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskStateEnum()
	 * @generated
	 */
	int TASK_STATE_ENUM = 22;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.ProcessDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.ProcessDefinition
	 * @generated
	 */
	EClass getProcessDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.process.ProcessDefinition#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.ProcessDefinition#getNodes()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.process.ProcessDefinition#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.ProcessDefinition#getEdges()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Edges();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.domain.process.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.domain.process.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incoming();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.process.Edge#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Edge#getSourceRef()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.process.Edge#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Edge#getTargetRef()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_TargetRef();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskFlow <em>Task Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Flow</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskFlow
	 * @generated
	 */
	EClass getTaskFlow();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.TaskFlow#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source State</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskFlow#getSourceState()
	 * @see #getTaskFlow()
	 * @generated
	 */
	EAttribute getTaskFlow_SourceState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.TaskFlow#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target State</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskFlow#getTargetState()
	 * @see #getTaskFlow()
	 * @generated
	 */
	EAttribute getTaskFlow_TargetState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.TaskFlow#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskFlow#getCondition()
	 * @see #getTaskFlow()
	 * @generated
	 */
	EAttribute getTaskFlow_Condition();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskDependency <em>Task Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Dependency</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskDependency
	 * @generated
	 */
	EClass getTaskDependency();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.TaskDependency#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source State</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskDependency#getSourceState()
	 * @see #getTaskDependency()
	 * @generated
	 */
	EAttribute getTaskDependency_SourceState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.TaskDependency#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target State</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskDependency#getTargetState()
	 * @see #getTaskDependency()
	 * @generated
	 */
	EAttribute getTaskDependency_TargetState();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.Gateway#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Gateway#getType()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.Task#getMinIterations <em>Min Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Iterations</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Task#getMinIterations()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MinIterations();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.Task#getMaxIterations <em>Max Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Iterations</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Task#getMaxIterations()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MaxIterations();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.Task#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Task#getUri()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.process.Task#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Data</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Task#getInputData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_InputData();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.process.Task#getOutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Data</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Task#getOutputData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OutputData();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.process.DataFlow#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.DataFlow#getTransformation()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Transformation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.Data#getAvailableOn <em>Available On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available On</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Data#getAvailableOn()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_AvailableOn();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.process.Data#getTaskRef <em>Task Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Ref</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Data#getTaskRef()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_TaskRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.process.Data#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Data#getPattern()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.Data#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Data#getInstance()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Instance();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.process.Data#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mappings</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.Data#getMappings()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Mappings();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.DataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Mapping</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.DataMapping
	 * @generated
	 */
	EClass getDataMapping();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.DataMapping#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.DataMapping#getSourceName()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_SourceName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.DataMapping#getSourcePath <em>Source Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Path</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.DataMapping#getSourcePath()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_SourcePath();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.DataMapping#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Name</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.DataMapping#getTargetName()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_TargetName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.DataMapping#getTargetPath <em>Target Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Path</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.DataMapping#getTargetPath()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_TargetPath();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.DataTransformation <em>Data Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Transformation</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.DataTransformation
	 * @generated
	 */
	EClass getDataTransformation();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.domain.process.DataTransformation#apply(java.lang.Object) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see de.dfki.iui.basys.model.domain.process.DataTransformation#apply(java.lang.Object)
	 * @generated
	 */
	EOperation getDataTransformation__Apply__Object();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskState <em>Task State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task State</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskState
	 * @generated
	 */
	EClass getTaskState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.process.TaskState#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskState#getTimestamp()
	 * @see #getTaskState()
	 * @generated
	 */
	EAttribute getTaskState_Timestamp();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.domain.process.TaskState#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.iui.basys.model.domain.process.TaskState#toEnum()
	 * @generated
	 */
	EOperation getTaskState__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskInactive <em>Task Inactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Inactive</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskInactive
	 * @generated
	 */
	EClass getTaskInactive();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.domain.process.TaskInactive#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.iui.basys.model.domain.process.TaskInactive#toEnum()
	 * @generated
	 */
	EOperation getTaskInactive__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskActive <em>Task Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Active</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskActive
	 * @generated
	 */
	EClass getTaskActive();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.domain.process.TaskActive#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.iui.basys.model.domain.process.TaskActive#toEnum()
	 * @generated
	 */
	EOperation getTaskActive__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskPaused <em>Task Paused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Paused</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskPaused
	 * @generated
	 */
	EClass getTaskPaused();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.domain.process.TaskPaused#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.iui.basys.model.domain.process.TaskPaused#toEnum()
	 * @generated
	 */
	EOperation getTaskPaused__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskExecuting <em>Task Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Executing</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskExecuting
	 * @generated
	 */
	EClass getTaskExecuting();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.domain.process.TaskExecuting#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.iui.basys.model.domain.process.TaskExecuting#toEnum()
	 * @generated
	 */
	EOperation getTaskExecuting__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskFinished <em>Task Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Finished</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskFinished
	 * @generated
	 */
	EClass getTaskFinished();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.domain.process.TaskFinished#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.iui.basys.model.domain.process.TaskFinished#toEnum()
	 * @generated
	 */
	EOperation getTaskFinished__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskSuccessful <em>Task Successful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Successful</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskSuccessful
	 * @generated
	 */
	EClass getTaskSuccessful();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.domain.process.TaskSuccessful#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.iui.basys.model.domain.process.TaskSuccessful#toEnum()
	 * @generated
	 */
	EOperation getTaskSuccessful__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskFailed <em>Task Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Failed</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskFailed
	 * @generated
	 */
	EClass getTaskFailed();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.domain.process.TaskFailed#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.iui.basys.model.domain.process.TaskFailed#toEnum()
	 * @generated
	 */
	EOperation getTaskFailed__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.process.TaskCancelled <em>Task Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Cancelled</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskCancelled
	 * @generated
	 */
	EClass getTaskCancelled();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.domain.process.TaskCancelled#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.iui.basys.model.domain.process.TaskCancelled#toEnum()
	 * @generated
	 */
	EOperation getTaskCancelled__ToEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.process.GatewayTypeEnum <em>Gateway Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Type Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.GatewayTypeEnum
	 * @generated
	 */
	EEnum getGatewayTypeEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.process.TaskStateEnum <em>Task State Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task State Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.process.TaskStateEnum
	 * @generated
	 */
	EEnum getTaskStateEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessFactory getProcessFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.ProcessDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessDefinitionImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getProcessDefinition()
		 * @generated
		 */
		EClass PROCESS_DEFINITION = eINSTANCE.getProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__NODES = eINSTANCE.getProcessDefinition_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__EDGES = eINSTANCE.getProcessDefinition_Edges();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.NodeImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.EdgeImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE_REF = eINSTANCE.getEdge_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET_REF = eINSTANCE.getEdge_TargetRef();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.FlowNodeImpl <em>Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.FlowNodeImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getFlowNode()
		 * @generated
		 */
		EClass FLOW_NODE = eINSTANCE.getFlowNode();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskFlowImpl <em>Task Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskFlowImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskFlow()
		 * @generated
		 */
		EClass TASK_FLOW = eINSTANCE.getTaskFlow();

		/**
		 * The meta object literal for the '<em><b>Source State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_FLOW__SOURCE_STATE = eINSTANCE.getTaskFlow_SourceState();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_FLOW__TARGET_STATE = eINSTANCE.getTaskFlow_TargetState();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_FLOW__CONDITION = eINSTANCE.getTaskFlow_Condition();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskDependencyImpl <em>Task Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskDependencyImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskDependency()
		 * @generated
		 */
		EClass TASK_DEPENDENCY = eINSTANCE.getTaskDependency();

		/**
		 * The meta object literal for the '<em><b>Source State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DEPENDENCY__SOURCE_STATE = eINSTANCE.getTaskDependency_SourceState();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DEPENDENCY__TARGET_STATE = eINSTANCE.getTaskDependency_TargetState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.GatewayImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__TYPE = eINSTANCE.getGateway_Type();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Min Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MIN_ITERATIONS = eINSTANCE.getTask_MinIterations();

		/**
		 * The meta object literal for the '<em><b>Max Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MAX_ITERATIONS = eINSTANCE.getTask_MaxIterations();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__URI = eINSTANCE.getTask_Uri();

		/**
		 * The meta object literal for the '<em><b>Input Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUT_DATA = eINSTANCE.getTask_InputData();

		/**
		 * The meta object literal for the '<em><b>Output Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUT_DATA = eINSTANCE.getTask_OutputData();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.DataFlowImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__TRANSFORMATION = eINSTANCE.getDataFlow_Transformation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.DataImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Available On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__AVAILABLE_ON = eINSTANCE.getData_AvailableOn();

		/**
		 * The meta object literal for the '<em><b>Task Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__TASK_REF = eINSTANCE.getData_TaskRef();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__PATTERN = eINSTANCE.getData_Pattern();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__INSTANCE = eINSTANCE.getData_Instance();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__MAPPINGS = eINSTANCE.getData_Mappings();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.DataMappingImpl <em>Data Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.DataMappingImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getDataMapping()
		 * @generated
		 */
		EClass DATA_MAPPING = eINSTANCE.getDataMapping();

		/**
		 * The meta object literal for the '<em><b>Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAPPING__SOURCE_NAME = eINSTANCE.getDataMapping_SourceName();

		/**
		 * The meta object literal for the '<em><b>Source Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAPPING__SOURCE_PATH = eINSTANCE.getDataMapping_SourcePath();

		/**
		 * The meta object literal for the '<em><b>Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAPPING__TARGET_NAME = eINSTANCE.getDataMapping_TargetName();

		/**
		 * The meta object literal for the '<em><b>Target Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAPPING__TARGET_PATH = eINSTANCE.getDataMapping_TargetPath();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.DataTransformationImpl <em>Data Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.DataTransformationImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getDataTransformation()
		 * @generated
		 */
		EClass DATA_TRANSFORMATION = eINSTANCE.getDataTransformation();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TRANSFORMATION___APPLY__OBJECT = eINSTANCE.getDataTransformation__Apply__Object();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskStateImpl <em>Task State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskStateImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskState()
		 * @generated
		 */
		EClass TASK_STATE = eINSTANCE.getTaskState();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_STATE__TIMESTAMP = eINSTANCE.getTaskState_Timestamp();

		/**
		 * The meta object literal for the '<em><b>To Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_STATE___TO_ENUM = eINSTANCE.getTaskState__ToEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskInactiveImpl <em>Task Inactive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskInactiveImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskInactive()
		 * @generated
		 */
		EClass TASK_INACTIVE = eINSTANCE.getTaskInactive();

		/**
		 * The meta object literal for the '<em><b>To Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_INACTIVE___TO_ENUM = eINSTANCE.getTaskInactive__ToEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskActiveImpl <em>Task Active</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskActiveImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskActive()
		 * @generated
		 */
		EClass TASK_ACTIVE = eINSTANCE.getTaskActive();

		/**
		 * The meta object literal for the '<em><b>To Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_ACTIVE___TO_ENUM = eINSTANCE.getTaskActive__ToEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskPausedImpl <em>Task Paused</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskPausedImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskPaused()
		 * @generated
		 */
		EClass TASK_PAUSED = eINSTANCE.getTaskPaused();

		/**
		 * The meta object literal for the '<em><b>To Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_PAUSED___TO_ENUM = eINSTANCE.getTaskPaused__ToEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskExecutingImpl <em>Task Executing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskExecutingImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskExecuting()
		 * @generated
		 */
		EClass TASK_EXECUTING = eINSTANCE.getTaskExecuting();

		/**
		 * The meta object literal for the '<em><b>To Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_EXECUTING___TO_ENUM = eINSTANCE.getTaskExecuting__ToEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskFinishedImpl <em>Task Finished</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskFinishedImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskFinished()
		 * @generated
		 */
		EClass TASK_FINISHED = eINSTANCE.getTaskFinished();

		/**
		 * The meta object literal for the '<em><b>To Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_FINISHED___TO_ENUM = eINSTANCE.getTaskFinished__ToEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskSuccessfulImpl <em>Task Successful</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskSuccessfulImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskSuccessful()
		 * @generated
		 */
		EClass TASK_SUCCESSFUL = eINSTANCE.getTaskSuccessful();

		/**
		 * The meta object literal for the '<em><b>To Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_SUCCESSFUL___TO_ENUM = eINSTANCE.getTaskSuccessful__ToEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskFailedImpl <em>Task Failed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskFailedImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskFailed()
		 * @generated
		 */
		EClass TASK_FAILED = eINSTANCE.getTaskFailed();

		/**
		 * The meta object literal for the '<em><b>To Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_FAILED___TO_ENUM = eINSTANCE.getTaskFailed__ToEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.impl.TaskCancelledImpl <em>Task Cancelled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.impl.TaskCancelledImpl
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskCancelled()
		 * @generated
		 */
		EClass TASK_CANCELLED = eINSTANCE.getTaskCancelled();

		/**
		 * The meta object literal for the '<em><b>To Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_CANCELLED___TO_ENUM = eINSTANCE.getTaskCancelled__ToEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.GatewayTypeEnum <em>Gateway Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.GatewayTypeEnum
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getGatewayTypeEnum()
		 * @generated
		 */
		EEnum GATEWAY_TYPE_ENUM = eINSTANCE.getGatewayTypeEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.process.TaskStateEnum <em>Task State Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.process.TaskStateEnum
		 * @see de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl#getTaskStateEnum()
		 * @generated
		 */
		EEnum TASK_STATE_ENUM = eINSTANCE.getTaskStateEnum();

	}

} //ProcessPackage
