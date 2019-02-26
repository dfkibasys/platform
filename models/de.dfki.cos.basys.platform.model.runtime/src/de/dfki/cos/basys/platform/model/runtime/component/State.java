/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getState()
 * @model
 * @generated
 */
public enum State implements Enumerator {
	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "UNDEFINED", "UNDEFINED"), /**
	 * The '<em><b>CLEARING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEARING_VALUE
	 * @generated
	 * @ordered
	 */
	CLEARING(1, "CLEARING", "CLEARING"), /**
	 * The '<em><b>STOPPED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
	STOPPED(2, "STOPPED", "STOPPED"), /**
	 * The '<em><b>STARTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTING_VALUE
	 * @generated
	 * @ordered
	 */
	STARTING(3, "STARTING", "STARTING"), /**
	 * The '<em><b>IDLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDLE_VALUE
	 * @generated
	 * @ordered
	 */
	IDLE(4, "IDLE", "IDLE"), /**
	 * The '<em><b>SUSPENDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED(5, "SUSPENDED", "SUSPENDED"), /**
	 * The '<em><b>EXECUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTE_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTE(6, "EXECUTE", "EXECUTE"), /**
	 * The '<em><b>STOPPING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOPPING_VALUE
	 * @generated
	 * @ordered
	 */
	STOPPING(7, "STOPPING", "STOPPING"), /**
	 * The '<em><b>ABORTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORTING_VALUE
	 * @generated
	 * @ordered
	 */
	ABORTING(8, "ABORTING", "ABORTING"), /**
	 * The '<em><b>ABORTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORTED_VALUE
	 * @generated
	 * @ordered
	 */
	ABORTED(9, "ABORTED", "ABORTED"), /**
	 * The '<em><b>HOLDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLDING_VALUE
	 * @generated
	 * @ordered
	 */
	HOLDING(10, "HOLDING", "HOLDING"), /**
	 * The '<em><b>HELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELD_VALUE
	 * @generated
	 * @ordered
	 */
	HELD(11, "HELD", "HELD"), /**
	 * The '<em><b>UNHOLDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNHOLDING_VALUE
	 * @generated
	 * @ordered
	 */
	UNHOLDING(12, "UNHOLDING", "UNHOLDING"), /**
	 * The '<em><b>SUSPENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDING_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDING(13, "SUSPENDING", "SUSPENDING"), /**
	 * The '<em><b>UNSUSPENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUSPENDING_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUSPENDING(14, "UNSUSPENDING", "UNSUSPENDING"), /**
	 * The '<em><b>RESETTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESETTING_VALUE
	 * @generated
	 * @ordered
	 */
	RESETTING(15, "RESETTING", "RESETTING"), /**
	 * The '<em><b>COMPLETING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETING_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETING(16, "COMPLETING", "COMPLETING"), /**
	 * The '<em><b>COMPLETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE(17, "COMPLETE", "COMPLETE");

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>CLEARING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLEARING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLEARING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLEARING_VALUE = 1;

	/**
	 * The '<em><b>STOPPED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STOPPED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOPPED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STOPPED_VALUE = 2;

	/**
	 * The '<em><b>STARTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STARTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARTING_VALUE = 3;

	/**
	 * The '<em><b>IDLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDLE_VALUE = 3;

	/**
	 * The '<em><b>SUSPENDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUSPENDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED_VALUE = 5;

	/**
	 * The '<em><b>EXECUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXECUTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXECUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTE_VALUE = 6;

	/**
	 * The '<em><b>STOPPING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STOPPING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOPPING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STOPPING_VALUE = 7;

	/**
	 * The '<em><b>ABORTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABORTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABORTING_VALUE = 8;

	/**
	 * The '<em><b>ABORTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABORTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABORTED_VALUE = 9;

	/**
	 * The '<em><b>HOLDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOLDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOLDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOLDING_VALUE = 10;

	/**
	 * The '<em><b>HELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HELD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HELD_VALUE = 11;

	/**
	 * The '<em><b>UNHOLDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNHOLDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNHOLDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNHOLDING_VALUE = 12;

	/**
	 * The '<em><b>SUSPENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUSPENDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSPENDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDING_VALUE = 13;

	/**
	 * The '<em><b>UNSUSPENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSUSPENDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSUSPENDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUSPENDING_VALUE = 14;

	/**
	 * The '<em><b>RESETTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESETTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESETTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESETTING_VALUE = 15;

	/**
	 * The '<em><b>COMPLETING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLETING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETING_VALUE = 16;

	/**
	 * The '<em><b>COMPLETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_VALUE = 17;

	/**
	 * An array of all the '<em><b>State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final State[] VALUES_ARRAY =
		new State[] {
			UNDEFINED,
			CLEARING,
			STOPPED,
			STARTING,
			IDLE,
			SUSPENDED,
			EXECUTE,
			STOPPING,
			ABORTING,
			ABORTED,
			HOLDING,
			HELD,
			UNHOLDING,
			SUSPENDING,
			UNSUSPENDING,
			RESETTING,
			COMPLETING,
			COMPLETE,
		};

	/**
	 * A public read-only list of all the '<em><b>State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<State> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static State get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			State result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static State getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			State result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static State get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case CLEARING_VALUE: return CLEARING;
			case STOPPED_VALUE: return STOPPED;
			case STARTING_VALUE: return STARTING;
			case SUSPENDED_VALUE: return SUSPENDED;
			case EXECUTE_VALUE: return EXECUTE;
			case STOPPING_VALUE: return STOPPING;
			case ABORTING_VALUE: return ABORTING;
			case ABORTED_VALUE: return ABORTED;
			case HOLDING_VALUE: return HOLDING;
			case HELD_VALUE: return HELD;
			case UNHOLDING_VALUE: return UNHOLDING;
			case SUSPENDING_VALUE: return SUSPENDING;
			case UNSUSPENDING_VALUE: return UNSUSPENDING;
			case RESETTING_VALUE: return RESETTING;
			case COMPLETING_VALUE: return COMPLETING;
			case COMPLETE_VALUE: return COMPLETE;
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
	private State(int value, String name, String literal) {
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
	
} //ComponentState
