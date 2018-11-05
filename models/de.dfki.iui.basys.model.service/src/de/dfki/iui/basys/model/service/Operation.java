/**
 */
package de.dfki.iui.basys.model.service;

import de.dfki.iui.basys.model.domain.capability.CapabilityAssertion;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.Operation#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.service.ServicePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EOperation {

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.capability.CapabilityAssertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getOperation_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityAssertion> getCapabilities();
} // Operation
