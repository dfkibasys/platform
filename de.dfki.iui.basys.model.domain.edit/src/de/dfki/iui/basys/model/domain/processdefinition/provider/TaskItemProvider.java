/**
 */
package de.dfki.iui.basys.model.domain.processdefinition.provider;


import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;

import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionFactory;
import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.iui.basys.model.domain.processdefinition.Task;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.domain.processdefinition.Task} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskItemProvider extends FlowNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskItemProvider(AdapterFactory adapterFactory) {
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

			addMinIterationsPropertyDescriptor(object);
			addMaxIterationsPropertyDescriptor(object);
			addUriPropertyDescriptor(object);
			addUsedmaterialPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Iterations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinIterationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_minIterations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_minIterations_feature", "_UI_Task_type"),
				 ProcessdefinitionPackage.Literals.TASK__MIN_ITERATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Iterations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxIterationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_maxIterations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_maxIterations_feature", "_UI_Task_type"),
				 ProcessdefinitionPackage.Literals.TASK__MAX_ITERATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_uri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_uri_feature", "_UI_Task_type"),
				 ProcessdefinitionPackage.Literals.TASK__URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usedmaterial feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedmaterialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_usedmaterial_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_usedmaterial_feature", "_UI_Task_type"),
				 ProcessdefinitionPackage.Literals.TASK__USEDMATERIAL,
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
			childrenFeatures.add(ProcessdefinitionPackage.Literals.TASK__INPUT_DATA);
			childrenFeatures.add(ProcessdefinitionPackage.Literals.TASK__OUTPUT_DATA);
			childrenFeatures.add(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT);
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
	 * This returns Task.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Task"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Task)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Task_type") :
			getString("_UI_Task_type") + " " + label;
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

		switch (notification.getFeatureID(Task.class)) {
			case ProcessdefinitionPackage.TASK__MIN_ITERATIONS:
			case ProcessdefinitionPackage.TASK__MAX_ITERATIONS:
			case ProcessdefinitionPackage.TASK__URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProcessdefinitionPackage.TASK__INPUT_DATA:
			case ProcessdefinitionPackage.TASK__OUTPUT_DATA:
			case ProcessdefinitionPackage.TASK__CAPABILITY_REQUIREMENT:
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
				(ProcessdefinitionPackage.Literals.TASK__INPUT_DATA,
				 ProcessdefinitionFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__OUTPUT_DATA,
				 ProcessdefinitionFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createManufacturingCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createFügen()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createAnEinpressen()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createPressing()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createUrformen()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createUmformen()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createTrennen()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createBeschichten()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createStoffeigenschaften()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessdefinitionPackage.Literals.TASK__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createScrewing()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ProcessdefinitionPackage.Literals.TASK__INPUT_DATA ||
			childFeature == ProcessdefinitionPackage.Literals.TASK__OUTPUT_DATA;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
