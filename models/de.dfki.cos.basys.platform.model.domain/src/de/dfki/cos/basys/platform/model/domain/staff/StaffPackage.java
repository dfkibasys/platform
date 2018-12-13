/**
 */
package de.dfki.cos.basys.platform.model.domain.staff;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dfki.cos.basys.platform.model.base.BasePackage;

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
 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffFactory
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
	StaffPackage eINSTANCE = de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffImpl
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__FIRSTNAME = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__LASTNAME = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__BIRTHDATE = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__LANGUAGE = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.StaffLocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffLocationImpl
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getStaffLocation()
	 * @generated
	 */
	int STAFF_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Detection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION__DETECTION_TYPE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Staffid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION__STAFFID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION__COMPONENT_ID = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.StaffLocationChangeEventImpl <em>Location Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffLocationChangeEventImpl
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getStaffLocationChangeEvent()
	 * @generated
	 */
	int STAFF_LOCATION_CHANGE_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_CHANGE_EVENT__BINDING = STAFF_LOCATION__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_CHANGE_EVENT__ID = STAFF_LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_CHANGE_EVENT__NAME = STAFF_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_CHANGE_EVENT__METADATA = STAFF_LOCATION__METADATA;

	/**
	 * The feature id for the '<em><b>Detection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_CHANGE_EVENT__DETECTION_TYPE = STAFF_LOCATION__DETECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Staffid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_CHANGE_EVENT__STAFFID = STAFF_LOCATION__STAFFID;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_CHANGE_EVENT__COMPONENT_ID = STAFF_LOCATION__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_CHANGE_EVENT__TIMESTAMP = STAFF_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_CHANGE_EVENT_FEATURE_COUNT = STAFF_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Location Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_LOCATION_CHANGE_EVENT_OPERATION_COUNT = STAFF_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.AbilityImpl <em>Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.AbilityImpl
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__KEY = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__VALUE = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.WorkstepSkillImpl <em>Workstep Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.WorkstepSkillImpl
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getWorkstepSkill()
	 * @generated
	 */
	int WORKSTEP_SKILL = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_SKILL__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_SKILL__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_SKILL__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_SKILL__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Workstep Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_SKILL__WORKSTEP_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_SKILL__LEVEL = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Preference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_SKILL__PREFERENCE = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workstep Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_SKILL_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workstep Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_SKILL_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.StaffSkillsImpl <em>Skills</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffSkillsImpl
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getStaffSkills()
	 * @generated
	 */
	int STAFF_SKILLS = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__NAME = BasePackage.ENTITY__NAME;

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
	 * The feature id for the '<em><b>Workstep Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__WORKSTEP_SKILLS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__ABILITIES = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Skills</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Skills</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffDetectionEnum <em>Detection Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffDetectionEnum
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getStaffDetectionEnum()
	 * @generated
	 */
	int STAFF_DETECTION_ENUM = 6;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.staff.WorkstepPreferenceEnum <em>Workstep Preference Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.staff.WorkstepPreferenceEnum
	 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getWorkstepPreferenceEnum()
	 * @generated
	 */
	int WORKSTEP_PREFERENCE_ENUM = 7;


	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.staff.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.Staff#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.Staff#getFirstname()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.Staff#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.Staff#getLastname()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.Staff#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.Staff#getBirthdate()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.Staff#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.Staff#getLanguage()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Language();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffLocation
	 * @generated
	 */
	EClass getStaffLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getDetectionType <em>Detection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detection Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getDetectionType()
	 * @see #getStaffLocation()
	 * @generated
	 */
	EAttribute getStaffLocation_DetectionType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getStaffid <em>Staffid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staffid</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getStaffid()
	 * @see #getStaffLocation()
	 * @generated
	 */
	EAttribute getStaffLocation_Staffid();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getComponentId()
	 * @see #getStaffLocation()
	 * @generated
	 */
	EAttribute getStaffLocation_ComponentId();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocationChangeEvent <em>Location Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Change Event</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffLocationChangeEvent
	 * @generated
	 */
	EClass getStaffLocationChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocationChangeEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffLocationChangeEvent#getTimestamp()
	 * @see #getStaffLocationChangeEvent()
	 * @generated
	 */
	EAttribute getStaffLocationChangeEvent_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.staff.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.Ability
	 * @generated
	 */
	EClass getAbility();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.Ability#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.Ability#getKey()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.Ability#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.Ability#getValue()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.staff.WorkstepSkill <em>Workstep Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstep Skill</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.WorkstepSkill
	 * @generated
	 */
	EClass getWorkstepSkill();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.WorkstepSkill#getWorkstepId <em>Workstep Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.WorkstepSkill#getWorkstepId()
	 * @see #getWorkstepSkill()
	 * @generated
	 */
	EAttribute getWorkstepSkill_WorkstepId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.WorkstepSkill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.WorkstepSkill#getLevel()
	 * @see #getWorkstepSkill()
	 * @generated
	 */
	EAttribute getWorkstepSkill_Level();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.WorkstepSkill#getPreference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preference</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.WorkstepSkill#getPreference()
	 * @see #getWorkstepSkill()
	 * @generated
	 */
	EAttribute getWorkstepSkill_Preference();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skills</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffSkills
	 * @generated
	 */
	EClass getStaffSkills();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffSkills#getWorkerId <em>Worker Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffSkills#getWorkerId()
	 * @see #getStaffSkills()
	 * @generated
	 */
	EAttribute getStaffSkills_WorkerId();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffSkills#getWorkstepSkills <em>Workstep Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workstep Skills</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffSkills#getWorkstepSkills()
	 * @see #getStaffSkills()
	 * @generated
	 */
	EReference getStaffSkills_WorkstepSkills();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffSkills#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abilities</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffSkills#getAbilities()
	 * @see #getStaffSkills()
	 * @generated
	 */
	EReference getStaffSkills_Abilities();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffDetectionEnum <em>Detection Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detection Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffDetectionEnum
	 * @generated
	 */
	EEnum getStaffDetectionEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.domain.staff.WorkstepPreferenceEnum <em>Workstep Preference Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Workstep Preference Enum</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.WorkstepPreferenceEnum
	 * @generated
	 */
	EEnum getWorkstepPreferenceEnum();

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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffImpl
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getStaff()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.StaffLocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffLocationImpl
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getStaffLocation()
		 * @generated
		 */
		EClass STAFF_LOCATION = eINSTANCE.getStaffLocation();

		/**
		 * The meta object literal for the '<em><b>Detection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_LOCATION__DETECTION_TYPE = eINSTANCE.getStaffLocation_DetectionType();

		/**
		 * The meta object literal for the '<em><b>Staffid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_LOCATION__STAFFID = eINSTANCE.getStaffLocation_Staffid();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_LOCATION__COMPONENT_ID = eINSTANCE.getStaffLocation_ComponentId();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.StaffLocationChangeEventImpl <em>Location Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffLocationChangeEventImpl
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getStaffLocationChangeEvent()
		 * @generated
		 */
		EClass STAFF_LOCATION_CHANGE_EVENT = eINSTANCE.getStaffLocationChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_LOCATION_CHANGE_EVENT__TIMESTAMP = eINSTANCE.getStaffLocationChangeEvent_Timestamp();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.AbilityImpl <em>Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.AbilityImpl
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getAbility()
		 * @generated
		 */
		EClass ABILITY = eINSTANCE.getAbility();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__KEY = eINSTANCE.getAbility_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__VALUE = eINSTANCE.getAbility_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.WorkstepSkillImpl <em>Workstep Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.WorkstepSkillImpl
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getWorkstepSkill()
		 * @generated
		 */
		EClass WORKSTEP_SKILL = eINSTANCE.getWorkstepSkill();

		/**
		 * The meta object literal for the '<em><b>Workstep Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_SKILL__WORKSTEP_ID = eINSTANCE.getWorkstepSkill_WorkstepId();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_SKILL__LEVEL = eINSTANCE.getWorkstepSkill_Level();

		/**
		 * The meta object literal for the '<em><b>Preference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_SKILL__PREFERENCE = eINSTANCE.getWorkstepSkill_Preference();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.staff.impl.StaffSkillsImpl <em>Skills</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffSkillsImpl
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getStaffSkills()
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
		 * The meta object literal for the '<em><b>Workstep Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SKILLS__WORKSTEP_SKILLS = eINSTANCE.getStaffSkills_WorkstepSkills();

		/**
		 * The meta object literal for the '<em><b>Abilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SKILLS__ABILITIES = eINSTANCE.getStaffSkills_Abilities();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffDetectionEnum <em>Detection Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffDetectionEnum
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getStaffDetectionEnum()
		 * @generated
		 */
		EEnum STAFF_DETECTION_ENUM = eINSTANCE.getStaffDetectionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.staff.WorkstepPreferenceEnum <em>Workstep Preference Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.staff.WorkstepPreferenceEnum
		 * @see de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl#getWorkstepPreferenceEnum()
		 * @generated
		 */
		EEnum WORKSTEP_PREFERENCE_ENUM = eINSTANCE.getWorkstepPreferenceEnum();

	}

} //StaffPackage
