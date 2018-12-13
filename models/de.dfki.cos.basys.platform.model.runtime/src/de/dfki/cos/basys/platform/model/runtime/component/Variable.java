/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getVariable_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.runtime.component.VariableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.VariableType
	 * @see #setType(VariableType)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getVariable_Type()
	 * @model default=""
	 * @generated
	 */
	VariableType getType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.VariableType
	 * @see #getType()
	 * @generated
	 */
	void setType(VariableType value);

} // Variable
