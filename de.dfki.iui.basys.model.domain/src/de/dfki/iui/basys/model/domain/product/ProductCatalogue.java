/**
 */
package de.dfki.iui.basys.model.domain.product;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductCatalogue#getProductGroups <em>Product Groups</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductCatalogue()
 * @model
 * @generated
 */
public interface ProductCatalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.product.ProductGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Groups</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductCatalogue_ProductGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductGroup> getProductGroups();

} // ProductCatalogue
