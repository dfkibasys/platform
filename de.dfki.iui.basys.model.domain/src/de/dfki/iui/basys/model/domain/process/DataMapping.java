/**
 */
package de.dfki.iui.basys.model.domain.process;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.DataMapping#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.DataMapping#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.DataMapping#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.DataMapping#getTargetPath <em>Target Path</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getDataMapping()
 * @model
 * @generated
 */
public interface DataMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Name</em>' attribute.
	 * @see #setSourceName(String)
	 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getDataMapping_SourceName()
	 * @model
	 * @generated
	 */
	String getSourceName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.process.DataMapping#getSourceName <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Name</em>' attribute.
	 * @see #getSourceName()
	 * @generated
	 */
	void setSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Source Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Path</em>' attribute.
	 * @see #setSourcePath(String)
	 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getDataMapping_SourcePath()
	 * @model
	 * @generated
	 */
	String getSourcePath();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.process.DataMapping#getSourcePath <em>Source Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Path</em>' attribute.
	 * @see #getSourcePath()
	 * @generated
	 */
	void setSourcePath(String value);

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Name</em>' attribute.
	 * @see #setTargetName(String)
	 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getDataMapping_TargetName()
	 * @model
	 * @generated
	 */
	String getTargetName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.process.DataMapping#getTargetName <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Name</em>' attribute.
	 * @see #getTargetName()
	 * @generated
	 */
	void setTargetName(String value);

	/**
	 * Returns the value of the '<em><b>Target Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Path</em>' attribute.
	 * @see #setTargetPath(String)
	 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getDataMapping_TargetPath()
	 * @model
	 * @generated
	 */
	String getTargetPath();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.process.DataMapping#getTargetPath <em>Target Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Path</em>' attribute.
	 * @see #getTargetPath()
	 * @generated
	 */
	void setTargetPath(String value);

} // DataMapping
