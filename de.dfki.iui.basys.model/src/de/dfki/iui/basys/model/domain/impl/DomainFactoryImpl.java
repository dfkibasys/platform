/**
 */
package de.dfki.iui.basys.model.domain.impl;

import de.dfki.iui.basys.model.domain.*;

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
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFactory init() {
		try {
			DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory(DomainPackage.eNS_URI);
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
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
			case DomainPackage.DYNAMIC_LINE_BALANCING_RESULT: return createDynamicLineBalancingResult();
			case DomainPackage.INSTRUCTION: return createInstruction();
			case DomainPackage.MATERIAL: return createMaterial();
			case DomainPackage.MEDIA: return createMedia();
			case DomainPackage.AUDIO: return createAudio();
			case DomainPackage.VIDEO: return createVideo();
			case DomainPackage.IMAGE: return createImage();
			case DomainPackage.ORDER: return createOrder();
			case DomainPackage.ORDER_STATUS: return createOrderStatus();
			case DomainPackage.PRODUCT_GROUP: return createProductGroup();
			case DomainPackage.PRODUCT_VARIANT: return createProductVariant();
			case DomainPackage.PRODUCT_INSTANCE: return createProductInstance();
			case DomainPackage.PRODUCT_INSTANCE_STATUS: return createProductInstanceStatus();
			case DomainPackage.PRODUCT_RECOGNITION: return createProductRecognition();
			case DomainPackage.RESOURCE_INSTANCE: return createResourceInstance();
			case DomainPackage.STAFF: return createStaff();
			case DomainPackage.STAFF_RECOGNITION: return createStaffRecognition();
			case DomainPackage.STAFF_SKILLS: return createStaffSkills();
			case DomainPackage.STAFF_SKILL: return createStaffSkill();
			case DomainPackage.WORKPLAN: return createWorkplan();
			case DomainPackage.WORKSTEP: return createWorkstep();
			case DomainPackage.CAPABILITY_REQUIREMENT: return createCapabilityRequirement();
			case DomainPackage.BOM: return createBOM();
			case DomainPackage.BOM_ENTRY: return createBOMEntry();
			case DomainPackage.WORKSTEP_INSTANCE: return createWorkstepInstance();
			case DomainPackage.TEMPERATURE_READING: return createTemperatureReading();
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
			case DomainPackage.RECOGNITION_ENUM:
				return createRecognitionEnumFromString(eDataType, initialValue);
			case DomainPackage.PREFERENCE_ENUM:
				return createPreferenceEnumFromString(eDataType, initialValue);
			case DomainPackage.ORDER_STATUS_ENUM:
				return createOrderStatusEnumFromString(eDataType, initialValue);
			case DomainPackage.PRODUCT_INSTANCE_STATUS_ENUM:
				return createProductInstanceStatusEnumFromString(eDataType, initialValue);
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
			case DomainPackage.RECOGNITION_ENUM:
				return convertRecognitionEnumToString(eDataType, instanceValue);
			case DomainPackage.PREFERENCE_ENUM:
				return convertPreferenceEnumToString(eDataType, instanceValue);
			case DomainPackage.ORDER_STATUS_ENUM:
				return convertOrderStatusEnumToString(eDataType, instanceValue);
			case DomainPackage.PRODUCT_INSTANCE_STATUS_ENUM:
				return convertProductInstanceStatusEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicLineBalancingResult createDynamicLineBalancingResult() {
		DynamicLineBalancingResultImpl dynamicLineBalancingResult = new DynamicLineBalancingResultImpl();
		return dynamicLineBalancingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material createMaterial() {
		MaterialImpl material = new MaterialImpl();
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Audio createAudio() {
		AudioImpl audio = new AudioImpl();
		return audio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderStatus createOrderStatus() {
		OrderStatusImpl orderStatus = new OrderStatusImpl();
		return orderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductGroup createProductGroup() {
		ProductGroupImpl productGroup = new ProductGroupImpl();
		return productGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductVariant createProductVariant() {
		ProductVariantImpl productVariant = new ProductVariantImpl();
		return productVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance createProductInstance() {
		ProductInstanceImpl productInstance = new ProductInstanceImpl();
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceStatus createProductInstanceStatus() {
		ProductInstanceStatusImpl productInstanceStatus = new ProductInstanceStatusImpl();
		return productInstanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductRecognition createProductRecognition() {
		ProductRecognitionImpl productRecognition = new ProductRecognitionImpl();
		return productRecognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance createResourceInstance() {
		ResourceInstanceImpl resourceInstance = new ResourceInstanceImpl();
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff createStaff() {
		StaffImpl staff = new StaffImpl();
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffRecognition createStaffRecognition() {
		StaffRecognitionImpl staffRecognition = new StaffRecognitionImpl();
		return staffRecognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSkills createStaffSkills() {
		StaffSkillsImpl staffSkills = new StaffSkillsImpl();
		return staffSkills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSkill createStaffSkill() {
		StaffSkillImpl staffSkill = new StaffSkillImpl();
		return staffSkill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workplan createWorkplan() {
		WorkplanImpl workplan = new WorkplanImpl();
		return workplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workstep createWorkstep() {
		WorkstepImpl workstep = new WorkstepImpl();
		return workstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRequirement createCapabilityRequirement() {
		CapabilityRequirementImpl capabilityRequirement = new CapabilityRequirementImpl();
		return capabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOM createBOM() {
		BOMImpl bom = new BOMImpl();
		return bom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOMEntry createBOMEntry() {
		BOMEntryImpl bomEntry = new BOMEntryImpl();
		return bomEntry;
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
	public TemperatureReading createTemperatureReading() {
		TemperatureReadingImpl temperatureReading = new TemperatureReadingImpl();
		return temperatureReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecognitionEnum createRecognitionEnumFromString(EDataType eDataType, String initialValue) {
		RecognitionEnum result = RecognitionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecognitionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferenceEnum createPreferenceEnumFromString(EDataType eDataType, String initialValue) {
		PreferenceEnum result = PreferenceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreferenceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderStatusEnum createOrderStatusEnumFromString(EDataType eDataType, String initialValue) {
		OrderStatusEnum result = OrderStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceStatusEnum createProductInstanceStatusEnumFromString(EDataType eDataType, String initialValue) {
		ProductInstanceStatusEnum result = ProductInstanceStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductInstanceStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage getDomainPackage() {
		return (DomainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainPackage getPackage() {
		return DomainPackage.eINSTANCE;
	}

} //DomainFactoryImpl
