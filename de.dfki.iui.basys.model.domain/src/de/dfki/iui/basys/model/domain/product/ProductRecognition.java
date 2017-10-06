/**
 */
package de.dfki.iui.basys.model.domain.product;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recognition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Umbenennung ProductLocation? Kann diese Info auch am PLC-Dienst abgefragt werden? oder PromiseMonitoring?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductRecognition#getEventType <em>Event Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductRecognition#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ProductRecognition#getComponentId <em>Component Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductRecognition()
 * @model
 * @generated
 */
public interface ProductRecognition extends Entity {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.product.RecognitionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.product.RecognitionEnum
	 * @see #setEventType(RecognitionEnum)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductRecognition_EventType()
	 * @model
	 * @generated
	 */
	RecognitionEnum getEventType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductRecognition#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.product.RecognitionEnum
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(RecognitionEnum value);

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
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductRecognition_ProductInstanceId()
	 * @model
	 * @generated
	 */
	String getProductInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductRecognition#getProductInstanceId <em>Product Instance Id</em>}' attribute.
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
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getProductRecognition_ComponentId()
	 * @model
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ProductRecognition#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

} // ProductRecognition
