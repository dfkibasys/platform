/**
 */
package de.dfki.iui.basys.model.domain.material;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.material.MaterialCatalogue#getMaterialGroups <em>Material Groups</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.material.MaterialPackage#getMaterialCatalogue()
 * @model
 * @generated
 */
public interface MaterialCatalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Material Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.material.MaterialGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Groups</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.material.MaterialPackage#getMaterialCatalogue_MaterialGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<MaterialGroup> getMaterialGroups();

} // MaterialCatalogue
