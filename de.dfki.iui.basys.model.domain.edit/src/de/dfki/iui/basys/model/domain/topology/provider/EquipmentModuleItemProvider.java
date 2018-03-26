/**
 */
package de.dfki.iui.basys.model.domain.topology.provider;


import de.dfki.iui.basys.model.base.computation.MatchReport;
import de.dfki.iui.basys.model.base.computation.Matches;
import de.dfki.iui.basys.model.base.computation.MatchReport.MatchResult;
import de.dfki.iui.basys.model.base.provider.EntityItemProvider;

import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;

import de.dfki.iui.basys.model.domain.order.provider.DomainEditPlugin;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.model.domain.topology.EquipmentModule;
import de.dfki.iui.basys.model.domain.topology.TopologyFactory;
import de.dfki.iui.basys.model.domain.topology.TopologyPackage;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.domain.topology.EquipmentModule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EquipmentModuleItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentModuleItemProvider(AdapterFactory adapterFactory) {
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

			addAssignedResourceTypePropertyDescriptor(object);
			addAssignedResourceInstancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Assigned Resource Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAssignedResourceTypePropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_EquipmentModule_assignedResourceType_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_EquipmentModule_assignedResourceType_feature", "_UI_EquipmentModule_type"),
//				 TopologyPackage.Literals.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EquipmentModule_assignedResourceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EquipmentModule_assignedResourceType_feature", "_UI_EquipmentModule_type"),
				 TopologyPackage.Literals.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				
				EquipmentModule e = (EquipmentModule) object;
				Collection<?> result = super.getChoiceOfValues(object);
				List<ResourceType> filtered = new LinkedList<>();
				
				result.forEach(type -> {
					if (type == null) {
						//filtered.add((ResourceType) type);
						return;
					}
					
					ResourceType t = (ResourceType) type;
					
					if (t.getCapabilityAssertion() == null) return;
					
					if (e.getCapabilityRequirement() != null) {
						MatchReport report = Matches.matches(e.getCapabilityRequirement(), t.getCapabilityAssertion().getPattern());
						if (report.result == MatchResult.MATCH_SUCCESS) {
							filtered.add(t);
						}
					} else {
						filtered.add(t);
					}
				});				
				
				return filtered;
			}
		});
	}

	/**
	 * This adds a property descriptor for the Assigned Resource Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAssignedResourceInstancePropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_EquipmentModule_assignedResourceInstance_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_EquipmentModule_assignedResourceInstance_feature", "_UI_EquipmentModule_type"),
//				 TopologyPackage.Literals.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EquipmentModule_assignedResourceInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EquipmentModule_assignedResourceInstance_feature", "_UI_EquipmentModule_type"),
				 TopologyPackage.Literals.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				
				EquipmentModule e = (EquipmentModule) object;
				Collection<?> result = super.getChoiceOfValues(object);
				List<ResourceInstance> filtered = new LinkedList<>();
				
				result.forEach(instance -> {
					ResourceInstance i = (ResourceInstance) instance;
					ResourceType t = i.getResourceType();
					
					if (t == null || t.getCapabilityAssertion() == null) return;
					
					if (e.getAssignedResourceType() != null && e.getCapabilityRequirement() != null) {
						if (e.getAssignedResourceType().equals(i.getResourceType())) {
							MatchReport report = Matches.matches(e.getCapabilityRequirement(), i.getResourceType().getCapabilityAssertion().getPattern());
							if (report.result == MatchResult.MATCH_SUCCESS) {
								filtered.add(i);
							}
						}
					} else if (e.getCapabilityRequirement() != null) {						
						MatchReport report = Matches.matches(e.getCapabilityRequirement(), i.getResourceType().getCapabilityAssertion().getPattern());
						if (report.result == MatchResult.MATCH_SUCCESS) {
							filtered.add(i);
						}
					} else {
						filtered.add(i);
					}
					
					if (i.getResourceType() != null) {							
						if (e.getCapabilityRequirement() != null) {
							MatchReport report = Matches.matches(e.getCapabilityRequirement(), i.getResourceType().getCapabilityAssertion().getPattern());
							if (report.result == MatchResult.MATCH_SUCCESS) {
								filtered.add(i);
							}
						} else {
							filtered.add(i);
						}
					}
				});				
				
				return filtered;
			}
		});
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
			childrenFeatures.add(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT);
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
	 * This returns EquipmentModule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EquipmentModule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EquipmentModule)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EquipmentModule_type") :
			getString("_UI_EquipmentModule_type") + " " + label;
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

		switch (notification.getFeatureID(EquipmentModule.class)) {
			case TopologyPackage.EQUIPMENT_MODULE__CONTROL_MODULES:
			case TopologyPackage.EQUIPMENT_MODULE__EQUIPMENT_MODULES:
			case TopologyPackage.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT:
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
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CONTROL_MODULES,
				 TopologyFactory.eINSTANCE.createControlModule()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__EQUIPMENT_MODULES,
				 TopologyFactory.eINSTANCE.createEquipmentModule()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createHandlingCapability()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createManufacturingCapability()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createFügen()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createAnEinpressen()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createPressen()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createQoSCapability()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createUrformen()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createUmformen()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createTrennen()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createBeschichten()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createStoffeigenschaften()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createSchrauben()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createInformationTransferCapability()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT,
				 CapabilityFactory.eINSTANCE.createProvideInformation()));
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
