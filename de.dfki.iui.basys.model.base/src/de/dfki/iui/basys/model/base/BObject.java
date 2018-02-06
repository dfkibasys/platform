/**
 */
package de.dfki.iui.basys.model.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.base.BObject#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.base.BasePackage#getBObject()
 * @model
 * @generated
 */
public interface BObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see #setBinding(String)
	 * @see de.dfki.iui.basys.model.base.BasePackage#getBObject_Binding()
	 * @model
	 * @generated
	 */
	String getBinding();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.base.BObject#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' attribute.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(String value);

} // BObject
