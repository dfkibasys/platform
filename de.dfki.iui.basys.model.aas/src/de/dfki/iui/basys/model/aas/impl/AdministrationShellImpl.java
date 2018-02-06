/**
 */
package de.dfki.iui.basys.model.aas.impl;

import de.dfki.iui.basys.model.aas.AasPackage;
import de.dfki.iui.basys.model.aas.AdministrationShell;
import de.dfki.iui.basys.model.aas.InformationMapping;

import de.dfki.iui.basys.model.aas.OperationalServiceMapping;
import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.base.impl.EntityImpl;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administration Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.aas.impl.AdministrationShellImpl#getAssetId <em>Asset Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.aas.impl.AdministrationShellImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.aas.impl.AdministrationShellImpl#getOperationalServiceMappings <em>Operational Service Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministrationShellImpl extends EntityImpl implements AdministrationShell {
	/**
	 * The default value of the '{@link #getAssetId() <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetId() <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetId()
	 * @generated
	 * @ordered
	 */
	protected String assetId = ASSET_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationMapping> mappings;

	/**
	 * The cached value of the '{@link #getOperationalServiceMappings() <em>Operational Service Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalServiceMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalServiceMapping> operationalServiceMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrationShellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.ADMINISTRATION_SHELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationMapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<InformationMapping>(InformationMapping.class, this, AasPackage.ADMINISTRATION_SHELL__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalServiceMapping> getOperationalServiceMappings() {
		if (operationalServiceMappings == null) {
			operationalServiceMappings = new EObjectContainmentEList<OperationalServiceMapping>(OperationalServiceMapping.class, this, AasPackage.ADMINISTRATION_SHELL__OPERATIONAL_SERVICE_MAPPINGS);
		}
		return operationalServiceMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssetId() {
		return assetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetId(String newAssetId) {
		String oldAssetId = assetId;
		assetId = newAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.ADMINISTRATION_SHELL__ASSET_ID, oldAssetId, assetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Entity> T get() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AasPackage.ADMINISTRATION_SHELL__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
			case AasPackage.ADMINISTRATION_SHELL__OPERATIONAL_SERVICE_MAPPINGS:
				return ((InternalEList<?>)getOperationalServiceMappings()).basicRemove(otherEnd, msgs);
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
			case AasPackage.ADMINISTRATION_SHELL__ASSET_ID:
				return getAssetId();
			case AasPackage.ADMINISTRATION_SHELL__MAPPINGS:
				return getMappings();
			case AasPackage.ADMINISTRATION_SHELL__OPERATIONAL_SERVICE_MAPPINGS:
				return getOperationalServiceMappings();
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
			case AasPackage.ADMINISTRATION_SHELL__ASSET_ID:
				setAssetId((String)newValue);
				return;
			case AasPackage.ADMINISTRATION_SHELL__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends InformationMapping>)newValue);
				return;
			case AasPackage.ADMINISTRATION_SHELL__OPERATIONAL_SERVICE_MAPPINGS:
				getOperationalServiceMappings().clear();
				getOperationalServiceMappings().addAll((Collection<? extends OperationalServiceMapping>)newValue);
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
			case AasPackage.ADMINISTRATION_SHELL__ASSET_ID:
				setAssetId(ASSET_ID_EDEFAULT);
				return;
			case AasPackage.ADMINISTRATION_SHELL__MAPPINGS:
				getMappings().clear();
				return;
			case AasPackage.ADMINISTRATION_SHELL__OPERATIONAL_SERVICE_MAPPINGS:
				getOperationalServiceMappings().clear();
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
			case AasPackage.ADMINISTRATION_SHELL__ASSET_ID:
				return ASSET_ID_EDEFAULT == null ? assetId != null : !ASSET_ID_EDEFAULT.equals(assetId);
			case AasPackage.ADMINISTRATION_SHELL__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case AasPackage.ADMINISTRATION_SHELL__OPERATIONAL_SERVICE_MAPPINGS:
				return operationalServiceMappings != null && !operationalServiceMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AasPackage.ADMINISTRATION_SHELL___GET:
				return get();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (assetId: ");
		result.append(assetId);
		result.append(')');
		return result.toString();
	}

} //AdministrationShellImpl
