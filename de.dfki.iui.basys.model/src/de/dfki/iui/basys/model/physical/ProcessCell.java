/**
 */
package de.dfki.iui.basys.model.physical;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.physical.ProcessCell#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.physical.PhysicalPackage#getProcessCell()
 * @model
 * @generated
 */
public interface ProcessCell extends WorkCenter {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.physical.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.physical.PhysicalPackage#getProcessCell_Units()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Unit> getUnits();

} // ProcessCell
