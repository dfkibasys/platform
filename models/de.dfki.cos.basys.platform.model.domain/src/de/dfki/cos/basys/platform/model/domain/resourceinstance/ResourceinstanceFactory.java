/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.capability.Capability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage
 * @generated
 */
public interface ResourceinstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceinstanceFactory eINSTANCE = de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.ResourceinstanceFactoryImpl.init();

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
	<T extends Entity, C extends Capability> CapabilityVariant<T, C> createCapabilityVariant();

	/**
	 * Returns a new object of class '<em>Manufacturing Capability Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manufacturing Capability Variant</em>'.
	 * @generated
	 */
	ManufacturingCapabilityVariant createManufacturingCapabilityVariant();

	/**
	 * Returns a new object of class '<em>Logistics Capability Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistics Capability Variant</em>'.
	 * @generated
	 */
	LogisticsCapabilityVariant createLogisticsCapabilityVariant();

	/**
	 * Returns a new object of class '<em>General Capability Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Capability Variant</em>'.
	 * @generated
	 */
	GeneralCapabilityVariant createGeneralCapabilityVariant();

	/**
	 * Returns a new object of class '<em>Handling Capability Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Handling Capability Variant</em>'.
	 * @generated
	 */
	HandlingCapabilityVariant createHandlingCapabilityVariant();

	/**
	 * Returns a new object of class '<em>Assembly Capability Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Capability Variant</em>'.
	 * @generated
	 */
	AssemblyCapabilityVariant createAssemblyCapabilityVariant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourceinstancePackage getResourceinstancePackage();

} //ResourceinstanceFactory
