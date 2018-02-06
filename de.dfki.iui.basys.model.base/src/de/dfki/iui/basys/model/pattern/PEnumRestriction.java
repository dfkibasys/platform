/**
 */
package de.dfki.iui.basys.model.pattern;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PEnum Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.PEnumRestriction#getFunction <em>Function</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.PEnumRestriction#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.PEnumRestriction#getEnumDataType <em>Enum Data Type</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPEnumRestriction()
 * @model superTypes="de.dfki.iui.basys.model.pattern.PRestriction&lt;de.dfki.iui.basys.model.pattern.PEnumRestrictionEnum, org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface PEnumRestriction extends PRestriction<PEnumRestrictionEnum, Object> {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.pattern.PEnumRestrictionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see de.dfki.iui.basys.model.pattern.PEnumRestrictionEnum
	 * @see #setFunction(PEnumRestrictionEnum)
	 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPEnumRestriction_Function()
	 * @model required="true"
	 * @generated
	 */
	PEnumRestrictionEnum getFunction();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.pattern.PEnumRestriction#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see de.dfki.iui.basys.model.pattern.PEnumRestrictionEnum
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PEnumRestrictionEnum value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EEnumLiteral)
	 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPEnumRestriction_Value()
	 * @model
	 * @generated
	 */
	EEnumLiteral getValue();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.pattern.PEnumRestriction#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EEnumLiteral value);

	/**
	 * Returns the value of the '<em><b>Enum Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Data Type</em>' reference.
	 * @see #setEnumDataType(EEnum)
	 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPEnumRestriction_EnumDataType()
	 * @model
	 * @generated
	 */
	EEnum getEnumDataType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.pattern.PEnumRestriction#getEnumDataType <em>Enum Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Data Type</em>' reference.
	 * @see #getEnumDataType()
	 * @generated
	 */
	void setEnumDataType(EEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tif (value != null) {\r\n\t\t\tEnumerator enumInst = getValue();\r\n\t\t\tboolean isEq = getFunction() == PEnumRestrictionEnum.EQUALS;\r\n\t\t\treturn isEq == value.toString().equals(enumInst.getLiteral());\r\n\t\t}\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isSatisfiedBy(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tif (defVal != null)\r\n\t\t\treturn isSatisfiedBy(defVal) ? defVal : null;\r\n\t\t// create a value based on this restriction\r\n\t\tEnumerator enumInst = getValue();\r\n\t\tswitch (getFunction()) {\r\n\t\tcase EQUALS:\r\n\t\t\treturn getEnumDataType().getInstanceClass().getEnumConstants()[enumInst.getValue()];\r\n\t\tcase NOT_EQUALS:\r\n\t\t\tString instName = enumInst.getName();\r\n\t\t\tfor (EEnumLiteral lit : getEnumDataType().getELiterals()) {\r\n\t\t\t\tif (!lit.getName().equals(instName))\r\n\t\t\t\t\treturn getEnumDataType().getInstanceClass().getEnumConstants()[lit.getValue()];\r\n\t\t\t}\r\n\t\tdefault:\r\n\t\t\treturn null;\r\n\t\t}'"
	 * @generated
	 */
	Object getDefaultValue(Object defVal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='PEnumRestriction co = this;\r\n\r\n\t\tif (bgrest instanceof PEnumRestriction) {\r\n\t\t\tPEnumRestriction bg = (PEnumRestriction) bgrest;\r\n\t\t\tswitch (co.getFunction()) {\r\n\t\t\tcase EQUALS:\r\n\t\t\t\tswitch (bg.getFunction()) {\r\n\t\t\t\tcase EQUALS:\r\n\t\t\t\t\tif (co.getValue() == null) {\r\n\t\t\t\t\t\tco.setValue(bg.getValue());\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif (bg.getValue() == null || co.getValue().equals(bg.getValue()) &amp;&amp; co.getEnumDataType().equals(bg.getEnumDataType()))\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase NOT_EQUALS:\r\n\t\t\t\t\tif (bg.getValue() == null)\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\tif (co.getValue() == null) {\r\n\t\t\t\t\t\tco.setFunction(bg.getFunction());\r\n\t\t\t\t\t\tco.setEnumDataType(bg.getEnumDataType());\r\n\t\t\t\t\t\tco.setValue(bg.getValue());\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif (!co.getValue().equals(bg.getValue()))\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tdefault:\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t\tbreak;\r\n\t\t\tcase NOT_EQUALS:\r\n\t\t\t\tswitch (bg.getFunction()) {\r\n\t\t\t\tcase EQUALS:\r\n\t\t\t\t\tif (bg.getValue() == null)\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\tif (co.getValue() == null || !co.getValue().equals(bg.getValue())) {\r\n\t\t\t\t\t\tco.setFunction(bg.getFunction());\r\n\t\t\t\t\t\tco.setEnumDataType(bg.getEnumDataType());\r\n\t\t\t\t\t\tco.setValue(bg.getValue());\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tcase NOT_EQUALS:\r\n\t\t\t\t\tif (co.getValue() == null) {\r\n\t\t\t\t\t\tco.setValue(bg.getValue());\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif (bg.getValue() == null || co.getValue().equals(bg.getValue()) &amp;&amp; co.getEnumDataType().equals(bg.getEnumDataType()))\r\n\t\t\t\t\t\treturn co;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\tdefault:\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t\tbreak;\r\n\t\t\tdefault:\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn null;'"
	 * @generated
	 */
	PRestriction<?, ?> unify(PRestriction<?, ?> bgrest);

} // PEnumRestriction
