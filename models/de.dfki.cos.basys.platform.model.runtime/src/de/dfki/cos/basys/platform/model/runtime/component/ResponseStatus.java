/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Response Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getResponseStatus()
 * @model
 * @generated
 */
public enum ResponseStatus implements Enumerator {
	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

	/**
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(1, "OK", "OK"),

	/**
	 * The '<em><b>NOT OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_OK_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_OK(2, "NOT_OK", "NOT_OK");

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 1;

	/**
	 * The '<em><b>NOT OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_OK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_OK_VALUE = 2;

	/**
	 * An array of all the '<em><b>Response Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResponseStatus[] VALUES_ARRAY =
		new ResponseStatus[] {
			UNDEFINED,
			OK,
			NOT_OK,
		};

	/**
	 * A public read-only list of all the '<em><b>Response Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResponseStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Response Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResponseStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Response Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResponseStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Response Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseStatus get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case OK_VALUE: return OK;
			case NOT_OK_VALUE: return NOT_OK;
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
	private ResponseStatus(int value, String name, String literal) {
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
	
} //ResponseStatus
