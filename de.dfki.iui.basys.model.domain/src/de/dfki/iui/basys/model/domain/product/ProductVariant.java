/**
 */
package de.dfki.iui.basys.model.domain.product;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

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
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getProductGroupId <em>Product Group Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductVariant()
 * @model
 * @generated
 */
public interface ProductVariant extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductVariant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Product Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Group Id</em>' attribute.
	 * @see #setProductGroupId(String)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductVariant_ProductGroupId()
	 * @model
	 * @generated
	 */
	String getProductGroupId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getProductGroupId <em>Product Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Group Id</em>' attribute.
	 * @see #getProductGroupId()
	 * @generated
	 */
	void setProductGroupId(String value);

} // ProductVariant
