/**
 */
package de.dfki.iui.basys.model.domain.processdefinition.impl;

import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.iui.basys.model.domain.processdefinition.UsedMaterial;

import de.dfki.iui.basys.model.domain.productdefinition.BOMEntry;

import de.dfki.iui.basys.model.util.BasysEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Used Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.UsedMaterialImpl#getCount <em>Count</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.UsedMaterialImpl#getBomEntry <em>Bom Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsedMaterialImpl extends BasysEObjectImpl implements UsedMaterial {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

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
	 * The cached value of the '{@link #getBomEntry() <em>Bom Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomEntry()
	 * @generated
	 * @ordered
	 */
	protected BOMEntry bomEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.USED_MATERIAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.USED_MATERIAL__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOMEntry getBomEntry() {
		if (bomEntry != null && bomEntry.eIsProxy()) {
			InternalEObject oldBomEntry = (InternalEObject)bomEntry;
			bomEntry = (BOMEntry)eResolveProxy(oldBomEntry);
			if (bomEntry != oldBomEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessdefinitionPackage.USED_MATERIAL__BOM_ENTRY, oldBomEntry, bomEntry));
			}
		}
		return bomEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOMEntry basicGetBomEntry() {
		return bomEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBomEntry(BOMEntry newBomEntry) {
		BOMEntry oldBomEntry = bomEntry;
		bomEntry = newBomEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.USED_MATERIAL__BOM_ENTRY, oldBomEntry, bomEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessdefinitionPackage.USED_MATERIAL__COUNT:
				return getCount();
			case ProcessdefinitionPackage.USED_MATERIAL__BOM_ENTRY:
				if (resolve) return getBomEntry();
				return basicGetBomEntry();
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
			case ProcessdefinitionPackage.USED_MATERIAL__COUNT:
				setCount((Integer)newValue);
				return;
			case ProcessdefinitionPackage.USED_MATERIAL__BOM_ENTRY:
				setBomEntry((BOMEntry)newValue);
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
			case ProcessdefinitionPackage.USED_MATERIAL__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case ProcessdefinitionPackage.USED_MATERIAL__BOM_ENTRY:
				setBomEntry((BOMEntry)null);
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
			case ProcessdefinitionPackage.USED_MATERIAL__COUNT:
				return count != COUNT_EDEFAULT;
			case ProcessdefinitionPackage.USED_MATERIAL__BOM_ENTRY:
				return bomEntry != null;
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

} //UsedMaterialImpl
