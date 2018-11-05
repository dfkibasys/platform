/**
 */
package de.dfki.iui.basys.model.domain.productdefinition.util;

import de.dfki.iui.basys.model.base.BObject;
import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.domain.productdefinition.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage
 * @generated
 */
public class ProductdefinitionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductdefinitionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductdefinitionSwitch() {
		if (modelPackage == null) {
			modelPackage = ProductdefinitionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProductdefinitionPackage.PRODUCT_CATALOGUE: {
				ProductCatalogue productCatalogue = (ProductCatalogue)theEObject;
				T result = caseProductCatalogue(productCatalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductdefinitionPackage.PRODUCT_GROUP: {
				ProductGroup productGroup = (ProductGroup)theEObject;
				T result = caseProductGroup(productGroup);
				if (result == null) result = caseEntity(productGroup);
				if (result == null) result = caseBObject(productGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductdefinitionPackage.PRODUCT_VARIANT: {
				ProductVariant productVariant = (ProductVariant)theEObject;
				T result = caseProductVariant(productVariant);
				if (result == null) result = caseManufacturedComponent(productVariant);
				if (result == null) result = caseEntity(productVariant);
				if (result == null) result = caseBObject(productVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductdefinitionPackage.BILL_OF_MATERIAL: {
				BillOfMaterial billOfMaterial = (BillOfMaterial)theEObject;
				T result = caseBillOfMaterial(billOfMaterial);
				if (result == null) result = caseEntity(billOfMaterial);
				if (result == null) result = caseBObject(billOfMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductdefinitionPackage.BOM_ENTRY: {
				BOMEntry bomEntry = (BOMEntry)theEObject;
				T result = caseBOMEntry(bomEntry);
				if (result == null) result = caseEntity(bomEntry);
				if (result == null) result = caseBObject(bomEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductdefinitionPackage.ASSEMBLY_GROUP: {
				AssemblyGroup assemblyGroup = (AssemblyGroup)theEObject;
				T result = caseAssemblyGroup(assemblyGroup);
				if (result == null) result = caseManufacturedComponent(assemblyGroup);
				if (result == null) result = caseEntity(assemblyGroup);
				if (result == null) result = caseBObject(assemblyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY: {
				AssemblyGroupEntry assemblyGroupEntry = (AssemblyGroupEntry)theEObject;
				T result = caseAssemblyGroupEntry(assemblyGroupEntry);
				if (result == null) result = caseBOMEntry(assemblyGroupEntry);
				if (result == null) result = caseEntity(assemblyGroupEntry);
				if (result == null) result = caseBObject(assemblyGroupEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductdefinitionPackage.MATERIAL_ENTRY: {
				MaterialEntry materialEntry = (MaterialEntry)theEObject;
				T result = caseMaterialEntry(materialEntry);
				if (result == null) result = caseBOMEntry(materialEntry);
				if (result == null) result = caseEntity(materialEntry);
				if (result == null) result = caseBObject(materialEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductdefinitionPackage.MANUFACTURED_COMPONENT: {
				ManufacturedComponent manufacturedComponent = (ManufacturedComponent)theEObject;
				T result = caseManufacturedComponent(manufacturedComponent);
				if (result == null) result = caseEntity(manufacturedComponent);
				if (result == null) result = caseBObject(manufacturedComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductCatalogue(ProductCatalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductGroup(ProductGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductVariant(ProductVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Of Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Of Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillOfMaterial(BillOfMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOM Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOM Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOMEntry(BOMEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyGroup(AssemblyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Group Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Group Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyGroupEntry(AssemblyGroupEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialEntry(MaterialEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufactured Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufactured Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturedComponent(ManufacturedComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProductdefinitionSwitch
