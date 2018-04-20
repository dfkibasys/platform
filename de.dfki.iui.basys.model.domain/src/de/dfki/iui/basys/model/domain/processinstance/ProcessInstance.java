/**
 */
package de.dfki.iui.basys.model.domain.processinstance;

import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.processdefinition.ProcessDefinition;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProcessDefinition <em>Process Definition</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getOrder <em>Order</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProductInstance <em>Product Instance</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getState <em>State</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getProcessInstance()
 * @model
 * @generated
 */
public interface ProcessInstance extends Entity {
	/**
	 * Returns the value of the '<em><b>Process Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Definition</em>' reference.
	 * @see #setProcessDefinition(ProcessDefinition)
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getProcessInstance_ProcessDefinition()
	 * @model required="true"
	 * @generated
	 */
	ProcessDefinition getProcessDefinition();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProcessDefinition <em>Process Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Definition</em>' reference.
	 * @see #getProcessDefinition()
	 * @generated
	 */
	void setProcessDefinition(ProcessDefinition value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(Order)
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getProcessInstance_Order()
	 * @model required="true"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Product Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Instance</em>' reference.
	 * @see #setProductInstance(ProductInstance)
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getProcessInstance_ProductInstance()
	 * @model
	 * @generated
	 */
	ProductInstance getProductInstance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processinstance.ProcessInstance#getProductInstance <em>Product Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Instance</em>' reference.
	 * @see #getProductInstance()
	 * @generated
	 */
	void setProductInstance(ProductInstance value);

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
