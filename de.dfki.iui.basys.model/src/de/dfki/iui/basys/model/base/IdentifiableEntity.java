/**
 */
package de.dfki.iui.basys.model.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.base.IdentifiableEntity#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.base.BasePackage#getIdentifiableEntity()
 * @model
 * @generated
 */
public interface IdentifiableEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dfki.iui.basys.model.base.BasePackage#getIdentifiableEntity_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.base.IdentifiableEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IdentifiableEntity
