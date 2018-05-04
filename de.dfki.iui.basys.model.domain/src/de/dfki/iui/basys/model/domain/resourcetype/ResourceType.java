/**
 */
package de.dfki.iui.basys.model.domain.resourcetype;

import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.domain.capability.CapabilityAssertion;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getCapabilityAssertions <em>Capability Assertions</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage#getResourceType()
 * @model
 * @generated
 */
public interface ResourceType extends Entity {
	/**
	 * Returns the value of the '<em><b>Capability Assertions</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.capability.CapabilityAssertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Assertions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Assertions</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage#getResourceType_CapabilityAssertions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityAssertion> getCapabilityAssertions();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage#getResourceType_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.resourcetype.ResourceType#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

} // ResourceType
