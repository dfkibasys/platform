/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.StatusRequest;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl#getCorrelationId <em>Correlation Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusRequestImpl extends MinimalEObjectImpl.Container implements StatusRequest {
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
	 * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> inputParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.STATUS_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId(String newComponentId) {
		String oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.STATUS_REQUEST__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorrelationId() {
		return correlationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationId(String newCorrelationId) {
		String oldCorrelationId = correlationId;
		correlationId = newCorrelationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.STATUS_REQUEST__CORRELATION_ID, oldCorrelationId, correlationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getInputParameters() {
		if (inputParameters == null) {
			inputParameters = new EObjectContainmentEList<Variable>(Variable.class, this, ComponentPackage.STATUS_REQUEST__INPUT_PARAMETERS);
		}
		return inputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.STATUS_REQUEST__INPUT_PARAMETERS:
				return ((InternalEList<?>)getInputParameters()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.STATUS_REQUEST__COMPONENT_ID:
				return getComponentId();
			case ComponentPackage.STATUS_REQUEST__CORRELATION_ID:
				return getCorrelationId();
			case ComponentPackage.STATUS_REQUEST__INPUT_PARAMETERS:
				return getInputParameters();
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
			case ComponentPackage.STATUS_REQUEST__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case ComponentPackage.STATUS_REQUEST__CORRELATION_ID:
				setCorrelationId((String)newValue);
				return;
			case ComponentPackage.STATUS_REQUEST__INPUT_PARAMETERS:
				getInputParameters().clear();
				getInputParameters().addAll((Collection<? extends Variable>)newValue);
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
			case ComponentPackage.STATUS_REQUEST__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case ComponentPackage.STATUS_REQUEST__CORRELATION_ID:
				setCorrelationId(CORRELATION_ID_EDEFAULT);
				return;
			case ComponentPackage.STATUS_REQUEST__INPUT_PARAMETERS:
				getInputParameters().clear();
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
			case ComponentPackage.STATUS_REQUEST__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case ComponentPackage.STATUS_REQUEST__CORRELATION_ID:
				return CORRELATION_ID_EDEFAULT == null ? correlationId != null : !CORRELATION_ID_EDEFAULT.equals(correlationId);
			case ComponentPackage.STATUS_REQUEST__INPUT_PARAMETERS:
				return inputParameters != null && !inputParameters.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //StatusRequestImpl
