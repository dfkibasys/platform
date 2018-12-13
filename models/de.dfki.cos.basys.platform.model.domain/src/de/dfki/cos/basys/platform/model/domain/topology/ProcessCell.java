/**
 */
package de.dfki.cos.basys.platform.model.domain.topology;

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
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.ProcessCell#getProcessUnits <em>Process Units</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getProcessCell()
 * @model
 * @generated
 */
public interface ProcessCell extends WorkCenter {
	/**
	 * Returns the value of the '<em><b>Process Units</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.topology.ProcessUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Units</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getProcessCell_ProcessUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProcessUnit> getProcessUnits();

} // ProcessCell
