/**
 */
package de.dfki.iui.basys.model.domain.productdefinition.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;
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
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.impl.AssemblyGroupEntryImpl#getCount <em>Count</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.impl.AssemblyGroupEntryImpl#getAssemblyGroup <em>Assembly Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyGroupEntryImpl extends EntityImpl implements AssemblyGroupEntry {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__COUNT, oldCount, count));
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__COUNT:
				return getCount();
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__COUNT:
				setCount((Integer)newValue);
				return;
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
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
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__COUNT:
				return count != COUNT_EDEFAULT;
			case ProductdefinitionPackage.ASSEMBLY_GROUP_ENTRY__ASSEMBLY_GROUP:
				return assemblyGroup != null;
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

} //AssemblyGroupEntryImpl
