/**
 */
package de.dfki.iui.basys.model.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.dfki.iui.basys.model.base.datatypes.BChar;
import de.dfki.iui.basys.model.pattern.PCharRestriction;
import de.dfki.iui.basys.model.pattern.PCharRestrictionEnum;
import de.dfki.iui.basys.model.pattern.PRestriction;
import de.dfki.iui.basys.model.pattern.PatternPackage;
import de.dfki.iui.basys.model.util.BasysEObjectImpl;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PChar Restriction</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PCharRestrictionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PCharRestrictionImpl#isIgnoreCase <em>Ignore Case</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PCharRestrictionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PCharRestrictionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCharRestrictionImpl extends BasysEObjectImpl implements PCharRestriction {
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
	 * The default value of the '{@link #isIgnoreCase() <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIgnoreCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_CASE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIgnoreCase() <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIgnoreCase()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreCase = IGNORE_CASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BChar VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BChar value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final PCharRestrictionEnum FUNCTION_EDEFAULT = PCharRestrictionEnum.EQUALS;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected PCharRestrictionEnum function = FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PCharRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PCHAR_RESTRICTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PCHAR_RESTRICTION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIgnoreCase() {
		return ignoreCase;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreCase(boolean newIgnoreCase) {
		boolean oldIgnoreCase = ignoreCase;
		ignoreCase = newIgnoreCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PCHAR_RESTRICTION__IGNORE_CASE, oldIgnoreCase, ignoreCase));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BChar getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BChar newValue) {
		BChar oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PCHAR_RESTRICTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCharRestrictionEnum getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(PCharRestrictionEnum newFunction) {
		PCharRestrictionEnum oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PCHAR_RESTRICTION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSatisfiedBy(final Object value) {
		Object newValue = value;
		if (value instanceof Character || value instanceof de.dfki.iui.basys.model.base.datatypes.BChar) {
			newValue = value instanceof Character ? value : ((de.dfki.iui.basys.model.base.datatypes.BChar) value).getValue();
			Character p = getValue().getValue();
			Character v = (Character) newValue;
			if (this.ignoreCase) {
				v = Character.toLowerCase(v);
				p = Character.toLowerCase(p);
			}
			switch (getFunction()) {
			case EQUALS:
				return v.equals(p);
			case NOT_EQUALS:
				return !v.equals(p);
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
				char v = getValue().getValue();
				switch ( getFunction() ) {
					case EQUALS:
						return v;
					case NOT_EQUALS:
						return "_" + v;
					default:
						return null;
				}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRestriction<?, ?> unify(final PRestriction<?, ?> bgrest) {
		PCharRestriction co = this;
		
		if ( bgrest instanceof PCharRestriction ) {
			PCharRestriction bg = (PCharRestriction) bgrest;
			switch ( co.getFunction() ) {
				case EQUALS:
					switch ( bg.getFunction() ) {
						case EQUALS:
							if ( co.getValue() == null ) {
								co.setValue( bg.getValue() );
								return co;
							}
							if ( bg.getValue() == null || co.getValue().equals( bg.getValue()) ) {
								return co;
							}
							break;
						case NOT_EQUALS:
							if ( bg.getValue() == null ) {
								return co;
							}
							if ( co.getValue() == null ) {
								co.setFunction( bg.getFunction() );
								co.setValue( bg.getValue() );
								co.setIgnoreCase( bg.isIgnoreCase() );
								return co;
							}
							if (!co.getValue().equals( bg.getValue() )) {
								return co;
							}
							break;
						default:
							break;
					}
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
								co.setIgnoreCase( bg.isIgnoreCase() );
								return co;
							}
							break;
						case NOT_EQUALS:
							if ( co.getValue() == null ) {
								co.setValue( bg.getValue() );
								return co;
							}
							if ( bg.getValue() == null || co.getValue().equals( bg.getValue()) ) {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.PCHAR_RESTRICTION__EXPRESSION:
				return getExpression();
			case PatternPackage.PCHAR_RESTRICTION__IGNORE_CASE:
				return isIgnoreCase();
			case PatternPackage.PCHAR_RESTRICTION__VALUE:
				return getValue();
			case PatternPackage.PCHAR_RESTRICTION__FUNCTION:
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
			case PatternPackage.PCHAR_RESTRICTION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case PatternPackage.PCHAR_RESTRICTION__IGNORE_CASE:
				setIgnoreCase((Boolean)newValue);
				return;
			case PatternPackage.PCHAR_RESTRICTION__VALUE:
				setValue((BChar)newValue);
				return;
			case PatternPackage.PCHAR_RESTRICTION__FUNCTION:
				setFunction((PCharRestrictionEnum)newValue);
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
			case PatternPackage.PCHAR_RESTRICTION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case PatternPackage.PCHAR_RESTRICTION__IGNORE_CASE:
				setIgnoreCase(IGNORE_CASE_EDEFAULT);
				return;
			case PatternPackage.PCHAR_RESTRICTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PatternPackage.PCHAR_RESTRICTION__FUNCTION:
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
			case PatternPackage.PCHAR_RESTRICTION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case PatternPackage.PCHAR_RESTRICTION__IGNORE_CASE:
				return ignoreCase != IGNORE_CASE_EDEFAULT;
			case PatternPackage.PCHAR_RESTRICTION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case PatternPackage.PCHAR_RESTRICTION__FUNCTION:
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
			case PatternPackage.PCHAR_RESTRICTION___IS_SATISFIED_BY__OBJECT:
				return isSatisfiedBy(arguments.get(0));
			case PatternPackage.PCHAR_RESTRICTION___GET_DEFAULT_VALUE__OBJECT:
				return getDefaultValue(arguments.get(0));
			case PatternPackage.PCHAR_RESTRICTION___UNIFY__PRESTRICTION:
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
		result.append(", ignoreCase: ");
		result.append(ignoreCase);
		result.append(", value: ");
		result.append(value);
		result.append(", function: ");
		result.append(function);
		result.append(')');
		return result.toString();
	}

} // PCharRestrictionImpl
