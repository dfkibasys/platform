/**
 */
package de.dfki.cos.basys.platform.model.domain.staff;

import org.eclipse.emf.common.util.EList;

import de.dfki.cos.basys.platform.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skills</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.staff.StaffSkills#getWorkerId <em>Worker Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.staff.StaffSkills#getWorkstepSkills <em>Workstep Skills</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.staff.StaffSkills#getAbilities <em>Abilities</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffPackage#getStaffSkills()
 * @model
 * @generated
 */
public interface StaffSkills extends Entity {
	/**
	 * Returns the value of the '<em><b>Worker Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * workerId oder staffId?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Worker Id</em>' attribute.
	 * @see #setWorkerId(String)
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffPackage#getStaffSkills_WorkerId()
	 * @model
	 * @generated
	 */
	String getWorkerId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffSkills#getWorkerId <em>Worker Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Id</em>' attribute.
	 * @see #getWorkerId()
	 * @generated
	 */
	void setWorkerId(String value);

	/**
	 * Returns the value of the '<em><b>Workstep Skills</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.staff.WorkstepSkill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workstep Skills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workstep Skills</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffPackage#getStaffSkills_WorkstepSkills()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkstepSkill> getWorkstepSkills();

	/**
	 * Returns the value of the '<em><b>Abilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.staff.Ability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abilities</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffPackage#getStaffSkills_Abilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ability> getAbilities();

} // StaffSkills
