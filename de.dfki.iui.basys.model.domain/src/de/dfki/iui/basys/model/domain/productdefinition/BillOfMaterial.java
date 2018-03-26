/**
 */
package de.dfki.iui.basys.model.domain.productdefinition;

import de.dfki.iui.basys.model.base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill Of Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.BillOfMaterial#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getBillOfMaterial()
 * @model
 * @generated
 */
public interface BillOfMaterial extends Entity {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.productdefinition.BOMEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getBillOfMaterial_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOMEntry> getEntries();

} // BillOfMaterial
