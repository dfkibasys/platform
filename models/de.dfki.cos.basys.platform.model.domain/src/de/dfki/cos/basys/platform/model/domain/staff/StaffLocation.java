/**
 */
package de.dfki.cos.basys.platform.model.domain.staff;

import de.dfki.cos.basys.platform.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getDetectionType <em>Detection Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getStaffid <em>Staffid</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getComponentId <em>Component Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffPackage#getStaffLocation()
 * @model
 * @generated
 */
public interface StaffLocation extends Entity {
	/**
	 * Returns the value of the '<em><b>Detection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.domain.staff.StaffDetectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detection Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffDetectionEnum
	 * @see #setDetectionType(StaffDetectionEnum)
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffPackage#getStaffLocation_DetectionType()
	 * @model
	 * @generated
	 */
	StaffDetectionEnum getDetectionType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getDetectionType <em>Detection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detection Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffDetectionEnum
	 * @see #getDetectionType()
	 * @generated
	 */
	void setDetectionType(StaffDetectionEnum value);

	/**
	 * Returns the value of the '<em><b>Staffid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * workerId oder staffId?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staffid</em>' attribute.
	 * @see #setStaffid(String)
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffPackage#getStaffLocation_Staffid()
	 * @model
	 * @generated
	 */
	String getStaffid();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getStaffid <em>Staffid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staffid</em>' attribute.
	 * @see #getStaffid()
	 * @generated
	 */
	void setStaffid(String value);

	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Station einer Linie
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see de.dfki.cos.basys.platform.model.domain.staff.StaffPackage#getStaffLocation_ComponentId()
	 * @model
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.staff.StaffLocation#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

} // StaffLocation
