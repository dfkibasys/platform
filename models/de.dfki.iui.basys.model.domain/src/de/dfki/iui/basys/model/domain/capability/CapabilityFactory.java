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
	 * Returns a new object of class '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion</em>'.
	 * @generated
	 */
	CapabilityAssertion createCapabilityAssertion();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	CapabilityRequest createCapabilityRequest();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Handling Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Handling Capability</em>'.
	 * @generated
	 */
	HandlingCapability createHandlingCapability();

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
	 * Returns a new object of class '<em>Pressing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressing</em>'.
	 * @generated
	 */
	Pressing createPressing();

	/**
	 * Returns a new object of class '<em>Qo SCapability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SCapability</em>'.
	 * @generated
	 */
	QoSCapability createQoSCapability();

	/**
	 * Returns a new object of class '<em>Inspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inspect</em>'.
	 * @generated
	 */
	Inspect createInspect();

	/**
	 * Returns a new object of class '<em>Worker Assistence Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Worker Assistence Capability</em>'.
	 * @generated
	 */
	WorkerAssistenceCapability createWorkerAssistenceCapability();

	/**
	 * Returns a new object of class '<em>Interaction Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Capability</em>'.
	 * @generated
	 */
	InteractionCapability createInteractionCapability();

	/**
	 * Returns a new object of class '<em>Confirmation Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confirmation Capability</em>'.
	 * @generated
	 */
	ConfirmationCapability createConfirmationCapability();

	/**
	 * Returns a new object of class '<em>Switch Confirmation Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Confirmation Capability</em>'.
	 * @generated
	 */
	SwitchConfirmationCapability createSwitchConfirmationCapability();

	/**
	 * Returns a new object of class '<em>General Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Capability</em>'.
	 * @generated
	 */
	GeneralCapability createGeneralCapability();

	/**
	 * Returns a new object of class '<em>Move To Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move To Location</em>'.
	 * @generated
	 */
	MoveToLocation createMoveToLocation();

	/**
	 * Returns a new object of class '<em>Project Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Path</em>'.
	 * @generated
	 */
	ProjectPath createProjectPath();

	/**
	 * Returns a new object of class '<em>Project ETA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project ETA</em>'.
	 * @generated
	 */
	ProjectETA createProjectETA();

	/**
	 * Returns a new object of class '<em>Visualisation Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualisation Capability</em>'.
	 * @generated
	 */
	VisualisationCapability createVisualisationCapability();

	/**
	 * Returns a new object of class '<em>QA Visualisation Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QA Visualisation Capability</em>'.
	 * @generated
	 */
	QAVisualisationCapability createQAVisualisationCapability();

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
	 * Returns a new object of class '<em>Screwing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screwing</em>'.
	 * @generated
	 */
	Screwing createScrewing();

	/**
	 * Returns a new object of class '<em>Production Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Production Capability</em>'.
	 * @generated
	 */
	ProductionCapability createProductionCapability();

	/**
	 * Returns a new object of class '<em>Logistics Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistics Capability</em>'.
	 * @generated
	 */
	LogisticsCapability createLogisticsCapability();

	/**
	 * Returns a new object of class '<em>Pick And Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pick And Place</em>'.
	 * @generated
	 */
	PickAndPlace createPickAndPlace();

	/**
	 * Returns a new object of class '<em>Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport</em>'.
	 * @generated
	 */
	Transport createTransport();

	/**
	 * Returns a new object of class '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store</em>'.
	 * @generated
	 */
	Store createStore();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CapabilityPackage getCapabilityPackage();

} //CapabilityFactory
