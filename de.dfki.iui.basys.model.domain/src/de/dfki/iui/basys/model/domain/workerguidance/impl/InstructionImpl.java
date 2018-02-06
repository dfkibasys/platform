/**
 */
package de.dfki.iui.basys.model.domain.workerguidance.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;
import de.dfki.iui.basys.model.domain.workerguidance.Instruction;
import de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.InstructionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.InstructionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.InstructionImpl#getWorkstepIds <em>Workstep Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionImpl extends EntityImpl implements Instruction {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;

	/**
	 * The cached value of the '{@link #getWorkstepIds() <em>Workstep Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workstepIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkerguidancePackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkerguidancePackage.INSTRUCTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList<String>(String.class, this, WorkerguidancePackage.INSTRUCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWorkstepIds() {
		if (workstepIds == null) {
			workstepIds = new EDataTypeUniqueEList<String>(String.class, this, WorkerguidancePackage.INSTRUCTION__WORKSTEP_IDS);
		}
		return workstepIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkerguidancePackage.INSTRUCTION__DESCRIPTION:
				return getDescription();
			case WorkerguidancePackage.INSTRUCTION__PARAMETERS:
				return getParameters();
			case WorkerguidancePackage.INSTRUCTION__WORKSTEP_IDS:
				return getWorkstepIds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkerguidancePackage.INSTRUCTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkerguidancePackage.INSTRUCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case WorkerguidancePackage.INSTRUCTION__WORKSTEP_IDS:
				getWorkstepIds().clear();
				getWorkstepIds().addAll((Collection<? extends String>)newValue);
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
			case WorkerguidancePackage.INSTRUCTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkerguidancePackage.INSTRUCTION__PARAMETERS:
				getParameters().clear();
				return;
			case WorkerguidancePackage.INSTRUCTION__WORKSTEP_IDS:
				getWorkstepIds().clear();
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
			case WorkerguidancePackage.INSTRUCTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkerguidancePackage.INSTRUCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case WorkerguidancePackage.INSTRUCTION__WORKSTEP_IDS:
				return workstepIds != null && !workstepIds.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(", workstepIds: ");
		result.append(workstepIds);
		result.append(')');
		return result.toString();
	}

} //InstructionImpl
