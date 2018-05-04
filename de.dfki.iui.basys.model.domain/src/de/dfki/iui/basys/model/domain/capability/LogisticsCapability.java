/**
 */
package de.dfki.iui.basys.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logistics Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getLoadCarrierUnit <em>Load Carrier Unit</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getLogisticsCapability()
 * @model
 * @generated
 */
public interface LogisticsCapability extends Capability {
	/**
	 * Returns the value of the '<em><b>Load Carrier Unit</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Carrier Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Carrier Unit</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum
	 * @see #setLoadCarrierUnit(LoadCarrierUnitEnum)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getLogisticsCapability_LoadCarrierUnit()
	 * @model default="UNDEFINED"
	 * @generated
	 */
	LoadCarrierUnitEnum getLoadCarrierUnit();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getLoadCarrierUnit <em>Load Carrier Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Carrier Unit</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum
	 * @see #getLoadCarrierUnit()
	 * @generated
	 */
	void setLoadCarrierUnit(LoadCarrierUnitEnum value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getLogisticsCapability_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#getLogisticsCapability_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

} // LogisticsCapability
