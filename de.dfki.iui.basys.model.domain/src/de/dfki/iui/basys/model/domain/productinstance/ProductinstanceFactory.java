/**
 */
package de.dfki.iui.basys.model.domain.productinstance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage
 * @generated
 */
public interface ProductinstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductinstanceFactory eINSTANCE = de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance</em>'.
	 * @generated
	 */
	ProductInstance createProductInstance();

	/**
	 * Returns a new object of class '<em>Product Instance Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance Status</em>'.
	 * @generated
	 */
	ProductInstanceStatus createProductInstanceStatus();

	/**
	 * Returns a new object of class '<em>Product Instance Status Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance Status Change Event</em>'.
	 * @generated
	 */
	ProductInstanceStatusChangeEvent createProductInstanceStatusChangeEvent();

	/**
	 * Returns a new object of class '<em>Product Instance Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance Location</em>'.
	 * @generated
	 */
	ProductInstanceLocation createProductInstanceLocation();

	/**
	 * Returns a new object of class '<em>Product Instance Location Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance Location Change Event</em>'.
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
	ProductinstancePackage getProductinstancePackage();

} //ProductinstanceFactory
