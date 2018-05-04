/**
 */
package de.dfki.iui.basys.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pick And Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.PickAndPlace#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getPickAndPlace()
 * @model
 * @generated
 */
public interface PickAndPlace extends LogisticsCapability {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getPickAndPlace_Distance()
	 * @model default="0.0"
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.PickAndPlace#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

} // PickAndPlace
