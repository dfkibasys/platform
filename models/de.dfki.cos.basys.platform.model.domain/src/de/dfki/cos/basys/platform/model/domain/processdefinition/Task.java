/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;

import org.eclipse.emf.common.util.EList;

import de.dfki.cos.basys.platform.model.domain.capability.ManufacturingCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getMinIterations <em>Min Iterations</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getMaxIterations <em>Max Iterations</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getUri <em>Uri</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getInputData <em>Input Data</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getOutputData <em>Output Data</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getCapabilityRequirement <em>Capability Requirement</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getUsedmaterial <em>Usedmaterial</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Min Iterations</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Iterations</em>' attribute.
	 * @see #setMinIterations(int)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTask_MinIterations()
	 * @model default="1"
	 * @generated
	 */
	int getMinIterations();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getMinIterations <em>Min Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Iterations</em>' attribute.
	 * @see #getMinIterations()
	 * @generated
	 */
	void setMinIterations(int value);

	/**
	 * Returns the value of the '<em><b>Max Iterations</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Iterations</em>' attribute.
	 * @see #setMaxIterations(int)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTask_MaxIterations()
	 * @model default="1"
	 * @generated
	 */
	int getMaxIterations();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getMaxIterations <em>Max Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Iterations</em>' attribute.
	 * @see #getMaxIterations()
	 * @generated
	 */
	void setMaxIterations(int value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTask_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Input Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTask_InputData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getInputData();

	/**
	 * Returns the value of the '<em><b>Output Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTask_OutputData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getOutputData();

	/**
	 * Returns the value of the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Requirement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Requirement</em>' containment reference.
	 * @see #setCapabilityRequirement(ManufacturingCapability)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTask_CapabilityRequirement()
	 * @model containment="true"
	 * @generated
	 */
	ManufacturingCapability getCapabilityRequirement();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Task#getCapabilityRequirement <em>Capability Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Requirement</em>' containment reference.
	 * @see #getCapabilityRequirement()
	 * @generated
	 */
	void setCapabilityRequirement(ManufacturingCapability value);

	/**
	 * Returns the value of the '<em><b>Usedmaterial</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usedmaterial</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usedmaterial</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTask_Usedmaterial()
	 * @model
	 * @generated
	 */
	EList<UsedMaterial> getUsedmaterial();

} // Task
