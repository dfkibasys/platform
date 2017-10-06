/**
 */
package de.dfki.iui.basys.model.domain.workplan;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanFactory
 * @model kind="package"
 * @generated
 */
public interface WorkplanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workplan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/workplan";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workplan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkplanPackage eINSTANCE = de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkplanInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkplanInstance()
	 * @generated
	 */
	int WORKPLAN_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE__PRODUCT_INSTANCE_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workstep Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE__WORKSTEP_INSTANCES = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_INSTANCE_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl <em>Workstep Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstance()
	 * @generated
	 */
	int WORKSTEP_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__NAME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Station Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__STATION_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Automatic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__IS_AUTOMATIC = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workstep Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workstep Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceChangeEventImpl <em>Workstep Instance Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceChangeEventImpl
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstanceChangeEvent()
	 * @generated
	 */
	int WORKSTEP_INSTANCE_CHANGE_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_CHANGE_EVENT__METADATA = BasePackage.EVENT__METADATA;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_CHANGE_EVENT__TIMESTAMP = BasePackage.EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_CHANGE_EVENT__TYPE = BasePackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_CHANGE_EVENT__PRODUCT_INSTANCE_ID = BasePackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Workstep Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_CHANGE_EVENT__WORKSTEP_INSTANCE_ID = BasePackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workstep Instance Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_CHANGE_EVENT_FEATURE_COUNT = BasePackage.EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workstep Instance Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_CHANGE_EVENT_OPERATION_COUNT = BasePackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 3;

	/**
	 * The feature id for the '<em><b>Workstep Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__WORKSTEP_INSTANCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Beginner Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__BEGINNER_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Beginner Level Deviance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__BEGINNER_LEVEL_DEVIANCE = 2;

	/**
	 * The feature id for the '<em><b>Expert Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__EXPERT_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Expert Level Deviance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__EXPERT_LEVEL_DEVIANCE = 4;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeType <em>Workstep Instance Change Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeType
	 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstanceChangeType()
	 * @generated
	 */
	int WORKSTEP_INSTANCE_CHANGE_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.workplan.WorkplanInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanInstance
	 * @generated
	 */
	EClass getWorkplanInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkplanInstance#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanInstance#getProductInstanceId()
	 * @see #getWorkplanInstance()
	 * @generated
	 */
	EAttribute getWorkplanInstance_ProductInstanceId();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.domain.workplan.WorkplanInstance#getWorkstepInstances <em>Workstep Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workstep Instances</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanInstance#getWorkstepInstances()
	 * @see #getWorkplanInstance()
	 * @generated
	 */
	EReference getWorkplanInstance_WorkstepInstances();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance <em>Workstep Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstep Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstance
	 * @generated
	 */
	EClass getWorkstepInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getName()
	 * @see #getWorkstepInstance()
	 * @generated
	 */
	EAttribute getWorkstepInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getStationId <em>Station Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Station Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#getStationId()
	 * @see #getWorkstepInstance()
	 * @generated
	 */
	EAttribute getWorkstepInstance_StationId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#isIsAutomatic <em>Is Automatic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Automatic</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstance#isIsAutomatic()
	 * @see #getWorkstepInstance()
	 * @generated
	 */
	EAttribute getWorkstepInstance_IsAutomatic();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent <em>Workstep Instance Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstep Instance Change Event</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent
	 * @generated
	 */
	EClass getWorkstepInstanceChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getType()
	 * @see #getWorkstepInstanceChangeEvent()
	 * @generated
	 */
	EAttribute getWorkstepInstanceChangeEvent_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getProductInstanceId()
	 * @see #getWorkstepInstanceChangeEvent()
	 * @generated
	 */
	EAttribute getWorkstepInstanceChangeEvent_ProductInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getWorkstepInstanceId <em>Workstep Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent#getWorkstepInstanceId()
	 * @see #getWorkstepInstanceChangeEvent()
	 * @generated
	 */
	EAttribute getWorkstepInstanceChangeEvent_WorkstepInstanceId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.workplan.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getWorkstepInstanceId <em>Workstep Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration#getWorkstepInstanceId()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_WorkstepInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getBeginnerLevel <em>Beginner Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginner Level</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration#getBeginnerLevel()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_BeginnerLevel();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getBeginnerLevelDeviance <em>Beginner Level Deviance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginner Level Deviance</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration#getBeginnerLevelDeviance()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_BeginnerLevelDeviance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getExpertLevel <em>Expert Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expert Level</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration#getExpertLevel()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_ExpertLevel();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.workplan.Duration#getExpertLevelDeviance <em>Expert Level Deviance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expert Level Deviance</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.Duration#getExpertLevelDeviance()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_ExpertLevelDeviance();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeType <em>Workstep Instance Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Workstep Instance Change Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeType
	 * @generated
	 */
	EEnum getWorkstepInstanceChangeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkplanFactory getWorkplanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkplanInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkplanInstance()
		 * @generated
		 */
		EClass WORKPLAN_INSTANCE = eINSTANCE.getWorkplanInstance();

		/**
		 * The meta object literal for the '<em><b>Product Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKPLAN_INSTANCE__PRODUCT_INSTANCE_ID = eINSTANCE.getWorkplanInstance_ProductInstanceId();

		/**
		 * The meta object literal for the '<em><b>Workstep Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKPLAN_INSTANCE__WORKSTEP_INSTANCES = eINSTANCE.getWorkplanInstance_WorkstepInstances();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl <em>Workstep Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstance()
		 * @generated
		 */
		EClass WORKSTEP_INSTANCE = eINSTANCE.getWorkstepInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE__NAME = eINSTANCE.getWorkstepInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Station Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE__STATION_ID = eINSTANCE.getWorkstepInstance_StationId();

		/**
		 * The meta object literal for the '<em><b>Is Automatic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE__IS_AUTOMATIC = eINSTANCE.getWorkstepInstance_IsAutomatic();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceChangeEventImpl <em>Workstep Instance Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceChangeEventImpl
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstanceChangeEvent()
		 * @generated
		 */
		EClass WORKSTEP_INSTANCE_CHANGE_EVENT = eINSTANCE.getWorkstepInstanceChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE_CHANGE_EVENT__TYPE = eINSTANCE.getWorkstepInstanceChangeEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Product Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE_CHANGE_EVENT__PRODUCT_INSTANCE_ID = eINSTANCE.getWorkstepInstanceChangeEvent_ProductInstanceId();

		/**
		 * The meta object literal for the '<em><b>Workstep Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE_CHANGE_EVENT__WORKSTEP_INSTANCE_ID = eINSTANCE.getWorkstepInstanceChangeEvent_WorkstepInstanceId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Workstep Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__WORKSTEP_INSTANCE_ID = eINSTANCE.getDuration_WorkstepInstanceId();

		/**
		 * The meta object literal for the '<em><b>Beginner Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__BEGINNER_LEVEL = eINSTANCE.getDuration_BeginnerLevel();

		/**
		 * The meta object literal for the '<em><b>Beginner Level Deviance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__BEGINNER_LEVEL_DEVIANCE = eINSTANCE.getDuration_BeginnerLevelDeviance();

		/**
		 * The meta object literal for the '<em><b>Expert Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__EXPERT_LEVEL = eINSTANCE.getDuration_ExpertLevel();

		/**
		 * The meta object literal for the '<em><b>Expert Level Deviance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__EXPERT_LEVEL_DEVIANCE = eINSTANCE.getDuration_ExpertLevelDeviance();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeType <em>Workstep Instance Change Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeType
		 * @see de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl#getWorkstepInstanceChangeType()
		 * @generated
		 */
		EEnum WORKSTEP_INSTANCE_CHANGE_TYPE = eINSTANCE.getWorkstepInstanceChangeType();

	}

} //WorkplanPackage
