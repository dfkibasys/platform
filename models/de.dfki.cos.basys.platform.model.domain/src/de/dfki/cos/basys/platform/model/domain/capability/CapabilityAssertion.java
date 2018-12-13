/**
 */
package de.dfki.cos.basys.platform.model.domain.capability;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.pattern.PObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityAssertion#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityAssertion#getPrerequisites <em>Prerequisites</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getCapabilityAssertion()
 * @model
 * @generated
 */
public interface CapabilityAssertion extends Entity {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(PObject)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getCapabilityAssertion_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	PObject getPattern();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityAssertion#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PObject value);

	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prerequisites</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisites</em>' containment reference.
	 * @see #setPrerequisites(CapabilityAssertion)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getCapabilityAssertion_Prerequisites()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityAssertion getPrerequisites();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityAssertion#getPrerequisites <em>Prerequisites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerequisites</em>' containment reference.
	 * @see #getPrerequisites()
	 * @generated
	 */
	void setPrerequisites(CapabilityAssertion value);

} // CapabilityAssertion
