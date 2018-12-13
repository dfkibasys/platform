/**
 */
package de.dfki.cos.basys.platform.model.domain.topology.impl;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.domain.capability.Capability;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstance;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceType;
import de.dfki.cos.basys.platform.model.domain.topology.ControlModule;
import de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.impl.EquipmentModuleImpl#getControlModules <em>Control Modules</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.impl.EquipmentModuleImpl#getEquipmentModules <em>Equipment Modules</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.impl.EquipmentModuleImpl#getCapabilityRequirement <em>Capability Requirement</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.impl.EquipmentModuleImpl#getAssignedResourceType <em>Assigned Resource Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.impl.EquipmentModuleImpl#getAssignedResourceInstance <em>Assigned Resource Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipmentModuleImpl extends EntityImpl implements EquipmentModule {
	/**
	 * The cached value of the '{@link #getControlModules() <em>Control Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlModule> controlModules;

	/**
	 * The cached value of the '{@link #getEquipmentModules() <em>Equipment Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentModules()
	 * @generated
	 * @ordered
	 */
	protected EList<EquipmentModule> equipmentModules;

	/**
	 * The cached value of the '{@link #getCapabilityRequirement() <em>Capability Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityRequirement()
	 * @generated
	 * @ordered
	 */
	protected Capability capabilityRequirement;

	/**
	 * The cached value of the '{@link #getAssignedResourceType() <em>Assigned Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedResourceType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType assignedResourceType;

	/**
	 * The cached value of the '{@link #getAssignedResourceInstance() <em>Assigned Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedResourceInstance()
	 * @generated
	 * @ordered
	 */
	protected ResourceInstance assignedResourceInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipmentModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.EQUIPMENT_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlModule> getControlModules() {
		if (controlModules == null) {
			controlModules = new EObjectContainmentEList<ControlModule>(ControlModule.class, this, TopologyPackage.EQUIPMENT_MODULE__CONTROL_MODULES);
		}
		return controlModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquipmentModule> getEquipmentModules() {
		if (equipmentModules == null) {
			equipmentModules = new EObjectContainmentEList<EquipmentModule>(EquipmentModule.class, this, TopologyPackage.EQUIPMENT_MODULE__EQUIPMENT_MODULES);
		}
		return equipmentModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getCapabilityRequirement() {
		return capabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilityRequirement(Capability newCapabilityRequirement, NotificationChain msgs) {
		Capability oldCapabilityRequirement = capabilityRequirement;
		capabilityRequirement = newCapabilityRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT, oldCapabilityRequirement, newCapabilityRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityRequirement(Capability newCapabilityRequirement) {
		if (newCapabilityRequirement != capabilityRequirement) {
			NotificationChain msgs = null;
			if (capabilityRequirement != null)
				msgs = ((InternalEObject)capabilityRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT, null, msgs);
			if (newCapabilityRequirement != null)
				msgs = ((InternalEObject)newCapabilityRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT, null, msgs);
			msgs = basicSetCapabilityRequirement(newCapabilityRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT, newCapabilityRequirement, newCapabilityRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType getAssignedResourceType() {
		if (assignedResourceType != null && assignedResourceType.eIsProxy()) {
			InternalEObject oldAssignedResourceType = (InternalEObject)assignedResourceType;
			assignedResourceType = (ResourceType)eResolveProxy(oldAssignedResourceType);
			if (assignedResourceType != oldAssignedResourceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE, oldAssignedResourceType, assignedResourceType));
			}
		}
		return assignedResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetAssignedResourceType() {
		return assignedResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedResourceType(ResourceType newAssignedResourceType) {
		ResourceType oldAssignedResourceType = assignedResourceType;
		assignedResourceType = newAssignedResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE, oldAssignedResourceType, assignedResourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance getAssignedResourceInstance() {
		if (assignedResourceInstance != null && assignedResourceInstance.eIsProxy()) {
			InternalEObject oldAssignedResourceInstance = (InternalEObject)assignedResourceInstance;
			assignedResourceInstance = (ResourceInstance)eResolveProxy(oldAssignedResourceInstance);
			if (assignedResourceInstance != oldAssignedResourceInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE, oldAssignedResourceInstance, assignedResourceInstance));
			}
		}
		return assignedResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance basicGetAssignedResourceInstance() {
		return assignedResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedResourceInstance(ResourceInstance newAssignedResourceInstance, NotificationChain msgs) {
		ResourceInstance oldAssignedResourceInstance = assignedResourceInstance;
		assignedResourceInstance = newAssignedResourceInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE, oldAssignedResourceInstance, newAssignedResourceInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedResourceInstance(ResourceInstance newAssignedResourceInstance) {
		if (newAssignedResourceInstance != assignedResourceInstance) {
			NotificationChain msgs = null;
			if (assignedResourceInstance != null)
				msgs = ((InternalEObject)assignedResourceInstance).eInverseRemove(this, ResourceinstancePackage.RESOURCE_INSTANCE__ROLE, ResourceInstance.class, msgs);
			if (newAssignedResourceInstance != null)
				msgs = ((InternalEObject)newAssignedResourceInstance).eInverseAdd(this, ResourceinstancePackage.RESOURCE_INSTANCE__ROLE, ResourceInstance.class, msgs);
			msgs = basicSetAssignedResourceInstance(newAssignedResourceInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE, newAssignedResourceInstance, newAssignedResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE:
				if (assignedResourceInstance != null)
					msgs = ((InternalEObject)assignedResourceInstance).eInverseRemove(this, ResourceinstancePackage.RESOURCE_INSTANCE__ROLE, ResourceInstance.class, msgs);
				return basicSetAssignedResourceInstance((ResourceInstance)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyPackage.EQUIPMENT_MODULE__CONTROL_MODULES:
				return ((InternalEList<?>)getControlModules()).basicRemove(otherEnd, msgs);
			case TopologyPackage.EQUIPMENT_MODULE__EQUIPMENT_MODULES:
				return ((InternalEList<?>)getEquipmentModules()).basicRemove(otherEnd, msgs);
			case TopologyPackage.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT:
				return basicSetCapabilityRequirement(null, msgs);
			case TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE:
				return basicSetAssignedResourceInstance(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyPackage.EQUIPMENT_MODULE__CONTROL_MODULES:
				return getControlModules();
			case TopologyPackage.EQUIPMENT_MODULE__EQUIPMENT_MODULES:
				return getEquipmentModules();
			case TopologyPackage.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT:
				return getCapabilityRequirement();
			case TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE:
				if (resolve) return getAssignedResourceType();
				return basicGetAssignedResourceType();
			case TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE:
				if (resolve) return getAssignedResourceInstance();
				return basicGetAssignedResourceInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TopologyPackage.EQUIPMENT_MODULE__CONTROL_MODULES:
				getControlModules().clear();
				getControlModules().addAll((Collection<? extends ControlModule>)newValue);
				return;
			case TopologyPackage.EQUIPMENT_MODULE__EQUIPMENT_MODULES:
				getEquipmentModules().clear();
				getEquipmentModules().addAll((Collection<? extends EquipmentModule>)newValue);
				return;
			case TopologyPackage.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT:
				setCapabilityRequirement((Capability)newValue);
				return;
			case TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE:
				setAssignedResourceType((ResourceType)newValue);
				return;
			case TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE:
				setAssignedResourceInstance((ResourceInstance)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TopologyPackage.EQUIPMENT_MODULE__CONTROL_MODULES:
				getControlModules().clear();
				return;
			case TopologyPackage.EQUIPMENT_MODULE__EQUIPMENT_MODULES:
				getEquipmentModules().clear();
				return;
			case TopologyPackage.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT:
				setCapabilityRequirement((Capability)null);
				return;
			case TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE:
				setAssignedResourceType((ResourceType)null);
				return;
			case TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE:
				setAssignedResourceInstance((ResourceInstance)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TopologyPackage.EQUIPMENT_MODULE__CONTROL_MODULES:
				return controlModules != null && !controlModules.isEmpty();
			case TopologyPackage.EQUIPMENT_MODULE__EQUIPMENT_MODULES:
				return equipmentModules != null && !equipmentModules.isEmpty();
			case TopologyPackage.EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT:
				return capabilityRequirement != null;
			case TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE:
				return assignedResourceType != null;
			case TopologyPackage.EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE:
				return assignedResourceInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //EquipmentModuleImpl
