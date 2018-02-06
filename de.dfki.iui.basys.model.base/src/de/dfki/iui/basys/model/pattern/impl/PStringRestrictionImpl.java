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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import de.dfki.iui.basys.model.base.datatypes.BString;
import de.dfki.iui.basys.model.pattern.PRestriction;
import de.dfki.iui.basys.model.pattern.PStringRestriction;
import de.dfki.iui.basys.model.pattern.PStringRestrictionEnum;
import de.dfki.iui.basys.model.pattern.PatternPackage;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PString Restriction</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PStringRestrictionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PStringRestrictionImpl#isIgnoreCase <em>Ignore Case</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PStringRestrictionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PStringRestrictionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PStringRestrictionImpl extends MinimalEObjectImpl.Container implements PStringRestriction {
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
	protected static final BString VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BString value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final PStringRestrictionEnum FUNCTION_EDEFAULT = PStringRestrictionEnum.EQUALS;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected PStringRestrictionEnum function = FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PStringRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PSTRING_RESTRICTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PSTRING_RESTRICTION__EXPRESSION, oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PSTRING_RESTRICTION__IGNORE_CASE, oldIgnoreCase, ignoreCase));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BString newValue) {
		BString oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PSTRING_RESTRICTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PStringRestrictionEnum getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(PStringRestrictionEnum newFunction) {
		PStringRestrictionEnum oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PSTRING_RESTRICTION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSatisfiedBy(final Object value) {
		if (value instanceof String || value instanceof de.dfki.iui.basys.model.base.datatypes.BString) {
			String p = getValue().getValue();
			String v = (String)value.toString();
			if (this.ignoreCase) {
				v = v.toLowerCase();
				p = p.toLowerCase();
			}
			switch (getFunction()) {
			case CONTAINS:
				return v.contains(p);				
			case ENDS_WITH:
				return v.endsWith(p);
			case EQUALS:
				return v.equals(p);
			case MATCHES:
				return v.matches(p);
			case NOT_EQUALS:
				return !v.equals(p);
			case STARTS_WITH:
				return v.startsWith(p);
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
		String v = getValue().getValue();
		switch ( getFunction() ) {
			case EQUALS:
			case STARTS_WITH:
			case ENDS_WITH:
			case CONTAINS:
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
		PStringRestriction co = this;
		
		if ( bgrest instanceof PStringRestriction ) {
			PStringRestriction bg = (PStringRestriction) bgrest;
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
			case PatternPackage.PSTRING_RESTRICTION__EXPRESSION:
				return getExpression();
			case PatternPackage.PSTRING_RESTRICTION__IGNORE_CASE:
				return isIgnoreCase();
			case PatternPackage.PSTRING_RESTRICTION__VALUE:
				return getValue();
			case PatternPackage.PSTRING_RESTRICTION__FUNCTION:
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
			case PatternPackage.PSTRING_RESTRICTION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case PatternPackage.PSTRING_RESTRICTION__IGNORE_CASE:
				setIgnoreCase((Boolean)newValue);
				return;
			case PatternPackage.PSTRING_RESTRICTION__VALUE:
				setValue((BString)newValue);
				return;
			case PatternPackage.PSTRING_RESTRICTION__FUNCTION:
				setFunction((PStringRestrictionEnum)newValue);
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
			case PatternPackage.PSTRING_RESTRICTION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case PatternPackage.PSTRING_RESTRICTION__IGNORE_CASE:
				setIgnoreCase(IGNORE_CASE_EDEFAULT);
				return;
			case PatternPackage.PSTRING_RESTRICTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PatternPackage.PSTRING_RESTRICTION__FUNCTION:
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
			case PatternPackage.PSTRING_RESTRICTION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case PatternPackage.PSTRING_RESTRICTION__IGNORE_CASE:
				return ignoreCase != IGNORE_CASE_EDEFAULT;
			case PatternPackage.PSTRING_RESTRICTION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case PatternPackage.PSTRING_RESTRICTION__FUNCTION:
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
			case PatternPackage.PSTRING_RESTRICTION___IS_SATISFIED_BY__OBJECT:
				return isSatisfiedBy(arguments.get(0));
			case PatternPackage.PSTRING_RESTRICTION___GET_DEFAULT_VALUE__OBJECT:
				return getDefaultValue(arguments.get(0));
			case PatternPackage.PSTRING_RESTRICTION___UNIFY__PRESTRICTION:
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

} // PStringRestrictionImpl
