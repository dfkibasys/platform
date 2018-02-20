/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.domain.product.ProductCatalogue;
import de.dfki.iui.basys.model.domain.product.ProductGroup;
import de.dfki.iui.basys.model.domain.product.ProductPackage;

import de.dfki.iui.basys.model.util.BasysEObjectImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ProductCatalogueImpl#getProductGroups <em>Product Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCatalogueImpl extends BasysEObjectImpl implements ProductCatalogue {
	/**
	 * The cached value of the '{@link #getProductGroups() <em>Product Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductGroup> productGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCatalogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_CATALOGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductGroup> getProductGroups() {
		if (productGroups == null) {
			productGroups = new EObjectContainmentEList<ProductGroup>(ProductGroup.class, this, ProductPackage.PRODUCT_CATALOGUE__PRODUCT_GROUPS);
		}
		return productGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.PRODUCT_CATALOGUE__PRODUCT_GROUPS:
				return ((InternalEList<?>)getProductGroups()).basicRemove(otherEnd, msgs);
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
			case ProductPackage.PRODUCT_CATALOGUE__PRODUCT_GROUPS:
				return getProductGroups();
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
			case ProductPackage.PRODUCT_CATALOGUE__PRODUCT_GROUPS:
				getProductGroups().clear();
				getProductGroups().addAll((Collection<? extends ProductGroup>)newValue);
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
			case ProductPackage.PRODUCT_CATALOGUE__PRODUCT_GROUPS:
				getProductGroups().clear();
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
			case ProductPackage.PRODUCT_CATALOGUE__PRODUCT_GROUPS:
				return productGroups != null && !productGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductCatalogueImpl
