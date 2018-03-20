/**
 */
package de.dfki.iui.basys.model.domain.roletopology;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Manufacturing Equipment Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.DiscreteManufacturingEquipmentModule#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getDiscreteManufacturingEquipmentModule()
 * @model
 * @generated
 */
public interface DiscreteManufacturingEquipmentModule extends EquipmentModule {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.roletopology.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getDiscreteManufacturingEquipmentModule_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

} // DiscreteManufacturingEquipmentModule
