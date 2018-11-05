/**
 */
package de.dfki.iui.basys.model.runtime.component;

import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.CapabilityRequest#getCapabilityVariant <em>Capability Variant</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getCapabilityRequest()
 * @model
 * @generated
 */
public interface CapabilityRequest extends ComponentRequest {
	/**
	 * Returns the value of the '<em><b>Capability Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Variant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Variant</em>' containment reference.
	 * @see #setCapabilityVariant(CapabilityVariant)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getCapabilityRequest_CapabilityVariant()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityVariant<?> getCapabilityVariant();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.CapabilityRequest#getCapabilityVariant <em>Capability Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Variant</em>' containment reference.
	 * @see #getCapabilityVariant()
	 * @generated
	 */
	void setCapabilityVariant(CapabilityVariant<?> value);

} // CapabilityRequest
