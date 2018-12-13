/**
 */
package de.dfki.cos.basys.platform.model.domain.material.impl;

import de.dfki.cos.basys.platform.model.base.BasePackage;
import de.dfki.cos.basys.platform.model.data.DataPackage;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.capability.impl.CapabilityPackageImpl;
import de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage;
import de.dfki.cos.basys.platform.model.domain.linebalancing.impl.LinebalancingPackageImpl;
import de.dfki.cos.basys.platform.model.domain.material.Material;
import de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue;
import de.dfki.cos.basys.platform.model.domain.material.MaterialFactory;
import de.dfki.cos.basys.platform.model.domain.material.MaterialGroup;
import de.dfki.cos.basys.platform.model.domain.material.MaterialPackage;
import de.dfki.cos.basys.platform.model.domain.order.OrderPackage;
import de.dfki.cos.basys.platform.model.domain.order.impl.OrderPackageImpl;
import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessinstancePackage;
import de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessinstancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.productdefinition.impl.ProductdefinitionPackageImpl;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage;
import de.dfki.cos.basys.platform.model.domain.productinstance.impl.ProductinstancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.ResourceinstancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage;
import de.dfki.cos.basys.platform.model.domain.resourcetype.impl.ResourcetypePackageImpl;
import de.dfki.cos.basys.platform.model.domain.staff.StaffPackage;
import de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;
import de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl;
import de.dfki.cos.basys.platform.model.domain.workerguidance.WorkerguidancePackage;
import de.dfki.cos.basys.platform.model.domain.workerguidance.impl.WorkerguidancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage;
import de.dfki.cos.basys.platform.model.domain.workforce.impl.WorkforcePackageImpl;
import de.dfki.cos.basys.platform.model.domain.workplan.WorkplanPackage;
import de.dfki.cos.basys.platform.model.domain.workplan.impl.WorkplanPackageImpl;
import de.dfki.cos.basys.platform.model.pattern.PatternPackage;

import org.eclipse.emf.ecore.EClass;
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
public class MaterialPackageImpl extends EPackageImpl implements MaterialPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialCatalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEClass = null;

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
	 * @see de.dfki.cos.basys.platform.model.domain.material.MaterialPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MaterialPackageImpl() {
		super(eNS_URI, MaterialFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MaterialPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MaterialPackage init() {
		if (isInited) return (MaterialPackage)EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI);

		// Obtain or create and register package
		MaterialPackageImpl theMaterialPackage = (MaterialPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MaterialPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MaterialPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) : OrderPackage.eINSTANCE);
		ProductdefinitionPackageImpl theProductdefinitionPackage = (ProductdefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductdefinitionPackage.eNS_URI) instanceof ProductdefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductdefinitionPackage.eNS_URI) : ProductdefinitionPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		WorkerguidancePackageImpl theWorkerguidancePackage = (WorkerguidancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) instanceof WorkerguidancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) : WorkerguidancePackage.eINSTANCE);
		WorkplanPackageImpl theWorkplanPackage = (WorkplanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) instanceof WorkplanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) : WorkplanPackage.eINSTANCE);
		LinebalancingPackageImpl theLinebalancingPackage = (LinebalancingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) instanceof LinebalancingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) : LinebalancingPackage.eINSTANCE);
		CapabilityPackageImpl theCapabilityPackage = (CapabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI) instanceof CapabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI) : CapabilityPackage.eINSTANCE);
		ProcessdefinitionPackageImpl theProcessdefinitionPackage = (ProcessdefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessdefinitionPackage.eNS_URI) instanceof ProcessdefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessdefinitionPackage.eNS_URI) : ProcessdefinitionPackage.eINSTANCE);
		ProcessinstancePackageImpl theProcessinstancePackage = (ProcessinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) instanceof ProcessinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) : ProcessinstancePackage.eINSTANCE);
		ProductinstancePackageImpl theProductinstancePackage = (ProductinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI) instanceof ProductinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI) : ProductinstancePackage.eINSTANCE);
		WorkforcePackageImpl theWorkforcePackage = (WorkforcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) instanceof WorkforcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) : WorkforcePackage.eINSTANCE);
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) instanceof ResourcetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) : ResourcetypePackage.eINSTANCE);
		ResourceinstancePackageImpl theResourceinstancePackage = (ResourceinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI) instanceof ResourceinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI) : ResourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theMaterialPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theProductdefinitionPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theWorkplanPackage.createPackageContents();
		theLinebalancingPackage.createPackageContents();
		theCapabilityPackage.createPackageContents();
		theProcessdefinitionPackage.createPackageContents();
		theProcessinstancePackage.createPackageContents();
		theProductinstancePackage.createPackageContents();
		theWorkforcePackage.createPackageContents();
		theResourcetypePackage.createPackageContents();
		theResourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theMaterialPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theProductdefinitionPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theWorkplanPackage.initializePackageContents();
		theLinebalancingPackage.initializePackageContents();
		theCapabilityPackage.initializePackageContents();
		theProcessdefinitionPackage.initializePackageContents();
		theProcessinstancePackage.initializePackageContents();
		theProductinstancePackage.initializePackageContents();
		theWorkforcePackage.initializePackageContents();
		theResourcetypePackage.initializePackageContents();
		theResourceinstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMaterialPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MaterialPackage.eNS_URI, theMaterialPackage);
		return theMaterialPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialCatalogue() {
		return materialCatalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialCatalogue_MaterialGroups() {
		return (EReference)materialCatalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialGroup() {
		return materialGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialGroup_MaterialGroups() {
		return (EReference)materialGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialGroup_Materials() {
		return (EReference)materialGroupEClass.getEStructuralFeatures().get(1);
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
	public MaterialFactory getMaterialFactory() {
		return (MaterialFactory)getEFactoryInstance();
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
		materialCatalogueEClass = createEClass(MATERIAL_CATALOGUE);
		createEReference(materialCatalogueEClass, MATERIAL_CATALOGUE__MATERIAL_GROUPS);

		materialGroupEClass = createEClass(MATERIAL_GROUP);
		createEReference(materialGroupEClass, MATERIAL_GROUP__MATERIAL_GROUPS);
		createEReference(materialGroupEClass, MATERIAL_GROUP__MATERIALS);

		materialEClass = createEClass(MATERIAL);
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
		materialGroupEClass.getESuperTypes().add(theBasePackage.getEntity());
		materialEClass.getESuperTypes().add(theBasePackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(materialCatalogueEClass, MaterialCatalogue.class, "MaterialCatalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaterialCatalogue_MaterialGroups(), this.getMaterialGroup(), null, "materialGroups", null, 0, -1, MaterialCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialGroupEClass, MaterialGroup.class, "MaterialGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaterialGroup_MaterialGroups(), this.getMaterialGroup(), null, "materialGroups", null, 0, -1, MaterialGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaterialGroup_Materials(), this.getMaterial(), null, "materials", null, 0, -1, MaterialGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

} //MaterialPackageImpl
