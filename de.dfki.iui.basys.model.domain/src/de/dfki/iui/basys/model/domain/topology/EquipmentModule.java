/**
 */
package de.dfki.iui.basys.model.domain.topology;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ehemals ResourceInstance, TODO: mobile Betriebsmittel, z.B. Cobots
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.EquipmentModule#getControlModules <em>Control Modules</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.EquipmentModule#getEquipmentModules <em>Equipment Modules</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getEquipmentModule()
 * @model
 * @generated
 */
public interface EquipmentModule extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Control Modules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.topology.ControlModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Modules</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getEquipmentModule_ControlModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlModule> getControlModules();

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
	 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getEquipmentModule_EquipmentModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<EquipmentModule> getEquipmentModules();

} // EquipmentModule
