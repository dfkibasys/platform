/**
 */
package de.dfki.cos.basys.platform.model.domain.resourcetype.provider;


import de.dfki.cos.basys.platform.model.domain.order.provider.DomainEditPlugin;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogue;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypeFactory;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage;

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
 * This is the item provider adapter for a {@link de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogue} object.
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

			addManufacturerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Manufacturer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManufacturerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceTypeCatalogue_manufacturer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceTypeCatalogue_manufacturer_feature", "_UI_ResourceTypeCatalogue_type"),
				 ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__MANUFACTURER,
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
			childrenFeatures.add(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES);
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
		String label = ((ResourceTypeCatalogue)object).getManufacturer();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourceTypeCatalogue_type") :
			getString("_UI_ResourceTypeCatalogue_type") + " " + label;
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
			case ResourcetypePackage.RESOURCE_TYPE_CATALOGUE__MANUFACTURER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ResourcetypePackage.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES:
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
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createDiscreteManufacturingEquipmentModule()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createStationaryTool()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createMovableTool()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createTransport()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createStorage()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createFixture()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createRobot()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createCarrier()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createStaticObject()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createHorizontalTransport()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createTurnable()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createVerticalTransport()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createLiftingTable()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createAVG()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createTransposer()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createCarrierHandlingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createLift()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createRollerbed()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createLoader()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createUnloader()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createBodyStore()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createClamp()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createBeltConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createRollConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createChainConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createPalletConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE__RESOURCE_TYPES,
				 ResourcetypeFactory.eINSTANCE.createOverheadConveyor()));
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
