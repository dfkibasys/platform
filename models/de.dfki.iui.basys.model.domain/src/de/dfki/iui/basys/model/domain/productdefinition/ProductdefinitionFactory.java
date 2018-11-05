/**
 */
package de.dfki.iui.basys.model.domain.productdefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage
 * @generated
 */
public interface ProductdefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductdefinitionFactory eINSTANCE = de.dfki.iui.basys.model.domain.productdefinition.impl.ProductdefinitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Catalogue</em>'.
	 * @generated
	 */
	ProductCatalogue createProductCatalogue();

	/**
	 * Returns a new object of class '<em>Product Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Group</em>'.
	 * @generated
	 */
	ProductGroup createProductGroup();

	/**
	 * Returns a new object of class '<em>Product Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Variant</em>'.
	 * @generated
	 */
	ProductVariant createProductVariant();

	/**
	 * Returns a new object of class '<em>Bill Of Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bill Of Material</em>'.
	 * @generated
	 */
	BillOfMaterial createBillOfMaterial();

	/**
	 * Returns a new object of class '<em>Assembly Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Group</em>'.
	 * @generated
	 */
	AssemblyGroup createAssemblyGroup();

	/**
	 * Returns a new object of class '<em>Assembly Group Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Group Entry</em>'.
	 * @generated
	 */
	AssemblyGroupEntry createAssemblyGroupEntry();

	/**
	 * Returns a new object of class '<em>Material Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material Entry</em>'.
	 * @generated
	 */
	MaterialEntry createMaterialEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProductdefinitionPackage getProductdefinitionPackage();

} //ProductdefinitionFactory
