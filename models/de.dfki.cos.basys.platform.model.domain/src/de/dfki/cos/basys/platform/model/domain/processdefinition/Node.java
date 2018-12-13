/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;

import org.eclipse.emf.common.util.EList;

import de.dfki.cos.basys.platform.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Node#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends Entity {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge}.
	 * It is bidirectional and its opposite is '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getNode_Outgoing()
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<Edge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge}.
	 * It is bidirectional and its opposite is '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getNode_Incoming()
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getTargetRef
	 * @model opposite="targetRef"
	 * @generated
	 */
	EList<Edge> getIncoming();

} // Node
