/**
 */
package de.dfki.iui.basys.model.aas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.aas.InformationMapping#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.aas.InformationMapping#getServiceCall <em>Service Call</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.aas.AasPackage#getInformationMapping()
 * @model
 * @generated
 */
public interface InformationMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' reference.
	 * @see #setEntityType(EClass)
	 * @see de.dfki.iui.basys.model.aas.AasPackage#getInformationMapping_EntityType()
	 * @model required="true"
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.aas.InformationMapping#getEntityType <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' reference.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(EClass value);

	/**
	 * Returns the value of the '<em><b>Service Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Call</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Call</em>' containment reference.
	 * @see #setServiceCall(ServiceCall)
	 * @see de.dfki.iui.basys.model.aas.AasPackage#getInformationMapping_ServiceCall()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceCall getServiceCall();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.aas.InformationMapping#getServiceCall <em>Service Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Call</em>' containment reference.
	 * @see #getServiceCall()
	 * @generated
	 */
	void setServiceCall(ServiceCall value);

} // InformationMapping
