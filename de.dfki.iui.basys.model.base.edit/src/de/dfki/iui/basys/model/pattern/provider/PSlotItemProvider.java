/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.basys.model.pattern.provider;

import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.provider.EAttributeItemProvider;
import org.eclipse.emf.ecore.provider.EReferenceItemProvider;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;

import de.dfki.iui.basys.common.emf.EmfUtils;
import de.dfki.iui.basys.model.base.provider.BaseEditPlugin;
import de.dfki.iui.basys.model.pattern.PEmptySlot;
import de.dfki.iui.basys.model.pattern.PObject;
import de.dfki.iui.basys.model.pattern.PSlot;
import de.dfki.iui.basys.model.pattern.PValue;
import de.dfki.iui.basys.model.pattern.PatternFactory;
import de.dfki.iui.basys.model.pattern.PatternPackage;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.pattern.PSlot} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class PSlotItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	protected static final EcoreItemProviderAdapterFactory ecoreAdapterFactory = new EcoreItemProviderAdapterFactory();
	protected static final EReferenceItemProvider featureProvider = (EReferenceItemProvider) ecoreAdapterFactory.createEReferenceAdapter();
	protected static final EAttributeItemProvider attributeProvider = (EAttributeItemProvider) ecoreAdapterFactory.createEAttributeAdapter();
	/**
	 * The image usually used to display an attribute in the Ecore framework.
	 */
	public static final ImageDescriptor attrIm;
	public static final ComposedImage attrComIm;

	static {
		Object url = attributeProvider.getImage(EcoreFactory.eINSTANCE.createEAttribute());
		if (url instanceof ComposedImage) {
			attrIm = ExtendedImageRegistry.getInstance().getImageDescriptor(((ComposedImage) url).getImages().get(0));
			attrComIm = (ComposedImage) url;
		} else {
			attrIm = null;
			attrComIm = null;
		}
	}

	/**
	 * Because of different images for a reference object a method is needed
	 * instead of having only a field ({@link PSlotItemProvider#attrIm}). The
	 * Parameter can be a slot or an object of type {@link EReference}.
	 * 
	 * @param object
	 * @return
	 */
	public static ImageDescriptor getReferenceImage(Object object) {
		if (object instanceof PSlot) {
			object = ((PSlot) object).getFeature();
		}
		Object url = null;
		if (object instanceof EReference) {
			url = featureProvider.getImage(object);
		}
		if (url instanceof URL)
			return ExtendedImageRegistry.getInstance().getImageDescriptor(url);
		return null;
	}

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PSlotItemProvider(AdapterFactory adapterFactory) {
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

			addFeaturePropertyDescriptor(object);
			addFeatureNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Feature feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(
				// createItemPropertyDescriptor(
				new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_PSlot_feature_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PSlot_feature_feature", "_UI_PSlot_type"), PatternPackage.Literals.PSLOT__FEATURE, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						PSlot slot = (PSlot) object;
						PObject o = (PObject) slot.eContainer();
						return o.getType().getEAllStructuralFeatures();
					}
				}

		);
	}

	/**
	 * This adds a property descriptor for the Feature Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFeatureNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PSlot_featureName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PSlot_featureName_feature", "_UI_PSlot_type"),
				 PatternPackage.Literals.PSLOT__FEATURE_NAME,
				 false,
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
			childrenFeatures.add(PatternPackage.Literals.PSLOT__RANGE);
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
	 * This returns PSlot.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		// EStructuralFeature feature = ((PSlot) object).getFeature();
		// if (feature == null) {
		// return null;
		// }
		// if (feature instanceof EReference) {
		// return featureProvider.getImage(feature);
		// } else {
		// return attributeProvider.getImage(feature);
		// }
		if (object instanceof PSlot) {
			object = ((PSlot) object).getFeature();
		}
		if (object instanceof EReference)
			return featureProvider.getImage(object);
		else
			return attrComIm;// attributeProvider.getImage(
								// EcoreFactory.eINSTANCE.createEAttribute() );
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((PSlot) object).getFeatureName();
		return label == null || label.length() == 0 ? getString("_UI_PSlot_type") : label;
	}

	// @Override
	// public String getText(Object object) {
	// ETypedElement element = ((PSlot) object).getFeature();
	// if (element != null) {
	// return getString("_UI_PSlot_type") + " " + element.getName() + " : " +
	// element.getEType().getName();
	// } else {
	// return getString("_UI_PSlot_type");
	// }
	// }

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

		switch (notification.getFeatureID(PSlot.class)) {
			case PatternPackage.PSLOT__FEATURE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternPackage.PSLOT__RANGE:
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
		Set<EPackage> packages = EmfUtils.collectSiamPackages(true);

		PSlot slot = (PSlot) object;
		if (slot.getRange().size() == 1 && slot.getRange().get(0) instanceof PEmptySlot)
			return;
		else if (slot.getRange().size() == 0) {
			PEmptySlot v = PatternFactory.eINSTANCE.createPEmptySlot();
			newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PSLOT__RANGE, v));
		}
		if (slot.getFeature() != null) {
			if (slot.getFeature().getUpperBound() < 0 || slot.getFeature().getUpperBound() > slot.getRange().size()) {
				if (slot.getFeature().getEType() instanceof EClass) {
					EClass range = (EClass) slot.getFeature().getEType();

					for (EPackage p : packages) {
						for (EClassifier classifier : p.getEClassifiers()) {
							if (classifier instanceof EClass) {
								EClass clazz = (EClass) classifier;
								if (range.isSuperTypeOf(clazz)) {
									PObject v = PatternFactory.eINSTANCE.createPObject();
									v.setType(clazz);
									newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PSLOT__RANGE, v));
								}
							}
						}
					}
				} else {
					PValue v = PatternFactory.eINSTANCE.createPValue();
					v.setType((EDataType) slot.getFeature().getEType());
					newChildDescriptors.add(createChildParameter(PatternPackage.Literals.PSLOT__RANGE, v));
				}
			}
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

	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		PatternItemProviderAdapterFactory fac = new PatternItemProviderAdapterFactory();
		IItemLabelProvider adapter = (IItemLabelProvider) fac.adapt(child, IItemLabelProvider.class);
		if (adapter != null)
			return adapter.getText(child);
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
