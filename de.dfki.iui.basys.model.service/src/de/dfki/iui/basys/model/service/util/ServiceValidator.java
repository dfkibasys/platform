/**
 */
package de.dfki.iui.basys.model.service.util;

import de.dfki.iui.basys.model.service.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.service.ServicePackage
 * @generated
 */
public class ServiceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ServiceValidator INSTANCE = new ServiceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.dfki.iui.basys.model.service";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreValidator ecoreValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceValidator() {
		super();
		ecoreValidator = EcoreValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ServicePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ServicePackage.SERVICE_DESCRIPTION:
				return validateServiceDescription((ServiceDescription)value, diagnostics, context);
			case ServicePackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case ServicePackage.PUBLICATION:
				return validatePublication((Publication)value, diagnostics, context);
			case ServicePackage.SUBSCRIPTION:
				return validateSubscription((Subscription)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDescription(ServiceDescription serviceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(serviceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceDescription_noSelfDependency(serviceDescription, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noSelfDependency constraint of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_DESCRIPTION__NO_SELF_DEPENDENCY__EEXPRESSION = "not dependencies->includes(self)";

	/**
	 * Validates the noSelfDependency constraint of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDescription_noSelfDependency(ServiceDescription serviceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServicePackage.Literals.SERVICE_DESCRIPTION,
				 serviceDescription,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noSelfDependency",
				 SERVICE_DESCRIPTION__NO_SELF_DEPENDENCY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(operation, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidLowerBound(operation, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidUpperBound(operation, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ConsistentBounds(operation, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidType(operation, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEOperation_UniqueParameterNames(operation, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEOperation_UniqueTypeParameterNames(operation, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEOperation_NoRepeatingVoid(operation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublication(Publication publication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(publication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(publication, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(publication, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidLowerBound(publication, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidUpperBound(publication, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ConsistentBounds(publication, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidType(publication, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscription(Subscription subscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subscription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidLowerBound(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidUpperBound(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ConsistentBounds(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidType(subscription, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ServiceValidator
