/**
 */
package de.dfki.iui.basys.model.service;

import de.dfki.iui.basys.model.domain.capability.Capability;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.Subscription#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.service.ServicePackage#getSubscription()
 * @model
 * @generated
 */
public interface Subscription extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference.
	 * @see #setCapability(Capability)
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getSubscription_Capability()
	 * @model containment="true"
	 * @generated
	 */
	Capability getCapability();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.service.Subscription#getCapability <em>Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' containment reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Capability value);

} // Subscription
