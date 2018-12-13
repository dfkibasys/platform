/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.cos.basys.platform.model.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.cos.basys.platform.model.base.datatypes.BFloat;
import de.dfki.cos.basys.platform.model.pattern.PFloatRestriction;
import de.dfki.cos.basys.platform.model.pattern.PatternPackage;

import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PFloat Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.impl.PFloatRestrictionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PFloatRestrictionImpl extends PNumberRestrictionImpl<BFloat> implements PFloatRestriction {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BFloat VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BFloat value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PFloatRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PFLOAT_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFloat getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BFloat newValue) {
		BFloat oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PFLOAT_RESTRICTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatisfiedBy(final Object value) {
		Object newValue=value;
		if (value instanceof Float  || value instanceof de.dfki.cos.basys.platform.model.base.datatypes.BFloat) {
		newValue = value instanceof Float  ? value : ((de.dfki.cos.basys.platform.model.base.datatypes.BFloat) value).getValue();				
		int result = ((Float) newValue).compareTo(getValue().getValue());
			return _compareTo(result, getFunction());
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDefaultValue(final Object defVal) {
		if ( defVal != null ) {
			return isSatisfiedBy( defVal ) ? defVal : null;
		}
		// create a value based on this restriction
		Float v = getValue().getValue();
		switch ( getFunction() ) {
			case EQUALS:
			case GREATER_EQUALS:
			case LESS_EQUALS:
				return v;
			case GREATER_THAN:
			case NOT_EQUALS:
				return Math.nextAfter( v, Float.MAX_VALUE);
			case LESS_THAN:
				return Math.nextAfter( v, Float.MIN_VALUE);
			default:
				return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.PFLOAT_RESTRICTION__VALUE:
				return getValue();
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
			case PatternPackage.PFLOAT_RESTRICTION__VALUE:
				setValue((BFloat)newValue);
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
			case PatternPackage.PFLOAT_RESTRICTION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case PatternPackage.PFLOAT_RESTRICTION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
			case PatternPackage.PFLOAT_RESTRICTION___IS_SATISFIED_BY__OBJECT:
				return isSatisfiedBy(arguments.get(0));
			case PatternPackage.PFLOAT_RESTRICTION___GET_DEFAULT_VALUE__OBJECT:
				return getDefaultValue(arguments.get(0));
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //PFloatRestrictionImpl
