/**
 */
package de.dfki.iui.basys.model.pattern.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.base.impl.BasePackageImpl;

import de.dfki.iui.basys.model.data.DataPackage;
import de.dfki.iui.basys.model.data.impl.DataPackageImpl;
import de.dfki.iui.basys.model.pattern.Computation;
import de.dfki.iui.basys.model.pattern.PBooleanRestriction;
import de.dfki.iui.basys.model.pattern.PBooleanRestrictionEnum;
import de.dfki.iui.basys.model.pattern.PByteRestriction;
import de.dfki.iui.basys.model.pattern.PCharRestriction;
import de.dfki.iui.basys.model.pattern.PCharRestrictionEnum;
import de.dfki.iui.basys.model.pattern.PDateRestriction;
import de.dfki.iui.basys.model.pattern.PDoubleRestriction;
import de.dfki.iui.basys.model.pattern.PEmptySlot;
import de.dfki.iui.basys.model.pattern.PEnumRestriction;
import de.dfki.iui.basys.model.pattern.PEnumRestrictionEnum;
import de.dfki.iui.basys.model.pattern.PEnumRestrictionType;
import de.dfki.iui.basys.model.pattern.PFloatRestriction;
import de.dfki.iui.basys.model.pattern.PIntegerRestriction;
import de.dfki.iui.basys.model.pattern.PLongRestriction;
import de.dfki.iui.basys.model.pattern.PNumberRestriction;
import de.dfki.iui.basys.model.pattern.PNumberRestrictionEnum;
import de.dfki.iui.basys.model.pattern.PObject;
import de.dfki.iui.basys.model.pattern.PPattern;
import de.dfki.iui.basys.model.pattern.PQuantorEnum;
import de.dfki.iui.basys.model.pattern.PRestriction;
import de.dfki.iui.basys.model.pattern.PRestrictions;
import de.dfki.iui.basys.model.pattern.PRestrictionsEnum;
import de.dfki.iui.basys.model.pattern.PShortRestriction;
import de.dfki.iui.basys.model.pattern.PSlot;
import de.dfki.iui.basys.model.pattern.PStringRestriction;
import de.dfki.iui.basys.model.pattern.PStringRestrictionEnum;
import de.dfki.iui.basys.model.pattern.PValue;
import de.dfki.iui.basys.model.pattern.PValueGen;
import de.dfki.iui.basys.model.pattern.PValueObject;
import de.dfki.iui.basys.model.pattern.PatternFactory;
import de.dfki.iui.basys.model.pattern.PatternPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternPackageImpl extends EPackageImpl implements PatternPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pEmptySlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pValueObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pValueGenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pRestrictionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pBooleanRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pEnumRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pCharRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pStringRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pNumberRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pByteRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pShortRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pIntegerRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pLongRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pFloatRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pDoubleRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pDateRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum computationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pBooleanRestrictionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pNumberRestrictionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pEnumRestrictionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pEnumRestrictionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pStringRestrictionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pCharRestrictionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pRestrictionsEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pQuantorEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType peObjectArrayEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.iui.basys.model.pattern.PatternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternPackageImpl() {
		super(eNS_URI, PatternFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PatternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternPackage init() {
		if (isInited) return (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

		// Obtain or create and register package
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		thePatternPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatternPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternPackage.eNS_URI, thePatternPackage);
		return thePatternPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPEmptySlot() {
		return pEmptySlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPObject() {
		return pObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPObject_Type() {
		return (EReference)pObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPObject_Slot() {
		return (EReference)pObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPObject__GetSlot__EStructuralFeature() {
		return pObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPObject__CreateSkeleton() {
		return pObjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPObject__Unify__PPattern() {
		return pObjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPObject__Unify__PObject() {
		return pObjectEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSlot() {
		return pSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSlot_Feature() {
		return (EReference)pSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSlot_Range() {
		return (EReference)pSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSlot_FeatureName() {
		return (EAttribute)pSlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPSlot__GetRangeValue() {
		return pSlotEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPSlot__GetRangeValues() {
		return pSlotEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPSlot__GetRangeObject() {
		return pSlotEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPSlot__GetRangeObjects() {
		return pSlotEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPSlot__Unify__PSlot() {
		return pSlotEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPattern() {
		return pPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPPattern_VarName() {
		return (EAttribute)pPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPPattern_InstIdx() {
		return (EAttribute)pPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPPattern_Quantor() {
		return (EAttribute)pPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPPattern__Matches__Object() {
		return pPatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPPattern__CreateSkeleton() {
		return pPatternEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPPattern__Unify__PPattern() {
		return pPatternEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPValue() {
		return pValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPValue_Type() {
		return (EReference)pValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPValue_Restrictions() {
		return (EReference)pValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPValue__CreateSkeleton() {
		return pValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPValue__Unify__PPattern() {
		return pValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPValue__Unify__PValue() {
		return pValueEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPValueObject() {
		return pValueObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPValueObject_Value() {
		return (EAttribute)pValueObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPValueGen() {
		return pValueGenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPValueGen__GetDefaultValue__Object() {
		return pValueGenEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRestrictions() {
		return pRestrictionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPRestrictions_Restriction() {
		return (EReference)pRestrictionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPRestrictions_Restrictions() {
		return (EReference)pRestrictionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPRestrictions_Function() {
		return (EAttribute)pRestrictionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPRestrictions__GetDefaultValue__Object() {
		return pRestrictionsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPRestrictions__Unify__PRestrictions() {
		return pRestrictionsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRestriction() {
		return pRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPRestriction_Expression() {
		return (EAttribute)pRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPRestriction__IsSatisfiedBy__Object() {
		return pRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPRestriction__GetFunction() {
		return pRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPRestriction__SetFunction__Object() {
		return pRestrictionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPRestriction__GetValue() {
		return pRestrictionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPRestriction__SetValue__Object() {
		return pRestrictionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPRestriction__Unify__PRestriction() {
		return pRestrictionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPBooleanRestriction() {
		return pBooleanRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPBooleanRestriction_Value() {
		return (EAttribute)pBooleanRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPBooleanRestriction_Function() {
		return (EAttribute)pBooleanRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPBooleanRestriction__IsSatisfiedBy__Object() {
		return pBooleanRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPBooleanRestriction__GetDefaultValue__Object() {
		return pBooleanRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPEnumRestriction() {
		return pEnumRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEnumRestriction_Function() {
		return (EAttribute)pEnumRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPEnumRestriction_Value() {
		return (EReference)pEnumRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPEnumRestriction_EnumDataType() {
		return (EReference)pEnumRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPEnumRestriction__IsSatisfiedBy__Object() {
		return pEnumRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPEnumRestriction__GetDefaultValue__Object() {
		return pEnumRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPEnumRestriction__Unify__PRestriction() {
		return pEnumRestrictionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCharRestriction() {
		return pCharRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCharRestriction_IgnoreCase() {
		return (EAttribute)pCharRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCharRestriction_Value() {
		return (EAttribute)pCharRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCharRestriction_Function() {
		return (EAttribute)pCharRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPCharRestriction__IsSatisfiedBy__Object() {
		return pCharRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPCharRestriction__GetDefaultValue__Object() {
		return pCharRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPCharRestriction__Unify__PRestriction() {
		return pCharRestrictionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPStringRestriction() {
		return pStringRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPStringRestriction_IgnoreCase() {
		return (EAttribute)pStringRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPStringRestriction_Value() {
		return (EAttribute)pStringRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPStringRestriction_Function() {
		return (EAttribute)pStringRestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPStringRestriction__IsSatisfiedBy__Object() {
		return pStringRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPStringRestriction__GetDefaultValue__Object() {
		return pStringRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPStringRestriction__Unify__PRestriction() {
		return pStringRestrictionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPNumberRestriction() {
		return pNumberRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPNumberRestriction_Function() {
		return (EAttribute)pNumberRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPNumberRestriction___compareTo__int_PNumberRestrictionEnum() {
		return pNumberRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPByteRestriction() {
		return pByteRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPByteRestriction_Value() {
		return (EAttribute)pByteRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPByteRestriction__IsSatisfiedBy__Object() {
		return pByteRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPByteRestriction__GetDefaultValue__Object() {
		return pByteRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPShortRestriction() {
		return pShortRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPShortRestriction_Value() {
		return (EAttribute)pShortRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPShortRestriction__IsSatisfiedBy__Object() {
		return pShortRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPShortRestriction__GetDefaultValue__Object() {
		return pShortRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPIntegerRestriction() {
		return pIntegerRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIntegerRestriction_Value() {
		return (EAttribute)pIntegerRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPIntegerRestriction__IsSatisfiedBy__Object() {
		return pIntegerRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPIntegerRestriction__GetDefaultValue__Object() {
		return pIntegerRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPIntegerRestriction__Unify__PRestriction() {
		return pIntegerRestrictionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPLongRestriction() {
		return pLongRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPLongRestriction_Value() {
		return (EAttribute)pLongRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPLongRestriction__IsSatisfiedBy__Object() {
		return pLongRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPLongRestriction__GetDefaultValue__Object() {
		return pLongRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPFloatRestriction() {
		return pFloatRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPFloatRestriction_Value() {
		return (EAttribute)pFloatRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPFloatRestriction__IsSatisfiedBy__Object() {
		return pFloatRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPFloatRestriction__GetDefaultValue__Object() {
		return pFloatRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDoubleRestriction() {
		return pDoubleRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPDoubleRestriction_Value() {
		return (EAttribute)pDoubleRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPDoubleRestriction__IsSatisfiedBy__Object() {
		return pDoubleRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPDoubleRestriction__GetDefaultValue__Object() {
		return pDoubleRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDateRestriction() {
		return pDateRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPDateRestriction_Value() {
		return (EAttribute)pDateRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPDateRestriction__IsSatisfiedBy__Object() {
		return pDateRestrictionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPDateRestriction__GetDefaultValue__Object() {
		return pDateRestrictionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComputation() {
		return computationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPBooleanRestrictionEnum() {
		return pBooleanRestrictionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPNumberRestrictionEnum() {
		return pNumberRestrictionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPEnumRestrictionEnum() {
		return pEnumRestrictionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPEnumRestrictionType() {
		return pEnumRestrictionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPStringRestrictionEnum() {
		return pStringRestrictionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPCharRestrictionEnum() {
		return pCharRestrictionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPRestrictionsEnum() {
		return pRestrictionsEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPQuantorEnum() {
		return pQuantorEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPEObjectArray() {
		return peObjectArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternFactory getPatternFactory() {
		return (PatternFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pPatternEClass = createEClass(PPATTERN);
		createEAttribute(pPatternEClass, PPATTERN__VAR_NAME);
		createEAttribute(pPatternEClass, PPATTERN__INST_IDX);
		createEAttribute(pPatternEClass, PPATTERN__QUANTOR);
		createEOperation(pPatternEClass, PPATTERN___MATCHES__OBJECT);
		createEOperation(pPatternEClass, PPATTERN___CREATE_SKELETON);
		createEOperation(pPatternEClass, PPATTERN___UNIFY__PPATTERN);

		pObjectEClass = createEClass(POBJECT);
		createEReference(pObjectEClass, POBJECT__TYPE);
		createEReference(pObjectEClass, POBJECT__SLOT);
		createEOperation(pObjectEClass, POBJECT___GET_SLOT__ESTRUCTURALFEATURE);
		createEOperation(pObjectEClass, POBJECT___CREATE_SKELETON);
		createEOperation(pObjectEClass, POBJECT___UNIFY__PPATTERN);
		createEOperation(pObjectEClass, POBJECT___UNIFY__POBJECT);

		pEmptySlotEClass = createEClass(PEMPTY_SLOT);

		pSlotEClass = createEClass(PSLOT);
		createEReference(pSlotEClass, PSLOT__FEATURE);
		createEReference(pSlotEClass, PSLOT__RANGE);
		createEAttribute(pSlotEClass, PSLOT__FEATURE_NAME);
		createEOperation(pSlotEClass, PSLOT___GET_RANGE_VALUE);
		createEOperation(pSlotEClass, PSLOT___GET_RANGE_VALUES);
		createEOperation(pSlotEClass, PSLOT___GET_RANGE_OBJECT);
		createEOperation(pSlotEClass, PSLOT___GET_RANGE_OBJECTS);
		createEOperation(pSlotEClass, PSLOT___UNIFY__PSLOT);

		pValueEClass = createEClass(PVALUE);
		createEReference(pValueEClass, PVALUE__TYPE);
		createEReference(pValueEClass, PVALUE__RESTRICTIONS);
		createEOperation(pValueEClass, PVALUE___CREATE_SKELETON);
		createEOperation(pValueEClass, PVALUE___UNIFY__PPATTERN);
		createEOperation(pValueEClass, PVALUE___UNIFY__PVALUE);

		pValueObjectEClass = createEClass(PVALUE_OBJECT);
		createEAttribute(pValueObjectEClass, PVALUE_OBJECT__VALUE);

		pValueGenEClass = createEClass(PVALUE_GEN);
		createEOperation(pValueGenEClass, PVALUE_GEN___GET_DEFAULT_VALUE__OBJECT);

		pRestrictionsEClass = createEClass(PRESTRICTIONS);
		createEReference(pRestrictionsEClass, PRESTRICTIONS__RESTRICTION);
		createEReference(pRestrictionsEClass, PRESTRICTIONS__RESTRICTIONS);
		createEAttribute(pRestrictionsEClass, PRESTRICTIONS__FUNCTION);
		createEOperation(pRestrictionsEClass, PRESTRICTIONS___GET_DEFAULT_VALUE__OBJECT);
		createEOperation(pRestrictionsEClass, PRESTRICTIONS___UNIFY__PRESTRICTIONS);

		pRestrictionEClass = createEClass(PRESTRICTION);
		createEAttribute(pRestrictionEClass, PRESTRICTION__EXPRESSION);
		createEOperation(pRestrictionEClass, PRESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pRestrictionEClass, PRESTRICTION___GET_FUNCTION);
		createEOperation(pRestrictionEClass, PRESTRICTION___SET_FUNCTION__OBJECT);
		createEOperation(pRestrictionEClass, PRESTRICTION___GET_VALUE);
		createEOperation(pRestrictionEClass, PRESTRICTION___SET_VALUE__OBJECT);
		createEOperation(pRestrictionEClass, PRESTRICTION___UNIFY__PRESTRICTION);

		pBooleanRestrictionEClass = createEClass(PBOOLEAN_RESTRICTION);
		createEAttribute(pBooleanRestrictionEClass, PBOOLEAN_RESTRICTION__VALUE);
		createEAttribute(pBooleanRestrictionEClass, PBOOLEAN_RESTRICTION__FUNCTION);
		createEOperation(pBooleanRestrictionEClass, PBOOLEAN_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pBooleanRestrictionEClass, PBOOLEAN_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);

		pEnumRestrictionEClass = createEClass(PENUM_RESTRICTION);
		createEAttribute(pEnumRestrictionEClass, PENUM_RESTRICTION__FUNCTION);
		createEReference(pEnumRestrictionEClass, PENUM_RESTRICTION__VALUE);
		createEReference(pEnumRestrictionEClass, PENUM_RESTRICTION__ENUM_DATA_TYPE);
		createEOperation(pEnumRestrictionEClass, PENUM_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pEnumRestrictionEClass, PENUM_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);
		createEOperation(pEnumRestrictionEClass, PENUM_RESTRICTION___UNIFY__PRESTRICTION);

		pCharRestrictionEClass = createEClass(PCHAR_RESTRICTION);
		createEAttribute(pCharRestrictionEClass, PCHAR_RESTRICTION__IGNORE_CASE);
		createEAttribute(pCharRestrictionEClass, PCHAR_RESTRICTION__VALUE);
		createEAttribute(pCharRestrictionEClass, PCHAR_RESTRICTION__FUNCTION);
		createEOperation(pCharRestrictionEClass, PCHAR_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pCharRestrictionEClass, PCHAR_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);
		createEOperation(pCharRestrictionEClass, PCHAR_RESTRICTION___UNIFY__PRESTRICTION);

		pStringRestrictionEClass = createEClass(PSTRING_RESTRICTION);
		createEAttribute(pStringRestrictionEClass, PSTRING_RESTRICTION__IGNORE_CASE);
		createEAttribute(pStringRestrictionEClass, PSTRING_RESTRICTION__VALUE);
		createEAttribute(pStringRestrictionEClass, PSTRING_RESTRICTION__FUNCTION);
		createEOperation(pStringRestrictionEClass, PSTRING_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pStringRestrictionEClass, PSTRING_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);
		createEOperation(pStringRestrictionEClass, PSTRING_RESTRICTION___UNIFY__PRESTRICTION);

		pNumberRestrictionEClass = createEClass(PNUMBER_RESTRICTION);
		createEAttribute(pNumberRestrictionEClass, PNUMBER_RESTRICTION__FUNCTION);
		createEOperation(pNumberRestrictionEClass, PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM);

		pByteRestrictionEClass = createEClass(PBYTE_RESTRICTION);
		createEAttribute(pByteRestrictionEClass, PBYTE_RESTRICTION__VALUE);
		createEOperation(pByteRestrictionEClass, PBYTE_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pByteRestrictionEClass, PBYTE_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);

		pShortRestrictionEClass = createEClass(PSHORT_RESTRICTION);
		createEAttribute(pShortRestrictionEClass, PSHORT_RESTRICTION__VALUE);
		createEOperation(pShortRestrictionEClass, PSHORT_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pShortRestrictionEClass, PSHORT_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);

		pIntegerRestrictionEClass = createEClass(PINTEGER_RESTRICTION);
		createEAttribute(pIntegerRestrictionEClass, PINTEGER_RESTRICTION__VALUE);
		createEOperation(pIntegerRestrictionEClass, PINTEGER_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pIntegerRestrictionEClass, PINTEGER_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);
		createEOperation(pIntegerRestrictionEClass, PINTEGER_RESTRICTION___UNIFY__PRESTRICTION);

		pLongRestrictionEClass = createEClass(PLONG_RESTRICTION);
		createEAttribute(pLongRestrictionEClass, PLONG_RESTRICTION__VALUE);
		createEOperation(pLongRestrictionEClass, PLONG_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pLongRestrictionEClass, PLONG_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);

		pFloatRestrictionEClass = createEClass(PFLOAT_RESTRICTION);
		createEAttribute(pFloatRestrictionEClass, PFLOAT_RESTRICTION__VALUE);
		createEOperation(pFloatRestrictionEClass, PFLOAT_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pFloatRestrictionEClass, PFLOAT_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);

		pDoubleRestrictionEClass = createEClass(PDOUBLE_RESTRICTION);
		createEAttribute(pDoubleRestrictionEClass, PDOUBLE_RESTRICTION__VALUE);
		createEOperation(pDoubleRestrictionEClass, PDOUBLE_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pDoubleRestrictionEClass, PDOUBLE_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);

		pDateRestrictionEClass = createEClass(PDATE_RESTRICTION);
		createEAttribute(pDateRestrictionEClass, PDATE_RESTRICTION__VALUE);
		createEOperation(pDateRestrictionEClass, PDATE_RESTRICTION___IS_SATISFIED_BY__OBJECT);
		createEOperation(pDateRestrictionEClass, PDATE_RESTRICTION___GET_DEFAULT_VALUE__OBJECT);

		// Create enums
		computationEEnum = createEEnum(COMPUTATION);
		pBooleanRestrictionEnumEEnum = createEEnum(PBOOLEAN_RESTRICTION_ENUM);
		pNumberRestrictionEnumEEnum = createEEnum(PNUMBER_RESTRICTION_ENUM);
		pEnumRestrictionEnumEEnum = createEEnum(PENUM_RESTRICTION_ENUM);
		pEnumRestrictionTypeEEnum = createEEnum(PENUM_RESTRICTION_TYPE);
		pStringRestrictionEnumEEnum = createEEnum(PSTRING_RESTRICTION_ENUM);
		pCharRestrictionEnumEEnum = createEEnum(PCHAR_RESTRICTION_ENUM);
		pRestrictionsEnumEEnum = createEEnum(PRESTRICTIONS_ENUM);
		pQuantorEnumEEnum = createEEnum(PQUANTOR_ENUM);

		// Create data types
		peObjectArrayEDataType = createEDataType(PE_OBJECT_ARRAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters
		ETypeParameter pRestrictionEClass_F = addETypeParameter(pRestrictionEClass, "F");
		ETypeParameter pRestrictionEClass_V = addETypeParameter(pRestrictionEClass, "V");
		ETypeParameter pNumberRestrictionEClass_V = addETypeParameter(pNumberRestrictionEClass, "V");

		// Set bounds for type parameters

		// Add supertypes to classes
		pObjectEClass.getESuperTypes().add(this.getPPattern());
		pEmptySlotEClass.getESuperTypes().add(this.getPPattern());
		pValueEClass.getESuperTypes().add(this.getPPattern());
		pRestrictionsEClass.getESuperTypes().add(this.getPValueGen());
		pRestrictionEClass.getESuperTypes().add(this.getPValueGen());
		EGenericType g1 = createEGenericType(this.getPRestriction());
		EGenericType g2 = createEGenericType(this.getPBooleanRestrictionEnum());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theBasePackage.getBBoolean());
		g1.getETypeArguments().add(g2);
		pBooleanRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType(this.getPEnumRestrictionEnum());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		pEnumRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType(this.getPCharRestrictionEnum());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theBasePackage.getBChar());
		g1.getETypeArguments().add(g2);
		pCharRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType(this.getPStringRestrictionEnum());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theBasePackage.getBString());
		g1.getETypeArguments().add(g2);
		pStringRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType(this.getPNumberRestrictionEnum());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(pNumberRestrictionEClass_V);
		g1.getETypeArguments().add(g2);
		pNumberRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPNumberRestriction());
		g2 = createEGenericType(theBasePackage.getBByte());
		g1.getETypeArguments().add(g2);
		pByteRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPNumberRestriction());
		g2 = createEGenericType(theBasePackage.getBShort());
		g1.getETypeArguments().add(g2);
		pShortRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPNumberRestriction());
		g2 = createEGenericType(theBasePackage.getBInteger());
		g1.getETypeArguments().add(g2);
		pIntegerRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPNumberRestriction());
		g2 = createEGenericType(theBasePackage.getBLong());
		g1.getETypeArguments().add(g2);
		pLongRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPNumberRestriction());
		g2 = createEGenericType(theBasePackage.getBFloat());
		g1.getETypeArguments().add(g2);
		pFloatRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPNumberRestriction());
		g2 = createEGenericType(theBasePackage.getBDouble());
		g1.getETypeArguments().add(g2);
		pDoubleRestrictionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPNumberRestriction());
		g2 = createEGenericType(ecorePackage.getEDate());
		g1.getETypeArguments().add(g2);
		pDateRestrictionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(pPatternEClass, PPattern.class, "PPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPPattern_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, PPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPPattern_InstIdx(), ecorePackage.getEInt(), "instIdx", "-1", 0, 1, PPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPPattern_Quantor(), this.getPQuantorEnum(), "quantor", null, 0, 1, PPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPPattern__Matches__Object(), ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPPattern__CreateSkeleton(), ecorePackage.getEObject(), "createSkeleton", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPPattern__Unify__PPattern(), this.getPPattern(), "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPPattern(), "ppatt", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pObjectEClass, PObject.class, "PObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPObject_Type(), ecorePackage.getEClass(), null, "type", null, 1, 1, PObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPObject_Slot(), this.getPSlot(), null, "slot", null, 0, -1, PObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPObject__GetSlot__EStructuralFeature(), this.getPSlot(), "getSlot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPObject__CreateSkeleton(), ecorePackage.getEObject(), "createSkeleton", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPObject__Unify__PPattern(), this.getPPattern(), "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPPattern(), "ppatt", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPObject__Unify__PObject(), this.getPObject(), "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPObject(), "bg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pEmptySlotEClass, PEmptySlot.class, "PEmptySlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pSlotEClass, PSlot.class, "PSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSlot_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, PSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSlot_Range(), this.getPPattern(), null, "range", null, 1, -1, PSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSlot_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, PSlot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPSlot__GetRangeValue(), this.getPValue(), "getRangeValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPSlot__GetRangeValues(), null, "getRangeValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getPValue());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getPSlot__GetRangeObject(), this.getPObject(), "getRangeObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPSlot__GetRangeObjects(), null, "getRangeObjects", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getPObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getPSlot__Unify__PSlot(), this.getPSlot(), "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPSlot(), "bg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pValueEClass, PValue.class, "PValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPValue_Type(), ecorePackage.getEDataType(), null, "type", null, 1, 1, PValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPValue_Restrictions(), this.getPRestrictions(), null, "restrictions", null, 0, 1, PValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPValue__CreateSkeleton(), ecorePackage.getEObject(), "createSkeleton", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPValue__Unify__PPattern(), this.getPPattern(), "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPPattern(), "ppatt", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPValue__Unify__PValue(), this.getPValue(), "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPValue(), "bg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pValueObjectEClass, PValueObject.class, "PValueObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPValueObject_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, PValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pValueGenEClass, PValueGen.class, "PValueGen", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPValueGen__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pRestrictionsEClass, PRestrictions.class, "PRestrictions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getPRestrictions_Restriction(), g1, null, "restriction", null, 0, -1, PRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPRestrictions_Restrictions(), this.getPRestrictions(), null, "restrictions", null, 0, -1, PRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRestrictions_Function(), this.getPRestrictionsEnum(), "function", null, 1, 1, PRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPRestrictions__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal_", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPRestrictions__Unify__PRestrictions(), this.getPRestrictions(), "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPRestrictions(), "bg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pRestrictionEClass, PRestriction.class, "PRestriction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRestriction_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, PRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPRestriction__GetFunction(), null, "getFunction", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(pRestrictionEClass_F);
		initEOperation(op, g1);

		op = initEOperation(getPRestriction__SetFunction__Object(), null, "setFunction", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(pRestrictionEClass_F);
		addEParameter(op, g1, "function", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPRestriction__GetValue(), null, "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(pRestrictionEClass_V);
		initEOperation(op, g1);

		op = initEOperation(getPRestriction__SetValue__Object(), null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(pRestrictionEClass_V);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPRestriction__Unify__PRestriction(), null, "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bg", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(pBooleanRestrictionEClass, PBooleanRestriction.class, "PBooleanRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPBooleanRestriction_Value(), theBasePackage.getBBoolean(), "value", null, 0, 1, PBooleanRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPBooleanRestriction_Function(), this.getPBooleanRestrictionEnum(), "function", null, 1, 1, PBooleanRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPBooleanRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value_", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPBooleanRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pEnumRestrictionEClass, PEnumRestriction.class, "PEnumRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEnumRestriction_Function(), this.getPEnumRestrictionEnum(), "function", null, 1, 1, PEnumRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPEnumRestriction_Value(), ecorePackage.getEEnumLiteral(), null, "value", null, 0, 1, PEnumRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPEnumRestriction_EnumDataType(), ecorePackage.getEEnum(), null, "enumDataType", null, 0, 1, PEnumRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPEnumRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPEnumRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPEnumRestriction__Unify__PRestriction(), null, "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bgrest", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(pCharRestrictionEClass, PCharRestriction.class, "PCharRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCharRestriction_IgnoreCase(), ecorePackage.getEBoolean(), "ignoreCase", "true", 1, 1, PCharRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCharRestriction_Value(), theBasePackage.getBChar(), "value", null, 0, 1, PCharRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCharRestriction_Function(), this.getPCharRestrictionEnum(), "function", null, 1, 1, PCharRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPCharRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPCharRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPCharRestriction__Unify__PRestriction(), null, "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bgrest", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(pStringRestrictionEClass, PStringRestriction.class, "PStringRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPStringRestriction_IgnoreCase(), ecorePackage.getEBoolean(), "ignoreCase", "true", 1, 1, PStringRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPStringRestriction_Value(), theBasePackage.getBString(), "value", null, 0, 1, PStringRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPStringRestriction_Function(), this.getPStringRestrictionEnum(), "function", null, 1, 1, PStringRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPStringRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPStringRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPStringRestriction__Unify__PRestriction(), null, "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bgrest", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(pNumberRestrictionEClass, PNumberRestriction.class, "PNumberRestriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPNumberRestriction_Function(), this.getPNumberRestrictionEnum(), "function", null, 1, 1, PNumberRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPNumberRestriction___compareTo__int_PNumberRestrictionEnum(), ecorePackage.getEBoolean(), "_compareTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "compareToResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPNumberRestrictionEnum(), "function", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pByteRestrictionEClass, PByteRestriction.class, "PByteRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPByteRestriction_Value(), theBasePackage.getBByte(), "value", null, 0, 1, PByteRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPByteRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPByteRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pShortRestrictionEClass, PShortRestriction.class, "PShortRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPShortRestriction_Value(), theBasePackage.getBShort(), "value", null, 0, 1, PShortRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPShortRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPShortRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pIntegerRestrictionEClass, PIntegerRestriction.class, "PIntegerRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPIntegerRestriction_Value(), theBasePackage.getBInteger(), "value", null, 0, 1, PIntegerRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPIntegerRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPIntegerRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPIntegerRestriction__Unify__PRestriction(), null, "unify", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bgrest", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPRestriction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(pLongRestrictionEClass, PLongRestriction.class, "PLongRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPLongRestriction_Value(), theBasePackage.getBLong(), "value", null, 0, 1, PLongRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPLongRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPLongRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pFloatRestrictionEClass, PFloatRestriction.class, "PFloatRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPFloatRestriction_Value(), theBasePackage.getBFloat(), "value", null, 0, 1, PFloatRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPFloatRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPFloatRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pDoubleRestrictionEClass, PDoubleRestriction.class, "PDoubleRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPDoubleRestriction_Value(), theBasePackage.getBDouble(), "value", null, 0, 1, PDoubleRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPDoubleRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPDoubleRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pDateRestrictionEClass, PDateRestriction.class, "PDateRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPDateRestriction_Value(), ecorePackage.getEDate(), "value", null, 0, 1, PDateRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPDateRestriction__IsSatisfiedBy__Object(), ecorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPDateRestriction__GetDefaultValue__Object(), ecorePackage.getEJavaObject(), "getDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "defVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(computationEEnum, Computation.class, "Computation");
		addEEnumLiteral(computationEEnum, Computation.SET);
		addEEnumLiteral(computationEEnum, Computation.OVERLAY);
		addEEnumLiteral(computationEEnum, Computation.UNIFICATION);
		addEEnumLiteral(computationEEnum, Computation.RESTRICTED_UNIFICATION);
		addEEnumLiteral(computationEEnum, Computation.ADD);

		initEEnum(pBooleanRestrictionEnumEEnum, PBooleanRestrictionEnum.class, "PBooleanRestrictionEnum");
		addEEnumLiteral(pBooleanRestrictionEnumEEnum, PBooleanRestrictionEnum.EQUALS);
		addEEnumLiteral(pBooleanRestrictionEnumEEnum, PBooleanRestrictionEnum.NOT_EQUALS);

		initEEnum(pNumberRestrictionEnumEEnum, PNumberRestrictionEnum.class, "PNumberRestrictionEnum");
		addEEnumLiteral(pNumberRestrictionEnumEEnum, PNumberRestrictionEnum.EQUALS);
		addEEnumLiteral(pNumberRestrictionEnumEEnum, PNumberRestrictionEnum.NOT_EQUALS);
		addEEnumLiteral(pNumberRestrictionEnumEEnum, PNumberRestrictionEnum.GREATER_THAN);
		addEEnumLiteral(pNumberRestrictionEnumEEnum, PNumberRestrictionEnum.GREATER_EQUALS);
		addEEnumLiteral(pNumberRestrictionEnumEEnum, PNumberRestrictionEnum.LESS_EQUALS);
		addEEnumLiteral(pNumberRestrictionEnumEEnum, PNumberRestrictionEnum.LESS_THAN);

		initEEnum(pEnumRestrictionEnumEEnum, PEnumRestrictionEnum.class, "PEnumRestrictionEnum");
		addEEnumLiteral(pEnumRestrictionEnumEEnum, PEnumRestrictionEnum.EQUALS);
		addEEnumLiteral(pEnumRestrictionEnumEEnum, PEnumRestrictionEnum.NOT_EQUALS);

		initEEnum(pEnumRestrictionTypeEEnum, PEnumRestrictionType.class, "PEnumRestrictionType");
		addEEnumLiteral(pEnumRestrictionTypeEEnum, PEnumRestrictionType.VALUE);
		addEEnumLiteral(pEnumRestrictionTypeEEnum, PEnumRestrictionType.LITERAL);
		addEEnumLiteral(pEnumRestrictionTypeEEnum, PEnumRestrictionType.NAME);
		addEEnumLiteral(pEnumRestrictionTypeEEnum, PEnumRestrictionType.INSTANCE);

		initEEnum(pStringRestrictionEnumEEnum, PStringRestrictionEnum.class, "PStringRestrictionEnum");
		addEEnumLiteral(pStringRestrictionEnumEEnum, PStringRestrictionEnum.EQUALS);
		addEEnumLiteral(pStringRestrictionEnumEEnum, PStringRestrictionEnum.NOT_EQUALS);
		addEEnumLiteral(pStringRestrictionEnumEEnum, PStringRestrictionEnum.STARTS_WITH);
		addEEnumLiteral(pStringRestrictionEnumEEnum, PStringRestrictionEnum.ENDS_WITH);
		addEEnumLiteral(pStringRestrictionEnumEEnum, PStringRestrictionEnum.CONTAINS);
		addEEnumLiteral(pStringRestrictionEnumEEnum, PStringRestrictionEnum.MATCHES);

		initEEnum(pCharRestrictionEnumEEnum, PCharRestrictionEnum.class, "PCharRestrictionEnum");
		addEEnumLiteral(pCharRestrictionEnumEEnum, PCharRestrictionEnum.EQUALS);
		addEEnumLiteral(pCharRestrictionEnumEEnum, PCharRestrictionEnum.NOT_EQUALS);

		initEEnum(pRestrictionsEnumEEnum, PRestrictionsEnum.class, "PRestrictionsEnum");
		addEEnumLiteral(pRestrictionsEnumEEnum, PRestrictionsEnum.AND);
		addEEnumLiteral(pRestrictionsEnumEEnum, PRestrictionsEnum.OR);

		initEEnum(pQuantorEnumEEnum, PQuantorEnum.class, "PQuantorEnum");
		addEEnumLiteral(pQuantorEnumEEnum, PQuantorEnum.EXISTS);
		addEEnumLiteral(pQuantorEnumEEnum, PQuantorEnum.NOT_EXISTS);
		addEEnumLiteral(pQuantorEnumEEnum, PQuantorEnum.FOR_ALL);

		// Initialize data types
		initEDataType(peObjectArrayEDataType, Object[].class, "PEObjectArray", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://de.dfki.iui.mmds/CoreModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCoreModelAnnotations() {
		String source = "http://de.dfki.iui.mmds/CoreModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

} //PatternPackageImpl
