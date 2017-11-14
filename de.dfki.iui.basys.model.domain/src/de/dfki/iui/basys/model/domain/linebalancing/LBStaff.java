/**
 */
package de.dfki.iui.basys.model.domain.linebalancing;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LB Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getComponentId_src <em>Component Id src</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getComponentId_target <em>Component Id target</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getCurrentProductInstanceId <em>Current Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getRemainingMovementTime <em>Remaining Movement Time</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBStaff()
 * @model
 * @generated
 */
public interface LBStaff extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' attribute.
	 * @see #setAssignment(String)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBStaff_Assignment()
	 * @model
	 * @generated
	 */
	String getAssignment();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getAssignment <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' attribute.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(String value);

	/**
	 * Returns the value of the '<em><b>Component Id src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id src</em>' attribute.
	 * @see #setComponentId_src(String)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBStaff_ComponentId_src()
	 * @model
	 * @generated
	 */
	String getComponentId_src();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getComponentId_src <em>Component Id src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id src</em>' attribute.
	 * @see #getComponentId_src()
	 * @generated
	 */
	void setComponentId_src(String value);

	/**
	 * Returns the value of the '<em><b>Component Id target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id target</em>' attribute.
	 * @see #setComponentId_target(String)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBStaff_ComponentId_target()
	 * @model
	 * @generated
	 */
	String getComponentId_target();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getComponentId_target <em>Component Id target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id target</em>' attribute.
	 * @see #getComponentId_target()
	 * @generated
	 */
	void setComponentId_target(String value);

	/**
	 * Returns the value of the '<em><b>Current Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Product Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Product Instance Id</em>' attribute.
	 * @see #setCurrentProductInstanceId(String)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBStaff_CurrentProductInstanceId()
	 * @model
	 * @generated
	 */
	String getCurrentProductInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getCurrentProductInstanceId <em>Current Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Product Instance Id</em>' attribute.
	 * @see #getCurrentProductInstanceId()
	 * @generated
	 */
	void setCurrentProductInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Remaining Movement Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Movement Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Movement Time</em>' attribute.
	 * @see #setRemainingMovementTime(long)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBStaff_RemainingMovementTime()
	 * @model
	 * @generated
	 */
	long getRemainingMovementTime();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getRemainingMovementTime <em>Remaining Movement Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Movement Time</em>' attribute.
	 * @see #getRemainingMovementTime()
	 * @generated
	 */
	void setRemainingMovementTime(long value);

} // LBStaff
