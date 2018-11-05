/**
 */
package de.dfki.iui.basys.model.domain.resourcetype.impl;

import de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogueCollection;
import de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage;

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
 * An implementation of the model object '<em><b>Resource Type Catalogue Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeCatalogueCollectionImpl#getCatalogues <em>Catalogues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTypeCatalogueCollectionImpl extends BasysEObjectImpl implements ResourceTypeCatalogueCollection {
	/**
	 * The cached value of the '{@link #getCatalogues() <em>Catalogues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogues()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceTypeCatalogue> catalogues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeCatalogueCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcetypePackage.Literals.RESOURCE_TYPE_CATALOGUE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceTypeCatalogue> getCatalogues() {
		if (catalogues == null) {
			catalogues = new EObjectContainmentEList<ResourceTypeCatalogue>(ResourceTypeCatalogue.class, this, ResourcetypePackage.RESOURCE_TYPE_CATALOGUE_COLLECTION__CATALOGUES);
		}
		return catalogues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcetypePackage.RESOURCE_TYPE_CATALOGUE_COLLECTION__CATALOGUES:
				return ((InternalEList<?>)getCatalogues()).basicRemove(otherEnd, msgs);
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
			case ResourcetypePackage.RESOURCE_TYPE_CATALOGUE_COLLECTION__CATALOGUES:
				return getCatalogues();
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
			case ResourcetypePackage.RESOURCE_TYPE_CATALOGUE_COLLECTION__CATALOGUES:
				getCatalogues().clear();
				getCatalogues().addAll((Collection<? extends ResourceTypeCatalogue>)newValue);
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
			case ResourcetypePackage.RESOURCE_TYPE_CATALOGUE_COLLECTION__CATALOGUES:
				getCatalogues().clear();
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
			case ResourcetypePackage.RESOURCE_TYPE_CATALOGUE_COLLECTION__CATALOGUES:
				return catalogues != null && !catalogues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceTypeCatalogueCollectionImpl
