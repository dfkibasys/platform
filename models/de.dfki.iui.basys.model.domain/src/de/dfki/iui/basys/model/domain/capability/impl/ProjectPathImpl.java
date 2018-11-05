/**
 */
package de.dfki.iui.basys.model.domain.capability.impl;

import de.dfki.iui.basys.model.data.Path;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.ProjectPath;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.ProjectPathImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.ProjectPathImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.ProjectPathImpl#getArrowCount <em>Arrow Count</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.ProjectPathImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.ProjectPathImpl#getEta <em>Eta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectPathImpl extends WorkerAssistenceCapabilityImpl implements ProjectPath {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected Path path;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final long DELAY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected long delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrowCount() <em>Arrow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ARROW_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArrowCount() <em>Arrow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowCount()
	 * @generated
	 * @ordered
	 */
	protected int arrowCount = ARROW_COUNT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.PROJECT_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(Path newPath, NotificationChain msgs) {
		Path oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_PATH__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(Path newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.PROJECT_PATH__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.PROJECT_PATH__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_PATH__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(long newDelay) {
		long oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_PATH__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArrowCount() {
		return arrowCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrowCount(int newArrowCount) {
		int oldArrowCount = arrowCount;
		arrowCount = newArrowCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_PATH__ARROW_COUNT, oldArrowCount, arrowCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_PATH__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PROJECT_PATH__ETA, oldEta, eta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.PROJECT_PATH__PATH:
				return basicSetPath(null, msgs);
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
			case CapabilityPackage.PROJECT_PATH__PATH:
				return getPath();
			case CapabilityPackage.PROJECT_PATH__DELAY:
				return getDelay();
			case CapabilityPackage.PROJECT_PATH__ARROW_COUNT:
				return getArrowCount();
			case CapabilityPackage.PROJECT_PATH__COLOR:
				return getColor();
			case CapabilityPackage.PROJECT_PATH__ETA:
				return getEta();
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
			case CapabilityPackage.PROJECT_PATH__PATH:
				setPath((Path)newValue);
				return;
			case CapabilityPackage.PROJECT_PATH__DELAY:
				setDelay((Long)newValue);
				return;
			case CapabilityPackage.PROJECT_PATH__ARROW_COUNT:
				setArrowCount((Integer)newValue);
				return;
			case CapabilityPackage.PROJECT_PATH__COLOR:
				setColor((Integer)newValue);
				return;
			case CapabilityPackage.PROJECT_PATH__ETA:
				setEta((Long)newValue);
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
			case CapabilityPackage.PROJECT_PATH__PATH:
				setPath((Path)null);
				return;
			case CapabilityPackage.PROJECT_PATH__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case CapabilityPackage.PROJECT_PATH__ARROW_COUNT:
				setArrowCount(ARROW_COUNT_EDEFAULT);
				return;
			case CapabilityPackage.PROJECT_PATH__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case CapabilityPackage.PROJECT_PATH__ETA:
				setEta(ETA_EDEFAULT);
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
			case CapabilityPackage.PROJECT_PATH__PATH:
				return path != null;
			case CapabilityPackage.PROJECT_PATH__DELAY:
				return delay != DELAY_EDEFAULT;
			case CapabilityPackage.PROJECT_PATH__ARROW_COUNT:
				return arrowCount != ARROW_COUNT_EDEFAULT;
			case CapabilityPackage.PROJECT_PATH__COLOR:
				return color != COLOR_EDEFAULT;
			case CapabilityPackage.PROJECT_PATH__ETA:
				return eta != ETA_EDEFAULT;
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
		result.append(" (delay: ");
		result.append(delay);
		result.append(", arrowCount: ");
		result.append(arrowCount);
		result.append(", color: ");
		result.append(color);
		result.append(", eta: ");
		result.append(eta);
		result.append(')');
		return result.toString();
	}

} //ProjectPathImpl
