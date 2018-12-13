/**
 */
package de.dfki.cos.basys.platform.model.domain.capability;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import de.dfki.cos.basys.platform.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest#getWho <em>Who</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest#getWhat <em>What</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest#getWhom <em>Whom</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest#getWhere <em>Where</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest#getWhen <em>When</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest#getHow <em>How</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getCapabilityRequest()
 * @model
 * @generated
 */
public interface CapabilityRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' containment reference.
	 * @see #setWho(Entity)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getCapabilityRequest_Who()
	 * @model containment="true"
	 * @generated
	 */
	Entity getWho();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest#getWho <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' containment reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Entity value);

	/**
	 * Returns the value of the '<em><b>What</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>What</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What</em>' containment reference.
	 * @see #setWhat(Capability)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getCapabilityRequest_What()
	 * @model containment="true"
	 * @generated
	 */
	Capability getWhat();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest#getWhat <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What</em>' containment reference.
	 * @see #getWhat()
	 * @generated
	 */
	void setWhat(Capability value);

	/**
	 * Returns the value of the '<em><b>Whom</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.base.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whom</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whom</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getCapabilityRequest_Whom()
	 * @model
	 * @generated
	 */
	EList<Entity> getWhom();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.base.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getCapabilityRequest_Where()
	 * @model
	 * @generated
	 */
	EList<Entity> getWhere();

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(Date)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getCapabilityRequest_When()
	 * @model
	 * @generated
	 */
	Date getWhen();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Date value);

	/**
	 * Returns the value of the '<em><b>How</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.base.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>How</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>How</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getCapabilityRequest_How()
	 * @model
	 * @generated
	 */
	EList<Entity> getHow();

} // CapabilityRequest
