/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.domain.product.*;

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
public class ProductFactoryImpl extends EFactoryImpl implements ProductFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductFactory init() {
		try {
			ProductFactory theProductFactory = (ProductFactory)EPackage.Registry.INSTANCE.getEFactory(ProductPackage.eNS_URI);
			if (theProductFactory != null) {
				return theProductFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactoryImpl() {
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
			case ProductPackage.PRODUCT_CATALOGUE: return createProductCatalogue();
			case ProductPackage.PRODUCT_GROUP: return createProductGroup();
			case ProductPackage.PRODUCT_VARIANT: return createProductVariant();
			case ProductPackage.BILL_OF_MATERIAL: return createBillOfMaterial();
			case ProductPackage.BOM_ENTRY: return createBOMEntry();
			case ProductPackage.ASSEMBLY_GROUP: return createAssemblyGroup();
			case ProductPackage.ASSEMBLY_GROUP_ENTRY: return createAssemblyGroupEntry();
			case ProductPackage.COMPONENT_ENTRY: return createComponentEntry();
			case ProductPackage.MANUFACTURED_COMPONENT: return createManufacturedComponent();
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
	public ProductPackage getProductPackage() {
		return (ProductPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductPackage getPackage() {
		return ProductPackage.eINSTANCE;
	}

} //ProductFactoryImpl
