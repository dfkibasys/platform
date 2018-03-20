/**
 */
package de.dfki.iui.basys.model.domain.roletopology;

import de.dfki.iui.basys.model.base.Entity;

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
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.Area#getWorkCenters <em>Work Centers</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.Area#getDiscretemanufacturingequipmentmodules <em>Discretemanufacturingequipmentmodules</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends Entity {
	/**
	 * Returns the value of the '<em><b>Work Centers</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.roletopology.WorkCenter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Centers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Centers</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getArea_WorkCenters()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkCenter> getWorkCenters();

	/**
	 * Returns the value of the '<em><b>Discretemanufacturingequipmentmodules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.roletopology.DiscreteManufacturingEquipmentModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discretemanufacturingequipmentmodules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discretemanufacturingequipmentmodules</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getArea_Discretemanufacturingequipmentmodules()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiscreteManufacturingEquipmentModule> getDiscretemanufacturingequipmentmodules();

} // Area
