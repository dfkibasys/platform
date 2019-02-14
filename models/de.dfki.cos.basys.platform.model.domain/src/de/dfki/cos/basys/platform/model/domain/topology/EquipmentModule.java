/**
 */
package de.dfki.cos.basys.platform.model.domain.topology;

import org.eclipse.emf.common.util.EList;

import de.dfki.cos.basys.platform.model.domain.capability.Capability;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstance;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ehemals ResourceInstance, TODO: mobile Betriebsmittel, z.B. Cobots
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getControlModules <em>Control Modules</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getEquipmentModules <em>Equipment Modules</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getCapabilityRequirement <em>Capability Requirement</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getAssignedResourceType <em>Assigned Resource Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getAssignedResourceInstance <em>Assigned Resource Instance</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getEquipmentModule()
 * @model
 * @generated
 */
public interface EquipmentModule extends TopologyElement {
	/**
	 * Returns the value of the '<em><b>Control Modules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.topology.ControlModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Modules</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getEquipmentModule_ControlModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlModule> getControlModules();

	/**
	 * Returns the value of the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unscharf: DiscManufacturingEquipmentModule kann einfache EquipmentModules enthalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Equipment Modules</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getEquipmentModule_EquipmentModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<EquipmentModule> getEquipmentModules();

	/**
	 * Returns the value of the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Requirement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Requirement</em>' containment reference.
	 * @see #setCapabilityRequirement(Capability)
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getEquipmentModule_CapabilityRequirement()
	 * @model containment="true"
	 * @generated
	 */
	Capability getCapabilityRequirement();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getCapabilityRequirement <em>Capability Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Requirement</em>' containment reference.
	 * @see #getCapabilityRequirement()
	 * @generated
	 */
	void setCapabilityRequirement(Capability value);

	/**
	 * Returns the value of the '<em><b>Assigned Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Resource Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Resource Type</em>' reference.
	 * @see #setAssignedResourceType(ResourceType)
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getEquipmentModule_AssignedResourceType()
	 * @model
	 * @generated
	 */
	ResourceType getAssignedResourceType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getAssignedResourceType <em>Assigned Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Resource Type</em>' reference.
	 * @see #getAssignedResourceType()
	 * @generated
	 */
	void setAssignedResourceType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Assigned Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Resource Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Resource Instance</em>' reference.
	 * @see #setAssignedResourceInstance(ResourceInstance)
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getEquipmentModule_AssignedResourceInstance()
	 * @model
	 * @generated
	 */
	ResourceInstance getAssignedResourceInstance();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getAssignedResourceInstance <em>Assigned Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Resource Instance</em>' reference.
	 * @see #getAssignedResourceInstance()
	 * @generated
	 */
	void setAssignedResourceInstance(ResourceInstance value);

} // EquipmentModule
