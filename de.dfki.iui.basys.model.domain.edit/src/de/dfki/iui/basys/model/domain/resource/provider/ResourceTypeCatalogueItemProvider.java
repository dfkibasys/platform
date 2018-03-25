/**
 */
package de.dfki.iui.basys.model.domain.resource.provider;


import de.dfki.iui.basys.model.domain.order.provider.DomainEditPlugin;

import de.dfki.iui.basys.model.domain.resource.ResourceFactory;
import de.dfki.iui.basys.model.domain.resource.ResourcePackage;
import de.dfki.iui.basys.model.domain.resource.ResourceTypeCatalogue;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.domain.resource.ResourceTypeCatalogue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceTypeCatalogueItemProvider 
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
	public ResourceTypeCatalogueItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES);
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
	 * This returns ResourceTypeCatalogue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourceTypeCatalogue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ResourceTypeCatalogue_type");
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

		switch (notification.getFeatureID(ResourceTypeCatalogue.class)) {
			case ResourcePackage.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES:
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
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createDiscreteManufacturingEquipmentModule()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createStationaryTool()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createMovableTool()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createTransport()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createStorage()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createFixture()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createRobot()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createCarrier()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createStaticObject()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createHorizontalTransport()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createTurnable()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createVerticalTransport()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createLiftingTable()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createAVG()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createTransposer()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createCarrierHandlingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createLift()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createRollerbed()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createLoader()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createUnloader()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createBodyStore()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createClamp()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createBeltConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createRollConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createChainConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createPalletConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourceFactory.eINSTANCE.createOverheadConveyor()));
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
