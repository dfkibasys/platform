/**
 */
package de.dfki.iui.basys.model.domain.product;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.product.ProductFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ProductPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "product";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/product";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "product";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductPackage eINSTANCE = de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductCatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductCatalogueImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductCatalogue()
	 * @generated
	 */
	int PRODUCT_CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>Product Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATALOGUE__PRODUCT_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATALOGUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductGroupImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductGroup()
	 * @generated
	 */
	int PRODUCT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Product Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__PRODUCT_VARIANTS = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductVariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductVariantImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductVariant()
	 * @generated
	 */
	int PRODUCT_VARIANT = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Product Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__PRODUCT_GROUP = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__BOM = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.BillOfMaterialImpl <em>Bill Of Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.BillOfMaterialImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getBillOfMaterial()
	 * @generated
	 */
	int BILL_OF_MATERIAL = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OF_MATERIAL__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OF_MATERIAL__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OF_MATERIAL__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OF_MATERIAL__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OF_MATERIAL__ENTRIES = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bill Of Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OF_MATERIAL_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bill Of Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OF_MATERIAL_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.BOMEntryImpl <em>BOM Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.BOMEntryImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getBOMEntry()
	 * @generated
	 */
	int BOM_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_ENTRY__COUNT = 0;

	/**
	 * The feature id for the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_ENTRY__MATERIAL = 1;

	/**
	 * The number of structural features of the '<em>BOM Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BOM Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_ENTRY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductCatalogue
	 * @generated
	 */
	EClass getProductCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.product.ProductCatalogue#getProductGroups <em>Product Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Groups</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductCatalogue#getProductGroups()
	 * @see #getProductCatalogue()
	 * @generated
	 */
	EReference getProductCatalogue_ProductGroups();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductGroup
	 * @generated
	 */
	EClass getProductGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.product.ProductGroup#getProductVariants <em>Product Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Variants</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductGroup#getProductVariants()
	 * @see #getProductGroup()
	 * @generated
	 */
	EReference getProductGroup_ProductVariants();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductVariant
	 * @generated
	 */
	EClass getProductVariant();

	/**
	 * Returns the meta object for the container reference '{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getProductGroup <em>Product Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product Group</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductVariant#getProductGroup()
	 * @see #getProductVariant()
	 * @generated
	 */
	EReference getProductVariant_ProductGroup();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getBom <em>Bom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bom</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductVariant#getBom()
	 * @see #getProductVariant()
	 * @generated
	 */
	EReference getProductVariant_Bom();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.BillOfMaterial <em>Bill Of Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Of Material</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.BillOfMaterial
	 * @generated
	 */
	EClass getBillOfMaterial();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.product.BillOfMaterial#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.BillOfMaterial#getEntries()
	 * @see #getBillOfMaterial()
	 * @generated
	 */
	EReference getBillOfMaterial_Entries();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.BOMEntry <em>BOM Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOM Entry</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.BOMEntry
	 * @generated
	 */
	EClass getBOMEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.BOMEntry#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.BOMEntry#getCount()
	 * @see #getBOMEntry()
	 * @generated
	 */
	EAttribute getBOMEntry_Count();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.product.BOMEntry#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.BOMEntry#getMaterial()
	 * @see #getBOMEntry()
	 * @generated
	 */
	EReference getBOMEntry_Material();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductFactory getProductFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductCatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductCatalogueImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductCatalogue()
		 * @generated
		 */
		EClass PRODUCT_CATALOGUE = eINSTANCE.getProductCatalogue();

		/**
		 * The meta object literal for the '<em><b>Product Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATALOGUE__PRODUCT_GROUPS = eINSTANCE.getProductCatalogue_ProductGroups();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductGroupImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductGroup()
		 * @generated
		 */
		EClass PRODUCT_GROUP = eINSTANCE.getProductGroup();

		/**
		 * The meta object literal for the '<em><b>Product Variants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GROUP__PRODUCT_VARIANTS = eINSTANCE.getProductGroup_ProductVariants();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductVariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductVariantImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductVariant()
		 * @generated
		 */
		EClass PRODUCT_VARIANT = eINSTANCE.getProductVariant();

		/**
		 * The meta object literal for the '<em><b>Product Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_VARIANT__PRODUCT_GROUP = eINSTANCE.getProductVariant_ProductGroup();

		/**
		 * The meta object literal for the '<em><b>Bom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_VARIANT__BOM = eINSTANCE.getProductVariant_Bom();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.BillOfMaterialImpl <em>Bill Of Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.BillOfMaterialImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getBillOfMaterial()
		 * @generated
		 */
		EClass BILL_OF_MATERIAL = eINSTANCE.getBillOfMaterial();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_OF_MATERIAL__ENTRIES = eINSTANCE.getBillOfMaterial_Entries();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.BOMEntryImpl <em>BOM Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.BOMEntryImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getBOMEntry()
		 * @generated
		 */
		EClass BOM_ENTRY = eINSTANCE.getBOMEntry();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOM_ENTRY__COUNT = eINSTANCE.getBOMEntry_Count();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOM_ENTRY__MATERIAL = eINSTANCE.getBOMEntry_Material();

	}

} //ProductPackage
