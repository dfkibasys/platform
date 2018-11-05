/**
 */
package de.dfki.iui.basys.model.domain.linebalancing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LB Locations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.LBLocations#getStaff <em>Staff</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.LBLocations#getProductInstances <em>Product Instances</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBLocations()
 * @model
 * @generated
 */
public interface LBLocations extends EObject {
	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBLocations_Staff()
	 * @model containment="true"
	 * @generated
	 */
	EList<LBStaff> getStaff();

	/**
	 * Returns the value of the '<em><b>Product Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Instances</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getLBLocations_ProductInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<LBProductInstance> getProductInstances();

} // LBLocations
