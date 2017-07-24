/**
 */
package de.dfki.iui.basys.model.domain.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.base.impl.BasePackageImpl;

import de.dfki.iui.basys.model.domain.Audio;
import de.dfki.iui.basys.model.domain.BOMEntry;
import de.dfki.iui.basys.model.domain.CapabilityRequirement;
import de.dfki.iui.basys.model.domain.DomainFactory;
import de.dfki.iui.basys.model.domain.DomainPackage;
import de.dfki.iui.basys.model.domain.DynamicLineBalancingResult;
import de.dfki.iui.basys.model.domain.Image;
import de.dfki.iui.basys.model.domain.Instruction;
import de.dfki.iui.basys.model.domain.Material;
import de.dfki.iui.basys.model.domain.Media;
import de.dfki.iui.basys.model.domain.Order;
import de.dfki.iui.basys.model.domain.OrderStatus;
import de.dfki.iui.basys.model.domain.OrderStatusEnum;
import de.dfki.iui.basys.model.domain.PreferenceEnum;
import de.dfki.iui.basys.model.domain.ProductGroup;
import de.dfki.iui.basys.model.domain.ProductInstance;
import de.dfki.iui.basys.model.domain.ProductInstanceStatus;
import de.dfki.iui.basys.model.domain.ProductInstanceStatusEnum;
import de.dfki.iui.basys.model.domain.ProductRecognition;
import de.dfki.iui.basys.model.domain.ProductVariant;
import de.dfki.iui.basys.model.domain.RecognitionEnum;
import de.dfki.iui.basys.model.domain.ResourceInstance;
import de.dfki.iui.basys.model.domain.Staff;
import de.dfki.iui.basys.model.domain.StaffRecognition;
import de.dfki.iui.basys.model.domain.StaffSkill;
import de.dfki.iui.basys.model.domain.StaffSkills;
import de.dfki.iui.basys.model.domain.TemperatureReading;
import de.dfki.iui.basys.model.domain.Video;
import de.dfki.iui.basys.model.domain.Workplan;
import de.dfki.iui.basys.model.domain.Workstep;
import de.dfki.iui.basys.model.domain.WorkstepInstance;

import de.dfki.iui.basys.model.domain.util.DomainValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicLineBalancingResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productVariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productRecognitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffRecognitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffSkillsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffSkillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workplanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workstepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bomEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workstepInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recognitionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preferenceEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderStatusEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productInstanceStatusEnumEEnum = null;

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
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl thePhysicalPackage = (de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(de.dfki.iui.basys.model.physical.PhysicalPackage.eNS_URI) instanceof de.dfki.iui.basys.model.physical.impl.PhysicalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(de.dfki.iui.basys.model.physical.PhysicalPackage.eNS_URI) : de.dfki.iui.basys.model.physical.PhysicalPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		theBasePackage.createPackageContents();
		thePhysicalPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		thePhysicalPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDomainPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DomainValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicLineBalancingResult() {
		return dynamicLineBalancingResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_Description() {
		return (EAttribute)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_Parameters() {
		return (EAttribute)instructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_WorkstepIds() {
		return (EAttribute)instructionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterial() {
		return materialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterial_Name() {
		return (EAttribute)materialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Type() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_FileSize() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Checksum() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Location() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_EntityType() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_EntityIds() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Tags() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Locale() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudio() {
		return audioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Duration() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Duration() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Width() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Height() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Width() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Height() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_VariantId() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_StartDate() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_EndDate() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Pieces() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Priority() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderStatus() {
		return orderStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderStatus_OrderId() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderStatus_Status() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderStatus_PieceCount() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductGroup() {
		return productGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductVariant() {
		return productVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductVariant_Name() {
		return (EAttribute)productVariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductVariant_ProductGroupId() {
		return (EAttribute)productVariantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance() {
		return productInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstance_ProductVariantId() {
		return (EAttribute)productInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstance_OrderId() {
		return (EAttribute)productInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstance_SerialNumber() {
		return (EAttribute)productInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstanceStatus() {
		return productInstanceStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceStatus_ProductInstanceId() {
		return (EAttribute)productInstanceStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceStatus_Status() {
		return (EAttribute)productInstanceStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceStatus_WorkstepInstanceId() {
		return (EAttribute)productInstanceStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductRecognition() {
		return productRecognitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductRecognition_Type() {
		return (EAttribute)productRecognitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductRecognition_ProductInstanceId() {
		return (EAttribute)productRecognitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductRecognition_ComponentId() {
		return (EAttribute)productRecognitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInstance() {
		return resourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceInstance_Name() {
		return (EAttribute)resourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceInstance_Type() {
		return (EAttribute)resourceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceInstance_Properties() {
		return (EAttribute)resourceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaff() {
		return staffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Firstname() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Lastname() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Birthdate() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Language() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffRecognition() {
		return staffRecognitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffRecognition_Type() {
		return (EAttribute)staffRecognitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffRecognition_WorkerId() {
		return (EAttribute)staffRecognitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffRecognition_ComponentId() {
		return (EAttribute)staffRecognitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffSkills() {
		return staffSkillsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffSkills_WorkerId() {
		return (EAttribute)staffSkillsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffSkills_Skills() {
		return (EReference)staffSkillsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffSkill() {
		return staffSkillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffSkill_WorkstepId() {
		return (EAttribute)staffSkillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffSkill_Level() {
		return (EAttribute)staffSkillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffSkill_Preference() {
		return (EAttribute)staffSkillEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkplan() {
		return workplanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkplan_ProductVariantId() {
		return (EAttribute)workplanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkplan_WorkstepIds() {
		return (EAttribute)workplanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkstep() {
		return workstepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstep_Name() {
		return (EAttribute)workstepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstep_Duration() {
		return (EAttribute)workstepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkstep_Bom() {
		return (EReference)workstepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkstep_Requirements() {
		return (EReference)workstepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityRequirement() {
		return capabilityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOM() {
		return bomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOM_Entries() {
		return (EReference)bomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOMEntry() {
		return bomEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBOMEntry_Amount() {
		return (EAttribute)bomEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBOMEntry_MaterialId() {
		return (EAttribute)bomEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkstepInstance() {
		return workstepInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstance_WorkstepId() {
		return (EAttribute)workstepInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstance_ResourceInstanceIds() {
		return (EAttribute)workstepInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemperatureReading() {
		return temperatureReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemperatureReading_MeasuredValue() {
		return (EAttribute)temperatureReadingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecognitionEnum() {
		return recognitionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPreferenceEnum() {
		return preferenceEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderStatusEnum() {
		return orderStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductInstanceStatusEnum() {
		return productInstanceStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
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
		dynamicLineBalancingResultEClass = createEClass(DYNAMIC_LINE_BALANCING_RESULT);

		instructionEClass = createEClass(INSTRUCTION);
		createEAttribute(instructionEClass, INSTRUCTION__DESCRIPTION);
		createEAttribute(instructionEClass, INSTRUCTION__PARAMETERS);
		createEAttribute(instructionEClass, INSTRUCTION__WORKSTEP_IDS);

		materialEClass = createEClass(MATERIAL);
		createEAttribute(materialEClass, MATERIAL__NAME);

		mediaEClass = createEClass(MEDIA);
		createEAttribute(mediaEClass, MEDIA__TYPE);
		createEAttribute(mediaEClass, MEDIA__FILE_SIZE);
		createEAttribute(mediaEClass, MEDIA__CHECKSUM);
		createEAttribute(mediaEClass, MEDIA__LOCATION);
		createEAttribute(mediaEClass, MEDIA__ENTITY_TYPE);
		createEAttribute(mediaEClass, MEDIA__ENTITY_IDS);
		createEAttribute(mediaEClass, MEDIA__TAGS);
		createEAttribute(mediaEClass, MEDIA__LOCALE);

		audioEClass = createEClass(AUDIO);
		createEAttribute(audioEClass, AUDIO__DURATION);

		videoEClass = createEClass(VIDEO);
		createEAttribute(videoEClass, VIDEO__DURATION);
		createEAttribute(videoEClass, VIDEO__WIDTH);
		createEAttribute(videoEClass, VIDEO__HEIGHT);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__WIDTH);
		createEAttribute(imageEClass, IMAGE__HEIGHT);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__VARIANT_ID);
		createEAttribute(orderEClass, ORDER__START_DATE);
		createEAttribute(orderEClass, ORDER__END_DATE);
		createEAttribute(orderEClass, ORDER__PIECES);
		createEAttribute(orderEClass, ORDER__PRIORITY);

		orderStatusEClass = createEClass(ORDER_STATUS);
		createEAttribute(orderStatusEClass, ORDER_STATUS__ORDER_ID);
		createEAttribute(orderStatusEClass, ORDER_STATUS__STATUS);
		createEAttribute(orderStatusEClass, ORDER_STATUS__PIECE_COUNT);

		productGroupEClass = createEClass(PRODUCT_GROUP);

		productVariantEClass = createEClass(PRODUCT_VARIANT);
		createEAttribute(productVariantEClass, PRODUCT_VARIANT__NAME);
		createEAttribute(productVariantEClass, PRODUCT_VARIANT__PRODUCT_GROUP_ID);

		productInstanceEClass = createEClass(PRODUCT_INSTANCE);
		createEAttribute(productInstanceEClass, PRODUCT_INSTANCE__PRODUCT_VARIANT_ID);
		createEAttribute(productInstanceEClass, PRODUCT_INSTANCE__ORDER_ID);
		createEAttribute(productInstanceEClass, PRODUCT_INSTANCE__SERIAL_NUMBER);

		productInstanceStatusEClass = createEClass(PRODUCT_INSTANCE_STATUS);
		createEAttribute(productInstanceStatusEClass, PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID);
		createEAttribute(productInstanceStatusEClass, PRODUCT_INSTANCE_STATUS__STATUS);
		createEAttribute(productInstanceStatusEClass, PRODUCT_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID);

		productRecognitionEClass = createEClass(PRODUCT_RECOGNITION);
		createEAttribute(productRecognitionEClass, PRODUCT_RECOGNITION__TYPE);
		createEAttribute(productRecognitionEClass, PRODUCT_RECOGNITION__PRODUCT_INSTANCE_ID);
		createEAttribute(productRecognitionEClass, PRODUCT_RECOGNITION__COMPONENT_ID);

		resourceInstanceEClass = createEClass(RESOURCE_INSTANCE);
		createEAttribute(resourceInstanceEClass, RESOURCE_INSTANCE__NAME);
		createEAttribute(resourceInstanceEClass, RESOURCE_INSTANCE__TYPE);
		createEAttribute(resourceInstanceEClass, RESOURCE_INSTANCE__PROPERTIES);

		staffEClass = createEClass(STAFF);
		createEAttribute(staffEClass, STAFF__FIRSTNAME);
		createEAttribute(staffEClass, STAFF__LASTNAME);
		createEAttribute(staffEClass, STAFF__BIRTHDATE);
		createEAttribute(staffEClass, STAFF__LANGUAGE);

		staffRecognitionEClass = createEClass(STAFF_RECOGNITION);
		createEAttribute(staffRecognitionEClass, STAFF_RECOGNITION__TYPE);
		createEAttribute(staffRecognitionEClass, STAFF_RECOGNITION__WORKER_ID);
		createEAttribute(staffRecognitionEClass, STAFF_RECOGNITION__COMPONENT_ID);

		staffSkillsEClass = createEClass(STAFF_SKILLS);
		createEAttribute(staffSkillsEClass, STAFF_SKILLS__WORKER_ID);
		createEReference(staffSkillsEClass, STAFF_SKILLS__SKILLS);

		staffSkillEClass = createEClass(STAFF_SKILL);
		createEAttribute(staffSkillEClass, STAFF_SKILL__WORKSTEP_ID);
		createEAttribute(staffSkillEClass, STAFF_SKILL__LEVEL);
		createEAttribute(staffSkillEClass, STAFF_SKILL__PREFERENCE);

		workplanEClass = createEClass(WORKPLAN);
		createEAttribute(workplanEClass, WORKPLAN__PRODUCT_VARIANT_ID);
		createEAttribute(workplanEClass, WORKPLAN__WORKSTEP_IDS);

		workstepEClass = createEClass(WORKSTEP);
		createEAttribute(workstepEClass, WORKSTEP__NAME);
		createEAttribute(workstepEClass, WORKSTEP__DURATION);
		createEReference(workstepEClass, WORKSTEP__BOM);
		createEReference(workstepEClass, WORKSTEP__REQUIREMENTS);

		capabilityRequirementEClass = createEClass(CAPABILITY_REQUIREMENT);

		bomEClass = createEClass(BOM);
		createEReference(bomEClass, BOM__ENTRIES);

		bomEntryEClass = createEClass(BOM_ENTRY);
		createEAttribute(bomEntryEClass, BOM_ENTRY__AMOUNT);
		createEAttribute(bomEntryEClass, BOM_ENTRY__MATERIAL_ID);

		workstepInstanceEClass = createEClass(WORKSTEP_INSTANCE);
		createEAttribute(workstepInstanceEClass, WORKSTEP_INSTANCE__WORKSTEP_ID);
		createEAttribute(workstepInstanceEClass, WORKSTEP_INSTANCE__RESOURCE_INSTANCE_IDS);

		temperatureReadingEClass = createEClass(TEMPERATURE_READING);
		createEAttribute(temperatureReadingEClass, TEMPERATURE_READING__MEASURED_VALUE);

		// Create enums
		recognitionEnumEEnum = createEEnum(RECOGNITION_ENUM);
		preferenceEnumEEnum = createEEnum(PREFERENCE_ENUM);
		orderStatusEnumEEnum = createEEnum(ORDER_STATUS_ENUM);
		productInstanceStatusEnumEEnum = createEEnum(PRODUCT_INSTANCE_STATUS_ENUM);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instructionEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		materialEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		mediaEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		audioEClass.getESuperTypes().add(this.getMedia());
		videoEClass.getESuperTypes().add(this.getMedia());
		imageEClass.getESuperTypes().add(this.getMedia());
		orderEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		orderStatusEClass.getESuperTypes().add(theBasePackage.getEntity());
		productGroupEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		productVariantEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		productInstanceEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		productInstanceStatusEClass.getESuperTypes().add(theBasePackage.getEntity());
		productRecognitionEClass.getESuperTypes().add(theBasePackage.getEntity());
		resourceInstanceEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		staffEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		staffRecognitionEClass.getESuperTypes().add(theBasePackage.getEntity());
		staffSkillsEClass.getESuperTypes().add(theBasePackage.getEntity());
		workplanEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		workstepEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(dynamicLineBalancingResultEClass, DynamicLineBalancingResult.class, "DynamicLineBalancingResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstruction_Description(), ecorePackage.getEString(), "description", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_WorkstepIds(), ecorePackage.getEString(), "workstepIds", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaterial_Name(), ecorePackage.getEString(), "name", null, 0, 1, Material.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaEClass, Media.class, "Media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedia_Type(), ecorePackage.getEString(), "type", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_FileSize(), ecorePackage.getEInt(), "fileSize", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Checksum(), ecorePackage.getEString(), "checksum", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Location(), ecorePackage.getEString(), "location", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_EntityType(), ecorePackage.getEString(), "entityType", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_EntityIds(), ecorePackage.getEString(), "entityIds", null, 0, -1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Locale(), ecorePackage.getEString(), "locale", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioEClass, Audio.class, "Audio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudio_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideo_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_VariantId(), ecorePackage.getEString(), "variantId", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Pieces(), ecorePackage.getEInt(), "pieces", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderStatusEClass, OrderStatus.class, "OrderStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderStatus_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_Status(), this.getOrderStatusEnum(), "status", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_PieceCount(), ecorePackage.getEInt(), "pieceCount", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productGroupEClass, ProductGroup.class, "ProductGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productVariantEClass, ProductVariant.class, "ProductVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductVariant_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductVariant_ProductGroupId(), ecorePackage.getEString(), "productGroupId", null, 0, 1, ProductVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productInstanceEClass, ProductInstance.class, "ProductInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductInstance_ProductVariantId(), ecorePackage.getEString(), "productVariantId", null, 0, 1, ProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductInstance_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, ProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductInstance_SerialNumber(), ecorePackage.getEString(), "serialNumber", null, 0, 1, ProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productInstanceStatusEClass, ProductInstanceStatus.class, "ProductInstanceStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductInstanceStatus_ProductInstanceId(), ecorePackage.getEString(), "productInstanceId", null, 0, 1, ProductInstanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductInstanceStatus_Status(), this.getProductInstanceStatusEnum(), "status", null, 0, 1, ProductInstanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductInstanceStatus_WorkstepInstanceId(), ecorePackage.getEString(), "workstepInstanceId", null, 0, 1, ProductInstanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productRecognitionEClass, ProductRecognition.class, "ProductRecognition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductRecognition_Type(), this.getRecognitionEnum(), "type", null, 0, 1, ProductRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductRecognition_ProductInstanceId(), ecorePackage.getEString(), "productInstanceId", null, 0, 1, ProductRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductRecognition_ComponentId(), ecorePackage.getEString(), "componentId", null, 0, 1, ProductRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceInstanceEClass, ResourceInstance.class, "ResourceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceInstance_Type(), ecorePackage.getEString(), "type", null, 0, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceInstance_Properties(), ecorePackage.getEString(), "properties", null, 0, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffEClass, Staff.class, "Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaff_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_Birthdate(), ecorePackage.getEDate(), "birthdate", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_Language(), ecorePackage.getEString(), "language", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffRecognitionEClass, StaffRecognition.class, "StaffRecognition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffRecognition_Type(), this.getRecognitionEnum(), "type", null, 0, 1, StaffRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaffRecognition_WorkerId(), ecorePackage.getEString(), "workerId", null, 0, 1, StaffRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaffRecognition_ComponentId(), ecorePackage.getEString(), "componentId", null, 0, 1, StaffRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffSkillsEClass, StaffSkills.class, "StaffSkills", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffSkills_WorkerId(), ecorePackage.getEString(), "workerId", null, 0, 1, StaffSkills.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaffSkills_Skills(), this.getStaffSkill(), null, "skills", null, 0, -1, StaffSkills.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffSkillEClass, StaffSkill.class, "StaffSkill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffSkill_WorkstepId(), ecorePackage.getEString(), "workstepId", null, 0, 1, StaffSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaffSkill_Level(), ecorePackage.getEInt(), "level", null, 0, 1, StaffSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaffSkill_Preference(), this.getPreferenceEnum(), "preference", null, 0, 1, StaffSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workplanEClass, Workplan.class, "Workplan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkplan_ProductVariantId(), ecorePackage.getEString(), "productVariantId", null, 0, 1, Workplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkplan_WorkstepIds(), ecorePackage.getEString(), "workstepIds", null, 0, -1, Workplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workstepEClass, Workstep.class, "Workstep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkstep_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workstep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkstep_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Workstep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkstep_Bom(), this.getBOM(), null, "bom", null, 0, 1, Workstep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkstep_Requirements(), this.getCapabilityRequirement(), null, "requirements", null, 0, -1, Workstep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityRequirementEClass, CapabilityRequirement.class, "CapabilityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bomEClass, de.dfki.iui.basys.model.domain.BOM.class, "BOM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOM_Entries(), this.getBOMEntry(), null, "entries", null, 0, -1, de.dfki.iui.basys.model.domain.BOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bomEntryEClass, BOMEntry.class, "BOMEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBOMEntry_Amount(), ecorePackage.getEInt(), "amount", null, 0, 1, BOMEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBOMEntry_MaterialId(), ecorePackage.getEString(), "materialId", null, 0, 1, BOMEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workstepInstanceEClass, WorkstepInstance.class, "WorkstepInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkstepInstance_WorkstepId(), ecorePackage.getEString(), "workstepId", null, 0, 1, WorkstepInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkstepInstance_ResourceInstanceIds(), ecorePackage.getEString(), "resourceInstanceIds", null, 0, -1, WorkstepInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temperatureReadingEClass, TemperatureReading.class, "TemperatureReading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemperatureReading_MeasuredValue(), ecorePackage.getEFloat(), "measuredValue", null, 0, 1, TemperatureReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(recognitionEnumEEnum, RecognitionEnum.class, "RecognitionEnum");
		addEEnumLiteral(recognitionEnumEEnum, RecognitionEnum.PRESENT);
		addEEnumLiteral(recognitionEnumEEnum, RecognitionEnum.IN_TRANSIT);

		initEEnum(preferenceEnumEEnum, PreferenceEnum.class, "PreferenceEnum");
		addEEnumLiteral(preferenceEnumEEnum, PreferenceEnum.NEUTRAL);
		addEEnumLiteral(preferenceEnumEEnum, PreferenceEnum.POSITIVE);
		addEEnumLiteral(preferenceEnumEEnum, PreferenceEnum.NEGATIVE);

		initEEnum(orderStatusEnumEEnum, OrderStatusEnum.class, "OrderStatusEnum");
		addEEnumLiteral(orderStatusEnumEEnum, OrderStatusEnum.PLANNED);
		addEEnumLiteral(orderStatusEnumEEnum, OrderStatusEnum.STARTED);
		addEEnumLiteral(orderStatusEnumEEnum, OrderStatusEnum.PAUSED);
		addEEnumLiteral(orderStatusEnumEEnum, OrderStatusEnum.COMPLETED);
		addEEnumLiteral(orderStatusEnumEEnum, OrderStatusEnum.ABORTED);

		initEEnum(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.class, "ProductInstanceStatusEnum");
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IN_PRODUCTION);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IN_TEST);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.NIO);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IN_REPAIR);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IO);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://basys/unit
		createUnitAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://www.basys.de/BaSysAnnotation
		createBaSysAnnotationAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://basys/unit</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnitAnnotations() {
		String source = "http://basys/unit";	
		addAnnotation
		  (getVideo_Width(), 
		   source, 
		   new String[] {
			 "unit", "px"
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
		  (temperatureReadingEClass, 
		   source, 
		   new String[] {
			 "constraints", "measuredValueRange"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (temperatureReadingEClass, 
		   source, 
		   new String[] {
			 "measuredValueRange", "measuredValue >= -50 and measuredValue <= 50"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.basys.de/BaSysAnnotation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createBaSysAnnotationAnnotations() {
		String source = "http://www.basys.de/BaSysAnnotation";	
		addAnnotation
		  (getTemperatureReading_MeasuredValue(), 
		   source, 
		   new String[] {
			 "semanticsId", "https://www.wikidata.org/wiki/Q15088658",
			 "unit", "Celsius",
			 "unitId", "https://www.wikidata.org/wiki/Q25267"
		   });
	}

} //DomainPackageImpl
