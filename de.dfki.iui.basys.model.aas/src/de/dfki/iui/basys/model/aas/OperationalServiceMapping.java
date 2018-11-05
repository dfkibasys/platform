/**
 */
package de.dfki.iui.basys.model.aas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Service Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.aas.OperationalServiceMapping#getServiceDescriptionId <em>Service Description Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.aas.OperationalServiceMapping#getServiceInstanceId <em>Service Instance Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.aas.AasPackage#getOperationalServiceMapping()
 * @model
 * @generated
 */
public interface OperationalServiceMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Description Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Description Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Description Id</em>' attribute.
	 * @see #setServiceDescriptionId(String)
	 * @see de.dfki.iui.basys.model.aas.AasPackage#getOperationalServiceMapping_ServiceDescriptionId()
	 * @model
	 * @generated
	 */
	String getServiceDescriptionId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.aas.OperationalServiceMapping#getServiceDescriptionId <em>Service Description Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Id</em>' attribute.
	 * @see #getServiceDescriptionId()
	 * @generated
	 */
	void setServiceDescriptionId(String value);

	/**
	 * Returns the value of the '<em><b>Service Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Instance Id</em>' attribute.
	 * @see #setServiceInstanceId(String)
	 * @see de.dfki.iui.basys.model.aas.AasPackage#getOperationalServiceMapping_ServiceInstanceId()
	 * @model
	 * @generated
	 */
	String getServiceInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.aas.OperationalServiceMapping#getServiceInstanceId <em>Service Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Instance Id</em>' attribute.
	 * @see #getServiceInstanceId()
	 * @generated
	 */
	void setServiceInstanceId(String value);

} // OperationalServiceMapping
