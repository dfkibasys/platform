/**
 */
package de.dfki.iui.basys.model.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link de.dfki.iui.basys.model.domain.WorkstepInstance#getWorkstepId <em>Workstep Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.WorkstepInstance#getResourceInstanceIds <em>Resource Instance Ids</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkstepInstance()
 * @model
 * @generated
 */
public interface WorkstepInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Workstep Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workstep Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workstep Id</em>' attribute.
	 * @see #setWorkstepId(String)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkstepInstance_WorkstepId()
	 * @model
	 * @generated
	 */
	String getWorkstepId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.WorkstepInstance#getWorkstepId <em>Workstep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workstep Id</em>' attribute.
	 * @see #getWorkstepId()
	 * @generated
	 */
	void setWorkstepId(String value);

	/**
	 * Returns the value of the '<em><b>Resource Instance Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Instance Ids</em>' attribute list.
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkstepInstance_ResourceInstanceIds()
	 * @model
	 * @generated
	 */
	EList<String> getResourceInstanceIds();

} // WorkstepInstance
