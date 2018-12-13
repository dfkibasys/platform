/**
 */
package de.dfki.cos.basys.platform.model.domain.workplan;

import de.dfki.cos.basys.platform.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workstep Instance Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workplan.WorkstepInstanceStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workplan.WorkstepInstanceStatus#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workplan.WorkstepInstanceStatus#getWorkstepInstanceId <em>Workstep Instance Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.workplan.WorkplanPackage#getWorkstepInstanceStatus()
 * @model
 * @generated
 */
public interface WorkstepInstanceStatus extends Entity {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.domain.workplan.WorkstepInstanceStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.workplan.WorkstepInstanceStatusEnum
	 * @see #setStatus(WorkstepInstanceStatusEnum)
	 * @see de.dfki.cos.basys.platform.model.domain.workplan.WorkplanPackage#getWorkstepInstanceStatus_Status()
	 * @model
	 * @generated
	 */
	WorkstepInstanceStatusEnum getStatus();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.workplan.WorkstepInstanceStatus#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.workplan.WorkstepInstanceStatusEnum
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(WorkstepInstanceStatusEnum value);

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
	 * @see de.dfki.cos.basys.platform.model.domain.workplan.WorkplanPackage#getWorkstepInstanceStatus_ProductInstanceId()
	 * @model
	 * @generated
	 */
	String getProductInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.workplan.WorkstepInstanceStatus#getProductInstanceId <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Instance Id</em>' attribute.
	 * @see #getProductInstanceId()
	 * @generated
	 */
	void setProductInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Workstep Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workstep Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workstep Instance Id</em>' attribute.
	 * @see #setWorkstepInstanceId(String)
	 * @see de.dfki.cos.basys.platform.model.domain.workplan.WorkplanPackage#getWorkstepInstanceStatus_WorkstepInstanceId()
	 * @model
	 * @generated
	 */
	String getWorkstepInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.workplan.WorkstepInstanceStatus#getWorkstepInstanceId <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workstep Instance Id</em>' attribute.
	 * @see #getWorkstepInstanceId()
	 * @generated
	 */
	void setWorkstepInstanceId(String value);

} // WorkstepInstanceStatus
