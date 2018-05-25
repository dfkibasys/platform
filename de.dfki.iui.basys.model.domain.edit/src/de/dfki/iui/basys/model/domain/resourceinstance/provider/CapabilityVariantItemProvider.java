/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance.provider;


import de.dfki.iui.basys.model.base.provider.EntityItemProvider;
import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;

import de.dfki.iui.basys.model.domain.order.provider.DomainEditPlugin;

import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityVariantItemProvider 
	extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityVariantItemProvider(AdapterFactory adapterFactory) {
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

			addAppliedOnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Applied On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilityVariant_appliedOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilityVariant_appliedOn_feature", "_UI_CapabilityVariant_type"),
				 ResourceinstancePackage.Literals.CAPABILITY_VARIANT__APPLIED_ON,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY);
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
	 * This returns CapabilityVariant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CapabilityVariant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CapabilityVariant<?>)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CapabilityVariant_type") :
			getString("_UI_CapabilityVariant_type") + " " + label;
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

		switch (notification.getFeatureID(CapabilityVariant.class)) {
			case ResourceinstancePackage.CAPABILITY_VARIANT__CAPABILITY:
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
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createHandlingCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createProductionCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createManufacturingCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createFügen()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createAnEinpressen()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createPressing()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createUrformen()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createUmformen()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createTrennen()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createBeschichten()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createStoffeigenschaften()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createScrewing()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createLogisticsCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createPickAndPlace()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createTransport()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createStore()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createQoSCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createInspect()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createWorkerAssistenceCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createConfirmationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createSwitchConfirmationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createGeneralCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createMoveToLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createProjectPath()));

		newChildDescriptors.add
			(createChildParameter
				(ResourceinstancePackage.Literals.CAPABILITY_VARIANT__CAPABILITY,
				 CapabilityFactory.eINSTANCE.createProjectETA()));
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
