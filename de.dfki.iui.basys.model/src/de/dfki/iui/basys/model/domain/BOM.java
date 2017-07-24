/**
 */
package de.dfki.iui.basys.model.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.BOM#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.DomainPackage#getBOM()
 * @model
 * @generated
 */
public interface BOM extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.BOMEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getBOM_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOMEntry> getEntries();

} // BOM
