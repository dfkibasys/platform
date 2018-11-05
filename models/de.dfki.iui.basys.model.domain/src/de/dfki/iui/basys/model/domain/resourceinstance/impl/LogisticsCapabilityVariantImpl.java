/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance.impl;

import de.dfki.iui.basys.model.domain.resourceinstance.LogisticsCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;

import de.dfki.iui.basys.model.domain.topology.TopologyElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logistics Capability Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LogisticsCapabilityVariantImpl extends CapabilityVariantImpl<TopologyElement> implements LogisticsCapabilityVariant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticsCapabilityVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceinstancePackage.Literals.LOGISTICS_CAPABILITY_VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<TopologyElement> getAppliedOn() {
		if (appliedOn == null) {
			appliedOn = new EObjectResolvingEList<TopologyElement>(TopologyElement.class, this, ResourceinstancePackage.LOGISTICS_CAPABILITY_VARIANT__APPLIED_ON);
		}
		return appliedOn;
	}

} //LogisticsCapabilityVariantImpl
