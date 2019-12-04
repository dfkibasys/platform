/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getComponentCategory()
 * @model
 * @generated
 */
public enum ComponentCategory implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>SERVICE COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_COMPONENT(1, "SERVICE_COMPONENT", "SERVICE_COMPONENT"),

	/**
	 * The '<em><b>DEVICE COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_COMPONENT(2, "DEVICE_COMPONENT", "DEVICE_COMPONENT"),

	/**
	 * The '<em><b>MANAGEMENT COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGEMENT_COMPONENT(3, "MANAGEMENT_COMPONENT", "MANAGEMENT_COMPONENT"),

	/**
	 * The '<em><b>PROCESS COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_COMPONENT(4, "PROCESS_COMPONENT", "PROCESS_COMPONENT");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>SERVICE COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_COMPONENT_VALUE = 1;

	/**
	 * The '<em><b>DEVICE COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_COMPONENT_VALUE = 2;

	/**
	 * The '<em><b>MANAGEMENT COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT_COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANAGEMENT_COMPONENT_VALUE = 3;

	/**
	 * The '<em><b>PROCESS COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_COMPONENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentCategory[] VALUES_ARRAY =
		new ComponentCategory[] {
			NONE,
			SERVICE_COMPONENT,
			DEVICE_COMPONENT,
			MANAGEMENT_COMPONENT,
			PROCESS_COMPONENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentCategory get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case SERVICE_COMPONENT_VALUE: return SERVICE_COMPONENT;
			case DEVICE_COMPONENT_VALUE: return DEVICE_COMPONENT;
			case MANAGEMENT_COMPONENT_VALUE: return MANAGEMENT_COMPONENT;
			case PROCESS_COMPONENT_VALUE: return PROCESS_COMPONENT;
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
	private ComponentCategory(int value, String name, String literal) {
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
	
} //ComponentCategory
