/**
 */
package de.dfki.cos.basys.platform.model.domain.productinstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Instance Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStore#getProductInstances <em>Product Instances</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage#getProductInstanceStore()
 * @model
 * @generated
 */
public interface ProductInstanceStore extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Instances</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage#getProductInstanceStore_ProductInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductInstance> getProductInstances();

} // ProductInstanceStore
