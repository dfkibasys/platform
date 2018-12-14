/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.dfki.cos.basys.platform.model.domain.processdefinition.util.ProcessdefinitionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessdefinitionItemProviderAdapterFactory extends ProcessdefinitionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessdefinitionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessDefinitionItemProvider processDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessDefinitionAdapter() {
		if (processDefinitionItemProvider == null) {
			processDefinitionItemProvider = new ProcessDefinitionItemProvider(this);
		}

		return processDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskFlowItemProvider taskFlowItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskFlowAdapter() {
		if (taskFlowItemProvider == null) {
			taskFlowItemProvider = new TaskFlowItemProvider(this);
		}

		return taskFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskDependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDependencyItemProvider taskDependencyItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskDependencyAdapter() {
		if (taskDependencyItemProvider == null) {
			taskDependencyItemProvider = new TaskDependencyItemProvider(this);
		}

		return taskDependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.Gateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayItemProvider gatewayItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.Gateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGatewayAdapter() {
		if (gatewayItemProvider == null) {
			gatewayItemProvider = new GatewayItemProvider(this);
		}

		return gatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowItemProvider dataFlowItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataFlowAdapter() {
		if (dataFlowItemProvider == null) {
			dataFlowItemProvider = new DataFlowItemProvider(this);
		}

		return dataFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemProvider dataItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataAdapter() {
		if (dataItemProvider == null) {
			dataItemProvider = new DataItemProvider(this);
		}

		return dataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMappingItemProvider dataMappingItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataMappingAdapter() {
		if (dataMappingItemProvider == null) {
			dataMappingItemProvider = new DataMappingItemProvider(this);
		}

		return dataMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataTransformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTransformationItemProvider dataTransformationItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.DataTransformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTransformationAdapter() {
		if (dataTransformationItemProvider == null) {
			dataTransformationItemProvider = new DataTransformationItemProvider(this);
		}

		return dataTransformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskInactive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInactiveItemProvider taskInactiveItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskInactive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskInactiveAdapter() {
		if (taskInactiveItemProvider == null) {
			taskInactiveItemProvider = new TaskInactiveItemProvider(this);
		}

		return taskInactiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskActive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskActiveItemProvider taskActiveItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskActive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskActiveAdapter() {
		if (taskActiveItemProvider == null) {
			taskActiveItemProvider = new TaskActiveItemProvider(this);
		}

		return taskActiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskPaused} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskPausedItemProvider taskPausedItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskPaused}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskPausedAdapter() {
		if (taskPausedItemProvider == null) {
			taskPausedItemProvider = new TaskPausedItemProvider(this);
		}

		return taskPausedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskExecuting} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskExecutingItemProvider taskExecutingItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskExecuting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskExecutingAdapter() {
		if (taskExecutingItemProvider == null) {
			taskExecutingItemProvider = new TaskExecutingItemProvider(this);
		}

		return taskExecutingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFinished} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskFinishedItemProvider taskFinishedItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFinished}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskFinishedAdapter() {
		if (taskFinishedItemProvider == null) {
			taskFinishedItemProvider = new TaskFinishedItemProvider(this);
		}

		return taskFinishedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskSuccessful} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskSuccessfulItemProvider taskSuccessfulItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskSuccessful}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskSuccessfulAdapter() {
		if (taskSuccessfulItemProvider == null) {
			taskSuccessfulItemProvider = new TaskSuccessfulItemProvider(this);
		}

		return taskSuccessfulItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFailed} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskFailedItemProvider taskFailedItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFailed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskFailedAdapter() {
		if (taskFailedItemProvider == null) {
			taskFailedItemProvider = new TaskFailedItemProvider(this);
		}

		return taskFailedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskCancelled} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskCancelledItemProvider taskCancelledItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskCancelled}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskCancelledAdapter() {
		if (taskCancelledItemProvider == null) {
			taskCancelledItemProvider = new TaskCancelledItemProvider(this);
		}

		return taskCancelledItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedMaterialItemProvider usedMaterialItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsedMaterialAdapter() {
		if (usedMaterialItemProvider == null) {
			usedMaterialItemProvider = new UsedMaterialItemProvider(this);
		}

		return usedMaterialItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (processDefinitionItemProvider != null) processDefinitionItemProvider.dispose();
		if (taskFlowItemProvider != null) taskFlowItemProvider.dispose();
		if (taskDependencyItemProvider != null) taskDependencyItemProvider.dispose();
		if (gatewayItemProvider != null) gatewayItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (dataFlowItemProvider != null) dataFlowItemProvider.dispose();
		if (dataItemProvider != null) dataItemProvider.dispose();
		if (dataMappingItemProvider != null) dataMappingItemProvider.dispose();
		if (dataTransformationItemProvider != null) dataTransformationItemProvider.dispose();
		if (taskInactiveItemProvider != null) taskInactiveItemProvider.dispose();
		if (taskActiveItemProvider != null) taskActiveItemProvider.dispose();
		if (taskPausedItemProvider != null) taskPausedItemProvider.dispose();
		if (taskExecutingItemProvider != null) taskExecutingItemProvider.dispose();
		if (taskFinishedItemProvider != null) taskFinishedItemProvider.dispose();
		if (taskSuccessfulItemProvider != null) taskSuccessfulItemProvider.dispose();
		if (taskFailedItemProvider != null) taskFailedItemProvider.dispose();
		if (taskCancelledItemProvider != null) taskCancelledItemProvider.dispose();
		if (usedMaterialItemProvider != null) usedMaterialItemProvider.dispose();
	}

}