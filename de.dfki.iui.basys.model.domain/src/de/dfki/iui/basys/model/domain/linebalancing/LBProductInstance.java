/**
 */
package de.dfki.iui.basys.model.domain.linebalancing;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LB Product Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getWorkstepInstanceId <em>Workstep Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getRemainingTime <em>Remaining Time</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBProductInstance()
 * @model
 * @generated
 */
public interface LBProductInstance extends IdentifiableEntity {
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
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBProductInstance_ComponentId()
	 * @model
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

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
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBProductInstance_WorkstepInstanceId()
	 * @model
	 * @generated
	 */
	String getWorkstepInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getWorkstepInstanceId <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workstep Instance Id</em>' attribute.
	 * @see #getWorkstepInstanceId()
	 * @generated
	 */
	void setWorkstepInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Remaining Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Time</em>' attribute.
	 * @see #setRemainingTime(long)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBProductInstance_RemainingTime()
	 * @model
	 * @generated
	 */
	long getRemainingTime();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getRemainingTime <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Time</em>' attribute.
	 * @see #getRemainingTime()
	 * @generated
	 */
	void setRemainingTime(long value);

} // LBProductInstance
