/**
 */
package de.dfki.cos.basys.platform.model.pattern;

import de.dfki.cos.basys.platform.model.base.datatypes.BBoolean;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PBoolean Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPBooleanRestriction()
 * @model superTypes="de.dfki.cos.basys.platform.model.pattern.PRestriction&lt;de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum, de.dfki.cos.basys.platform.model.base.BBoolean&gt;"
 * @generated
 */
public interface PBooleanRestriction extends PRestriction<PBooleanRestrictionEnum, BBoolean> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BBoolean)
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPBooleanRestriction_Value()
	 * @model dataType="de.dfki.cos.basys.platform.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getValue();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum
	 * @see #setFunction(PBooleanRestrictionEnum)
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPBooleanRestriction_Function()
	 * @model required="true"
	 * @generated
	 */
	PBooleanRestrictionEnum getFunction();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PBooleanRestriction#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.pattern.PBooleanRestrictionEnum
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PBooleanRestrictionEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Object value=value_;\r\nif (value instanceof Boolean || value instanceof de.dfki.cos.basys.platform.model.base.datatypes.BBoolean) {\t\r\nvalue = value instanceof Boolean ? value : ((de.dfki.cos.basys.platform.model.base.datatypes.BBoolean) value).getValue();\t\r\nswitch (getFunction()) {\r\n\tcase EQUALS:\r\n\t\treturn getValue().equals(value);\r\n\tcase NOT_EQUALS:\r\n\t\treturn !getValue().equals(value);\r\n\tdefault:\r\n\t\treturn false;\r\n\t}\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isSatisfiedBy(Object value_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if ( defVal != null ) {\r\n\treturn isSatisfiedBy( defVal ) ? defVal : null;\r\n}\r\n// create a value based on this restriction\r\nBoolean v = getValue().getValue();\r\nswitch ( getFunction() ) {\r\n\tcase EQUALS:\r\n\t\treturn v;\r\n\tcase NOT_EQUALS:\r\n\t\treturn !v;\r\n\tdefault:\r\n\t\treturn null;\r\n}'"
	 * @generated
	 */
	Object getDefaultValue(Object defVal);

} // PBooleanRestriction
