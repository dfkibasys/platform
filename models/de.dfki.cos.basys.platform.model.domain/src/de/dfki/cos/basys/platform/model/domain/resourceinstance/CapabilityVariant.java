/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.capability.Capability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityVariant#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityVariant#getAppliedOn <em>Applied On</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityVariant()
 * @model
 * @generated
 */
public interface CapabilityVariant<T extends Entity, C extends Capability> extends Entity {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference.
	 * @see #setCapability(Capability)
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityVariant_Capability()
	 * @model containment="true"
	 * @generated
	 */
	C getCapability();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityVariant#getCapability <em>Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' containment reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(C value);

	/**
	 * Returns the value of the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied On</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityVariant_AppliedOn()
	 * @model
	 * @generated
	 */
	EList<T> getAppliedOn();

} // CapabilityVariant
