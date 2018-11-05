/**
 */
package de.dfki.iui.basys.model.domain.staff.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.staff.StaffPackage;
import de.dfki.iui.basys.model.domain.staff.WorkstepPreferenceEnum;
import de.dfki.iui.basys.model.domain.staff.WorkstepSkill;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workstep Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.impl.WorkstepSkillImpl#getWorkstepId <em>Workstep Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.impl.WorkstepSkillImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.impl.WorkstepSkillImpl#getPreference <em>Preference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkstepSkillImpl extends EntityImpl implements WorkstepSkill {
	/**
	 * The default value of the '{@link #getWorkstepId() <em>Workstep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKSTEP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkstepId() <em>Workstep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepId()
	 * @generated
	 * @ordered
	 */
	protected String workstepId = WORKSTEP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreference() <em>Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreference()
	 * @generated
	 * @ordered
	 */
	protected static final WorkstepPreferenceEnum PREFERENCE_EDEFAULT = WorkstepPreferenceEnum.NEUTRAL;

	/**
	 * The cached value of the '{@link #getPreference() <em>Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreference()
	 * @generated
	 * @ordered
	 */
	protected WorkstepPreferenceEnum preference = PREFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkstepSkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaffPackage.Literals.WORKSTEP_SKILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkstepId() {
		return workstepId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkstepId(String newWorkstepId) {
		String oldWorkstepId = workstepId;
		workstepId = newWorkstepId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.WORKSTEP_SKILL__WORKSTEP_ID, oldWorkstepId, workstepId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.WORKSTEP_SKILL__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstepPreferenceEnum getPreference() {
		return preference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreference(WorkstepPreferenceEnum newPreference) {
		WorkstepPreferenceEnum oldPreference = preference;
		preference = newPreference == null ? PREFERENCE_EDEFAULT : newPreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.WORKSTEP_SKILL__PREFERENCE, oldPreference, preference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaffPackage.WORKSTEP_SKILL__WORKSTEP_ID:
				return getWorkstepId();
			case StaffPackage.WORKSTEP_SKILL__LEVEL:
				return getLevel();
			case StaffPackage.WORKSTEP_SKILL__PREFERENCE:
				return getPreference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StaffPackage.WORKSTEP_SKILL__WORKSTEP_ID:
				setWorkstepId((String)newValue);
				return;
			case StaffPackage.WORKSTEP_SKILL__LEVEL:
				setLevel((Integer)newValue);
				return;
			case StaffPackage.WORKSTEP_SKILL__PREFERENCE:
				setPreference((WorkstepPreferenceEnum)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StaffPackage.WORKSTEP_SKILL__WORKSTEP_ID:
				setWorkstepId(WORKSTEP_ID_EDEFAULT);
				return;
			case StaffPackage.WORKSTEP_SKILL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case StaffPackage.WORKSTEP_SKILL__PREFERENCE:
				setPreference(PREFERENCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StaffPackage.WORKSTEP_SKILL__WORKSTEP_ID:
				return WORKSTEP_ID_EDEFAULT == null ? workstepId != null : !WORKSTEP_ID_EDEFAULT.equals(workstepId);
			case StaffPackage.WORKSTEP_SKILL__LEVEL:
				return level != LEVEL_EDEFAULT;
			case StaffPackage.WORKSTEP_SKILL__PREFERENCE:
				return preference != PREFERENCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (workstepId: ");
		result.append(workstepId);
		result.append(", level: ");
		result.append(level);
		result.append(", preference: ");
		result.append(preference);
		result.append(')');
		return result.toString();
	}

} //WorkstepSkillImpl
