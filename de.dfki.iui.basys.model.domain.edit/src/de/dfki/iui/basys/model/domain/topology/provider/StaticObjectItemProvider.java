/**
 */
package de.dfki.iui.basys.model.domain.topology.provider;


import de.dfki.iui.basys.model.base.provider.IdentifiableEntityItemProvider;

import de.dfki.iui.basys.model.domain.order.provider.DomainEditPlugin;

import de.dfki.iui.basys.model.domain.topology.StaticObject;
import de.dfki.iui.basys.model.domain.topology.TopologyFactory;
import de.dfki.iui.basys.model.domain.topology.TopologyPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.domain.topology.StaticObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticObjectItemProvider extends IdentifiableEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticObjectItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TopologyPackage.Literals.EQUIPMENT_MODULE__CONTROL_MODULES);
			childrenFeatures.add(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES);
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
	 * This returns StaticObject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StaticObject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StaticObject)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_StaticObject_type") :
			getString("_UI_StaticObject_type") + " " + label;
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

		switch (notification.getFeatureID(StaticObject.class)) {
			case TopologyPackage.STATIC_OBJECT__CONTROL_MODULES:
			case TopologyPackage.STATIC_OBJECT__EQUIPMENT_MODULES:
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
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createStationaryTool()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createMovableTool()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createTransport()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createStorage()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createFixture()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createRobot()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createCarrier()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createStaticObject()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createHorizontalTransport()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createTurnable()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createVerticalTransport()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createLiftingTable()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createAVG()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createTransposer()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createCarrierHandlingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createLift()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createRollerbed()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createLoader()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createUnloader()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createBodyStore()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createClamp()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createBeltConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createRollConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createChainConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createPalletConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createOverheadConveyor()));
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
