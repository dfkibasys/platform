/**
 */
package de.dfki.iui.basys.model.domain.staff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.staff.StaffPackage
 * @generated
 */
public interface StaffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaffFactory eINSTANCE = de.dfki.iui.basys.model.domain.staff.impl.StaffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff</em>'.
	 * @generated
	 */
	Staff createStaff();

	/**
	 * Returns a new object of class '<em>Recognition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recognition</em>'.
	 * @generated
	 */
	StaffRecognition createStaffRecognition();

	/**
	 * Returns a new object of class '<em>Skills</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skills</em>'.
	 * @generated
	 */
	StaffSkills createStaffSkills();

	/**
	 * Returns a new object of class '<em>Skill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill</em>'.
	 * @generated
	 */
	StaffSkill createStaffSkill();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StaffPackage getStaffPackage();

} //StaffFactory
