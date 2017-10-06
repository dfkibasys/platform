/**
 */
package de.dfki.iui.basys.model.domain.topology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO: Zuweisung mobiler Betriebsmittel je Linie
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.ProductionLine#getWorkCells <em>Work Cells</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getProductionLine()
 * @model
 * @generated
 */
public interface ProductionLine extends WorkCenter {
	/**
	 * Returns the value of the '<em><b>Work Cells</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.topology.WorkCell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cells</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getProductionLine_WorkCells()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WorkCell> getWorkCells();

} // ProductionLine
