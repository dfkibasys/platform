/**
 */
package de.dfki.iui.basys.model.aas.impl;

import de.dfki.iui.basys.model.aas.*;

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
public class AasFactoryImpl extends EFactoryImpl implements AasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AasFactory init() {
		try {
			AasFactory theAasFactory = (AasFactory)EPackage.Registry.INSTANCE.getEFactory(AasPackage.eNS_URI);
			if (theAasFactory != null) {
				return theAasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AasFactoryImpl() {
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
			case AasPackage.ADMINISTRATION_SHELL: return createAdministrationShell();
			case AasPackage.INFORMATION_MAPPING: return createInformationMapping();
			case AasPackage.SERVICE_CALL: return createServiceCall();
			case AasPackage.PARAMETER_MAPPING: return createParameterMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationShell createAdministrationShell() {
		AdministrationShellImpl administrationShell = new AdministrationShellImpl();
		return administrationShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationMapping createInformationMapping() {
		InformationMappingImpl informationMapping = new InformationMappingImpl();
		return informationMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCall createServiceCall() {
		ServiceCallImpl serviceCall = new ServiceCallImpl();
		return serviceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMapping createParameterMapping() {
		ParameterMappingImpl parameterMapping = new ParameterMappingImpl();
		return parameterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AasPackage getAasPackage() {
		return (AasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AasPackage getPackage() {
		return AasPackage.eINSTANCE;
	}

} //AasFactoryImpl
