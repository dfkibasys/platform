/**
 */
package de.dfki.iui.basys.model.domain.workplan.impl;

import de.dfki.iui.basys.model.domain.workplan.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class WorkplanFactoryImpl extends EFactoryImpl implements WorkplanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkplanFactory init() {
		try {
			WorkplanFactory theWorkplanFactory = (WorkplanFactory)EPackage.Registry.INSTANCE.getEFactory(WorkplanPackage.eNS_URI);
			if (theWorkplanFactory != null) {
				return theWorkplanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkplanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkplanFactoryImpl() {
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
			case WorkplanPackage.WORKPLAN_INSTANCE: return createWorkplanInstance();
			case WorkplanPackage.WORKSTEP_INSTANCE: return createWorkstepInstance();
			case WorkplanPackage.WORKSTEP_INSTANCE_CHANGE_EVENT: return createWorkstepInstanceChangeEvent();
			case WorkplanPackage.DURATION: return createDuration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WorkplanPackage.WORKSTEP_INSTANCE_CHANGE_TYPE:
				return createWorkstepInstanceChangeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WorkplanPackage.WORKSTEP_INSTANCE_CHANGE_TYPE:
				return convertWorkstepInstanceChangeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkplanInstance createWorkplanInstance() {
		WorkplanInstanceImpl workplanInstance = new WorkplanInstanceImpl();
		return workplanInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstepInstance createWorkstepInstance() {
		WorkstepInstanceImpl workstepInstance = new WorkstepInstanceImpl();
		return workstepInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstepInstanceChangeEvent createWorkstepInstanceChangeEvent() {
		WorkstepInstanceChangeEventImpl workstepInstanceChangeEvent = new WorkstepInstanceChangeEventImpl();
		return workstepInstanceChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstepInstanceChangeType createWorkstepInstanceChangeTypeFromString(EDataType eDataType, String initialValue) {
		WorkstepInstanceChangeType result = WorkstepInstanceChangeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkstepInstanceChangeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkplanPackage getWorkplanPackage() {
		return (WorkplanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkplanPackage getPackage() {
		return WorkplanPackage.eINSTANCE;
	}

} //WorkplanFactoryImpl
