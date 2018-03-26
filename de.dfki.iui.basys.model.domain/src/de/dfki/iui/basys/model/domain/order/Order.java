/**
 */
package de.dfki.iui.basys.model.domain.order;

import de.dfki.iui.basys.model.base.Entity;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pro Order nur eine Variante? Mehrere Teile können in mehrere Orders aufgeteilt werden, tdb
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getManufacturedComponent <em>Manufactured Component</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends Entity {
	/**
	 * Returns the value of the '<em><b>Manufactured Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufactured Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufactured Component</em>' reference.
	 * @see #setManufacturedComponent(de.dfki.iui.basys.model.domain.productdefinition.ManufacturedComponent)
	 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder_ManufacturedComponent()
	 * @model required="true"
	 * @generated
	 */
	de.dfki.iui.basys.model.domain.productdefinition.ManufacturedComponent getManufacturedComponent();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.order.Order#getManufacturedComponent <em>Manufactured Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured Component</em>' reference.
	 * @see #getManufacturedComponent()
	 * @generated
	 */
	void setManufacturedComponent(de.dfki.iui.basys.model.domain.productdefinition.ManufacturedComponent value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.order.Order#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * reales Enddatum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.order.Order#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * reales Startdatum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.order.Order#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * reales Enddatum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.order.Order#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * als Enum modelliert. Ok? listennummer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.order.Order#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO: Überarbeiten
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(OrderStatus)
	 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder_Status()
	 * @model containment="true"
	 * @generated
	 */
	OrderStatus getStatus();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.order.Order#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(OrderStatus value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' attribute.
	 * @see #setCustomer(String)
	 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder_Customer()
	 * @model
	 * @generated
	 */
	String getCustomer();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.order.Order#getCustomer <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' attribute.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(String value);

} // Order
