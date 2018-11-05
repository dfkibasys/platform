/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance;

import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.model.domain.topology.EquipmentModule;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eine auftragsbezogene, sich in der Fertigung befindliche oder gefertigte Instanz einer bestimmten Produktvariante.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getCapabilityApplications <em>Capability Applications</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getResourceInstance()
 * @model
 * @generated
 */
public interface ResourceInstance extends Entity {
	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getResourceInstance_SerialNumber()
	 * @model
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type</em>' reference.
	 * @see #setResourceType(ResourceType)
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getResourceInstance_ResourceType()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getResourceType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getResourceType <em>Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' reference.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Capability Applications</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Applications</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getResourceInstance_CapabilityApplications()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityApplication> getCapabilityApplications();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.basys.model.domain.topology.EquipmentModule#getAssignedResourceInstance <em>Assigned Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(EquipmentModule)
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getResourceInstance_Role()
	 * @see de.dfki.iui.basys.model.domain.topology.EquipmentModule#getAssignedResourceInstance
	 * @model opposite="assignedResourceInstance"
	 * @generated
	 */
	EquipmentModule getRole();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(EquipmentModule value);

} // ResourceInstance
