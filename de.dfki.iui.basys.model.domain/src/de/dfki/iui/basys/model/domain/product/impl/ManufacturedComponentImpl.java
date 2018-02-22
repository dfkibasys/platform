/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.product.BillOfMaterial;
import de.dfki.iui.basys.model.domain.product.ManufacturedComponent;
import de.dfki.iui.basys.model.domain.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufactured Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ManufacturedComponentImpl#getBom <em>Bom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManufacturedComponentImpl extends EntityImpl implements ManufacturedComponent {
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
	protected ManufacturedComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.MANUFACTURED_COMPONENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.MANUFACTURED_COMPONENT__BOM, oldBom, newBom);
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
				msgs = ((InternalEObject)bom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.MANUFACTURED_COMPONENT__BOM, null, msgs);
			if (newBom != null)
				msgs = ((InternalEObject)newBom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.MANUFACTURED_COMPONENT__BOM, null, msgs);
			msgs = basicSetBom(newBom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.MANUFACTURED_COMPONENT__BOM, newBom, newBom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.MANUFACTURED_COMPONENT__BOM:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.MANUFACTURED_COMPONENT__BOM:
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
			case ProductPackage.MANUFACTURED_COMPONENT__BOM:
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
			case ProductPackage.MANUFACTURED_COMPONENT__BOM:
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
			case ProductPackage.MANUFACTURED_COMPONENT__BOM:
				return bom != null;
		}
		return super.eIsSet(featureID);
	}

} //ManufacturedComponentImpl
