/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage
 * @generated
 */
public interface ComponentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentFactory eINSTANCE = de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Request Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Collection</em>'.
	 * @generated
	 */
	ComponentRequestCollection createComponentRequestCollection();

	/**
	 * Returns a new object of class '<em>Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Status</em>'.
	 * @generated
	 */
	ComponentRequestStatus createComponentRequestStatus();

	/**
	 * Returns a new object of class '<em>Status Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Request</em>'.
	 * @generated
	 */
	StatusRequest createStatusRequest();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	ComponentResponse createComponentResponse();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Occupation Level Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occupation Level Request</em>'.
	 * @generated
	 */
	OccupationLevelRequest createOccupationLevelRequest();

	/**
	 * Returns a new object of class '<em>Execution Mode Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Mode Request</em>'.
	 * @generated
	 */
	ExecutionModeRequest createExecutionModeRequest();

	/**
	 * Returns a new object of class '<em>Execution Command Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Command Request</em>'.
	 * @generated
	 */
	ExecutionCommandRequest createExecutionCommandRequest();

	/**
	 * Returns a new object of class '<em>Operation Mode Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Mode Request</em>'.
	 * @generated
	 */
	OperationModeRequest createOperationModeRequest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentPackage getComponentPackage();

} //ComponentFactory
