/**
 */
package de.dfki.iui.basys.model.service.provider;


import de.dfki.iui.basys.model.service.ServicePackage;
import de.dfki.iui.basys.model.service.Subscription;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EGenericTypeItemProvider;
import org.eclipse.emf.ecore.provider.ETypedElementItemProvider;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.service.Subscription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubscriptionItemProvider 
	extends ETypedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionItemProvider(AdapterFactory adapterFactory) {
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

			addTopicPropertyDescriptor(object);
			addQosPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Topic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subscription_topic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subscription_topic_feature", "_UI_Subscription_type"),
				 ServicePackage.Literals.SUBSCRIPTION__TOPIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subscription_qos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subscription_qos_feature", "_UI_Subscription_type"),
				 ServicePackage.Literals.SUBSCRIPTION__QOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Subscription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		//return overlayImage(object, getResourceLocator().getImage("full/obj16/Subscription"));
		return overlayImage(object, getComposedImage(object, getResourceLocator().getImage("full/obj16/Subscription.png")));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Subscription sub = (Subscription)object;
		StringBuffer result = new StringBuffer();
	    
	    EGenericTypeItemProvider eGenericTypeItemProvider = new EGenericTypeItemProvider(adapterFactory);
		String label = sub.getName();
		if (label == null || label.length() == 0)
			result.append(getString("_UI_Subscription_type"));
		else
			result.append(getString("_UI_Subscription_type") + " (" + label + ")");		
		
		if (sub.getEGenericType() != null)
	    {
	      result.append(" : ");
	      if (sub.isMany()) {	    	  
	    	  if (sub.isOrdered()) {  
	    		  result.append("List");
	    	  } else {
	    		  result.append("Set");
	    	  }
	    	  result.append("<");
	    	  result.append(eGenericTypeItemProvider.getText(sub.getEGenericType()));
	    	  result.append(">");
	      } 
	      else 
	      {	          	  
	    	  result.append(eGenericTypeItemProvider.getText(sub.getEGenericType()));
	      }
	    }
			
		return result.toString();			
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

		switch (notification.getFeatureID(Subscription.class)) {
			case ServicePackage.SUBSCRIPTION__TOPIC:
			case ServicePackage.SUBSCRIPTION__QOS:
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
		return ServiceEditPlugin.INSTANCE;
	}

}
