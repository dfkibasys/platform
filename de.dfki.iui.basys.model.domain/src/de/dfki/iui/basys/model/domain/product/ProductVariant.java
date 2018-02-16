/**
 */
package de.dfki.iui.basys.model.domain.product;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In BaSys braucht man wohl schon noch einen ProductType, dann sollte die Variante darauf verweisen. Braucht man hier eine BOM?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getProductGroup <em>Product Group</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getBom <em>Bom</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductVariant()
 * @model
 * @generated
 */
public interface ProductVariant extends Entity {
	/**
	 * Returns the value of the '<em><b>Product Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.basys.model.domain.product.ProductGroup#getProductVariants <em>Product Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Group</em>' container reference.
	 * @see #setProductGroup(ProductGroup)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductVariant_ProductGroup()
	 * @see de.dfki.iui.basys.model.domain.product.ProductGroup#getProductVariants
	 * @model opposite="productVariants" transient="false"
	 * @generated
	 */
	ProductGroup getProductGroup();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getProductGroup <em>Product Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Group</em>' container reference.
	 * @see #getProductGroup()
	 * @generated
	 */
	void setProductGroup(ProductGroup value);

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
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductVariant_Bom()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BillOfMaterial getBom();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getBom <em>Bom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom</em>' containment reference.
	 * @see #getBom()
	 * @generated
	 */
	void setBom(BillOfMaterial value);

} // ProductVariant
