/**
 */
package de.dfki.iui.basys.model.domain.workerguidance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Audio#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getAudio()
 * @model
 * @generated
 */
public interface Audio extends Media {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einheit?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getAudio_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Audio#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // Audio
