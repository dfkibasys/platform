/**
 */
package de.dfki.iui.basys.model.domain.product;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getDetectionType <em>Detection Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getComponentId <em>Component Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstanceLocation()
 * @model
 * @generated
 */
public interface ProductInstanceLocation extends Entity {
	/**
	 * Returns the value of the '<em><b>Detection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detection Type</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum
	 * @see #setDetectionType(ProductInstanceDetectionEnum)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstanceLocation_DetectionType()
	 * @model
	 * @generated
	 */
	ProductInstanceDetectionEnum getDetectionType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getDetectionType <em>Detection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detection Type</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum
	 * @see #getDetectionType()
	 * @generated
	 */
	void setDetectionType(ProductInstanceDetectionEnum value);

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
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstanceLocation_ProductInstanceId()
	 * @model
	 * @generated
	 */
	String getProductInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getProductInstanceId <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Instance Id</em>' attribute.
	 * @see #getProductInstanceId()
	 * @generated
	 */
	void setProductInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Station einer Linie, an der das Produkt ist oder von der sich das Produkt wegbewegt. Nicht das Ziel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductInstanceLocation_ComponentId()
	 * @model
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

} // ProductInstanceLocation
