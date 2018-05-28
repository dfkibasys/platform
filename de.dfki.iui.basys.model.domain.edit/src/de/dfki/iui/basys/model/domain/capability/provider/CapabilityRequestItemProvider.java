/**
 */
package de.dfki.iui.basys.model.domain.capability.provider;


import de.dfki.iui.basys.model.base.BaseFactory;

import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;
import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.CapabilityRequest;
import de.dfki.iui.basys.model.domain.material.MaterialFactory;

import de.dfki.iui.basys.model.domain.order.OrderFactory;

import de.dfki.iui.basys.model.domain.order.provider.DomainEditPlugin;

import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionFactory;

import de.dfki.iui.basys.model.domain.processinstance.ProcessinstanceFactory;

import de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionFactory;

import de.dfki.iui.basys.model.domain.productinstance.ProductinstanceFactory;

import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstanceFactory;

import de.dfki.iui.basys.model.domain.resourcetype.ResourcetypeFactory;

import de.dfki.iui.basys.model.domain.staff.StaffFactory;

import de.dfki.iui.basys.model.domain.topology.TopologyFactory;

import de.dfki.iui.basys.model.domain.workerguidance.WorkerguidanceFactory;

import de.dfki.iui.basys.model.domain.workforce.WorkforceFactory;

import de.dfki.iui.basys.model.domain.workplan.WorkplanFactory;

import java.util.Collection;
import java.util.Date;
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
 * This is the item provider adapter for a {@link de.dfki.iui.basys.model.domain.capability.CapabilityRequest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityRequestItemProvider 
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
	public CapabilityRequestItemProvider(AdapterFactory adapterFactory) {
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

			addWhomPropertyDescriptor(object);
			addWherePropertyDescriptor(object);
			addWhenPropertyDescriptor(object);
			addHowPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Whom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilityRequest_whom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilityRequest_whom_feature", "_UI_CapabilityRequest_type"),
				 CapabilityPackage.Literals.CAPABILITY_REQUEST__WHOM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Where feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWherePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilityRequest_where_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilityRequest_where_feature", "_UI_CapabilityRequest_type"),
				 CapabilityPackage.Literals.CAPABILITY_REQUEST__WHERE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the When feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilityRequest_when_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilityRequest_when_feature", "_UI_CapabilityRequest_type"),
				 CapabilityPackage.Literals.CAPABILITY_REQUEST__WHEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the How feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilityRequest_how_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilityRequest_how_feature", "_UI_CapabilityRequest_type"),
				 CapabilityPackage.Literals.CAPABILITY_REQUEST__HOW,
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
			childrenFeatures.add(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO);
			childrenFeatures.add(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT);
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
	 * This returns CapabilityRequest.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CapabilityRequest"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Date labelValue = ((CapabilityRequest)object).getWhen();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CapabilityRequest_type") :
			getString("_UI_CapabilityRequest_type") + " " + label;
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

		switch (notification.getFeatureID(CapabilityRequest.class)) {
			case CapabilityPackage.CAPABILITY_REQUEST__WHEN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__WHO:
			case CapabilityPackage.CAPABILITY_REQUEST__WHAT:
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
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createCapabilityAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createHandlingCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createProductionCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createManufacturingCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createFügen()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createAnEinpressen()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createPressing()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createUrformen()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createUmformen()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createTrennen()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createBeschichten()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createStoffeigenschaften()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createScrewing()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createLogisticsCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createPickAndPlace()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createTransport()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createStore()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createQoSCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createInspect()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createWorkerAssistenceCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createConfirmationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createSwitchConfirmationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createGeneralCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createMoveToLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createProjectPath()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createProjectETA()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createVisualisationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 CapabilityFactory.eINSTANCE.createQAVisualisationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 OrderFactory.eINSTANCE.createOrder()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 OrderFactory.eINSTANCE.createOrderStatus()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 OrderFactory.eINSTANCE.createOrderStatusChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductdefinitionFactory.eINSTANCE.createProductGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductdefinitionFactory.eINSTANCE.createProductVariant()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductdefinitionFactory.eINSTANCE.createBillOfMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductdefinitionFactory.eINSTANCE.createAssemblyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductdefinitionFactory.eINSTANCE.createAssemblyGroupEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductdefinitionFactory.eINSTANCE.createMaterialEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 StaffFactory.eINSTANCE.createStaff()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 StaffFactory.eINSTANCE.createStaffLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 StaffFactory.eINSTANCE.createStaffLocationChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 StaffFactory.eINSTANCE.createAbility()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 StaffFactory.eINSTANCE.createWorkstepSkill()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 StaffFactory.eINSTANCE.createStaffSkills()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createEnterprise()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createArea()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createProcessCell()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createProductionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createProductionLine()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createStorageZone()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createProcessUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createStorageUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createWorkCell()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createEquipmentModule()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createControlModule()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createStation()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 TopologyFactory.eINSTANCE.createAGVStation()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkerguidanceFactory.eINSTANCE.createInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkerguidanceFactory.eINSTANCE.createMedia()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkerguidanceFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkerguidanceFactory.eINSTANCE.createVideo()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkerguidanceFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkerguidanceFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkplanFactory.eINSTANCE.createWorkplanInstance()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkplanFactory.eINSTANCE.createWorkstepInstance()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkplanFactory.eINSTANCE.createWorkstepInstanceStatus()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkplanFactory.eINSTANCE.createWorkstepInstanceStatusChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkplanFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProcessdefinitionFactory.eINSTANCE.createProcessDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProcessdefinitionFactory.eINSTANCE.createTaskFlow()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProcessdefinitionFactory.eINSTANCE.createTaskDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProcessdefinitionFactory.eINSTANCE.createGateway()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProcessdefinitionFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProcessdefinitionFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProcessdefinitionFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProcessinstanceFactory.eINSTANCE.createProcessInstance()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProcessinstanceFactory.eINSTANCE.createTaskInstance()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductinstanceFactory.eINSTANCE.createProductInstance()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductinstanceFactory.eINSTANCE.createProductInstanceStatus()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductinstanceFactory.eINSTANCE.createProductInstanceStatusChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductinstanceFactory.eINSTANCE.createProductInstanceLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ProductinstanceFactory.eINSTANCE.createProductInstanceLocationChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkforceFactory.eINSTANCE.createAgent()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkforceFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkforceFactory.eINSTANCE.createRobot()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkforceFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 WorkforceFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 MaterialFactory.eINSTANCE.createMaterialGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 MaterialFactory.eINSTANCE.createMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createDiscreteManufacturingEquipmentModule()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createStationaryTool()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createMovableTool()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createTransport()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createStorage()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createFixture()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createRobot()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createCarrier()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createStaticObject()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createHorizontalTransport()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createTurnable()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createVerticalTransport()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createLiftingTable()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createAVG()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createTransposer()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createCarrierHandlingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createLift()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createRollerbed()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createLoader()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createUnloader()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createBodyStore()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createClamp()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createBeltConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createRollConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createChainConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createPalletConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourcetypeFactory.eINSTANCE.createOverheadConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourceinstanceFactory.eINSTANCE.createResourceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourceinstanceFactory.eINSTANCE.createCapabilityVariant()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourceinstanceFactory.eINSTANCE.createManufacturingCapabilityVariant()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourceinstanceFactory.eINSTANCE.createLogisticsCapabilityVariant()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 ResourceinstanceFactory.eINSTANCE.createGeneralCapabilityVariant()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO,
				 BaseFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createHandlingCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createProductionCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createManufacturingCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createFügen()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createAnEinpressen()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createPressing()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createUrformen()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createUmformen()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createTrennen()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createBeschichten()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createStoffeigenschaften()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createScrewing()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createLogisticsCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createPickAndPlace()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createTransport()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createStore()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createQoSCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createInspect()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createWorkerAssistenceCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createConfirmationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createSwitchConfirmationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createGeneralCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createMoveToLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createProjectPath()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createProjectETA()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createVisualisationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT,
				 CapabilityFactory.eINSTANCE.createQAVisualisationCapability()));
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
			childFeature == CapabilityPackage.Literals.CAPABILITY_REQUEST__WHO ||
			childFeature == CapabilityPackage.Literals.CAPABILITY_REQUEST__WHAT;

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
		return DomainEditPlugin.INSTANCE;
	}

}
