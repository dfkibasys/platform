/**
 */
package de.dfki.iui.basys.model.aas;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.dfki.iui.basys.model.aas.AasFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface AasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/aas";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AasPackage eINSTANCE = de.dfki.iui.basys.model.aas.impl.AasPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.aas.impl.AdministrationShellImpl <em>Administration Shell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.aas.impl.AdministrationShellImpl
	 * @see de.dfki.iui.basys.model.aas.impl.AasPackageImpl#getAdministrationShell()
	 * @generated
	 */
	int ADMINISTRATION_SHELL = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_SHELL__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_SHELL__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_SHELL__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_SHELL__ASSET_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_SHELL__MAPPINGS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operational Service Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_SHELL__OPERATIONAL_SERVICE_MAPPINGS = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Administration Shell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_SHELL_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_SHELL___GET = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Administration Shell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_SHELL_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.aas.impl.InformationMappingImpl <em>Information Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.aas.impl.InformationMappingImpl
	 * @see de.dfki.iui.basys.model.aas.impl.AasPackageImpl#getInformationMapping()
	 * @generated
	 */
	int INFORMATION_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MAPPING__ENTITY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Service Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MAPPING__SERVICE_CALL = 1;

	/**
	 * The number of structural features of the '<em>Information Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.aas.impl.ServiceCallImpl <em>Service Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.aas.impl.ServiceCallImpl
	 * @see de.dfki.iui.basys.model.aas.impl.AasPackageImpl#getServiceCall()
	 * @generated
	 */
	int SERVICE_CALL = 2;

	/**
	 * The feature id for the '<em><b>Service Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__SERVICE_INSTANCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__PARAMETER_MAPPINGS = 2;

	/**
	 * The number of structural features of the '<em>Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.aas.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.aas.impl.ParameterMappingImpl
	 * @see de.dfki.iui.basys.model.aas.impl.AasPackageImpl#getParameterMapping()
	 * @generated
	 */
	int PARAMETER_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.aas.impl.OperationalServiceMappingImpl <em>Operational Service Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.aas.impl.OperationalServiceMappingImpl
	 * @see de.dfki.iui.basys.model.aas.impl.AasPackageImpl#getOperationalServiceMapping()
	 * @generated
	 */
	int OPERATIONAL_SERVICE_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Service Description Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SERVICE_MAPPING__SERVICE_DESCRIPTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Service Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SERVICE_MAPPING__SERVICE_INSTANCE_ID = 1;

	/**
	 * The number of structural features of the '<em>Operational Service Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SERVICE_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operational Service Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SERVICE_MAPPING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.aas.AdministrationShell <em>Administration Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administration Shell</em>'.
	 * @see de.dfki.iui.basys.model.aas.AdministrationShell
	 * @generated
	 */
	EClass getAdministrationShell();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.aas.AdministrationShell#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see de.dfki.iui.basys.model.aas.AdministrationShell#getMappings()
	 * @see #getAdministrationShell()
	 * @generated
	 */
	EReference getAdministrationShell_Mappings();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.aas.AdministrationShell#getOperationalServiceMappings <em>Operational Service Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operational Service Mappings</em>'.
	 * @see de.dfki.iui.basys.model.aas.AdministrationShell#getOperationalServiceMappings()
	 * @see #getAdministrationShell()
	 * @generated
	 */
	EReference getAdministrationShell_OperationalServiceMappings();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.aas.AdministrationShell#getAssetId <em>Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Id</em>'.
	 * @see de.dfki.iui.basys.model.aas.AdministrationShell#getAssetId()
	 * @see #getAdministrationShell()
	 * @generated
	 */
	EAttribute getAdministrationShell_AssetId();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.aas.AdministrationShell#get() <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see de.dfki.iui.basys.model.aas.AdministrationShell#get()
	 * @generated
	 */
	EOperation getAdministrationShell__Get();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.aas.InformationMapping <em>Information Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Mapping</em>'.
	 * @see de.dfki.iui.basys.model.aas.InformationMapping
	 * @generated
	 */
	EClass getInformationMapping();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.aas.InformationMapping#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Type</em>'.
	 * @see de.dfki.iui.basys.model.aas.InformationMapping#getEntityType()
	 * @see #getInformationMapping()
	 * @generated
	 */
	EReference getInformationMapping_EntityType();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.aas.InformationMapping#getServiceCall <em>Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Call</em>'.
	 * @see de.dfki.iui.basys.model.aas.InformationMapping#getServiceCall()
	 * @see #getInformationMapping()
	 * @generated
	 */
	EReference getInformationMapping_ServiceCall();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.aas.ServiceCall <em>Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Call</em>'.
	 * @see de.dfki.iui.basys.model.aas.ServiceCall
	 * @generated
	 */
	EClass getServiceCall();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.aas.ServiceCall#getServiceInstanceId <em>Service Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.aas.ServiceCall#getServiceInstanceId()
	 * @see #getServiceCall()
	 * @generated
	 */
	EAttribute getServiceCall_ServiceInstanceId();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.aas.ServiceCall#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see de.dfki.iui.basys.model.aas.ServiceCall#getOperation()
	 * @see #getServiceCall()
	 * @generated
	 */
	EReference getServiceCall_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.aas.ServiceCall#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mappings</em>'.
	 * @see de.dfki.iui.basys.model.aas.ServiceCall#getParameterMappings()
	 * @see #getServiceCall()
	 * @generated
	 */
	EReference getServiceCall_ParameterMappings();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.aas.ParameterMapping <em>Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Mapping</em>'.
	 * @see de.dfki.iui.basys.model.aas.ParameterMapping
	 * @generated
	 */
	EClass getParameterMapping();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.aas.ParameterMapping#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see de.dfki.iui.basys.model.aas.ParameterMapping#getParameter()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.aas.ParameterMapping#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.basys.model.aas.ParameterMapping#getValue()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EAttribute getParameterMapping_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.aas.OperationalServiceMapping <em>Operational Service Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Service Mapping</em>'.
	 * @see de.dfki.iui.basys.model.aas.OperationalServiceMapping
	 * @generated
	 */
	EClass getOperationalServiceMapping();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.aas.OperationalServiceMapping#getServiceDescriptionId <em>Service Description Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Description Id</em>'.
	 * @see de.dfki.iui.basys.model.aas.OperationalServiceMapping#getServiceDescriptionId()
	 * @see #getOperationalServiceMapping()
	 * @generated
	 */
	EAttribute getOperationalServiceMapping_ServiceDescriptionId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.aas.OperationalServiceMapping#getServiceInstanceId <em>Service Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.aas.OperationalServiceMapping#getServiceInstanceId()
	 * @see #getOperationalServiceMapping()
	 * @generated
	 */
	EAttribute getOperationalServiceMapping_ServiceInstanceId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AasFactory getAasFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.aas.impl.AdministrationShellImpl <em>Administration Shell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.aas.impl.AdministrationShellImpl
		 * @see de.dfki.iui.basys.model.aas.impl.AasPackageImpl#getAdministrationShell()
		 * @generated
		 */
		EClass ADMINISTRATION_SHELL = eINSTANCE.getAdministrationShell();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATION_SHELL__MAPPINGS = eINSTANCE.getAdministrationShell_Mappings();

		/**
		 * The meta object literal for the '<em><b>Operational Service Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATION_SHELL__OPERATIONAL_SERVICE_MAPPINGS = eINSTANCE.getAdministrationShell_OperationalServiceMappings();

		/**
		 * The meta object literal for the '<em><b>Asset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATION_SHELL__ASSET_ID = eINSTANCE.getAdministrationShell_AssetId();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATION_SHELL___GET = eINSTANCE.getAdministrationShell__Get();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.aas.impl.InformationMappingImpl <em>Information Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.aas.impl.InformationMappingImpl
		 * @see de.dfki.iui.basys.model.aas.impl.AasPackageImpl#getInformationMapping()
		 * @generated
		 */
		EClass INFORMATION_MAPPING = eINSTANCE.getInformationMapping();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_MAPPING__ENTITY_TYPE = eINSTANCE.getInformationMapping_EntityType();

		/**
		 * The meta object literal for the '<em><b>Service Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_MAPPING__SERVICE_CALL = eINSTANCE.getInformationMapping_ServiceCall();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.aas.impl.ServiceCallImpl <em>Service Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.aas.impl.ServiceCallImpl
		 * @see de.dfki.iui.basys.model.aas.impl.AasPackageImpl#getServiceCall()
		 * @generated
		 */
		EClass SERVICE_CALL = eINSTANCE.getServiceCall();

		/**
		 * The meta object literal for the '<em><b>Service Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CALL__SERVICE_INSTANCE_ID = eINSTANCE.getServiceCall_ServiceInstanceId();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CALL__OPERATION = eINSTANCE.getServiceCall_Operation();

		/**
		 * The meta object literal for the '<em><b>Parameter Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CALL__PARAMETER_MAPPINGS = eINSTANCE.getServiceCall_ParameterMappings();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.aas.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.aas.impl.ParameterMappingImpl
		 * @see de.dfki.iui.basys.model.aas.impl.AasPackageImpl#getParameterMapping()
		 * @generated
		 */
		EClass PARAMETER_MAPPING = eINSTANCE.getParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__PARAMETER = eINSTANCE.getParameterMapping_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_MAPPING__VALUE = eINSTANCE.getParameterMapping_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.aas.impl.OperationalServiceMappingImpl <em>Operational Service Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.aas.impl.OperationalServiceMappingImpl
		 * @see de.dfki.iui.basys.model.aas.impl.AasPackageImpl#getOperationalServiceMapping()
		 * @generated
		 */
		EClass OPERATIONAL_SERVICE_MAPPING = eINSTANCE.getOperationalServiceMapping();

		/**
		 * The meta object literal for the '<em><b>Service Description Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_SERVICE_MAPPING__SERVICE_DESCRIPTION_ID = eINSTANCE.getOperationalServiceMapping_ServiceDescriptionId();

		/**
		 * The meta object literal for the '<em><b>Service Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_SERVICE_MAPPING__SERVICE_INSTANCE_ID = eINSTANCE.getOperationalServiceMapping_ServiceInstanceId();

	}

} //AasPackage
