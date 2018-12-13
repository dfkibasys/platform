/**
 */
package de.dfki.cos.basys.platform.model.domain.productinstance.util;

import de.dfki.cos.basys.platform.model.base.BObject;
import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.productinstance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage
 * @generated
 */
public class ProductinstanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductinstancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductinstanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProductinstancePackage.eINSTANCE;
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
	protected ProductinstanceSwitch<Adapter> modelSwitch =
		new ProductinstanceSwitch<Adapter>() {
			@Override
			public Adapter caseProductInstance(ProductInstance object) {
				return createProductInstanceAdapter();
			}
			@Override
			public Adapter caseProductInstanceStatus(ProductInstanceStatus object) {
				return createProductInstanceStatusAdapter();
			}
			@Override
			public Adapter caseProductInstanceStatusChangeEvent(ProductInstanceStatusChangeEvent object) {
				return createProductInstanceStatusChangeEventAdapter();
			}
			@Override
			public Adapter caseProductInstanceLocation(ProductInstanceLocation object) {
				return createProductInstanceLocationAdapter();
			}
			@Override
			public Adapter caseProductInstanceLocationChangeEvent(ProductInstanceLocationChangeEvent object) {
				return createProductInstanceLocationChangeEventAdapter();
			}
			@Override
			public Adapter caseProductInstanceStore(ProductInstanceStore object) {
				return createProductInstanceStoreAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance
	 * @generated
	 */
	public Adapter createProductInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatus <em>Product Instance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatus
	 * @generated
	 */
	public Adapter createProductInstanceStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatusChangeEvent <em>Product Instance Status Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatusChangeEvent
	 * @generated
	 */
	public Adapter createProductInstanceStatusChangeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceLocation <em>Product Instance Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceLocation
	 * @generated
	 */
	public Adapter createProductInstanceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceLocationChangeEvent <em>Product Instance Location Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceLocationChangeEvent
	 * @generated
	 */
	public Adapter createProductInstanceLocationChangeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStore <em>Product Instance Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStore
	 * @generated
	 */
	public Adapter createProductInstanceStoreAdapter() {
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

} //ProductinstanceAdapterFactory
