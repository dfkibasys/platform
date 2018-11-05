/**
 */
package de.dfki.iui.basys.model.domain.linebalancing.impl;

import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;
import de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance;

import de.dfki.iui.basys.model.domain.productdefinition.ManufacturedComponent;
import de.dfki.iui.basys.model.domain.topology.TopologyElement;

import de.dfki.iui.basys.model.util.BasysEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WM Product Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMProductInstanceImpl#getSerialId <em>Serial Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMProductInstanceImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMProductInstanceImpl#isIn_transit <em>In transit</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMProductInstanceImpl#getEta <em>Eta</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMProductInstanceImpl#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WMProductInstanceImpl extends BasysEObjectImpl implements WMProductInstance {
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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected TopologyElement position;

	/**
	 * The default value of the '{@link #isIn_transit() <em>In transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIn_transit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_TRANSIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIn_transit() <em>In transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIn_transit()
	 * @generated
	 * @ordered
	 */
	protected boolean in_transit = IN_TRANSIT_EDEFAULT;

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
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected ManufacturedComponent variant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WMProductInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinebalancingPackage.Literals.WM_PRODUCT_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.WM_PRODUCT_INSTANCE__SERIAL_ID, oldSerialId, serialId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyElement getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (TopologyElement)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinebalancingPackage.WM_PRODUCT_INSTANCE__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyElement basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(TopologyElement newPosition) {
		TopologyElement oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.WM_PRODUCT_INSTANCE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIn_transit() {
		return in_transit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn_transit(boolean newIn_transit) {
		boolean oldIn_transit = in_transit;
		in_transit = newIn_transit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.WM_PRODUCT_INSTANCE__IN_TRANSIT, oldIn_transit, in_transit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.WM_PRODUCT_INSTANCE__ETA, oldEta, eta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturedComponent getVariant() {
		if (variant != null && variant.eIsProxy()) {
			InternalEObject oldVariant = (InternalEObject)variant;
			variant = (ManufacturedComponent)eResolveProxy(oldVariant);
			if (variant != oldVariant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinebalancingPackage.WM_PRODUCT_INSTANCE__VARIANT, oldVariant, variant));
			}
		}
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturedComponent basicGetVariant() {
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(ManufacturedComponent newVariant) {
		ManufacturedComponent oldVariant = variant;
		variant = newVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.WM_PRODUCT_INSTANCE__VARIANT, oldVariant, variant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__SERIAL_ID:
				return getSerialId();
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__IN_TRANSIT:
				return isIn_transit();
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__ETA:
				return getEta();
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__VARIANT:
				if (resolve) return getVariant();
				return basicGetVariant();
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
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__SERIAL_ID:
				setSerialId((String)newValue);
				return;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__POSITION:
				setPosition((TopologyElement)newValue);
				return;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__IN_TRANSIT:
				setIn_transit((Boolean)newValue);
				return;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__ETA:
				setEta((Long)newValue);
				return;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__VARIANT:
				setVariant((ManufacturedComponent)newValue);
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
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__SERIAL_ID:
				setSerialId(SERIAL_ID_EDEFAULT);
				return;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__POSITION:
				setPosition((TopologyElement)null);
				return;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__IN_TRANSIT:
				setIn_transit(IN_TRANSIT_EDEFAULT);
				return;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__ETA:
				setEta(ETA_EDEFAULT);
				return;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__VARIANT:
				setVariant((ManufacturedComponent)null);
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
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__SERIAL_ID:
				return SERIAL_ID_EDEFAULT == null ? serialId != null : !SERIAL_ID_EDEFAULT.equals(serialId);
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__POSITION:
				return position != null;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__IN_TRANSIT:
				return in_transit != IN_TRANSIT_EDEFAULT;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__ETA:
				return eta != ETA_EDEFAULT;
			case LinebalancingPackage.WM_PRODUCT_INSTANCE__VARIANT:
				return variant != null;
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
		result.append(", in_transit: ");
		result.append(in_transit);
		result.append(", eta: ");
		result.append(eta);
		result.append(')');
		return result.toString();
	}

} //WMProductInstanceImpl
