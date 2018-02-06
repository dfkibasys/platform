/**
 */
package de.dfki.iui.basys.model.service.provider;


import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;
import de.dfki.iui.basys.model.service.Operation;
import de.dfki.iui.basys.model.service.ServicePackage;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.provider.EGenericTypeItemProvider;
import org.eclipse.emf.ecore.provider.EOperationItemProvider;
import org.eclipse.emf.ecore.provider.ETypeParameterItemProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.service.Operation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationItemProvider extends EOperationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ServicePackage.Literals.OPERATION__CAPABILITIES);
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
	 * This returns Operation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		//return overlayImage(object, getResourceLocator().getImage("full/obj16/Operation"));
		return overlayImage(object, getComposedImage(object, getResourceLocator().getImage("full/obj16/Operation.png")));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
	    EOperation eOperation = (EOperation)object;
	    StringBuffer result = new StringBuffer();
	    result.append(eOperation.getName());
	    EGenericTypeItemProvider eGenericTypeItemProvider = new EGenericTypeItemProvider(adapterFactory);
	    if (!eOperation.getETypeParameters().isEmpty())
	    {
	      result.append("<");
	      for (Iterator<ETypeParameter> i = eOperation.getETypeParameters().iterator(); i.hasNext(); )
	      {
	    	ETypeParameterItemProvider prov = new ETypeParameterItemProvider(adapterFactory);
	        result.append(prov.getText(i.next()));
	        if (i.hasNext())
	        {
	          result.append(", ");
	        }
	      }
	      result.append(">");
	      
	    }
	    result.append("("); //)
	    for (Iterator<EParameter> i = eOperation.getEParameters().iterator(); i.hasNext(); )
	    {
	      EParameter eParameter = i.next();
	      if (eParameter.getEGenericType() != null)
	      {	    	
	        result.append(eGenericTypeItemProvider.getText(eParameter.getEGenericType()));
	        if (i.hasNext())
	        {
	          result.append(", ");
	        }
	      }
	    }
	    // (
	    result.append(")");
	    if (eOperation.getEGenericType() != null)
	    {
	      result.append(" : ");
	      if (eOperation.isMany()) {	    	  
	    	  if (eOperation.isOrdered()) {  
	    		  result.append("List");
	    	  } else {
	    		  result.append("Set");
	    	  }
	    	  result.append("<");
	    	  result.append(eGenericTypeItemProvider.getText(eOperation.getEGenericType()));
	    	  result.append(">");
	      } 
	      else 
	      {	          	  
	    	  result.append(eGenericTypeItemProvider.getText(eOperation.getEGenericType()));
	      }
	    }

	    if (!eOperation.getEGenericExceptions().isEmpty())
	    {
	      result.append(" throws ");
	      for (Iterator<EGenericType> i = eOperation.getEGenericExceptions().iterator(); i.hasNext(); )
	      {
	        EGenericType eException = i.next();
	        result.append(eGenericTypeItemProvider.getText(eException));
	        if (i.hasNext())
	        {
	          result.append(", ");
	        }
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

		switch (notification.getFeatureID(Operation.class)) {
			case ServicePackage.OPERATION__CAPABILITIES:
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
				(ServicePackage.Literals.OPERATION__CAPABILITIES,
				 CapabilityFactory.eINSTANCE.createCapability()));

//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createManufacturingCapability()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createFügen()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createAnEinpressen()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createPressen()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createQoSCapability()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createUrformen()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createUmformen()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createTrennen()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createBeschichten()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createStoffeigenschaften()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(ServicePackage.Literals.OPERATION__CAPABILITIES,
//				 CapabilityFactory.eINSTANCE.createSchrauben()));
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
			childFeature == EcorePackage.Literals.ETYPED_ELEMENT__EGENERIC_TYPE ||
			childFeature == EcorePackage.Literals.EOPERATION__EGENERIC_EXCEPTIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
