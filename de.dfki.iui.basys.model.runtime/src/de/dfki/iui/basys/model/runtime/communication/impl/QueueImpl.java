/**
 */
package de.dfki.iui.basys.model.runtime.communication.impl;

import de.dfki.iui.basys.model.runtime.communication.CommunicationPackage;
import de.dfki.iui.basys.model.runtime.communication.Queue;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QueueImpl extends ChannelImpl implements Queue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.QUEUE;
	}

} //QueueImpl
