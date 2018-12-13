/**
 */
package de.dfki.cos.basys.platform.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.Transport#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getTransport()
 * @model
 * @generated
 */
public interface Transport extends LogisticsCapability {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getTransport_Distance()
	 * @model
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.Transport#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

} // Transport
