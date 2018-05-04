/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance;

import de.dfki.iui.basys.model.domain.capability.CapabilityAssertion;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication#getCapabilityAssertion <em>Capability Assertion</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityApplication()
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
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityApplication_CapabilityAssertion()
	 * @model
	 * @generated
	 */
	CapabilityAssertion getCapabilityAssertion();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication#getCapabilityAssertion <em>Capability Assertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Assertion</em>' reference.
	 * @see #getCapabilityAssertion()
	 * @generated
	 */
	void setCapabilityAssertion(CapabilityAssertion value);

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' reference list.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityApplication_Variants()
	 * @model
	 * @generated
	 */
	EList<CapabilityVariant> getVariants();

} // CapabilityApplication
