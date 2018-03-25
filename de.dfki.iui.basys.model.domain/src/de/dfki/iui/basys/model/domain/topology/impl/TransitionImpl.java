/**
 */
package de.dfki.iui.basys.model.domain.topology.impl;

import de.dfki.iui.basys.model.domain.topology.TopologyPackage;
import de.dfki.iui.basys.model.domain.topology.Transition;

import de.dfki.iui.basys.model.util.BasysEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.impl.TransitionImpl#getComponentId_src <em>Component Id src</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.impl.TransitionImpl#getComponentId_target <em>Component Id target</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.impl.TransitionImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends BasysEObjectImpl implements Transition {
	/**
	 * The default value of the '{@link #getComponentId_src() <em>Component Id src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId_src()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId_src() <em>Component Id src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId_src()
	 * @generated
	 * @ordered
	 */
	protected String componentId_src = COMPONENT_ID_SRC_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentId_target() <em>Component Id target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId_target()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId_target() <em>Component Id target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId_target()
	 * @generated
	 * @ordered
	 */
	protected String componentId_target = COMPONENT_ID_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected float distance = DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentId_src() {
		return componentId_src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId_src(String newComponentId_src) {
		String oldComponentId_src = componentId_src;
		componentId_src = newComponentId_src;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TRANSITION__COMPONENT_ID_SRC, oldComponentId_src, componentId_src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentId_target() {
		return componentId_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId_target(String newComponentId_target) {
		String oldComponentId_target = componentId_target;
		componentId_target = newComponentId_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TRANSITION__COMPONENT_ID_TARGET, oldComponentId_target, componentId_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(float newDistance) {
		float oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TRANSITION__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyPackage.TRANSITION__COMPONENT_ID_SRC:
				return getComponentId_src();
			case TopologyPackage.TRANSITION__COMPONENT_ID_TARGET:
				return getComponentId_target();
			case TopologyPackage.TRANSITION__DISTANCE:
				return getDistance();
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
			case TopologyPackage.TRANSITION__COMPONENT_ID_SRC:
				setComponentId_src((String)newValue);
				return;
			case TopologyPackage.TRANSITION__COMPONENT_ID_TARGET:
				setComponentId_target((String)newValue);
				return;
			case TopologyPackage.TRANSITION__DISTANCE:
				setDistance((Float)newValue);
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
			case TopologyPackage.TRANSITION__COMPONENT_ID_SRC:
				setComponentId_src(COMPONENT_ID_SRC_EDEFAULT);
				return;
			case TopologyPackage.TRANSITION__COMPONENT_ID_TARGET:
				setComponentId_target(COMPONENT_ID_TARGET_EDEFAULT);
				return;
			case TopologyPackage.TRANSITION__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
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
			case TopologyPackage.TRANSITION__COMPONENT_ID_SRC:
				return COMPONENT_ID_SRC_EDEFAULT == null ? componentId_src != null : !COMPONENT_ID_SRC_EDEFAULT.equals(componentId_src);
			case TopologyPackage.TRANSITION__COMPONENT_ID_TARGET:
				return COMPONENT_ID_TARGET_EDEFAULT == null ? componentId_target != null : !COMPONENT_ID_TARGET_EDEFAULT.equals(componentId_target);
			case TopologyPackage.TRANSITION__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
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
		result.append(" (componentId_src: ");
		result.append(componentId_src);
		result.append(", componentId_target: ");
		result.append(componentId_target);
		result.append(", distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
