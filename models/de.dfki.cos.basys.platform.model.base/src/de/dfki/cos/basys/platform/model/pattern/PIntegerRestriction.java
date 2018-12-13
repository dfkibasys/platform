/**
 */
package de.dfki.cos.basys.platform.model.pattern;

import de.dfki.cos.basys.platform.model.base.datatypes.BInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PInteger Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPIntegerRestriction()
 * @model superTypes="de.dfki.cos.basys.platform.model.pattern.PNumberRestriction&lt;de.dfki.cos.basys.platform.model.base.BInteger&gt;"
 * @generated
 */
public interface PIntegerRestriction extends PNumberRestriction<BInteger> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BInteger)
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPIntegerRestriction_Value()
	 * @model dataType="de.dfki.cos.basys.platform.model.base.BInteger"
	 * @generated
	 */
	BInteger getValue();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PIntegerRestriction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BInteger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Object newValue;\r\nif (value instanceof Integer  || value instanceof de.dfki.cos.basys.platform.model.base.datatypes.BInteger) {\r\nnewValue = value instanceof Integer  ? value : ((de.dfki.cos.basys.platform.model.base.datatypes.BInteger) value).getValue();\t\t\r\nint result = ((Integer) newValue).compareTo(getValue().getValue());\r\n\treturn _compareTo(result, getFunction());\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isSatisfiedBy(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if ( defVal != null ) {\r\n\treturn isSatisfiedBy( defVal ) ? defVal : null;\r\n}\r\n// create a value based on this restriction\r\nInteger v = getValue().getValue();\r\nswitch ( getFunction() ) {\r\n\tcase EQUALS:\r\n\tcase GREATER_EQUALS:\r\n\tcase LESS_EQUALS:\r\n\t\treturn v;\r\n\tcase GREATER_THAN:\r\n\tcase NOT_EQUALS:\r\n\t\treturn v + 1;\r\n\tcase LESS_THAN:\r\n\t\treturn v - 1;\r\n\tdefault:\r\n\t\tbreak;\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Object getDefaultValue(Object defVal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='PIntegerRestriction co = this;\r\n\r\nif ( bgrest instanceof PIntegerRestriction ) {\r\n\tPIntegerRestriction bg = (PIntegerRestriction) bgrest;\r\n\tswitch ( co.getFunction() ) {\r\n\t\tcase EQUALS:\r\n\t\t\tswitch ( bg.getFunction() ) {\r\n\t\t\t\tcase EQUALS:\r\n\t\t\t\t\tif ( co.getValue() == null ) {\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( bg.getValue() == null || co.getValue().equals( bg.getValue() )) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase GREATER_EQUALS:\t// TODO: implement this case\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase GREATER_THAN:\t\t// TODO: implement this case\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase LESS_EQUALS:\t\t// TODO: implement this case\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase LESS_THAN:\t\t\t// TODO: implement this case\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase NOT_EQUALS:\r\n\t\t\t\t\tif ( bg.getValue() == null ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( co.getValue() == null ) {\r\n\t\t\t\t\t\tco.setFunction( bg.getFunction() );\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( !co.getValue().equals( bg.getValue() ) ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tdefault:\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\tcase GREATER_EQUALS:\t\t\t// TODO: implement this case\r\n\t\t\tbreak;\r\n\t\tcase GREATER_THAN:\t\t\t\t// TODO: implement this case\r\n\t\t\tbreak;\r\n\t\tcase LESS_EQUALS:\t\t\t\t// TODO: implement this case\r\n\t\t\tbreak;\r\n\t\tcase LESS_THAN:\t\t\t\t\t// TODO: implement this case\r\n\t\t\tbreak;\r\n\t\tcase NOT_EQUALS:\r\n\t\t\tswitch ( bg.getFunction() ) {\r\n\t\t\t\tcase EQUALS:\r\n\t\t\t\t\tif ( bg.getValue() == null ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( co.getValue() == null || !co.getValue().equals( bg.getValue() ) ) {\r\n\t\t\t\t\t\tco.setFunction( bg.getFunction() );\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase GREATER_EQUALS:\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase GREATER_THAN:\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase LESS_EQUALS:\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase LESS_THAN:\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase NOT_EQUALS:\r\n\t\t\t\t\tif ( co.getValue() == null ) {\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( bg.getValue() == null || co.getValue().equals( bg.getValue() )) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tdefault:\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\tdefault:\r\n\t\t\tbreak;\r\n\t}\r\n}\r\nreturn null;'"
	 * @generated
	 */
	PRestriction<?, ?> unify(PRestriction<?, ?> bgrest);

} // PIntegerRestriction
