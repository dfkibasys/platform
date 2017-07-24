/**
 */
package de.dfki.iui.basys.model.physical.util;

import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.base.IdentifiableEntity;

import de.dfki.iui.basys.model.physical.*;

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
 * @see de.dfki.iui.basys.model.physical.PhysicalPackage
 * @generated
 */
public class PhysicalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhysicalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalSwitch() {
		if (modelPackage == null) {
			modelPackage = PhysicalPackage.eINSTANCE;
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
			case PhysicalPackage.ENTERPRISE: {
				Enterprise enterprise = (Enterprise)theEObject;
				T result = caseEnterprise(enterprise);
				if (result == null) result = caseIdentifiableEntity(enterprise);
				if (result == null) result = caseEntity(enterprise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.SITE: {
				Site site = (Site)theEObject;
				T result = caseSite(site);
				if (result == null) result = caseIdentifiableEntity(site);
				if (result == null) result = caseEntity(site);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = caseIdentifiableEntity(area);
				if (result == null) result = caseEntity(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.WORK_CENTER: {
				WorkCenter workCenter = (WorkCenter)theEObject;
				T result = caseWorkCenter(workCenter);
				if (result == null) result = caseIdentifiableEntity(workCenter);
				if (result == null) result = caseEntity(workCenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.PROCESS_CELL: {
				ProcessCell processCell = (ProcessCell)theEObject;
				T result = caseProcessCell(processCell);
				if (result == null) result = caseWorkCenter(processCell);
				if (result == null) result = caseIdentifiableEntity(processCell);
				if (result == null) result = caseEntity(processCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.PRODUCTION_UNIT: {
				ProductionUnit productionUnit = (ProductionUnit)theEObject;
				T result = caseProductionUnit(productionUnit);
				if (result == null) result = caseWorkCenter(productionUnit);
				if (result == null) result = caseIdentifiableEntity(productionUnit);
				if (result == null) result = caseEntity(productionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.PRODUCTION_LINE: {
				ProductionLine productionLine = (ProductionLine)theEObject;
				T result = caseProductionLine(productionLine);
				if (result == null) result = caseWorkCenter(productionLine);
				if (result == null) result = caseIdentifiableEntity(productionLine);
				if (result == null) result = caseEntity(productionLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.STORAGE_ZONE: {
				StorageZone storageZone = (StorageZone)theEObject;
				T result = caseStorageZone(storageZone);
				if (result == null) result = caseWorkCenter(storageZone);
				if (result == null) result = caseIdentifiableEntity(storageZone);
				if (result == null) result = caseEntity(storageZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.WORK_UNIT: {
				WorkUnit workUnit = (WorkUnit)theEObject;
				T result = caseWorkUnit(workUnit);
				if (result == null) result = caseIdentifiableEntity(workUnit);
				if (result == null) result = caseEntity(workUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseWorkUnit(unit);
				if (result == null) result = caseIdentifiableEntity(unit);
				if (result == null) result = caseEntity(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.WORK_CELL: {
				WorkCell workCell = (WorkCell)theEObject;
				T result = caseWorkCell(workCell);
				if (result == null) result = caseWorkUnit(workCell);
				if (result == null) result = caseIdentifiableEntity(workCell);
				if (result == null) result = caseEntity(workCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.STORAGE_UNIT: {
				StorageUnit storageUnit = (StorageUnit)theEObject;
				T result = caseStorageUnit(storageUnit);
				if (result == null) result = caseWorkUnit(storageUnit);
				if (result == null) result = caseIdentifiableEntity(storageUnit);
				if (result == null) result = caseEntity(storageUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.EQUIPMENT_MODULE: {
				EquipmentModule equipmentModule = (EquipmentModule)theEObject;
				T result = caseEquipmentModule(equipmentModule);
				if (result == null) result = caseIdentifiableEntity(equipmentModule);
				if (result == null) result = caseEntity(equipmentModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.CONTROL_MODULE: {
				ControlModule controlModule = (ControlModule)theEObject;
				T result = caseControlModule(controlModule);
				if (result == null) result = caseIdentifiableEntity(controlModule);
				if (result == null) result = caseEntity(controlModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.PRODUCTION_LINE_SECTION: {
				ProductionLineSection productionLineSection = (ProductionLineSection)theEObject;
				T result = caseProductionLineSection(productionLineSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalPackage.STATION: {
				Station station = (Station)theEObject;
				T result = caseStation(station);
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
	 * Returns the result of interpreting the object as an instance of '<em>Production Line Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Line Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionLineSection(ProductionLineSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiableEntity(IdentifiableEntity object) {
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

} //PhysicalSwitch
