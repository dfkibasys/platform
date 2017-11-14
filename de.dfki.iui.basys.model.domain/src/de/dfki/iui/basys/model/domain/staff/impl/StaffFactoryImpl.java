/**
 */
package de.dfki.iui.basys.model.domain.staff.impl;

import de.dfki.iui.basys.model.domain.staff.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaffFactoryImpl extends EFactoryImpl implements StaffFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaffFactory init() {
		try {
			StaffFactory theStaffFactory = (StaffFactory)EPackage.Registry.INSTANCE.getEFactory(StaffPackage.eNS_URI);
			if (theStaffFactory != null) {
				return theStaffFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StaffFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StaffPackage.STAFF: return createStaff();
			case StaffPackage.STAFF_LOCATION: return createStaffLocation();
			case StaffPackage.STAFF_LOCATION_CHANGE_EVENT: return createStaffLocationChangeEvent();
			case StaffPackage.ABILITY: return createAbility();
			case StaffPackage.WORKSTEP_SKILL: return createWorkstepSkill();
			case StaffPackage.STAFF_SKILLS: return createStaffSkills();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StaffPackage.STAFF_DETECTION_ENUM:
				return createStaffDetectionEnumFromString(eDataType, initialValue);
			case StaffPackage.WORKSTEP_PREFERENCE_ENUM:
				return createWorkstepPreferenceEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StaffPackage.STAFF_DETECTION_ENUM:
				return convertStaffDetectionEnumToString(eDataType, instanceValue);
			case StaffPackage.WORKSTEP_PREFERENCE_ENUM:
				return convertWorkstepPreferenceEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff createStaff() {
		StaffImpl staff = new StaffImpl();
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffLocation createStaffLocation() {
		StaffLocationImpl staffLocation = new StaffLocationImpl();
		return staffLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffLocationChangeEvent createStaffLocationChangeEvent() {
		StaffLocationChangeEventImpl staffLocationChangeEvent = new StaffLocationChangeEventImpl();
		return staffLocationChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability createAbility() {
		AbilityImpl ability = new AbilityImpl();
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstepSkill createWorkstepSkill() {
		WorkstepSkillImpl workstepSkill = new WorkstepSkillImpl();
		return workstepSkill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSkills createStaffSkills() {
		StaffSkillsImpl staffSkills = new StaffSkillsImpl();
		return staffSkills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffDetectionEnum createStaffDetectionEnumFromString(EDataType eDataType, String initialValue) {
		StaffDetectionEnum result = StaffDetectionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStaffDetectionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstepPreferenceEnum createWorkstepPreferenceEnumFromString(EDataType eDataType, String initialValue) {
		WorkstepPreferenceEnum result = WorkstepPreferenceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkstepPreferenceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffPackage getStaffPackage() {
		return (StaffPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StaffPackage getPackage() {
		return StaffPackage.eINSTANCE;
	}

} //StaffFactoryImpl
