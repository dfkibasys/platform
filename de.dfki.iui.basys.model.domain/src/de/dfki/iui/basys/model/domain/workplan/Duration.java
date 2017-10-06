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
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.Duration#getBeginnerLevel <em>Beginner Level</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.Duration#getBeginnerLevelDeviance <em>Beginner Level Deviance</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.Duration#getExpertLevel <em>Expert Level</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.Duration#getExpertLevelDeviance <em>Expert Level Deviance</em>}</li>
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
	 * Returns the value of the '<em><b>Beginner Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beginner Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginner Level</em>' attribute.
	 * @see #setBeginnerLevel(int)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getDuration_BeginnerLevel()
	 * @model
	 * @generated
	 */
	int getBeginnerLevel();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getBeginnerLevel <em>Beginner Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginner Level</em>' attribute.
	 * @see #getBeginnerLevel()
	 * @generated
	 */
	void setBeginnerLevel(int value);

	/**
	 * Returns the value of the '<em><b>Beginner Level Deviance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beginner Level Deviance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginner Level Deviance</em>' attribute.
	 * @see #setBeginnerLevelDeviance(int)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getDuration_BeginnerLevelDeviance()
	 * @model
	 * @generated
	 */
	int getBeginnerLevelDeviance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getBeginnerLevelDeviance <em>Beginner Level Deviance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginner Level Deviance</em>' attribute.
	 * @see #getBeginnerLevelDeviance()
	 * @generated
	 */
	void setBeginnerLevelDeviance(int value);

	/**
	 * Returns the value of the '<em><b>Expert Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expert Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expert Level</em>' attribute.
	 * @see #setExpertLevel(int)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getDuration_ExpertLevel()
	 * @model
	 * @generated
	 */
	int getExpertLevel();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getExpertLevel <em>Expert Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expert Level</em>' attribute.
	 * @see #getExpertLevel()
	 * @generated
	 */
	void setExpertLevel(int value);

	/**
	 * Returns the value of the '<em><b>Expert Level Deviance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expert Level Deviance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expert Level Deviance</em>' attribute.
	 * @see #setExpertLevelDeviance(int)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getDuration_ExpertLevelDeviance()
	 * @model
	 * @generated
	 */
	int getExpertLevelDeviance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getExpertLevelDeviance <em>Expert Level Deviance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expert Level Deviance</em>' attribute.
	 * @see #getExpertLevelDeviance()
	 * @generated
	 */
	void setExpertLevelDeviance(int value);

} // Duration
