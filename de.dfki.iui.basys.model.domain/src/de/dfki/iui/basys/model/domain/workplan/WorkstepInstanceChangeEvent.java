/**
 */
package de.dfki.iui.basys.model.domain.workplan;

import de.dfki.iui.basys.model.base.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workstep Instance Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getWorkstepInstanceId <em>Workstep Instance Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getWorkstepInstanceChangeEvent()
 * @model
 * @generated
 */
public interface WorkstepInstanceChangeEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeType
	 * @see #setType(WorkstepInstanceChangeType)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getWorkstepInstanceChangeEvent_Type()
	 * @model
	 * @generated
	 */
	WorkstepInstanceChangeType getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeType
	 * @see #getType()
	 * @generated
	 */
	void setType(WorkstepInstanceChangeType value);

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
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getWorkstepInstanceChangeEvent_ProductInstanceId()
	 * @model
	 * @generated
	 */
	String getProductInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getProductInstanceId <em>Product Instance Id</em>}' attribute.
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
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getWorkstepInstanceChangeEvent_WorkstepInstanceId()
	 * @model
	 * @generated
	 */
	String getWorkstepInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getWorkstepInstanceId <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workstep Instance Id</em>' attribute.
	 * @see #getWorkstepInstanceId()
	 * @generated
	 */
	void setWorkstepInstanceId(String value);

} // WorkstepInstanceChangeEvent
