/**
 */
package de.dfki.iui.basys.model.domain.productdefinition.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;
import de.dfki.iui.basys.model.domain.productdefinition.AssemblyGroup;
import de.dfki.iui.basys.model.domain.productdefinition.BillOfMaterial;
import de.dfki.iui.basys.model.domain.productdefinition.ProductGroup;
import de.dfki.iui.basys.model.domain.productdefinition.ProductVariant;
import de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.impl.ProductVariantImpl#getBom <em>Bom</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.impl.ProductVariantImpl#getProductGroup <em>Product Group</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.impl.ProductVariantImpl#getAssemblyGroups <em>Assembly Groups</em>}</li>
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
	 * The cached value of the '{@link #getAssemblyGroups() <em>Assembly Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyGroup> assemblyGroups;

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
		return ProductdefinitionPackage.Literals.PRODUCT_VARIANT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductdefinitionPackage.PRODUCT_VARIANT__BOM, oldBom, newBom);
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
				msgs = ((InternalEObject)bom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductdefinitionPackage.PRODUCT_VARIANT__BOM, null, msgs);
			if (newBom != null)
				msgs = ((InternalEObject)newBom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductdefinitionPackage.PRODUCT_VARIANT__BOM, null, msgs);
			msgs = basicSetBom(newBom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductdefinitionPackage.PRODUCT_VARIANT__BOM, newBom, newBom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductGroup getProductGroup() {
		if (eContainerFeatureID() != ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP) return null;
		return (ProductGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductGroup(ProductGroup newProductGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProductGroup, ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductGroup(ProductGroup newProductGroup) {
		if (newProductGroup != eInternalContainer() || (eContainerFeatureID() != ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP && newProductGroup != null)) {
			if (EcoreUtil.isAncestor(this, newProductGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProductGroup != null)
				msgs = ((InternalEObject)newProductGroup).eInverseAdd(this, ProductdefinitionPackage.PRODUCT_GROUP__PRODUCT_VARIANTS, ProductGroup.class, msgs);
			msgs = basicSetProductGroup(newProductGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP, newProductGroup, newProductGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyGroup> getAssemblyGroups() {
		if (assemblyGroups == null) {
			assemblyGroups = new EObjectContainmentEList<AssemblyGroup>(AssemblyGroup.class, this, ProductdefinitionPackage.PRODUCT_VARIANT__ASSEMBLY_GROUPS);
		}
		return assemblyGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
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
			case ProductdefinitionPackage.PRODUCT_VARIANT__BOM:
				return basicSetBom(null, msgs);
			case ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				return basicSetProductGroup(null, msgs);
			case ProductdefinitionPackage.PRODUCT_VARIANT__ASSEMBLY_GROUPS:
				return ((InternalEList<?>)getAssemblyGroups()).basicRemove(otherEnd, msgs);
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
			case ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				return eInternalContainer().eInverseRemove(this, ProductdefinitionPackage.PRODUCT_GROUP__PRODUCT_VARIANTS, ProductGroup.class, msgs);
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
			case ProductdefinitionPackage.PRODUCT_VARIANT__BOM:
				return getBom();
			case ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				return getProductGroup();
			case ProductdefinitionPackage.PRODUCT_VARIANT__ASSEMBLY_GROUPS:
				return getAssemblyGroups();
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
			case ProductdefinitionPackage.PRODUCT_VARIANT__BOM:
				setBom((BillOfMaterial)newValue);
				return;
			case ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				setProductGroup((ProductGroup)newValue);
				return;
			case ProductdefinitionPackage.PRODUCT_VARIANT__ASSEMBLY_GROUPS:
				getAssemblyGroups().clear();
				getAssemblyGroups().addAll((Collection<? extends AssemblyGroup>)newValue);
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
			case ProductdefinitionPackage.PRODUCT_VARIANT__BOM:
				setBom((BillOfMaterial)null);
				return;
			case ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				setProductGroup((ProductGroup)null);
				return;
			case ProductdefinitionPackage.PRODUCT_VARIANT__ASSEMBLY_GROUPS:
				getAssemblyGroups().clear();
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
			case ProductdefinitionPackage.PRODUCT_VARIANT__BOM:
				return bom != null;
			case ProductdefinitionPackage.PRODUCT_VARIANT__PRODUCT_GROUP:
				return getProductGroup() != null;
			case ProductdefinitionPackage.PRODUCT_VARIANT__ASSEMBLY_GROUPS:
				return assemblyGroups != null && !assemblyGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductVariantImpl
