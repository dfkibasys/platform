/**
 */
package de.dfki.iui.basys.model.domain.productinstance;

import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.product.ProductVariant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Instance</b></em>'.
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
 *   <li>{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getProductVariant <em>Product Variant</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getOrder <em>Order</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getSerialNumber <em>Serial Number</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage#getProductInstance()
 * @model
 * @generated
 */
public interface ProductInstance extends Entity {
	/**
	 * Returns the value of the '<em><b>Product Variant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Variant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Variant</em>' reference.
	 * @see #setProductVariant(ProductVariant)
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage#getProductInstance_ProductVariant()
	 * @model required="true"
	 * @generated
	 */
	ProductVariant getProductVariant();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getProductVariant <em>Product Variant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Variant</em>' reference.
	 * @see #getProductVariant()
	 * @generated
	 */
	void setProductVariant(ProductVariant value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(Order)
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage#getProductInstance_Order()
	 * @model required="true"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

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
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage#getProductInstance_SerialNumber()
	 * @model
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

} // ProductInstance
