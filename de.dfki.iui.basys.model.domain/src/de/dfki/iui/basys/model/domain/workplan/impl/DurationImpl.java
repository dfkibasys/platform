/**
 */
package de.dfki.iui.basys.model.domain.workplan.impl;

import de.dfki.iui.basys.model.domain.workplan.Duration;
import de.dfki.iui.basys.model.domain.workplan.WorkplanPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl#getWorkstepInstanceId <em>Workstep Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl#getBeginnerLevel <em>Beginner Level</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl#getBeginnerLevelDeviance <em>Beginner Level Deviance</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl#getExpertLevel <em>Expert Level</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl#getExpertLevelDeviance <em>Expert Level Deviance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DurationImpl extends MinimalEObjectImpl.Container implements Duration {
	/**
	 * The default value of the '{@link #getWorkstepInstanceId() <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKSTEP_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkstepInstanceId() <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String workstepInstanceId = WORKSTEP_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeginnerLevel() <em>Beginner Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnerLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int BEGINNER_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBeginnerLevel() <em>Beginner Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnerLevel()
	 * @generated
	 * @ordered
	 */
	protected int beginnerLevel = BEGINNER_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeginnerLevelDeviance() <em>Beginner Level Deviance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnerLevelDeviance()
	 * @generated
	 * @ordered
	 */
	protected static final int BEGINNER_LEVEL_DEVIANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBeginnerLevelDeviance() <em>Beginner Level Deviance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnerLevelDeviance()
	 * @generated
	 * @ordered
	 */
	protected int beginnerLevelDeviance = BEGINNER_LEVEL_DEVIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpertLevel() <em>Expert Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpertLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPERT_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpertLevel() <em>Expert Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpertLevel()
	 * @generated
	 * @ordered
	 */
	protected int expertLevel = EXPERT_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpertLevelDeviance() <em>Expert Level Deviance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpertLevelDeviance()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPERT_LEVEL_DEVIANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpertLevelDeviance() <em>Expert Level Deviance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpertLevelDeviance()
	 * @generated
	 * @ordered
	 */
	protected int expertLevelDeviance = EXPERT_LEVEL_DEVIANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkplanPackage.Literals.DURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkstepInstanceId() {
		return workstepInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkstepInstanceId(String newWorkstepInstanceId) {
		String oldWorkstepInstanceId = workstepInstanceId;
		workstepInstanceId = newWorkstepInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.DURATION__WORKSTEP_INSTANCE_ID, oldWorkstepInstanceId, workstepInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBeginnerLevel() {
		return beginnerLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginnerLevel(int newBeginnerLevel) {
		int oldBeginnerLevel = beginnerLevel;
		beginnerLevel = newBeginnerLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.DURATION__BEGINNER_LEVEL, oldBeginnerLevel, beginnerLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBeginnerLevelDeviance() {
		return beginnerLevelDeviance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginnerLevelDeviance(int newBeginnerLevelDeviance) {
		int oldBeginnerLevelDeviance = beginnerLevelDeviance;
		beginnerLevelDeviance = newBeginnerLevelDeviance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.DURATION__BEGINNER_LEVEL_DEVIANCE, oldBeginnerLevelDeviance, beginnerLevelDeviance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpertLevel() {
		return expertLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpertLevel(int newExpertLevel) {
		int oldExpertLevel = expertLevel;
		expertLevel = newExpertLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.DURATION__EXPERT_LEVEL, oldExpertLevel, expertLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpertLevelDeviance() {
		return expertLevelDeviance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpertLevelDeviance(int newExpertLevelDeviance) {
		int oldExpertLevelDeviance = expertLevelDeviance;
		expertLevelDeviance = newExpertLevelDeviance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.DURATION__EXPERT_LEVEL_DEVIANCE, oldExpertLevelDeviance, expertLevelDeviance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkplanPackage.DURATION__WORKSTEP_INSTANCE_ID:
				return getWorkstepInstanceId();
			case WorkplanPackage.DURATION__BEGINNER_LEVEL:
				return getBeginnerLevel();
			case WorkplanPackage.DURATION__BEGINNER_LEVEL_DEVIANCE:
				return getBeginnerLevelDeviance();
			case WorkplanPackage.DURATION__EXPERT_LEVEL:
				return getExpertLevel();
			case WorkplanPackage.DURATION__EXPERT_LEVEL_DEVIANCE:
				return getExpertLevelDeviance();
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
			case WorkplanPackage.DURATION__WORKSTEP_INSTANCE_ID:
				setWorkstepInstanceId((String)newValue);
				return;
			case WorkplanPackage.DURATION__BEGINNER_LEVEL:
				setBeginnerLevel((Integer)newValue);
				return;
			case WorkplanPackage.DURATION__BEGINNER_LEVEL_DEVIANCE:
				setBeginnerLevelDeviance((Integer)newValue);
				return;
			case WorkplanPackage.DURATION__EXPERT_LEVEL:
				setExpertLevel((Integer)newValue);
				return;
			case WorkplanPackage.DURATION__EXPERT_LEVEL_DEVIANCE:
				setExpertLevelDeviance((Integer)newValue);
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
			case WorkplanPackage.DURATION__WORKSTEP_INSTANCE_ID:
				setWorkstepInstanceId(WORKSTEP_INSTANCE_ID_EDEFAULT);
				return;
			case WorkplanPackage.DURATION__BEGINNER_LEVEL:
				setBeginnerLevel(BEGINNER_LEVEL_EDEFAULT);
				return;
			case WorkplanPackage.DURATION__BEGINNER_LEVEL_DEVIANCE:
				setBeginnerLevelDeviance(BEGINNER_LEVEL_DEVIANCE_EDEFAULT);
				return;
			case WorkplanPackage.DURATION__EXPERT_LEVEL:
				setExpertLevel(EXPERT_LEVEL_EDEFAULT);
				return;
			case WorkplanPackage.DURATION__EXPERT_LEVEL_DEVIANCE:
				setExpertLevelDeviance(EXPERT_LEVEL_DEVIANCE_EDEFAULT);
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
			case WorkplanPackage.DURATION__WORKSTEP_INSTANCE_ID:
				return WORKSTEP_INSTANCE_ID_EDEFAULT == null ? workstepInstanceId != null : !WORKSTEP_INSTANCE_ID_EDEFAULT.equals(workstepInstanceId);
			case WorkplanPackage.DURATION__BEGINNER_LEVEL:
				return beginnerLevel != BEGINNER_LEVEL_EDEFAULT;
			case WorkplanPackage.DURATION__BEGINNER_LEVEL_DEVIANCE:
				return beginnerLevelDeviance != BEGINNER_LEVEL_DEVIANCE_EDEFAULT;
			case WorkplanPackage.DURATION__EXPERT_LEVEL:
				return expertLevel != EXPERT_LEVEL_EDEFAULT;
			case WorkplanPackage.DURATION__EXPERT_LEVEL_DEVIANCE:
				return expertLevelDeviance != EXPERT_LEVEL_DEVIANCE_EDEFAULT;
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
		result.append(" (workstepInstanceId: ");
		result.append(workstepInstanceId);
		result.append(", beginnerLevel: ");
		result.append(beginnerLevel);
		result.append(", beginnerLevelDeviance: ");
		result.append(beginnerLevelDeviance);
		result.append(", expertLevel: ");
		result.append(expertLevel);
		result.append(", expertLevelDeviance: ");
		result.append(expertLevelDeviance);
		result.append(')');
		return result.toString();
	}

} //DurationImpl
