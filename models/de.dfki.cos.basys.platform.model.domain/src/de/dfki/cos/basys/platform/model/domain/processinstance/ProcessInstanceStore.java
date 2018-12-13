/**
 */
package de.dfki.cos.basys.platform.model.domain.processinstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Instance Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstanceStore#getProcessInstances <em>Process Instances</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.processinstance.ProcessinstancePackage#getProcessInstanceStore()
 * @model
 * @generated
 */
public interface ProcessInstanceStore extends EObject {
	/**
	 * Returns the value of the '<em><b>Process Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Instances</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.processinstance.ProcessinstancePackage#getProcessInstanceStore_ProcessInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessInstance> getProcessInstances();

} // ProcessInstanceStore
