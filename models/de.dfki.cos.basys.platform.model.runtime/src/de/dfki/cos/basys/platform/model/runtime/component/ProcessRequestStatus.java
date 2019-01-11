/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Request Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getProcessInstanceId <em>Process Instance Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getBusinessKey <em>Business Key</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessRequestStatus()
 * @model
 * @generated
 */
public interface ProcessRequestStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Process Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Instance Id</em>' attribute.
	 * @see #setProcessInstanceId(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessRequestStatus_ProcessInstanceId()
	 * @model
	 * @generated
	 */
	String getProcessInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getProcessInstanceId <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Instance Id</em>' attribute.
	 * @see #getProcessInstanceId()
	 * @generated
	 */
	void setProcessInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Business Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Key</em>' attribute.
	 * @see #setBusinessKey(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessRequestStatus_BusinessKey()
	 * @model
	 * @generated
	 */
	String getBusinessKey();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getBusinessKey <em>Business Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Key</em>' attribute.
	 * @see #getBusinessKey()
	 * @generated
	 */
	void setBusinessKey(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.runtime.component.RequestStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.RequestStatus
	 * @see #setStatus(RequestStatus)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessRequestStatus_Status()
	 * @model
	 * @generated
	 */
	RequestStatus getStatus();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.RequestStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RequestStatus value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessRequestStatus_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // ProcessRequestStatus
