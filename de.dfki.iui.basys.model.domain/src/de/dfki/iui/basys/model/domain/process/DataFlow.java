/**
 */
package de.dfki.iui.basys.model.domain.process;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.DataFlow#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getDataFlow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeCheck'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL typeCheck='self.sourceRef.oclIsKindOf(Data) and self.targetRef.oclIsKindOf(Data)'"
 * @generated
 */
public interface DataFlow extends Edge {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(DataTransformation)
	 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage#getDataFlow_Transformation()
	 * @model
	 * @generated
	 */
	DataTransformation getTransformation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.process.DataFlow#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(DataTransformation value);

} // DataFlow
