/**
 */
package de.dfki.cos.basys.platform.model.domain.productdefinition.impl;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.domain.material.Material;
import de.dfki.cos.basys.platform.model.domain.productdefinition.MaterialEntry;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productdefinition.impl.MaterialEntryImpl#getCount <em>Count</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productdefinition.impl.MaterialEntryImpl#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialEntryImpl extends EntityImpl implements MaterialEntry {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected Material material;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductdefinitionPackage.Literals.MATERIAL_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductdefinitionPackage.MATERIAL_ENTRY__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material getMaterial() {
		if (material != null && material.eIsProxy()) {
			InternalEObject oldMaterial = (InternalEObject)material;
			material = (Material)eResolveProxy(oldMaterial);
			if (material != oldMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductdefinitionPackage.MATERIAL_ENTRY__MATERIAL, oldMaterial, material));
			}
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material basicGetMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(Material newMaterial) {
		Material oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductdefinitionPackage.MATERIAL_ENTRY__MATERIAL, oldMaterial, material));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductdefinitionPackage.MATERIAL_ENTRY__COUNT:
				return getCount();
			case ProductdefinitionPackage.MATERIAL_ENTRY__MATERIAL:
				if (resolve) return getMaterial();
				return basicGetMaterial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductdefinitionPackage.MATERIAL_ENTRY__COUNT:
				setCount((Integer)newValue);
				return;
			case ProductdefinitionPackage.MATERIAL_ENTRY__MATERIAL:
				setMaterial((Material)newValue);
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
			case ProductdefinitionPackage.MATERIAL_ENTRY__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case ProductdefinitionPackage.MATERIAL_ENTRY__MATERIAL:
				setMaterial((Material)null);
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
			case ProductdefinitionPackage.MATERIAL_ENTRY__COUNT:
				return count != COUNT_EDEFAULT;
			case ProductdefinitionPackage.MATERIAL_ENTRY__MATERIAL:
				return material != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //MaterialEntryImpl
