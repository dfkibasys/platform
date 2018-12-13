/**
 */
package de.dfki.cos.basys.platform.model.domain.linebalancing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WorldModel#getProductInstances <em>Product Instances</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WorldModel#getResourceInstances <em>Resource Instances</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getWorldModel()
 * @model
 * @generated
 */
public interface WorldModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Instances</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getWorldModel_ProductInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMProductInstance> getProductInstances();

	/**
	 * Returns the value of the '<em><b>Resource Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Instances</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getWorldModel_ResourceInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMResourceInstance> getResourceInstances();

} // WorldModel
