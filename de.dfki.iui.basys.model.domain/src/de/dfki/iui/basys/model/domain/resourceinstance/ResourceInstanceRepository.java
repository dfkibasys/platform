/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Instance Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository#getResourceInstances <em>Resource Instances</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getResourceInstanceRepository()
 * @model
 * @generated
 */
public interface ResourceInstanceRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Instances</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#getResourceInstanceRepository_ResourceInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInstance> getResourceInstances();

} // ResourceInstanceRepository
