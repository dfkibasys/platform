/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.basys.model.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.dfki.iui.basys.model.pattern.PNumberRestriction;
import de.dfki.iui.basys.model.pattern.PNumberRestrictionEnum;
import de.dfki.iui.basys.model.pattern.PRestriction;
import de.dfki.iui.basys.model.pattern.PatternPackage;
import de.dfki.iui.basys.model.util.BasysEObjectImpl;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PNumber Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PNumberRestrictionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PNumberRestrictionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PNumberRestrictionImpl<V> extends BasysEObjectImpl implements PNumberRestriction<V> {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final PNumberRestrictionEnum FUNCTION_EDEFAULT = PNumberRestrictionEnum.EQUALS;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected PNumberRestrictionEnum function = FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PNumberRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PNUMBER_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PNUMBER_RESTRICTION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PNumberRestrictionEnum getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(PNumberRestrictionEnum newFunction) {
		PNumberRestrictionEnum oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PNUMBER_RESTRICTION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean _compareTo(final int compareToResult, final PNumberRestrictionEnum function) {
		switch (function) {
		case EQUALS:
			if (compareToResult == 0)
				return true;
			break;
		case GREATER_EQUALS:
			if (compareToResult >= 0)
				return true;
			break;
		case GREATER_THAN:
			if (compareToResult > 0)
				return true;
			break;
		case LESS_EQUALS:
			if (compareToResult <= 0)
				return true;
			break;
		case LESS_THAN:
			if (compareToResult < 0)
				return true;
			break;
		case NOT_EQUALS:
			if (compareToResult != 0)
				return true;
			break;
		default:
			break;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatisfiedBy(Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V getValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(V value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRestriction<?, ?> unify(PRestriction<?, ?> bg) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	abstract public Object getDefaultValue(Object defVal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.PNUMBER_RESTRICTION__EXPRESSION:
				return getExpression();
			case PatternPackage.PNUMBER_RESTRICTION__FUNCTION:
				return getFunction();
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
			case PatternPackage.PNUMBER_RESTRICTION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case PatternPackage.PNUMBER_RESTRICTION__FUNCTION:
				setFunction((PNumberRestrictionEnum)newValue);
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
			case PatternPackage.PNUMBER_RESTRICTION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case PatternPackage.PNUMBER_RESTRICTION__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
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
			case PatternPackage.PNUMBER_RESTRICTION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case PatternPackage.PNUMBER_RESTRICTION__FUNCTION:
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
			case PatternPackage.PNUMBER_RESTRICTION___COMPARE_TO__INT_PNUMBERRESTRICTIONENUM:
				return _compareTo((Integer)arguments.get(0), (PNumberRestrictionEnum)arguments.get(1));
			case PatternPackage.PNUMBER_RESTRICTION___IS_SATISFIED_BY__OBJECT:
				return isSatisfiedBy(arguments.get(0));
			case PatternPackage.PNUMBER_RESTRICTION___GET_VALUE:
				return getValue();
			case PatternPackage.PNUMBER_RESTRICTION___SET_VALUE__OBJECT:
				setValue((V)arguments.get(0));
				return null;
			case PatternPackage.PNUMBER_RESTRICTION___UNIFY__PRESTRICTION:
				return unify((PRestriction<?, ?>)arguments.get(0));
			case PatternPackage.PNUMBER_RESTRICTION___GET_DEFAULT_VALUE__OBJECT:
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", function: ");
		result.append(function);
		result.append(')');
		return result.toString();
	}

} //PNumberRestrictionImpl
