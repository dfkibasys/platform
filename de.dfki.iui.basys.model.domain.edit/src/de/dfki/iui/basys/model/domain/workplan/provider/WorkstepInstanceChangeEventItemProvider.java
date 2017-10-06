/**
 */
package de.dfki.iui.basys.model.domain.workplan.provider;


import de.dfki.iui.basys.model.base.provider.EventItemProvider;

import de.dfki.iui.basys.model.domain.order.provider.DomainEditPlugin;

import de.dfki.iui.basys.model.domain.workplan.WorkplanPackage;
import de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkstepInstanceChangeEventItemProvider extends EventItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstepInstanceChangeEventItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addProductInstanceIdPropertyDescriptor(object);
			addWorkstepInstanceIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkstepInstanceChangeEvent_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkstepInstanceChangeEvent_type_feature", "_UI_WorkstepInstanceChangeEvent_type"),
				 WorkplanPackage.Literals.WORKSTEP_INSTANCE_CHANGE_EVENT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Product Instance Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductInstanceIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkstepInstanceChangeEvent_productInstanceId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkstepInstanceChangeEvent_productInstanceId_feature", "_UI_WorkstepInstanceChangeEvent_type"),
				 WorkplanPackage.Literals.WORKSTEP_INSTANCE_CHANGE_EVENT__PRODUCT_INSTANCE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workstep Instance Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkstepInstanceIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkstepInstanceChangeEvent_workstepInstanceId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkstepInstanceChangeEvent_workstepInstanceId_feature", "_UI_WorkstepInstanceChangeEvent_type"),
				 WorkplanPackage.Literals.WORKSTEP_INSTANCE_CHANGE_EVENT__WORKSTEP_INSTANCE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns WorkstepInstanceChangeEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkstepInstanceChangeEvent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Date labelValue = ((WorkstepInstanceChangeEvent)object).getTimestamp();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_WorkstepInstanceChangeEvent_type") :
			getString("_UI_WorkstepInstanceChangeEvent_type") + " " + label;
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

		switch (notification.getFeatureID(WorkstepInstanceChangeEvent.class)) {
			case WorkplanPackage.WORKSTEP_INSTANCE_CHANGE_EVENT__TYPE:
			case WorkplanPackage.WORKSTEP_INSTANCE_CHANGE_EVENT__PRODUCT_INSTANCE_ID:
			case WorkplanPackage.WORKSTEP_INSTANCE_CHANGE_EVENT__WORKSTEP_INSTANCE_ID:
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
		return DomainEditPlugin.INSTANCE;
	}

}
