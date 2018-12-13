/**
 */
package de.dfki.cos.basys.platform.model.domain.workplan.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.cos.basys.platform.model.domain.workplan.*;

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
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS: return createWorkstepInstanceStatus();
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT: return createWorkstepInstanceStatusChangeEvent();
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
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS_ENUM:
				return createWorkstepInstanceStatusEnumFromString(eDataType, initialValue);
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
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS_ENUM:
				return convertWorkstepInstanceStatusEnumToString(eDataType, instanceValue);
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
	public WorkstepInstanceStatus createWorkstepInstanceStatus() {
		WorkstepInstanceStatusImpl workstepInstanceStatus = new WorkstepInstanceStatusImpl();
		return workstepInstanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstepInstanceStatusChangeEvent createWorkstepInstanceStatusChangeEvent() {
		WorkstepInstanceStatusChangeEventImpl workstepInstanceStatusChangeEvent = new WorkstepInstanceStatusChangeEventImpl();
		return workstepInstanceStatusChangeEvent;
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
	public WorkstepInstanceStatusEnum createWorkstepInstanceStatusEnumFromString(EDataType eDataType, String initialValue) {
		WorkstepInstanceStatusEnum result = WorkstepInstanceStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkstepInstanceStatusEnumToString(EDataType eDataType, Object instanceValue) {
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
