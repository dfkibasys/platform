/**
 */
package de.dfki.iui.basys.model.domain.workforce;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workforce.Group#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.workforce.WorkforcePackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Agent {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.workforce.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see de.dfki.iui.basys.model.domain.workforce.WorkforcePackage#getGroup_Members()
	 * @model
	 * @generated
	 */
	EList<Agent> getMembers();

} // Group
