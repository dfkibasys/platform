/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.product.AssemblyGroup;
import de.dfki.iui.basys.model.domain.product.ProductGroup;
import de.dfki.iui.basys.model.domain.product.ProductPackage;
import de.dfki.iui.basys.model.domain.product.ProductVariant;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ProductGroupImpl#getProductVariants <em>Product Variants</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ProductGroupImpl#getAssemblyGroups <em>Assembly Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductGroupImpl extends EntityImpl implements ProductGroup {
	/**
	 * The cached value of the '{@link #getProductVariants() <em>Product Variants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductVariant> productVariants;

	/**
	 * The cached value of the '{@link #getAssemblyGroups() <em>Assembly Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyGroup> assemblyGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductVariant> getProductVariants() {
		if (productVariants == null) {
			productVariants = new EObjectContainmentWithInverseEList<ProductVariant>(ProductVariant.class, this, ProductPackage.PRODUCT_GROUP__PRODUCT_VARIANTS, ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP);
		}
		return productVariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyGroup> getAssemblyGroups() {
		if (assemblyGroups == null) {
			assemblyGroups = new EObjectContainmentEList<AssemblyGroup>(AssemblyGroup.class, this, ProductPackage.PRODUCT_GROUP__ASSEMBLY_GROUPS);
		}
		return assemblyGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.PRODUCT_GROUP__PRODUCT_VARIANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductVariants()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.PRODUCT_GROUP__PRODUCT_VARIANTS:
				return ((InternalEList<?>)getProductVariants()).basicRemove(otherEnd, msgs);
			case ProductPackage.PRODUCT_GROUP__ASSEMBLY_GROUPS:
				return ((InternalEList<?>)getAssemblyGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_GROUP__PRODUCT_VARIANTS:
				return getProductVariants();
			case ProductPackage.PRODUCT_GROUP__ASSEMBLY_GROUPS:
				return getAssemblyGroups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductPackage.PRODUCT_GROUP__PRODUCT_VARIANTS:
				getProductVariants().clear();
				getProductVariants().addAll((Collection<? extends ProductVariant>)newValue);
				return;
			case ProductPackage.PRODUCT_GROUP__ASSEMBLY_GROUPS:
				getAssemblyGroups().clear();
				getAssemblyGroups().addAll((Collection<? extends AssemblyGroup>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductPackage.PRODUCT_GROUP__PRODUCT_VARIANTS:
				getProductVariants().clear();
				return;
			case ProductPackage.PRODUCT_GROUP__ASSEMBLY_GROUPS:
				getAssemblyGroups().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductPackage.PRODUCT_GROUP__PRODUCT_VARIANTS:
				return productVariants != null && !productVariants.isEmpty();
			case ProductPackage.PRODUCT_GROUP__ASSEMBLY_GROUPS:
				return assemblyGroups != null && !assemblyGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductGroupImpl
