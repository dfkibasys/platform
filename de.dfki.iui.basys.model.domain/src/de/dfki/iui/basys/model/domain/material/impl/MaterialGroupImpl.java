/**
 */
package de.dfki.iui.basys.model.domain.material.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.MaterialGroup;
import de.dfki.iui.basys.model.domain.material.MaterialPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.material.impl.MaterialGroupImpl#getMaterialGroups <em>Material Groups</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.material.impl.MaterialGroupImpl#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialGroupImpl extends EntityImpl implements MaterialGroup {
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
	 * The cached value of the '{@link #getMaterials() <em>Materials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<Material> materials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaterialPackage.Literals.MATERIAL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialGroup> getMaterialGroups() {
		if (materialGroups == null) {
			materialGroups = new EObjectContainmentEList<MaterialGroup>(MaterialGroup.class, this, MaterialPackage.MATERIAL_GROUP__MATERIAL_GROUPS);
		}
		return materialGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Material> getMaterials() {
		if (materials == null) {
			materials = new EObjectContainmentEList<Material>(Material.class, this, MaterialPackage.MATERIAL_GROUP__MATERIALS);
		}
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaterialPackage.MATERIAL_GROUP__MATERIAL_GROUPS:
				return ((InternalEList<?>)getMaterialGroups()).basicRemove(otherEnd, msgs);
			case MaterialPackage.MATERIAL_GROUP__MATERIALS:
				return ((InternalEList<?>)getMaterials()).basicRemove(otherEnd, msgs);
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
			case MaterialPackage.MATERIAL_GROUP__MATERIAL_GROUPS:
				return getMaterialGroups();
			case MaterialPackage.MATERIAL_GROUP__MATERIALS:
				return getMaterials();
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
			case MaterialPackage.MATERIAL_GROUP__MATERIAL_GROUPS:
				getMaterialGroups().clear();
				getMaterialGroups().addAll((Collection<? extends MaterialGroup>)newValue);
				return;
			case MaterialPackage.MATERIAL_GROUP__MATERIALS:
				getMaterials().clear();
				getMaterials().addAll((Collection<? extends Material>)newValue);
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
			case MaterialPackage.MATERIAL_GROUP__MATERIAL_GROUPS:
				getMaterialGroups().clear();
				return;
			case MaterialPackage.MATERIAL_GROUP__MATERIALS:
				getMaterials().clear();
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
			case MaterialPackage.MATERIAL_GROUP__MATERIAL_GROUPS:
				return materialGroups != null && !materialGroups.isEmpty();
			case MaterialPackage.MATERIAL_GROUP__MATERIALS:
				return materials != null && !materials.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MaterialGroupImpl
