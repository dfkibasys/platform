/**
 */
package de.dfki.cos.basys.platform.model.domain.linebalancing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static World Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.StaticWorldModel#getPathTimes <em>Path Times</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getStaticWorldModel()
 * @model
 * @generated
 */
public interface StaticWorldModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Path Times</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMPathTimes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Times</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Times</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getStaticWorldModel_PathTimes()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMPathTimes> getPathTimes();

} // StaticWorldModel
