/**
 */
package de.dfki.cos.basys.platform.model.domain.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QA Visualisation Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.QAVisualisationCapability#isQaResult <em>Qa Result</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getQAVisualisationCapability()
 * @model
 * @generated
 */
public interface QAVisualisationCapability extends VisualisationCapability {
	/**
	 * Returns the value of the '<em><b>Qa Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qa Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qa Result</em>' attribute.
	 * @see #setQaResult(boolean)
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#getQAVisualisationCapability_QaResult()
	 * @model
	 * @generated
	 */
	boolean isQaResult();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.capability.QAVisualisationCapability#isQaResult <em>Qa Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qa Result</em>' attribute.
	 * @see #isQaResult()
	 * @generated
	 */
	void setQaResult(boolean value);

} // QAVisualisationCapability
