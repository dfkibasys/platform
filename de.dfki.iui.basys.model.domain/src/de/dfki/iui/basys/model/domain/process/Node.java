/**
 */
package de.dfki.iui.basys.model.domain.process;

import de.dfki.iui.basys.model.base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.Node#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends Entity {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.process.Edge}.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.basys.model.domain.process.Edge#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getNode_Outgoing()
	 * @see de.dfki.iui.basys.model.domain.process.Edge#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<Edge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.process.Edge}.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.basys.model.domain.process.Edge#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getNode_Incoming()
	 * @see de.dfki.iui.basys.model.domain.process.Edge#getTargetRef
	 * @model opposite="targetRef"
	 * @generated
	 */
	EList<Edge> getIncoming();

} // Node
