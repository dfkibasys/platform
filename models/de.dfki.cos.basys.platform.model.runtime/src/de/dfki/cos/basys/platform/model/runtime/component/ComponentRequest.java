/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getCorrelationId <em>Correlation Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getOccupierId <em>Occupier Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentRequest()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ComponentRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentRequest_ComponentId()
	 * @model
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

	/**
	 * Returns the value of the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Id</em>' attribute.
	 * @see #setCorrelationId(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentRequest_CorrelationId()
	 * @model
	 * @generated
	 */
	String getCorrelationId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getCorrelationId <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Id</em>' attribute.
	 * @see #getCorrelationId()
	 * @generated
	 */
	void setCorrelationId(String value);

	/**
	 * Returns the value of the '<em><b>Occupier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupier Id</em>' attribute.
	 * @see #setOccupierId(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentRequest_OccupierId()
	 * @model
	 * @generated
	 */
	String getOccupierId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getOccupierId <em>Occupier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupier Id</em>' attribute.
	 * @see #getOccupierId()
	 * @generated
	 */
	void setOccupierId(String value);

} // ComponentRequest
