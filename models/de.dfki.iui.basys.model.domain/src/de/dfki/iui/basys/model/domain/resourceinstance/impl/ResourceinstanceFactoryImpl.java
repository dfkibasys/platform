/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance.impl;

import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourceinstance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceinstanceFactoryImpl extends EFactoryImpl implements ResourceinstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceinstanceFactory init() {
		try {
			ResourceinstanceFactory theResourceinstanceFactory = (ResourceinstanceFactory)EPackage.Registry.INSTANCE.getEFactory(ResourceinstancePackage.eNS_URI);
			if (theResourceinstanceFactory != null) {
				return theResourceinstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourceinstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceinstanceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY: return createResourceInstanceRepository();
			case ResourceinstancePackage.RESOURCE_INSTANCE: return createResourceInstance();
			case ResourceinstancePackage.CAPABILITY_APPLICATION: return createCapabilityApplication();
			case ResourceinstancePackage.CAPABILITY_VARIANT: return createCapabilityVariant();
			case ResourceinstancePackage.MANUFACTURING_CAPABILITY_VARIANT: return createManufacturingCapabilityVariant();
			case ResourceinstancePackage.LOGISTICS_CAPABILITY_VARIANT: return createLogisticsCapabilityVariant();
			case ResourceinstancePackage.GENERAL_CAPABILITY_VARIANT: return createGeneralCapabilityVariant();
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT: return createHandlingCapabilityVariant();
			case ResourceinstancePackage.ASSEMBLY_CAPABILITY_VARIANT: return createAssemblyCapabilityVariant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstanceRepository createResourceInstanceRepository() {
		ResourceInstanceRepositoryImpl resourceInstanceRepository = new ResourceInstanceRepositoryImpl();
		return resourceInstanceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance createResourceInstance() {
		ResourceInstanceImpl resourceInstance = new ResourceInstanceImpl();
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityApplication createCapabilityApplication() {
		CapabilityApplicationImpl capabilityApplication = new CapabilityApplicationImpl();
		return capabilityApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Entity, C extends Capability> CapabilityVariant<T, C> createCapabilityVariant() {
		CapabilityVariantImpl<T, C> capabilityVariant = new CapabilityVariantImpl<T, C>();
		return capabilityVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingCapabilityVariant createManufacturingCapabilityVariant() {
		ManufacturingCapabilityVariantImpl manufacturingCapabilityVariant = new ManufacturingCapabilityVariantImpl();
		return manufacturingCapabilityVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticsCapabilityVariant createLogisticsCapabilityVariant() {
		LogisticsCapabilityVariantImpl logisticsCapabilityVariant = new LogisticsCapabilityVariantImpl();
		return logisticsCapabilityVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralCapabilityVariant createGeneralCapabilityVariant() {
		GeneralCapabilityVariantImpl generalCapabilityVariant = new GeneralCapabilityVariantImpl();
		return generalCapabilityVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlingCapabilityVariant createHandlingCapabilityVariant() {
		HandlingCapabilityVariantImpl handlingCapabilityVariant = new HandlingCapabilityVariantImpl();
		return handlingCapabilityVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyCapabilityVariant createAssemblyCapabilityVariant() {
		AssemblyCapabilityVariantImpl assemblyCapabilityVariant = new AssemblyCapabilityVariantImpl();
		return assemblyCapabilityVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceinstancePackage getResourceinstancePackage() {
		return (ResourceinstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourceinstancePackage getPackage() {
		return ResourceinstancePackage.eINSTANCE;
	}

} //ResourceinstanceFactoryImpl
