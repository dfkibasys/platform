/**
 */
package de.dfki.cos.basys.platform.model.domain.linebalancing;

import org.eclipse.emf.ecore.EObject;

import de.dfki.cos.basys.platform.model.domain.order.Order;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Balancing Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.LineBalancingAssignment#getResourceInstanceId <em>Resource Instance Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.LineBalancingAssignment#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getLineBalancingAssignment()
 * @model
 * @generated
 */
public interface LineBalancingAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Instance Id</em>' attribute.
	 * @see #setResourceInstanceId(String)
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getLineBalancingAssignment_ResourceInstanceId()
	 * @model
	 * @generated
	 */
	String getResourceInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.linebalancing.LineBalancingAssignment#getResourceInstanceId <em>Resource Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Instance Id</em>' attribute.
	 * @see #getResourceInstanceId()
	 * @generated
	 */
	void setResourceInstanceId(String value);

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
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getLineBalancingAssignment_Order()
	 * @model
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.linebalancing.LineBalancingAssignment#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

} // LineBalancingAssignment
