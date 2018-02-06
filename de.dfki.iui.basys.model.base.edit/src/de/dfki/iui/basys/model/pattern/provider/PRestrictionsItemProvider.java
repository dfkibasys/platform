/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.basys.model.pattern.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
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

import de.dfki.iui.basys.model.base.BasePackage;
import de.dfki.iui.basys.model.base.provider.BaseEditPlugin;
import de.dfki.iui.basys.model.pattern.PEnumRestriction;
import de.dfki.iui.basys.model.pattern.PQuantorEnum;
import de.dfki.iui.basys.model.pattern.PRestrictions;
import de.dfki.iui.basys.model.pattern.PRestrictionsEnum;
import de.dfki.iui.basys.model.pattern.PSlot;
import de.dfki.iui.basys.model.pattern.PValue;
import de.dfki.iui.basys.model.pattern.PatternFactory;
import de.dfki.iui.basys.model.pattern.PatternPackage;

/**
 * This is the item provider adapter for a
 * {@link de.dfki.iui.basys.model.pattern.PRestrictions} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PRestrictionsItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
		IItemPropertySource {

	public static final PRestrictionsItemProvider INSTANCE = (PRestrictionsItemProvider) new PatternItemProviderAdapterFactory().createPRestrictionsAdapter();

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PRestrictionsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFunctionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Function feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PRestrictions_function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PRestrictions_function_feature", "_UI_PRestrictions_type"),
				 PatternPackage.Literals.PRESTRICTIONS__FUNCTION,
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION);
			childrenFeatures.add(PatternPackage.Literals.PRESTRICTIONS__RESTRICTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PRestrictions.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PRestrictions"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PRestrictionsEnum function = ((PRestrictions)object).getFunction();
		
		char q = '\u22C0';
		if (function == PRestrictionsEnum.OR) {
			q = '\u22C1';
		}

		return q + ": " + getString("_UI_PRestrictions_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PRestrictions.class)) {
			case PatternPackage.PRESTRICTIONS__FUNCTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternPackage.PRESTRICTIONS__RESTRICTION:
			case PatternPackage.PRESTRICTIONS__RESTRICTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTIONS, PatternFactory.eINSTANCE.createPRestrictions()));

		PValue container = (PValue) getValueContainer((EObject) object);
		EDataType type = container.getType();

		if (type == null)
			return;
		if (type.equals(EcorePackage.eINSTANCE.getEBoolean()) || type.equals(BasePackage.eINSTANCE.getBBoolean())) {
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, PatternFactory.eINSTANCE.createPBooleanRestriction()));
		} else if (type.equals(EcorePackage.eINSTANCE.getEString()) || type.equals(BasePackage.eINSTANCE.getBString())) {
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, PatternFactory.eINSTANCE.createPStringRestriction()));
			// newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION,
			// PatternFactory.eINSTANCE.createPEnumRestriction()));
		} else if (type.equals(EcorePackage.eINSTANCE.getEChar()) || type.equals(BasePackage.eINSTANCE.getBChar())) {
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, PatternFactory.eINSTANCE.createPCharRestriction()));
			// newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION,
			// PatternFactory.eINSTANCE.createPEnumRestriction()));
		} else if (type.equals(EcorePackage.eINSTANCE.getEByte()) || type.equals(EcorePackage.eINSTANCE.getEByteObject()) || type.equals(BasePackage.eINSTANCE.getBByte())) {
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, PatternFactory.eINSTANCE.createPByteRestriction()));
			// PEnumRestriction enumRest =
			// PatternFactory.eINSTANCE.createPEnumRestriction();
			// enumRest.setType(PEnumRestrictionType.VALUE);
			// newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION,
			// enumRest));
		} else if (type.equals(EcorePackage.eINSTANCE.getEShort()) || type.equals(EcorePackage.eINSTANCE.getEShortObject()) || type.equals(BasePackage.eINSTANCE.getBShort())) {
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, PatternFactory.eINSTANCE.createPShortRestriction()));
			// PEnumRestriction enumRest =
			// PatternFactory.eINSTANCE.createPEnumRestriction();
			// enumRest.setType(PEnumRestrictionType.VALUE);
			// newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION,
			// enumRest));
		} else if (type.equals(EcorePackage.eINSTANCE.getEInt()) || type.equals(EcorePackage.eINSTANCE.getEIntegerObject()) || type.equals(BasePackage.eINSTANCE.getBInteger())) {
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, PatternFactory.eINSTANCE.createPIntegerRestriction()));
			// PEnumRestriction enumRest =
			// PatternFactory.eINSTANCE.createPEnumRestriction();
			// enumRest.setType(PEnumRestrictionType.VALUE);
			// newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION,
			// enumRest));
		} else if (type.equals(EcorePackage.eINSTANCE.getELong()) || type.equals(EcorePackage.eINSTANCE.getELongObject()) || type.equals(BasePackage.eINSTANCE.getBLong())) {
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, PatternFactory.eINSTANCE.createPLongRestriction()));
			// PEnumRestriction enumRest =
			// PatternFactory.eINSTANCE.createPEnumRestriction();
			// enumRest.setType(PEnumRestrictionType.VALUE);
			// newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION,
			// enumRest));
		} else if (type.equals(EcorePackage.eINSTANCE.getEDouble()) || type.equals(EcorePackage.eINSTANCE.getEDoubleObject()) || type.equals(BasePackage.eINSTANCE.getBDouble())) {
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, PatternFactory.eINSTANCE.createPDoubleRestriction()));
			// PEnumRestriction enumRest =
			// PatternFactory.eINSTANCE.createPEnumRestriction();
			// enumRest.setType(PEnumRestrictionType.VALUE);
			// newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION,
			// enumRest));
		} else if (type.equals(EcorePackage.eINSTANCE.getEFloat()) || type.equals(EcorePackage.eINSTANCE.getEFloatObject()) || type.equals(BasePackage.eINSTANCE.getBFloat())) {
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, PatternFactory.eINSTANCE.createPFloatRestriction()));
			// PEnumRestriction enumRest =
			// PatternFactory.eINSTANCE.createPEnumRestriction();
			// enumRest.setType(PEnumRestrictionType.VALUE);
			// newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION,
			// enumRest));
		} else if (type.equals(EcorePackage.eINSTANCE.getEDate())) {
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, PatternFactory.eINSTANCE.createPDateRestriction()));
		} else if (EcorePackage.eINSTANCE.getEEnum().isInstance(type)) {
			PEnumRestriction rest = PatternFactory.eINSTANCE.createPEnumRestriction();
			EEnum eenum = (EEnum) type;
			rest.setEnumDataType(eenum);
			rest.setValue(eenum.getELiterals().get(0));
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PRESTRICTIONS__RESTRICTION, rest));
		}
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BaseEditPlugin.INSTANCE;
	}

	private EObject getValueContainer(EObject restrictions) {
		EObject container = restrictions.eContainer();
		if (container instanceof PValue)
			return container;
		else
			return getValueContainer(container);
	}

	public boolean isValidRestrictionType(PRestrictions restrictions, Class<?> clazz) {
		// because of nested restrictions we need a loop
		EObject obj = restrictions.eContainer().eContainer();
		while (!(obj instanceof PSlot) && obj != null) {
			obj = obj.eContainer();
		}

		if (obj != null) {
			try {
				PSlot slot = (PSlot) obj;
				return slot.getFeature() != null && slot.getFeature().getEType() != null && slot.getFeature().getEType().getInstanceClass().equals(clazz);
			} catch (Exception e) {
				return false;
			}
		}

		return false;
	}
}
