/**
 */
package de.dfki.cos.basys.platform.model.domain.productinstance;

import de.dfki.cos.basys.platform.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Instance Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * kann am ProductLifecycleService abgefragt (getCurrentStatus/ getStatusHistory) werden
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatus#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatus#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage#getProductInstanceStatus()
 * @model
 * @generated
 */
public interface ProductInstanceStatus extends Entity {
	/**
	 * Returns the value of the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Instance Id</em>' attribute.
	 * @see #setProductInstanceId(String)
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage#getProductInstanceStatus_ProductInstanceId()
	 * @model
	 * @generated
	 */
	String getProductInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatus#getProductInstanceId <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Instance Id</em>' attribute.
	 * @see #getProductInstanceId()
	 * @generated
	 */
	void setProductInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatusEnum
	 * @see #setStatus(ProductInstanceStatusEnum)
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage#getProductInstanceStatus_Status()
	 * @model
	 * @generated
	 */
	ProductInstanceStatusEnum getStatus();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatus#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatusEnum
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProductInstanceStatusEnum value);

} // ProductInstanceStatus
