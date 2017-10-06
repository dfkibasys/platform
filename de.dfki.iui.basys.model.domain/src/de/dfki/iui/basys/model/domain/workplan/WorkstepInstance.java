/**
 */
package de.dfki.iui.basys.model.domain.workplan;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workstep Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung Arbeitsschritt -> Betriebsmittel
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getStationId <em>Station Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#isIsAutomatic <em>Is Automatic</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getWorkstepInstance()
 * @model
 * @generated
 */
public interface WorkstepInstance extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * loc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getWorkstepInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Station Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Station Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Id</em>' attribute.
	 * @see #setStationId(String)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getWorkstepInstance_StationId()
	 * @model
	 * @generated
	 */
	String getStationId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getStationId <em>Station Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station Id</em>' attribute.
	 * @see #getStationId()
	 * @generated
	 */
	void setStationId(String value);

	/**
	 * Returns the value of the '<em><b>Is Automatic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Automatic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Automatic</em>' attribute.
	 * @see #setIsAutomatic(boolean)
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#getWorkstepInstance_IsAutomatic()
	 * @model
	 * @generated
	 */
	boolean isIsAutomatic();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#isIsAutomatic <em>Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Automatic</em>' attribute.
	 * @see #isIsAutomatic()
	 * @generated
	 */
	void setIsAutomatic(boolean value);

} // WorkstepInstance
