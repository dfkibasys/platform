/**
 */
package de.dfki.iui.basys.model.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.data.Path#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.data.Path#getEta <em>Eta</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.data.DataPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.data.CartesianCoordinate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.data.DataPackage#getPath_Coordinates()
	 * @model containment="true"
	 * @generated
	 */
	EList<CartesianCoordinate> getCoordinates();

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
	 * @see de.dfki.iui.basys.model.data.DataPackage#getPath_Eta()
	 * @model
	 * @generated
	 */
	long getEta();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.data.Path#getEta <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' attribute.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(long value);

} // Path
