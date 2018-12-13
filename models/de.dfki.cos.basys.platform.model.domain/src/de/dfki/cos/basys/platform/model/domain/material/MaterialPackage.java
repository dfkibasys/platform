/**
 */
package de.dfki.cos.basys.platform.model.domain.material;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dfki.cos.basys.platform.model.base.BasePackage;

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
 * @see de.dfki.cos.basys.platform.model.domain.material.MaterialFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface MaterialPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "material";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/material";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "material";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaterialPackage eINSTANCE = de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.material.impl.MaterialCatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialCatalogueImpl
	 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl#getMaterialCatalogue()
	 * @generated
	 */
	int MATERIAL_CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>Material Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CATALOGUE__MATERIAL_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CATALOGUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.material.impl.MaterialGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialGroupImpl
	 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl#getMaterialGroup()
	 * @generated
	 */
	int MATERIAL_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GROUP__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GROUP__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GROUP__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GROUP__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Material Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GROUP__MATERIAL_GROUPS = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GROUP__MATERIALS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GROUP_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GROUP_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.material.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialImpl
	 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue
	 * @generated
	 */
	EClass getMaterialCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue#getMaterialGroups <em>Material Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Material Groups</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue#getMaterialGroups()
	 * @see #getMaterialCatalogue()
	 * @generated
	 */
	EReference getMaterialCatalogue_MaterialGroups();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.material.MaterialGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.material.MaterialGroup
	 * @generated
	 */
	EClass getMaterialGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.material.MaterialGroup#getMaterialGroups <em>Material Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Material Groups</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.material.MaterialGroup#getMaterialGroups()
	 * @see #getMaterialGroup()
	 * @generated
	 */
	EReference getMaterialGroup_MaterialGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.material.MaterialGroup#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Materials</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.material.MaterialGroup#getMaterials()
	 * @see #getMaterialGroup()
	 * @generated
	 */
	EReference getMaterialGroup_Materials();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.material.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.material.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaterialFactory getMaterialFactory();

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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.material.impl.MaterialCatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialCatalogueImpl
		 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl#getMaterialCatalogue()
		 * @generated
		 */
		EClass MATERIAL_CATALOGUE = eINSTANCE.getMaterialCatalogue();

		/**
		 * The meta object literal for the '<em><b>Material Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_CATALOGUE__MATERIAL_GROUPS = eINSTANCE.getMaterialCatalogue_MaterialGroups();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.material.impl.MaterialGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialGroupImpl
		 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl#getMaterialGroup()
		 * @generated
		 */
		EClass MATERIAL_GROUP = eINSTANCE.getMaterialGroup();

		/**
		 * The meta object literal for the '<em><b>Material Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_GROUP__MATERIAL_GROUPS = eINSTANCE.getMaterialGroup_MaterialGroups();

		/**
		 * The meta object literal for the '<em><b>Materials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_GROUP__MATERIALS = eINSTANCE.getMaterialGroup_Materials();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.material.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialImpl
		 * @see de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl#getMaterial()
		 * @generated
		 */
		EClass MATERIAL = eINSTANCE.getMaterial();

	}

} //MaterialPackage
