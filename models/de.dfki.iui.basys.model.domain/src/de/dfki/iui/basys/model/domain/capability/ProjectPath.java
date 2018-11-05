/**
 */
package de.dfki.iui.basys.model.domain.capability;

import de.dfki.iui.basys.model.data.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.ProjectPath#getPath <em>Path</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.ProjectPath#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.ProjectPath#getArrowCount <em>Arrow Count</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.ProjectPath#getColor <em>Color</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.ProjectPath#getEta <em>Eta</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectPath()
 * @model
 * @generated
 */
public interface ProjectPath extends WorkerAssistenceCapability {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Path)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectPath_Path()
	 * @model containment="true"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.ProjectPath#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(long)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectPath_Delay()
	 * @model
	 * @generated
	 */
	long getDelay();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.ProjectPath#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(long value);

	/**
	 * Returns the value of the '<em><b>Arrow Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrow Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow Count</em>' attribute.
	 * @see #setArrowCount(int)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectPath_ArrowCount()
	 * @model
	 * @generated
	 */
	int getArrowCount();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.ProjectPath#getArrowCount <em>Arrow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow Count</em>' attribute.
	 * @see #getArrowCount()
	 * @generated
	 */
	void setArrowCount(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(int)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectPath_Color()
	 * @model
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.ProjectPath#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

	/**
	 * Returns the value of the '<em><b>Eta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eta</em>' attribute.
	 * @see #setEta(long)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getProjectPath_Eta()
	 * @model
	 * @generated
	 */
	long getEta();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.ProjectPath#getEta <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' attribute.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(long value);

} // ProjectPath
