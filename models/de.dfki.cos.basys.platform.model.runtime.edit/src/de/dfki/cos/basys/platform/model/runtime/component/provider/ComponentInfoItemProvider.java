/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.provider;


import de.dfki.cos.basys.platform.model.runtime.communication.provider.RuntimeEditPlugin;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
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
 * This is the item provider adapter for a {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInfoItemProvider 
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
	public ComponentInfoItemProvider(AdapterFactory adapterFactory) {
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
			addInChannelNamePropertyDescriptor(object);
			addOutChannelNamePropertyDescriptor(object);
			addStatusChannelNamePropertyDescriptor(object);
			addCurrentStatePropertyDescriptor(object);
			addCurrentModePropertyDescriptor(object);
			addCommunicationProviderPropertyDescriptor(object);
			addConnectionStringPropertyDescriptor(object);
			addHostNamePropertyDescriptor(object);
			addUriSpecPropertyDescriptor(object);
			addConnectedPropertyDescriptor(object);
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
				 getString("_UI_ComponentInfo_componentId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_componentId_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__COMPONENT_ID,
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
				 getString("_UI_ComponentInfo_componentName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_componentName_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__COMPONENT_NAME,
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
				 getString("_UI_ComponentInfo_componentCategory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_componentCategory_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__COMPONENT_CATEGORY,
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
				 getString("_UI_ComponentInfo_inChannelName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_inChannelName_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__IN_CHANNEL_NAME,
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
				 getString("_UI_ComponentInfo_outChannelName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_outChannelName_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__OUT_CHANNEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status Channel Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusChannelNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInfo_statusChannelName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_statusChannelName_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__STATUS_CHANNEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInfo_currentState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_currentState_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__CURRENT_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInfo_currentMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_currentMode_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__CURRENT_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Communication Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationProviderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInfo_communicationProvider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_communicationProvider_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__COMMUNICATION_PROVIDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connection String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInfo_connectionString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_connectionString_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__CONNECTION_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInfo_hostName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_hostName_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__HOST_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Spec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriSpecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInfo_uriSpec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_uriSpec_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__URI_SPEC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInfo_connected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_connected_feature", "_UI_ComponentInfo_type"),
				 ComponentPackage.Literals.COMPONENT_INFO__CONNECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentInfo)object).getComponentName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentInfo_type") :
			getString("_UI_ComponentInfo_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentInfo.class)) {
			case ComponentPackage.COMPONENT_INFO__COMPONENT_ID:
			case ComponentPackage.COMPONENT_INFO__COMPONENT_NAME:
			case ComponentPackage.COMPONENT_INFO__COMPONENT_CATEGORY:
			case ComponentPackage.COMPONENT_INFO__IN_CHANNEL_NAME:
			case ComponentPackage.COMPONENT_INFO__OUT_CHANNEL_NAME:
			case ComponentPackage.COMPONENT_INFO__STATUS_CHANNEL_NAME:
			case ComponentPackage.COMPONENT_INFO__CURRENT_STATE:
			case ComponentPackage.COMPONENT_INFO__CURRENT_MODE:
			case ComponentPackage.COMPONENT_INFO__COMMUNICATION_PROVIDER:
			case ComponentPackage.COMPONENT_INFO__CONNECTION_STRING:
			case ComponentPackage.COMPONENT_INFO__HOST_NAME:
			case ComponentPackage.COMPONENT_INFO__URI_SPEC:
			case ComponentPackage.COMPONENT_INFO__CONNECTED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
