/**
 */
package de.dfki.iui.basys.model.domain.roletopology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.Transition#getComponentId_src <em>Component Id src</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.Transition#getComponentId_target <em>Component Id target</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.Transition#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Id src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id src</em>' attribute.
	 * @see #setComponentId_src(String)
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getTransition_ComponentId_src()
	 * @model
	 * @generated
	 */
	String getComponentId_src();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.roletopology.Transition#getComponentId_src <em>Component Id src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id src</em>' attribute.
	 * @see #getComponentId_src()
	 * @generated
	 */
	void setComponentId_src(String value);

	/**
	 * Returns the value of the '<em><b>Component Id target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id target</em>' attribute.
	 * @see #setComponentId_target(String)
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getTransition_ComponentId_target()
	 * @model
	 * @generated
	 */
	String getComponentId_target();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.roletopology.Transition#getComponentId_target <em>Component Id target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id target</em>' attribute.
	 * @see #getComponentId_target()
	 * @generated
	 */
	void setComponentId_target(String value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(float)
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getTransition_Distance()
	 * @model
	 * @generated
	 */
	float getDistance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.roletopology.Transition#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(float value);

} // Transition
