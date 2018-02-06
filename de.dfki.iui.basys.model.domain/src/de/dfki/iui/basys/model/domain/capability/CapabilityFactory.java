/**
 */
package de.dfki.iui.basys.model.domain.capability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage
 * @generated
 */
public interface CapabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapabilityFactory eINSTANCE = de.dfki.iui.basys.model.domain.capability.impl.CapabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Manufacturing Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manufacturing Capability</em>'.
	 * @generated
	 */
	ManufacturingCapability createManufacturingCapability();

	/**
	 * Returns a new object of class '<em>Fügen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fügen</em>'.
	 * @generated
	 */
	Fügen createFügen();

	/**
	 * Returns a new object of class '<em>Pressen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressen</em>'.
	 * @generated
	 */
	Pressen createPressen();

	/**
	 * Returns a new object of class '<em>Qo SCapability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SCapability</em>'.
	 * @generated
	 */
	QoSCapability createQoSCapability();

	/**
	 * Returns a new object of class '<em>Urformen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Urformen</em>'.
	 * @generated
	 */
	Urformen createUrformen();

	/**
	 * Returns a new object of class '<em>Umformen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Umformen</em>'.
	 * @generated
	 */
	Umformen createUmformen();

	/**
	 * Returns a new object of class '<em>Trennen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trennen</em>'.
	 * @generated
	 */
	Trennen createTrennen();

	/**
	 * Returns a new object of class '<em>Beschichten</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Beschichten</em>'.
	 * @generated
	 */
	Beschichten createBeschichten();

	/**
	 * Returns a new object of class '<em>Stoffeigenschaften</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stoffeigenschaften</em>'.
	 * @generated
	 */
	Stoffeigenschaften createStoffeigenschaften();

	/**
	 * Returns a new object of class '<em>An Einpressen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>An Einpressen</em>'.
	 * @generated
	 */
	AnEinpressen createAnEinpressen();

	/**
	 * Returns a new object of class '<em>Schrauben</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schrauben</em>'.
	 * @generated
	 */
	Schrauben createSchrauben();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CapabilityPackage getCapabilityPackage();

} //CapabilityFactory
