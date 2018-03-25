/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance.impl;

import de.dfki.iui.basys.model.domain.product.BOMEntry;

import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;

import de.dfki.iui.basys.model.util.BasysEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityApplicationImpl#getBomEntries <em>Bom Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityApplicationImpl extends BasysEObjectImpl implements CapabilityApplication {
	/**
	 * The cached value of the '{@link #getBomEntries() <em>Bom Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<BOMEntry> bomEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceinstancePackage.Literals.CAPABILITY_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BOMEntry> getBomEntries() {
		if (bomEntries == null) {
			bomEntries = new EObjectResolvingEList<BOMEntry>(BOMEntry.class, this, ResourceinstancePackage.CAPABILITY_APPLICATION__BOM_ENTRIES);
		}
		return bomEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceinstancePackage.CAPABILITY_APPLICATION__BOM_ENTRIES:
				return getBomEntries();
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
			case ResourceinstancePackage.CAPABILITY_APPLICATION__BOM_ENTRIES:
				getBomEntries().clear();
				getBomEntries().addAll((Collection<? extends BOMEntry>)newValue);
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
			case ResourceinstancePackage.CAPABILITY_APPLICATION__BOM_ENTRIES:
				getBomEntries().clear();
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
			case ResourceinstancePackage.CAPABILITY_APPLICATION__BOM_ENTRIES:
				return bomEntries != null && !bomEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityApplicationImpl
