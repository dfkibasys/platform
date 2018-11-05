/**
 */
package de.dfki.iui.basys.model.domain.staff.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.staff.Ability;
import de.dfki.iui.basys.model.domain.staff.StaffPackage;
import de.dfki.iui.basys.model.domain.staff.StaffSkills;
import de.dfki.iui.basys.model.domain.staff.WorkstepSkill;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skills</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.impl.StaffSkillsImpl#getWorkerId <em>Worker Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.impl.StaffSkillsImpl#getWorkstepSkills <em>Workstep Skills</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.impl.StaffSkillsImpl#getAbilities <em>Abilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffSkillsImpl extends EntityImpl implements StaffSkills {
	/**
	 * The default value of the '{@link #getWorkerId() <em>Worker Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkerId() <em>Worker Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerId()
	 * @generated
	 * @ordered
	 */
	protected String workerId = WORKER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkstepSkills() <em>Workstep Skills</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkstepSkill> workstepSkills;

	/**
	 * The cached value of the '{@link #getAbilities() <em>Abilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Ability> abilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffSkillsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaffPackage.Literals.STAFF_SKILLS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkerId() {
		return workerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerId(String newWorkerId) {
		String oldWorkerId = workerId;
		workerId = newWorkerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF_SKILLS__WORKER_ID, oldWorkerId, workerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkstepSkill> getWorkstepSkills() {
		if (workstepSkills == null) {
			workstepSkills = new EObjectContainmentEList<WorkstepSkill>(WorkstepSkill.class, this, StaffPackage.STAFF_SKILLS__WORKSTEP_SKILLS);
		}
		return workstepSkills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ability> getAbilities() {
		if (abilities == null) {
			abilities = new EObjectContainmentEList<Ability>(Ability.class, this, StaffPackage.STAFF_SKILLS__ABILITIES);
		}
		return abilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaffPackage.STAFF_SKILLS__WORKSTEP_SKILLS:
				return ((InternalEList<?>)getWorkstepSkills()).basicRemove(otherEnd, msgs);
			case StaffPackage.STAFF_SKILLS__ABILITIES:
				return ((InternalEList<?>)getAbilities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaffPackage.STAFF_SKILLS__WORKER_ID:
				return getWorkerId();
			case StaffPackage.STAFF_SKILLS__WORKSTEP_SKILLS:
				return getWorkstepSkills();
			case StaffPackage.STAFF_SKILLS__ABILITIES:
				return getAbilities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StaffPackage.STAFF_SKILLS__WORKER_ID:
				setWorkerId((String)newValue);
				return;
			case StaffPackage.STAFF_SKILLS__WORKSTEP_SKILLS:
				getWorkstepSkills().clear();
				getWorkstepSkills().addAll((Collection<? extends WorkstepSkill>)newValue);
				return;
			case StaffPackage.STAFF_SKILLS__ABILITIES:
				getAbilities().clear();
				getAbilities().addAll((Collection<? extends Ability>)newValue);
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
			case StaffPackage.STAFF_SKILLS__WORKER_ID:
				setWorkerId(WORKER_ID_EDEFAULT);
				return;
			case StaffPackage.STAFF_SKILLS__WORKSTEP_SKILLS:
				getWorkstepSkills().clear();
				return;
			case StaffPackage.STAFF_SKILLS__ABILITIES:
				getAbilities().clear();
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
			case StaffPackage.STAFF_SKILLS__WORKER_ID:
				return WORKER_ID_EDEFAULT == null ? workerId != null : !WORKER_ID_EDEFAULT.equals(workerId);
			case StaffPackage.STAFF_SKILLS__WORKSTEP_SKILLS:
				return workstepSkills != null && !workstepSkills.isEmpty();
			case StaffPackage.STAFF_SKILLS__ABILITIES:
				return abilities != null && !abilities.isEmpty();
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
		result.append(" (workerId: ");
		result.append(workerId);
		result.append(')');
		return result.toString();
	}

} //StaffSkillsImpl
