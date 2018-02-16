/**
 */
package de.dfki.iui.basys.model.domain.processinstance;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProcessDefinitionId <em>Process Definition Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getState <em>State</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getProcessInstance()
 * @model
 * @generated
 */
public interface ProcessInstance extends Entity {
	/**
	 * Returns the value of the '<em><b>Process Definition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Definition Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Definition Id</em>' attribute.
	 * @see #setProcessDefinitionId(String)
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getProcessInstance_ProcessDefinitionId()
	 * @model
	 * @generated
	 */
	String getProcessDefinitionId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProcessDefinitionId <em>Process Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Definition Id</em>' attribute.
	 * @see #getProcessDefinitionId()
	 * @generated
	 */
	void setProcessDefinitionId(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getProcessInstance_OrderId()
	 * @model
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Instance Id</em>' attribute.
	 * @see #setProductInstanceId(String)
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getProcessInstance_ProductInstanceId()
	 * @model
	 * @generated
	 */
	String getProductInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProductInstanceId <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Instance Id</em>' attribute.
	 * @see #getProductInstanceId()
	 * @generated
	 */
	void setProductInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getProcessInstance_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // ProcessInstance
