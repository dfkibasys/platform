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

} // Path
