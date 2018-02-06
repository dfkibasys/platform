/**
 */
package de.dfki.iui.basys.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.Pressen#getDruck <em>Druck</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.Pressen#getHub <em>Hub</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getPressen()
 * @model
 * @generated
 */
public interface Pressen extends AnEinpressen {
	/**
	 * Returns the value of the '<em><b>Druck</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Druck</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Druck</em>' attribute.
	 * @see #setDruck(int)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getPressen_Druck()
	 * @model
	 * @generated
	 */
	int getDruck();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.Pressen#getDruck <em>Druck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Druck</em>' attribute.
	 * @see #getDruck()
	 * @generated
	 */
	void setDruck(int value);

	/**
	 * Returns the value of the '<em><b>Hub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hub</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hub</em>' attribute.
	 * @see #setHub(int)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getPressen_Hub()
	 * @model
	 * @generated
	 */
	int getHub();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.Pressen#getHub <em>Hub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hub</em>' attribute.
	 * @see #getHub()
	 * @generated
	 */
	void setHub(int value);

} // Pressen
