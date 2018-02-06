/**
 */
package de.dfki.iui.basys.model.pattern.impl;

import de.dfki.iui.basys.model.base.datatypes.BInteger;

import de.dfki.iui.basys.model.pattern.PIntegerRestriction;
import de.dfki.iui.basys.model.pattern.PRestriction;
import de.dfki.iui.basys.model.pattern.PatternPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PInteger Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PIntegerRestrictionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PIntegerRestrictionImpl extends PNumberRestrictionImpl<BInteger> implements PIntegerRestriction {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BInteger value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIntegerRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PINTEGER_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BInteger newValue) {
		BInteger oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PINTEGER_RESTRICTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatisfiedBy(final Object value) {
		Object newValue;
		if (value instanceof Integer  || value instanceof de.dfki.iui.basys.model.base.datatypes.BInteger) {
		newValue = value instanceof Integer  ? value : ((de.dfki.iui.basys.model.base.datatypes.BInteger) value).getValue();		
		int result = ((Integer) newValue).compareTo(getValue().getValue());
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
		Integer v = getValue().getValue();
		switch ( getFunction() ) {
			case EQUALS:
			case GREATER_EQUALS:
			case LESS_EQUALS:
				return v;
			case GREATER_THAN:
			case NOT_EQUALS:
				return v + 1;
			case LESS_THAN:
				return v - 1;
			default:
				break;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRestriction<?, ?> unify(final PRestriction<?, ?> bgrest) {
		PIntegerRestriction co = this;
		
		if ( bgrest instanceof PIntegerRestriction ) {
			PIntegerRestriction bg = (PIntegerRestriction) bgrest;
			switch ( co.getFunction() ) {
				case EQUALS:
					switch ( bg.getFunction() ) {
						case EQUALS:
							if ( co.getValue() == null ) {
								co.setValue( bg.getValue() );
								return co;
							}
							if ( bg.getValue() == null || co.getValue().equals( bg.getValue() )) {
								return co;
							}
							break;
						case GREATER_EQUALS:	// TODO: implement this case
							break;
						case GREATER_THAN:		// TODO: implement this case
							break;
						case LESS_EQUALS:		// TODO: implement this case
							break;
						case LESS_THAN:			// TODO: implement this case
							break;
						case NOT_EQUALS:
							if ( bg.getValue() == null ) {
								return co;
							}
							if ( co.getValue() == null ) {
								co.setFunction( bg.getFunction() );
								co.setValue( bg.getValue() );
								return co;
							}
							if ( !co.getValue().equals( bg.getValue() ) ) {
								return co;
							}
							break;
						default:
							break;
					}
					break;
				case GREATER_EQUALS:			// TODO: implement this case
					break;
				case GREATER_THAN:				// TODO: implement this case
					break;
				case LESS_EQUALS:				// TODO: implement this case
					break;
				case LESS_THAN:					// TODO: implement this case
					break;
				case NOT_EQUALS:
					switch ( bg.getFunction() ) {
						case EQUALS:
							if ( bg.getValue() == null ) {
								return co;
							}
							if ( co.getValue() == null || !co.getValue().equals( bg.getValue() ) ) {
								co.setFunction( bg.getFunction() );
								co.setValue( bg.getValue() );
								return co;
							}
							break;
						case GREATER_EQUALS:
							break;
						case GREATER_THAN:
							break;
						case LESS_EQUALS:
							break;
						case LESS_THAN:
							break;
						case NOT_EQUALS:
							if ( co.getValue() == null ) {
								co.setValue( bg.getValue() );
								return co;
							}
							if ( bg.getValue() == null || co.getValue().equals( bg.getValue() )) {
								return co;
							}
							break;
						default:
							break;
					}
					break;
				default:
					break;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.PINTEGER_RESTRICTION__VALUE:
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
			case PatternPackage.PINTEGER_RESTRICTION__VALUE:
				setValue((BInteger)newValue);
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
			case PatternPackage.PINTEGER_RESTRICTION__VALUE:
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
			case PatternPackage.PINTEGER_RESTRICTION__VALUE:
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
			case PatternPackage.PINTEGER_RESTRICTION___IS_SATISFIED_BY__OBJECT:
				return isSatisfiedBy(arguments.get(0));
			case PatternPackage.PINTEGER_RESTRICTION___GET_DEFAULT_VALUE__OBJECT:
				return getDefaultValue(arguments.get(0));
			case PatternPackage.PINTEGER_RESTRICTION___UNIFY__PRESTRICTION:
				return unify((PRestriction<?, ?>)arguments.get(0));
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

} //PIntegerRestrictionImpl
