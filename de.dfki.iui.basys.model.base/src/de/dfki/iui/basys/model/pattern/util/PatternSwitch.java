/**
 */
package de.dfki.iui.basys.model.pattern.util;

import de.dfki.iui.basys.model.pattern.*;

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
 * @see de.dfki.iui.basys.model.pattern.PatternPackage
 * @generated
 */
public class PatternSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternSwitch() {
		if (modelPackage == null) {
			modelPackage = PatternPackage.eINSTANCE;
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
			case PatternPackage.PPATTERN: {
				PPattern pPattern = (PPattern)theEObject;
				T result = casePPattern(pPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.POBJECT: {
				PObject pObject = (PObject)theEObject;
				T result = casePObject(pObject);
				if (result == null) result = casePPattern(pObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PEMPTY_SLOT: {
				PEmptySlot pEmptySlot = (PEmptySlot)theEObject;
				T result = casePEmptySlot(pEmptySlot);
				if (result == null) result = casePPattern(pEmptySlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PSLOT: {
				PSlot pSlot = (PSlot)theEObject;
				T result = casePSlot(pSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PVALUE: {
				PValue pValue = (PValue)theEObject;
				T result = casePValue(pValue);
				if (result == null) result = casePPattern(pValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PVALUE_OBJECT: {
				PValueObject pValueObject = (PValueObject)theEObject;
				T result = casePValueObject(pValueObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PVALUE_GEN: {
				PValueGen pValueGen = (PValueGen)theEObject;
				T result = casePValueGen(pValueGen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PRESTRICTIONS: {
				PRestrictions pRestrictions = (PRestrictions)theEObject;
				T result = casePRestrictions(pRestrictions);
				if (result == null) result = casePValueGen(pRestrictions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PRESTRICTION: {
				PRestriction<?, ?> pRestriction = (PRestriction<?, ?>)theEObject;
				T result = casePRestriction(pRestriction);
				if (result == null) result = casePValueGen(pRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PBOOLEAN_RESTRICTION: {
				PBooleanRestriction pBooleanRestriction = (PBooleanRestriction)theEObject;
				T result = casePBooleanRestriction(pBooleanRestriction);
				if (result == null) result = casePRestriction(pBooleanRestriction);
				if (result == null) result = casePValueGen(pBooleanRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PENUM_RESTRICTION: {
				PEnumRestriction pEnumRestriction = (PEnumRestriction)theEObject;
				T result = casePEnumRestriction(pEnumRestriction);
				if (result == null) result = casePRestriction(pEnumRestriction);
				if (result == null) result = casePValueGen(pEnumRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PCHAR_RESTRICTION: {
				PCharRestriction pCharRestriction = (PCharRestriction)theEObject;
				T result = casePCharRestriction(pCharRestriction);
				if (result == null) result = casePRestriction(pCharRestriction);
				if (result == null) result = casePValueGen(pCharRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PSTRING_RESTRICTION: {
				PStringRestriction pStringRestriction = (PStringRestriction)theEObject;
				T result = casePStringRestriction(pStringRestriction);
				if (result == null) result = casePRestriction(pStringRestriction);
				if (result == null) result = casePValueGen(pStringRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PNUMBER_RESTRICTION: {
				PNumberRestriction<?> pNumberRestriction = (PNumberRestriction<?>)theEObject;
				T result = casePNumberRestriction(pNumberRestriction);
				if (result == null) result = casePRestriction(pNumberRestriction);
				if (result == null) result = casePValueGen(pNumberRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PBYTE_RESTRICTION: {
				PByteRestriction pByteRestriction = (PByteRestriction)theEObject;
				T result = casePByteRestriction(pByteRestriction);
				if (result == null) result = casePNumberRestriction(pByteRestriction);
				if (result == null) result = casePRestriction(pByteRestriction);
				if (result == null) result = casePValueGen(pByteRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PSHORT_RESTRICTION: {
				PShortRestriction pShortRestriction = (PShortRestriction)theEObject;
				T result = casePShortRestriction(pShortRestriction);
				if (result == null) result = casePNumberRestriction(pShortRestriction);
				if (result == null) result = casePRestriction(pShortRestriction);
				if (result == null) result = casePValueGen(pShortRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PINTEGER_RESTRICTION: {
				PIntegerRestriction pIntegerRestriction = (PIntegerRestriction)theEObject;
				T result = casePIntegerRestriction(pIntegerRestriction);
				if (result == null) result = casePNumberRestriction(pIntegerRestriction);
				if (result == null) result = casePRestriction(pIntegerRestriction);
				if (result == null) result = casePValueGen(pIntegerRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PLONG_RESTRICTION: {
				PLongRestriction pLongRestriction = (PLongRestriction)theEObject;
				T result = casePLongRestriction(pLongRestriction);
				if (result == null) result = casePNumberRestriction(pLongRestriction);
				if (result == null) result = casePRestriction(pLongRestriction);
				if (result == null) result = casePValueGen(pLongRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PFLOAT_RESTRICTION: {
				PFloatRestriction pFloatRestriction = (PFloatRestriction)theEObject;
				T result = casePFloatRestriction(pFloatRestriction);
				if (result == null) result = casePNumberRestriction(pFloatRestriction);
				if (result == null) result = casePRestriction(pFloatRestriction);
				if (result == null) result = casePValueGen(pFloatRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PDOUBLE_RESTRICTION: {
				PDoubleRestriction pDoubleRestriction = (PDoubleRestriction)theEObject;
				T result = casePDoubleRestriction(pDoubleRestriction);
				if (result == null) result = casePNumberRestriction(pDoubleRestriction);
				if (result == null) result = casePRestriction(pDoubleRestriction);
				if (result == null) result = casePValueGen(pDoubleRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.PDATE_RESTRICTION: {
				PDateRestriction pDateRestriction = (PDateRestriction)theEObject;
				T result = casePDateRestriction(pDateRestriction);
				if (result == null) result = casePNumberRestriction(pDateRestriction);
				if (result == null) result = casePRestriction(pDateRestriction);
				if (result == null) result = casePValueGen(pDateRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PEmpty Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PEmpty Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEmptySlot(PEmptySlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePObject(PObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSlot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSlot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSlot(PSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPattern(PPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PValue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PValue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePValue(PValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PValue Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PValue Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePValueObject(PValueObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PValue Gen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PValue Gen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePValueGen(PValueGen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRestrictions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRestrictions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRestrictions(PRestrictions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRestriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRestriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <F, V> T casePRestriction(PRestriction<F, V> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PBoolean Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PBoolean Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePBooleanRestriction(PBooleanRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PEnum Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PEnum Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEnumRestriction(PEnumRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PChar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PChar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCharRestriction(PCharRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PString Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PString Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePStringRestriction(PStringRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PNumber Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PNumber Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <V> T casePNumberRestriction(PNumberRestriction<V> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PByte Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PByte Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePByteRestriction(PByteRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PShort Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PShort Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePShortRestriction(PShortRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PInteger Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PInteger Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePIntegerRestriction(PIntegerRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PLong Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PLong Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePLongRestriction(PLongRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PFloat Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PFloat Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePFloatRestriction(PFloatRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDouble Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDouble Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDoubleRestriction(PDoubleRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDate Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDate Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDateRestriction(PDateRestriction object) {
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

} //PatternSwitch
