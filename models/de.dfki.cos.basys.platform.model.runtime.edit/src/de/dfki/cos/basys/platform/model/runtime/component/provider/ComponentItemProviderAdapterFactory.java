/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.provider;

import de.dfki.cos.basys.platform.model.runtime.component.util.ComponentAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProviderAdapterFactory extends ComponentAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ComponentItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInfoItemProvider componentInfoItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInfoAdapter() {
		if (componentInfoItemProvider == null) {
			componentInfoItemProvider = new ComponentInfoItemProvider(this);
		}

		return componentInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentConfigurationItemProvider componentConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentConfigurationAdapter() {
		if (componentConfigurationItemProvider == null) {
			componentConfigurationItemProvider = new ComponentConfigurationItemProvider(this);
		}

		return componentConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRequestCollectionItemProvider componentRequestCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentRequestCollectionAdapter() {
		if (componentRequestCollectionItemProvider == null) {
			componentRequestCollectionItemProvider = new ComponentRequestCollectionItemProvider(this);
		}

		return componentRequestCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRequestStatusItemProvider componentRequestStatusItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentRequestStatusAdapter() {
		if (componentRequestStatusItemProvider == null) {
			componentRequestStatusItemProvider = new ComponentRequestStatusItemProvider(this);
		}

		return componentRequestStatusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.StatusRequest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusRequestItemProvider statusRequestItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.StatusRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatusRequestAdapter() {
		if (statusRequestItemProvider == null) {
			statusRequestItemProvider = new StatusRequestItemProvider(this);
		}

		return statusRequestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentResponseItemProvider componentResponseItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentResponseAdapter() {
		if (componentResponseItemProvider == null) {
			componentResponseItemProvider = new ComponentResponseItemProvider(this);
		}

		return componentResponseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccupationLevelRequestItemProvider occupationLevelRequestItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOccupationLevelRequestAdapter() {
		if (occupationLevelRequestItemProvider == null) {
			occupationLevelRequestItemProvider = new OccupationLevelRequestItemProvider(this);
		}

		return occupationLevelRequestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionModeRequestItemProvider executionModeRequestItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionModeRequestAdapter() {
		if (executionModeRequestItemProvider == null) {
			executionModeRequestItemProvider = new ExecutionModeRequestItemProvider(this);
		}

		return executionModeRequestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionCommandRequestItemProvider executionCommandRequestItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionCommandRequestAdapter() {
		if (executionCommandRequestItemProvider == null) {
			executionCommandRequestItemProvider = new ExecutionCommandRequestItemProvider(this);
		}

		return executionCommandRequestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationModeRequestItemProvider operationModeRequestItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationModeRequestAdapter() {
		if (operationModeRequestItemProvider == null) {
			operationModeRequestItemProvider = new OperationModeRequestItemProvider(this);
		}

		return operationModeRequestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationConfigurationItemProvider simulationConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimulationConfigurationAdapter() {
		if (simulationConfigurationItemProvider == null) {
			simulationConfigurationItemProvider = new SimulationConfigurationItemProvider(this);
		}

		return simulationConfigurationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void dispose() {
		if (componentInfoItemProvider != null) componentInfoItemProvider.dispose();
		if (componentConfigurationItemProvider != null) componentConfigurationItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (componentRequestCollectionItemProvider != null) componentRequestCollectionItemProvider.dispose();
		if (componentRequestStatusItemProvider != null) componentRequestStatusItemProvider.dispose();
		if (statusRequestItemProvider != null) statusRequestItemProvider.dispose();
		if (componentResponseItemProvider != null) componentResponseItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (occupationLevelRequestItemProvider != null) occupationLevelRequestItemProvider.dispose();
		if (executionModeRequestItemProvider != null) executionModeRequestItemProvider.dispose();
		if (executionCommandRequestItemProvider != null) executionCommandRequestItemProvider.dispose();
		if (operationModeRequestItemProvider != null) operationModeRequestItemProvider.dispose();
		if (simulationConfigurationItemProvider != null) simulationConfigurationItemProvider.dispose();
	}

}
