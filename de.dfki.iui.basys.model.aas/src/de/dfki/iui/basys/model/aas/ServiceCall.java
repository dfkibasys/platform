/**
 */
package de.dfki.iui.basys.model.aas;

import de.dfki.iui.basys.model.service.Operation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.aas.ServiceCall#getServiceInstanceId <em>Service Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.aas.ServiceCall#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.aas.ServiceCall#getParameterMappings <em>Parameter Mappings</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.aas.AasPackage#getServiceCall()
 * @model
 * @generated
 */
public interface ServiceCall extends EObject {
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
	 * @see de.dfki.iui.basys.model.aas.AasPackage#getServiceCall_ServiceInstanceId()
	 * @model
	 * @generated
	 */
	String getServiceInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.aas.ServiceCall#getServiceInstanceId <em>Service Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Instance Id</em>' attribute.
	 * @see #getServiceInstanceId()
	 * @generated
	 */
	void setServiceInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see de.dfki.iui.basys.model.aas.AasPackage#getServiceCall_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.aas.ServiceCall#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.aas.ParameterMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mappings</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.aas.AasPackage#getServiceCall_ParameterMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterMapping> getParameterMappings();

} // ServiceCall
