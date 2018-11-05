/**
 */
package de.dfki.iui.basys.model.domain.capability;

import de.dfki.iui.basys.model.domain.topology.TopologyElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move To Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.MoveToLocation#getTargetLocation <em>Target Location</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getMoveToLocation()
 * @model
 * @generated
 */
public interface MoveToLocation extends GeneralCapability {

	/**
	 * Returns the value of the '<em><b>Target Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Location</em>' reference.
	 * @see #setTargetLocation(TopologyElement)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getMoveToLocation_TargetLocation()
	 * @model
	 * @generated
	 */
	TopologyElement getTargetLocation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.MoveToLocation#getTargetLocation <em>Target Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Location</em>' reference.
	 * @see #getTargetLocation()
	 * @generated
	 */
	void setTargetLocation(TopologyElement value);
} // MoveToLocation
