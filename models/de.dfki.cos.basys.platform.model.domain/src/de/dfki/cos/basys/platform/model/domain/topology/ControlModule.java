/**
 */
package de.dfki.cos.basys.platform.model.domain.topology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.ControlModule#getControlModules <em>Control Modules</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getControlModule()
 * @model
 * @generated
 */
public interface ControlModule extends TopologyElement {
	/**
	 * Returns the value of the '<em><b>Control Modules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.topology.ControlModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Modules</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getControlModule_ControlModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlModule> getControlModules();

} // ControlModule
