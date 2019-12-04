/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Execution Command</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getExecutionCommand()
 * @model
 * @generated
 */
public enum ExecutionCommand implements Enumerator {
	/**
	 * The '<em><b>RESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_VALUE
	 * @generated
	 * @ordered
	 */
	RESET(0, "RESET", "RESET"),

	/**
	 * The '<em><b>START</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_VALUE
	 * @generated
	 * @ordered
	 */
	START(1, "START", "START"),

	/**
	 * The '<em><b>STOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_VALUE
	 * @generated
	 * @ordered
	 */
	STOP(2, "STOP", "STOP"),

	/**
	 * The '<em><b>HOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLD_VALUE
	 * @generated
	 * @ordered
	 */
	HOLD(3, "HOLD", "HOLD"),

	/**
	 * The '<em><b>UNHOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNHOLD_VALUE
	 * @generated
	 * @ordered
	 */
	UNHOLD(4, "UNHOLD", "UNHOLD"),

	/**
	 * The '<em><b>SUSPEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPEND_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPEND(5, "SUSPEND", "SUSPEND"),

	/**
	 * The '<em><b>UNSUSPEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUSPEND_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUSPEND(6, "UNSUSPEND", "UNSUSPEND"),

	/**
	 * The '<em><b>ABORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_VALUE
	 * @generated
	 * @ordered
	 */
	ABORT(7, "ABORT", "ABORT"),

	/**
	 * The '<em><b>CLEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAR(8, "CLEAR", "CLEAR");

	/**
	 * The '<em><b>RESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESET_VALUE = 0;

	/**
	 * The '<em><b>START</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int START_VALUE = 1;

	/**
	 * The '<em><b>STOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STOP_VALUE = 2;

	/**
	 * The '<em><b>HOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOLD_VALUE = 3;

	/**
	 * The '<em><b>UNHOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNHOLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNHOLD_VALUE = 4;

	/**
	 * The '<em><b>SUSPEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUSPEND_VALUE = 5;

	/**
	 * The '<em><b>UNSUSPEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUSPEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUSPEND_VALUE = 6;

	/**
	 * The '<em><b>ABORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_VALUE = 7;

	/**
	 * The '<em><b>CLEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR_VALUE = 8;

	/**
	 * An array of all the '<em><b>Execution Command</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExecutionCommand[] VALUES_ARRAY =
		new ExecutionCommand[] {
			RESET,
			START,
			STOP,
			HOLD,
			UNHOLD,
			SUSPEND,
			UNSUSPEND,
			ABORT,
			CLEAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Execution Command</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExecutionCommand> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Execution Command</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionCommand get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExecutionCommand result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Execution Command</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionCommand getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExecutionCommand result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Execution Command</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionCommand get(int value) {
		switch (value) {
			case RESET_VALUE: return RESET;
			case START_VALUE: return START;
			case STOP_VALUE: return STOP;
			case HOLD_VALUE: return HOLD;
			case UNHOLD_VALUE: return UNHOLD;
			case SUSPEND_VALUE: return SUSPEND;
			case UNSUSPEND_VALUE: return UNSUSPEND;
			case ABORT_VALUE: return ABORT;
			case CLEAR_VALUE: return CLEAR;
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
	private ExecutionCommand(int value, String name, String literal) {
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
	
} //ExecutionCommand
