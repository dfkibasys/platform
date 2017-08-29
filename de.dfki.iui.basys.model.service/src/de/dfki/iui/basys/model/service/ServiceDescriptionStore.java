/**
 */
package de.dfki.iui.basys.model.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceDescriptionStore#getServiceDescriptions <em>Service Descriptions</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceDescriptionStore()
 * @model
 * @generated
 */
public interface ServiceDescriptionStore extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.service.ServiceDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Descriptions</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceDescriptionStore_ServiceDescriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceDescription> getServiceDescriptions();

} // ServiceDescriptionStore
