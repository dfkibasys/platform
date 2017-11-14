/**
 */
package de.dfki.iui.basys.model.domain.workplan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.Duration#getWorkstepInstanceId <em>Workstep Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.Duration#getAgentId <em>Agent Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.Duration#getAverage <em>Average</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.Duration#getStandardDeviation <em>Standard Deviation</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getDuration()
 * @model
 * @generated
 */
public interface Duration extends EObject {
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
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getDuration_WorkstepInstanceId()
	 * @model
	 * @generated
	 */
	String getWorkstepInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getWorkstepInstanceId <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workstep Instance Id</em>' attribute.
	 * @see #getWorkstepInstanceId()
	 * @generated
	 */
	void setWorkstepInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Agent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Id</em>' attribute.
	 * @see #setAgentId(String)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getDuration_AgentId()
	 * @model
	 * @generated
	 */
	String getAgentId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getAgentId <em>Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Id</em>' attribute.
	 * @see #getAgentId()
	 * @generated
	 */
	void setAgentId(String value);

	/**
	 * Returns the value of the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' attribute.
	 * @see #setAverage(double)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getDuration_Average()
	 * @model
	 * @generated
	 */
	double getAverage();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getAverage <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' attribute.
	 * @see #getAverage()
	 * @generated
	 */
	void setAverage(double value);

	/**
	 * Returns the value of the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Deviation</em>' attribute.
	 * @see #setStandardDeviation(double)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getDuration_StandardDeviation()
	 * @model
	 * @generated
	 */
	double getStandardDeviation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getStandardDeviation <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Deviation</em>' attribute.
	 * @see #getStandardDeviation()
	 * @generated
	 */
	void setStandardDeviation(double value);

} // Duration
