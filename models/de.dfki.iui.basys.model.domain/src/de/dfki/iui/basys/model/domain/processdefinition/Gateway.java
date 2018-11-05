/**
 */
package de.dfki.iui.basys.model.domain.processdefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.Gateway#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.processdefinition.GatewayTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.processdefinition.GatewayTypeEnum
	 * @see #setType(GatewayTypeEnum)
	 * @see de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage#getGateway_Type()
	 * @model required="true"
	 * @generated
	 */
	GatewayTypeEnum getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processdefinition.Gateway#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.processdefinition.GatewayTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(GatewayTypeEnum value);

} // Gateway
