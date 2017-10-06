/**
 */
package de.dfki.iui.basys.model.domain.topology;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.Area#getWorkCenters <em>Work Centers</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Work Centers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Centers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Centers</em>' containment reference.
	 * @see #setWorkCenters(WorkCenter)
	 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getArea_WorkCenters()
	 * @model containment="true"
	 * @generated
	 */
	WorkCenter getWorkCenters();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.topology.Area#getWorkCenters <em>Work Centers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Centers</em>' containment reference.
	 * @see #getWorkCenters()
	 * @generated
	 */
	void setWorkCenters(WorkCenter value);

} // Area
