/**
 */
package de.dfki.cos.basys.platform.model.domain.capability.impl;

import de.dfki.cos.basys.platform.model.data.CartesianCoordinate;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.capability.ProjectETA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project ETA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.ProjectETAImpl#getEta <em>Eta</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.ProjectETAImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.ProjectETAImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.ProjectETAImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.ProjectETAImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectETAImpl extends WorkerAssistenceCapabilityImpl implements ProjectETA {
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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected CartesianCoordinate position;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final int COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected int color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final int ORIENTATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected int orientation = ORIENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectETAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.PROJECT_ETA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_ETA__ETA, oldEta, eta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinate getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(CartesianCoordinate newPosition, NotificationChain msgs) {
		CartesianCoordinate oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_ETA__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(CartesianCoordinate newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.PROJECT_ETA__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.PROJECT_ETA__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_ETA__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_ETA__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(int newColor) {
		int oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_ETA__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(int newOrientation) {
		int oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_ETA__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.PROJECT_ETA__POSITION:
				return basicSetPosition(null, msgs);
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
			case CapabilityPackage.PROJECT_ETA__ETA:
				return getEta();
			case CapabilityPackage.PROJECT_ETA__POSITION:
				return getPosition();
			case CapabilityPackage.PROJECT_ETA__RADIUS:
				return getRadius();
			case CapabilityPackage.PROJECT_ETA__COLOR:
				return getColor();
			case CapabilityPackage.PROJECT_ETA__ORIENTATION:
				return getOrientation();
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
			case CapabilityPackage.PROJECT_ETA__ETA:
				setEta((Long)newValue);
				return;
			case CapabilityPackage.PROJECT_ETA__POSITION:
				setPosition((CartesianCoordinate)newValue);
				return;
			case CapabilityPackage.PROJECT_ETA__RADIUS:
				setRadius((Double)newValue);
				return;
			case CapabilityPackage.PROJECT_ETA__COLOR:
				setColor((Integer)newValue);
				return;
			case CapabilityPackage.PROJECT_ETA__ORIENTATION:
				setOrientation((Integer)newValue);
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
			case CapabilityPackage.PROJECT_ETA__ETA:
				setEta(ETA_EDEFAULT);
				return;
			case CapabilityPackage.PROJECT_ETA__POSITION:
				setPosition((CartesianCoordinate)null);
				return;
			case CapabilityPackage.PROJECT_ETA__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case CapabilityPackage.PROJECT_ETA__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case CapabilityPackage.PROJECT_ETA__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
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
			case CapabilityPackage.PROJECT_ETA__ETA:
				return eta != ETA_EDEFAULT;
			case CapabilityPackage.PROJECT_ETA__POSITION:
				return position != null;
			case CapabilityPackage.PROJECT_ETA__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case CapabilityPackage.PROJECT_ETA__COLOR:
				return color != COLOR_EDEFAULT;
			case CapabilityPackage.PROJECT_ETA__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
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
		result.append(" (eta: ");
		result.append(eta);
		result.append(", radius: ");
		result.append(radius);
		result.append(", color: ");
		result.append(color);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //ProjectETAImpl
