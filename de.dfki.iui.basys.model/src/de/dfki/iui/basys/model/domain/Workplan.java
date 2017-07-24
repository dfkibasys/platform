/**
 */
package de.dfki.iui.basys.model.domain;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ggf. BPMN, CMMN oder sonstige Taskmodelle. Die Ausdrucksmächtigkeit sollte Sequenzen und Vorranggraphen umfassen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.Workplan#getProductVariantId <em>Product Variant Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.Workplan#getWorkstepIds <em>Workstep Ids</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkplan()
 * @model
 * @generated
 */
public interface Workplan extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Product Variant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Variant Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Variant Id</em>' attribute.
	 * @see #setProductVariantId(String)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkplan_ProductVariantId()
	 * @model
	 * @generated
	 */
	String getProductVariantId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.Workplan#getProductVariantId <em>Product Variant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Variant Id</em>' attribute.
	 * @see #getProductVariantId()
	 * @generated
	 */
	void setProductVariantId(String value);

	/**
	 * Returns the value of the '<em><b>Workstep Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO: Vorbedingungen sind noch nicht abbildbar. In den JSONs werden hier Ids angegeben. Kann ein Workstep in mehreren Arbeitsplänen verwendet werden?-> ja
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workstep Ids</em>' attribute list.
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkplan_WorkstepIds()
	 * @model
	 * @generated
	 */
	EList<String> getWorkstepIds();

} // Workplan
