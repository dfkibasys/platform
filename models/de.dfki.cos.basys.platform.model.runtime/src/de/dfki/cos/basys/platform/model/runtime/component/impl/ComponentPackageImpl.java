/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import de.dfki.cos.basys.platform.model.base.BasePackage;
import de.dfki.cos.basys.platform.model.data.DataPackage;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.material.MaterialPackage;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;
import de.dfki.cos.basys.platform.model.pattern.PatternPackage;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage;
import de.dfki.cos.basys.platform.model.runtime.communication.impl.CommunicationPackageImpl;
import de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ChangeModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.CommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse;
import de.dfki.cos.basys.platform.model.runtime.component.ControlCommand;
import de.dfki.cos.basys.platform.model.runtime.component.ControlMode;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel;
import de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest;
import de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse;
import de.dfki.cos.basys.platform.model.runtime.component.Property;
import de.dfki.cos.basys.platform.model.runtime.component.RequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.State;
import de.dfki.cos.basys.platform.model.runtime.component.StatusRequest;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;
import de.dfki.cos.basys.platform.model.runtime.component.VariableType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPackageImpl extends EPackageImpl implements ComponentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeModeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRequestStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRequestCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequestStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occupationLevelRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionModeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionCommandRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationModeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlCommandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionCommandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum occupationLevelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentPackageImpl() {
		super(eNS_URI, ComponentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ComponentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentPackage init() {
		if (isInited) return (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentPackageImpl theComponentPackage = registeredComponentPackage instanceof ComponentPackageImpl ? (ComponentPackageImpl)registeredComponentPackage : new ComponentPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();
		ProductdefinitionPackage.eINSTANCE.eClass();
		TopologyPackage.eINSTANCE.eClass();
		CapabilityPackage.eINSTANCE.eClass();
		MaterialPackage.eINSTANCE.eClass();
		ResourcetypePackage.eINSTANCE.eClass();
		ResourceinstancePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(registeredPackage instanceof CommunicationPackageImpl ? registeredPackage : CommunicationPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();

		// Initialize created meta-data
		theComponentPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentPackage.eNS_URI, theComponentPackage);
		return theComponentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInfo() {
		return componentInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_ComponentId() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_ComponentName() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_ComponentCategory() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_InChannelName() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_OutChannelName() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_StatusChannelName() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_CurrentState() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_CurrentMode() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_CommunicationProvider() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_ConnectionString() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_HostName() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_UriSpec() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_Connected() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentConfiguration() {
		return componentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_ComponentId() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_ComponentName() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_ComponentCategory() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_ComponentImplementationJavaClass() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_CommunicationProviderImplementationJavaClass() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_CommunicationProviderConnectionString() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_InChannelName() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_OutChannelName() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_ExternalConnectionString() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentConfiguration_Properties() {
		return (EReference)componentConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentConfiguration_SimulationConfiguration() {
		return (EReference)componentConfigurationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentConfiguration__GetProperty__String() {
		return componentConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Key() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRequest() {
		return componentRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRequest_ComponentId() {
		return (EAttribute)componentRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRequest_CorrelationId() {
		return (EAttribute)componentRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRequest_OccupierId() {
		return (EAttribute)componentRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRequest_InputParameters() {
		return (EReference)componentRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandRequest() {
		return commandRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandRequest_ControlCommand() {
		return (EAttribute)commandRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeModeRequest() {
		return changeModeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeModeRequest_Mode() {
		return (EAttribute)changeModeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityRequest() {
		return capabilityRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityRequest_CapabilityVariant() {
		return (EReference)capabilityRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRequestStatus() {
		return componentRequestStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRequestStatus_ComponentId() {
		return (EAttribute)componentRequestStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRequestStatus_Status() {
		return (EAttribute)componentRequestStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRequestStatus_Message() {
		return (EAttribute)componentRequestStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusRequest() {
		return statusRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentResponse() {
		return componentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentResponse_ComponentId() {
		return (EAttribute)componentResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentResponse_Status() {
		return (EAttribute)componentResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentResponse_StatusCode() {
		return (EAttribute)componentResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentResponse_Message() {
		return (EAttribute)componentResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentResponse_Request() {
		return (EReference)componentResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentResponse_OutputParameters() {
		return (EReference)componentResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRequestCollection() {
		return componentRequestCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRequestCollection_ComponentRequests() {
		return (EReference)componentRequestCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationConfiguration() {
		return simulationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnResettingDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnStartingDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnExecuteDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnCompletingDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnStoppingDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnAbortingDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnClearingDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnHoldingDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnUnholdingDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnSuspendingDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnUnsuspendingDuration() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationConfiguration_OnCompletingVariables() {
		return (EReference)simulationConfigurationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnCompletingStatusCode() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationConfiguration_OnStoppingStatusCode() {
		return (EAttribute)simulationConfigurationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequest() {
		return processRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessRequest_Name() {
		return (EAttribute)processRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessRequest_BusinessKey() {
		return (EAttribute)processRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Variables() {
		return (EReference)processRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequestStatus() {
		return processRequestStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessRequestStatus_ProcessInstanceId() {
		return (EAttribute)processRequestStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessRequestStatus_BusinessKey() {
		return (EAttribute)processRequestStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessRequestStatus_Status() {
		return (EAttribute)processRequestStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessRequestStatus_Message() {
		return (EAttribute)processRequestStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessResponse() {
		return processResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessResponse_ProcessInstanceId() {
		return (EAttribute)processResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessResponse_BusinessKey() {
		return (EAttribute)processResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessResponse_Status() {
		return (EAttribute)processResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessResponse_StatusCode() {
		return (EAttribute)processResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessResponse_Message() {
		return (EAttribute)processResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Request() {
		return (EReference)processResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_ResultVariables() {
		return (EReference)processResponseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccupationLevelRequest() {
		return occupationLevelRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccupationLevelRequest_OccupationLevel() {
		return (EAttribute)occupationLevelRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionModeRequest() {
		return executionModeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionModeRequest_ExecutionMode() {
		return (EAttribute)executionModeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionCommandRequest() {
		return executionCommandRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionCommandRequest_ExecutionCommand() {
		return (EAttribute)executionCommandRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationModeRequest() {
		return operationModeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationModeRequest_OperationMode() {
		return (EAttribute)operationModeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentCategory() {
		return componentCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlMode() {
		return controlModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlCommand() {
		return controlCommandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestStatus() {
		return requestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResponseStatus() {
		return responseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableType() {
		return variableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionMode() {
		return executionModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionCommand() {
		return executionCommandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOccupationLevel() {
		return occupationLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFactory getComponentFactory() {
		return (ComponentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentInfoEClass = createEClass(COMPONENT_INFO);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__COMPONENT_ID);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__COMPONENT_NAME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__COMPONENT_CATEGORY);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__IN_CHANNEL_NAME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__OUT_CHANNEL_NAME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__STATUS_CHANNEL_NAME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__CURRENT_STATE);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__CURRENT_MODE);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__COMMUNICATION_PROVIDER);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__CONNECTION_STRING);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__HOST_NAME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__URI_SPEC);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__CONNECTED);

		componentConfigurationEClass = createEClass(COMPONENT_CONFIGURATION);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT_ID);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT_NAME);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT_CATEGORY);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__IN_CHANNEL_NAME);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__PROPERTIES);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION);
		createEOperation(componentConfigurationEClass, COMPONENT_CONFIGURATION___GET_PROPERTY__STRING);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		componentRequestEClass = createEClass(COMPONENT_REQUEST);
		createEAttribute(componentRequestEClass, COMPONENT_REQUEST__COMPONENT_ID);
		createEAttribute(componentRequestEClass, COMPONENT_REQUEST__CORRELATION_ID);
		createEAttribute(componentRequestEClass, COMPONENT_REQUEST__OCCUPIER_ID);
		createEReference(componentRequestEClass, COMPONENT_REQUEST__INPUT_PARAMETERS);

		commandRequestEClass = createEClass(COMMAND_REQUEST);
		createEAttribute(commandRequestEClass, COMMAND_REQUEST__CONTROL_COMMAND);

		changeModeRequestEClass = createEClass(CHANGE_MODE_REQUEST);
		createEAttribute(changeModeRequestEClass, CHANGE_MODE_REQUEST__MODE);

		capabilityRequestEClass = createEClass(CAPABILITY_REQUEST);
		createEReference(capabilityRequestEClass, CAPABILITY_REQUEST__CAPABILITY_VARIANT);

		componentRequestStatusEClass = createEClass(COMPONENT_REQUEST_STATUS);
		createEAttribute(componentRequestStatusEClass, COMPONENT_REQUEST_STATUS__COMPONENT_ID);
		createEAttribute(componentRequestStatusEClass, COMPONENT_REQUEST_STATUS__STATUS);
		createEAttribute(componentRequestStatusEClass, COMPONENT_REQUEST_STATUS__MESSAGE);

		statusRequestEClass = createEClass(STATUS_REQUEST);

		componentResponseEClass = createEClass(COMPONENT_RESPONSE);
		createEAttribute(componentResponseEClass, COMPONENT_RESPONSE__COMPONENT_ID);
		createEAttribute(componentResponseEClass, COMPONENT_RESPONSE__STATUS);
		createEAttribute(componentResponseEClass, COMPONENT_RESPONSE__STATUS_CODE);
		createEAttribute(componentResponseEClass, COMPONENT_RESPONSE__MESSAGE);
		createEReference(componentResponseEClass, COMPONENT_RESPONSE__REQUEST);
		createEReference(componentResponseEClass, COMPONENT_RESPONSE__OUTPUT_PARAMETERS);

		componentRequestCollectionEClass = createEClass(COMPONENT_REQUEST_COLLECTION);
		createEReference(componentRequestCollectionEClass, COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VALUE);
		createEAttribute(variableEClass, VARIABLE__TYPE);

		simulationConfigurationEClass = createEClass(SIMULATION_CONFIGURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_RESETTING_DURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_STARTING_DURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_EXECUTE_DURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_COMPLETING_DURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_STOPPING_DURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_ABORTING_DURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_CLEARING_DURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_HOLDING_DURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_UNHOLDING_DURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_SUSPENDING_DURATION);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_UNSUSPENDING_DURATION);
		createEReference(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_COMPLETING_VARIABLES);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_COMPLETING_STATUS_CODE);
		createEAttribute(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ON_STOPPING_STATUS_CODE);

		processRequestEClass = createEClass(PROCESS_REQUEST);
		createEAttribute(processRequestEClass, PROCESS_REQUEST__NAME);
		createEAttribute(processRequestEClass, PROCESS_REQUEST__BUSINESS_KEY);
		createEReference(processRequestEClass, PROCESS_REQUEST__VARIABLES);

		processRequestStatusEClass = createEClass(PROCESS_REQUEST_STATUS);
		createEAttribute(processRequestStatusEClass, PROCESS_REQUEST_STATUS__PROCESS_INSTANCE_ID);
		createEAttribute(processRequestStatusEClass, PROCESS_REQUEST_STATUS__BUSINESS_KEY);
		createEAttribute(processRequestStatusEClass, PROCESS_REQUEST_STATUS__STATUS);
		createEAttribute(processRequestStatusEClass, PROCESS_REQUEST_STATUS__MESSAGE);

		processResponseEClass = createEClass(PROCESS_RESPONSE);
		createEAttribute(processResponseEClass, PROCESS_RESPONSE__PROCESS_INSTANCE_ID);
		createEAttribute(processResponseEClass, PROCESS_RESPONSE__BUSINESS_KEY);
		createEAttribute(processResponseEClass, PROCESS_RESPONSE__STATUS);
		createEAttribute(processResponseEClass, PROCESS_RESPONSE__STATUS_CODE);
		createEAttribute(processResponseEClass, PROCESS_RESPONSE__MESSAGE);
		createEReference(processResponseEClass, PROCESS_RESPONSE__REQUEST);
		createEReference(processResponseEClass, PROCESS_RESPONSE__RESULT_VARIABLES);

		occupationLevelRequestEClass = createEClass(OCCUPATION_LEVEL_REQUEST);
		createEAttribute(occupationLevelRequestEClass, OCCUPATION_LEVEL_REQUEST__OCCUPATION_LEVEL);

		executionModeRequestEClass = createEClass(EXECUTION_MODE_REQUEST);
		createEAttribute(executionModeRequestEClass, EXECUTION_MODE_REQUEST__EXECUTION_MODE);

		executionCommandRequestEClass = createEClass(EXECUTION_COMMAND_REQUEST);
		createEAttribute(executionCommandRequestEClass, EXECUTION_COMMAND_REQUEST__EXECUTION_COMMAND);

		operationModeRequestEClass = createEClass(OPERATION_MODE_REQUEST);
		createEAttribute(operationModeRequestEClass, OPERATION_MODE_REQUEST__OPERATION_MODE);

		// Create enums
		componentCategoryEEnum = createEEnum(COMPONENT_CATEGORY);
		stateEEnum = createEEnum(STATE);
		controlModeEEnum = createEEnum(CONTROL_MODE);
		controlCommandEEnum = createEEnum(CONTROL_COMMAND);
		requestStatusEEnum = createEEnum(REQUEST_STATUS);
		responseStatusEEnum = createEEnum(RESPONSE_STATUS);
		variableTypeEEnum = createEEnum(VARIABLE_TYPE);
		executionModeEEnum = createEEnum(EXECUTION_MODE);
		executionCommandEEnum = createEEnum(EXECUTION_COMMAND);
		occupationLevelEEnum = createEEnum(OCCUPATION_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ResourceinstancePackage theResourceinstancePackage = (ResourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commandRequestEClass.getESuperTypes().add(this.getComponentRequest());
		changeModeRequestEClass.getESuperTypes().add(this.getComponentRequest());
		capabilityRequestEClass.getESuperTypes().add(this.getComponentRequest());
		statusRequestEClass.getESuperTypes().add(this.getComponentRequest());
		occupationLevelRequestEClass.getESuperTypes().add(this.getComponentRequest());
		executionModeRequestEClass.getESuperTypes().add(this.getComponentRequest());
		executionCommandRequestEClass.getESuperTypes().add(this.getComponentRequest());
		operationModeRequestEClass.getESuperTypes().add(this.getComponentRequest());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentInfoEClass, ComponentInfo.class, "ComponentInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentInfo_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_ComponentName(), theEcorePackage.getEString(), "componentName", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_ComponentCategory(), this.getComponentCategory(), "componentCategory", "NONE", 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_InChannelName(), theEcorePackage.getEString(), "inChannelName", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_OutChannelName(), theEcorePackage.getEString(), "outChannelName", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_StatusChannelName(), theEcorePackage.getEString(), "statusChannelName", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_CurrentState(), this.getState(), "currentState", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_CurrentMode(), this.getControlMode(), "currentMode", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_CommunicationProvider(), theEcorePackage.getEString(), "communicationProvider", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_ConnectionString(), theEcorePackage.getEString(), "connectionString", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_HostName(), theEcorePackage.getEString(), "hostName", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_UriSpec(), theEcorePackage.getEString(), "uriSpec", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_Connected(), theEcorePackage.getEBoolean(), "connected", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentConfigurationEClass, ComponentConfiguration.class, "ComponentConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentConfiguration_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_ComponentName(), theEcorePackage.getEString(), "componentName", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_ComponentCategory(), this.getComponentCategory(), "componentCategory", "NONE", 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_ComponentImplementationJavaClass(), theEcorePackage.getEString(), "componentImplementationJavaClass", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_CommunicationProviderImplementationJavaClass(), theEcorePackage.getEString(), "communicationProviderImplementationJavaClass", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_CommunicationProviderConnectionString(), theEcorePackage.getEString(), "communicationProviderConnectionString", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_InChannelName(), theEcorePackage.getEString(), "inChannelName", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_OutChannelName(), theEcorePackage.getEString(), "outChannelName", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_ExternalConnectionString(), theEcorePackage.getEString(), "externalConnectionString", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentConfiguration_Properties(), this.getProperty(), null, "properties", null, 0, -1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentConfiguration_SimulationConfiguration(), this.getSimulationConfiguration(), null, "simulationConfiguration", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getComponentConfiguration__GetProperty__String(), this.getProperty(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRequestEClass, ComponentRequest.class, "ComponentRequest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentRequest_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequest_CorrelationId(), theEcorePackage.getEString(), "correlationId", null, 0, 1, ComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequest_OccupierId(), theEcorePackage.getEString(), "occupierId", null, 0, 1, ComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentRequest_InputParameters(), this.getVariable(), null, "inputParameters", null, 0, -1, ComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandRequestEClass, CommandRequest.class, "CommandRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandRequest_ControlCommand(), this.getControlCommand(), "controlCommand", null, 0, 1, CommandRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeModeRequestEClass, ChangeModeRequest.class, "ChangeModeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeModeRequest_Mode(), this.getControlMode(), "mode", null, 0, 1, ChangeModeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityRequestEClass, CapabilityRequest.class, "CapabilityRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(theResourceinstancePackage.getCapabilityVariant());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getCapabilityRequest_CapabilityVariant(), g1, null, "capabilityVariant", null, 0, 1, CapabilityRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRequestStatusEClass, ComponentRequestStatus.class, "ComponentRequestStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentRequestStatus_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequestStatus_Status(), this.getRequestStatus(), "status", null, 0, 1, ComponentRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequestStatus_Message(), theEcorePackage.getEString(), "message", null, 0, 1, ComponentRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusRequestEClass, StatusRequest.class, "StatusRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentResponseEClass, ComponentResponse.class, "ComponentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentResponse_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentResponse_Status(), this.getResponseStatus(), "status", null, 0, 1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentResponse_StatusCode(), theEcorePackage.getEInt(), "statusCode", null, 0, 1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentResponse_Message(), theEcorePackage.getEString(), "message", null, 0, 1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentResponse_Request(), this.getComponentRequest(), null, "request", null, 0, 1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentResponse_OutputParameters(), this.getVariable(), null, "outputParameters", null, 0, -1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRequestCollectionEClass, ComponentRequestCollection.class, "ComponentRequestCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentRequestCollection_ComponentRequests(), this.getComponentRequest(), null, "componentRequests", null, 0, -1, ComponentRequestCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), this.getVariableType(), "type", "", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulationConfigurationEClass, SimulationConfiguration.class, "SimulationConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulationConfiguration_OnResettingDuration(), theEcorePackage.getEInt(), "onResettingDuration", "1000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnStartingDuration(), theEcorePackage.getEInt(), "onStartingDuration", "1000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnExecuteDuration(), theEcorePackage.getEInt(), "onExecuteDuration", "3000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnCompletingDuration(), theEcorePackage.getEInt(), "onCompletingDuration", "1000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnStoppingDuration(), theEcorePackage.getEInt(), "onStoppingDuration", "1000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnAbortingDuration(), theEcorePackage.getEInt(), "onAbortingDuration", "1000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnClearingDuration(), theEcorePackage.getEInt(), "onClearingDuration", "1000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnHoldingDuration(), theEcorePackage.getEInt(), "onHoldingDuration", "1000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnUnholdingDuration(), theEcorePackage.getEInt(), "onUnholdingDuration", "1000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnSuspendingDuration(), theEcorePackage.getEInt(), "onSuspendingDuration", "1000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnUnsuspendingDuration(), theEcorePackage.getEInt(), "onUnsuspendingDuration", "1000", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationConfiguration_OnCompletingVariables(), this.getVariable(), null, "onCompletingVariables", null, 0, -1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnCompletingStatusCode(), theEcorePackage.getEInt(), "onCompletingStatusCode", "0", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationConfiguration_OnStoppingStatusCode(), theEcorePackage.getEInt(), "onStoppingStatusCode", "1", 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processRequestEClass, ProcessRequest.class, "ProcessRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessRequest_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ProcessRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessRequest_BusinessKey(), theEcorePackage.getEString(), "businessKey", null, 0, 1, ProcessRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessRequest_Variables(), this.getVariable(), null, "variables", null, 0, -1, ProcessRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processRequestStatusEClass, ProcessRequestStatus.class, "ProcessRequestStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessRequestStatus_ProcessInstanceId(), theEcorePackage.getEString(), "processInstanceId", null, 0, 1, ProcessRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessRequestStatus_BusinessKey(), theEcorePackage.getEString(), "businessKey", null, 0, 1, ProcessRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessRequestStatus_Status(), this.getRequestStatus(), "status", null, 0, 1, ProcessRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessRequestStatus_Message(), theEcorePackage.getEString(), "message", null, 0, 1, ProcessRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processResponseEClass, ProcessResponse.class, "ProcessResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessResponse_ProcessInstanceId(), theEcorePackage.getEString(), "processInstanceId", null, 0, 1, ProcessResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessResponse_BusinessKey(), theEcorePackage.getEString(), "businessKey", null, 0, 1, ProcessResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessResponse_Status(), this.getResponseStatus(), "status", null, 0, 1, ProcessResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessResponse_StatusCode(), theEcorePackage.getEInt(), "statusCode", null, 0, 1, ProcessResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessResponse_Message(), theEcorePackage.getEString(), "message", null, 0, 1, ProcessResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessResponse_Request(), this.getProcessRequest(), null, "request", null, 0, 1, ProcessResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessResponse_ResultVariables(), this.getVariable(), null, "resultVariables", null, 0, -1, ProcessResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(occupationLevelRequestEClass, OccupationLevelRequest.class, "OccupationLevelRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOccupationLevelRequest_OccupationLevel(), this.getOccupationLevel(), "occupationLevel", null, 0, 1, OccupationLevelRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionModeRequestEClass, ExecutionModeRequest.class, "ExecutionModeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionModeRequest_ExecutionMode(), this.getExecutionMode(), "executionMode", null, 0, 1, ExecutionModeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionCommandRequestEClass, ExecutionCommandRequest.class, "ExecutionCommandRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionCommandRequest_ExecutionCommand(), this.getExecutionCommand(), "executionCommand", null, 0, 1, ExecutionCommandRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationModeRequestEClass, OperationModeRequest.class, "OperationModeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationModeRequest_OperationMode(), theEcorePackage.getEString(), "operationMode", null, 0, 1, OperationModeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(componentCategoryEEnum, ComponentCategory.class, "ComponentCategory");
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.NONE);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.SERVICE_COMPONENT);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.DEVICE_COMPONENT);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.MANAGEMENT_COMPONENT);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.PROCESS_COMPONENT);

		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.UNDEFINED);
		addEEnumLiteral(stateEEnum, State.CLEARING);
		addEEnumLiteral(stateEEnum, State.STOPPED);
		addEEnumLiteral(stateEEnum, State.STARTING);
		addEEnumLiteral(stateEEnum, State.IDLE);
		addEEnumLiteral(stateEEnum, State.SUSPENDED);
		addEEnumLiteral(stateEEnum, State.EXECUTE);
		addEEnumLiteral(stateEEnum, State.STOPPING);
		addEEnumLiteral(stateEEnum, State.ABORTING);
		addEEnumLiteral(stateEEnum, State.ABORTED);
		addEEnumLiteral(stateEEnum, State.HOLDING);
		addEEnumLiteral(stateEEnum, State.HELD);
		addEEnumLiteral(stateEEnum, State.UNHOLDING);
		addEEnumLiteral(stateEEnum, State.SUSPENDING);
		addEEnumLiteral(stateEEnum, State.UNSUSPENDING);
		addEEnumLiteral(stateEEnum, State.RESETTING);
		addEEnumLiteral(stateEEnum, State.COMPLETING);
		addEEnumLiteral(stateEEnum, State.COMPLETE);

		initEEnum(controlModeEEnum, ControlMode.class, "ControlMode");
		addEEnumLiteral(controlModeEEnum, ControlMode.UNDEFINED);
		addEEnumLiteral(controlModeEEnum, ControlMode.PRODUCTION);
		addEEnumLiteral(controlModeEEnum, ControlMode.MAINTENANCE);
		addEEnumLiteral(controlModeEEnum, ControlMode.MANUAL);
		addEEnumLiteral(controlModeEEnum, ControlMode.CHANGE_OVER);
		addEEnumLiteral(controlModeEEnum, ControlMode.CLEAN);
		addEEnumLiteral(controlModeEEnum, ControlMode.SET_UP);
		addEEnumLiteral(controlModeEEnum, ControlMode.EMPTY_OUT);
		addEEnumLiteral(controlModeEEnum, ControlMode.SIMULATION);

		initEEnum(controlCommandEEnum, ControlCommand.class, "ControlCommand");
		addEEnumLiteral(controlCommandEEnum, ControlCommand.NO_COMMAND);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.RESET);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.START);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.STOP);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.HOLD);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.UNHOLD);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.SUSPEND);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.UNSUSPEND);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.ABORT);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.CLEAR);

		initEEnum(requestStatusEEnum, RequestStatus.class, "RequestStatus");
		addEEnumLiteral(requestStatusEEnum, RequestStatus.UNDEFINED);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.ACCEPTED);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.REJECTED);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.NOOP);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.QUEUED);

		initEEnum(responseStatusEEnum, ResponseStatus.class, "ResponseStatus");
		addEEnumLiteral(responseStatusEEnum, ResponseStatus.UNDEFINED);
		addEEnumLiteral(responseStatusEEnum, ResponseStatus.OK);
		addEEnumLiteral(responseStatusEEnum, ResponseStatus.NOT_OK);

		initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
		addEEnumLiteral(variableTypeEEnum, VariableType.NULL);
		addEEnumLiteral(variableTypeEEnum, VariableType.BOOLEAN);
		addEEnumLiteral(variableTypeEEnum, VariableType.INTEGER);
		addEEnumLiteral(variableTypeEEnum, VariableType.STRING);
		addEEnumLiteral(variableTypeEEnum, VariableType.DOUBLE);
		addEEnumLiteral(variableTypeEEnum, VariableType.LONG);
		addEEnumLiteral(variableTypeEEnum, VariableType.DATE);

		initEEnum(executionModeEEnum, ExecutionMode.class, "ExecutionMode");
		addEEnumLiteral(executionModeEEnum, ExecutionMode.PRODUCTION);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.MAINTENANCE);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.MANUAL);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.CHANGE_OVER);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.CLEAN);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.SET_UP);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.EMPTY_OUT);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.SIMULATION);

		initEEnum(executionCommandEEnum, ExecutionCommand.class, "ExecutionCommand");
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.RESET);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.START);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.STOP);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.HOLD);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.UNHOLD);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.SUSPEND);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.UNSUSPEND);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.ABORT);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.CLEAR);

		initEEnum(occupationLevelEEnum, OccupationLevel.class, "OccupationLevel");
		addEEnumLiteral(occupationLevelEEnum, OccupationLevel.FREE);
		addEEnumLiteral(occupationLevelEEnum, OccupationLevel.OCCUPIED);
		addEEnumLiteral(occupationLevelEEnum, OccupationLevel.PRIORITY);
		addEEnumLiteral(occupationLevelEEnum, OccupationLevel.LOCAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://de.dfki.iui.mmds/CoreModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCoreModelAnnotations() {
		String source = "http://de.dfki.iui.mmds/CoreModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

} //ComponentPackageImpl
