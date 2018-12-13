/**
 */
package de.dfki.cos.basys.platform.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Confirmation Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.SwitchConfirmationCapability#getState <em>State</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getSwitchConfirmationCapability()
 * @model
 * @generated
 */
public interface SwitchConfirmationCapability extends ConfirmationCapability {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(int)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getSwitchConfirmationCapability_State()
	 * @model
	 * @generated
	 */
	int getState();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.SwitchConfirmationCapability#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(int value);

} // SwitchConfirmationCapability
