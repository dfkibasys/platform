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
			case CapabilityPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseEntity(capability);
				if (result == null) result = caseBObject(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.MANUFACTURING_CAPABILITY: {
				ManufacturingCapability manufacturingCapability = (ManufacturingCapability)theEObject;
				T result = caseManufacturingCapability(manufacturingCapability);
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
				if (result == null) result = caseCapability(fügen);
				if (result == null) result = caseEntity(fügen);
				if (result == null) result = caseBObject(fügen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PRESSEN: {
				Pressen pressen = (Pressen)theEObject;
				T result = casePressen(pressen);
				if (result == null) result = caseAnEinpressen(pressen);
				if (result == null) result = caseFügen(pressen);
				if (result == null) result = caseManufacturingCapability(pressen);
				if (result == null) result = caseCapability(pressen);
				if (result == null) result = caseEntity(pressen);
				if (result == null) result = caseBObject(pressen);
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
			case CapabilityPackage.URFORMEN: {
				Urformen urformen = (Urformen)theEObject;
				T result = caseUrformen(urformen);
				if (result == null) result = caseManufacturingCapability(urformen);
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
				if (result == null) result = caseCapability(anEinpressen);
				if (result == null) result = caseEntity(anEinpressen);
				if (result == null) result = caseBObject(anEinpressen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.SCHRAUBEN: {
				Schrauben schrauben = (Schrauben)theEObject;
				T result = caseSchrauben(schrauben);
				if (result == null) result = caseAnEinpressen(schrauben);
				if (result == null) result = caseFügen(schrauben);
				if (result == null) result = caseManufacturingCapability(schrauben);
				if (result == null) result = caseCapability(schrauben);
				if (result == null) result = caseEntity(schrauben);
				if (result == null) result = caseBObject(schrauben);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.INFORMATION_TRANSFER_CAPABILITY: {
				InformationTransferCapability informationTransferCapability = (InformationTransferCapability)theEObject;
				T result = caseInformationTransferCapability(informationTransferCapability);
				if (result == null) result = caseCapability(informationTransferCapability);
				if (result == null) result = caseEntity(informationTransferCapability);
				if (result == null) result = caseBObject(informationTransferCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PROVIDE_INFORMATION: {
				ProvideInformation provideInformation = (ProvideInformation)theEObject;
				T result = caseProvideInformation(provideInformation);
				if (result == null) result = caseInformationTransferCapability(provideInformation);
				if (result == null) result = caseCapability(provideInformation);
				if (result == null) result = caseEntity(provideInformation);
				if (result == null) result = caseBObject(provideInformation);
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
	 * Returns the result of interpreting the object as an instance of '<em>Pressen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressen(Pressen object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Schrauben</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schrauben</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchrauben(Schrauben object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Transfer Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Transfer Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationTransferCapability(InformationTransferCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provide Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provide Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvideInformation(ProvideInformation object) {
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
