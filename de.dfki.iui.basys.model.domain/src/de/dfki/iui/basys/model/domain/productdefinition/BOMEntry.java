/**
 */
package de.dfki.iui.basys.model.domain.productdefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOM Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.productdefinition.BOMEntry#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getBOMEntry()
 * @model
 * @generated
 */
public interface BOMEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage#getBOMEntry_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.productdefinition.BOMEntry#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

} // BOMEntry
