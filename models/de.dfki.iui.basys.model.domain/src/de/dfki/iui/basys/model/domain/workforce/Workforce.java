/**
 */
package de.dfki.iui.basys.model.domain.workforce;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workforce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workforce.Workforce#getAgents <em>Agents</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.workforce.WorkforcePackage#getWorkforce()
 * @model
 * @generated
 */
public interface Workforce extends EObject {
	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.workforce.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.workforce.WorkforcePackage#getWorkforce_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

} // Workforce
