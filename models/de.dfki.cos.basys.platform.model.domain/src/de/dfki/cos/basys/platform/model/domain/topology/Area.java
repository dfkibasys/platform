/**
 */
package de.dfki.cos.basys.platform.model.domain.topology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.Area#getWorkCenters <em>Work Centers</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.Area#getEquipmentModules <em>Equipment Modules</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends TopologyElement {
	/**
	 * Returns the value of the '<em><b>Work Centers</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.topology.WorkCenter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Centers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Centers</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getArea_WorkCenters()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkCenter> getWorkCenters();

	/**
	 * Returns the value of the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Modules</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getArea_EquipmentModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<EquipmentModule> getEquipmentModules();

} // Area
