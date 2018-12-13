/**
 */
package de.dfki.cos.basys.platform.model.pattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.pattern.PatternFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pattern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/pattern";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pattern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternPackage eINSTANCE = de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PPatternImpl <em>PPattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PPatternImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPPattern()
	 * @generated
	 */
	int PPATTERN = 0;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__VAR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Inst Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__INST_IDX = 1;

	/**
	 * The feature id for the '<em><b>Quantor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__QUANTOR = 2;

	/**
	 * The number of structural features of the '<em>PPattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN___MATCHES__OBJECT = 0;

	/**
	 * The operation id for the '<em>Create Skeleton</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN___CREATE_SKELETON = 1;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN___UNIFY__PPATTERN = 2;

	/**
	 * The number of operations of the '<em>PPattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PEmptySlotImpl <em>PEmpty Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PEmptySlotImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPEmptySlot()
	 * @generated
	 */
	int PEMPTY_SLOT = 2;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PObjectImpl <em>PObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PObjectImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPObject()
	 * @generated
	 */
	int POBJECT = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__VAR_NAME = PPATTERN__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Inst Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__INST_IDX = PPATTERN__INST_IDX;

	/**
	 * The feature id for the '<em><b>Quantor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__QUANTOR = PPATTERN__QUANTOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__TYPE = PPATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT__SLOT = PPATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT_FEATURE_COUNT = PPATTERN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT___MATCHES__OBJECT = PPATTERN___MATCHES__OBJECT;

	/**
	 * The operation id for the '<em>Get Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT___GET_SLOT__ESTRUCTURALFEATURE = PPATTERN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Skeleton</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT___CREATE_SKELETON = PPATTERN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT___UNIFY__PPATTERN = PPATTERN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT___UNIFY__POBJECT = PPATTERN_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>PObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT_OPERATION_COUNT = PPATTERN_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEMPTY_SLOT__VAR_NAME = PPATTERN__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Inst Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEMPTY_SLOT__INST_IDX = PPATTERN__INST_IDX;

	/**
	 * The feature id for the '<em><b>Quantor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEMPTY_SLOT__QUANTOR = PPATTERN__QUANTOR;

	/**
	 * The number of structural features of the '<em>PEmpty Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEMPTY_SLOT_FEATURE_COUNT = PPATTERN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEMPTY_SLOT___MATCHES__OBJECT = PPATTERN___MATCHES__OBJECT;

	/**
	 * The operation id for the '<em>Create Skeleton</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEMPTY_SLOT___CREATE_SKELETON = PPATTERN___CREATE_SKELETON;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEMPTY_SLOT___UNIFY__PPATTERN = PPATTERN___UNIFY__PPATTERN;

	/**
	 * The number of operations of the '<em>PEmpty Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEMPTY_SLOT_OPERATION_COUNT = PPATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PSlotImpl <em>PSlot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PSlotImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPSlot()
	 * @generated
	 */
	int PSLOT = 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSLOT__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSLOT__RANGE = 1;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSLOT__FEATURE_NAME = 2;

	/**
	 * The number of structural features of the '<em>PSlot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSLOT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Range Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSLOT___GET_RANGE_VALUE = 0;

	/**
	 * The operation id for the '<em>Get Range Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSLOT___GET_RANGE_VALUES = 1;

	/**
	 * The operation id for the '<em>Get Range Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSLOT___GET_RANGE_OBJECT = 2;

	/**
	 * The operation id for the '<em>Get Range Objects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSLOT___GET_RANGE_OBJECTS = 3;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSLOT___UNIFY__PSLOT = 4;

	/**
	 * The number of operations of the '<em>PSlot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSLOT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PValueImpl <em>PValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PValueImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPValue()
	 * @generated
	 */
	int PVALUE = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE__VAR_NAME = PPATTERN__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Inst Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE__INST_IDX = PPATTERN__INST_IDX;

	/**
	 * The feature id for the '<em><b>Quantor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE__QUANTOR = PPATTERN__QUANTOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE__TYPE = PPATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE__RESTRICTIONS = PPATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FEATURE_COUNT = PPATTERN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE___MATCHES__OBJECT = PPATTERN___MATCHES__OBJECT;

	/**
	 * The operation id for the '<em>Create Skeleton</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE___CREATE_SKELETON = PPATTERN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE___UNIFY__PPATTERN = PPATTERN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE___UNIFY__PVALUE = PPATTERN_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>PValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_OPERATION_COUNT = PPATTERN_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PValueObjectImpl <em>PValue Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PValueObjectImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPValueObject()
	 * @generated
	 */
	int PVALUE_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_OBJECT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>PValue Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PValue Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.PValueGen <em>PValue Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.PValueGen
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPValueGen()
	 * @generated
	 */
	int PVALUE_GEN = 6;

	/**
	 * The number of structural features of the '<em>PValue Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_GEN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_GEN___GET_DEFAULT_VALUE__OBJECT = 0;

	/**
	 * The number of operations of the '<em>PValue Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_GEN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PRestrictionsImpl <em>PRestrictions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PRestrictionsImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPRestrictions()
	 * @generated
	 */
	int PRESTRICTIONS = 7;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTIONS__RESTRICTION = PVALUE_GEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTIONS__RESTRICTIONS = PVALUE_GEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTIONS__FUNCTION = PVALUE_GEN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PRestrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTIONS_FEATURE_COUNT = PVALUE_GEN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTIONS___GET_DEFAULT_VALUE__OBJECT = PVALUE_GEN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTIONS___UNIFY__PRESTRICTIONS = PVALUE_GEN_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>PRestrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTIONS_OPERATION_COUNT = PVALUE_GEN_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction <em>PRestriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPRestriction()
	 * @generated
	 */
	int PRESTRICTION = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTION__EXPRESSION = PVALUE_GEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PRestriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTION_FEATURE_COUNT = PVALUE_GEN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTION___GET_DEFAULT_VALUE__OBJECT = PVALUE_GEN___GET_DEFAULT_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTION___IS_SATISFIED_BY__OBJECT = PVALUE_GEN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTION___GET_FUNCTION = PVALUE_GEN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTION___SET_FUNCTION__OBJECT = PVALUE_GEN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTION___GET_VALUE = PVALUE_GEN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTION___SET_VALUE__OBJECT = PVALUE_GEN_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTION___UNIFY__PRESTRICTION = PVALUE_GEN_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>PRestriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESTRICTION_OPERATION_COUNT = PVALUE_GEN_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PBooleanRestrictionImpl <em>PBoolean Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PBooleanRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPBooleanRestriction()
	 * @generated
	 */
	int PBOOLEAN_RESTRICTION = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION__EXPRESSION = PRESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION__VALUE = PRESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION__FUNCTION = PRESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PBoolean Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION_FEATURE_COUNT = PRESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION___GET_FUNCTION = PRESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION___SET_FUNCTION__OBJECT = PRESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION___GET_VALUE = PRESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION___SET_VALUE__OBJECT = PRESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION___UNIFY__PRESTRICTION = PRESTRICTION___UNIFY__PRESTRICTION;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION___IS_SATISFIED_BY__OBJECT = PRESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PRESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>PBoolean Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_RESTRICTION_OPERATION_COUNT = PRESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PEnumRestrictionImpl <em>PEnum Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PEnumRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPEnumRestriction()
	 * @generated
	 */
	int PENUM_RESTRICTION = 10;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION__EXPRESSION = PRESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION__FUNCTION = PRESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION__VALUE = PRESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enum Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION__ENUM_DATA_TYPE = PRESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PEnum Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION_FEATURE_COUNT = PRESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION___GET_FUNCTION = PRESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION___SET_FUNCTION__OBJECT = PRESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION___GET_VALUE = PRESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION___SET_VALUE__OBJECT = PRESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION___IS_SATISFIED_BY__OBJECT = PRESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PRESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION___UNIFY__PRESTRICTION = PRESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>PEnum Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_RESTRICTION_OPERATION_COUNT = PRESTRICTION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PCharRestrictionImpl <em>PChar Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PCharRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPCharRestriction()
	 * @generated
	 */
	int PCHAR_RESTRICTION = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION__EXPRESSION = PRESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION__IGNORE_CASE = PRESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION__VALUE = PRESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION__FUNCTION = PRESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PChar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION_FEATURE_COUNT = PRESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION___GET_FUNCTION = PRESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION___SET_FUNCTION__OBJECT = PRESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION___GET_VALUE = PRESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION___SET_VALUE__OBJECT = PRESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION___IS_SATISFIED_BY__OBJECT = PRESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PRESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION___UNIFY__PRESTRICTION = PRESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>PChar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCHAR_RESTRICTION_OPERATION_COUNT = PRESTRICTION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PStringRestrictionImpl <em>PString Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PStringRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPStringRestriction()
	 * @generated
	 */
	int PSTRING_RESTRICTION = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION__EXPRESSION = PRESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION__IGNORE_CASE = PRESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION__VALUE = PRESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION__FUNCTION = PRESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PString Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION_FEATURE_COUNT = PRESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION___GET_FUNCTION = PRESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION___SET_FUNCTION__OBJECT = PRESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION___GET_VALUE = PRESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION___SET_VALUE__OBJECT = PRESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION___IS_SATISFIED_BY__OBJECT = PRESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PRESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION___UNIFY__PRESTRICTION = PRESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>PString Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_RESTRICTION_OPERATION_COUNT = PRESTRICTION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PNumberRestrictionImpl <em>PNumber Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PNumberRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPNumberRestriction()
	 * @generated
	 */
	int PNUMBER_RESTRICTION = 13;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION__EXPRESSION = PRESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION__FUNCTION = PRESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PNumber Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION_FEATURE_COUNT = PRESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PRESTRICTION___GET_DEFAULT_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION___IS_SATISFIED_BY__OBJECT = PRESTRICTION___IS_SATISFIED_BY__OBJECT;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION___GET_FUNCTION = PRESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION___SET_FUNCTION__OBJECT = PRESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION___GET_VALUE = PRESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION___SET_VALUE__OBJECT = PRESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION___UNIFY__PRESTRICTION = PRESTRICTION___UNIFY__PRESTRICTION;

	/**
	 * The operation id for the '<em>compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM = PRESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>PNumber Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNUMBER_RESTRICTION_OPERATION_COUNT = PRESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PByteRestrictionImpl <em>PByte Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PByteRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPByteRestriction()
	 * @generated
	 */
	int PBYTE_RESTRICTION = 14;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION__EXPRESSION = PNUMBER_RESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION__FUNCTION = PNUMBER_RESTRICTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION__VALUE = PNUMBER_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PByte Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION_FEATURE_COUNT = PNUMBER_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION___GET_FUNCTION = PNUMBER_RESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION___SET_FUNCTION__OBJECT = PNUMBER_RESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION___GET_VALUE = PNUMBER_RESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION___SET_VALUE__OBJECT = PNUMBER_RESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION___UNIFY__PRESTRICTION = PNUMBER_RESTRICTION___UNIFY__PRESTRICTION;

	/**
	 * The operation id for the '<em>compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM = PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION___IS_SATISFIED_BY__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>PByte Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBYTE_RESTRICTION_OPERATION_COUNT = PNUMBER_RESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PShortRestrictionImpl <em>PShort Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PShortRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPShortRestriction()
	 * @generated
	 */
	int PSHORT_RESTRICTION = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION__EXPRESSION = PNUMBER_RESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION__FUNCTION = PNUMBER_RESTRICTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION__VALUE = PNUMBER_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PShort Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION_FEATURE_COUNT = PNUMBER_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION___GET_FUNCTION = PNUMBER_RESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION___SET_FUNCTION__OBJECT = PNUMBER_RESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION___GET_VALUE = PNUMBER_RESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION___SET_VALUE__OBJECT = PNUMBER_RESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION___UNIFY__PRESTRICTION = PNUMBER_RESTRICTION___UNIFY__PRESTRICTION;

	/**
	 * The operation id for the '<em>compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM = PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION___IS_SATISFIED_BY__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>PShort Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSHORT_RESTRICTION_OPERATION_COUNT = PNUMBER_RESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PIntegerRestrictionImpl <em>PInteger Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PIntegerRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPIntegerRestriction()
	 * @generated
	 */
	int PINTEGER_RESTRICTION = 16;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION__EXPRESSION = PNUMBER_RESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION__FUNCTION = PNUMBER_RESTRICTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION__VALUE = PNUMBER_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PInteger Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION_FEATURE_COUNT = PNUMBER_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION___GET_FUNCTION = PNUMBER_RESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION___SET_FUNCTION__OBJECT = PNUMBER_RESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION___GET_VALUE = PNUMBER_RESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION___SET_VALUE__OBJECT = PNUMBER_RESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM = PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION___IS_SATISFIED_BY__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION___UNIFY__PRESTRICTION = PNUMBER_RESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>PInteger Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTEGER_RESTRICTION_OPERATION_COUNT = PNUMBER_RESTRICTION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PLongRestrictionImpl <em>PLong Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PLongRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPLongRestriction()
	 * @generated
	 */
	int PLONG_RESTRICTION = 17;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION__EXPRESSION = PNUMBER_RESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION__FUNCTION = PNUMBER_RESTRICTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION__VALUE = PNUMBER_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PLong Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION_FEATURE_COUNT = PNUMBER_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION___GET_FUNCTION = PNUMBER_RESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION___SET_FUNCTION__OBJECT = PNUMBER_RESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION___GET_VALUE = PNUMBER_RESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION___SET_VALUE__OBJECT = PNUMBER_RESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION___UNIFY__PRESTRICTION = PNUMBER_RESTRICTION___UNIFY__PRESTRICTION;

	/**
	 * The operation id for the '<em>compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM = PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION___IS_SATISFIED_BY__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>PLong Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_RESTRICTION_OPERATION_COUNT = PNUMBER_RESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PFloatRestrictionImpl <em>PFloat Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PFloatRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPFloatRestriction()
	 * @generated
	 */
	int PFLOAT_RESTRICTION = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION__EXPRESSION = PNUMBER_RESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION__FUNCTION = PNUMBER_RESTRICTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION__VALUE = PNUMBER_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PFloat Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION_FEATURE_COUNT = PNUMBER_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION___GET_FUNCTION = PNUMBER_RESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION___SET_FUNCTION__OBJECT = PNUMBER_RESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION___GET_VALUE = PNUMBER_RESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION___SET_VALUE__OBJECT = PNUMBER_RESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION___UNIFY__PRESTRICTION = PNUMBER_RESTRICTION___UNIFY__PRESTRICTION;

	/**
	 * The operation id for the '<em>compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM = PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION___IS_SATISFIED_BY__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>PFloat Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_RESTRICTION_OPERATION_COUNT = PNUMBER_RESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PDoubleRestrictionImpl <em>PDouble Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PDoubleRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPDoubleRestriction()
	 * @generated
	 */
	int PDOUBLE_RESTRICTION = 19;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION__EXPRESSION = PNUMBER_RESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION__FUNCTION = PNUMBER_RESTRICTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION__VALUE = PNUMBER_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PDouble Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION_FEATURE_COUNT = PNUMBER_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION___GET_FUNCTION = PNUMBER_RESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION___SET_FUNCTION__OBJECT = PNUMBER_RESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION___GET_VALUE = PNUMBER_RESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION___SET_VALUE__OBJECT = PNUMBER_RESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION___UNIFY__PRESTRICTION = PNUMBER_RESTRICTION___UNIFY__PRESTRICTION;

	/**
	 * The operation id for the '<em>compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM = PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION___IS_SATISFIED_BY__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>PDouble Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_RESTRICTION_OPERATION_COUNT = PNUMBER_RESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PDateRestrictionImpl <em>PDate Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PDateRestrictionImpl
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPDateRestriction()
	 * @generated
	 */
	int PDATE_RESTRICTION = 20;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION__EXPRESSION = PNUMBER_RESTRICTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION__FUNCTION = PNUMBER_RESTRICTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION__VALUE = PNUMBER_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PDate Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION_FEATURE_COUNT = PNUMBER_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION___GET_FUNCTION = PNUMBER_RESTRICTION___GET_FUNCTION;

	/**
	 * The operation id for the '<em>Set Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION___SET_FUNCTION__OBJECT = PNUMBER_RESTRICTION___SET_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION___GET_VALUE = PNUMBER_RESTRICTION___GET_VALUE;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION___SET_VALUE__OBJECT = PNUMBER_RESTRICTION___SET_VALUE__OBJECT;

	/**
	 * The operation id for the '<em>Unify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION___UNIFY__PRESTRICTION = PNUMBER_RESTRICTION___UNIFY__PRESTRICTION;

	/**
	 * The operation id for the '<em>compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM = PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM;

	/**
	 * The operation id for the '<em>Is Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION___IS_SATISFIED_BY__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = PNUMBER_RESTRICTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>PDate Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDATE_RESTRICTION_OPERATION_COUNT = PNUMBER_RESTRICTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.Computation <em>Computation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.Computation
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getComputation()
	 * @generated
	 */
	int COMPUTATION = 21;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum <em>PBoolean Restriction Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPBooleanRestrictionEnum()
	 * @generated
	 */
	int PBOOLEAN_RESTRICTION_ENUM = 22;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.PNumberRestrictionEnum <em>PNumber Restriction Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.PNumberRestrictionEnum
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPNumberRestrictionEnum()
	 * @generated
	 */
	int PNUMBER_RESTRICTION_ENUM = 23;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionEnum <em>PEnum Restriction Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionEnum
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPEnumRestrictionEnum()
	 * @generated
	 */
	int PENUM_RESTRICTION_ENUM = 24;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionType <em>PEnum Restriction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionType
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPEnumRestrictionType()
	 * @generated
	 */
	int PENUM_RESTRICTION_TYPE = 25;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestrictionEnum <em>PString Restriction Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestrictionEnum
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPStringRestrictionEnum()
	 * @generated
	 */
	int PSTRING_RESTRICTION_ENUM = 26;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestrictionEnum <em>PChar Restriction Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestrictionEnum
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPCharRestrictionEnum()
	 * @generated
	 */
	int PCHAR_RESTRICTION_ENUM = 27;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictionsEnum <em>PRestrictions Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictionsEnum
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPRestrictionsEnum()
	 * @generated
	 */
	int PRESTRICTIONS_ENUM = 28;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.pattern.PQuantorEnum <em>PQuantor Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.PQuantorEnum
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPQuantorEnum()
	 * @generated
	 */
	int PQUANTOR_ENUM = 29;

	/**
	 * The meta object id for the '<em>PE Object Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPEObjectArray()
	 * @generated
	 */
	int PE_OBJECT_ARRAY = 30;


	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PEmptySlot <em>PEmpty Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PEmpty Slot</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEmptySlot
	 * @generated
	 */
	EClass getPEmptySlot();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PObject <em>PObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PObject</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PObject
	 * @generated
	 */
	EClass getPObject();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.pattern.PObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PObject#getType()
	 * @see #getPObject()
	 * @generated
	 */
	EReference getPObject_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.pattern.PObject#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PObject#getSlot()
	 * @see #getPObject()
	 * @generated
	 */
	EReference getPObject_Slot();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PObject#getSlot(org.eclipse.emf.ecore.EStructuralFeature) <em>Get Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Slot</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PObject#getSlot(org.eclipse.emf.ecore.EStructuralFeature)
	 * @generated
	 */
	EOperation getPObject__GetSlot__EStructuralFeature();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PObject#createSkeleton() <em>Create Skeleton</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Skeleton</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PObject#createSkeleton()
	 * @generated
	 */
	EOperation getPObject__CreateSkeleton();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PObject#unify(de.dfki.cos.basys.platform.model.pattern.PPattern) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PObject#unify(de.dfki.cos.basys.platform.model.pattern.PPattern)
	 * @generated
	 */
	EOperation getPObject__Unify__PPattern();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PObject#unify(de.dfki.cos.basys.platform.model.pattern.PObject) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PObject#unify(de.dfki.cos.basys.platform.model.pattern.PObject)
	 * @generated
	 */
	EOperation getPObject__Unify__PObject();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PSlot <em>PSlot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSlot</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PSlot
	 * @generated
	 */
	EClass getPSlot();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PSlot#getFeature()
	 * @see #getPSlot()
	 * @generated
	 */
	EReference getPSlot_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PSlot#getRange()
	 * @see #getPSlot()
	 * @generated
	 */
	EReference getPSlot_Range();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PSlot#getFeatureName()
	 * @see #getPSlot()
	 * @generated
	 */
	EAttribute getPSlot_FeatureName();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getRangeValue() <em>Get Range Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Range Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PSlot#getRangeValue()
	 * @generated
	 */
	EOperation getPSlot__GetRangeValue();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getRangeValues() <em>Get Range Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Range Values</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PSlot#getRangeValues()
	 * @generated
	 */
	EOperation getPSlot__GetRangeValues();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getRangeObject() <em>Get Range Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Range Object</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PSlot#getRangeObject()
	 * @generated
	 */
	EOperation getPSlot__GetRangeObject();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getRangeObjects() <em>Get Range Objects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Range Objects</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PSlot#getRangeObjects()
	 * @generated
	 */
	EOperation getPSlot__GetRangeObjects();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PSlot#unify(de.dfki.cos.basys.platform.model.pattern.PSlot) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PSlot#unify(de.dfki.cos.basys.platform.model.pattern.PSlot)
	 * @generated
	 */
	EOperation getPSlot__Unify__PSlot();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PPattern <em>PPattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPattern</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PPattern
	 * @generated
	 */
	EClass getPPattern();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PPattern#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PPattern#getVarName()
	 * @see #getPPattern()
	 * @generated
	 */
	EAttribute getPPattern_VarName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PPattern#getInstIdx <em>Inst Idx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inst Idx</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PPattern#getInstIdx()
	 * @see #getPPattern()
	 * @generated
	 */
	EAttribute getPPattern_InstIdx();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PPattern#getQuantor <em>Quantor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantor</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PPattern#getQuantor()
	 * @see #getPPattern()
	 * @generated
	 */
	EAttribute getPPattern_Quantor();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PPattern#matches(java.lang.Object) <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matches</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PPattern#matches(java.lang.Object)
	 * @generated
	 */
	EOperation getPPattern__Matches__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PPattern#createSkeleton() <em>Create Skeleton</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Skeleton</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PPattern#createSkeleton()
	 * @generated
	 */
	EOperation getPPattern__CreateSkeleton();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PPattern#unify(de.dfki.cos.basys.platform.model.pattern.PPattern) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PPattern#unify(de.dfki.cos.basys.platform.model.pattern.PPattern)
	 * @generated
	 */
	EOperation getPPattern__Unify__PPattern();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PValue <em>PValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PValue</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValue
	 * @generated
	 */
	EClass getPValue();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.pattern.PValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValue#getType()
	 * @see #getPValue()
	 * @generated
	 */
	EReference getPValue_Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.pattern.PValue#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restrictions</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValue#getRestrictions()
	 * @see #getPValue()
	 * @generated
	 */
	EReference getPValue_Restrictions();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PValue#createSkeleton() <em>Create Skeleton</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Skeleton</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValue#createSkeleton()
	 * @generated
	 */
	EOperation getPValue__CreateSkeleton();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PValue#unify(de.dfki.cos.basys.platform.model.pattern.PPattern) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValue#unify(de.dfki.cos.basys.platform.model.pattern.PPattern)
	 * @generated
	 */
	EOperation getPValue__Unify__PPattern();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PValue#unify(de.dfki.cos.basys.platform.model.pattern.PValue) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValue#unify(de.dfki.cos.basys.platform.model.pattern.PValue)
	 * @generated
	 */
	EOperation getPValue__Unify__PValue();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PValueObject <em>PValue Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PValue Object</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValueObject
	 * @generated
	 */
	EClass getPValueObject();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PValueObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValueObject#getValue()
	 * @see #getPValueObject()
	 * @generated
	 */
	EAttribute getPValueObject_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PValueGen <em>PValue Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PValue Gen</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValueGen
	 * @generated
	 */
	EClass getPValueGen();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PValueGen#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PValueGen#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPValueGen__GetDefaultValue__Object();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions <em>PRestrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRestrictions</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictions
	 * @generated
	 */
	EClass getPRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictions#getRestriction()
	 * @see #getPRestrictions()
	 * @generated
	 */
	EReference getPRestrictions_Restriction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restrictions</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictions#getRestrictions()
	 * @see #getPRestrictions()
	 * @generated
	 */
	EReference getPRestrictions_Restrictions();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictions#getFunction()
	 * @see #getPRestrictions()
	 * @generated
	 */
	EAttribute getPRestrictions_Function();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictions#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPRestrictions__GetDefaultValue__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions#unify(de.dfki.cos.basys.platform.model.pattern.PRestrictions) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictions#unify(de.dfki.cos.basys.platform.model.pattern.PRestrictions)
	 * @generated
	 */
	EOperation getPRestrictions__Unify__PRestrictions();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction <em>PRestriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRestriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction
	 * @generated
	 */
	EClass getPRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction#getExpression()
	 * @see #getPRestriction()
	 * @generated
	 */
	EAttribute getPRestriction_Expression();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction#getFunction() <em>Get Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Function</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction#getFunction()
	 * @generated
	 */
	EOperation getPRestriction__GetFunction();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction#setFunction(java.lang.Object) <em>Set Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Function</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction#setFunction(java.lang.Object)
	 * @generated
	 */
	EOperation getPRestriction__SetFunction__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction#getValue()
	 * @generated
	 */
	EOperation getPRestriction__GetValue();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction#setValue(java.lang.Object) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction#setValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPRestriction__SetValue__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction#unify(de.dfki.cos.basys.platform.model.pattern.PRestriction) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction#unify(de.dfki.cos.basys.platform.model.pattern.PRestriction)
	 * @generated
	 */
	EOperation getPRestriction__Unify__PRestriction();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction <em>PBoolean Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PBoolean Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction
	 * @generated
	 */
	EClass getPBooleanRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#getValue()
	 * @see #getPBooleanRestriction()
	 * @generated
	 */
	EAttribute getPBooleanRestriction_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#getFunction()
	 * @see #getPBooleanRestriction()
	 * @generated
	 */
	EAttribute getPBooleanRestriction_Function();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPBooleanRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPBooleanRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestriction <em>PEnum Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PEnum Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestriction
	 * @generated
	 */
	EClass getPEnumRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#getFunction()
	 * @see #getPEnumRestriction()
	 * @generated
	 */
	EAttribute getPEnumRestriction_Function();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#getValue()
	 * @see #getPEnumRestriction()
	 * @generated
	 */
	EReference getPEnumRestriction_Value();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#getEnumDataType <em>Enum Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Data Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#getEnumDataType()
	 * @see #getPEnumRestriction()
	 * @generated
	 */
	EReference getPEnumRestriction_EnumDataType();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPEnumRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPEnumRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#unify(de.dfki.cos.basys.platform.model.pattern.PRestriction) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestriction#unify(de.dfki.cos.basys.platform.model.pattern.PRestriction)
	 * @generated
	 */
	EOperation getPEnumRestriction__Unify__PRestriction();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction <em>PChar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PChar Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestriction
	 * @generated
	 */
	EClass getPCharRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestriction#isIgnoreCase()
	 * @see #getPCharRestriction()
	 * @generated
	 */
	EAttribute getPCharRestriction_IgnoreCase();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestriction#getValue()
	 * @see #getPCharRestriction()
	 * @generated
	 */
	EAttribute getPCharRestriction_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestriction#getFunction()
	 * @see #getPCharRestriction()
	 * @generated
	 */
	EAttribute getPCharRestriction_Function();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPCharRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPCharRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#unify(de.dfki.cos.basys.platform.model.pattern.PRestriction) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestriction#unify(de.dfki.cos.basys.platform.model.pattern.PRestriction)
	 * @generated
	 */
	EOperation getPCharRestriction__Unify__PRestriction();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestriction <em>PString Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PString Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestriction
	 * @generated
	 */
	EClass getPStringRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestriction#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestriction#isIgnoreCase()
	 * @see #getPStringRestriction()
	 * @generated
	 */
	EAttribute getPStringRestriction_IgnoreCase();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestriction#getValue()
	 * @see #getPStringRestriction()
	 * @generated
	 */
	EAttribute getPStringRestriction_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestriction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestriction#getFunction()
	 * @see #getPStringRestriction()
	 * @generated
	 */
	EAttribute getPStringRestriction_Function();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPStringRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPStringRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestriction#unify(de.dfki.cos.basys.platform.model.pattern.PRestriction) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestriction#unify(de.dfki.cos.basys.platform.model.pattern.PRestriction)
	 * @generated
	 */
	EOperation getPStringRestriction__Unify__PRestriction();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PNumberRestriction <em>PNumber Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PNumber Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PNumberRestriction
	 * @generated
	 */
	EClass getPNumberRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PNumberRestriction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PNumberRestriction#getFunction()
	 * @see #getPNumberRestriction()
	 * @generated
	 */
	EAttribute getPNumberRestriction_Function();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PNumberRestriction#_compareTo(int, de.dfki.cos.basys.platform.model.pattern.PNumberRestrictionEnum) <em>compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>compare To</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PNumberRestriction#_compareTo(int, de.dfki.cos.basys.platform.model.pattern.PNumberRestrictionEnum)
	 * @generated
	 */
	EOperation getPNumberRestriction___compareTo__int_PNumberRestrictionEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PByteRestriction <em>PByte Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PByte Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PByteRestriction
	 * @generated
	 */
	EClass getPByteRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PByteRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PByteRestriction#getValue()
	 * @see #getPByteRestriction()
	 * @generated
	 */
	EAttribute getPByteRestriction_Value();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PByteRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PByteRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPByteRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PByteRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PByteRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPByteRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PShortRestriction <em>PShort Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PShort Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PShortRestriction
	 * @generated
	 */
	EClass getPShortRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PShortRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PShortRestriction#getValue()
	 * @see #getPShortRestriction()
	 * @generated
	 */
	EAttribute getPShortRestriction_Value();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PShortRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PShortRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPShortRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PShortRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PShortRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPShortRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction <em>PInteger Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PInteger Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction
	 * @generated
	 */
	EClass getPIntegerRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction#getValue()
	 * @see #getPIntegerRestriction()
	 * @generated
	 */
	EAttribute getPIntegerRestriction_Value();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPIntegerRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPIntegerRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction#unify(de.dfki.cos.basys.platform.model.pattern.PRestriction) <em>Unify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unify</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction#unify(de.dfki.cos.basys.platform.model.pattern.PRestriction)
	 * @generated
	 */
	EOperation getPIntegerRestriction__Unify__PRestriction();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PLongRestriction <em>PLong Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PLong Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PLongRestriction
	 * @generated
	 */
	EClass getPLongRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PLongRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PLongRestriction#getValue()
	 * @see #getPLongRestriction()
	 * @generated
	 */
	EAttribute getPLongRestriction_Value();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PLongRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PLongRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPLongRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PLongRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PLongRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPLongRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PFloatRestriction <em>PFloat Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PFloat Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PFloatRestriction
	 * @generated
	 */
	EClass getPFloatRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PFloatRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PFloatRestriction#getValue()
	 * @see #getPFloatRestriction()
	 * @generated
	 */
	EAttribute getPFloatRestriction_Value();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PFloatRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PFloatRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPFloatRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PFloatRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PFloatRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPFloatRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PDoubleRestriction <em>PDouble Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDouble Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PDoubleRestriction
	 * @generated
	 */
	EClass getPDoubleRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PDoubleRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PDoubleRestriction#getValue()
	 * @see #getPDoubleRestriction()
	 * @generated
	 */
	EAttribute getPDoubleRestriction_Value();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PDoubleRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PDoubleRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPDoubleRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PDoubleRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PDoubleRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPDoubleRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.pattern.PDateRestriction <em>PDate Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDate Restriction</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PDateRestriction
	 * @generated
	 */
	EClass getPDateRestriction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.pattern.PDateRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PDateRestriction#getValue()
	 * @see #getPDateRestriction()
	 * @generated
	 */
	EAttribute getPDateRestriction_Value();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PDateRestriction#isSatisfiedBy(java.lang.Object) <em>Is Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfied By</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PDateRestriction#isSatisfiedBy(java.lang.Object)
	 * @generated
	 */
	EOperation getPDateRestriction__IsSatisfiedBy__Object();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.pattern.PDateRestriction#getDefaultValue(java.lang.Object) <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.pattern.PDateRestriction#getDefaultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getPDateRestriction__GetDefaultValue__Object();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.pattern.Computation <em>Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Computation</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.Computation
	 * @generated
	 */
	EEnum getComputation();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum <em>PBoolean Restriction Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PBoolean Restriction Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum
	 * @generated
	 */
	EEnum getPBooleanRestrictionEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.pattern.PNumberRestrictionEnum <em>PNumber Restriction Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PNumber Restriction Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PNumberRestrictionEnum
	 * @generated
	 */
	EEnum getPNumberRestrictionEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionEnum <em>PEnum Restriction Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PEnum Restriction Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionEnum
	 * @generated
	 */
	EEnum getPEnumRestrictionEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionType <em>PEnum Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PEnum Restriction Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionType
	 * @generated
	 */
	EEnum getPEnumRestrictionType();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestrictionEnum <em>PString Restriction Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PString Restriction Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestrictionEnum
	 * @generated
	 */
	EEnum getPStringRestrictionEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestrictionEnum <em>PChar Restriction Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PChar Restriction Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestrictionEnum
	 * @generated
	 */
	EEnum getPCharRestrictionEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictionsEnum <em>PRestrictions Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PRestrictions Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictionsEnum
	 * @generated
	 */
	EEnum getPRestrictionsEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.pattern.PQuantorEnum <em>PQuantor Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PQuantor Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.pattern.PQuantorEnum
	 * @generated
	 */
	EEnum getPQuantorEnum();

	/**
	 * Returns the meta object for data type '<em>PE Object Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>PE Object Array</em>'.
	 * @model instanceClass="java.lang.Object[]" serializeable="false"
	 * @generated
	 */
	EDataType getPEObjectArray();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternFactory getPatternFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PEmptySlotImpl <em>PEmpty Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PEmptySlotImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPEmptySlot()
		 * @generated
		 */
		EClass PEMPTY_SLOT = eINSTANCE.getPEmptySlot();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PObjectImpl <em>PObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PObjectImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPObject()
		 * @generated
		 */
		EClass POBJECT = eINSTANCE.getPObject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POBJECT__TYPE = eINSTANCE.getPObject_Type();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POBJECT__SLOT = eINSTANCE.getPObject_Slot();

		/**
		 * The meta object literal for the '<em><b>Get Slot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POBJECT___GET_SLOT__ESTRUCTURALFEATURE = eINSTANCE.getPObject__GetSlot__EStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Create Skeleton</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POBJECT___CREATE_SKELETON = eINSTANCE.getPObject__CreateSkeleton();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POBJECT___UNIFY__PPATTERN = eINSTANCE.getPObject__Unify__PPattern();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POBJECT___UNIFY__POBJECT = eINSTANCE.getPObject__Unify__PObject();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PSlotImpl <em>PSlot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PSlotImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPSlot()
		 * @generated
		 */
		EClass PSLOT = eINSTANCE.getPSlot();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSLOT__FEATURE = eINSTANCE.getPSlot_Feature();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSLOT__RANGE = eINSTANCE.getPSlot_Range();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSLOT__FEATURE_NAME = eINSTANCE.getPSlot_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Get Range Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSLOT___GET_RANGE_VALUE = eINSTANCE.getPSlot__GetRangeValue();

		/**
		 * The meta object literal for the '<em><b>Get Range Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSLOT___GET_RANGE_VALUES = eINSTANCE.getPSlot__GetRangeValues();

		/**
		 * The meta object literal for the '<em><b>Get Range Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSLOT___GET_RANGE_OBJECT = eINSTANCE.getPSlot__GetRangeObject();

		/**
		 * The meta object literal for the '<em><b>Get Range Objects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSLOT___GET_RANGE_OBJECTS = eINSTANCE.getPSlot__GetRangeObjects();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSLOT___UNIFY__PSLOT = eINSTANCE.getPSlot__Unify__PSlot();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PPatternImpl <em>PPattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PPatternImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPPattern()
		 * @generated
		 */
		EClass PPATTERN = eINSTANCE.getPPattern();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPATTERN__VAR_NAME = eINSTANCE.getPPattern_VarName();

		/**
		 * The meta object literal for the '<em><b>Inst Idx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPATTERN__INST_IDX = eINSTANCE.getPPattern_InstIdx();

		/**
		 * The meta object literal for the '<em><b>Quantor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPATTERN__QUANTOR = eINSTANCE.getPPattern_Quantor();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PPATTERN___MATCHES__OBJECT = eINSTANCE.getPPattern__Matches__Object();

		/**
		 * The meta object literal for the '<em><b>Create Skeleton</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PPATTERN___CREATE_SKELETON = eINSTANCE.getPPattern__CreateSkeleton();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PPATTERN___UNIFY__PPATTERN = eINSTANCE.getPPattern__Unify__PPattern();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PValueImpl <em>PValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PValueImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPValue()
		 * @generated
		 */
		EClass PVALUE = eINSTANCE.getPValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVALUE__TYPE = eINSTANCE.getPValue_Type();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVALUE__RESTRICTIONS = eINSTANCE.getPValue_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Create Skeleton</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVALUE___CREATE_SKELETON = eINSTANCE.getPValue__CreateSkeleton();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVALUE___UNIFY__PPATTERN = eINSTANCE.getPValue__Unify__PPattern();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVALUE___UNIFY__PVALUE = eINSTANCE.getPValue__Unify__PValue();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PValueObjectImpl <em>PValue Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PValueObjectImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPValueObject()
		 * @generated
		 */
		EClass PVALUE_OBJECT = eINSTANCE.getPValueObject();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PVALUE_OBJECT__VALUE = eINSTANCE.getPValueObject_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.PValueGen <em>PValue Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.PValueGen
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPValueGen()
		 * @generated
		 */
		EClass PVALUE_GEN = eINSTANCE.getPValueGen();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVALUE_GEN___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPValueGen__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PRestrictionsImpl <em>PRestrictions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PRestrictionsImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPRestrictions()
		 * @generated
		 */
		EClass PRESTRICTIONS = eINSTANCE.getPRestrictions();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESTRICTIONS__RESTRICTION = eINSTANCE.getPRestrictions_Restriction();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESTRICTIONS__RESTRICTIONS = eINSTANCE.getPRestrictions_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESTRICTIONS__FUNCTION = eINSTANCE.getPRestrictions_Function();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRESTRICTIONS___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPRestrictions__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRESTRICTIONS___UNIFY__PRESTRICTIONS = eINSTANCE.getPRestrictions__Unify__PRestrictions();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestriction <em>PRestriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.PRestriction
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPRestriction()
		 * @generated
		 */
		EClass PRESTRICTION = eINSTANCE.getPRestriction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESTRICTION__EXPRESSION = eINSTANCE.getPRestriction_Expression();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Function</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRESTRICTION___GET_FUNCTION = eINSTANCE.getPRestriction__GetFunction();

		/**
		 * The meta object literal for the '<em><b>Set Function</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRESTRICTION___SET_FUNCTION__OBJECT = eINSTANCE.getPRestriction__SetFunction__Object();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRESTRICTION___GET_VALUE = eINSTANCE.getPRestriction__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRESTRICTION___SET_VALUE__OBJECT = eINSTANCE.getPRestriction__SetValue__Object();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRESTRICTION___UNIFY__PRESTRICTION = eINSTANCE.getPRestriction__Unify__PRestriction();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PBooleanRestrictionImpl <em>PBoolean Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PBooleanRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPBooleanRestriction()
		 * @generated
		 */
		EClass PBOOLEAN_RESTRICTION = eINSTANCE.getPBooleanRestriction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN_RESTRICTION__VALUE = eINSTANCE.getPBooleanRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN_RESTRICTION__FUNCTION = eINSTANCE.getPBooleanRestriction_Function();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PBOOLEAN_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPBooleanRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PBOOLEAN_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPBooleanRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PEnumRestrictionImpl <em>PEnum Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PEnumRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPEnumRestriction()
		 * @generated
		 */
		EClass PENUM_RESTRICTION = eINSTANCE.getPEnumRestriction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENUM_RESTRICTION__FUNCTION = eINSTANCE.getPEnumRestriction_Function();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PENUM_RESTRICTION__VALUE = eINSTANCE.getPEnumRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Enum Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PENUM_RESTRICTION__ENUM_DATA_TYPE = eINSTANCE.getPEnumRestriction_EnumDataType();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PENUM_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPEnumRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PENUM_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPEnumRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PENUM_RESTRICTION___UNIFY__PRESTRICTION = eINSTANCE.getPEnumRestriction__Unify__PRestriction();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PCharRestrictionImpl <em>PChar Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PCharRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPCharRestriction()
		 * @generated
		 */
		EClass PCHAR_RESTRICTION = eINSTANCE.getPCharRestriction();

		/**
		 * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCHAR_RESTRICTION__IGNORE_CASE = eINSTANCE.getPCharRestriction_IgnoreCase();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCHAR_RESTRICTION__VALUE = eINSTANCE.getPCharRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCHAR_RESTRICTION__FUNCTION = eINSTANCE.getPCharRestriction_Function();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCHAR_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPCharRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCHAR_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPCharRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCHAR_RESTRICTION___UNIFY__PRESTRICTION = eINSTANCE.getPCharRestriction__Unify__PRestriction();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PStringRestrictionImpl <em>PString Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PStringRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPStringRestriction()
		 * @generated
		 */
		EClass PSTRING_RESTRICTION = eINSTANCE.getPStringRestriction();

		/**
		 * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSTRING_RESTRICTION__IGNORE_CASE = eINSTANCE.getPStringRestriction_IgnoreCase();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSTRING_RESTRICTION__VALUE = eINSTANCE.getPStringRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSTRING_RESTRICTION__FUNCTION = eINSTANCE.getPStringRestriction_Function();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSTRING_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPStringRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSTRING_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPStringRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSTRING_RESTRICTION___UNIFY__PRESTRICTION = eINSTANCE.getPStringRestriction__Unify__PRestriction();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PNumberRestrictionImpl <em>PNumber Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PNumberRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPNumberRestriction()
		 * @generated
		 */
		EClass PNUMBER_RESTRICTION = eINSTANCE.getPNumberRestriction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNUMBER_RESTRICTION__FUNCTION = eINSTANCE.getPNumberRestriction_Function();

		/**
		 * The meta object literal for the '<em><b>compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM = eINSTANCE.getPNumberRestriction___compareTo__int_PNumberRestrictionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PByteRestrictionImpl <em>PByte Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PByteRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPByteRestriction()
		 * @generated
		 */
		EClass PBYTE_RESTRICTION = eINSTANCE.getPByteRestriction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBYTE_RESTRICTION__VALUE = eINSTANCE.getPByteRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PBYTE_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPByteRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PBYTE_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPByteRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PShortRestrictionImpl <em>PShort Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PShortRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPShortRestriction()
		 * @generated
		 */
		EClass PSHORT_RESTRICTION = eINSTANCE.getPShortRestriction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSHORT_RESTRICTION__VALUE = eINSTANCE.getPShortRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSHORT_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPShortRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSHORT_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPShortRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PIntegerRestrictionImpl <em>PInteger Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PIntegerRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPIntegerRestriction()
		 * @generated
		 */
		EClass PINTEGER_RESTRICTION = eINSTANCE.getPIntegerRestriction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINTEGER_RESTRICTION__VALUE = eINSTANCE.getPIntegerRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PINTEGER_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPIntegerRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PINTEGER_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPIntegerRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '<em><b>Unify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PINTEGER_RESTRICTION___UNIFY__PRESTRICTION = eINSTANCE.getPIntegerRestriction__Unify__PRestriction();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PLongRestrictionImpl <em>PLong Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PLongRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPLongRestriction()
		 * @generated
		 */
		EClass PLONG_RESTRICTION = eINSTANCE.getPLongRestriction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_RESTRICTION__VALUE = eINSTANCE.getPLongRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLONG_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPLongRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLONG_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPLongRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PFloatRestrictionImpl <em>PFloat Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PFloatRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPFloatRestriction()
		 * @generated
		 */
		EClass PFLOAT_RESTRICTION = eINSTANCE.getPFloatRestriction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT_RESTRICTION__VALUE = eINSTANCE.getPFloatRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PFLOAT_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPFloatRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PFLOAT_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPFloatRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PDoubleRestrictionImpl <em>PDouble Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PDoubleRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPDoubleRestriction()
		 * @generated
		 */
		EClass PDOUBLE_RESTRICTION = eINSTANCE.getPDoubleRestriction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE_RESTRICTION__VALUE = eINSTANCE.getPDoubleRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PDOUBLE_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPDoubleRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PDOUBLE_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPDoubleRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.impl.PDateRestrictionImpl <em>PDate Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PDateRestrictionImpl
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPDateRestriction()
		 * @generated
		 */
		EClass PDATE_RESTRICTION = eINSTANCE.getPDateRestriction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDATE_RESTRICTION__VALUE = eINSTANCE.getPDateRestriction_Value();

		/**
		 * The meta object literal for the '<em><b>Is Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PDATE_RESTRICTION___IS_SATISFIED_BY__OBJECT = eINSTANCE.getPDateRestriction__IsSatisfiedBy__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PDATE_RESTRICTION___GET_DEFAULT_VALUE__OBJECT = eINSTANCE.getPDateRestriction__GetDefaultValue__Object();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.Computation <em>Computation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.Computation
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getComputation()
		 * @generated
		 */
		EEnum COMPUTATION = eINSTANCE.getComputation();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum <em>PBoolean Restriction Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPBooleanRestrictionEnum()
		 * @generated
		 */
		EEnum PBOOLEAN_RESTRICTION_ENUM = eINSTANCE.getPBooleanRestrictionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.PNumberRestrictionEnum <em>PNumber Restriction Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.PNumberRestrictionEnum
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPNumberRestrictionEnum()
		 * @generated
		 */
		EEnum PNUMBER_RESTRICTION_ENUM = eINSTANCE.getPNumberRestrictionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionEnum <em>PEnum Restriction Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionEnum
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPEnumRestrictionEnum()
		 * @generated
		 */
		EEnum PENUM_RESTRICTION_ENUM = eINSTANCE.getPEnumRestrictionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionType <em>PEnum Restriction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.PEnumRestrictionType
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPEnumRestrictionType()
		 * @generated
		 */
		EEnum PENUM_RESTRICTION_TYPE = eINSTANCE.getPEnumRestrictionType();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.PStringRestrictionEnum <em>PString Restriction Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.PStringRestrictionEnum
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPStringRestrictionEnum()
		 * @generated
		 */
		EEnum PSTRING_RESTRICTION_ENUM = eINSTANCE.getPStringRestrictionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestrictionEnum <em>PChar Restriction Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestrictionEnum
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPCharRestrictionEnum()
		 * @generated
		 */
		EEnum PCHAR_RESTRICTION_ENUM = eINSTANCE.getPCharRestrictionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictionsEnum <em>PRestrictions Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictionsEnum
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPRestrictionsEnum()
		 * @generated
		 */
		EEnum PRESTRICTIONS_ENUM = eINSTANCE.getPRestrictionsEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.pattern.PQuantorEnum <em>PQuantor Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.PQuantorEnum
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPQuantorEnum()
		 * @generated
		 */
		EEnum PQUANTOR_ENUM = eINSTANCE.getPQuantorEnum();

		/**
		 * The meta object literal for the '<em>PE Object Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.pattern.impl.PatternPackageImpl#getPEObjectArray()
		 * @generated
		 */
		EDataType PE_OBJECT_ARRAY = eINSTANCE.getPEObjectArray();

	}

} //PatternPackage
