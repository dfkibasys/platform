/**
 */
package de.dfki.cos.basys.platform.model.domain.productdefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productdefinition.ProductCatalogue#getProductGroups <em>Product Groups</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage#getProductCatalogue()
 * @model
 * @generated
 */
public interface ProductCatalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.productdefinition.ProductGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Groups</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage#getProductCatalogue_ProductGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductGroup> getProductGroups();

} // ProductCatalogue
