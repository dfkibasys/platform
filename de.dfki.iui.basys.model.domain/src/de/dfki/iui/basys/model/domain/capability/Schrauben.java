/**
 */
package de.dfki.iui.basys.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schrauben</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.Schrauben#getDrehmoment <em>Drehmoment</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getSchrauben()
 * @model
 * @generated
 */
public interface Schrauben extends AnEinpressen {
	/**
	 * Returns the value of the '<em><b>Drehmoment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drehmoment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drehmoment</em>' attribute.
	 * @see #setDrehmoment(int)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getSchrauben_Drehmoment()
	 * @model
	 * @generated
	 */
	int getDrehmoment();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.Schrauben#getDrehmoment <em>Drehmoment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drehmoment</em>' attribute.
	 * @see #getDrehmoment()
	 * @generated
	 */
	void setDrehmoment(int value);

} // Schrauben
