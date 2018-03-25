/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Instance Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * kann am ProductLifecycleService abgefragt (getCurrentStatus/ getStatusHistory) werden
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatus#getResourceInstanceId <em>Resource Instance Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getResourceInstanceStatus()
 * @model
 * @generated
 */
public interface ResourceInstanceStatus extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Instance Id</em>' attribute.
	 * @see #setResourceInstanceId(String)
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getResourceInstanceStatus_ResourceInstanceId()
	 * @model
	 * @generated
	 */
	String getResourceInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatus#getResourceInstanceId <em>Resource Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Instance Id</em>' attribute.
	 * @see #getResourceInstanceId()
	 * @generated
	 */
	void setResourceInstanceId(String value);

} // ResourceInstanceStatus
