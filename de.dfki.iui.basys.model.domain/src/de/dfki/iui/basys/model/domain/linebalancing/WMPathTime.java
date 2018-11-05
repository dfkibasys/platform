/**
 */
package de.dfki.iui.basys.model.domain.linebalancing;

import de.dfki.iui.basys.model.domain.topology.TopologyElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WM Path Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTime#getTime <em>Time</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTime#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMPathTime()
 * @model
 * @generated
 */
public interface WMPathTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMPathTime_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTime#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(TopologyElement)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMPathTime_To()
	 * @model
	 * @generated
	 */
	TopologyElement getTo();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTime#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(TopologyElement value);

} // WMPathTime
