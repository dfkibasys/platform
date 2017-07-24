/**
 */
package de.dfki.iui.basys.model.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Product Instance Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Weitere Literale? Verschmelzung mit OderStatusEnum?
 * <!-- end-model-doc -->
 * @see de.dfki.iui.basys.model.domain.DomainPackage#getProductInstanceStatusEnum()
 * @model
 * @generated
 */
public enum ProductInstanceStatusEnum implements Enumerator {
	/**
	 * The '<em><b>IN PRODUCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PRODUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PRODUCTION(0, "IN_PRODUCTION", "IN_PRODUCTION"),

	/**
	 * The '<em><b>IN TEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	IN_TEST(1, "IN_TEST", "IN_TEST"),

	/**
	 * The '<em><b>NIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIO_VALUE
	 * @generated
	 * @ordered
	 */
	NIO(2, "NIO", "NIO"),

	/**
	 * The '<em><b>IN REPAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_REPAIR_VALUE
	 * @generated
	 * @ordered
	 */
	IN_REPAIR(3, "IN_REPAIR", "IN_REPAIR"),

	/**
	 * The '<em><b>IO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_VALUE
	 * @generated
	 * @ordered
	 */
	IO(4, "IO", "PRODUCED");

	/**
	 * The '<em><b>IN PRODUCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN PRODUCTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_PRODUCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_PRODUCTION_VALUE = 0;

	/**
	 * The '<em><b>IN TEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN TEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_TEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_TEST_VALUE = 1;

	/**
	 * The '<em><b>NIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NIO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NIO_VALUE = 2;

	/**
	 * The '<em><b>IN REPAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN REPAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_REPAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_REPAIR_VALUE = 3;

	/**
	 * The '<em><b>IO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IO
	 * @model literal="PRODUCED"
	 * @generated
	 * @ordered
	 */
	public static final int IO_VALUE = 4;

	/**
	 * An array of all the '<em><b>Product Instance Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProductInstanceStatusEnum[] VALUES_ARRAY =
		new ProductInstanceStatusEnum[] {
			IN_PRODUCTION,
			IN_TEST,
			NIO,
			IN_REPAIR,
			IO,
		};

	/**
	 * A public read-only list of all the '<em><b>Product Instance Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProductInstanceStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Product Instance Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductInstanceStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductInstanceStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Instance Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductInstanceStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductInstanceStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Instance Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductInstanceStatusEnum get(int value) {
		switch (value) {
			case IN_PRODUCTION_VALUE: return IN_PRODUCTION;
			case IN_TEST_VALUE: return IN_TEST;
			case NIO_VALUE: return NIO;
			case IN_REPAIR_VALUE: return IN_REPAIR;
			case IO_VALUE: return IO;
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
	private ProductInstanceStatusEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //ProductInstanceStatusEnum
