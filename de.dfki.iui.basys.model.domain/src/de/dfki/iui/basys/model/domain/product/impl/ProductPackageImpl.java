/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;

import de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl;

import de.dfki.iui.basys.model.domain.order.OrderPackage;

import de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl;

import de.dfki.iui.basys.model.domain.product.ProductFactory;
import de.dfki.iui.basys.model.domain.product.ProductGroup;
import de.dfki.iui.basys.model.domain.product.ProductInstance;
import de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum;
import de.dfki.iui.basys.model.domain.product.ProductInstanceLocation;
import de.dfki.iui.basys.model.domain.product.ProductInstanceLocationEvent;
import de.dfki.iui.basys.model.domain.product.ProductInstanceStatus;
import de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum;
import de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEvent;
import de.dfki.iui.basys.model.domain.product.ProductPackage;
import de.dfki.iui.basys.model.domain.product.ProductVariant;

import de.dfki.iui.basys.model.domain.staff.StaffPackage;

import de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl;

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

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductPackageImpl extends EPackageImpl implements ProductPackage {
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
	private EClass productInstanceStatusEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceLocationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productInstanceDetectionEnumEEnum = null;

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
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductPackageImpl() {
		super(eNS_URI, ProductFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProductPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductPackage init() {
		if (isInited) return (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);

		// Obtain or create and register package
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProductPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) : OrderPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		WorkerguidancePackageImpl theWorkerguidancePackage = (WorkerguidancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) instanceof WorkerguidancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) : WorkerguidancePackage.eINSTANCE);
		WorkplanPackageImpl theWorkplanPackage = (WorkplanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) instanceof WorkplanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) : WorkplanPackage.eINSTANCE);
		LinebalancingPackageImpl theLinebalancingPackage = (LinebalancingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) instanceof LinebalancingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) : LinebalancingPackage.eINSTANCE);

		// Create package meta-data objects
		theProductPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theWorkplanPackage.createPackageContents();
		theLinebalancingPackage.createPackageContents();

		// Initialize created meta-data
		theProductPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theWorkplanPackage.initializePackageContents();
		theLinebalancingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProductPackage.eNS_URI, theProductPackage);
		return theProductPackage;
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
	public EAttribute getProductGroup_Name() {
		return (EAttribute)productGroupEClass.getEStructuralFeatures().get(0);
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
	public EClass getProductInstanceStatusEvent() {
		return productInstanceStatusEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstanceLocation() {
		return productInstanceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceLocation_DetectionType() {
		return (EAttribute)productInstanceLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceLocation_ProductInstanceId() {
		return (EAttribute)productInstanceLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceLocation_ComponentId() {
		return (EAttribute)productInstanceLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstanceLocationEvent() {
		return productInstanceLocationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductInstanceDetectionEnum() {
		return productInstanceDetectionEnumEEnum;
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
	public ProductFactory getProductFactory() {
		return (ProductFactory)getEFactoryInstance();
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
		productGroupEClass = createEClass(PRODUCT_GROUP);
		createEAttribute(productGroupEClass, PRODUCT_GROUP__NAME);

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

		productInstanceStatusEventEClass = createEClass(PRODUCT_INSTANCE_STATUS_EVENT);

		productInstanceLocationEClass = createEClass(PRODUCT_INSTANCE_LOCATION);
		createEAttribute(productInstanceLocationEClass, PRODUCT_INSTANCE_LOCATION__DETECTION_TYPE);
		createEAttribute(productInstanceLocationEClass, PRODUCT_INSTANCE_LOCATION__PRODUCT_INSTANCE_ID);
		createEAttribute(productInstanceLocationEClass, PRODUCT_INSTANCE_LOCATION__COMPONENT_ID);

		productInstanceLocationEventEClass = createEClass(PRODUCT_INSTANCE_LOCATION_EVENT);

		// Create enums
		productInstanceDetectionEnumEEnum = createEEnum(PRODUCT_INSTANCE_DETECTION_ENUM);
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
		productGroupEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		productVariantEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		productInstanceEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		productInstanceStatusEClass.getESuperTypes().add(theBasePackage.getEntity());
		productInstanceStatusEventEClass.getESuperTypes().add(theBasePackage.getEvent());
		productInstanceStatusEventEClass.getESuperTypes().add(this.getProductInstanceStatus());
		productInstanceLocationEClass.getESuperTypes().add(theBasePackage.getEntity());
		productInstanceLocationEventEClass.getESuperTypes().add(this.getProductInstanceLocation());
		productInstanceLocationEventEClass.getESuperTypes().add(theBasePackage.getEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(productGroupEClass, ProductGroup.class, "ProductGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(productInstanceStatusEventEClass, ProductInstanceStatusEvent.class, "ProductInstanceStatusEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productInstanceLocationEClass, ProductInstanceLocation.class, "ProductInstanceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductInstanceLocation_DetectionType(), this.getProductInstanceDetectionEnum(), "detectionType", null, 0, 1, ProductInstanceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductInstanceLocation_ProductInstanceId(), ecorePackage.getEString(), "productInstanceId", null, 0, 1, ProductInstanceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductInstanceLocation_ComponentId(), ecorePackage.getEString(), "componentId", null, 0, 1, ProductInstanceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productInstanceLocationEventEClass, ProductInstanceLocationEvent.class, "ProductInstanceLocationEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(productInstanceDetectionEnumEEnum, ProductInstanceDetectionEnum.class, "ProductInstanceDetectionEnum");
		addEEnumLiteral(productInstanceDetectionEnumEEnum, ProductInstanceDetectionEnum.UNKNOWN);
		addEEnumLiteral(productInstanceDetectionEnumEEnum, ProductInstanceDetectionEnum.PRESENT);
		addEEnumLiteral(productInstanceDetectionEnumEEnum, ProductInstanceDetectionEnum.IN_TRANSIT);

		initEEnum(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.class, "ProductInstanceStatusEnum");
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.UNKNOWN);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IN_PRODUCTION);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.WAITING);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IN_TEST);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.NIO);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IN_REPAIR);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IO);

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

} //ProductPackageImpl
