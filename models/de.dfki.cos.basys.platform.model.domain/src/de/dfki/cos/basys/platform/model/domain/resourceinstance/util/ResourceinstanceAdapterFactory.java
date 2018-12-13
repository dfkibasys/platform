/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance.util;

import de.dfki.cos.basys.platform.model.base.BObject;
import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.capability.Capability;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage
 * @generated
 */
public class ResourceinstanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourceinstancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceinstanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResourceinstancePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceinstanceSwitch<Adapter> modelSwitch =
		new ResourceinstanceSwitch<Adapter>() {
			@Override
			public Adapter caseResourceInstanceRepository(ResourceInstanceRepository object) {
				return createResourceInstanceRepositoryAdapter();
			}
			@Override
			public Adapter caseResourceInstance(ResourceInstance object) {
				return createResourceInstanceAdapter();
			}
			@Override
			public Adapter caseCapabilityApplication(CapabilityApplication object) {
				return createCapabilityApplicationAdapter();
			}
			@Override
			public <T extends Entity, C extends Capability> Adapter caseCapabilityVariant(CapabilityVariant<T, C> object) {
				return createCapabilityVariantAdapter();
			}
			@Override
			public Adapter caseManufacturingCapabilityVariant(ManufacturingCapabilityVariant object) {
				return createManufacturingCapabilityVariantAdapter();
			}
			@Override
			public Adapter caseLogisticsCapabilityVariant(LogisticsCapabilityVariant object) {
				return createLogisticsCapabilityVariantAdapter();
			}
			@Override
			public Adapter caseGeneralCapabilityVariant(GeneralCapabilityVariant object) {
				return createGeneralCapabilityVariantAdapter();
			}
			@Override
			public Adapter caseHandlingCapabilityVariant(HandlingCapabilityVariant object) {
				return createHandlingCapabilityVariantAdapter();
			}
			@Override
			public Adapter caseAssemblyCapabilityVariant(AssemblyCapabilityVariant object) {
				return createAssemblyCapabilityVariantAdapter();
			}
			@Override
			public Adapter caseBObject(BObject object) {
				return createBObjectAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstanceRepository <em>Resource Instance Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstanceRepository
	 * @generated
	 */
	public Adapter createResourceInstanceRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstance
	 * @generated
	 */
	public Adapter createResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication <em>Capability Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication
	 * @generated
	 */
	public Adapter createCapabilityApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityVariant <em>Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityVariant
	 * @generated
	 */
	public Adapter createCapabilityVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.ManufacturingCapabilityVariant <em>Manufacturing Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.ManufacturingCapabilityVariant
	 * @generated
	 */
	public Adapter createManufacturingCapabilityVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.LogisticsCapabilityVariant <em>Logistics Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.LogisticsCapabilityVariant
	 * @generated
	 */
	public Adapter createLogisticsCapabilityVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.GeneralCapabilityVariant <em>General Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.GeneralCapabilityVariant
	 * @generated
	 */
	public Adapter createGeneralCapabilityVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.HandlingCapabilityVariant <em>Handling Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.HandlingCapabilityVariant
	 * @generated
	 */
	public Adapter createHandlingCapabilityVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.AssemblyCapabilityVariant <em>Assembly Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.resourceinstance.AssemblyCapabilityVariant
	 * @generated
	 */
	public Adapter createAssemblyCapabilityVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.base.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.base.BObject
	 * @generated
	 */
	public Adapter createBObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.base.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ResourceinstanceAdapterFactory
