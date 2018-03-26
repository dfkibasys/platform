/**
 */
package de.dfki.iui.basys.model.domain.productdefinition;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manufactured Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.ManufacturedComponent#getBom <em>Bom</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getManufacturedComponent()
 * @model
 * @generated
 */
public interface ManufacturedComponent extends Entity {
	/**
	 * Returns the value of the '<em><b>Bom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bom</em>' containment reference.
	 * @see #setBom(BillOfMaterial)
	 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getManufacturedComponent_Bom()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BillOfMaterial getBom();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.productdefinition.ManufacturedComponent#getBom <em>Bom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom</em>' containment reference.
	 * @see #getBom()
	 * @generated
	 */
	void setBom(BillOfMaterial value);

} // ManufacturedComponent
