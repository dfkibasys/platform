/**
 */
package de.dfki.iui.basys.model.pattern;

import de.dfki.iui.basys.model.base.datatypes.BShort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PShort Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.PShortRestriction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPShortRestriction()
 * @model superTypes="de.dfki.iui.basys.model.pattern.PNumberRestriction&lt;de.dfki.iui.basys.model.base.BShort&gt;"
 * @generated
 */
public interface PShortRestriction extends PNumberRestriction<BShort> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BShort)
	 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPShortRestriction_Value()
	 * @model dataType="de.dfki.iui.basys.model.base.BShort"
	 * @generated
	 */
	BShort getValue();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.pattern.PShortRestriction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BShort value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Object newValue;\r\nif (value instanceof Short  || value instanceof de.dfki.iui.basys.model.base.datatypes.BShort) {\r\n\tnewValue = value instanceof Short  ? value : ((de.dfki.iui.basys.model.base.datatypes.BShort) value).getValue();\t\r\nint result = ((Short)newValue).compareTo(getValue().getValue());\r\n\treturn _compareTo(result, getFunction());\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isSatisfiedBy(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if ( defVal != null ) {\r\n\treturn isSatisfiedBy( defVal ) ? defVal : null;\r\n}\r\n// create a value based on this restriction\r\nShort v = getValue().getValue();\r\nswitch ( getFunction() ) {\r\n\tcase EQUALS:\r\n\tcase GREATER_EQUALS:\r\n\tcase LESS_EQUALS:\r\n\t\treturn v;\r\n\tcase GREATER_THAN:\r\n\tcase NOT_EQUALS:\r\n\t\treturn ((Float) Math.nextAfter( v, Short.MAX_VALUE )).shortValue();\r\n\tcase LESS_THAN:\r\n\t\treturn ((Float) Math.nextAfter( v, Short.MIN_VALUE )).shortValue();\r\n\tdefault:\r\n\t\treturn null;\r\n}'"
	 * @generated
	 */
	Object getDefaultValue(Object defVal);

} // PShortRestriction
