/**
 */
package de.dfki.iui.basys.model.domain.topology.util;

import de.dfki.iui.basys.model.base.BObject;
import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.domain.topology.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage
 * @generated
 */
public class TopologySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TopologyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologySwitch() {
		if (modelPackage == null) {
			modelPackage = TopologyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TopologyPackage.ENTERPRISE: {
				Enterprise enterprise = (Enterprise)theEObject;
				T result = caseEnterprise(enterprise);
				if (result == null) result = caseEntity(enterprise);
				if (result == null) result = caseBObject(enterprise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.SITE: {
				Site site = (Site)theEObject;
				T result = caseSite(site);
				if (result == null) result = caseEntity(site);
				if (result == null) result = caseBObject(site);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = caseEntity(area);
				if (result == null) result = caseBObject(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.WORK_CENTER: {
				WorkCenter workCenter = (WorkCenter)theEObject;
				T result = caseWorkCenter(workCenter);
				if (result == null) result = caseEntity(workCenter);
				if (result == null) result = caseBObject(workCenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.PROCESS_CELL: {
				ProcessCell processCell = (ProcessCell)theEObject;
				T result = caseProcessCell(processCell);
				if (result == null) result = caseWorkCenter(processCell);
				if (result == null) result = caseEntity(processCell);
				if (result == null) result = caseBObject(processCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.PRODUCTION_UNIT: {
				ProductionUnit productionUnit = (ProductionUnit)theEObject;
				T result = caseProductionUnit(productionUnit);
				if (result == null) result = caseWorkCenter(productionUnit);
				if (result == null) result = caseEntity(productionUnit);
				if (result == null) result = caseBObject(productionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.PRODUCTION_LINE: {
				ProductionLine productionLine = (ProductionLine)theEObject;
				T result = caseProductionLine(productionLine);
				if (result == null) result = caseWorkCenter(productionLine);
				if (result == null) result = caseEntity(productionLine);
				if (result == null) result = caseBObject(productionLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.STORAGE_ZONE: {
				StorageZone storageZone = (StorageZone)theEObject;
				T result = caseStorageZone(storageZone);
				if (result == null) result = caseWorkCenter(storageZone);
				if (result == null) result = caseEntity(storageZone);
				if (result == null) result = caseBObject(storageZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.WORK_UNIT: {
				WorkUnit workUnit = (WorkUnit)theEObject;
				T result = caseWorkUnit(workUnit);
				if (result == null) result = caseEntity(workUnit);
				if (result == null) result = caseBObject(workUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseWorkUnit(unit);
				if (result == null) result = caseEntity(unit);
				if (result == null) result = caseBObject(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.WORK_CELL: {
				WorkCell workCell = (WorkCell)theEObject;
				T result = caseWorkCell(workCell);
				if (result == null) result = caseWorkUnit(workCell);
				if (result == null) result = caseEntity(workCell);
				if (result == null) result = caseBObject(workCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.STORAGE_UNIT: {
				StorageUnit storageUnit = (StorageUnit)theEObject;
				T result = caseStorageUnit(storageUnit);
				if (result == null) result = caseWorkUnit(storageUnit);
				if (result == null) result = caseEntity(storageUnit);
				if (result == null) result = caseBObject(storageUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.EQUIPMENT_MODULE: {
				EquipmentModule equipmentModule = (EquipmentModule)theEObject;
				T result = caseEquipmentModule(equipmentModule);
				if (result == null) result = caseEntity(equipmentModule);
				if (result == null) result = caseBObject(equipmentModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.CONTROL_MODULE: {
				ControlModule controlModule = (ControlModule)theEObject;
				T result = caseControlModule(controlModule);
				if (result == null) result = caseEntity(controlModule);
				if (result == null) result = caseBObject(controlModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.STATION: {
				Station station = (Station)theEObject;
				T result = caseStation(station);
				if (result == null) result = caseEntity(station);
				if (result == null) result = caseBObject(station);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.ASSEMBLY_STATION: {
				AssemblyStation assemblyStation = (AssemblyStation)theEObject;
				T result = caseAssemblyStation(assemblyStation);
				if (result == null) result = caseStation(assemblyStation);
				if (result == null) result = caseEntity(assemblyStation);
				if (result == null) result = caseBObject(assemblyStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.BUFFER_STATION: {
				BufferStation bufferStation = (BufferStation)theEObject;
				T result = caseBufferStation(bufferStation);
				if (result == null) result = caseStation(bufferStation);
				if (result == null) result = caseEntity(bufferStation);
				if (result == null) result = caseBObject(bufferStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.PROCESS_UNIT: {
				ProcessUnit processUnit = (ProcessUnit)theEObject;
				T result = caseProcessUnit(processUnit);
				if (result == null) result = caseWorkUnit(processUnit);
				if (result == null) result = caseEntity(processUnit);
				if (result == null) result = caseBObject(processUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enterprise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enterprise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterprise(Enterprise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSite(Site object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Center</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Center</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkCenter(WorkCenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessCell(ProcessCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionUnit(ProductionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionLine(ProductionLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageZone(StorageZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkUnit(WorkUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkCell(WorkCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageUnit(StorageUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipmentModule(EquipmentModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlModule(ControlModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStation(Station object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyStation(AssemblyStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBufferStation(BufferStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessUnit(ProcessUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TopologySwitch
