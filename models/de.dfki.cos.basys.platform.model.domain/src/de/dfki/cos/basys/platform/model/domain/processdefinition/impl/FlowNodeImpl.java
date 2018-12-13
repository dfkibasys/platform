/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition.impl;

import org.eclipse.emf.ecore.EClass;

import de.dfki.cos.basys.platform.model.domain.processdefinition.FlowNode;
import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FlowNodeImpl extends NodeImpl implements FlowNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.FLOW_NODE;
	}

} //FlowNodeImpl
