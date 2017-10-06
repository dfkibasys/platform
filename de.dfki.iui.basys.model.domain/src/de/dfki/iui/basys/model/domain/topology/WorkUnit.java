/**
 */
package de.dfki.iui.basys.model.domain.topology;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.WorkUnit#getEquipmentModules <em>Equipment Modules</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getWorkUnit()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface WorkUnit extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.topology.EquipmentModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Modules</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getWorkUnit_EquipmentModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<EquipmentModule> getEquipmentModules();

} // WorkUnit
