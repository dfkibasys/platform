/**
 */
package de.dfki.cos.basys.platform.model.domain.productdefinition;

import de.dfki.cos.basys.platform.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOM Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productdefinition.BOMEntry#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage#getBOMEntry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BOMEntry extends Entity {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage#getBOMEntry_Count()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.productdefinition.BOMEntry#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

} // BOMEntry
