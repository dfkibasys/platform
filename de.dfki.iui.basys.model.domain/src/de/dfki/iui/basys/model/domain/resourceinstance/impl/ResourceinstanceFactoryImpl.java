/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance.impl;

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
			case ResourceinstancePackage.RESOURCE_INSTANCE_STATUS: return createResourceInstanceStatus();
			case ResourceinstancePackage.RESOURCE_INSTANCE_STATUS_CHANGE_EVENT: return createResourceInstanceStatusChangeEvent();
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
	public ResourceInstanceStatus createResourceInstanceStatus() {
		ResourceInstanceStatusImpl resourceInstanceStatus = new ResourceInstanceStatusImpl();
		return resourceInstanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstanceStatusChangeEvent createResourceInstanceStatusChangeEvent() {
		ResourceInstanceStatusChangeEventImpl resourceInstanceStatusChangeEvent = new ResourceInstanceStatusChangeEventImpl();
		return resourceInstanceStatusChangeEvent;
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
