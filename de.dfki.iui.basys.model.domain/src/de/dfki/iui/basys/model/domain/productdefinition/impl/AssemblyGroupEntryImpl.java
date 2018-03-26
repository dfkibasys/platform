/**
 */
package de.dfki.iui.basys.model.domain.productdefinition.impl;

import de.dfki.iui.basys.model.domain.productdefinition.AssemblyGroup;
import de.dfki.iui.basys.model.domain.productdefinition.AssemblyGroupEntry;
import de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Group Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.impl.AssemblyGroupEntryImpl#getAssemblyGroup <em>Assembly Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyGroupEntryImpl extends BOMEntryImpl implements AssemblyGroupEntry {
	/**
	 * The cached value of the '{@link #getAssemblyGroup() <em>Assembly Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyGroup()
	 * @generated
	 * @ordered
	 */
	protected AssemblyGroup assemblyGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyGroupEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductdefinitionPackage.Literals.ASSEMBLY_GROUP_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyGroup getAssemblyGroup() {
		if (assemblyGroup != null && assemblyGroup.eIsProxy()) {
			InternalEObject oldAssemblyGroup = (InternalEObject)assemblyGroup;
			assemblyGroup = (AssemblyGroup)eResolveProxy(oldAssemblyGroup);
			if (assemblyGroup != oldAssemblyGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__ASSEMBLY_GROUP, oldAssemblyGroup, assemblyGroup));
			}
		}
		return assemblyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyGroup basicGetAssemblyGroup() {
		return assemblyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyGroup(AssemblyGroup newAssemblyGroup) {
		AssemblyGroup oldAssemblyGroup = assemblyGroup;
		assemblyGroup = newAssemblyGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__ASSEMBLY_GROUP, oldAssemblyGroup, assemblyGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__ASSEMBLY_GROUP:
				if (resolve) return getAssemblyGroup();
				return basicGetAssemblyGroup();
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__ASSEMBLY_GROUP:
				setAssemblyGroup((AssemblyGroup)newValue);
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__ASSEMBLY_GROUP:
				setAssemblyGroup((AssemblyGroup)null);
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__ASSEMBLY_GROUP:
				return assemblyGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyGroupEntryImpl
