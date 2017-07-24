/**
 */
package de.dfki.iui.basys.model.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temperature Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.TemperatureReading#getMeasuredValue <em>Measured Value</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.DomainPackage#getTemperatureReading()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='measuredValueRange'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL measuredValueRange='measuredValue >= -50 and measuredValue <= 50'"
 * @generated
 */
public interface TemperatureReading extends EObject {
	/**
	 * Returns the value of the '<em><b>Measured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured Value</em>' attribute.
	 * @see #setMeasuredValue(float)
	 * @see de.dfki.iui.basys.model.domain.DomainPackage#getTemperatureReading_MeasuredValue()
	 * @model annotation="http://www.basys.de/BaSysAnnotation semanticsId='https://www.wikidata.org/wiki/Q15088658' unit='Celsius' unitId='https://www.wikidata.org/wiki/Q25267'"
	 * @generated
	 */
	float getMeasuredValue();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.TemperatureReading#getMeasuredValue <em>Measured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Value</em>' attribute.
	 * @see #getMeasuredValue()
	 * @generated
	 */
	void setMeasuredValue(float value);

} // TemperatureReading
