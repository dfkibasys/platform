/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;

import de.dfki.cos.basys.platform.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getEdge()
 * @model abstract="true"
 * @generated
 */
public interface Edge extends Entity {
	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(Node)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getEdge_SourceRef()
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Node#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Node getSourceRef();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(Node value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(Node)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getEdge_TargetRef()
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.Node#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Node getTargetRef();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Edge#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(Node value);

} // Edge
