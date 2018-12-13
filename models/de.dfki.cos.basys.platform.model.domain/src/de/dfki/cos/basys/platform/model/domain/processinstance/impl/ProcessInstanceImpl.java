/**
 */
package de.dfki.cos.basys.platform.model.domain.processinstance.impl;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.domain.order.Order;
import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstance;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessinstancePackage;
import de.dfki.cos.basys.platform.model.domain.processinstance.TaskInstance;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance;

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
 * An implementation of the model object '<em><b>Process Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessInstanceImpl#getProcessDefinition <em>Process Definition</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessInstanceImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessInstanceImpl#getProductInstance <em>Product Instance</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessInstanceImpl#getState <em>State</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessInstanceImpl#getTaskInstances <em>Task Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessInstanceImpl extends EntityImpl implements ProcessInstance {
	/**
	 * The cached value of the '{@link #getProcessDefinition() <em>Process Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessDefinition()
	 * @generated
	 * @ordered
	 */
	protected ProcessDefinition processDefinition;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Order order;

	/**
	 * The cached value of the '{@link #getProductInstance() <em>Product Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstance()
	 * @generated
	 * @ordered
	 */
	protected ProductInstance productInstance;

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
	 * The cached value of the '{@link #getTaskInstances() <em>Task Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInstance> taskInstances;

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
	public ProcessDefinition getProcessDefinition() {
		if (processDefinition != null && processDefinition.eIsProxy()) {
			InternalEObject oldProcessDefinition = (InternalEObject)processDefinition;
			processDefinition = (ProcessDefinition)eResolveProxy(oldProcessDefinition);
			if (processDefinition != oldProcessDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION, oldProcessDefinition, processDefinition));
			}
		}
		return processDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinition basicGetProcessDefinition() {
		return processDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessDefinition(ProcessDefinition newProcessDefinition) {
		ProcessDefinition oldProcessDefinition = processDefinition;
		processDefinition = newProcessDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION, oldProcessDefinition, processDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		if (order != null && order.eIsProxy()) {
			InternalEObject oldOrder = (InternalEObject)order;
			order = (Order)eResolveProxy(oldOrder);
			if (order != oldOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessinstancePackage.PROCESS_INSTANCE__ORDER, oldOrder, order));
			}
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order basicGetOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Order newOrder) {
		Order oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessinstancePackage.PROCESS_INSTANCE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance getProductInstance() {
		if (productInstance != null && productInstance.eIsProxy()) {
			InternalEObject oldProductInstance = (InternalEObject)productInstance;
			productInstance = (ProductInstance)eResolveProxy(oldProductInstance);
			if (productInstance != oldProductInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE, oldProductInstance, productInstance));
			}
		}
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance basicGetProductInstance() {
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductInstance(ProductInstance newProductInstance) {
		ProductInstance oldProductInstance = productInstance;
		productInstance = newProductInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE, oldProductInstance, productInstance));
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
	public EList<TaskInstance> getTaskInstances() {
		if (taskInstances == null) {
			taskInstances = new EObjectContainmentEList<TaskInstance>(TaskInstance.class, this, ProcessinstancePackage.PROCESS_INSTANCE__TASK_INSTANCES);
		}
		return taskInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessinstancePackage.PROCESS_INSTANCE__TASK_INSTANCES:
				return ((InternalEList<?>)getTaskInstances()).basicRemove(otherEnd, msgs);
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
			case ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION:
				if (resolve) return getProcessDefinition();
				return basicGetProcessDefinition();
			case ProcessinstancePackage.PROCESS_INSTANCE__ORDER:
				if (resolve) return getOrder();
				return basicGetOrder();
			case ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE:
				if (resolve) return getProductInstance();
				return basicGetProductInstance();
			case ProcessinstancePackage.PROCESS_INSTANCE__STATE:
				return getState();
			case ProcessinstancePackage.PROCESS_INSTANCE__TASK_INSTANCES:
				return getTaskInstances();
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
			case ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION:
				setProcessDefinition((ProcessDefinition)newValue);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__ORDER:
				setOrder((Order)newValue);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE:
				setProductInstance((ProductInstance)newValue);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__STATE:
				setState((String)newValue);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__TASK_INSTANCES:
				getTaskInstances().clear();
				getTaskInstances().addAll((Collection<? extends TaskInstance>)newValue);
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
			case ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION:
				setProcessDefinition((ProcessDefinition)null);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__ORDER:
				setOrder((Order)null);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE:
				setProductInstance((ProductInstance)null);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ProcessinstancePackage.PROCESS_INSTANCE__TASK_INSTANCES:
				getTaskInstances().clear();
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
			case ProcessinstancePackage.PROCESS_INSTANCE__PROCESS_DEFINITION:
				return processDefinition != null;
			case ProcessinstancePackage.PROCESS_INSTANCE__ORDER:
				return order != null;
			case ProcessinstancePackage.PROCESS_INSTANCE__PRODUCT_INSTANCE:
				return productInstance != null;
			case ProcessinstancePackage.PROCESS_INSTANCE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case ProcessinstancePackage.PROCESS_INSTANCE__TASK_INSTANCES:
				return taskInstances != null && !taskInstances.isEmpty();
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
		result.append(" (state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ProcessInstanceImpl
