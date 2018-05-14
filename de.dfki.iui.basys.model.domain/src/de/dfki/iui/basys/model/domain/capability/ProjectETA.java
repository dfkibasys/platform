/**
 */
package de.dfki.iui.basys.model.domain.capability;

import de.dfki.iui.basys.model.data.CartesianCoordinate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project ETA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.ProjectETA#getEta <em>Eta</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.ProjectETA#getPosition <em>Position</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.ProjectETA#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.ProjectETA#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectETA()
 * @model
 * @generated
 */
public interface ProjectETA extends WorkerAssistenceCapability {
	/**
	 * Returns the value of the '<em><b>Eta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eta</em>' attribute.
	 * @see #setEta(long)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectETA_Eta()
	 * @model
	 * @generated
	 */
	long getEta();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.ProjectETA#getEta <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' attribute.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(long value);

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
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectETA_Position()
	 * @model containment="true"
	 * @generated
	 */
	CartesianCoordinate getPosition();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.ProjectETA#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(CartesianCoordinate value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectETA_Radius()
	 * @model
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.ProjectETA#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(int)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectETA_Color()
	 * @model
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.ProjectETA#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

} // ProjectETA
