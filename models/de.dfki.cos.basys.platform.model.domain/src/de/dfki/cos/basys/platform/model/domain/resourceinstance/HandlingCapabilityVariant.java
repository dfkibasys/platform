/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.capability.Handling;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handling Capability Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.HandlingCapabilityVariant#getObject <em>Object</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.HandlingCapabilityVariant#getFrom <em>From</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.HandlingCapabilityVariant#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage#getHandlingCapabilityVariant()
 * @model
 * @generated
 */
public interface HandlingCapabilityVariant extends CapabilityVariant<Entity, Handling> {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(Entity)
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage#getHandlingCapabilityVariant_Object()
	 * @model
	 * @generated
	 */
	Entity getObject();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.HandlingCapabilityVariant#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Entity value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Entity)
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage#getHandlingCapabilityVariant_From()
	 * @model
	 * @generated
	 */
	Entity getFrom();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.HandlingCapabilityVariant#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Entity value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Entity)
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage#getHandlingCapabilityVariant_To()
	 * @model
	 * @generated
	 */
	Entity getTo();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.HandlingCapabilityVariant#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Entity value);

} // HandlingCapabilityVariant
