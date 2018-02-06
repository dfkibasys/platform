/**
 */
package de.dfki.iui.basys.model.pattern;

import de.dfki.iui.basys.model.base.datatypes.BString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PString Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.PStringRestriction#isIgnoreCase <em>Ignore Case</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.PStringRestriction#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.PStringRestriction#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPStringRestriction()
 * @model superTypes="de.dfki.iui.basys.model.pattern.PRestriction&lt;de.dfki.iui.basys.model.pattern.PStringRestrictionEnum, de.dfki.iui.basys.model.base.BString&gt;"
 * @generated
 */
public interface PStringRestriction extends PRestriction<PStringRestrictionEnum, BString> {
	/**
	 * Returns the value of the '<em><b>Ignore Case</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Case</em>' attribute.
	 * @see #setIgnoreCase(boolean)
	 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPStringRestriction_IgnoreCase()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIgnoreCase();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.pattern.PStringRestriction#isIgnoreCase <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Case</em>' attribute.
	 * @see #isIgnoreCase()
	 * @generated
	 */
	void setIgnoreCase(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BString)
	 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPStringRestriction_Value()
	 * @model dataType="de.dfki.iui.basys.model.base.BString"
	 * @generated
	 */
	BString getValue();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.pattern.PStringRestriction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BString value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.pattern.PStringRestrictionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see de.dfki.iui.basys.model.pattern.PStringRestrictionEnum
	 * @see #setFunction(PStringRestrictionEnum)
	 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPStringRestriction_Function()
	 * @model required="true"
	 * @generated
	 */
	PStringRestrictionEnum getFunction();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.pattern.PStringRestriction#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see de.dfki.iui.basys.model.pattern.PStringRestrictionEnum
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PStringRestrictionEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (value instanceof String || value instanceof de.dfki.iui.basys.model.base.datatypes.BString) {\r\n\tString p = getValue().getValue();\r\n\tString v = (String)value.toString();\r\n\tif (this.ignoreCase) {\r\n\t\tv = v.toLowerCase();\r\n\t\tp = p.toLowerCase();\r\n\t}\r\n\tswitch (getFunction()) {\r\n\tcase CONTAINS:\r\n\t\treturn v.contains(p);\t\t\t\t\r\n\tcase ENDS_WITH:\r\n\t\treturn v.endsWith(p);\r\n\tcase EQUALS:\r\n\t\treturn v.equals(p);\r\n\tcase MATCHES:\r\n\t\treturn v.matches(p);\r\n\tcase NOT_EQUALS:\r\n\t\treturn !v.equals(p);\r\n\tcase STARTS_WITH:\r\n\t\treturn v.startsWith(p);\r\n\tdefault:\r\n\t\treturn false;\r\n\t}\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isSatisfiedBy(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if ( defVal != null ) {\r\n\treturn isSatisfiedBy( defVal ) ? defVal : null;\r\n}\r\n// create a value based on this restriction\r\nString v = getValue().getValue();\r\nswitch ( getFunction() ) {\r\n\tcase EQUALS:\r\n\tcase STARTS_WITH:\r\n\tcase ENDS_WITH:\r\n\tcase CONTAINS:\r\n\t\treturn v;\r\n\tcase NOT_EQUALS:\r\n\t\treturn \"_\" + v;\r\n\tdefault:\r\n\t\treturn null;\r\n}'"
	 * @generated
	 */
	Object getDefaultValue(Object defVal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='PStringRestriction co = this;\r\n\r\nif ( bgrest instanceof PStringRestriction ) {\r\n\tPStringRestriction bg = (PStringRestriction) bgrest;\r\n\tswitch ( co.getFunction() ) {\r\n\t\tcase EQUALS:\r\n\t\t\tswitch ( bg.getFunction() ) {\r\n\t\t\t\tcase EQUALS:\r\n\t\t\t\t\tif ( co.getValue() == null ) {\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( bg.getValue() == null || co.getValue().equals( bg.getValue()) ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase NOT_EQUALS:\r\n\t\t\t\t\tif ( bg.getValue() == null ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( co.getValue() == null ) {\r\n\t\t\t\t\t\tco.setFunction( bg.getFunction() );\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\tco.setIgnoreCase( bg.isIgnoreCase() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif (!co.getValue().equals( bg.getValue() )) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tdefault:\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\tcase NOT_EQUALS:\r\n\t\t\tswitch ( bg.getFunction() ) {\r\n\t\t\t\tcase EQUALS:\r\n\t\t\t\t\tif ( bg.getValue() == null ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( co.getValue() == null || !co.getValue().equals( bg.getValue() ) ) {\r\n\t\t\t\t\t\tco.setFunction( bg.getFunction() );\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\tco.setIgnoreCase( bg.isIgnoreCase() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase NOT_EQUALS:\r\n\t\t\t\t\tif ( co.getValue() == null ) {\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( bg.getValue() == null || co.getValue().equals( bg.getValue()) ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tdefault:\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\tdefault:\r\n\t\t\tbreak;\r\n\t}\r\n}\r\nreturn null;'"
	 * @generated
	 */
	PRestriction<?, ?> unify(PRestriction<?, ?> bgrest);

} // PStringRestriction
