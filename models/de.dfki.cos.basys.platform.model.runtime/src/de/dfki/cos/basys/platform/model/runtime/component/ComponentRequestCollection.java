/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection#getComponentRequests <em>Component Requests</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentRequestCollection()
 * @model
 * @generated
 */
public interface ComponentRequestCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Requests</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Requests</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Requests</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentRequestCollection_ComponentRequests()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentRequest> getComponentRequests();

} // ComponentRequestCollection
