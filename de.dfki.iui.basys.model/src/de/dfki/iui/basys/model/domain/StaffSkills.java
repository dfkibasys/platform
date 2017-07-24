/**
 */
package de.dfki.iui.basys.model.domain;

import de.dfki.iui.basys.model.base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Skills</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.StaffSkills#getWorkerId <em>Worker Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.StaffSkills#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.DomainPackage#getStaffSkills()
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
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getStaffSkills_WorkerId()
	 * @model
	 * @generated
	 */
	String getWorkerId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.StaffSkills#getWorkerId <em>Worker Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Id</em>' attribute.
	 * @see #getWorkerId()
	 * @generated
	 */
	void setWorkerId(String value);

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.StaffSkill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getStaffSkills_Skills()
	 * @model containment="true"
	 * @generated
	 */
	EList<StaffSkill> getSkills();

} // StaffSkills
