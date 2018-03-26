/**
 */
package de.dfki.iui.basys.model.domain.resourcetype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type Catalogue Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogueCollection#getCatalogues <em>Catalogues</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage#getResourceTypeCatalogueCollection()
 * @model
 * @generated
 */
public interface ResourceTypeCatalogueCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalogues</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalogues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogues</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage#getResourceTypeCatalogueCollection_Catalogues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceTypeCatalogue> getCatalogues();

} // ResourceTypeCatalogueCollection
