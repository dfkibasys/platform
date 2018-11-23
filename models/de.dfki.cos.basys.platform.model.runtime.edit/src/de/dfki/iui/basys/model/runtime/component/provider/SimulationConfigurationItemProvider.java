/**
 */
package de.dfki.iui.basys.model.runtime.component.provider;


import de.dfki.iui.basys.model.runtime.communication.provider.RuntimeEditPlugin;

import de.dfki.iui.basys.model.runtime.component.ComponentFactory;
import de.dfki.iui.basys.model.runtime.component.ComponentPackage;
import de.dfki.iui.basys.model.runtime.component.SimulationConfiguration;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.runtime.component.SimulationConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationConfigurationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOnResettingDurationPropertyDescriptor(object);
			addOnStartingDurationPropertyDescriptor(object);
			addOnExecuteDurationPropertyDescriptor(object);
			addOnCompletingDurationPropertyDescriptor(object);
			addOnStoppingDurationPropertyDescriptor(object);
			addOnAbortingDurationPropertyDescriptor(object);
			addOnClearingDurationPropertyDescriptor(object);
			addOnHoldingDurationPropertyDescriptor(object);
			addOnUnholdingDurationPropertyDescriptor(object);
			addOnSuspendingDurationPropertyDescriptor(object);
			addOnUnsuspendingDurationPropertyDescriptor(object);
			addOnCompletingStatusCodePropertyDescriptor(object);
			addOnStoppingStatusCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the On Resetting Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnResettingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onResettingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onResettingDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_RESETTING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Starting Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnStartingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onStartingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onStartingDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_STARTING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Execute Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnExecuteDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onExecuteDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onExecuteDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_EXECUTE_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Completing Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnCompletingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onCompletingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onCompletingDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_COMPLETING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Stopping Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnStoppingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onStoppingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onStoppingDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_STOPPING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Aborting Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnAbortingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onAbortingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onAbortingDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_ABORTING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Clearing Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnClearingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onClearingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onClearingDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_CLEARING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Holding Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnHoldingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onHoldingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onHoldingDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_HOLDING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Unholding Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnUnholdingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onUnholdingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onUnholdingDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_UNHOLDING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Suspending Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnSuspendingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onSuspendingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onSuspendingDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_SUSPENDING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Unsuspending Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnUnsuspendingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onUnsuspendingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onUnsuspendingDuration_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_UNSUSPENDING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Completing Status Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnCompletingStatusCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onCompletingStatusCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onCompletingStatusCode_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_COMPLETING_STATUS_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Stopping Status Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnStoppingStatusCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationConfiguration_onStoppingStatusCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationConfiguration_onStoppingStatusCode_feature", "_UI_SimulationConfiguration_type"),
				 ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_STOPPING_STATUS_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_COMPLETING_VARIABLES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SimulationConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimulationConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SimulationConfiguration simulationConfiguration = (SimulationConfiguration)object;
		return getString("_UI_SimulationConfiguration_type") + " " + simulationConfiguration.getOnResettingDuration();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SimulationConfiguration.class)) {
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_RESETTING_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_STARTING_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_EXECUTE_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_COMPLETING_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_STOPPING_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_ABORTING_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_CLEARING_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_HOLDING_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_UNHOLDING_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_SUSPENDING_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_UNSUSPENDING_DURATION:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_COMPLETING_STATUS_CODE:
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_STOPPING_STATUS_CODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentPackage.SIMULATION_CONFIGURATION__ON_COMPLETING_VARIABLES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.SIMULATION_CONFIGURATION__ON_COMPLETING_VARIABLES,
				 ComponentFactory.eINSTANCE.createVariable()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RuntimeEditPlugin.INSTANCE;
	}

}
