/**
 */
package de.dfki.cos.basys.platform.model.domain.linebalancing.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import de.dfki.cos.basys.platform.model.domain.linebalancing.*;

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
 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage
 * @generated
 */
public class LinebalancingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LinebalancingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebalancingSwitch() {
		if (modelPackage == null) {
			modelPackage = LinebalancingPackage.eINSTANCE;
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
			case LinebalancingPackage.WM_PATH_TIME: {
				WMPathTime wmPathTime = (WMPathTime)theEObject;
				T result = caseWMPathTime(wmPathTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinebalancingPackage.STATIC_WORLD_MODEL: {
				StaticWorldModel staticWorldModel = (StaticWorldModel)theEObject;
				T result = caseStaticWorldModel(staticWorldModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinebalancingPackage.WM_PRODUCT_INSTANCE: {
				WMProductInstance wmProductInstance = (WMProductInstance)theEObject;
				T result = caseWMProductInstance(wmProductInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinebalancingPackage.WM_RESOURCE_INSTANCE: {
				WMResourceInstance wmResourceInstance = (WMResourceInstance)theEObject;
				T result = caseWMResourceInstance(wmResourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinebalancingPackage.WORLD_MODEL: {
				WorldModel worldModel = (WorldModel)theEObject;
				T result = caseWorldModel(worldModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinebalancingPackage.WM_PATH_TIMES: {
				WMPathTimes wmPathTimes = (WMPathTimes)theEObject;
				T result = caseWMPathTimes(wmPathTimes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinebalancingPackage.LINE_BALANCING_ASSIGNMENT: {
				LineBalancingAssignment lineBalancingAssignment = (LineBalancingAssignment)theEObject;
				T result = caseLineBalancingAssignment(lineBalancingAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WM Path Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WM Path Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMPathTime(WMPathTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static World Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static World Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticWorldModel(StaticWorldModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WM Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WM Product Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMProductInstance(WMProductInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WM Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WM Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMResourceInstance(WMResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>World Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>World Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorldModel(WorldModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WM Path Times</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WM Path Times</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMPathTimes(WMPathTimes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Balancing Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Balancing Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineBalancingAssignment(LineBalancingAssignment object) {
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

} //LinebalancingSwitch
