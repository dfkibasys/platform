/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentRequestStatus()
 * @model
 * @generated
 */
public interface ComponentRequestStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentRequestStatus_ComponentId()
	 * @model
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

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
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentRequestStatus_Status()
	 * @model
	 * @generated
	 */
	RequestStatus getStatus();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getStatus <em>Status</em>}' attribute.
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
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentRequestStatus_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // ComponentRequestStatus
