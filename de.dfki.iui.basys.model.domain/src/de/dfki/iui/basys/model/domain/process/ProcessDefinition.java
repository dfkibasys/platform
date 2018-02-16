/**
 */
package de.dfki.iui.basys.model.domain.process;

import de.dfki.iui.basys.model.base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.ProcessDefinition#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.ProcessDefinition#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getProcessDefinition()
 * @model
 * @generated
 */
public interface ProcessDefinition extends Entity {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.process.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getProcessDefinition_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.process.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getProcessDefinition_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // ProcessDefinition
