/**
 */
package de.dfki.iui.basys.model.domain.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resource.ResourceTypeCatalogue#getResourceTypes <em>Resource Types</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.resource.ResourcePackage#getResourceTypeCatalogue()
 * @model
 * @generated
 */
public interface ResourceTypeCatalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.resource.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Types</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.resource.ResourcePackage#getResourceTypeCatalogue_ResourceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceType> getResourceTypes();

} // ResourceTypeCatalogue
