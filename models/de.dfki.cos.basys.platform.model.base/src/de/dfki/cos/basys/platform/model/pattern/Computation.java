/**
 */
package de.dfki.cos.basys.platform.model.pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Computation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getComputation()
 * @model
 * @generated
 */
public enum Computation implements Enumerator {
	/**
	 * The '<em><b>SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(0, "SET", "Set"),

	/**
	 * The '<em><b>OVERLAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAY_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAY(1, "OVERLAY", "Overlay"),

	/**
	 * The '<em><b>UNIFICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	UNIFICATION(2, "UNIFICATION", "Unification"),

	/**
	 * The '<em><b>RESTRICTED UNIFICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTRICTED_UNIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	RESTRICTED_UNIFICATION(3, "RESTRICTED_UNIFICATION", "RestrictedUnification"),

	/**
	 * The '<em><b>ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_VALUE
	 * @generated
	 * @ordered
	 */
	ADD(4, "ADD", "Add");

	/**
	 * The '<em><b>SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model literal="Set"
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 0;

	/**
	 * The '<em><b>OVERLAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERLAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERLAY
	 * @model literal="Overlay"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAY_VALUE = 1;

	/**
	 * The '<em><b>UNIFICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIFICATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIFICATION
	 * @model literal="Unification"
	 * @generated
	 * @ordered
	 */
	public static final int UNIFICATION_VALUE = 2;

	/**
	 * The '<em><b>RESTRICTED UNIFICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESTRICTED UNIFICATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTRICTED_UNIFICATION
	 * @model literal="RestrictedUnification"
	 * @generated
	 * @ordered
	 */
	public static final int RESTRICTED_UNIFICATION_VALUE = 3;

	/**
	 * The '<em><b>ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD
	 * @model literal="Add"
	 * @generated
	 * @ordered
	 */
	public static final int ADD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Computation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Computation[] VALUES_ARRAY =
		new Computation[] {
			SET,
			OVERLAY,
			UNIFICATION,
			RESTRICTED_UNIFICATION,
			ADD,
		};

	/**
	 * A public read-only list of all the '<em><b>Computation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Computation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Computation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Computation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Computation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Computation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Computation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Computation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Computation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Computation get(int value) {
		switch (value) {
			case SET_VALUE: return SET;
			case OVERLAY_VALUE: return OVERLAY;
			case UNIFICATION_VALUE: return UNIFICATION;
			case RESTRICTED_UNIFICATION_VALUE: return RESTRICTED_UNIFICATION;
			case ADD_VALUE: return ADD;
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
	private Computation(int value, String name, String literal) {
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
	
} //Computation
