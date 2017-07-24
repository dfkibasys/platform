/**
 */
package de.dfki.iui.basys.model.domain;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workstep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.Workstep#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.Workstep#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.Workstep#getBom <em>Bom</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.Workstep#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkstep()
 * @model
 * @generated
 */
public interface Workstep extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * loc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkstep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.Workstep#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einheit?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkstep_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.Workstep#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Bom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bom</em>' containment reference.
	 * @see #setBom(BOM)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkstep_Bom()
	 * @model containment="true"
	 * @generated
	 */
	BOM getBom();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.Workstep#getBom <em>Bom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom</em>' containment reference.
	 * @see #getBom()
	 * @generated
	 */
	void setBom(BOM value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.CapabilityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wird mit den Fähigkeiten der Betriebsmittel abgeglichen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getWorkstep_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityRequirement> getRequirements();

} // Workstep
