/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance.impl;

import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourceinstance.GeneralCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Capability Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GeneralCapabilityVariantImpl extends CapabilityVariantImpl<Entity, Capability> implements GeneralCapabilityVariant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralCapabilityVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceinstancePackage.Literals.GENERAL_CAPABILITY_VARIANT;
	}

} //GeneralCapabilityVariantImpl
