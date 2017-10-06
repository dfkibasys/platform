/**
 */
package de.dfki.iui.basys.model.domain.product;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * kann am ProductLifecycleService abgefragt (getCurrentStatus/ getStatusHistory) werden und wird kontinuierlich als Event publiziert, sollte man noch den Ort aufnehmen?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getWorkstepInstanceId <em>Workstep Instance Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstanceStatus()
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
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstanceStatus_ProductInstanceId()
	 * @model
	 * @generated
	 */
	String getProductInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getProductInstanceId <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Instance Id</em>' attribute.
	 * @see #getProductInstanceId()
	 * @generated
	 */
	void setProductInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum
	 * @see #setStatus(ProductInstanceStatusEnum)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstanceStatus_Status()
	 * @model
	 * @generated
	 */
	ProductInstanceStatusEnum getStatus();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProductInstanceStatusEnum value);

	/**
	 * Returns the value of the '<em><b>Workstep Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workstep Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workstep Instance Id</em>' attribute.
	 * @see #setWorkstepInstanceId(String)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstanceStatus_WorkstepInstanceId()
	 * @model
	 * @generated
	 */
	String getWorkstepInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getWorkstepInstanceId <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workstep Instance Id</em>' attribute.
	 * @see #getWorkstepInstanceId()
	 * @generated
	 */
	void setWorkstepInstanceId(String value);

} // ProductInstanceStatus
