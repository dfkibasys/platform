/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.product.BillOfMaterial;
import de.dfki.iui.basys.model.domain.product.ProductGroup;
import de.dfki.iui.basys.model.domain.product.ProductPackage;
import de.dfki.iui.basys.model.domain.product.ProductVariant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ProductVariantImpl#getProductGroup <em>Product Group</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ProductVariantImpl#getBom <em>Bom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductVariantImpl extends EntityImpl implements ProductVariant {
	/**
	 * The cached value of the '{@link #getBom() <em>Bom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBom()
	 * @generated
	 * @ordered
	 */
	protected BillOfMaterial bom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductGroup getProductGroup() {
		if (eContainerFeatureID() != ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP) return null;
		return (ProductGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductGroup(ProductGroup newProductGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProductGroup, ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductGroup(ProductGroup newProductGroup) {
		if (newProductGroup != eInternalContainer() || (eContainerFeatureID() != ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP && newProductGroup != null)) {
			if (EcoreUtil.isAncestor(this, newProductGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProductGroup != null)
				msgs = ((InternalEObject)newProductGroup).eInverseAdd(this, ProductPackage.PRODUCT_GROUP__PRODUCT_VARIANTS, ProductGroup.class, msgs);
			msgs = basicSetProductGroup(newProductGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP, newProductGroup, newProductGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillOfMaterial getBom() {
		return bom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBom(BillOfMaterial newBom, NotificationChain msgs) {
		BillOfMaterial oldBom = bom;
		bom = newBom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_VARIANT__BOM, oldBom, newBom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBom(BillOfMaterial newBom) {
		if (newBom != bom) {
			NotificationChain msgs = null;
			if (bom != null)
				msgs = ((InternalEObject)bom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT_VARIANT__BOM, null, msgs);
			if (newBom != null)
				msgs = ((InternalEObject)newBom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT_VARIANT__BOM, null, msgs);
			msgs = basicSetBom(newBom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_VARIANT__BOM, newBom, newBom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProductGroup((ProductGroup)otherEnd, msgs);
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
			case ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				return basicSetProductGroup(null, msgs);
			case ProductPackage.PRODUCT_VARIANT__BOM:
				return basicSetBom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				return eInternalContainer().eInverseRemove(this, ProductPackage.PRODUCT_GROUP__PRODUCT_VARIANTS, ProductGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				return getProductGroup();
			case ProductPackage.PRODUCT_VARIANT__BOM:
				return getBom();
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
			case ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				setProductGroup((ProductGroup)newValue);
				return;
			case ProductPackage.PRODUCT_VARIANT__BOM:
				setBom((BillOfMaterial)newValue);
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
			case ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				setProductGroup((ProductGroup)null);
				return;
			case ProductPackage.PRODUCT_VARIANT__BOM:
				setBom((BillOfMaterial)null);
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
			case ProductPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				return getProductGroup() != null;
			case ProductPackage.PRODUCT_VARIANT__BOM:
				return bom != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductVariantImpl
