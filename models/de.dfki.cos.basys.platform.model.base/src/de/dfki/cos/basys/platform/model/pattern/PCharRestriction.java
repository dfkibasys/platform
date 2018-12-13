/**
 */
package de.dfki.cos.basys.platform.model.pattern;

import de.dfki.cos.basys.platform.model.base.datatypes.BChar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PChar Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#isIgnoreCase <em>Ignore Case</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPCharRestriction()
 * @model superTypes="de.dfki.cos.basys.platform.model.pattern.PRestriction&lt;de.dfki.cos.basys.platform.model.pattern.PCharRestrictionEnum, de.dfki.cos.basys.platform.model.base.BChar&gt;"
 * @generated
 */
public interface PCharRestriction extends PRestriction<PCharRestrictionEnum, BChar> {
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
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPCharRestriction_IgnoreCase()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIgnoreCase();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#isIgnoreCase <em>Ignore Case</em>}' attribute.
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
	 * @see #setValue(BChar)
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPCharRestriction_Value()
	 * @model dataType="de.dfki.cos.basys.platform.model.base.BChar"
	 * @generated
	 */
	BChar getValue();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BChar value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.pattern.PCharRestrictionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestrictionEnum
	 * @see #setFunction(PCharRestrictionEnum)
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPCharRestriction_Function()
	 * @model required="true"
	 * @generated
	 */
	PCharRestrictionEnum getFunction();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PCharRestriction#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.pattern.PCharRestrictionEnum
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PCharRestrictionEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Object newValue = value;\r\nif (value instanceof Character || value instanceof de.dfki.cos.basys.platform.model.base.datatypes.BChar) {\r\n\tnewValue = value instanceof Character ? value : ((de.dfki.cos.basys.platform.model.base.datatypes.BChar) value).getValue();\r\n\tCharacter p = getValue().getValue();\r\n\tCharacter v = (Character) newValue;\r\n\tif (this.ignoreCase) {\r\n\t\tv = Character.toLowerCase(v);\r\n\t\tp = Character.toLowerCase(p);\r\n\t}\r\n\tswitch (getFunction()) {\r\n\tcase EQUALS:\r\n\t\treturn v.equals(p);\r\n\tcase NOT_EQUALS:\r\n\t\treturn !v.equals(p);\r\n\tdefault:\r\n\t\treturn false;\r\n\t}\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isSatisfiedBy(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if ( defVal != null ) {\r\n\t\t\treturn isSatisfiedBy( defVal ) ? defVal : null;\r\n\t\t}\r\n\t\t// create a value based on this restriction\r\n\t\tchar v = getValue().getValue();\r\n\t\tswitch ( getFunction() ) {\r\n\t\t\tcase EQUALS:\r\n\t\t\t\treturn v;\r\n\t\t\tcase NOT_EQUALS:\r\n\t\t\t\treturn \"_\" + v;\r\n\t\t\tdefault:\r\n\t\t\t\treturn null;\r\n\t\t}'"
	 * @generated
	 */
	Object getDefaultValue(Object defVal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='PCharRestriction co = this;\r\n\r\nif ( bgrest instanceof PCharRestriction ) {\r\n\tPCharRestriction bg = (PCharRestriction) bgrest;\r\n\tswitch ( co.getFunction() ) {\r\n\t\tcase EQUALS:\r\n\t\t\tswitch ( bg.getFunction() ) {\r\n\t\t\t\tcase EQUALS:\r\n\t\t\t\t\tif ( co.getValue() == null ) {\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( bg.getValue() == null || co.getValue().equals( bg.getValue()) ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase NOT_EQUALS:\r\n\t\t\t\t\tif ( bg.getValue() == null ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( co.getValue() == null ) {\r\n\t\t\t\t\t\tco.setFunction( bg.getFunction() );\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\tco.setIgnoreCase( bg.isIgnoreCase() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif (!co.getValue().equals( bg.getValue() )) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tdefault:\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\tcase NOT_EQUALS:\r\n\t\t\tswitch ( bg.getFunction() ) {\r\n\t\t\t\tcase EQUALS:\r\n\t\t\t\t\tif ( bg.getValue() == null ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( co.getValue() == null || !co.getValue().equals( bg.getValue() ) ) {\r\n\t\t\t\t\t\tco.setFunction( bg.getFunction() );\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\tco.setIgnoreCase( bg.isIgnoreCase() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase NOT_EQUALS:\r\n\t\t\t\t\tif ( co.getValue() == null ) {\r\n\t\t\t\t\t\tco.setValue( bg.getValue() );\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( bg.getValue() == null || co.getValue().equals( bg.getValue()) ) {\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tdefault:\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\tdefault:\r\n\t\t\tbreak;\r\n\t}\r\n}\r\nreturn null;'"
	 * @generated
	 */
	PRestriction<?, ?> unify(PRestriction<?, ?> bgrest);

} // PCharRestriction
