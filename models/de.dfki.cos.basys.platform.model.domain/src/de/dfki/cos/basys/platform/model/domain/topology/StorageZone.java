/**
 */
package de.dfki.cos.basys.platform.model.domain.topology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.StorageZone#getStorageUnits <em>Storage Units</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getStorageZone()
 * @model
 * @generated
 */
public interface StorageZone extends WorkCenter {
	/**
	 * Returns the value of the '<em><b>Storage Units</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.topology.StorageUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Units</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getStorageZone_StorageUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StorageUnit> getStorageUnits();

} // StorageZone
