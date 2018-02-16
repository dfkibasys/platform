/**
 */
package de.dfki.iui.basys.model.domain.processinstance.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.processinstance.ProcessInstance;
import de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceImpl#getProcessDefinitionId <em>Process Definition Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceImpl#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessInstanceImpl extends EntityImpl implements ProcessInstance {
	/**
	 * The default value of the '{@link #getProcessDefinitionId() <em>Process Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessDefinitionId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_DEFINITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessDefinitionId() <em>Process Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessDefinitionId()
	 * @generated
	 * @ordered
	 */
	protected String processDefinitionId = PROCESS_DEFINITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductInstanceId() <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductInstanceId() <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String productInstanceId = PRODUCT_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessinstancePackage.Literals.PROCESS_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessDefinitionId(String newProcessDefinitionId) {
		String oldProcessDefinitionId = processDefinitionId;
		processDefinitionId = newProcessDefinitionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION_ID, oldProcessDefinitionId, processDefinitionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessinstancePackage.PROCESS_INSTANCE__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductInstanceId() {
		return productInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductInstanceId(String newProductInstanceId) {
		String oldProductInstanceId = productInstanceId;
		productInstanceId = newProductInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE_ID, oldProductInstanceId, productInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessinstancePackage.PROCESS_INSTANCE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION_ID:
				return getProcessDefinitionId();
			case ProcessinstancePackage.PROCESS_INSTANCE__ORDER_ID:
				return getOrderId();
			case ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE_ID:
				return getProductInstanceId();
			case ProcessinstancePackage.PROCESS_INSTANCE__STATE:
				return getState();
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
			case ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION_ID:
				setProcessDefinitionId((String)newValue);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE_ID:
				setProductInstanceId((String)newValue);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__STATE:
				setState((String)newValue);
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
			case ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION_ID:
				setProcessDefinitionId(PROCESS_DEFINITION_ID_EDEFAULT);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE_ID:
				setProductInstanceId(PRODUCT_INSTANCE_ID_EDEFAULT);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__STATE:
				setState(STATE_EDEFAULT);
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
			case ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION_ID:
				return PROCESS_DEFINITION_ID_EDEFAULT == null ? processDefinitionId != null : !PROCESS_DEFINITION_ID_EDEFAULT.equals(processDefinitionId);
			case ProcessinstancePackage.PROCESS_INSTANCE__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE_ID:
				return PRODUCT_INSTANCE_ID_EDEFAULT == null ? productInstanceId != null : !PRODUCT_INSTANCE_ID_EDEFAULT.equals(productInstanceId);
			case ProcessinstancePackage.PROCESS_INSTANCE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
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
		result.append(" (processDefinitionId: ");
		result.append(processDefinitionId);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", productInstanceId: ");
		result.append(productInstanceId);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ProcessInstanceImpl
