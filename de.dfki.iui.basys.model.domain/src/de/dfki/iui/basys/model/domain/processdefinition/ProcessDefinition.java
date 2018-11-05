/**
 */
package de.dfki.iui.basys.model.domain.processdefinition;

import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.domain.productdefinition.ProductVariant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.ProcessDefinition#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.ProcessDefinition#getEdges <em>Edges</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.ProcessDefinition#getProductVariant <em>Product Variant</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage#getProcessDefinition()
 * @model
 * @generated
 */
public interface ProcessDefinition extends Entity {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.processdefinition.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage#getProcessDefinition_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.processdefinition.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage#getProcessDefinition_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Product Variant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Variant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Variant</em>' reference.
	 * @see #setProductVariant(ProductVariant)
	 * @see de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage#getProcessDefinition_ProductVariant()
	 * @model
	 * @generated
	 */
	ProductVariant getProductVariant();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processdefinition.ProcessDefinition#getProductVariant <em>Product Variant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Variant</em>' reference.
	 * @see #getProductVariant()
	 * @generated
	 */
	void setProductVariant(ProductVariant value);

} // ProcessDefinition
