/**
 */
package de.dfki.iui.basys.model.domain.staff;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workstep Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.WorkstepSkill#getWorkstepId <em>Workstep Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.WorkstepSkill#getLevel <em>Level</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.WorkstepSkill#getPreference <em>Preference</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.staff.StaffPackage#getWorkstepSkill()
 * @model
 * @generated
 */
public interface WorkstepSkill extends Entity {
	/**
	 * Returns the value of the '<em><b>Workstep Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workstep Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workstep Id</em>' attribute.
	 * @see #setWorkstepId(String)
	 * @see de.dfki.iui.basys.model.domain.staff.StaffPackage#getWorkstepSkill_WorkstepId()
	 * @model
	 * @generated
	 */
	String getWorkstepId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.staff.WorkstepSkill#getWorkstepId <em>Workstep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workstep Id</em>' attribute.
	 * @see #getWorkstepId()
	 * @generated
	 */
	void setWorkstepId(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 0 - 100
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see de.dfki.iui.basys.model.domain.staff.StaffPackage#getWorkstepSkill_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.staff.WorkstepSkill#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Preference</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.staff.WorkstepPreferenceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preference</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.staff.WorkstepPreferenceEnum
	 * @see #setPreference(WorkstepPreferenceEnum)
	 * @see de.dfki.iui.basys.model.domain.staff.StaffPackage#getWorkstepSkill_Preference()
	 * @model
	 * @generated
	 */
	WorkstepPreferenceEnum getPreference();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.staff.WorkstepSkill#getPreference <em>Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.staff.WorkstepPreferenceEnum
	 * @see #getPreference()
	 * @generated
	 */
	void setPreference(WorkstepPreferenceEnum value);

} // WorkstepSkill
