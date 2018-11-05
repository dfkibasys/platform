/**
 */
package de.dfki.iui.basys.model.aas;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.aas.AasPackage
 * @generated
 */
public interface AasFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AasFactory eINSTANCE = de.dfki.iui.basys.model.aas.impl.AasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Administration Shell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Administration Shell</em>'.
	 * @generated
	 */
	AdministrationShell createAdministrationShell();

	/**
	 * Returns a new object of class '<em>Information Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Mapping</em>'.
	 * @generated
	 */
	InformationMapping createInformationMapping();

	/**
	 * Returns a new object of class '<em>Service Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Call</em>'.
	 * @generated
	 */
	ServiceCall createServiceCall();

	/**
	 * Returns a new object of class '<em>Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Mapping</em>'.
	 * @generated
	 */
	ParameterMapping createParameterMapping();

	/**
	 * Returns a new object of class '<em>Operational Service Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Service Mapping</em>'.
	 * @generated
	 */
	OperationalServiceMapping createOperationalServiceMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AasPackage getAasPackage();

} //AasFactory
