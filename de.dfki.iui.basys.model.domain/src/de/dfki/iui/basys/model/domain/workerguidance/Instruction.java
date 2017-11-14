/**
 */
package de.dfki.iui.basys.model.domain.workerguidance;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Instruction#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Instruction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Instruction#getWorkstepIds <em>Workstep Ids</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends IdentifiableEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * loc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getInstruction_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Instruction#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getInstruction_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Workstep Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verknüpfung einer Instruktion mit einem der mehreren Worksteps
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workstep Ids</em>' attribute list.
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getInstruction_WorkstepIds()
	 * @model
	 * @generated
	 */
	EList<String> getWorkstepIds();

} // Instruction
