/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Variable Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getVariableType()
 * @model
 * @generated
 */
public enum VariableType implements Enumerator {
	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(0, "NULL", ""),

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(1, "BOOLEAN", "BOOLEAN"),

	/**
	 * The '<em><b>INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(2, "INTEGER", "INTEGER"),

	/**
	 * The '<em><b>STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(3, "STRING", "STRING"),

	/**
	 * The '<em><b>DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(4, "DOUBLE", "DOUBLE"),

	/**
	 * The '<em><b>LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(5, "LONG", "LONG"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(6, "DATE", "DATE");

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 1;

	/**
	 * The '<em><b>INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 2;

	/**
	 * The '<em><b>STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 3;

	/**
	 * The '<em><b>DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 4;

	/**
	 * The '<em><b>LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 5;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Variable Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VariableType[] VALUES_ARRAY =
		new VariableType[] {
			NULL,
			BOOLEAN,
			INTEGER,
			STRING,
			DOUBLE,
			LONG,
			DATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Variable Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VariableType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Variable Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VariableType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variable Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VariableType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}
	
	public static VariableType fromOpcUa(String name) {
		switch (name) {
		case "Int32":
		case "Int16":
		case "Integer":
			return INTEGER;
		case "Int64":
			return LONG;
		case "Double":
		case "Float":
			return DOUBLE;
		case "String":
			return STRING;
		case "Boolean":
			return BOOLEAN;
		case "DateTime":
			return DATE;

		default:
			return NULL;
		}
	}
	
	/**
	 * Returns the '<em><b>Variable Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableType get(int value) {
		switch (value) {
			case NULL_VALUE: return NULL;
			case BOOLEAN_VALUE: return BOOLEAN;
			case INTEGER_VALUE: return INTEGER;
			case STRING_VALUE: return STRING;
			case DOUBLE_VALUE: return DOUBLE;
			case LONG_VALUE: return LONG;
			case DATE_VALUE: return DATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VariableType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //VariableType
