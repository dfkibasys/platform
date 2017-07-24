/**
 */
package de.dfki.iui.basys.model.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOM Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.BOMEntry#getAmount <em>Amount</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.BOMEntry#getMaterialId <em>Material Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.DomainPackage#getBOMEntry()
 * @model
 * @generated
 */
public interface BOMEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einheit ggf. gesondert spezifizieren. Wir betrachten hier erstmal nur 'Stück'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getBOMEntry_Amount()
	 * @model
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.BOMEntry#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Material Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Id</em>' attribute.
	 * @see #setMaterialId(String)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getBOMEntry_MaterialId()
	 * @model
	 * @generated
	 */
	String getMaterialId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.BOMEntry#getMaterialId <em>Material Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Id</em>' attribute.
	 * @see #getMaterialId()
	 * @generated
	 */
	void setMaterialId(String value);

} // BOMEntry
