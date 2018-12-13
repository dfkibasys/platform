/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance.impl;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.capability.Capability;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.GeneralCapabilityVariant;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;

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
