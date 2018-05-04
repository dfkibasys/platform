/**
 */
package de.dfki.iui.basys.model.domain.productdefinition.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;
import de.dfki.iui.basys.model.domain.productdefinition.AssemblyGroup;
import de.dfki.iui.basys.model.domain.productdefinition.BillOfMaterial;
import de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.impl.AssemblyGroupImpl#getBom <em>Bom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyGroupImpl extends EntityImpl implements AssemblyGroup {
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
	protected AssemblyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductdefinitionPackage.Literals.ASSEMBLY_GROUP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductdefinitionPackage.ASSEMBLY_GROUP__BOM, oldBom, newBom);
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
				msgs = ((InternalEObject)bom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductdefinitionPackage.ASSEMBLY_GROUP__BOM, null, msgs);
			if (newBom != null)
				msgs = ((InternalEObject)newBom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductdefinitionPackage.ASSEMBLY_GROUP__BOM, null, msgs);
			msgs = basicSetBom(newBom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductdefinitionPackage.ASSEMBLY_GROUP__BOM, newBom, newBom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductdefinitionPackage.ASSEMBLY_GROUP__BOM:
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP__BOM:
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP__BOM:
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP__BOM:
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP__BOM:
				return bom != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyGroupImpl
