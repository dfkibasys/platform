/**
 */
package de.dfki.iui.basys.model.domain.capability.impl;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.QAVisualisationCapability;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QA Visualisation Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.QAVisualisationCapabilityImpl#isQaResult <em>Qa Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QAVisualisationCapabilityImpl extends VisualisationCapabilityImpl implements QAVisualisationCapability {
	/**
	 * The default value of the '{@link #isQaResult() <em>Qa Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQaResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QA_RESULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQaResult() <em>Qa Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQaResult()
	 * @generated
	 * @ordered
	 */
	protected boolean qaResult = QA_RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QAVisualisationCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.QA_VISUALISATION_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQaResult() {
		return qaResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQaResult(boolean newQaResult) {
		boolean oldQaResult = qaResult;
		qaResult = newQaResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.QA_VISUALISATION_CAPABILITY__QA_RESULT, oldQaResult, qaResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilityPackage.QA_VISUALISATION_CAPABILITY__QA_RESULT:
				return isQaResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CapabilityPackage.QA_VISUALISATION_CAPABILITY__QA_RESULT:
				setQaResult((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CapabilityPackage.QA_VISUALISATION_CAPABILITY__QA_RESULT:
				setQaResult(QA_RESULT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CapabilityPackage.QA_VISUALISATION_CAPABILITY__QA_RESULT:
				return qaResult != QA_RESULT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (qaResult: ");
		result.append(qaResult);
		result.append(')');
		return result.toString();
	}

} //QAVisualisationCapabilityImpl
