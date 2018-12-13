/**
 */
package de.dfki.cos.basys.platform.model.pattern.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import de.dfki.cos.basys.platform.model.pattern.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage
 * @generated
 */
public class PatternAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PatternPackage.eINSTANCE;
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
	protected PatternSwitch<Adapter> modelSwitch =
		new PatternSwitch<Adapter>() {
			@Override
			public Adapter casePPattern(PPattern object) {
				return createPPatternAdapter();
			}
			@Override
			public Adapter casePObject(PObject object) {
				return createPObjectAdapter();
			}
			@Override
			public Adapter casePEmptySlot(PEmptySlot object) {
				return createPEmptySlotAdapter();
			}
			@Override
			public Adapter casePSlot(PSlot object) {
				return createPSlotAdapter();
			}
			@Override
			public Adapter casePValue(PValue object) {
				return createPValueAdapter();
			}
			@Override
			public Adapter casePValueObject(PValueObject object) {
				return createPValueObjectAdapter();
			}
			@Override
			public Adapter casePValueGen(PValueGen object) {
				return createPValueGenAdapter();
			}
			@Override
			public Adapter casePRestrictions(PRestrictions object) {
				return createPRestrictionsAdapter();
			}
			@Override
			public <F, V> Adapter casePRestriction(PRestriction<F, V> object) {
				return createPRestrictionAdapter();
			}
			@Override
			public Adapter casePBooleanRestriction(PBooleanRestriction object) {
				return createPBooleanRestrictionAdapter();
			}
			@Override
			public Adapter casePEnumRestriction(PEnumRestriction object) {
				return createPEnumRestrictionAdapter();
			}
			@Override
			public Adapter casePCharRestriction(PCharRestriction object) {
				return createPCharRestrictionAdapter();
			}
			@Override
			public Adapter casePStringRestriction(PStringRestriction object) {
				return createPStringRestrictionAdapter();
			}
			@Override
			public <V> Adapter casePNumberRestriction(PNumberRestriction<V> object) {
				return createPNumberRestrictionAdapter();
			}
			@Override
			public Adapter casePByteRestriction(PByteRestriction object) {
				return createPByteRestrictionAdapter();
			}
			@Override
			public Adapter casePShortRestriction(PShortRestriction object) {
				return createPShortRestrictionAdapter();
			}
			@Override
			public Adapter casePIntegerRestriction(PIntegerRestriction object) {
				return createPIntegerRestrictionAdapter();
			}
			@Override
			public Adapter casePLongRestriction(PLongRestriction object) {
				return createPLongRestrictionAdapter();
			}
			@Override
			public Adapter casePFloatRestriction(PFloatRestriction object) {
				return createPFloatRestrictionAdapter();
			}
			@Override
			public Adapter casePDoubleRestriction(PDoubleRestriction object) {
				return createPDoubleRestrictionAdapter();
			}
			@Override
			public Adapter casePDateRestriction(PDateRestriction object) {
				return createPDateRestrictionAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PEmptySlot <em>PEmpty Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEmptySlot
	 * @generated
	 */
	public Adapter createPEmptySlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PObject <em>PObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PObject
	 * @generated
	 */
	public Adapter createPObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PSlot <em>PSlot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PSlot
	 * @generated
	 */
	public Adapter createPSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PPattern <em>PPattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PPattern
	 * @generated
	 */
	public Adapter createPPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PValue <em>PValue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValue
	 * @generated
	 */
	public Adapter createPValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PValueObject <em>PValue Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValueObject
	 * @generated
	 */
	public Adapter createPValueObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PValueGen <em>PValue Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValueGen
	 * @generated
	 */
	public Adapter createPValueGenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions <em>PRestrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictions
	 * @generated
	 */
	public Adapter createPRestrictionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction <em>PRestriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction
	 * @generated
	 */
	public Adapter createPRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction <em>PBoolean Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction
	 * @generated
	 */
	public Adapter createPBooleanRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestriction <em>PEnum Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestriction
	 * @generated
	 */
	public Adapter createPEnumRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction <em>PChar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestriction
	 * @generated
	 */
	public Adapter createPCharRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestriction <em>PString Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestriction
	 * @generated
	 */
	public Adapter createPStringRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PNumberRestriction <em>PNumber Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PNumberRestriction
	 * @generated
	 */
	public Adapter createPNumberRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PByteRestriction <em>PByte Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PByteRestriction
	 * @generated
	 */
	public Adapter createPByteRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PShortRestriction <em>PShort Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PShortRestriction
	 * @generated
	 */
	public Adapter createPShortRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction <em>PInteger Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction
	 * @generated
	 */
	public Adapter createPIntegerRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PLongRestriction <em>PLong Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PLongRestriction
	 * @generated
	 */
	public Adapter createPLongRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PFloatRestriction <em>PFloat Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PFloatRestriction
	 * @generated
	 */
	public Adapter createPFloatRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PDoubleRestriction <em>PDouble Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PDoubleRestriction
	 * @generated
	 */
	public Adapter createPDoubleRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.pattern.PDateRestriction <em>PDate Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.pattern.PDateRestriction
	 * @generated
	 */
	public Adapter createPDateRestrictionAdapter() {
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

} //PatternAdapterFactory
