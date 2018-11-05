/**
 */
package de.dfki.iui.basys.model.domain.linebalancing;

import de.dfki.iui.basys.model.domain.topology.TopologyElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WM Path Times</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes#getFrom <em>From</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMPathTimes()
 * @model
 * @generated
 */
public interface WMPathTimes extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(TopologyElement)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMPathTimes_From()
	 * @model
	 * @generated
	 */
	TopologyElement getFrom();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(TopologyElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMPathTimes_To()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMPathTime> getTo();

} // WMPathTimes
