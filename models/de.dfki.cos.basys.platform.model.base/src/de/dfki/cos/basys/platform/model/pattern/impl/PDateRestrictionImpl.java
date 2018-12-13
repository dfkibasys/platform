/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.cos.basys.platform.model.pattern.impl;

import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.cos.basys.platform.model.pattern.PDateRestriction;
import de.dfki.cos.basys.platform.model.pattern.PatternPackage;

import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDate Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.impl.PDateRestrictionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PDateRestrictionImpl extends PNumberRestrictionImpl<Date> implements PDateRestriction {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Date value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PDateRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PDATE_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Date newValue) {
		Date oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PDATE_RESTRICTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatisfiedBy(final Object value) {
		if (value instanceof Date) {
			int result = ((Date) value).compareTo(getValue());
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
		Date v = getValue();
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime( v );
		switch ( getFunction() ) {
			case EQUALS:
			case GREATER_EQUALS:
			case LESS_EQUALS:
				return v;
			case GREATER_THAN:
			case NOT_EQUALS:
				cal.add( GregorianCalendar.SECOND, 1 );
				return cal.getTime();
			case LESS_THAN:
				cal.add( GregorianCalendar.SECOND, -1 );
				return cal.getTime();
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
			case PatternPackage.PDATE_RESTRICTION__VALUE:
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
			case PatternPackage.PDATE_RESTRICTION__VALUE:
				setValue((Date)newValue);
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
			case PatternPackage.PDATE_RESTRICTION__VALUE:
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
			case PatternPackage.PDATE_RESTRICTION__VALUE:
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
			case PatternPackage.PDATE_RESTRICTION___IS_SATISFIED_BY__OBJECT:
				return isSatisfiedBy(arguments.get(0));
			case PatternPackage.PDATE_RESTRICTION___GET_DEFAULT_VALUE__OBJECT:
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

} //PDateRestrictionImpl
