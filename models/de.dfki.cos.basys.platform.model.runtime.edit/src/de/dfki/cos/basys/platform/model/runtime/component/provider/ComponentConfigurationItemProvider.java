/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.provider;


import de.dfki.cos.basys.platform.model.runtime.communication.provider.RuntimeEditPlugin;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;

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
 * This is the item provider adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentConfigurationItemProvider 
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
	public ComponentConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addComponentIdPropertyDescriptor(object);
			addComponentNamePropertyDescriptor(object);
			addComponentCategoryPropertyDescriptor(object);
			addComponentImplementationJavaClassPropertyDescriptor(object);
			addCommunicationProviderImplementationJavaClassPropertyDescriptor(object);
			addCommunicationProviderConnectionStringPropertyDescriptor(object);
			addInChannelNamePropertyDescriptor(object);
			addOutChannelNamePropertyDescriptor(object);
			addExternalConnectionStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Component Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentConfiguration_componentId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentConfiguration_componentId_feature", "_UI_ComponentConfiguration_type"),
				 ComponentPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentConfiguration_componentName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentConfiguration_componentName_feature", "_UI_ComponentConfiguration_type"),
				 ComponentPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentConfiguration_componentCategory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentConfiguration_componentCategory_feature", "_UI_ComponentConfiguration_type"),
				 ComponentPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT_CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Implementation Java Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentImplementationJavaClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentConfiguration_componentImplementationJavaClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentConfiguration_componentImplementationJavaClass_feature", "_UI_ComponentConfiguration_type"),
				 ComponentPackage.Literals.COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Communication Provider Implementation Java Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationProviderImplementationJavaClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentConfiguration_communicationProviderImplementationJavaClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentConfiguration_communicationProviderImplementationJavaClass_feature", "_UI_ComponentConfiguration_type"),
				 ComponentPackage.Literals.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Communication Provider Connection String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationProviderConnectionStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentConfiguration_communicationProviderConnectionString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentConfiguration_communicationProviderConnectionString_feature", "_UI_ComponentConfiguration_type"),
				 ComponentPackage.Literals.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Channel Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInChannelNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentConfiguration_inChannelName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentConfiguration_inChannelName_feature", "_UI_ComponentConfiguration_type"),
				 ComponentPackage.Literals.COMPONENT_CONFIGURATION__IN_CHANNEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Out Channel Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutChannelNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentConfiguration_outChannelName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentConfiguration_outChannelName_feature", "_UI_ComponentConfiguration_type"),
				 ComponentPackage.Literals.COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Connection String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalConnectionStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentConfiguration_externalConnectionString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentConfiguration_externalConnectionString_feature", "_UI_ComponentConfiguration_type"),
				 ComponentPackage.Literals.COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT_CONFIGURATION__PROPERTIES);
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentConfiguration)object).getComponentName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentConfiguration_type") :
			getString("_UI_ComponentConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentConfiguration.class)) {
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_ID:
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_NAME:
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_CATEGORY:
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS:
			case ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS:
			case ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING:
			case ComponentPackage.COMPONENT_CONFIGURATION__IN_CHANNEL_NAME:
			case ComponentPackage.COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME:
			case ComponentPackage.COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__PROPERTIES:
			case ComponentPackage.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION:
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
				(ComponentPackage.Literals.COMPONENT_CONFIGURATION__PROPERTIES,
				 ComponentFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION,
				 ComponentFactory.eINSTANCE.createSimulationConfiguration()));
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
