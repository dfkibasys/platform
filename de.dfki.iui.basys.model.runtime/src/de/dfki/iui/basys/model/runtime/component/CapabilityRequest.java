/**
 */
package de.dfki.iui.basys.model.runtime.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.CapabilityRequest#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getCapabilityRequest()
 * @model
 * @generated
 */
public interface CapabilityRequest extends ComponentRequest {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference.
	 * @see #setCapability(EObject)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getCapabilityRequest_Capability()
	 * @model containment="true"
	 * @generated
	 */
	EObject getCapability();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.CapabilityRequest#getCapability <em>Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' containment reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(EObject value);

} // CapabilityRequest
