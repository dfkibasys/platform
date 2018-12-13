/**
 */
package de.dfki.cos.basys.platform.model.domain.material;

import org.eclipse.emf.common.util.EList;

import de.dfki.cos.basys.platform.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.material.MaterialGroup#getMaterialGroups <em>Material Groups</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.material.MaterialGroup#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.material.MaterialPackage#getMaterialGroup()
 * @model
 * @generated
 */
public interface MaterialGroup extends Entity {
	/**
	 * Returns the value of the '<em><b>Material Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.material.MaterialGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Groups</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.material.MaterialPackage#getMaterialGroup_MaterialGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<MaterialGroup> getMaterialGroups();

	/**
	 * Returns the value of the '<em><b>Materials</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.material.Material}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Materials</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.material.MaterialPackage#getMaterialGroup_Materials()
	 * @model containment="true"
	 * @generated
	 */
	EList<Material> getMaterials();

} // MaterialGroup
