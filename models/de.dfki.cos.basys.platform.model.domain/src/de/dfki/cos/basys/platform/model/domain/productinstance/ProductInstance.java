/**
 */
package de.dfki.cos.basys.platform.model.domain.productinstance;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.order.Order;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ManufacturedComponent;

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
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance#getManufacturedComponent <em>Manufactured Component</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance#getOrder <em>Order</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance#getSerialNumber <em>Serial Number</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage#getProductInstance()
 * @model
 * @generated
 */
public interface ProductInstance extends Entity {
	/**
	 * Returns the value of the '<em><b>Manufactured Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufactured Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufactured Component</em>' reference.
	 * @see #setManufacturedComponent(ManufacturedComponent)
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage#getProductInstance_ManufacturedComponent()
	 * @model required="true"
	 * @generated
	 */
	ManufacturedComponent getManufacturedComponent();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance#getManufacturedComponent <em>Manufactured Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured Component</em>' reference.
	 * @see #getManufacturedComponent()
	 * @generated
	 */
	void setManufacturedComponent(ManufacturedComponent value);

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
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage#getProductInstance_Order()
	 * @model required="true"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance#getOrder <em>Order</em>}' reference.
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
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage#getProductInstance_SerialNumber()
	 * @model
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

} // ProductInstance
