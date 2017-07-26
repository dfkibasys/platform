/**
 */
package de.dfki.iui.basys.model.service;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceInstance#getDescriptionId <em>Description Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceInstance#getImplementationId <em>Implementation Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceInstance#getEndpoints <em>Endpoints</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceInstance()
 * @model
 * @generated
 */
public interface ServiceInstance extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Description Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Id</em>' attribute.
	 * @see #setDescriptionId(String)
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceInstance_DescriptionId()
	 * @model
	 * @generated
	 */
	String getDescriptionId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.service.ServiceInstance#getDescriptionId <em>Description Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Id</em>' attribute.
	 * @see #getDescriptionId()
	 * @generated
	 */
	void setDescriptionId(String value);

	/**
	 * Returns the value of the '<em><b>Implementation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Id</em>' attribute.
	 * @see #setImplementationId(String)
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceInstance_ImplementationId()
	 * @model
	 * @generated
	 */
	String getImplementationId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.service.ServiceInstance#getImplementationId <em>Implementation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Id</em>' attribute.
	 * @see #getImplementationId()
	 * @generated
	 */
	void setImplementationId(String value);

	/**
	 * Returns the value of the '<em><b>Endpoints</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.service.ServiceEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoints</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceInstance_Endpoints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceEndpoint> getEndpoints();

} // ServiceInstance
