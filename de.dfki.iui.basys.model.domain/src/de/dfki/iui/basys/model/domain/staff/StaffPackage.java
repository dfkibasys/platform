/**
 */
package de.dfki.iui.basys.model.domain.staff;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.dfki.iui.basys.model.domain.staff.StaffFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface StaffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "staff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/staff";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "staff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaffPackage eINSTANCE = de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.staff.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffImpl
	 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__FIRSTNAME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__LASTNAME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__BIRTHDATE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__LANGUAGE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.staff.impl.StaffRecognitionImpl <em>Recognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffRecognitionImpl
	 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getStaffRecognition()
	 * @generated
	 */
	int STAFF_RECOGNITION = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION__TYPE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worker Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION__WORKER_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION__COMPONENT_ID = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.staff.impl.StaffSkillsImpl <em>Skills</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffSkillsImpl
	 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getStaffSkills()
	 * @generated
	 */
	int STAFF_SKILLS = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Worker Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__WORKER_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__SKILLS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skills</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Skills</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.staff.impl.StaffSkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffSkillImpl
	 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getStaffSkill()
	 * @generated
	 */
	int STAFF_SKILL = 3;

	/**
	 * The feature id for the '<em><b>Workstep Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILL__WORKSTEP_ID = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILL__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Preference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILL__PREFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.staff.StaffRecognitionEnum <em>Recognition Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.staff.StaffRecognitionEnum
	 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getStaffRecognitionEnum()
	 * @generated
	 */
	int STAFF_RECOGNITION_ENUM = 4;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.staff.PreferenceEnum <em>Preference Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.staff.PreferenceEnum
	 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getPreferenceEnum()
	 * @generated
	 */
	int PREFERENCE_ENUM = 5;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.staff.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.Staff#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.Staff#getFirstname()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.Staff#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.Staff#getLastname()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.Staff#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.Staff#getBirthdate()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.Staff#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.Staff#getLanguage()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Language();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.staff.StaffRecognition <em>Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recognition</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffRecognition
	 * @generated
	 */
	EClass getStaffRecognition();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.StaffRecognition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffRecognition#getType()
	 * @see #getStaffRecognition()
	 * @generated
	 */
	EAttribute getStaffRecognition_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.StaffRecognition#getWorkerId <em>Worker Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffRecognition#getWorkerId()
	 * @see #getStaffRecognition()
	 * @generated
	 */
	EAttribute getStaffRecognition_WorkerId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.StaffRecognition#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffRecognition#getComponentId()
	 * @see #getStaffRecognition()
	 * @generated
	 */
	EAttribute getStaffRecognition_ComponentId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.staff.StaffSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skills</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffSkills
	 * @generated
	 */
	EClass getStaffSkills();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.StaffSkills#getWorkerId <em>Worker Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffSkills#getWorkerId()
	 * @see #getStaffSkills()
	 * @generated
	 */
	EAttribute getStaffSkills_WorkerId();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.staff.StaffSkills#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffSkills#getSkills()
	 * @see #getStaffSkills()
	 * @generated
	 */
	EReference getStaffSkills_Skills();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.staff.StaffSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffSkill
	 * @generated
	 */
	EClass getStaffSkill();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.StaffSkill#getWorkstepId <em>Workstep Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffSkill#getWorkstepId()
	 * @see #getStaffSkill()
	 * @generated
	 */
	EAttribute getStaffSkill_WorkstepId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.StaffSkill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffSkill#getLevel()
	 * @see #getStaffSkill()
	 * @generated
	 */
	EAttribute getStaffSkill_Level();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.staff.StaffSkill#getPreference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preference</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffSkill#getPreference()
	 * @see #getStaffSkill()
	 * @generated
	 */
	EAttribute getStaffSkill_Preference();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.staff.StaffRecognitionEnum <em>Recognition Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recognition Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.StaffRecognitionEnum
	 * @generated
	 */
	EEnum getStaffRecognitionEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.staff.PreferenceEnum <em>Preference Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Preference Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.staff.PreferenceEnum
	 * @generated
	 */
	EEnum getPreferenceEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StaffFactory getStaffFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.staff.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffImpl
		 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__FIRSTNAME = eINSTANCE.getStaff_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__LASTNAME = eINSTANCE.getStaff_Lastname();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__BIRTHDATE = eINSTANCE.getStaff_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__LANGUAGE = eINSTANCE.getStaff_Language();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.staff.impl.StaffRecognitionImpl <em>Recognition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffRecognitionImpl
		 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getStaffRecognition()
		 * @generated
		 */
		EClass STAFF_RECOGNITION = eINSTANCE.getStaffRecognition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_RECOGNITION__TYPE = eINSTANCE.getStaffRecognition_Type();

		/**
		 * The meta object literal for the '<em><b>Worker Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_RECOGNITION__WORKER_ID = eINSTANCE.getStaffRecognition_WorkerId();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_RECOGNITION__COMPONENT_ID = eINSTANCE.getStaffRecognition_ComponentId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.staff.impl.StaffSkillsImpl <em>Skills</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffSkillsImpl
		 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getStaffSkills()
		 * @generated
		 */
		EClass STAFF_SKILLS = eINSTANCE.getStaffSkills();

		/**
		 * The meta object literal for the '<em><b>Worker Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_SKILLS__WORKER_ID = eINSTANCE.getStaffSkills_WorkerId();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SKILLS__SKILLS = eINSTANCE.getStaffSkills_Skills();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.staff.impl.StaffSkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffSkillImpl
		 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getStaffSkill()
		 * @generated
		 */
		EClass STAFF_SKILL = eINSTANCE.getStaffSkill();

		/**
		 * The meta object literal for the '<em><b>Workstep Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_SKILL__WORKSTEP_ID = eINSTANCE.getStaffSkill_WorkstepId();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_SKILL__LEVEL = eINSTANCE.getStaffSkill_Level();

		/**
		 * The meta object literal for the '<em><b>Preference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_SKILL__PREFERENCE = eINSTANCE.getStaffSkill_Preference();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.staff.StaffRecognitionEnum <em>Recognition Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.staff.StaffRecognitionEnum
		 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getStaffRecognitionEnum()
		 * @generated
		 */
		EEnum STAFF_RECOGNITION_ENUM = eINSTANCE.getStaffRecognitionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.staff.PreferenceEnum <em>Preference Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.staff.PreferenceEnum
		 * @see de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl#getPreferenceEnum()
		 * @generated
		 */
		EEnum PREFERENCE_ENUM = eINSTANCE.getPreferenceEnum();

	}

} //StaffPackage
