/**
 */
package de.dfki.iui.basys.model.domain.product;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.product.ProductPackage
 * @generated
 */
public interface ProductFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductFactory eINSTANCE = de.dfki.iui.basys.model.domain.product.impl.ProductFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	ProductGroup createProductGroup();

	/**
	 * Returns a new object of class '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant</em>'.
	 * @generated
	 */
	ProductVariant createProductVariant();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	ProductInstance createProductInstance();

	/**
	 * Returns a new object of class '<em>Instance Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Status</em>'.
	 * @generated
	 */
	ProductInstanceStatus createProductInstanceStatus();

	/**
	 * Returns a new object of class '<em>Instance Status Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Status Change Event</em>'.
	 * @generated
	 */
	ProductInstanceStatusChangeEvent createProductInstanceStatusChangeEvent();

	/**
	 * Returns a new object of class '<em>Instance Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Location</em>'.
	 * @generated
	 */
	ProductInstanceLocation createProductInstanceLocation();

	/**
	 * Returns a new object of class '<em>Instance Location Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Location Change Event</em>'.
	 * @generated
	 */
	ProductInstanceLocationChangeEvent createProductInstanceLocationChangeEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProductPackage getProductPackage();

} //ProductFactory
