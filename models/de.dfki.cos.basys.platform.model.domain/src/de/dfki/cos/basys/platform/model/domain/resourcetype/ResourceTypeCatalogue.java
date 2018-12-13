/**
 */
package de.dfki.cos.basys.platform.model.domain.resourcetype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogue#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogue#getManufacturer <em>Manufacturer</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage#getResourceTypeCatalogue()
 * @model
 * @generated
 */
public interface ResourceTypeCatalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Types</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage#getResourceTypeCatalogue_ResourceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceType> getResourceTypes();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage#getResourceTypeCatalogue_Manufacturer()
	 * @model required="true"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogue#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

} // ResourceTypeCatalogue
