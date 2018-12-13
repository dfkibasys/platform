/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dfki.cos.basys.platform.model.base.BasePackage;

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
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ProcessdefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "processdefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/processdefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "processdefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessdefinitionPackage eINSTANCE = de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessDefinitionImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getProcessDefinition()
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
	 * The feature id for the '<em><b>Product Variant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__PRODUCT_VARIANT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.NodeImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getNode()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.EdgeImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getEdge()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.FlowNodeImpl <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.FlowNodeImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getFlowNode()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFlowImpl <em>Task Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFlowImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskFlow()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskDependencyImpl <em>Task Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskDependencyImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskDependency()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.GatewayImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getGateway()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTask()
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
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CAPABILITY_REQUIREMENT = FLOW_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Usedmaterial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__USEDMATERIAL = FLOW_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataFlowImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getDataFlow()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getData()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataMappingImpl <em>Data Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataMappingImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getDataMapping()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataTransformationImpl <em>Data Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataTransformationImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getDataTransformation()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskStateImpl <em>Task State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskStateImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskState()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskInactiveImpl <em>Task Inactive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskInactiveImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskInactive()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskActiveImpl <em>Task Active</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskActiveImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskActive()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskPausedImpl <em>Task Paused</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskPausedImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskPaused()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskExecutingImpl <em>Task Executing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskExecutingImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskExecuting()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFinishedImpl <em>Task Finished</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFinishedImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskFinished()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskSuccessfulImpl <em>Task Successful</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskSuccessfulImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskSuccessful()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFailedImpl <em>Task Failed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFailedImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskFailed()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskCancelledImpl <em>Task Cancelled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskCancelledImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskCancelled()
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.UsedMaterialImpl <em>Used Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.UsedMaterialImpl
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getUsedMaterial()
	 * @generated
	 */
	int USED_MATERIAL = 21;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_MATERIAL__COUNT = 0;

	/**
	 * The feature id for the '<em><b>Bom Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_MATERIAL__BOM_ENTRY = 1;

	/**
	 * The number of structural features of the '<em>Used Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_MATERIAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Used Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_MATERIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.GatewayTypeEnum <em>Gateway Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.GatewayTypeEnum
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getGatewayTypeEnum()
	 * @generated
	 */
	int GATEWAY_TYPE_ENUM = 22;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum <em>Task State Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskStateEnum()
	 * @generated
	 */
	int TASK_STATE_ENUM = 23;


	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Definition</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition
	 * @generated
	 */
	EClass getProcessDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition#getNodes()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition#getEdges()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Edges();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition#getProductVariant <em>Product Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Variant</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition#getProductVariant()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_ProductVariant();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incoming();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getSourceRef()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getTargetRef()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_TargetRef();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow <em>Task Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Flow</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow
	 * @generated
	 */
	EClass getTaskFlow();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source State</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getSourceState()
	 * @see #getTaskFlow()
	 * @generated
	 */
	EAttribute getTaskFlow_SourceState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target State</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getTargetState()
	 * @see #getTaskFlow()
	 * @generated
	 */
	EAttribute getTaskFlow_TargetState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getCondition()
	 * @see #getTaskFlow()
	 * @generated
	 */
	EAttribute getTaskFlow_Condition();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskDependency <em>Task Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Dependency</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskDependency
	 * @generated
	 */
	EClass getTaskDependency();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskDependency#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source State</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskDependency#getSourceState()
	 * @see #getTaskDependency()
	 * @generated
	 */
	EAttribute getTaskDependency_SourceState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskDependency#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target State</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskDependency#getTargetState()
	 * @see #getTaskDependency()
	 * @generated
	 */
	EAttribute getTaskDependency_TargetState();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Gateway#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Gateway#getType()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getMinIterations <em>Min Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Iterations</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getMinIterations()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MinIterations();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getMaxIterations <em>Max Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Iterations</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getMaxIterations()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MaxIterations();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getUri()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Data</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getInputData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_InputData();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getOutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Data</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getOutputData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OutputData();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getCapabilityRequirement <em>Capability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Requirement</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getCapabilityRequirement()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_CapabilityRequirement();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getUsedmaterial <em>Usedmaterial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usedmaterial</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getUsedmaterial()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Usedmaterial();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataFlow#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataFlow#getTransformation()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Transformation();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getAvailableOn <em>Available On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available On</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getAvailableOn()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_AvailableOn();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getTaskRef <em>Task Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Ref</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getTaskRef()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_TaskRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getPattern()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getInstance()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Instance();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mappings</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getMappings()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Mappings();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Mapping</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping
	 * @generated
	 */
	EClass getDataMapping();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping#getSourceName()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_SourceName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping#getSourcePath <em>Source Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Path</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping#getSourcePath()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_SourcePath();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping#getTargetName()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_TargetName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping#getTargetPath <em>Target Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Path</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping#getTargetPath()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_TargetPath();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataTransformation <em>Data Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Transformation</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataTransformation
	 * @generated
	 */
	EClass getDataTransformation();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataTransformation#apply(java.lang.Object) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataTransformation#apply(java.lang.Object)
	 * @generated
	 */
	EOperation getDataTransformation__Apply__Object();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskState <em>Task State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task State</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskState
	 * @generated
	 */
	EClass getTaskState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskState#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskState#getTimestamp()
	 * @see #getTaskState()
	 * @generated
	 */
	EAttribute getTaskState_Timestamp();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskState#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskState#toEnum()
	 * @generated
	 */
	EOperation getTaskState__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskInactive <em>Task Inactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Inactive</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskInactive
	 * @generated
	 */
	EClass getTaskInactive();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskInactive#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskInactive#toEnum()
	 * @generated
	 */
	EOperation getTaskInactive__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskActive <em>Task Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Active</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskActive
	 * @generated
	 */
	EClass getTaskActive();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskActive#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskActive#toEnum()
	 * @generated
	 */
	EOperation getTaskActive__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskPaused <em>Task Paused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Paused</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskPaused
	 * @generated
	 */
	EClass getTaskPaused();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskPaused#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskPaused#toEnum()
	 * @generated
	 */
	EOperation getTaskPaused__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskExecuting <em>Task Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Executing</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskExecuting
	 * @generated
	 */
	EClass getTaskExecuting();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskExecuting#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskExecuting#toEnum()
	 * @generated
	 */
	EOperation getTaskExecuting__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFinished <em>Task Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Finished</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFinished
	 * @generated
	 */
	EClass getTaskFinished();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFinished#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFinished#toEnum()
	 * @generated
	 */
	EOperation getTaskFinished__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskSuccessful <em>Task Successful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Successful</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskSuccessful
	 * @generated
	 */
	EClass getTaskSuccessful();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskSuccessful#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskSuccessful#toEnum()
	 * @generated
	 */
	EOperation getTaskSuccessful__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFailed <em>Task Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Failed</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFailed
	 * @generated
	 */
	EClass getTaskFailed();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFailed#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFailed#toEnum()
	 * @generated
	 */
	EOperation getTaskFailed__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskCancelled <em>Task Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Cancelled</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskCancelled
	 * @generated
	 */
	EClass getTaskCancelled();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskCancelled#toEnum() <em>To Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Enum</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskCancelled#toEnum()
	 * @generated
	 */
	EOperation getTaskCancelled__ToEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial <em>Used Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used Material</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial
	 * @generated
	 */
	EClass getUsedMaterial();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial#getCount()
	 * @see #getUsedMaterial()
	 * @generated
	 */
	EAttribute getUsedMaterial_Count();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial#getBomEntry <em>Bom Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bom Entry</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial#getBomEntry()
	 * @see #getUsedMaterial()
	 * @generated
	 */
	EReference getUsedMaterial_BomEntry();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.GatewayTypeEnum <em>Gateway Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Type Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.GatewayTypeEnum
	 * @generated
	 */
	EEnum getGatewayTypeEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum <em>Task State Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task State Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum
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
	ProcessdefinitionFactory getProcessdefinitionFactory();

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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessDefinitionImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getProcessDefinition()
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
		 * The meta object literal for the '<em><b>Product Variant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__PRODUCT_VARIANT = eINSTANCE.getProcessDefinition_ProductVariant();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.NodeImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getNode()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.EdgeImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getEdge()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.FlowNodeImpl <em>Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.FlowNodeImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getFlowNode()
		 * @generated
		 */
		EClass FLOW_NODE = eINSTANCE.getFlowNode();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFlowImpl <em>Task Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFlowImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskFlow()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskDependencyImpl <em>Task Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskDependencyImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskDependency()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.GatewayImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getGateway()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTask()
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
		 * The meta object literal for the '<em><b>Capability Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__CAPABILITY_REQUIREMENT = eINSTANCE.getTask_CapabilityRequirement();

		/**
		 * The meta object literal for the '<em><b>Usedmaterial</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__USEDMATERIAL = eINSTANCE.getTask_Usedmaterial();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataFlowImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getDataFlow()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getData()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataMappingImpl <em>Data Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataMappingImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getDataMapping()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataTransformationImpl <em>Data Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataTransformationImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getDataTransformation()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskStateImpl <em>Task State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskStateImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskState()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskInactiveImpl <em>Task Inactive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskInactiveImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskInactive()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskActiveImpl <em>Task Active</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskActiveImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskActive()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskPausedImpl <em>Task Paused</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskPausedImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskPaused()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskExecutingImpl <em>Task Executing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskExecutingImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskExecuting()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFinishedImpl <em>Task Finished</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFinishedImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskFinished()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskSuccessfulImpl <em>Task Successful</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskSuccessfulImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskSuccessful()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFailedImpl <em>Task Failed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskFailedImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskFailed()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskCancelledImpl <em>Task Cancelled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.TaskCancelledImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskCancelled()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.UsedMaterialImpl <em>Used Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.UsedMaterialImpl
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getUsedMaterial()
		 * @generated
		 */
		EClass USED_MATERIAL = eINSTANCE.getUsedMaterial();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USED_MATERIAL__COUNT = eINSTANCE.getUsedMaterial_Count();

		/**
		 * The meta object literal for the '<em><b>Bom Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_MATERIAL__BOM_ENTRY = eINSTANCE.getUsedMaterial_BomEntry();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.GatewayTypeEnum <em>Gateway Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.GatewayTypeEnum
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getGatewayTypeEnum()
		 * @generated
		 */
		EEnum GATEWAY_TYPE_ENUM = eINSTANCE.getGatewayTypeEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum <em>Task State Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum
		 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl#getTaskStateEnum()
		 * @generated
		 */
		EEnum TASK_STATE_ENUM = eINSTANCE.getTaskStateEnum();

	}

} //ProcessdefinitionPackage
