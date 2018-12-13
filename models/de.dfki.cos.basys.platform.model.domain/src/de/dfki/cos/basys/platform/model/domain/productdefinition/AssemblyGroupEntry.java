/**
 */
package de.dfki.cos.basys.platform.model.domain.productdefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Group Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productdefinition.AssemblyGroupEntry#getAssemblyGroup <em>Assembly Group</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage#getAssemblyGroupEntry()
 * @model
 * @generated
 */
public interface AssemblyGroupEntry extends BOMEntry {
	/**
	 * Returns the value of the '<em><b>Assembly Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Group</em>' reference.
	 * @see #setAssemblyGroup(AssemblyGroup)
	 * @see de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage#getAssemblyGroupEntry_AssemblyGroup()
	 * @model required="true"
	 * @generated
	 */
	AssemblyGroup getAssemblyGroup();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.productdefinition.AssemblyGroupEntry#getAssemblyGroup <em>Assembly Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Group</em>' reference.
	 * @see #getAssemblyGroup()
	 * @generated
	 */
	void setAssemblyGroup(AssemblyGroup value);

} // AssemblyGroupEntry
