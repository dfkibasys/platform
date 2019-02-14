/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.cos.basys.platform.model.runtime.component.CommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ControlCommand;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.CommandRequestImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.CommandRequestImpl#getCorrelationId <em>Correlation Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.CommandRequestImpl#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.CommandRequestImpl#getControlCommand <em>Control Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandRequestImpl extends MinimalEObjectImpl.Container implements CommandRequest {
	/**
	 * The default value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected String componentId = COMPONENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorrelationId() <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationId()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRELATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrelationId() <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationId()
	 * @generated
	 * @ordered
	 */
	protected String correlationId = CORRELATION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> inputParameters;

	/**
	 * The default value of the '{@link #getControlCommand() <em>Control Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlCommand()
	 * @generated
	 * @ordered
	 */
	protected static final ControlCommand CONTROL_COMMAND_EDEFAULT = ControlCommand.NO_COMMAND;

	/**
	 * The cached value of the '{@link #getControlCommand() <em>Control Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlCommand()
	 * @generated
	 * @ordered
	 */
	protected ControlCommand controlCommand = CONTROL_COMMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMMAND_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentId(String newComponentId) {
		String oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMMAND_REQUEST__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorrelationId() {
		return correlationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationId(String newCorrelationId) {
		String oldCorrelationId = correlationId;
		correlationId = newCorrelationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMMAND_REQUEST__CORRELATION_ID, oldCorrelationId, correlationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getInputParameters() {
		if (inputParameters == null) {
			inputParameters = new EObjectContainmentEList<Variable>(Variable.class, this, ComponentPackage.COMMAND_REQUEST__INPUT_PARAMETERS);
		}
		return inputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlCommand getControlCommand() {
		return controlCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlCommand(ControlCommand newControlCommand) {
		ControlCommand oldControlCommand = controlCommand;
		controlCommand = newControlCommand == null ? CONTROL_COMMAND_EDEFAULT : newControlCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMMAND_REQUEST__CONTROL_COMMAND, oldControlCommand, controlCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.COMMAND_REQUEST__INPUT_PARAMETERS:
				return ((InternalEList<?>)getInputParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.COMMAND_REQUEST__COMPONENT_ID:
				return getComponentId();
			case ComponentPackage.COMMAND_REQUEST__CORRELATION_ID:
				return getCorrelationId();
			case ComponentPackage.COMMAND_REQUEST__INPUT_PARAMETERS:
				return getInputParameters();
			case ComponentPackage.COMMAND_REQUEST__CONTROL_COMMAND:
				return getControlCommand();
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
			case ComponentPackage.COMMAND_REQUEST__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case ComponentPackage.COMMAND_REQUEST__CORRELATION_ID:
				setCorrelationId((String)newValue);
				return;
			case ComponentPackage.COMMAND_REQUEST__INPUT_PARAMETERS:
				getInputParameters().clear();
				getInputParameters().addAll((Collection<? extends Variable>)newValue);
				return;
			case ComponentPackage.COMMAND_REQUEST__CONTROL_COMMAND:
				setControlCommand((ControlCommand)newValue);
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
			case ComponentPackage.COMMAND_REQUEST__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case ComponentPackage.COMMAND_REQUEST__CORRELATION_ID:
				setCorrelationId(CORRELATION_ID_EDEFAULT);
				return;
			case ComponentPackage.COMMAND_REQUEST__INPUT_PARAMETERS:
				getInputParameters().clear();
				return;
			case ComponentPackage.COMMAND_REQUEST__CONTROL_COMMAND:
				setControlCommand(CONTROL_COMMAND_EDEFAULT);
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
			case ComponentPackage.COMMAND_REQUEST__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case ComponentPackage.COMMAND_REQUEST__CORRELATION_ID:
				return CORRELATION_ID_EDEFAULT == null ? correlationId != null : !CORRELATION_ID_EDEFAULT.equals(correlationId);
			case ComponentPackage.COMMAND_REQUEST__INPUT_PARAMETERS:
				return inputParameters != null && !inputParameters.isEmpty();
			case ComponentPackage.COMMAND_REQUEST__CONTROL_COMMAND:
				return controlCommand != CONTROL_COMMAND_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (componentId: ");
		result.append(componentId);
		result.append(", correlationId: ");
		result.append(correlationId);
		result.append(", controlCommand: ");
		result.append(controlCommand);
		result.append(')');
		return result.toString();
	}

	public static class Builder {
		private String componentId;
		private ControlCommand controlCommand;

		public Builder componentId(String componentId) {
			this.componentId = componentId;
			return this;
		}

		public Builder controlCommand(ControlCommand controlCommand) {
			this.controlCommand = controlCommand;
			return this;
		}

		public CommandRequestImpl build() {
			return new CommandRequestImpl(this);
		}
	}

	private CommandRequestImpl(Builder builder) {
		this.componentId = builder.componentId;
		this.controlCommand = builder.controlCommand;
	}
}
