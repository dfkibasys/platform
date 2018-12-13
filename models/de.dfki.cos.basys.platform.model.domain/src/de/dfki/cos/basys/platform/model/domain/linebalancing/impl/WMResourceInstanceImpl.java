/**
 */
package de.dfki.cos.basys.platform.model.domain.linebalancing.impl;

import de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WMResourceInstance;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyElement;
import de.dfki.cos.basys.platform.model.util.BasysEObjectImpl;

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
 * An implementation of the model object '<em><b>WM Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.impl.WMResourceInstanceImpl#getSerialId <em>Serial Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.impl.WMResourceInstanceImpl#getFrom_position <em>From position</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.impl.WMResourceInstanceImpl#getTo_position <em>To position</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.impl.WMResourceInstanceImpl#getEta <em>Eta</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.impl.WMResourceInstanceImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WMResourceInstanceImpl extends BasysEObjectImpl implements WMResourceInstance {
	/**
	 * The default value of the '{@link #getSerialId() <em>Serial Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialId() <em>Serial Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialId()
	 * @generated
	 * @ordered
	 */
	protected String serialId = SERIAL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom_position() <em>From position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_position()
	 * @generated
	 * @ordered
	 */
	protected TopologyElement from_position;

	/**
	 * The cached value of the '{@link #getTo_position() <em>To position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_position()
	 * @generated
	 * @ordered
	 */
	protected TopologyElement to_position;

	/**
	 * The default value of the '{@link #getEta() <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta()
	 * @generated
	 * @ordered
	 */
	protected static final long ETA_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEta() <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta()
	 * @generated
	 * @ordered
	 */
	protected long eta = ETA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityApplication> capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WMResourceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinebalancingPackage.Literals.WM_RESOURCE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSerialId() {
		return serialId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialId(String newSerialId) {
		String oldSerialId = serialId;
		serialId = newSerialId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.WM_RESOURCE_INSTANCE__SERIAL_ID, oldSerialId, serialId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyElement getFrom_position() {
		if (from_position != null && from_position.eIsProxy()) {
			InternalEObject oldFrom_position = (InternalEObject)from_position;
			from_position = (TopologyElement)eResolveProxy(oldFrom_position);
			if (from_position != oldFrom_position) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinebalancingPackage.WM_RESOURCE_INSTANCE__FROM_POSITION, oldFrom_position, from_position));
			}
		}
		return from_position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyElement basicGetFrom_position() {
		return from_position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom_position(TopologyElement newFrom_position) {
		TopologyElement oldFrom_position = from_position;
		from_position = newFrom_position;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.WM_RESOURCE_INSTANCE__FROM_POSITION, oldFrom_position, from_position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyElement getTo_position() {
		if (to_position != null && to_position.eIsProxy()) {
			InternalEObject oldTo_position = (InternalEObject)to_position;
			to_position = (TopologyElement)eResolveProxy(oldTo_position);
			if (to_position != oldTo_position) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinebalancingPackage.WM_RESOURCE_INSTANCE__TO_POSITION, oldTo_position, to_position));
			}
		}
		return to_position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyElement basicGetTo_position() {
		return to_position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo_position(TopologyElement newTo_position) {
		TopologyElement oldTo_position = to_position;
		to_position = newTo_position;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.WM_RESOURCE_INSTANCE__TO_POSITION, oldTo_position, to_position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEta() {
		return eta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEta(long newEta) {
		long oldEta = eta;
		eta = newEta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.WM_RESOURCE_INSTANCE__ETA, oldEta, eta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityApplication> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<CapabilityApplication>(CapabilityApplication.class, this, LinebalancingPackage.WM_RESOURCE_INSTANCE__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__SERIAL_ID:
				return getSerialId();
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__FROM_POSITION:
				if (resolve) return getFrom_position();
				return basicGetFrom_position();
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__TO_POSITION:
				if (resolve) return getTo_position();
				return basicGetTo_position();
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__ETA:
				return getEta();
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__CAPABILITIES:
				return getCapabilities();
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
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__SERIAL_ID:
				setSerialId((String)newValue);
				return;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__FROM_POSITION:
				setFrom_position((TopologyElement)newValue);
				return;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__TO_POSITION:
				setTo_position((TopologyElement)newValue);
				return;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__ETA:
				setEta((Long)newValue);
				return;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends CapabilityApplication>)newValue);
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
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__SERIAL_ID:
				setSerialId(SERIAL_ID_EDEFAULT);
				return;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__FROM_POSITION:
				setFrom_position((TopologyElement)null);
				return;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__TO_POSITION:
				setTo_position((TopologyElement)null);
				return;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__ETA:
				setEta(ETA_EDEFAULT);
				return;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__CAPABILITIES:
				getCapabilities().clear();
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
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__SERIAL_ID:
				return SERIAL_ID_EDEFAULT == null ? serialId != null : !SERIAL_ID_EDEFAULT.equals(serialId);
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__FROM_POSITION:
				return from_position != null;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__TO_POSITION:
				return to_position != null;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__ETA:
				return eta != ETA_EDEFAULT;
			case LinebalancingPackage.WM_RESOURCE_INSTANCE__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
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
		result.append(" (serialId: ");
		result.append(serialId);
		result.append(", eta: ");
		result.append(eta);
		result.append(')');
		return result.toString();
	}

} //WMResourceInstanceImpl
