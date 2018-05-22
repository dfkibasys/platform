/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance.util;

import de.dfki.iui.basys.model.base.BObject;
import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.domain.resourceinstance.*;

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
 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage
 * @generated
 */
public class ResourceinstanceSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourceinstancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceinstanceSwitch() {
		if (modelPackage == null) {
			modelPackage = ResourceinstancePackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ResourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY: {
				ResourceInstanceRepository resourceInstanceRepository = (ResourceInstanceRepository)theEObject;
				T1 result = caseResourceInstanceRepository(resourceInstanceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourceinstancePackage.RESOURCE_INSTANCE: {
				ResourceInstance resourceInstance = (ResourceInstance)theEObject;
				T1 result = caseResourceInstance(resourceInstance);
				if (result == null) result = caseEntity(resourceInstance);
				if (result == null) result = caseBObject(resourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourceinstancePackage.CAPABILITY_APPLICATION: {
				CapabilityApplication capabilityApplication = (CapabilityApplication)theEObject;
				T1 result = caseCapabilityApplication(capabilityApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourceinstancePackage.CAPABILITY_VARIANT: {
				CapabilityVariant<?> capabilityVariant = (CapabilityVariant<?>)theEObject;
				T1 result = caseCapabilityVariant(capabilityVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourceinstancePackage.MANUFACTURING_CAPABILITY_VARIANT: {
				ManufacturingCapabilityVariant manufacturingCapabilityVariant = (ManufacturingCapabilityVariant)theEObject;
				T1 result = caseManufacturingCapabilityVariant(manufacturingCapabilityVariant);
				if (result == null) result = caseCapabilityVariant(manufacturingCapabilityVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourceinstancePackage.LOGISTICS_CAPABILITY_VARIANT: {
				LogisticsCapabilityVariant logisticsCapabilityVariant = (LogisticsCapabilityVariant)theEObject;
				T1 result = caseLogisticsCapabilityVariant(logisticsCapabilityVariant);
				if (result == null) result = caseCapabilityVariant(logisticsCapabilityVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourceinstancePackage.GENERAL_CAPABILITY_VARIANT: {
				GeneralCapabilityVariant generalCapabilityVariant = (GeneralCapabilityVariant)theEObject;
				T1 result = caseGeneralCapabilityVariant(generalCapabilityVariant);
				if (result == null) result = caseCapabilityVariant(generalCapabilityVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Instance Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Instance Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceInstanceRepository(ResourceInstanceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceInstance(ResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCapabilityApplication(CapabilityApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseCapabilityVariant(CapabilityVariant<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufacturing Capability Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufacturing Capability Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseManufacturingCapabilityVariant(ManufacturingCapabilityVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistics Capability Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistics Capability Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLogisticsCapabilityVariant(LogisticsCapabilityVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Capability Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Capability Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeneralCapabilityVariant(GeneralCapabilityVariant object) {
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
	public T1 caseBObject(BObject object) {
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
	public T1 caseEntity(Entity object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ResourceinstanceSwitch
