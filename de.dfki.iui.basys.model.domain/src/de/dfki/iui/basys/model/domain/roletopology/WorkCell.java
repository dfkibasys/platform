/**
 */
package de.dfki.iui.basys.model.domain.roletopology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.WorkCell#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getWorkCell()
 * @model
 * @generated
 */
public interface WorkCell extends WorkUnit {
	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.roletopology.Station}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getWorkCell_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getStations();

} // WorkCell
