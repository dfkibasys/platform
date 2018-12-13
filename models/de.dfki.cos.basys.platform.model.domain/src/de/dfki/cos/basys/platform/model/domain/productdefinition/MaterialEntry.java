/**
 */
package de.dfki.cos.basys.platform.model.domain.productdefinition;

import de.dfki.cos.basys.platform.model.domain.material.Material;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productdefinition.MaterialEntry#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage#getMaterialEntry()
 * @model
 * @generated
 */
public interface MaterialEntry extends BOMEntry {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' reference.
	 * @see #setMaterial(Material)
	 * @see de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage#getMaterialEntry_Material()
	 * @model required="true"
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.productdefinition.MaterialEntry#getMaterial <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);

} // MaterialEntry
