/**
 */
package de.dfki.cos.basys.platform.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pick And Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.PickAndPlace#getReach <em>Reach</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.PickAndPlace#getPositionRepeatability <em>Position Repeatability</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getPickAndPlace()
 * @model
 * @generated
 */
public interface PickAndPlace extends LogisticsCapability {
	/**
	 * Returns the value of the '<em><b>Reach</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reach</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reach</em>' attribute.
	 * @see #setReach(double)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getPickAndPlace_Reach()
	 * @model default="0.0"
	 * @generated
	 */
	double getReach();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.PickAndPlace#getReach <em>Reach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reach</em>' attribute.
	 * @see #getReach()
	 * @generated
	 */
	void setReach(double value);

	/**
	 * Returns the value of the '<em><b>Position Repeatability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Repeatability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Repeatability</em>' attribute.
	 * @see #setPositionRepeatability(double)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getPickAndPlace_PositionRepeatability()
	 * @model
	 * @generated
	 */
	double getPositionRepeatability();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.PickAndPlace#getPositionRepeatability <em>Position Repeatability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Repeatability</em>' attribute.
	 * @see #getPositionRepeatability()
	 * @generated
	 */
	void setPositionRepeatability(double value);

} // PickAndPlace
