/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication.impl;

import org.eclipse.emf.ecore.EClass;

import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RequestImpl extends MessageImpl implements Request {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.REQUEST;
	}

} //RequestImpl
