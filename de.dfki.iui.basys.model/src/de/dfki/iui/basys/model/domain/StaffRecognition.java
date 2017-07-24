/**
 */
package de.dfki.iui.basys.model.domain;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Recognition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.StaffRecognition#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.StaffRecognition#getWorkerId <em>Worker Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.StaffRecognition#getComponentId <em>Component Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.DomainPackage#getStaffRecognition()
 * @model
 * @generated
 */
public interface StaffRecognition extends Entity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.RecognitionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.RecognitionEnum
	 * @see #setType(RecognitionEnum)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getStaffRecognition_Type()
	 * @model
	 * @generated
	 */
	RecognitionEnum getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.StaffRecognition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.RecognitionEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(RecognitionEnum value);

	/**
	 * Returns the value of the '<em><b>Worker Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * workerId oder staffId?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Worker Id</em>' attribute.
	 * @see #setWorkerId(String)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getStaffRecognition_WorkerId()
	 * @model
	 * @generated
	 */
	String getWorkerId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.StaffRecognition#getWorkerId <em>Worker Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Id</em>' attribute.
	 * @see #getWorkerId()
	 * @generated
	 */
	void setWorkerId(String value);

	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Station einer Linie
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getStaffRecognition_ComponentId()
	 * @model
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.StaffRecognition#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

} // StaffRecognition
