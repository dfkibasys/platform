/**
 */
package de.dfki.iui.basys.model.domain.capability.util;

import de.dfki.iui.basys.model.base.BObject;
import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.domain.capability.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage
 * @generated
 */
public class CapabilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CapabilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitySwitch() {
		if (modelPackage == null) {
			modelPackage = CapabilityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CapabilityPackage.CAPABILITY_ASSERTION: {
				CapabilityAssertion capabilityAssertion = (CapabilityAssertion)theEObject;
				T result = caseCapabilityAssertion(capabilityAssertion);
				if (result == null) result = caseEntity(capabilityAssertion);
				if (result == null) result = caseBObject(capabilityAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CAPABILITY_REQUEST: {
				CapabilityRequest capabilityRequest = (CapabilityRequest)theEObject;
				T result = caseCapabilityRequest(capabilityRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseEntity(capability);
				if (result == null) result = caseBObject(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.HANDLING: {
				Handling handling = (Handling)theEObject;
				T result = caseHandling(handling);
				if (result == null) result = caseCapability(handling);
				if (result == null) result = caseEntity(handling);
				if (result == null) result = caseBObject(handling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.MANUFACTURING_CAPABILITY: {
				ManufacturingCapability manufacturingCapability = (ManufacturingCapability)theEObject;
				T result = caseManufacturingCapability(manufacturingCapability);
				if (result == null) result = caseProductionCapability(manufacturingCapability);
				if (result == null) result = caseCapability(manufacturingCapability);
				if (result == null) result = caseEntity(manufacturingCapability);
				if (result == null) result = caseBObject(manufacturingCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.FÜGEN: {
				Fügen fügen = (Fügen)theEObject;
				T result = caseFügen(fügen);
				if (result == null) result = caseManufacturingCapability(fügen);
				if (result == null) result = caseProductionCapability(fügen);
				if (result == null) result = caseCapability(fügen);
				if (result == null) result = caseEntity(fügen);
				if (result == null) result = caseBObject(fügen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PRESSING: {
				Pressing pressing = (Pressing)theEObject;
				T result = casePressing(pressing);
				if (result == null) result = caseAnEinpressen(pressing);
				if (result == null) result = caseFügen(pressing);
				if (result == null) result = caseManufacturingCapability(pressing);
				if (result == null) result = caseProductionCapability(pressing);
				if (result == null) result = caseCapability(pressing);
				if (result == null) result = caseEntity(pressing);
				if (result == null) result = caseBObject(pressing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.URFORMEN: {
				Urformen urformen = (Urformen)theEObject;
				T result = caseUrformen(urformen);
				if (result == null) result = caseManufacturingCapability(urformen);
				if (result == null) result = caseProductionCapability(urformen);
				if (result == null) result = caseCapability(urformen);
				if (result == null) result = caseEntity(urformen);
				if (result == null) result = caseBObject(urformen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.UMFORMEN: {
				Umformen umformen = (Umformen)theEObject;
				T result = caseUmformen(umformen);
				if (result == null) result = caseManufacturingCapability(umformen);
				if (result == null) result = caseProductionCapability(umformen);
				if (result == null) result = caseCapability(umformen);
				if (result == null) result = caseEntity(umformen);
				if (result == null) result = caseBObject(umformen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.TRENNEN: {
				Trennen trennen = (Trennen)theEObject;
				T result = caseTrennen(trennen);
				if (result == null) result = caseManufacturingCapability(trennen);
				if (result == null) result = caseProductionCapability(trennen);
				if (result == null) result = caseCapability(trennen);
				if (result == null) result = caseEntity(trennen);
				if (result == null) result = caseBObject(trennen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.BESCHICHTEN: {
				Beschichten beschichten = (Beschichten)theEObject;
				T result = caseBeschichten(beschichten);
				if (result == null) result = caseManufacturingCapability(beschichten);
				if (result == null) result = caseProductionCapability(beschichten);
				if (result == null) result = caseCapability(beschichten);
				if (result == null) result = caseEntity(beschichten);
				if (result == null) result = caseBObject(beschichten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.STOFFEIGENSCHAFTEN: {
				Stoffeigenschaften stoffeigenschaften = (Stoffeigenschaften)theEObject;
				T result = caseStoffeigenschaften(stoffeigenschaften);
				if (result == null) result = caseManufacturingCapability(stoffeigenschaften);
				if (result == null) result = caseProductionCapability(stoffeigenschaften);
				if (result == null) result = caseCapability(stoffeigenschaften);
				if (result == null) result = caseEntity(stoffeigenschaften);
				if (result == null) result = caseBObject(stoffeigenschaften);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.AN_EINPRESSEN: {
				AnEinpressen anEinpressen = (AnEinpressen)theEObject;
				T result = caseAnEinpressen(anEinpressen);
				if (result == null) result = caseFügen(anEinpressen);
				if (result == null) result = caseManufacturingCapability(anEinpressen);
				if (result == null) result = caseProductionCapability(anEinpressen);
				if (result == null) result = caseCapability(anEinpressen);
				if (result == null) result = caseEntity(anEinpressen);
				if (result == null) result = caseBObject(anEinpressen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.SCREWING: {
				Screwing screwing = (Screwing)theEObject;
				T result = caseScrewing(screwing);
				if (result == null) result = caseAnEinpressen(screwing);
				if (result == null) result = caseFügen(screwing);
				if (result == null) result = caseManufacturingCapability(screwing);
				if (result == null) result = caseProductionCapability(screwing);
				if (result == null) result = caseCapability(screwing);
				if (result == null) result = caseEntity(screwing);
				if (result == null) result = caseBObject(screwing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PRODUCTION_CAPABILITY: {
				ProductionCapability productionCapability = (ProductionCapability)theEObject;
				T result = caseProductionCapability(productionCapability);
				if (result == null) result = caseCapability(productionCapability);
				if (result == null) result = caseEntity(productionCapability);
				if (result == null) result = caseBObject(productionCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.LOGISTICS_CAPABILITY: {
				LogisticsCapability logisticsCapability = (LogisticsCapability)theEObject;
				T result = caseLogisticsCapability(logisticsCapability);
				if (result == null) result = caseCapability(logisticsCapability);
				if (result == null) result = caseEntity(logisticsCapability);
				if (result == null) result = caseBObject(logisticsCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PICK_AND_PLACE: {
				PickAndPlace pickAndPlace = (PickAndPlace)theEObject;
				T result = casePickAndPlace(pickAndPlace);
				if (result == null) result = caseLogisticsCapability(pickAndPlace);
				if (result == null) result = caseCapability(pickAndPlace);
				if (result == null) result = caseEntity(pickAndPlace);
				if (result == null) result = caseBObject(pickAndPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.TRANSPORT: {
				Transport transport = (Transport)theEObject;
				T result = caseTransport(transport);
				if (result == null) result = caseLogisticsCapability(transport);
				if (result == null) result = caseCapability(transport);
				if (result == null) result = caseEntity(transport);
				if (result == null) result = caseBObject(transport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.BUFFERING: {
				Buffering buffering = (Buffering)theEObject;
				T result = caseBuffering(buffering);
				if (result == null) result = caseHandling(buffering);
				if (result == null) result = caseCapability(buffering);
				if (result == null) result = caseEntity(buffering);
				if (result == null) result = caseBObject(buffering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.QO_SCAPABILITY: {
				QoSCapability qoSCapability = (QoSCapability)theEObject;
				T result = caseQoSCapability(qoSCapability);
				if (result == null) result = caseCapability(qoSCapability);
				if (result == null) result = caseEntity(qoSCapability);
				if (result == null) result = caseBObject(qoSCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.INSPECT: {
				Inspect inspect = (Inspect)theEObject;
				T result = caseInspect(inspect);
				if (result == null) result = caseQoSCapability(inspect);
				if (result == null) result = caseCapability(inspect);
				if (result == null) result = caseEntity(inspect);
				if (result == null) result = caseBObject(inspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.WORKER_ASSISTENCE_CAPABILITY: {
				WorkerAssistenceCapability workerAssistenceCapability = (WorkerAssistenceCapability)theEObject;
				T result = caseWorkerAssistenceCapability(workerAssistenceCapability);
				if (result == null) result = caseCapability(workerAssistenceCapability);
				if (result == null) result = caseEntity(workerAssistenceCapability);
				if (result == null) result = caseBObject(workerAssistenceCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.INTERACTION_CAPABILITY: {
				InteractionCapability interactionCapability = (InteractionCapability)theEObject;
				T result = caseInteractionCapability(interactionCapability);
				if (result == null) result = caseWorkerAssistenceCapability(interactionCapability);
				if (result == null) result = caseCapability(interactionCapability);
				if (result == null) result = caseEntity(interactionCapability);
				if (result == null) result = caseBObject(interactionCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CONFIRMATION_CAPABILITY: {
				ConfirmationCapability confirmationCapability = (ConfirmationCapability)theEObject;
				T result = caseConfirmationCapability(confirmationCapability);
				if (result == null) result = caseWorkerAssistenceCapability(confirmationCapability);
				if (result == null) result = caseCapability(confirmationCapability);
				if (result == null) result = caseEntity(confirmationCapability);
				if (result == null) result = caseBObject(confirmationCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.SWITCH_CONFIRMATION_CAPABILITY: {
				SwitchConfirmationCapability switchConfirmationCapability = (SwitchConfirmationCapability)theEObject;
				T result = caseSwitchConfirmationCapability(switchConfirmationCapability);
				if (result == null) result = caseConfirmationCapability(switchConfirmationCapability);
				if (result == null) result = caseWorkerAssistenceCapability(switchConfirmationCapability);
				if (result == null) result = caseCapability(switchConfirmationCapability);
				if (result == null) result = caseEntity(switchConfirmationCapability);
				if (result == null) result = caseBObject(switchConfirmationCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.GENERAL_CAPABILITY: {
				GeneralCapability generalCapability = (GeneralCapability)theEObject;
				T result = caseGeneralCapability(generalCapability);
				if (result == null) result = caseCapability(generalCapability);
				if (result == null) result = caseEntity(generalCapability);
				if (result == null) result = caseBObject(generalCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.MOVE_TO_LOCATION: {
				MoveToLocation moveToLocation = (MoveToLocation)theEObject;
				T result = caseMoveToLocation(moveToLocation);
				if (result == null) result = caseGeneralCapability(moveToLocation);
				if (result == null) result = caseCapability(moveToLocation);
				if (result == null) result = caseEntity(moveToLocation);
				if (result == null) result = caseBObject(moveToLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PROJECT_PATH: {
				ProjectPath projectPath = (ProjectPath)theEObject;
				T result = caseProjectPath(projectPath);
				if (result == null) result = caseWorkerAssistenceCapability(projectPath);
				if (result == null) result = caseCapability(projectPath);
				if (result == null) result = caseEntity(projectPath);
				if (result == null) result = caseBObject(projectPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PROJECT_ETA: {
				ProjectETA projectETA = (ProjectETA)theEObject;
				T result = caseProjectETA(projectETA);
				if (result == null) result = caseWorkerAssistenceCapability(projectETA);
				if (result == null) result = caseCapability(projectETA);
				if (result == null) result = caseEntity(projectETA);
				if (result == null) result = caseBObject(projectETA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.VISUALISATION_CAPABILITY: {
				VisualisationCapability visualisationCapability = (VisualisationCapability)theEObject;
				T result = caseVisualisationCapability(visualisationCapability);
				if (result == null) result = caseWorkerAssistenceCapability(visualisationCapability);
				if (result == null) result = caseCapability(visualisationCapability);
				if (result == null) result = caseEntity(visualisationCapability);
				if (result == null) result = caseBObject(visualisationCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.QA_VISUALISATION_CAPABILITY: {
				QAVisualisationCapability qaVisualisationCapability = (QAVisualisationCapability)theEObject;
				T result = caseQAVisualisationCapability(qaVisualisationCapability);
				if (result == null) result = caseVisualisationCapability(qaVisualisationCapability);
				if (result == null) result = caseWorkerAssistenceCapability(qaVisualisationCapability);
				if (result == null) result = caseCapability(qaVisualisationCapability);
				if (result == null) result = caseEntity(qaVisualisationCapability);
				if (result == null) result = caseBObject(qaVisualisationCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PROVISIONING: {
				Provisioning provisioning = (Provisioning)theEObject;
				T result = caseProvisioning(provisioning);
				if (result == null) result = caseLogisticsCapability(provisioning);
				if (result == null) result = caseCapability(provisioning);
				if (result == null) result = caseEntity(provisioning);
				if (result == null) result = caseBObject(provisioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.NOTIFY_WORKER: {
				NotifyWorker notifyWorker = (NotifyWorker)theEObject;
				T result = caseNotifyWorker(notifyWorker);
				if (result == null) result = caseWorkerAssistenceCapability(notifyWorker);
				if (result == null) result = caseCapability(notifyWorker);
				if (result == null) result = caseEntity(notifyWorker);
				if (result == null) result = caseBObject(notifyWorker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CHANGING_QUANTITY: {
				ChangingQuantity changingQuantity = (ChangingQuantity)theEObject;
				T result = caseChangingQuantity(changingQuantity);
				if (result == null) result = caseHandling(changingQuantity);
				if (result == null) result = caseCapability(changingQuantity);
				if (result == null) result = caseEntity(changingQuantity);
				if (result == null) result = caseBObject(changingQuantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.MOVING: {
				Moving moving = (Moving)theEObject;
				T result = caseMoving(moving);
				if (result == null) result = caseHandling(moving);
				if (result == null) result = caseCapability(moving);
				if (result == null) result = caseEntity(moving);
				if (result == null) result = caseBObject(moving);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.SECURING: {
				Securing securing = (Securing)theEObject;
				T result = caseSecuring(securing);
				if (result == null) result = caseHandling(securing);
				if (result == null) result = caseCapability(securing);
				if (result == null) result = caseEntity(securing);
				if (result == null) result = caseBObject(securing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CHECKING: {
				Checking checking = (Checking)theEObject;
				T result = caseChecking(checking);
				if (result == null) result = caseHandling(checking);
				if (result == null) result = caseCapability(checking);
				if (result == null) result = caseEntity(checking);
				if (result == null) result = caseBObject(checking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.SWIVEL: {
				Swivel swivel = (Swivel)theEObject;
				T result = caseSwivel(swivel);
				if (result == null) result = caseMoving(swivel);
				if (result == null) result = caseHandling(swivel);
				if (result == null) result = caseCapability(swivel);
				if (result == null) result = caseEntity(swivel);
				if (result == null) result = caseBObject(swivel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.ORIENTATING: {
				Orientating orientating = (Orientating)theEObject;
				T result = caseOrientating(orientating);
				if (result == null) result = caseMoving(orientating);
				if (result == null) result = caseHandling(orientating);
				if (result == null) result = caseCapability(orientating);
				if (result == null) result = caseEntity(orientating);
				if (result == null) result = caseBObject(orientating);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PLACING: {
				Placing placing = (Placing)theEObject;
				T result = casePlacing(placing);
				if (result == null) result = caseMoving(placing);
				if (result == null) result = caseHandling(placing);
				if (result == null) result = caseCapability(placing);
				if (result == null) result = caseEntity(placing);
				if (result == null) result = caseBObject(placing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.ORDERING: {
				Ordering ordering = (Ordering)theEObject;
				T result = caseOrdering(ordering);
				if (result == null) result = caseMoving(ordering);
				if (result == null) result = caseHandling(ordering);
				if (result == null) result = caseCapability(ordering);
				if (result == null) result = caseEntity(ordering);
				if (result == null) result = caseBObject(ordering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.GUIDING: {
				Guiding guiding = (Guiding)theEObject;
				T result = caseGuiding(guiding);
				if (result == null) result = caseMoving(guiding);
				if (result == null) result = caseHandling(guiding);
				if (result == null) result = caseCapability(guiding);
				if (result == null) result = caseEntity(guiding);
				if (result == null) result = caseBObject(guiding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PASSING_ON: {
				PassingOn passingOn = (PassingOn)theEObject;
				T result = casePassingOn(passingOn);
				if (result == null) result = caseMoving(passingOn);
				if (result == null) result = caseHandling(passingOn);
				if (result == null) result = caseCapability(passingOn);
				if (result == null) result = caseEntity(passingOn);
				if (result == null) result = caseBObject(passingOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CONVEYING: {
				Conveying conveying = (Conveying)theEObject;
				T result = caseConveying(conveying);
				if (result == null) result = caseMoving(conveying);
				if (result == null) result = caseHandling(conveying);
				if (result == null) result = caseCapability(conveying);
				if (result == null) result = caseEntity(conveying);
				if (result == null) result = caseBObject(conveying);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityAssertion(CapabilityAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityRequest(CapabilityRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandling(Handling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufacturing Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufacturing Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturingCapability(ManufacturingCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fügen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fügen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFügen(Fügen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressing(Pressing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SCapability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SCapability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSCapability(QoSCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInspect(Inspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worker Assistence Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worker Assistence Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkerAssistenceCapability(WorkerAssistenceCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionCapability(InteractionCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirmation Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirmation Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmationCapability(ConfirmationCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Confirmation Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Confirmation Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchConfirmationCapability(SwitchConfirmationCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralCapability(GeneralCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move To Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move To Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveToLocation(MoveToLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectPath(ProjectPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project ETA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project ETA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectETA(ProjectETA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualisation Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualisation Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualisationCapability(VisualisationCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QA Visualisation Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QA Visualisation Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQAVisualisationCapability(QAVisualisationCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provisioning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provisioning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvisioning(Provisioning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notify Worker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notify Worker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotifyWorker(NotifyWorker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changing Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changing Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangingQuantity(ChangingQuantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moving</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moving</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoving(Moving object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Securing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Securing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecuring(Securing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChecking(Checking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swivel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swivel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwivel(Swivel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientating</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientating</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientating(Orientating object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacing(Placing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdering(Ordering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guiding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guiding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiding(Guiding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passing On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passing On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassingOn(PassingOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveying(Conveying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Urformen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Urformen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrformen(Urformen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Umformen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Umformen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmformen(Umformen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trennen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trennen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrennen(Trennen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beschichten</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beschichten</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeschichten(Beschichten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stoffeigenschaften</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stoffeigenschaften</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoffeigenschaften(Stoffeigenschaften object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>An Einpressen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>An Einpressen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnEinpressen(AnEinpressen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewing(Screwing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionCapability(ProductionCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistics Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistics Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticsCapability(LogisticsCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick And Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick And Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePickAndPlace(PickAndPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransport(Transport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuffering(Buffering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CapabilitySwitch
