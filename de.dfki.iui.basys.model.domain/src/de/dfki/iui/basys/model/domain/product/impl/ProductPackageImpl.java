/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;

import de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl;

import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;

import de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl;

import de.dfki.iui.basys.model.domain.material.MaterialPackage;
import de.dfki.iui.basys.model.domain.material.impl.MaterialPackageImpl;
import de.dfki.iui.basys.model.domain.order.OrderPackage;

import de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl;

import de.dfki.iui.basys.model.domain.process.ProcessPackage;

import de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl;

import de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage;

import de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl;

import de.dfki.iui.basys.model.domain.product.AssemblyGroup;
import de.dfki.iui.basys.model.domain.product.AssemblyGroupEntry;
import de.dfki.iui.basys.model.domain.product.BOMEntry;
import de.dfki.iui.basys.model.domain.product.BillOfMaterial;
import de.dfki.iui.basys.model.domain.product.ComponentEntry;
import de.dfki.iui.basys.model.domain.product.ManufacturedComponent;
import de.dfki.iui.basys.model.domain.product.ProductCatalogue;
import de.dfki.iui.basys.model.domain.product.ProductFactory;
import de.dfki.iui.basys.model.domain.product.ProductGroup;
import de.dfki.iui.basys.model.domain.product.ProductPackage;
import de.dfki.iui.basys.model.domain.product.ProductVariant;

import de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage;

import de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl;

import de.dfki.iui.basys.model.domain.resource.ResourcePackage;
import de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl;
import de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage;
import de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl;
import de.dfki.iui.basys.model.domain.staff.StaffPackage;

import de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl;

import de.dfki.iui.basys.model.domain.topology.TopologyPackage;

import de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl;

import de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage;

import de.dfki.iui.basys.model.domain.workerguidance.impl.WorkerguidancePackageImpl;

import de.dfki.iui.basys.model.domain.workforce.WorkforcePackage;
import de.dfki.iui.basys.model.domain.workforce.impl.WorkforcePackageImpl;
import de.dfki.iui.basys.model.domain.workplan.WorkplanPackage;

import de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl;

import de.dfki.iui.basys.model.pattern.PatternPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass productCatalogueEClass = null;

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
	private EClass billOfMaterialEClass = null;

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
	private EClass assemblyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyGroupEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manufacturedComponentEClass = null;

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
		PatternPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) : OrderPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		WorkerguidancePackageImpl theWorkerguidancePackage = (WorkerguidancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) instanceof WorkerguidancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) : WorkerguidancePackage.eINSTANCE);
		WorkplanPackageImpl theWorkplanPackage = (WorkplanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) instanceof WorkplanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) : WorkplanPackage.eINSTANCE);
		LinebalancingPackageImpl theLinebalancingPackage = (LinebalancingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) instanceof LinebalancingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) : LinebalancingPackage.eINSTANCE);
		CapabilityPackageImpl theCapabilityPackage = (CapabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI) instanceof CapabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI) : CapabilityPackage.eINSTANCE);
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) : ProcessPackage.eINSTANCE);
		ProcessinstancePackageImpl theProcessinstancePackage = (ProcessinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) instanceof ProcessinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) : ProcessinstancePackage.eINSTANCE);
		ProductinstancePackageImpl theProductinstancePackage = (ProductinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI) instanceof ProductinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI) : ProductinstancePackage.eINSTANCE);
		WorkforcePackageImpl theWorkforcePackage = (WorkforcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) instanceof WorkforcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) : WorkforcePackage.eINSTANCE);
		MaterialPackageImpl theMaterialPackage = (MaterialPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI) instanceof MaterialPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI) : MaterialPackage.eINSTANCE);
		RoletopologyPackageImpl theRoletopologyPackage = (RoletopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RoletopologyPackage.eNS_URI) instanceof RoletopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RoletopologyPackage.eNS_URI) : RoletopologyPackage.eINSTANCE);
		ResourcePackageImpl theResourcePackage = (ResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI) instanceof ResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI) : ResourcePackage.eINSTANCE);
		ResourceinstancePackageImpl theResourceinstancePackage = (ResourceinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI) instanceof ResourceinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI) : ResourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theProductPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theWorkplanPackage.createPackageContents();
		theLinebalancingPackage.createPackageContents();
		theCapabilityPackage.createPackageContents();
		theProcessPackage.createPackageContents();
		theProcessinstancePackage.createPackageContents();
		theProductinstancePackage.createPackageContents();
		theWorkforcePackage.createPackageContents();
		theMaterialPackage.createPackageContents();
		theRoletopologyPackage.createPackageContents();
		theResourcePackage.createPackageContents();
		theResourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theProductPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theWorkplanPackage.initializePackageContents();
		theLinebalancingPackage.initializePackageContents();
		theCapabilityPackage.initializePackageContents();
		theProcessPackage.initializePackageContents();
		theProcessinstancePackage.initializePackageContents();
		theProductinstancePackage.initializePackageContents();
		theWorkforcePackage.initializePackageContents();
		theMaterialPackage.initializePackageContents();
		theRoletopologyPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();
		theResourceinstancePackage.initializePackageContents();

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
	public EClass getProductCatalogue() {
		return productCatalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductCatalogue_ProductGroups() {
		return (EReference)productCatalogueEClass.getEStructuralFeatures().get(0);
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
	public EReference getProductGroup_ProductVariants() {
		return (EReference)productGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductGroup_AssemblyGroups() {
		return (EReference)productGroupEClass.getEStructuralFeatures().get(1);
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
	public EReference getProductVariant_ProductGroup() {
		return (EReference)productVariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillOfMaterial() {
		return billOfMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillOfMaterial_Entries() {
		return (EReference)billOfMaterialEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getBOMEntry_Count() {
		return (EAttribute)bomEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyGroup() {
		return assemblyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyGroupEntry() {
		return assemblyGroupEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyGroupEntry_AssemblyGroup() {
		return (EReference)assemblyGroupEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentEntry() {
		return componentEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentEntry_Material() {
		return (EReference)componentEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManufacturedComponent() {
		return manufacturedComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManufacturedComponent_Bom() {
		return (EReference)manufacturedComponentEClass.getEStructuralFeatures().get(0);
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
		productCatalogueEClass = createEClass(PRODUCT_CATALOGUE);
		createEReference(productCatalogueEClass, PRODUCT_CATALOGUE__PRODUCT_GROUPS);

		productGroupEClass = createEClass(PRODUCT_GROUP);
		createEReference(productGroupEClass, PRODUCT_GROUP__PRODUCT_VARIANTS);
		createEReference(productGroupEClass, PRODUCT_GROUP__ASSEMBLY_GROUPS);

		productVariantEClass = createEClass(PRODUCT_VARIANT);
		createEReference(productVariantEClass, PRODUCT_VARIANT__PRODUCT_GROUP);

		billOfMaterialEClass = createEClass(BILL_OF_MATERIAL);
		createEReference(billOfMaterialEClass, BILL_OF_MATERIAL__ENTRIES);

		bomEntryEClass = createEClass(BOM_ENTRY);
		createEAttribute(bomEntryEClass, BOM_ENTRY__COUNT);

		assemblyGroupEClass = createEClass(ASSEMBLY_GROUP);

		assemblyGroupEntryEClass = createEClass(ASSEMBLY_GROUP_ENTRY);
		createEReference(assemblyGroupEntryEClass, ASSEMBLY_GROUP_ENTRY__ASSEMBLY_GROUP);

		componentEntryEClass = createEClass(COMPONENT_ENTRY);
		createEReference(componentEntryEClass, COMPONENT_ENTRY__MATERIAL);

		manufacturedComponentEClass = createEClass(MANUFACTURED_COMPONENT);
		createEReference(manufacturedComponentEClass, MANUFACTURED_COMPONENT__BOM);
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
		MaterialPackage theMaterialPackage = (MaterialPackage)EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		productGroupEClass.getESuperTypes().add(theBasePackage.getEntity());
		productVariantEClass.getESuperTypes().add(this.getManufacturedComponent());
		billOfMaterialEClass.getESuperTypes().add(theBasePackage.getEntity());
		assemblyGroupEClass.getESuperTypes().add(this.getManufacturedComponent());
		assemblyGroupEntryEClass.getESuperTypes().add(this.getBOMEntry());
		componentEntryEClass.getESuperTypes().add(this.getBOMEntry());
		manufacturedComponentEClass.getESuperTypes().add(theBasePackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(productCatalogueEClass, ProductCatalogue.class, "ProductCatalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductCatalogue_ProductGroups(), this.getProductGroup(), null, "productGroups", null, 0, -1, ProductCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productGroupEClass, ProductGroup.class, "ProductGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductGroup_ProductVariants(), this.getProductVariant(), this.getProductVariant_ProductGroup(), "productVariants", null, 0, -1, ProductGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductGroup_AssemblyGroups(), this.getAssemblyGroup(), null, "assemblyGroups", null, 0, -1, ProductGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productVariantEClass, ProductVariant.class, "ProductVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductVariant_ProductGroup(), this.getProductGroup(), this.getProductGroup_ProductVariants(), "productGroup", null, 1, 1, ProductVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(billOfMaterialEClass, BillOfMaterial.class, "BillOfMaterial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillOfMaterial_Entries(), this.getBOMEntry(), null, "entries", null, 0, -1, BillOfMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bomEntryEClass, BOMEntry.class, "BOMEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBOMEntry_Count(), ecorePackage.getEInt(), "count", null, 1, 1, BOMEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyGroupEClass, AssemblyGroup.class, "AssemblyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assemblyGroupEntryEClass, AssemblyGroupEntry.class, "AssemblyGroupEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyGroupEntry_AssemblyGroup(), this.getAssemblyGroup(), null, "assemblyGroup", null, 1, 1, AssemblyGroupEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEntryEClass, ComponentEntry.class, "ComponentEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentEntry_Material(), theMaterialPackage.getMaterial(), null, "material", null, 1, 1, ComponentEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manufacturedComponentEClass, ManufacturedComponent.class, "ManufacturedComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManufacturedComponent_Bom(), this.getBillOfMaterial(), null, "bom", null, 1, 1, ManufacturedComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //ProductPackageImpl
