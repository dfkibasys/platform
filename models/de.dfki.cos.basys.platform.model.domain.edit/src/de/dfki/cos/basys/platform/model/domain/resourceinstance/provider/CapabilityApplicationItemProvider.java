/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance.provider;


import java.util.Collection;
import java.util.LinkedList;
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

import de.dfki.cos.basys.platform.model.domain.capability.CapabilityAssertion;
import de.dfki.cos.basys.platform.model.domain.order.provider.DomainEditPlugin;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstance;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstanceFactory;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;

/**
 * This is the item provider adapter for a {@link de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityApplicationItemProvider 
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
	public CapabilityApplicationItemProvider(AdapterFactory adapterFactory) {
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

			addCapabilityAssertionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Capability Assertion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCapabilityAssertionPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_CapabilityApplication_capabilityAssertion_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilityApplication_capabilityAssertion_feature", "_UI_CapabilityApplication_type"),
//				 ResourceinstancePackage.Literals.CAPABILITY_APPLICATION__CAPABILITY_ASSERTION,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilityApplication_capabilityAssertion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilityApplication_capabilityAssertion_feature", "_UI_CapabilityApplication_type"),
				 ResourceinstancePackage.Literals.CAPABILITY_APPLICATION__CAPABILITY_ASSERTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				
				CapabilityApplication e = (CapabilityApplication) object;
				Collection<?> result = super.getChoiceOfValues(object);
				List<CapabilityAssertion> filtered = new LinkedList<>();
				
				result.forEach(entry -> {
					if (entry != null) {
						CapabilityAssertion ass = (CapabilityAssertion) entry;
						if (ass.eContainer() == ((ResourceInstance)e.eContainer()).getResourceType()) {
							filtered.add(ass);
						}
					}
				});				
				
				return filtered;
			}
		});
		
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
			childrenFeatures.add(ResourceinstancePackage.Literals.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS);
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
	 * This returns CapabilityApplication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CapabilityApplication"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CapabilityApplication_type");
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

		switch (notification.getFeatureID(CapabilityApplication.class)) {
			case ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS:
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
				(ResourceinstancePackage.Literals.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS,
				 ResourceinstanceFactory.eINSTANCE.createCapabilityVariant()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS,
				 ResourceinstanceFactory.eINSTANCE.createManufacturingCapabilityVariant()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS,
				 ResourceinstanceFactory.eINSTANCE.createLogisticsCapabilityVariant()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS,
				 ResourceinstanceFactory.eINSTANCE.createGeneralCapabilityVariant()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS,
				 ResourceinstanceFactory.eINSTANCE.createHandlingCapabilityVariant()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS,
				 ResourceinstanceFactory.eINSTANCE.createAssemblyCapabilityVariant()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DomainEditPlugin.INSTANCE;
	}

}
