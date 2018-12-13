/**
 */
package de.dfki.cos.basys.platform.model.domain.staff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffPackage
 * @generated
 */
public interface StaffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaffFactory eINSTANCE = de.dfki.cos.basys.platform.model.domain.staff.impl.StaffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff</em>'.
	 * @generated
	 */
	Staff createStaff();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	StaffLocation createStaffLocation();

	/**
	 * Returns a new object of class '<em>Location Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Change Event</em>'.
	 * @generated
	 */
	StaffLocationChangeEvent createStaffLocationChangeEvent();

	/**
	 * Returns a new object of class '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ability</em>'.
	 * @generated
	 */
	Ability createAbility();

	/**
	 * Returns a new object of class '<em>Workstep Skill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workstep Skill</em>'.
	 * @generated
	 */
	WorkstepSkill createWorkstepSkill();

	/**
	 * Returns a new object of class '<em>Skills</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skills</em>'.
	 * @generated
	 */
	StaffSkills createStaffSkills();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StaffPackage getStaffPackage();

} //StaffFactory
