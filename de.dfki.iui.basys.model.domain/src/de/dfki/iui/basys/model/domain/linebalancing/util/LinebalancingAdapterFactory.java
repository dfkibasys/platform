/**
 */
package de.dfki.iui.basys.model.domain.linebalancing.util;

import de.dfki.iui.basys.model.domain.linebalancing.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage
 * @generated
 */
public class LinebalancingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LinebalancingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebalancingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LinebalancingPackage.eINSTANCE;
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
	protected LinebalancingSwitch<Adapter> modelSwitch =
		new LinebalancingSwitch<Adapter>() {
			@Override
			public Adapter caseWMPathTime(WMPathTime object) {
				return createWMPathTimeAdapter();
			}
			@Override
			public Adapter caseStaticWorldModel(StaticWorldModel object) {
				return createStaticWorldModelAdapter();
			}
			@Override
			public Adapter caseWMProductInstance(WMProductInstance object) {
				return createWMProductInstanceAdapter();
			}
			@Override
			public Adapter caseWMResourceInstance(WMResourceInstance object) {
				return createWMResourceInstanceAdapter();
			}
			@Override
			public Adapter caseWorldModel(WorldModel object) {
				return createWorldModelAdapter();
			}
			@Override
			public Adapter caseWMPathTimes(WMPathTimes object) {
				return createWMPathTimesAdapter();
			}
			@Override
			public Adapter caseLineBalancingAssignment(LineBalancingAssignment object) {
				return createLineBalancingAssignmentAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTime <em>WM Path Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMPathTime
	 * @generated
	 */
	public Adapter createWMPathTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.linebalancing.StaticWorldModel <em>Static World Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.StaticWorldModel
	 * @generated
	 */
	public Adapter createStaticWorldModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance <em>WM Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance
	 * @generated
	 */
	public Adapter createWMProductInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance <em>WM Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance
	 * @generated
	 */
	public Adapter createWMResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.linebalancing.WorldModel <em>World Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WorldModel
	 * @generated
	 */
	public Adapter createWorldModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes <em>WM Path Times</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes
	 * @generated
	 */
	public Adapter createWMPathTimesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment <em>Line Balancing Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment
	 * @generated
	 */
	public Adapter createLineBalancingAssignmentAdapter() {
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

} //LinebalancingAdapterFactory
