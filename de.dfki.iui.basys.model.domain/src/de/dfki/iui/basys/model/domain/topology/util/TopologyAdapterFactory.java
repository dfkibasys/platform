/**
 */
package de.dfki.iui.basys.model.domain.topology.util;

import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.base.IdentifiableEntity;

import de.dfki.iui.basys.model.domain.topology.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage
 * @generated
 */
public class TopologyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TopologyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TopologyPackage.eINSTANCE;
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
	protected TopologySwitch<Adapter> modelSwitch =
		new TopologySwitch<Adapter>() {
			@Override
			public Adapter caseEnterprise(Enterprise object) {
				return createEnterpriseAdapter();
			}
			@Override
			public Adapter caseSite(Site object) {
				return createSiteAdapter();
			}
			@Override
			public Adapter caseArea(Area object) {
				return createAreaAdapter();
			}
			@Override
			public Adapter caseWorkCenter(WorkCenter object) {
				return createWorkCenterAdapter();
			}
			@Override
			public Adapter caseProcessCell(ProcessCell object) {
				return createProcessCellAdapter();
			}
			@Override
			public Adapter caseProductionUnit(ProductionUnit object) {
				return createProductionUnitAdapter();
			}
			@Override
			public Adapter caseProductionLine(ProductionLine object) {
				return createProductionLineAdapter();
			}
			@Override
			public Adapter caseStorageZone(StorageZone object) {
				return createStorageZoneAdapter();
			}
			@Override
			public Adapter caseWorkUnit(WorkUnit object) {
				return createWorkUnitAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseWorkCell(WorkCell object) {
				return createWorkCellAdapter();
			}
			@Override
			public Adapter caseStorageUnit(StorageUnit object) {
				return createStorageUnitAdapter();
			}
			@Override
			public Adapter caseEquipmentModule(EquipmentModule object) {
				return createEquipmentModuleAdapter();
			}
			@Override
			public Adapter caseControlModule(ControlModule object) {
				return createControlModuleAdapter();
			}
			@Override
			public Adapter caseProductionLineSection(ProductionLineSection object) {
				return createProductionLineSectionAdapter();
			}
			@Override
			public Adapter caseStation(Station object) {
				return createStationAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseIdentifiableEntity(IdentifiableEntity object) {
				return createIdentifiableEntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.Enterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.Enterprise
	 * @generated
	 */
	public Adapter createEnterpriseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.Site
	 * @generated
	 */
	public Adapter createSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.Area
	 * @generated
	 */
	public Adapter createAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.WorkCenter <em>Work Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.WorkCenter
	 * @generated
	 */
	public Adapter createWorkCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.ProcessCell <em>Process Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.ProcessCell
	 * @generated
	 */
	public Adapter createProcessCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.ProductionUnit <em>Production Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.ProductionUnit
	 * @generated
	 */
	public Adapter createProductionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.ProductionLine <em>Production Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.ProductionLine
	 * @generated
	 */
	public Adapter createProductionLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.StorageZone <em>Storage Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.StorageZone
	 * @generated
	 */
	public Adapter createStorageZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.WorkUnit <em>Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.WorkUnit
	 * @generated
	 */
	public Adapter createWorkUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.WorkCell <em>Work Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.WorkCell
	 * @generated
	 */
	public Adapter createWorkCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.StorageUnit <em>Storage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.StorageUnit
	 * @generated
	 */
	public Adapter createStorageUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.EquipmentModule <em>Equipment Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.EquipmentModule
	 * @generated
	 */
	public Adapter createEquipmentModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.ControlModule <em>Control Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.ControlModule
	 * @generated
	 */
	public Adapter createControlModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.ProductionLineSection <em>Production Line Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.ProductionLineSection
	 * @generated
	 */
	public Adapter createProductionLineSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.domain.topology.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.domain.topology.Station
	 * @generated
	 */
	public Adapter createStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.base.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.basys.model.base.IdentifiableEntity <em>Identifiable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.basys.model.base.IdentifiableEntity
	 * @generated
	 */
	public Adapter createIdentifiableEntityAdapter() {
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

} //TopologyAdapterFactory
