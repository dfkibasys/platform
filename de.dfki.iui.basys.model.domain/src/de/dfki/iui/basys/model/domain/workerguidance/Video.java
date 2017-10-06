/**
 */
package de.dfki.iui.basys.model.domain.workerguidance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Video#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Video#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Video#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getVideo()
 * @model
 * @generated
 */
public interface Video extends Media {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einheit?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getVideo_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Video#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einheit? int, implitzit px
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getVideo_Width()
	 * @model annotation="http://basys/unit unit='px'"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Video#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einheit?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getVideo_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Video#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // Video
