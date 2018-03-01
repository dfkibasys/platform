/**
 */
package de.dfki.iui.basys.model.runtime.service.impl;

import de.dfki.iui.basys.model.runtime.service.EntityOperationEnum;
import de.dfki.iui.basys.model.runtime.service.ManagedEntity;
import de.dfki.iui.basys.model.runtime.service.ServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ETypedElementImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Managed Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.service.impl.ManagedEntityImpl#getSupportedOperations <em>Supported Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagedEntityImpl extends ETypedElementImpl implements ManagedEntity {
	/**
	 * The cached value of the '{@link #getSupportedOperations() <em>Supported Operations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityOperationEnum> supportedOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.MANAGED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityOperationEnum> getSupportedOperations() {
		if (supportedOperations == null) {
			supportedOperations = new EDataTypeUniqueEList<EntityOperationEnum>(EntityOperationEnum.class, this, ServicePackage.MANAGED_ENTITY__SUPPORTED_OPERATIONS);
		}
		return supportedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.MANAGED_ENTITY__SUPPORTED_OPERATIONS:
				return getSupportedOperations();
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
			case ServicePackage.MANAGED_ENTITY__SUPPORTED_OPERATIONS:
				getSupportedOperations().clear();
				getSupportedOperations().addAll((Collection<? extends EntityOperationEnum>)newValue);
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
			case ServicePackage.MANAGED_ENTITY__SUPPORTED_OPERATIONS:
				getSupportedOperations().clear();
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
			case ServicePackage.MANAGED_ENTITY__SUPPORTED_OPERATIONS:
				return supportedOperations != null && !supportedOperations.isEmpty();
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
		result.append(" (supportedOperations: ");
		result.append(supportedOperations);
		result.append(')');
		return result.toString();
	}

} //ManagedEntityImpl
