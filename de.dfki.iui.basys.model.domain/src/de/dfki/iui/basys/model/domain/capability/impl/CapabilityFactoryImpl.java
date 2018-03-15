/**
 */
package de.dfki.iui.basys.model.domain.capability.impl;

import de.dfki.iui.basys.model.domain.capability.*;

import org.eclipse.emf.ecore.EClass;
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
			case CapabilityPackage.CAPABILITY: return createCapability();
			case CapabilityPackage.HANDLING_CAPABILITY: return createHandlingCapability();
			case CapabilityPackage.MANUFACTURING_CAPABILITY: return createManufacturingCapability();
			case CapabilityPackage.FÜGEN: return createFügen();
			case CapabilityPackage.PRESSEN: return createPressen();
			case CapabilityPackage.QO_SCAPABILITY: return createQoSCapability();
			case CapabilityPackage.URFORMEN: return createUrformen();
			case CapabilityPackage.UMFORMEN: return createUmformen();
			case CapabilityPackage.TRENNEN: return createTrennen();
			case CapabilityPackage.BESCHICHTEN: return createBeschichten();
			case CapabilityPackage.STOFFEIGENSCHAFTEN: return createStoffeigenschaften();
			case CapabilityPackage.AN_EINPRESSEN: return createAnEinpressen();
			case CapabilityPackage.SCHRAUBEN: return createSchrauben();
			case CapabilityPackage.INFORMATION_TRANSFER_CAPABILITY: return createInformationTransferCapability();
			case CapabilityPackage.PROVIDE_INFORMATION: return createProvideInformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public Pressen createPressen() {
		PressenImpl pressen = new PressenImpl();
		return pressen;
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
	public Schrauben createSchrauben() {
		SchraubenImpl schrauben = new SchraubenImpl();
		return schrauben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationTransferCapability createInformationTransferCapability() {
		InformationTransferCapabilityImpl informationTransferCapability = new InformationTransferCapabilityImpl();
		return informationTransferCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvideInformation createProvideInformation() {
		ProvideInformationImpl provideInformation = new ProvideInformationImpl();
		return provideInformation;
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
