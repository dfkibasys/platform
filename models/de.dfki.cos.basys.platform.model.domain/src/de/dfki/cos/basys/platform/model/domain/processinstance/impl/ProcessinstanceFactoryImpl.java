/**
 */
package de.dfki.cos.basys.platform.model.domain.processinstance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.cos.basys.platform.model.domain.processinstance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessinstanceFactoryImpl extends EFactoryImpl implements ProcessinstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessinstanceFactory init() {
		try {
			ProcessinstanceFactory theProcessinstanceFactory = (ProcessinstanceFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessinstancePackage.eNS_URI);
			if (theProcessinstanceFactory != null) {
				return theProcessinstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessinstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessinstanceFactoryImpl() {
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
			case ProcessinstancePackage.PROCESS_INSTANCE: return createProcessInstance();
			case ProcessinstancePackage.TASK_INSTANCE: return createTaskInstance();
			case ProcessinstancePackage.PROCESS_INSTANCE_STORE: return createProcessInstanceStore();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstance createProcessInstance() {
		ProcessInstanceImpl processInstance = new ProcessInstanceImpl();
		return processInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInstance createTaskInstance() {
		TaskInstanceImpl taskInstance = new TaskInstanceImpl();
		return taskInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstanceStore createProcessInstanceStore() {
		ProcessInstanceStoreImpl processInstanceStore = new ProcessInstanceStoreImpl();
		return processInstanceStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessinstancePackage getProcessinstancePackage() {
		return (ProcessinstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessinstancePackage getPackage() {
		return ProcessinstancePackage.eINSTANCE;
	}

} //ProcessinstanceFactoryImpl
