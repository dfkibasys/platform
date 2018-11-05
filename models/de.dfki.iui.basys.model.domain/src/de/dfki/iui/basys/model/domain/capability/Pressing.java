/**
 */
package de.dfki.iui.basys.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.Pressing#getPressure <em>Pressure</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.Pressing#getStroke <em>Stroke</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getPressing()
 * @model
 * @generated
 */
public interface Pressing extends AnEinpressen {
	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute.
	 * @see #setPressure(double)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getPressing_Pressure()
	 * @model
	 * @generated
	 */
	double getPressure();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.Pressing#getPressure <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure</em>' attribute.
	 * @see #getPressure()
	 * @generated
	 */
	void setPressure(double value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' attribute.
	 * @see #setStroke(double)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getPressing_Stroke()
	 * @model
	 * @generated
	 */
	double getStroke();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.Pressing#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' attribute.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(double value);

} // Pressing
