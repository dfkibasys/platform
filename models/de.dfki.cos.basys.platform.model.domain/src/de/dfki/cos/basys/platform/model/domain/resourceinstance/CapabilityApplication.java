/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import de.dfki.cos.basys.platform.model.domain.capability.CapabilityAssertion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication#getCapabilityAssertion <em>Capability Assertion</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication#getCapabilityVariants <em>Capability Variants</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityApplication()
 * @model
 * @generated
 */
public interface CapabilityApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Capability Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Assertion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Assertion</em>' reference.
	 * @see #setCapabilityAssertion(CapabilityAssertion)
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityApplication_CapabilityAssertion()
	 * @model
	 * @generated
	 */
	CapabilityAssertion getCapabilityAssertion();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication#getCapabilityAssertion <em>Capability Assertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Assertion</em>' reference.
	 * @see #getCapabilityAssertion()
	 * @generated
	 */
	void setCapabilityAssertion(CapabilityAssertion value);

	/**
	 * Returns the value of the '<em><b>Capability Variants</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityVariant}<code>&lt;?, ?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Variants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Variants</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityApplication_CapabilityVariants()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityVariant<?, ?>> getCapabilityVariants();

} // CapabilityApplication
