/**
 */
package de.dfki.iui.basys.model.service;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ENamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceDescription#getVersion <em>Version</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceDescription#getOperations <em>Operations</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceDescription#getPublications <em>Publications</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceDescription#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceDescription#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noSelfDependency'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noSelfDependency='not dependencies->includes(self)'"
 * @generated
 */
public interface ServiceDescription extends ENamedElement, IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceDescription_Version()
	 * @model default=""
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.service.ServiceDescription#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.service.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceDescription_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Publications</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.service.Publication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publications</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceDescription_Publications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Publication> getPublications();

	/**
	 * Returns the value of the '<em><b>Subscriptions</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.service.Subscription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptions</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceDescription_Subscriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subscription> getSubscriptions();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.service.ServiceDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceDescription_Dependencies()
	 * @model
	 * @generated
	 */
	EList<ServiceDescription> getDependencies();

} // ServiceDescription
