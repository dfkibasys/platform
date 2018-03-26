/**
 */
package de.dfki.iui.basys.model.domain.productdefinition;

import de.dfki.iui.basys.model.base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * besser ProductType?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.ProductGroup#getProductVariants <em>Product Variants</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.ProductGroup#getAssemblyGroups <em>Assembly Groups</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getProductGroup()
 * @model
 * @generated
 */
public interface ProductGroup extends Entity {
	/**
	 * Returns the value of the '<em><b>Product Variants</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.productdefinition.ProductVariant}.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.basys.model.domain.productdefinition.ProductVariant#getProductGroup <em>Product Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Variants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Variants</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getProductGroup_ProductVariants()
	 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductVariant#getProductGroup
	 * @model opposite="productGroup" containment="true"
	 * @generated
	 */
	EList<ProductVariant> getProductVariants();

	/**
	 * Returns the value of the '<em><b>Assembly Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.productdefinition.AssemblyGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Groups</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getProductGroup_AssemblyGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyGroup> getAssemblyGroups();

} // ProductGroup
