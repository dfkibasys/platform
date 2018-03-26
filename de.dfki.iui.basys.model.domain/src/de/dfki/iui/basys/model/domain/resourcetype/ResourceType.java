/**
 */
package de.dfki.iui.basys.model.domain.resourcetype;

import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.capability.CapabilityAssertion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getCapabilityAssertion <em>Capability Assertion</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getCapabilityRequirement <em>Capability Requirement</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage#getResourceType()
 * @model
 * @generated
 */
public interface ResourceType extends Entity {
	/**
	 * Returns the value of the '<em><b>Capability Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Assertion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Assertion</em>' containment reference.
	 * @see #setCapabilityAssertion(CapabilityAssertion)
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage#getResourceType_CapabilityAssertion()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityAssertion getCapabilityAssertion();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getCapabilityAssertion <em>Capability Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Assertion</em>' containment reference.
	 * @see #getCapabilityAssertion()
	 * @generated
	 */
	void setCapabilityAssertion(CapabilityAssertion value);

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
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage#getResourceType_CapabilityRequirement()
	 * @model containment="true"
	 * @generated
	 */
	Capability getCapabilityRequirement();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getCapabilityRequirement <em>Capability Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Requirement</em>' containment reference.
	 * @see #getCapabilityRequirement()
	 * @generated
	 */
	void setCapabilityRequirement(Capability value);

} // ResourceType
