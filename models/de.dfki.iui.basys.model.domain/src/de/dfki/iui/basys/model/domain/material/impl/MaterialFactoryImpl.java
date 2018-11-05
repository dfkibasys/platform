/**
 */
package de.dfki.iui.basys.model.domain.material.impl;

import de.dfki.iui.basys.model.domain.material.*;

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
public class MaterialFactoryImpl extends EFactoryImpl implements MaterialFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaterialFactory init() {
		try {
			MaterialFactory theMaterialFactory = (MaterialFactory)EPackage.Registry.INSTANCE.getEFactory(MaterialPackage.eNS_URI);
			if (theMaterialFactory != null) {
				return theMaterialFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MaterialFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialFactoryImpl() {
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
			case MaterialPackage.MATERIAL_CATALOGUE: return createMaterialCatalogue();
			case MaterialPackage.MATERIAL_GROUP: return createMaterialGroup();
			case MaterialPackage.MATERIAL: return createMaterial();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialCatalogue createMaterialCatalogue() {
		MaterialCatalogueImpl materialCatalogue = new MaterialCatalogueImpl();
		return materialCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialGroup createMaterialGroup() {
		MaterialGroupImpl materialGroup = new MaterialGroupImpl();
		return materialGroup;
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
	public MaterialPackage getMaterialPackage() {
		return (MaterialPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MaterialPackage getPackage() {
		return MaterialPackage.eINSTANCE;
	}

} //MaterialFactoryImpl
