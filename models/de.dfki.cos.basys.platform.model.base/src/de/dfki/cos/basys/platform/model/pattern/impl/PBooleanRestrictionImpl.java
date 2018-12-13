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

import de.dfki.cos.basys.platform.model.base.datatypes.BBoolean;
import de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction;
import de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum;
import de.dfki.cos.basys.platform.model.pattern.PRestriction;
import de.dfki.cos.basys.platform.model.pattern.PatternPackage;
import de.dfki.cos.basys.platform.model.util.BasysEObjectImpl;

import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PBoolean Restriction</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.impl.PBooleanRestrictionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.impl.PBooleanRestrictionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.impl.PBooleanRestrictionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PBooleanRestrictionImpl extends BasysEObjectImpl implements PBooleanRestriction {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BBoolean value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final PBooleanRestrictionEnum FUNCTION_EDEFAULT = PBooleanRestrictionEnum.EQUALS;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected PBooleanRestrictionEnum function = FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PBooleanRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PBOOLEAN_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PBOOLEAN_RESTRICTION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BBoolean getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(BBoolean newValue) {
		BBoolean oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PBOOLEAN_RESTRICTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PBooleanRestrictionEnum getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(PBooleanRestrictionEnum newFunction) {
		PBooleanRestrictionEnum oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PBOOLEAN_RESTRICTION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSatisfiedBy(final Object value_) {
		Object value=value_;
		if (value instanceof Boolean || value instanceof de.dfki.cos.basys.platform.model.base.datatypes.BBoolean) {	
		value = value instanceof Boolean ? value : ((de.dfki.cos.basys.platform.model.base.datatypes.BBoolean) value).getValue();	
		switch (getFunction()) {
			case EQUALS:
				return getValue().equals(value);
			case NOT_EQUALS:
				return !getValue().equals(value);
			default:
				return false;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDefaultValue(final Object defVal) {
		if ( defVal != null ) {
			return isSatisfiedBy( defVal ) ? defVal : null;
		}
		// create a value based on this restriction
		Boolean v = getValue().getValue();
		switch ( getFunction() ) {
			case EQUALS:
				return v;
			case NOT_EQUALS:
				return !v;
			default:
				return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRestriction<?, ?> unify(PRestriction<?, ?> bg) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.PBOOLEAN_RESTRICTION__EXPRESSION:
				return getExpression();
			case PatternPackage.PBOOLEAN_RESTRICTION__VALUE:
				return getValue();
			case PatternPackage.PBOOLEAN_RESTRICTION__FUNCTION:
				return getFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternPackage.PBOOLEAN_RESTRICTION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case PatternPackage.PBOOLEAN_RESTRICTION__VALUE:
				setValue((BBoolean)newValue);
				return;
			case PatternPackage.PBOOLEAN_RESTRICTION__FUNCTION:
				setFunction((PBooleanRestrictionEnum)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternPackage.PBOOLEAN_RESTRICTION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case PatternPackage.PBOOLEAN_RESTRICTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PatternPackage.PBOOLEAN_RESTRICTION__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternPackage.PBOOLEAN_RESTRICTION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case PatternPackage.PBOOLEAN_RESTRICTION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case PatternPackage.PBOOLEAN_RESTRICTION__FUNCTION:
				return function != FUNCTION_EDEFAULT;
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
			case PatternPackage.PBOOLEAN_RESTRICTION___IS_SATISFIED_BY__OBJECT:
				return isSatisfiedBy(arguments.get(0));
			case PatternPackage.PBOOLEAN_RESTRICTION___GET_DEFAULT_VALUE__OBJECT:
				return getDefaultValue(arguments.get(0));
			case PatternPackage.PBOOLEAN_RESTRICTION___UNIFY__PRESTRICTION:
				return unify((PRestriction<?, ?>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (expression: ");
		result.append(expression);
		result.append(", value: ");
		result.append(value);
		result.append(", function: ");
		result.append(function);
		result.append(')');
		return result.toString();
	}

} // PBooleanRestrictionImpl
