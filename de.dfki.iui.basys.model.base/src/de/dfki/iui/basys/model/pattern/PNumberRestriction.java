/**
 */
package de.dfki.iui.basys.model.pattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PNumber Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.PNumberRestriction#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPNumberRestriction()
 * @model abstract="true"
 * @generated
 */
public interface PNumberRestriction<V> extends PRestriction<PNumberRestrictionEnum, V> {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.pattern.PNumberRestrictionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see de.dfki.iui.basys.model.pattern.PNumberRestrictionEnum
	 * @see #setFunction(PNumberRestrictionEnum)
	 * @see de.dfki.iui.basys.model.pattern.PatternPackage#getPNumberRestriction_Function()
	 * @model required="true"
	 * @generated
	 */
	PNumberRestrictionEnum getFunction();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.pattern.PNumberRestriction#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see de.dfki.iui.basys.model.pattern.PNumberRestrictionEnum
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PNumberRestrictionEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='switch (function) {\r\ncase EQUALS:\r\n\tif (compareToResult == 0)\r\n\t\treturn true;\r\n\tbreak;\r\ncase GREATER_EQUALS:\r\n\tif (compareToResult &gt;= 0)\r\n\t\treturn true;\r\n\tbreak;\r\ncase GREATER_THAN:\r\n\tif (compareToResult &gt; 0)\r\n\t\treturn true;\r\n\tbreak;\r\ncase LESS_EQUALS:\r\n\tif (compareToResult &lt;= 0)\r\n\t\treturn true;\r\n\tbreak;\r\ncase LESS_THAN:\r\n\tif (compareToResult &lt; 0)\r\n\t\treturn true;\r\n\tbreak;\r\ncase NOT_EQUALS:\r\n\tif (compareToResult != 0)\r\n\t\treturn true;\r\n\tbreak;\r\ndefault:\r\n\tbreak;\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean _compareTo(int compareToResult, PNumberRestrictionEnum function);

} // PNumberRestriction
