/**
 */
package de.dfki.iui.basys.model.domain.linebalancing;

import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication;

import de.dfki.iui.basys.model.domain.topology.TopologyElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WM Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getSerialId <em>Serial Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getFrom_position <em>From position</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getTo_position <em>To position</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getEta <em>Eta</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMResourceInstance()
 * @model
 * @generated
 */
public interface WMResourceInstance extends EObject {
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
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMResourceInstance_SerialId()
	 * @model
	 * @generated
	 */
	String getSerialId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getSerialId <em>Serial Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Id</em>' attribute.
	 * @see #getSerialId()
	 * @generated
	 */
	void setSerialId(String value);

	/**
	 * Returns the value of the '<em><b>From position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From position</em>' reference.
	 * @see #setFrom_position(TopologyElement)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMResourceInstance_From_position()
	 * @model
	 * @generated
	 */
	TopologyElement getFrom_position();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getFrom_position <em>From position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From position</em>' reference.
	 * @see #getFrom_position()
	 * @generated
	 */
	void setFrom_position(TopologyElement value);

	/**
	 * Returns the value of the '<em><b>To position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To position</em>' reference.
	 * @see #setTo_position(TopologyElement)
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMResourceInstance_To_position()
	 * @model
	 * @generated
	 */
	TopologyElement getTo_position();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getTo_position <em>To position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To position</em>' reference.
	 * @see #getTo_position()
	 * @generated
	 */
	void setTo_position(TopologyElement value);

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
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMResourceInstance_Eta()
	 * @model
	 * @generated
	 */
	long getEta();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getEta <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' attribute.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(long value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage#getWMResourceInstance_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityApplication> getCapabilities();

} // WMResourceInstance
