/**
 */
package de.dfki.cos.basys.platform.model.domain.material.impl;

import de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue;
import de.dfki.cos.basys.platform.model.domain.material.MaterialGroup;
import de.dfki.cos.basys.platform.model.domain.material.MaterialPackage;
import de.dfki.cos.basys.platform.model.util.BasysEObjectImpl;

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
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.material.impl.MaterialCatalogueImpl#getMaterialGroups <em>Material Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialCatalogueImpl extends BasysEObjectImpl implements MaterialCatalogue {
	/**
	 * The cached value of the '{@link #getMaterialGroups() <em>Material Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialGroup> materialGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialCatalogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaterialPackage.Literals.MATERIAL_CATALOGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialGroup> getMaterialGroups() {
		if (materialGroups == null) {
			materialGroups = new EObjectContainmentEList<MaterialGroup>(MaterialGroup.class, this, MaterialPackage.MATERIAL_CATALOGUE__MATERIAL_GROUPS);
		}
		return materialGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaterialPackage.MATERIAL_CATALOGUE__MATERIAL_GROUPS:
				return ((InternalEList<?>)getMaterialGroups()).basicRemove(otherEnd, msgs);
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
			case MaterialPackage.MATERIAL_CATALOGUE__MATERIAL_GROUPS:
				return getMaterialGroups();
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
			case MaterialPackage.MATERIAL_CATALOGUE__MATERIAL_GROUPS:
				getMaterialGroups().clear();
				getMaterialGroups().addAll((Collection<? extends MaterialGroup>)newValue);
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
			case MaterialPackage.MATERIAL_CATALOGUE__MATERIAL_GROUPS:
				getMaterialGroups().clear();
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
			case MaterialPackage.MATERIAL_CATALOGUE__MATERIAL_GROUPS:
				return materialGroups != null && !materialGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MaterialCatalogueImpl
