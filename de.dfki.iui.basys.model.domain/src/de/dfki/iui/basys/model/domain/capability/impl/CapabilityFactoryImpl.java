/**
 */
package de.dfki.iui.basys.model.domain.capability.impl;

import de.dfki.iui.basys.model.domain.capability.*;

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
public class CapabilityFactoryImpl extends EFactoryImpl implements CapabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapabilityFactory init() {
		try {
			CapabilityFactory theCapabilityFactory = (CapabilityFactory)EPackage.Registry.INSTANCE.getEFactory(CapabilityPackage.eNS_URI);
			if (theCapabilityFactory != null) {
				return theCapabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CapabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityFactoryImpl() {
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
			case CapabilityPackage.CAPABILITY_ASSERTION: return createCapabilityAssertion();
			case CapabilityPackage.CAPABILITY_REQUEST: return createCapabilityRequest();
			case CapabilityPackage.CAPABILITY: return createCapability();
			case CapabilityPackage.HANDLING_CAPABILITY: return createHandlingCapability();
			case CapabilityPackage.MANUFACTURING_CAPABILITY: return createManufacturingCapability();
			case CapabilityPackage.FÜGEN: return createFügen();
			case CapabilityPackage.PRESSING: return createPressing();
			case CapabilityPackage.URFORMEN: return createUrformen();
			case CapabilityPackage.UMFORMEN: return createUmformen();
			case CapabilityPackage.TRENNEN: return createTrennen();
			case CapabilityPackage.BESCHICHTEN: return createBeschichten();
			case CapabilityPackage.STOFFEIGENSCHAFTEN: return createStoffeigenschaften();
			case CapabilityPackage.AN_EINPRESSEN: return createAnEinpressen();
			case CapabilityPackage.SCREWING: return createScrewing();
			case CapabilityPackage.PRODUCTION_CAPABILITY: return createProductionCapability();
			case CapabilityPackage.LOGISTICS_CAPABILITY: return createLogisticsCapability();
			case CapabilityPackage.PICK_AND_PLACE: return createPickAndPlace();
			case CapabilityPackage.TRANSPORT: return createTransport();
			case CapabilityPackage.STORE: return createStore();
			case CapabilityPackage.QO_SCAPABILITY: return createQoSCapability();
			case CapabilityPackage.INSPECT: return createInspect();
			case CapabilityPackage.WORKER_ASSISTENCE_CAPABILITY: return createWorkerAssistenceCapability();
			case CapabilityPackage.GENERAL_CAPABILITY: return createGeneralCapability();
			case CapabilityPackage.MOVE_TO_LOCATION: return createMoveToLocation();
			case CapabilityPackage.PROJECT_PATH: return createProjectPath();
			case CapabilityPackage.PROJECT_ETA: return createProjectETA();
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
			case CapabilityPackage.LOAD_CARRIER_UNIT_ENUM:
				return createLoadCarrierUnitEnumFromString(eDataType, initialValue);
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
			case CapabilityPackage.LOAD_CARRIER_UNIT_ENUM:
				return convertLoadCarrierUnitEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityAssertion createCapabilityAssertion() {
		CapabilityAssertionImpl capabilityAssertion = new CapabilityAssertionImpl();
		return capabilityAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRequest createCapabilityRequest() {
		CapabilityRequestImpl capabilityRequest = new CapabilityRequestImpl();
		return capabilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlingCapability createHandlingCapability() {
		HandlingCapabilityImpl handlingCapability = new HandlingCapabilityImpl();
		return handlingCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingCapability createManufacturingCapability() {
		ManufacturingCapabilityImpl manufacturingCapability = new ManufacturingCapabilityImpl();
		return manufacturingCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fügen createFügen() {
		FügenImpl fügen = new FügenImpl();
		return fügen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pressing createPressing() {
		PressingImpl pressing = new PressingImpl();
		return pressing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCapability createQoSCapability() {
		QoSCapabilityImpl qoSCapability = new QoSCapabilityImpl();
		return qoSCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inspect createInspect() {
		InspectImpl inspect = new InspectImpl();
		return inspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkerAssistenceCapability createWorkerAssistenceCapability() {
		WorkerAssistenceCapabilityImpl workerAssistenceCapability = new WorkerAssistenceCapabilityImpl();
		return workerAssistenceCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralCapability createGeneralCapability() {
		GeneralCapabilityImpl generalCapability = new GeneralCapabilityImpl();
		return generalCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveToLocation createMoveToLocation() {
		MoveToLocationImpl moveToLocation = new MoveToLocationImpl();
		return moveToLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectPath createProjectPath() {
		ProjectPathImpl projectPath = new ProjectPathImpl();
		return projectPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectETA createProjectETA() {
		ProjectETAImpl projectETA = new ProjectETAImpl();
		return projectETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadCarrierUnitEnum createLoadCarrierUnitEnumFromString(EDataType eDataType, String initialValue) {
		LoadCarrierUnitEnum result = LoadCarrierUnitEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoadCarrierUnitEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Urformen createUrformen() {
		UrformenImpl urformen = new UrformenImpl();
		return urformen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Umformen createUmformen() {
		UmformenImpl umformen = new UmformenImpl();
		return umformen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trennen createTrennen() {
		TrennenImpl trennen = new TrennenImpl();
		return trennen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beschichten createBeschichten() {
		BeschichtenImpl beschichten = new BeschichtenImpl();
		return beschichten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stoffeigenschaften createStoffeigenschaften() {
		StoffeigenschaftenImpl stoffeigenschaften = new StoffeigenschaftenImpl();
		return stoffeigenschaften;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnEinpressen createAnEinpressen() {
		AnEinpressenImpl anEinpressen = new AnEinpressenImpl();
		return anEinpressen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing createScrewing() {
		ScrewingImpl screwing = new ScrewingImpl();
		return screwing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionCapability createProductionCapability() {
		ProductionCapabilityImpl productionCapability = new ProductionCapabilityImpl();
		return productionCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticsCapability createLogisticsCapability() {
		LogisticsCapabilityImpl logisticsCapability = new LogisticsCapabilityImpl();
		return logisticsCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PickAndPlace createPickAndPlace() {
		PickAndPlaceImpl pickAndPlace = new PickAndPlaceImpl();
		return pickAndPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport createTransport() {
		TransportImpl transport = new TransportImpl();
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPackage getCapabilityPackage() {
		return (CapabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CapabilityPackage getPackage() {
		return CapabilityPackage.eINSTANCE;
	}

} //CapabilityFactoryImpl
