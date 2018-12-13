/**
 */
package de.dfki.cos.basys.platform.model.data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Position Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.data.RobotPositionInformation#getEta <em>Eta</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.data.RobotPositionInformation#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.data.DataPackage#getRobotPositionInformation()
 * @model
 * @generated
 */
public interface RobotPositionInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Eta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eta</em>' attribute.
	 * @see #setEta(double)
	 * @see de.dfki.cos.basys.platform.model.data.DataPackage#getRobotPositionInformation_Eta()
	 * @model
	 * @generated
	 */
	double getEta();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.data.RobotPositionInformation#getEta <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' attribute.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(double value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(CartesianCoordinate)
	 * @see de.dfki.cos.basys.platform.model.data.DataPackage#getRobotPositionInformation_Position()
	 * @model containment="true"
	 * @generated
	 */
	CartesianCoordinate getPosition();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.data.RobotPositionInformation#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(CartesianCoordinate value);

} // RobotPositionInformation
