/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage
 * @generated
 */
public interface ResourceinstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceinstanceFactory eINSTANCE = de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Instance Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Instance Repository</em>'.
	 * @generated
	 */
	ResourceInstanceRepository createResourceInstanceRepository();

	/**
	 * Returns a new object of class '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Instance</em>'.
	 * @generated
	 */
	ResourceInstance createResourceInstance();

	/**
	 * Returns a new object of class '<em>Capability Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Application</em>'.
	 * @generated
	 */
	CapabilityApplication createCapabilityApplication();

	/**
	 * Returns a new object of class '<em>Capability Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Variant</em>'.
	 * @generated
	 */
	CapabilityVariant createCapabilityVariant();

	/**
	 * Returns a new object of class '<em>Resource Instance Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Instance Status</em>'.
	 * @generated
	 */
	ResourceInstanceStatus createResourceInstanceStatus();

	/**
	 * Returns a new object of class '<em>Resource Instance Status Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Instance Status Change Event</em>'.
	 * @generated
	 */
	ResourceInstanceStatusChangeEvent createResourceInstanceStatusChangeEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourceinstancePackage getResourceinstancePackage();

} //ResourceinstanceFactory
