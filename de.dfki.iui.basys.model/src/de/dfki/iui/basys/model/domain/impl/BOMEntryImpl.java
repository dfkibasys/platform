/**
 */
package de.dfki.iui.basys.model.domain.impl;

import de.dfki.iui.basys.model.domain.BOMEntry;
import de.dfki.iui.basys.model.domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOM Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.impl.BOMEntryImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.impl.BOMEntryImpl#getMaterialId <em>Material Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOMEntryImpl extends MinimalEObjectImpl.Container implements BOMEntry {
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected int amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaterialId() <em>Material Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialId()
	 * @generated
	 * @ordered
	 */
	protected static final String MATERIAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaterialId() <em>Material Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialId()
	 * @generated
	 * @ordered
	 */
	protected String materialId = MATERIAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOMEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.BOM_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(int newAmount) {
		int oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BOM_ENTRY__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaterialId() {
		return materialId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialId(String newMaterialId) {
		String oldMaterialId = materialId;
		materialId = newMaterialId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BOM_ENTRY__MATERIAL_ID, oldMaterialId, materialId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.BOM_ENTRY__AMOUNT:
				return getAmount();
			case DomainPackage.BOM_ENTRY__MATERIAL_ID:
				return getMaterialId();
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
			case DomainPackage.BOM_ENTRY__AMOUNT:
				setAmount((Integer)newValue);
				return;
			case DomainPackage.BOM_ENTRY__MATERIAL_ID:
				setMaterialId((String)newValue);
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
			case DomainPackage.BOM_ENTRY__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case DomainPackage.BOM_ENTRY__MATERIAL_ID:
				setMaterialId(MATERIAL_ID_EDEFAULT);
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
			case DomainPackage.BOM_ENTRY__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case DomainPackage.BOM_ENTRY__MATERIAL_ID:
				return MATERIAL_ID_EDEFAULT == null ? materialId != null : !MATERIAL_ID_EDEFAULT.equals(materialId);
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
		result.append(" (amount: ");
		result.append(amount);
		result.append(", materialId: ");
		result.append(materialId);
		result.append(')');
		return result.toString();
	}

} //BOMEntryImpl
