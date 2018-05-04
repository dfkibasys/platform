/**
 */
package de.dfki.iui.basys.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screwing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.Screwing#getTorque <em>Torque</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getScrewing()
 * @model
 * @generated
 */
public interface Screwing extends AnEinpressen {
	/**
	 * Returns the value of the '<em><b>Torque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torque</em>' attribute.
	 * @see #setTorque(double)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getScrewing_Torque()
	 * @model
	 * @generated
	 */
	double getTorque();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.Screwing#getTorque <em>Torque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torque</em>' attribute.
	 * @see #getTorque()
	 * @generated
	 */
	void setTorque(double value);

} // Screwing
