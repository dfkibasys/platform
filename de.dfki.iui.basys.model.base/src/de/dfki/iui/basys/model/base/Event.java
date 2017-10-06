/**
 */
package de.dfki.iui.basys.model.base;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.base.Event#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.base.BasePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Entity {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see de.dfki.iui.basys.model.base.BasePackage#getEvent_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.base.Event#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // Event
