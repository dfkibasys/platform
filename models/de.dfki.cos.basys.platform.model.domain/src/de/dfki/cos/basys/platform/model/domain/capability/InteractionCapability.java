/**
 */
package de.dfki.cos.basys.platform.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.InteractionCapability#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getInteractionCapability()
 * @model
 * @generated
 */
public interface InteractionCapability extends WorkerAssistenceCapability {
	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getInteractionCapability_Topic()
	 * @model
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.InteractionCapability#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

} // InteractionCapability
