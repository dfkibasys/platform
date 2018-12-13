/**
 */
package de.dfki.cos.basys.platform.model.domain.order;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.OrderStore#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.order.OrderPackage#getOrderStore()
 * @model
 * @generated
 */
public interface OrderStore extends EObject {
	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.order.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.order.OrderPackage#getOrderStore_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

} // OrderStore
