/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition.util;

import de.dfki.cos.basys.platform.model.base.BObject;
import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.processdefinition.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage
 * @generated
 */
public class ProcessdefinitionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessdefinitionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessdefinitionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProcessdefinitionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessdefinitionSwitch<Adapter> modelSwitch =
		new ProcessdefinitionSwitch<Adapter>() {
			@Override
			public Adapter caseProcessDefinition(ProcessDefinition object) {
				return createProcessDefinitionAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseFlowNode(FlowNode object) {
				return createFlowNodeAdapter();
			}
			@Override
			public Adapter caseTaskFlow(TaskFlow object) {
				return createTaskFlowAdapter();
			}
			@Override
			public Adapter caseTaskDependency(TaskDependency object) {
				return createTaskDependencyAdapter();
			}
			@Override
			public Adapter caseGateway(Gateway object) {
				return createGatewayAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseDataMapping(DataMapping object) {
				return createDataMappingAdapter();
			}
			@Override
			public Adapter caseDataTransformation(DataTransformation object) {
				return createDataTransformationAdapter();
			}
			@Override
			public Adapter caseTaskState(TaskState object) {
				return createTaskStateAdapter();
			}
			@Override
			public Adapter caseTaskInactive(TaskInactive object) {
				return createTaskInactiveAdapter();
			}
			@Override
			public Adapter caseTaskActive(TaskActive object) {
				return createTaskActiveAdapter();
			}
			@Override
			public Adapter caseTaskPaused(TaskPaused object) {
				return createTaskPausedAdapter();
			}
			@Override
			public Adapter caseTaskExecuting(TaskExecuting object) {
				return createTaskExecutingAdapter();
			}
			@Override
			public Adapter caseTaskFinished(TaskFinished object) {
				return createTaskFinishedAdapter();
			}
			@Override
			public Adapter caseTaskSuccessful(TaskSuccessful object) {
				return createTaskSuccessfulAdapter();
			}
			@Override
			public Adapter caseTaskFailed(TaskFailed object) {
				return createTaskFailedAdapter();
			}
			@Override
			public Adapter caseTaskCancelled(TaskCancelled object) {
				return createTaskCancelledAdapter();
			}
			@Override
			public Adapter caseUsedMaterial(UsedMaterial object) {
				return createUsedMaterialAdapter();
			}
			@Override
			public Adapter caseBObject(BObject object) {
				return createBObjectAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition
	 * @generated
	 */
	public Adapter createProcessDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow <em>Task Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow
	 * @generated
	 */
	public Adapter createTaskFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskDependency <em>Task Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskDependency
	 * @generated
	 */
	public Adapter createTaskDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping
	 * @generated
	 */
	public Adapter createDataMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataTransformation <em>Data Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.DataTransformation
	 * @generated
	 */
	public Adapter createDataTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskState <em>Task State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskState
	 * @generated
	 */
	public Adapter createTaskStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskInactive <em>Task Inactive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskInactive
	 * @generated
	 */
	public Adapter createTaskInactiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskActive <em>Task Active</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskActive
	 * @generated
	 */
	public Adapter createTaskActiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskPaused <em>Task Paused</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskPaused
	 * @generated
	 */
	public Adapter createTaskPausedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskExecuting <em>Task Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskExecuting
	 * @generated
	 */
	public Adapter createTaskExecutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFinished <em>Task Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFinished
	 * @generated
	 */
	public Adapter createTaskFinishedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskSuccessful <em>Task Successful</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskSuccessful
	 * @generated
	 */
	public Adapter createTaskSuccessfulAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFailed <em>Task Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFailed
	 * @generated
	 */
	public Adapter createTaskFailedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskCancelled <em>Task Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskCancelled
	 * @generated
	 */
	public Adapter createTaskCancelledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial <em>Used Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial
	 * @generated
	 */
	public Adapter createUsedMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.base.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.base.BObject
	 * @generated
	 */
	public Adapter createBObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.base.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProcessdefinitionAdapterFactory
