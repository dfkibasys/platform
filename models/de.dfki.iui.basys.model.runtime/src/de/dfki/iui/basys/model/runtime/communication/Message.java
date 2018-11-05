/**
 */
package de.dfki.iui.basys.model.runtime.communication;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.Message#getPayload <em>Payload</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends Entity {
	/**
	 * Returns the value of the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' attribute.
	 * @see #setPayload(String)
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getMessage_Payload()
	 * @model
	 * @generated
	 */
	String getPayload();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.communication.Message#getPayload <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' attribute.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(String value);

} // Message
