/**
 */
package de.dfki.iui.basys.model.domain.staff.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.staff.StaffPackage;
import de.dfki.iui.basys.model.domain.staff.StaffSkill;
import de.dfki.iui.basys.model.domain.staff.StaffSkills;

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
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.impl.StaffSkillsImpl#getSkills <em>Skills</em>}</li>
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
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffSkill> skills;

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
	public EList<StaffSkill> getSkills() {
		if (skills == null) {
			skills = new EObjectContainmentEList<StaffSkill>(StaffSkill.class, this, StaffPackage.STAFF_SKILLS__SKILLS);
		}
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaffPackage.STAFF_SKILLS__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
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
			case StaffPackage.STAFF_SKILLS__SKILLS:
				return getSkills();
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
			case StaffPackage.STAFF_SKILLS__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends StaffSkill>)newValue);
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
			case StaffPackage.STAFF_SKILLS__SKILLS:
				getSkills().clear();
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
			case StaffPackage.STAFF_SKILLS__SKILLS:
				return skills != null && !skills.isEmpty();
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
