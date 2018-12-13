/**
 */
package de.dfki.cos.basys.platform.model.domain.linebalancing;

import org.eclipse.emf.ecore.EObject;

import de.dfki.cos.basys.platform.model.domain.productdefinition.ManufacturedComponent;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WM Product Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance#getSerialId <em>Serial Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance#getPosition <em>Position</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance#isIn_transit <em>In transit</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance#getEta <em>Eta</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getWMProductInstance()
 * @model
 * @generated
 */
public interface WMProductInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Serial Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Id</em>' attribute.
	 * @see #setSerialId(String)
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getWMProductInstance_SerialId()
	 * @model
	 * @generated
	 */
	String getSerialId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance#getSerialId <em>Serial Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Id</em>' attribute.
	 * @see #getSerialId()
	 * @generated
	 */
	void setSerialId(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(TopologyElement)
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getWMProductInstance_Position()
	 * @model
	 * @generated
	 */
	TopologyElement getPosition();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(TopologyElement value);

	/**
	 * Returns the value of the '<em><b>In transit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In transit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In transit</em>' attribute.
	 * @see #setIn_transit(boolean)
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getWMProductInstance_In_transit()
	 * @model
	 * @generated
	 */
	boolean isIn_transit();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance#isIn_transit <em>In transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In transit</em>' attribute.
	 * @see #isIn_transit()
	 * @generated
	 */
	void setIn_transit(boolean value);

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
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getWMProductInstance_Eta()
	 * @model
	 * @generated
	 */
	long getEta();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance#getEta <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' attribute.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(long value);

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' reference.
	 * @see #setVariant(ManufacturedComponent)
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#getWMProductInstance_Variant()
	 * @model
	 * @generated
	 */
	ManufacturedComponent getVariant();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance#getVariant <em>Variant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' reference.
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(ManufacturedComponent value);

} // WMProductInstance
