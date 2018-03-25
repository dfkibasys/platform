/**
 */
package de.dfki.iui.basys.model.domain.roletopology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.Requirement#getProperty <em>Property</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.Requirement#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.Requirement#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getRequirement_Property()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.roletopology.Requirement#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range</em>' attribute.
	 * @see #setValueRange(String)
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getRequirement_ValueRange()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValueRange();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.roletopology.Requirement#getValueRange <em>Value Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range</em>' attribute.
	 * @see #getValueRange()
	 * @generated
	 */
	void setValueRange(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getRequirement_Unit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.roletopology.Requirement#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Requirement
