/**
 */
package de.dfki.cos.basys.platform.model.domain.capability.util;

import de.dfki.cos.basys.platform.model.base.BObject;
import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.capability.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage
 * @generated
 */
public class CapabilityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CapabilityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CapabilityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilitySwitch<Adapter> modelSwitch =
		new CapabilitySwitch<Adapter>() {
			@Override
			public Adapter caseCapabilityAssertion(CapabilityAssertion object) {
				return createCapabilityAssertionAdapter();
			}
			@Override
			public Adapter caseCapabilityRequest(CapabilityRequest object) {
				return createCapabilityRequestAdapter();
			}
			@Override
			public Adapter caseCapability(Capability object) {
				return createCapabilityAdapter();
			}
			@Override
			public Adapter caseHandling(Handling object) {
				return createHandlingAdapter();
			}
			@Override
			public Adapter caseManufacturingCapability(ManufacturingCapability object) {
				return createManufacturingCapabilityAdapter();
			}
			@Override
			public Adapter caseFügen(Fügen object) {
				return createFügenAdapter();
			}
			@Override
			public Adapter casePressing(Pressing object) {
				return createPressingAdapter();
			}
			@Override
			public Adapter caseUrformen(Urformen object) {
				return createUrformenAdapter();
			}
			@Override
			public Adapter caseUmformen(Umformen object) {
				return createUmformenAdapter();
			}
			@Override
			public Adapter caseTrennen(Trennen object) {
				return createTrennenAdapter();
			}
			@Override
			public Adapter caseBeschichten(Beschichten object) {
				return createBeschichtenAdapter();
			}
			@Override
			public Adapter caseStoffeigenschaften(Stoffeigenschaften object) {
				return createStoffeigenschaftenAdapter();
			}
			@Override
			public Adapter caseAnEinpressen(AnEinpressen object) {
				return createAnEinpressenAdapter();
			}
			@Override
			public Adapter caseScrewing(Screwing object) {
				return createScrewingAdapter();
			}
			@Override
			public Adapter caseProductionCapability(ProductionCapability object) {
				return createProductionCapabilityAdapter();
			}
			@Override
			public Adapter caseLogisticsCapability(LogisticsCapability object) {
				return createLogisticsCapabilityAdapter();
			}
			@Override
			public Adapter casePickAndPlace(PickAndPlace object) {
				return createPickAndPlaceAdapter();
			}
			@Override
			public Adapter caseTransport(Transport object) {
				return createTransportAdapter();
			}
			@Override
			public Adapter caseBuffering(Buffering object) {
				return createBufferingAdapter();
			}
			@Override
			public Adapter caseQoSCapability(QoSCapability object) {
				return createQoSCapabilityAdapter();
			}
			@Override
			public Adapter caseInspect(Inspect object) {
				return createInspectAdapter();
			}
			@Override
			public Adapter caseWorkerAssistenceCapability(WorkerAssistenceCapability object) {
				return createWorkerAssistenceCapabilityAdapter();
			}
			@Override
			public Adapter caseInteractionCapability(InteractionCapability object) {
				return createInteractionCapabilityAdapter();
			}
			@Override
			public Adapter caseConfirmationCapability(ConfirmationCapability object) {
				return createConfirmationCapabilityAdapter();
			}
			@Override
			public Adapter caseSwitchConfirmationCapability(SwitchConfirmationCapability object) {
				return createSwitchConfirmationCapabilityAdapter();
			}
			@Override
			public Adapter caseGeneralCapability(GeneralCapability object) {
				return createGeneralCapabilityAdapter();
			}
			@Override
			public Adapter caseMoveToLocation(MoveToLocation object) {
				return createMoveToLocationAdapter();
			}
			@Override
			public Adapter caseProjectPath(ProjectPath object) {
				return createProjectPathAdapter();
			}
			@Override
			public Adapter caseProjectETA(ProjectETA object) {
				return createProjectETAAdapter();
			}
			@Override
			public Adapter caseVisualisationCapability(VisualisationCapability object) {
				return createVisualisationCapabilityAdapter();
			}
			@Override
			public Adapter caseQAVisualisationCapability(QAVisualisationCapability object) {
				return createQAVisualisationCapabilityAdapter();
			}
			@Override
			public Adapter caseProvisioning(Provisioning object) {
				return createProvisioningAdapter();
			}
			@Override
			public Adapter caseNotifyWorker(NotifyWorker object) {
				return createNotifyWorkerAdapter();
			}
			@Override
			public Adapter caseChangingQuantity(ChangingQuantity object) {
				return createChangingQuantityAdapter();
			}
			@Override
			public Adapter caseMoving(Moving object) {
				return createMovingAdapter();
			}
			@Override
			public Adapter caseSecuring(Securing object) {
				return createSecuringAdapter();
			}
			@Override
			public Adapter caseChecking(Checking object) {
				return createCheckingAdapter();
			}
			@Override
			public Adapter caseSwivel(Swivel object) {
				return createSwivelAdapter();
			}
			@Override
			public Adapter caseOrientating(Orientating object) {
				return createOrientatingAdapter();
			}
			@Override
			public Adapter casePlacing(Placing object) {
				return createPlacingAdapter();
			}
			@Override
			public Adapter caseOrdering(Ordering object) {
				return createOrderingAdapter();
			}
			@Override
			public Adapter caseGuiding(Guiding object) {
				return createGuidingAdapter();
			}
			@Override
			public Adapter casePassingOn(PassingOn object) {
				return createPassingOnAdapter();
			}
			@Override
			public Adapter caseConveying(Conveying object) {
				return createConveyingAdapter();
			}
			@Override
			public Adapter caseTake(Take object) {
				return createTakeAdapter();
			}
			@Override
			public Adapter caseTestCapability(TestCapability object) {
				return createTestCapabilityAdapter();
			}
			@Override
			public Adapter caseBObject(BObject object) {
				return createBObjectAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityAssertion
	 * @generated
	 */
	public Adapter createCapabilityAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest
	 * @generated
	 */
	public Adapter createCapabilityRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Capability
	 * @generated
	 */
	public Adapter createCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Handling <em>Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Handling
	 * @generated
	 */
	public Adapter createHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.ManufacturingCapability <em>Manufacturing Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.ManufacturingCapability
	 * @generated
	 */
	public Adapter createManufacturingCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Fügen <em>Fügen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Fügen
	 * @generated
	 */
	public Adapter createFügenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Pressing <em>Pressing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Pressing
	 * @generated
	 */
	public Adapter createPressingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.QoSCapability <em>Qo SCapability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.QoSCapability
	 * @generated
	 */
	public Adapter createQoSCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Inspect <em>Inspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Inspect
	 * @generated
	 */
	public Adapter createInspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.WorkerAssistenceCapability <em>Worker Assistence Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.WorkerAssistenceCapability
	 * @generated
	 */
	public Adapter createWorkerAssistenceCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.InteractionCapability <em>Interaction Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.InteractionCapability
	 * @generated
	 */
	public Adapter createInteractionCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.ConfirmationCapability <em>Confirmation Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.ConfirmationCapability
	 * @generated
	 */
	public Adapter createConfirmationCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.SwitchConfirmationCapability <em>Switch Confirmation Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.SwitchConfirmationCapability
	 * @generated
	 */
	public Adapter createSwitchConfirmationCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.GeneralCapability <em>General Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.GeneralCapability
	 * @generated
	 */
	public Adapter createGeneralCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.MoveToLocation <em>Move To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.MoveToLocation
	 * @generated
	 */
	public Adapter createMoveToLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.ProjectPath <em>Project Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.ProjectPath
	 * @generated
	 */
	public Adapter createProjectPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.ProjectETA <em>Project ETA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.ProjectETA
	 * @generated
	 */
	public Adapter createProjectETAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.VisualisationCapability <em>Visualisation Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.VisualisationCapability
	 * @generated
	 */
	public Adapter createVisualisationCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.QAVisualisationCapability <em>QA Visualisation Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.QAVisualisationCapability
	 * @generated
	 */
	public Adapter createQAVisualisationCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Provisioning <em>Provisioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Provisioning
	 * @generated
	 */
	public Adapter createProvisioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.NotifyWorker <em>Notify Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.NotifyWorker
	 * @generated
	 */
	public Adapter createNotifyWorkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.ChangingQuantity <em>Changing Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.ChangingQuantity
	 * @generated
	 */
	public Adapter createChangingQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Moving <em>Moving</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Moving
	 * @generated
	 */
	public Adapter createMovingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Securing <em>Securing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Securing
	 * @generated
	 */
	public Adapter createSecuringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Checking <em>Checking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Checking
	 * @generated
	 */
	public Adapter createCheckingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Swivel <em>Swivel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Swivel
	 * @generated
	 */
	public Adapter createSwivelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Orientating <em>Orientating</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Orientating
	 * @generated
	 */
	public Adapter createOrientatingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Placing <em>Placing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Placing
	 * @generated
	 */
	public Adapter createPlacingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Ordering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Ordering
	 * @generated
	 */
	public Adapter createOrderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Guiding <em>Guiding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Guiding
	 * @generated
	 */
	public Adapter createGuidingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.PassingOn <em>Passing On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.PassingOn
	 * @generated
	 */
	public Adapter createPassingOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Conveying <em>Conveying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Conveying
	 * @generated
	 */
	public Adapter createConveyingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Take <em>Take</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Take
	 * @generated
	 */
	public Adapter createTakeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.TestCapability <em>Test Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.TestCapability
	 * @generated
	 */
	public Adapter createTestCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Urformen <em>Urformen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Urformen
	 * @generated
	 */
	public Adapter createUrformenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Umformen <em>Umformen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Umformen
	 * @generated
	 */
	public Adapter createUmformenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Trennen <em>Trennen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Trennen
	 * @generated
	 */
	public Adapter createTrennenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Beschichten <em>Beschichten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Beschichten
	 * @generated
	 */
	public Adapter createBeschichtenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Stoffeigenschaften <em>Stoffeigenschaften</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Stoffeigenschaften
	 * @generated
	 */
	public Adapter createStoffeigenschaftenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.AnEinpressen <em>An Einpressen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.AnEinpressen
	 * @generated
	 */
	public Adapter createAnEinpressenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Screwing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Screwing
	 * @generated
	 */
	public Adapter createScrewingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.ProductionCapability <em>Production Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.ProductionCapability
	 * @generated
	 */
	public Adapter createProductionCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.LogisticsCapability <em>Logistics Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.LogisticsCapability
	 * @generated
	 */
	public Adapter createLogisticsCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.PickAndPlace <em>Pick And Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.PickAndPlace
	 * @generated
	 */
	public Adapter createPickAndPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Transport
	 * @generated
	 */
	public Adapter createTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.capability.Buffering <em>Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.Buffering
	 * @generated
	 */
	public Adapter createBufferingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.base.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.base.BObject
	 * @generated
	 */
	public Adapter createBObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.base.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CapabilityAdapterFactory
