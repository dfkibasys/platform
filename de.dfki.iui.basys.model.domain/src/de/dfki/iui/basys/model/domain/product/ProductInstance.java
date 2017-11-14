/**
 */
package de.dfki.iui.basys.model.domain.product;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eine auftragsbezogene, sich in der Fertigung befindliche oder gefertigte Instanz einer bestimmten Produktvariante.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductInstance#getProductVariantId <em>Product Variant Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductInstance#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductInstance#getSerialNumber <em>Serial Number</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstance()
 * @model
 * @generated
 */
public interface ProductInstance extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Product Variant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Variant Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Variant Id</em>' attribute.
	 * @see #setProductVariantId(String)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstance_ProductVariantId()
	 * @model
	 * @generated
	 */
	String getProductVariantId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductInstance#getProductVariantId <em>Product Variant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Variant Id</em>' attribute.
	 * @see #getProductVariantId()
	 * @generated
	 */
	void setProductVariantId(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstance_OrderId()
	 * @model
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductInstance#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstance_SerialNumber()
	 * @model
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductInstance#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

} // ProductInstance
