/**
 */
package de.dfki.iui.basys.model.domain.staff.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.domain.order.OrderPackage;

import de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl;

import de.dfki.iui.basys.model.domain.product.ProductPackage;

import de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl;

import de.dfki.iui.basys.model.domain.staff.PreferenceEnum;
import de.dfki.iui.basys.model.domain.staff.Staff;
import de.dfki.iui.basys.model.domain.staff.StaffFactory;
import de.dfki.iui.basys.model.domain.staff.StaffPackage;
import de.dfki.iui.basys.model.domain.staff.StaffRecognition;
import de.dfki.iui.basys.model.domain.staff.StaffRecognitionEnum;
import de.dfki.iui.basys.model.domain.staff.StaffSkill;
import de.dfki.iui.basys.model.domain.staff.StaffSkills;

import de.dfki.iui.basys.model.domain.topology.TopologyPackage;

import de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl;

import de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage;

import de.dfki.iui.basys.model.domain.workerguidance.impl.WorkerguidancePackageImpl;

import de.dfki.iui.basys.model.domain.workplan.WorkplanPackage;

import de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaffPackageImpl extends EPackageImpl implements StaffPackage {
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
	private EEnum staffRecognitionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preferenceEnumEEnum = null;

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
	 * @see de.dfki.iui.basys.model.domain.staff.StaffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StaffPackageImpl() {
		super(eNS_URI, StaffFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StaffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StaffPackage init() {
		if (isInited) return (StaffPackage)EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI);

		// Obtain or create and register package
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StaffPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) : OrderPackage.eINSTANCE);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) : ProductPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		WorkerguidancePackageImpl theWorkerguidancePackage = (WorkerguidancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) instanceof WorkerguidancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) : WorkerguidancePackage.eINSTANCE);
		WorkplanPackageImpl theWorkplanPackage = (WorkplanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) instanceof WorkplanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) : WorkplanPackage.eINSTANCE);

		// Create package meta-data objects
		theStaffPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theProductPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theWorkplanPackage.createPackageContents();

		// Initialize created meta-data
		theStaffPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theWorkplanPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStaffPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StaffPackage.eNS_URI, theStaffPackage);
		return theStaffPackage;
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
	public EEnum getStaffRecognitionEnum() {
		return staffRecognitionEnumEEnum;
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
	public StaffFactory getStaffFactory() {
		return (StaffFactory)getEFactoryInstance();
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

		// Create enums
		staffRecognitionEnumEEnum = createEEnum(STAFF_RECOGNITION_ENUM);
		preferenceEnumEEnum = createEEnum(PREFERENCE_ENUM);
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
		staffEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		staffRecognitionEClass.getESuperTypes().add(theBasePackage.getEntity());
		staffSkillsEClass.getESuperTypes().add(theBasePackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(staffEClass, Staff.class, "Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaff_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_Birthdate(), ecorePackage.getEDate(), "birthdate", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_Language(), ecorePackage.getEString(), "language", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffRecognitionEClass, StaffRecognition.class, "StaffRecognition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffRecognition_Type(), this.getStaffRecognitionEnum(), "type", null, 0, 1, StaffRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaffRecognition_WorkerId(), ecorePackage.getEString(), "workerId", null, 0, 1, StaffRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaffRecognition_ComponentId(), ecorePackage.getEString(), "componentId", null, 0, 1, StaffRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffSkillsEClass, StaffSkills.class, "StaffSkills", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffSkills_WorkerId(), ecorePackage.getEString(), "workerId", null, 0, 1, StaffSkills.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaffSkills_Skills(), this.getStaffSkill(), null, "skills", null, 0, -1, StaffSkills.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffSkillEClass, StaffSkill.class, "StaffSkill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffSkill_WorkstepId(), ecorePackage.getEString(), "workstepId", null, 0, 1, StaffSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaffSkill_Level(), ecorePackage.getEInt(), "level", null, 0, 1, StaffSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaffSkill_Preference(), this.getPreferenceEnum(), "preference", null, 0, 1, StaffSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(staffRecognitionEnumEEnum, StaffRecognitionEnum.class, "StaffRecognitionEnum");
		addEEnumLiteral(staffRecognitionEnumEEnum, StaffRecognitionEnum.UNKNOWN);
		addEEnumLiteral(staffRecognitionEnumEEnum, StaffRecognitionEnum.PRESENT);
		addEEnumLiteral(staffRecognitionEnumEEnum, StaffRecognitionEnum.IN_TRANSIT);

		initEEnum(preferenceEnumEEnum, PreferenceEnum.class, "PreferenceEnum");
		addEEnumLiteral(preferenceEnumEEnum, PreferenceEnum.NEUTRAL);
		addEEnumLiteral(preferenceEnumEEnum, PreferenceEnum.POSITIVE);
		addEEnumLiteral(preferenceEnumEEnum, PreferenceEnum.NEGATIVE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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

} //StaffPackageImpl
