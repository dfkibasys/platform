/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;

import de.dfki.cos.basys.platform.model.pattern.PPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getAvailableOn <em>Available On</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getTaskRef <em>Task Ref</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getData()
 * @model
 * @generated
 */
public interface Data extends Node {
	/**
	 * Returns the value of the '<em><b>Available On</b></em>' attribute.
	 * The default value is <code>"SUCCESSFUL"</code>.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available On</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum
	 * @see #setAvailableOn(TaskStateEnum)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getData_AvailableOn()
	 * @model default="SUCCESSFUL"
	 * @generated
	 */
	TaskStateEnum getAvailableOn();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getAvailableOn <em>Available On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available On</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum
	 * @see #getAvailableOn()
	 * @generated
	 */
	void setAvailableOn(TaskStateEnum value);

	/**
	 * Returns the value of the '<em><b>Task Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Ref</em>' reference.
	 * @see #setTaskRef(Task)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getData_TaskRef()
	 * @model
	 * @generated
	 */
	Task getTaskRef();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getTaskRef <em>Task Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Ref</em>' reference.
	 * @see #getTaskRef()
	 * @generated
	 */
	void setTaskRef(Task value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(PPattern)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getData_Pattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PPattern getPattern();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PPattern value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(Object)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getData_Instance()
	 * @model
	 * @generated
	 */
	Object getInstance();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Object value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference.
	 * @see #setMappings(DataMapping)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getData_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	DataMapping getMappings();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.Data#getMappings <em>Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mappings</em>' containment reference.
	 * @see #getMappings()
	 * @generated
	 */
	void setMappings(DataMapping value);

} // Data
