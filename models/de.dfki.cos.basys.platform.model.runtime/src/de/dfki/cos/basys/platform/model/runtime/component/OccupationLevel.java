/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Occupation Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getOccupationLevel()
 * @model
 * @generated
 */
public enum OccupationLevel implements Enumerator {
	/**
	 * The '<em><b>FREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_VALUE
	 * @generated
	 * @ordered
	 */
	FREE(0, "FREE", "FREE"),

	/**
	 * The '<em><b>OCCUPIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPIED_VALUE
	 * @generated
	 * @ordered
	 */
	OCCUPIED(1, "OCCUPIED", "OCCUPIED"),

	/**
	 * The '<em><b>PRIORITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIORITY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIORITY(2, "PRIORITY", "PRIORITY"),

	/**
	 * The '<em><b>LOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(3, "LOCAL", "LOCAL");

	/**
	 * The '<em><b>FREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FREE_VALUE = 0;

	/**
	 * The '<em><b>OCCUPIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCCUPIED_VALUE = 1;

	/**
	 * The '<em><b>PRIORITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIORITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIORITY_VALUE = 2;

	/**
	 * The '<em><b>LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Occupation Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OccupationLevel[] VALUES_ARRAY =
		new OccupationLevel[] {
			FREE,
			OCCUPIED,
			PRIORITY,
			LOCAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Occupation Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OccupationLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Occupation Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OccupationLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OccupationLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Occupation Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OccupationLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OccupationLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Occupation Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OccupationLevel get(int value) {
		switch (value) {
			case FREE_VALUE: return FREE;
			case OCCUPIED_VALUE: return OCCUPIED;
			case PRIORITY_VALUE: return PRIORITY;
			case LOCAL_VALUE: return LOCAL;
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
	private OccupationLevel(int value, String name, String literal) {
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
	
} //OccupationLevel
