/**
 */
package de.dfki.cos.basys.platform.model.data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Coordinate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getX <em>X</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getY <em>Y</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.data.DataPackage#getCartesianCoordinate()
 * @model
 * @generated
 */
public interface CartesianCoordinate extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see de.dfki.cos.basys.platform.model.data.DataPackage#getCartesianCoordinate_X()
	 * @model
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see de.dfki.cos.basys.platform.model.data.DataPackage#getCartesianCoordinate_Y()
	 * @model
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see de.dfki.cos.basys.platform.model.data.DataPackage#getCartesianCoordinate_Z()
	 * @model
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

} // CartesianCoordinate
