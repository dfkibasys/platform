/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance;

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
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication#getBomEntries <em>Bom Entries</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityApplication()
 * @model
 * @generated
 */
public interface CapabilityApplication extends EObject {
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
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getCapabilityApplication_BomEntries()
	 * @model
	 * @generated
	 */
	EList<de.dfki.iui.basys.model.domain.productdefinition.BOMEntry> getBomEntries();

} // CapabilityApplication
