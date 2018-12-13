/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.cos.basys.platform.model.domain.processdefinition.DataFlow;
import de.dfki.cos.basys.platform.model.domain.processdefinition.DataTransformation;
import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.impl.DataFlowImpl#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowImpl extends EdgeImpl implements DataFlow {
	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected DataTransformation transformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.DATA_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransformation getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (DataTransformation)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessdefinitionPackage.DATA_FLOW__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransformation basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(DataTransformation newTransformation) {
		DataTransformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA_FLOW__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessdefinitionPackage.DATA_FLOW__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
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
			case ProcessdefinitionPackage.DATA_FLOW__TRANSFORMATION:
				setTransformation((DataTransformation)newValue);
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
			case ProcessdefinitionPackage.DATA_FLOW__TRANSFORMATION:
				setTransformation((DataTransformation)null);
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
			case ProcessdefinitionPackage.DATA_FLOW__TRANSFORMATION:
				return transformation != null;
		}
		return super.eIsSet(featureID);
	}

} //DataFlowImpl
