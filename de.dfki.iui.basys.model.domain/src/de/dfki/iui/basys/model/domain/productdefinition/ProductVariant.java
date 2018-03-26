/**
 */
package de.dfki.iui.basys.model.domain.productdefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In BaSys braucht man wohl schon noch einen ProductType, dann sollte die Variante darauf verweisen. Braucht man hier eine BOM? TODO: Kommentar erneut prüfen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.ProductVariant#getProductGroup <em>Product Group</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getProductVariant()
 * @model
 * @generated
 */
public interface ProductVariant extends ManufacturedComponent {
	/**
	 * Returns the value of the '<em><b>Product Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.basys.model.domain.productdefinition.ProductGroup#getProductVariants <em>Product Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Group</em>' container reference.
	 * @see #setProductGroup(ProductGroup)
	 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getProductVariant_ProductGroup()
	 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductGroup#getProductVariants
	 * @model opposite="productVariants" required="true" transient="false"
	 * @generated
	 */
	ProductGroup getProductGroup();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.productdefinition.ProductVariant#getProductGroup <em>Product Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Group</em>' container reference.
	 * @see #getProductGroup()
	 * @generated
	 */
	void setProductGroup(ProductGroup value);

} // ProductVariant
