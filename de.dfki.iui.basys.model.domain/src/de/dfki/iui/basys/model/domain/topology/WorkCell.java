/**
 */
package de.dfki.iui.basys.model.domain.topology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.WorkCell#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getWorkCell()
 * @model
 * @generated
 */
public interface WorkCell extends WorkUnit {
	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference.
	 * @see #setStations(Station)
	 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getWorkCell_Stations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Station getStations();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.topology.WorkCell#getStations <em>Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stations</em>' containment reference.
	 * @see #getStations()
	 * @generated
	 */
	void setStations(Station value);

} // WorkCell
