/**
 */
package de.dfki.iui.basys.model.domain.order;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

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
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getProductVariantId <em>Product Variant Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getPieces <em>Pieces</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.Order#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends IdentifiableEntity {
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
	 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder_ProductVariantId()
	 * @model
	 * @generated
	 */
	String getProductVariantId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.order.Order#getProductVariantId <em>Product Variant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Variant Id</em>' attribute.
	 * @see #getProductVariantId()
	 * @generated
	 */
	void setProductVariantId(String value);

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
	 * Returns the value of the '<em><b>Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pieces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pieces</em>' attribute.
	 * @see #setPieces(int)
	 * @see de.dfki.iui.basys.model.domain.order.OrderPackage#getOrder_Pieces()
	 * @model
	 * @generated
	 */
	int getPieces();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.order.Order#getPieces <em>Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pieces</em>' attribute.
	 * @see #getPieces()
	 * @generated
	 */
	void setPieces(int value);

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

} // Order
