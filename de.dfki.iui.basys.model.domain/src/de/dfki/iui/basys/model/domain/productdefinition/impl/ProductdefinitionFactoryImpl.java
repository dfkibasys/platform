/**
 */
package de.dfki.iui.basys.model.domain.productdefinition.impl;

import de.dfki.iui.basys.model.domain.productdefinition.*;

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
public class ProductdefinitionFactoryImpl extends EFactoryImpl implements ProductdefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductdefinitionFactory init() {
		try {
			ProductdefinitionFactory theProductdefinitionFactory = (ProductdefinitionFactory)EPackage.Registry.INSTANCE.getEFactory(ProductdefinitionPackage.eNS_URI);
			if (theProductdefinitionFactory != null) {
				return theProductdefinitionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductdefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductdefinitionFactoryImpl() {
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
			case ProductdefinitionPackage.PRODUCT_CATALOGUE: return createProductCatalogue();
			case ProductdefinitionPackage.PRODUCT_GROUP: return createProductGroup();
			case ProductdefinitionPackage.PRODUCT_VARIANT: return createProductVariant();
			case ProductdefinitionPackage.BILL_OF_MATERIAL: return createBillOfMaterial();
			case ProductdefinitionPackage.BOM_ENTRY: return createBOMEntry();
			case ProductdefinitionPackage.ASSEMBLY_GROUP: return createAssemblyGroup();
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY: return createAssemblyGroupEntry();
			case ProductdefinitionPackage.COMPONENT_ENTRY: return createComponentEntry();
			case ProductdefinitionPackage.MANUFACTURED_COMPONENT: return createManufacturedComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCatalogue createProductCatalogue() {
		ProductCatalogueImpl productCatalogue = new ProductCatalogueImpl();
		return productCatalogue;
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
	public BillOfMaterial createBillOfMaterial() {
		BillOfMaterialImpl billOfMaterial = new BillOfMaterialImpl();
		return billOfMaterial;
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
	public AssemblyGroup createAssemblyGroup() {
		AssemblyGroupImpl assemblyGroup = new AssemblyGroupImpl();
		return assemblyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyGroupEntry createAssemblyGroupEntry() {
		AssemblyGroupEntryImpl assemblyGroupEntry = new AssemblyGroupEntryImpl();
		return assemblyGroupEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentEntry createComponentEntry() {
		ComponentEntryImpl componentEntry = new ComponentEntryImpl();
		return componentEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturedComponent createManufacturedComponent() {
		ManufacturedComponentImpl manufacturedComponent = new ManufacturedComponentImpl();
		return manufacturedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductdefinitionPackage getProductdefinitionPackage() {
		return (ProductdefinitionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductdefinitionPackage getPackage() {
		return ProductdefinitionPackage.eINSTANCE;
	}

} //ProductdefinitionFactoryImpl
