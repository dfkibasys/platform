/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.basys.model.pattern.provider;

import java.net.URL;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.provider.EClassItemProvider;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;

import de.dfki.iui.basys.common.emf.EmfUtils;
import de.dfki.iui.basys.model.base.BasePackage;
import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.pattern.PObject;
import de.dfki.iui.basys.model.pattern.PQuantorEnum;
import de.dfki.iui.basys.model.pattern.PSlot;
import de.dfki.iui.basys.model.pattern.PatternFactory;
import de.dfki.iui.basys.model.pattern.PatternPackage;

/**
 * This is the item provider adapter for a
 * {@link de.dfki.iui.basys.model.pattern.PObject} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PObjectItemProvider extends PPatternItemProvider {

	protected static final EcoreItemProviderAdapterFactory ecoreAdapterFactory = new EcoreItemProviderAdapterFactory();
	protected static final EClassItemProvider eclassProvider = (EClassItemProvider) ecoreAdapterFactory
			.createEClassAdapter();

	/**
	 * The image usually used to display a class in the Ecore framework.
	 */
	public static ImageDescriptor objIm;

	static {
		Object url = eclassProvider.getImage(EcoreFactory.eINSTANCE.createEClass());
		if (url instanceof URL) {
			objIm = ExtendedImageRegistry.getInstance().getImageDescriptor(url);
		}
	}

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PObjectItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PObject_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PObject_type_feature", "_UI_PObject_type"),
						PatternPackage.Literals.POBJECT__TYPE, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						PObject o = (PObject) object;
						if (o.eContainer() instanceof PSlot) {
							PSlot slot = (PSlot) o.eContainer();
							EClassifier ecl = slot.getFeature().getEType();
							Collection<Object> values = new UniqueEList<Object>();
							Set<EPackage> packages = EmfUtils.collectSiamPackages(true);

							if (ecl instanceof EClass) {
								EClass range = (EClass) ecl;
								for (EPackage p : packages) {
									for (EClassifier classifier : p.getEClassifiers()) {
										if (classifier instanceof EClass) {
											EClass clazz = (EClass) classifier;
											if (range.isSuperTypeOf(clazz)) {
												values.add(clazz);
											}
										}
									}
								}
							}
							return values;
						} 
//						else if (o.eContainer() instanceof CondEvent
//								&& ((CondEvent) o.eContainer()).getEvent().equals("InputEvent")) {
//							Collection<Object> values = new UniqueEList<Object>();
//							values.add(IoPackage.eINSTANCE.getInputAct());
//							values.add(IoPackage.eINSTANCE.getDeviceStateChanged());
//							return values;
//						} else if (o.eContainer() instanceof PSubscription) {
//							Collection<Object> values = new UniqueEList<Object>();
//							for (EClassifier c : IoPackage.eINSTANCE.getEClassifiers()) {
//								if (c instanceof EClass && IoPackage.eINSTANCE.getMessage().isSuperTypeOf((EClass) c)) {
//									values.add(c);
//								}
//							}
//							return values;
//						} else if (o.eContainer() instanceof ReferenceModel) {
//							Collection<Object> values = new UniqueEList<Object>();
//							Set<EPackage> packages = EmfUtils.collectSiamPackages(true);
//
//							for (EPackage pack : packages) {
//								for (EClassifier classifier : pack.getEClassifiers()) {
//									if (classifier instanceof EClass) {
//										EClass clazz = (EClass) classifier;
//										if (BasePackage.eINSTANCE.getEntity().isSuperTypeOf(clazz)) {
//											values.add(clazz);
//										}
//									}
//								}
//							}
//
//							return values;
//						} 
						else {
							Collection<Object> values = new UniqueEList<Object>();
							Set<EPackage> packages = EmfUtils.collectSiamPackages(true);

							for (EPackage p : packages) {
								for (EClassifier classifier : p.getEClassifiers()) {
									if (classifier instanceof EClass) {
										values.add(classifier);
									}
								}
							}

							return values;
						}

					}
				});

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
			childrenFeatures.add(PatternPackage.Literals.POBJECT__SLOT);
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
	 * This returns PObject.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return eclassProvider.getImage(((PObject) object).getType());
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		PObject pob = (PObject) object;
		EClass type = pob.getType();
		
		String varName = pob.getVarName();
		String typeName = getString("_UI_PObject_type");		
		if (type != null) {
			typeName = type.getName();
		}
		char q = '\u2203';
		switch (pob.getQuantor().getValue()) {
			case PQuantorEnum.EXISTS_VALUE:
				q = '\u2203';		
				break;
			case PQuantorEnum.FOR_ALL_VALUE:
				q = '\u2200';
				break;
			case PQuantorEnum.NOT_EXISTS_VALUE:
				q = '\u2204';
				break;
			default:
				break;
		}
		
		String label = q + ": " + typeName + (varName != null ? " - " + varName : "");
		return label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PObject.class)) {
		case PatternPackage.POBJECT__SLOT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		case PatternPackage.POBJECT__TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

		PObject o = (PObject) object;

		if (o.getType() != null) {

			List<EStructuralFeature> usedFeatures = new LinkedList<EStructuralFeature>();
			EList<PSlot> slots = o.getSlot();
			for (PSlot slot : slots)
				if (slot.getFeature() != null) {
					usedFeatures.add(slot.getFeature());
				}

			List<EStructuralFeature> features = new LinkedList<EStructuralFeature>(
					o.getType().getEAllStructuralFeatures());
			features.removeAll(usedFeatures);

			for (EStructuralFeature feature : features) {
				// don't show the entity_id as property
				if (feature.getFeatureID() == BasePackage.ENTITY__ID
						&& ((EClass) feature.eContainer()).getInstanceClass() == Entity.class) {
					continue;
				}
				PSlot slot = PatternFactory.eINSTANCE.createPSlot();
				slot.setFeature(feature);
				CommandParameter command = createChildParameter(PatternPackage.Literals.POBJECT__SLOT, slot);
				newChildDescriptors.add(command);
			}
		}
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
