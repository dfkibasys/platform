/**
 */
package de.dfki.iui.basys.model.domain.util;

import de.dfki.iui.basys.model.domain.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.DomainPackage
 * @generated
 */
public class DomainValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DomainValidator INSTANCE = new DomainValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.dfki.iui.basys.model.domain";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DomainPackage.eINSTANCE;
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
			case DomainPackage.DYNAMIC_LINE_BALANCING_RESULT:
				return validateDynamicLineBalancingResult((DynamicLineBalancingResult)value, diagnostics, context);
			case DomainPackage.INSTRUCTION:
				return validateInstruction((Instruction)value, diagnostics, context);
			case DomainPackage.MATERIAL:
				return validateMaterial((Material)value, diagnostics, context);
			case DomainPackage.MEDIA:
				return validateMedia((Media)value, diagnostics, context);
			case DomainPackage.AUDIO:
				return validateAudio((Audio)value, diagnostics, context);
			case DomainPackage.VIDEO:
				return validateVideo((Video)value, diagnostics, context);
			case DomainPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case DomainPackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case DomainPackage.ORDER_STATUS:
				return validateOrderStatus((OrderStatus)value, diagnostics, context);
			case DomainPackage.PRODUCT_GROUP:
				return validateProductGroup((ProductGroup)value, diagnostics, context);
			case DomainPackage.PRODUCT_VARIANT:
				return validateProductVariant((ProductVariant)value, diagnostics, context);
			case DomainPackage.PRODUCT_INSTANCE:
				return validateProductInstance((ProductInstance)value, diagnostics, context);
			case DomainPackage.PRODUCT_INSTANCE_STATUS:
				return validateProductInstanceStatus((ProductInstanceStatus)value, diagnostics, context);
			case DomainPackage.PRODUCT_RECOGNITION:
				return validateProductRecognition((ProductRecognition)value, diagnostics, context);
			case DomainPackage.RESOURCE_INSTANCE:
				return validateResourceInstance((ResourceInstance)value, diagnostics, context);
			case DomainPackage.STAFF:
				return validateStaff((Staff)value, diagnostics, context);
			case DomainPackage.STAFF_RECOGNITION:
				return validateStaffRecognition((StaffRecognition)value, diagnostics, context);
			case DomainPackage.STAFF_SKILLS:
				return validateStaffSkills((StaffSkills)value, diagnostics, context);
			case DomainPackage.STAFF_SKILL:
				return validateStaffSkill((StaffSkill)value, diagnostics, context);
			case DomainPackage.WORKPLAN:
				return validateWorkplan((Workplan)value, diagnostics, context);
			case DomainPackage.WORKSTEP:
				return validateWorkstep((Workstep)value, diagnostics, context);
			case DomainPackage.CAPABILITY_REQUIREMENT:
				return validateCapabilityRequirement((CapabilityRequirement)value, diagnostics, context);
			case DomainPackage.BOM:
				return validateBOM((BOM)value, diagnostics, context);
			case DomainPackage.BOM_ENTRY:
				return validateBOMEntry((BOMEntry)value, diagnostics, context);
			case DomainPackage.WORKSTEP_INSTANCE:
				return validateWorkstepInstance((WorkstepInstance)value, diagnostics, context);
			case DomainPackage.TEMPERATURE_READING:
				return validateTemperatureReading((TemperatureReading)value, diagnostics, context);
			case DomainPackage.RECOGNITION_ENUM:
				return validateRecognitionEnum((RecognitionEnum)value, diagnostics, context);
			case DomainPackage.PREFERENCE_ENUM:
				return validatePreferenceEnum((PreferenceEnum)value, diagnostics, context);
			case DomainPackage.ORDER_STATUS_ENUM:
				return validateOrderStatusEnum((OrderStatusEnum)value, diagnostics, context);
			case DomainPackage.PRODUCT_INSTANCE_STATUS_ENUM:
				return validateProductInstanceStatusEnum((ProductInstanceStatusEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicLineBalancingResult(DynamicLineBalancingResult dynamicLineBalancingResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicLineBalancingResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstruction(Instruction instruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterial(Material material, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(material, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedia(Media media, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(media, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudio(Audio audio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(audio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideo(Video video, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(video, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(order, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderStatus(OrderStatus orderStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductGroup(ProductGroup productGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductVariant(ProductVariant productVariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productVariant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance(ProductInstance productInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstanceStatus(ProductInstanceStatus productInstanceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productInstanceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductRecognition(ProductRecognition productRecognition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productRecognition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInstance(ResourceInstance resourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaff(Staff staff, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staff, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaffRecognition(StaffRecognition staffRecognition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staffRecognition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaffSkills(StaffSkills staffSkills, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staffSkills, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaffSkill(StaffSkill staffSkill, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staffSkill, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkplan(Workplan workplan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workplan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkstep(Workstep workstep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workstep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityRequirement(CapabilityRequirement capabilityRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBOM(BOM bom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBOMEntry(BOMEntry bomEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bomEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkstepInstance(WorkstepInstance workstepInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workstepInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemperatureReading(TemperatureReading temperatureReading, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(temperatureReading, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(temperatureReading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(temperatureReading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(temperatureReading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(temperatureReading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(temperatureReading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(temperatureReading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(temperatureReading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(temperatureReading, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemperatureReading_measuredValueRange(temperatureReading, diagnostics, context);
		return result;
	}

	/**
	 * Validates the measuredValueRange constraint of '<em>Temperature Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemperatureReading_measuredValueRange(TemperatureReading temperatureReading, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "measuredValueRange", getObjectLabel(temperatureReading, context) },
						 new Object[] { temperatureReading },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecognitionEnum(RecognitionEnum recognitionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreferenceEnum(PreferenceEnum preferenceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderStatusEnum(OrderStatusEnum orderStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstanceStatusEnum(ProductInstanceStatusEnum productInstanceStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //DomainValidator
