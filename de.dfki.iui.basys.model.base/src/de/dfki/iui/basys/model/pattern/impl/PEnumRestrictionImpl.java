/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.basys.model.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.dfki.iui.basys.model.pattern.PEnumRestriction;
import de.dfki.iui.basys.model.pattern.PEnumRestrictionEnum;
import de.dfki.iui.basys.model.pattern.PRestriction;
import de.dfki.iui.basys.model.pattern.PatternPackage;
import de.dfki.iui.basys.model.util.BasysEObjectImpl;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PEnum Restriction</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PEnumRestrictionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PEnumRestrictionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PEnumRestrictionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PEnumRestrictionImpl#getEnumDataType <em>Enum Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PEnumRestrictionImpl extends BasysEObjectImpl implements PEnumRestriction {
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
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final PEnumRestrictionEnum FUNCTION_EDEFAULT = PEnumRestrictionEnum.EQUALS;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected PEnumRestrictionEnum function = FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EEnumLiteral value;

	/**
	 * The cached value of the '{@link #getEnumDataType() <em>Enum Data Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEnumDataType()
	 * @generated
	 * @ordered
	 */
	protected EEnum enumDataType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PEnumRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PENUM_RESTRICTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PENUM_RESTRICTION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnumLiteral getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (EEnumLiteral)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.PENUM_RESTRICTION__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(EEnumLiteral newValue) {
		EEnumLiteral oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PENUM_RESTRICTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumDataType() {
		if (enumDataType != null && enumDataType.eIsProxy()) {
			InternalEObject oldEnumDataType = (InternalEObject)enumDataType;
			enumDataType = (EEnum)eResolveProxy(oldEnumDataType);
			if (enumDataType != oldEnumDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.PENUM_RESTRICTION__ENUM_DATA_TYPE, oldEnumDataType, enumDataType));
			}
		}
		return enumDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum basicGetEnumDataType() {
		return enumDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumDataType(EEnum newEnumDataType) {
		EEnum oldEnumDataType = enumDataType;
		enumDataType = newEnumDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PENUM_RESTRICTION__ENUM_DATA_TYPE, oldEnumDataType, enumDataType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PEnumRestrictionEnum getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(PEnumRestrictionEnum newFunction) {
		PEnumRestrictionEnum oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PENUM_RESTRICTION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSatisfiedBy(final Object value) {
			if (value != null) {
					Enumerator enumInst = getValue();
					boolean isEq = getFunction() == PEnumRestrictionEnum.EQUALS;
					return isEq == value.toString().equals(enumInst.getLiteral());
				}
				return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDefaultValue(final Object defVal) {
			if (defVal != null)
					return isSatisfiedBy(defVal) ? defVal : null;
				// create a value based on this restriction
				Enumerator enumInst = getValue();
				switch (getFunction()) {
				case EQUALS:
					return getEnumDataType().getInstanceClass().getEnumConstants()[enumInst.getValue()];
				case NOT_EQUALS:
					String instName = enumInst.getName();
					for (EEnumLiteral lit : getEnumDataType().getELiterals()) {
						if (!lit.getName().equals(instName))
							return getEnumDataType().getInstanceClass().getEnumConstants()[lit.getValue()];
					}
				default:
					return null;
				}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.PENUM_RESTRICTION__EXPRESSION:
				return getExpression();
			case PatternPackage.PENUM_RESTRICTION__FUNCTION:
				return getFunction();
			case PatternPackage.PENUM_RESTRICTION__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case PatternPackage.PENUM_RESTRICTION__ENUM_DATA_TYPE:
				if (resolve) return getEnumDataType();
				return basicGetEnumDataType();
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
			case PatternPackage.PENUM_RESTRICTION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case PatternPackage.PENUM_RESTRICTION__FUNCTION:
				setFunction((PEnumRestrictionEnum)newValue);
				return;
			case PatternPackage.PENUM_RESTRICTION__VALUE:
				setValue((EEnumLiteral)newValue);
				return;
			case PatternPackage.PENUM_RESTRICTION__ENUM_DATA_TYPE:
				setEnumDataType((EEnum)newValue);
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
			case PatternPackage.PENUM_RESTRICTION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case PatternPackage.PENUM_RESTRICTION__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case PatternPackage.PENUM_RESTRICTION__VALUE:
				setValue((EEnumLiteral)null);
				return;
			case PatternPackage.PENUM_RESTRICTION__ENUM_DATA_TYPE:
				setEnumDataType((EEnum)null);
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
			case PatternPackage.PENUM_RESTRICTION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case PatternPackage.PENUM_RESTRICTION__FUNCTION:
				return function != FUNCTION_EDEFAULT;
			case PatternPackage.PENUM_RESTRICTION__VALUE:
				return value != null;
			case PatternPackage.PENUM_RESTRICTION__ENUM_DATA_TYPE:
				return enumDataType != null;
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
			case PatternPackage.PENUM_RESTRICTION___IS_SATISFIED_BY__OBJECT:
				return isSatisfiedBy(arguments.get(0));
			case PatternPackage.PENUM_RESTRICTION___GET_DEFAULT_VALUE__OBJECT:
				return getDefaultValue(arguments.get(0));
			case PatternPackage.PENUM_RESTRICTION___UNIFY__PRESTRICTION:
				return unify((PRestriction<?, ?>)arguments.get(0));
			case PatternPackage.PENUM_RESTRICTION___SET_VALUE__OBJECT:
				setValue(arguments.get(0));
				return null;
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
		result.append(", function: ");
		result.append(function);
		result.append(')');
		return result.toString();
	}

	@Override
	public PRestriction<?, ?> unify(PRestriction<?, ?> bgrest) {
		PEnumRestriction co = this;

		if (bgrest instanceof PEnumRestriction) {
			PEnumRestriction bg = (PEnumRestriction) bgrest;
			switch (co.getFunction()) {
			case EQUALS:
				switch (bg.getFunction()) {
				case EQUALS:
					if (co.getValue() == null) {
						co.setValue(bg.getValue());
						return co;
					}
					if (bg.getValue() == null || co.getValue().equals(bg.getValue()) && co.getEnumDataType().equals(bg.getEnumDataType()))
						return co;
					break;
				case NOT_EQUALS:
					if (bg.getValue() == null)
						return co;
					if (co.getValue() == null) {
						co.setFunction(bg.getFunction());
						co.setEnumDataType(bg.getEnumDataType());
						co.setValue(bg.getValue());
						return co;
					}
					if (!co.getValue().equals(bg.getValue()))
						return co;
					break;
				default:
					break;
				}
				break;
			case NOT_EQUALS:
				switch (bg.getFunction()) {
				case EQUALS:
					if (bg.getValue() == null)
						return co;
					if (co.getValue() == null || !co.getValue().equals(bg.getValue())) {
						co.setFunction(bg.getFunction());
						co.setEnumDataType(bg.getEnumDataType());
						co.setValue(bg.getValue());
						return co;
					}
					break;
				case NOT_EQUALS:
					if (co.getValue() == null) {
						co.setValue(bg.getValue());
						return co;
					}
					if (bg.getValue() == null || co.getValue().equals(bg.getValue()) && co.getEnumDataType().equals(bg.getEnumDataType()))
						return co;
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

} // PEnumRestrictionImpl
