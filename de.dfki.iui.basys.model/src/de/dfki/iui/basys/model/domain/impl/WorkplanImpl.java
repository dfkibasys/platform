/**
 */
package de.dfki.iui.basys.model.domain.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.domain.DomainPackage;
import de.dfki.iui.basys.model.domain.Workplan;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.impl.WorkplanImpl#getProductVariantId <em>Product Variant Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.impl.WorkplanImpl#getWorkstepIds <em>Workstep Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkplanImpl extends IdentifiableEntityImpl implements Workplan {
	/**
	 * The default value of the '{@link #getProductVariantId() <em>Product Variant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVariantId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_VARIANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductVariantId() <em>Product Variant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVariantId()
	 * @generated
	 * @ordered
	 */
	protected String productVariantId = PRODUCT_VARIANT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkstepIds() <em>Workstep Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workstepIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.WORKPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductVariantId() {
		return productVariantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVariantId(String newProductVariantId) {
		String oldProductVariantId = productVariantId;
		productVariantId = newProductVariantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.WORKPLAN__PRODUCT_VARIANT_ID, oldProductVariantId, productVariantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWorkstepIds() {
		if (workstepIds == null) {
			workstepIds = new EDataTypeUniqueEList<String>(String.class, this, DomainPackage.WORKPLAN__WORKSTEP_IDS);
		}
		return workstepIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.WORKPLAN__PRODUCT_VARIANT_ID:
				return getProductVariantId();
			case DomainPackage.WORKPLAN__WORKSTEP_IDS:
				return getWorkstepIds();
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
			case DomainPackage.WORKPLAN__PRODUCT_VARIANT_ID:
				setProductVariantId((String)newValue);
				return;
			case DomainPackage.WORKPLAN__WORKSTEP_IDS:
				getWorkstepIds().clear();
				getWorkstepIds().addAll((Collection<? extends String>)newValue);
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
			case DomainPackage.WORKPLAN__PRODUCT_VARIANT_ID:
				setProductVariantId(PRODUCT_VARIANT_ID_EDEFAULT);
				return;
			case DomainPackage.WORKPLAN__WORKSTEP_IDS:
				getWorkstepIds().clear();
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
			case DomainPackage.WORKPLAN__PRODUCT_VARIANT_ID:
				return PRODUCT_VARIANT_ID_EDEFAULT == null ? productVariantId != null : !PRODUCT_VARIANT_ID_EDEFAULT.equals(productVariantId);
			case DomainPackage.WORKPLAN__WORKSTEP_IDS:
				return workstepIds != null && !workstepIds.isEmpty();
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
		result.append(" (productVariantId: ");
		result.append(productVariantId);
		result.append(", workstepIds: ");
		result.append(workstepIds);
		result.append(')');
		return result.toString();
	}

} //WorkplanImpl
