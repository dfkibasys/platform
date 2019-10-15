/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occupation Level Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest#getOccupationLevel <em>Occupation Level</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getOccupationLevelRequest()
 * @model
 * @generated
 */
public interface OccupationLevelRequest extends ComponentRequest {
	/**
	 * Returns the value of the '<em><b>Occupation Level</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupation Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupation Level</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel
	 * @see #setOccupationLevel(OccupationLevel)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getOccupationLevelRequest_OccupationLevel()
	 * @model
	 * @generated
	 */
	OccupationLevel getOccupationLevel();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest#getOccupationLevel <em>Occupation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupation Level</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel
	 * @see #getOccupationLevel()
	 * @generated
	 */
	void setOccupationLevel(OccupationLevel value);

} // OccupationLevelRequest
