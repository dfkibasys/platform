/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Mode Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionModeRequestImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionModeRequestImpl#getCorrelationId <em>Correlation Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionModeRequestImpl#getOccupierId <em>Occupier Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionModeRequestImpl#getExecutionMode <em>Execution Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionModeRequestImpl extends MinimalEObjectImpl.Container implements ExecutionModeRequest {
	/**
	 * The default value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected String componentId = COMPONENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorrelationId() <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationId()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRELATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrelationId() <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationId()
	 * @generated
	 * @ordered
	 */
	protected String correlationId = CORRELATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccupierId() <em>Occupier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupierId()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCUPIER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccupierId() <em>Occupier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupierId()
	 * @generated
	 * @ordered
	 */
	protected String occupierId = OCCUPIER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionMode() <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionMode EXECUTION_MODE_EDEFAULT = ExecutionMode.PRODUCTION;

	/**
	 * The cached value of the '{@link #getExecutionMode() <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionMode()
	 * @generated
	 * @ordered
	 */
	protected ExecutionMode executionMode = EXECUTION_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionModeRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.EXECUTION_MODE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentId(String newComponentId) {
		String oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.EXECUTION_MODE_REQUEST__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrelationId() {
		return correlationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelationId(String newCorrelationId) {
		String oldCorrelationId = correlationId;
		correlationId = newCorrelationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.EXECUTION_MODE_REQUEST__CORRELATION_ID, oldCorrelationId, correlationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOccupierId() {
		return occupierId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccupierId(String newOccupierId) {
		String oldOccupierId = occupierId;
		occupierId = newOccupierId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.EXECUTION_MODE_REQUEST__OCCUPIER_ID, oldOccupierId, occupierId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionMode getExecutionMode() {
		return executionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionMode(ExecutionMode newExecutionMode) {
		ExecutionMode oldExecutionMode = executionMode;
		executionMode = newExecutionMode == null ? EXECUTION_MODE_EDEFAULT : newExecutionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.EXECUTION_MODE_REQUEST__EXECUTION_MODE, oldExecutionMode, executionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.EXECUTION_MODE_REQUEST__COMPONENT_ID:
				return getComponentId();
			case ComponentPackage.EXECUTION_MODE_REQUEST__CORRELATION_ID:
				return getCorrelationId();
			case ComponentPackage.EXECUTION_MODE_REQUEST__OCCUPIER_ID:
				return getOccupierId();
			case ComponentPackage.EXECUTION_MODE_REQUEST__EXECUTION_MODE:
				return getExecutionMode();
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
			case ComponentPackage.EXECUTION_MODE_REQUEST__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case ComponentPackage.EXECUTION_MODE_REQUEST__CORRELATION_ID:
				setCorrelationId((String)newValue);
				return;
			case ComponentPackage.EXECUTION_MODE_REQUEST__OCCUPIER_ID:
				setOccupierId((String)newValue);
				return;
			case ComponentPackage.EXECUTION_MODE_REQUEST__EXECUTION_MODE:
				setExecutionMode((ExecutionMode)newValue);
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
			case ComponentPackage.EXECUTION_MODE_REQUEST__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case ComponentPackage.EXECUTION_MODE_REQUEST__CORRELATION_ID:
				setCorrelationId(CORRELATION_ID_EDEFAULT);
				return;
			case ComponentPackage.EXECUTION_MODE_REQUEST__OCCUPIER_ID:
				setOccupierId(OCCUPIER_ID_EDEFAULT);
				return;
			case ComponentPackage.EXECUTION_MODE_REQUEST__EXECUTION_MODE:
				setExecutionMode(EXECUTION_MODE_EDEFAULT);
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
			case ComponentPackage.EXECUTION_MODE_REQUEST__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case ComponentPackage.EXECUTION_MODE_REQUEST__CORRELATION_ID:
				return CORRELATION_ID_EDEFAULT == null ? correlationId != null : !CORRELATION_ID_EDEFAULT.equals(correlationId);
			case ComponentPackage.EXECUTION_MODE_REQUEST__OCCUPIER_ID:
				return OCCUPIER_ID_EDEFAULT == null ? occupierId != null : !OCCUPIER_ID_EDEFAULT.equals(occupierId);
			case ComponentPackage.EXECUTION_MODE_REQUEST__EXECUTION_MODE:
				return executionMode != EXECUTION_MODE_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (componentId: ");
		result.append(componentId);
		result.append(", correlationId: ");
		result.append(correlationId);
		result.append(", occupierId: ");
		result.append(occupierId);
		result.append(", executionMode: ");
		result.append(executionMode);
		result.append(')');
		return result.toString();
	}

} //ExecutionModeRequestImpl
