/**
 */
package de.dfki.iui.basys.model.pattern;

import de.dfki.iui.basys.model.base.datatypes.BFloat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PFloat Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.PFloatRestriction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPFloatRestriction()
 * @model superTypes="de.dfki.iui.basys.model.pattern.PNumberRestriction&lt;de.dfki.iui.basys.model.base.BFloat&gt;"
 * @generated
 */
public interface PFloatRestriction extends PNumberRestriction<BFloat> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BFloat)
	 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPFloatRestriction_Value()
	 * @model dataType="de.dfki.iui.basys.model.base.BFloat"
	 * @generated
	 */
	BFloat getValue();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.pattern.PFloatRestriction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BFloat value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Object newValue=value;\r\nif (value instanceof Float  || value instanceof de.dfki.iui.basys.model.base.datatypes.BFloat) {\r\nnewValue = value instanceof Float  ? value : ((de.dfki.iui.basys.model.base.datatypes.BFloat) value).getValue();\t\t\t\t\r\nint result = ((Float) newValue).compareTo(getValue().getValue());\r\n\treturn _compareTo(result, getFunction());\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isSatisfiedBy(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if ( defVal != null ) {\r\n\treturn isSatisfiedBy( defVal ) ? defVal : null;\r\n}\r\n// create a value based on this restriction\r\nFloat v = getValue().getValue();\r\nswitch ( getFunction() ) {\r\n\tcase EQUALS:\r\n\tcase GREATER_EQUALS:\r\n\tcase LESS_EQUALS:\r\n\t\treturn v;\r\n\tcase GREATER_THAN:\r\n\tcase NOT_EQUALS:\r\n\t\treturn Math.nextAfter( v, Float.MAX_VALUE);\r\n\tcase LESS_THAN:\r\n\t\treturn Math.nextAfter( v, Float.MIN_VALUE);\r\n\tdefault:\r\n\t\treturn null;\r\n}'"
	 * @generated
	 */
	Object getDefaultValue(Object defVal);

} // PFloatRestriction
