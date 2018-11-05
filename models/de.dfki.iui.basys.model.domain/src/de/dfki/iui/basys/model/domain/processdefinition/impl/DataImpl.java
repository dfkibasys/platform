/**
 */
package de.dfki.iui.basys.model.domain.processdefinition.impl;

import de.dfki.iui.basys.model.domain.processdefinition.Data;
import de.dfki.iui.basys.model.domain.processdefinition.DataMapping;
import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.iui.basys.model.domain.processdefinition.Task;
import de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum;

import de.dfki.iui.basys.model.pattern.PPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.DataImpl#getAvailableOn <em>Available On</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.DataImpl#getTaskRef <em>Task Ref</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.DataImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.DataImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.DataImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends NodeImpl implements Data {
	/**
	 * The default value of the '{@link #getAvailableOn() <em>Available On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableOn()
	 * @generated
	 * @ordered
	 */
	protected static final TaskStateEnum AVAILABLE_ON_EDEFAULT = TaskStateEnum.SUCCESSFUL;

	/**
	 * The cached value of the '{@link #getAvailableOn() <em>Available On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableOn()
	 * @generated
	 * @ordered
	 */
	protected TaskStateEnum availableOn = AVAILABLE_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaskRef() <em>Task Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRef()
	 * @generated
	 * @ordered
	 */
	protected Task taskRef;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected PPattern pattern;

	/**
	 * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected static final Object INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Object instance = INSTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected DataMapping mappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum getAvailableOn() {
		return availableOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableOn(TaskStateEnum newAvailableOn) {
		TaskStateEnum oldAvailableOn = availableOn;
		availableOn = newAvailableOn == null ? AVAILABLE_ON_EDEFAULT : newAvailableOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA__AVAILABLE_ON, oldAvailableOn, availableOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTaskRef() {
		if (taskRef != null && taskRef.eIsProxy()) {
			InternalEObject oldTaskRef = (InternalEObject)taskRef;
			taskRef = (Task)eResolveProxy(oldTaskRef);
			if (taskRef != oldTaskRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessdefinitionPackage.DATA__TASK_REF, oldTaskRef, taskRef));
			}
		}
		return taskRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTaskRef() {
		return taskRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskRef(Task newTaskRef) {
		Task oldTaskRef = taskRef;
		taskRef = newTaskRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA__TASK_REF, oldTaskRef, taskRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(PPattern newPattern, NotificationChain msgs) {
		PPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(PPattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessdefinitionPackage.DATA__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessdefinitionPackage.DATA__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(Object newInstance) {
		Object oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMapping getMappings() {
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappings(DataMapping newMappings, NotificationChain msgs) {
		DataMapping oldMappings = mappings;
		mappings = newMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA__MAPPINGS, oldMappings, newMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappings(DataMapping newMappings) {
		if (newMappings != mappings) {
			NotificationChain msgs = null;
			if (mappings != null)
				msgs = ((InternalEObject)mappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessdefinitionPackage.DATA__MAPPINGS, null, msgs);
			if (newMappings != null)
				msgs = ((InternalEObject)newMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessdefinitionPackage.DATA__MAPPINGS, null, msgs);
			msgs = basicSetMappings(newMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA__MAPPINGS, newMappings, newMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessdefinitionPackage.DATA__PATTERN:
				return basicSetPattern(null, msgs);
			case ProcessdefinitionPackage.DATA__MAPPINGS:
				return basicSetMappings(null, msgs);
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
			case ProcessdefinitionPackage.DATA__AVAILABLE_ON:
				return getAvailableOn();
			case ProcessdefinitionPackage.DATA__TASK_REF:
				if (resolve) return getTaskRef();
				return basicGetTaskRef();
			case ProcessdefinitionPackage.DATA__PATTERN:
				return getPattern();
			case ProcessdefinitionPackage.DATA__INSTANCE:
				return getInstance();
			case ProcessdefinitionPackage.DATA__MAPPINGS:
				return getMappings();
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
			case ProcessdefinitionPackage.DATA__AVAILABLE_ON:
				setAvailableOn((TaskStateEnum)newValue);
				return;
			case ProcessdefinitionPackage.DATA__TASK_REF:
				setTaskRef((Task)newValue);
				return;
			case ProcessdefinitionPackage.DATA__PATTERN:
				setPattern((PPattern)newValue);
				return;
			case ProcessdefinitionPackage.DATA__INSTANCE:
				setInstance(newValue);
				return;
			case ProcessdefinitionPackage.DATA__MAPPINGS:
				setMappings((DataMapping)newValue);
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
			case ProcessdefinitionPackage.DATA__AVAILABLE_ON:
				setAvailableOn(AVAILABLE_ON_EDEFAULT);
				return;
			case ProcessdefinitionPackage.DATA__TASK_REF:
				setTaskRef((Task)null);
				return;
			case ProcessdefinitionPackage.DATA__PATTERN:
				setPattern((PPattern)null);
				return;
			case ProcessdefinitionPackage.DATA__INSTANCE:
				setInstance(INSTANCE_EDEFAULT);
				return;
			case ProcessdefinitionPackage.DATA__MAPPINGS:
				setMappings((DataMapping)null);
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
			case ProcessdefinitionPackage.DATA__AVAILABLE_ON:
				return availableOn != AVAILABLE_ON_EDEFAULT;
			case ProcessdefinitionPackage.DATA__TASK_REF:
				return taskRef != null;
			case ProcessdefinitionPackage.DATA__PATTERN:
				return pattern != null;
			case ProcessdefinitionPackage.DATA__INSTANCE:
				return INSTANCE_EDEFAULT == null ? instance != null : !INSTANCE_EDEFAULT.equals(instance);
			case ProcessdefinitionPackage.DATA__MAPPINGS:
				return mappings != null;
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
		result.append(" (availableOn: ");
		result.append(availableOn);
		result.append(", instance: ");
		result.append(instance);
		result.append(')');
		return result.toString();
	}

} //DataImpl
