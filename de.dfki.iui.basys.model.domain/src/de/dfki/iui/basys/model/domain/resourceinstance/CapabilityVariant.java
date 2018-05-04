/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance;

import de.dfki.iui.basys.model.domain.capability.Capability;

import de.dfki.iui.basys.model.domain.productdefinition.BOMEntry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant#getBomEntries <em>Bom Entries</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityVariant()
 * @model
 * @generated
 */
public interface CapabilityVariant extends EObject {
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
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityVariant_Capability()
	 * @model containment="true"
	 * @generated
	 */
	Capability getCapability();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant#getCapability <em>Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' containment reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Capability value);

	/**
	 * Returns the value of the '<em><b>Bom Entries</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.productdefinition.BOMEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bom Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bom Entries</em>' reference list.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityVariant_BomEntries()
	 * @model
	 * @generated
	 */
	EList<BOMEntry> getBomEntries();

} // CapabilityVariant
