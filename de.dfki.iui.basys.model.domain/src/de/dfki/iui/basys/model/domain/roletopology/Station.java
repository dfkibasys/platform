/**
 */
package de.dfki.iui.basys.model.domain.roletopology;

import de.dfki.iui.basys.model.base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Äquivalent zu oder Spezialisierung zu WorkCell?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.Station#getEquipmentModules <em>Equipment Modules</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getStation()
 * @model
 * @generated
 */
public interface Station extends Entity {
	/**
	 * Returns the value of the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.roletopology.DiscreteManufacturingEquipmentModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Modules</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getStation_EquipmentModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiscreteManufacturingEquipmentModule> getEquipmentModules();

} // Station
