/**
 */
package de.dfki.iui.basys.model.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BaSys-Basisklasse, TODO: weitere klassen hiervon ableiten, Metadata wird dann automatisch gesetzt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.base.Entity#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.base.BasePackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see de.dfki.iui.basys.model.base.BasePackage#getEntity_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.base.Entity#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

} // Entity
