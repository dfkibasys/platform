/**
 */
package de.dfki.iui.basys.model.runtime.communication.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.CommunicationPackage;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.communication.ResponseCallback;

import de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.impl.ChannelImpl#getListener <em>Listener</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.impl.ChannelImpl#getPool <em>Pool</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.impl.ChannelImpl#isOpen <em>Open</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.impl.ChannelImpl#isQueued <em>Queued</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends EntityImpl implements Channel {
	/**
	 * The cached value of the '{@link #getListener() <em>Listener</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListener()
	 * @generated
	 * @ordered
	 */
	protected ChannelListener listener;

	/**
	 * The cached value of the '{@link #getPool() <em>Pool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected ChannelPool pool;

	/**
	 * The default value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean open = OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isQueued() <em>Queued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQueued()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUEUED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQueued() <em>Queued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQueued()
	 * @generated
	 * @ordered
	 */
	protected boolean queued = QUEUED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ChannelListener getListener() {
//		if (listener != null && listener.eIsProxy()) {
//			InternalEObject oldListener = (InternalEObject)listener;
//			listener = (ChannelListener)eResolveProxy(oldListener);
//			if (listener != oldListener) {
//				if (eNotificationRequired())
//					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.CHANNEL__LISTENER, oldListener, listener));
//			}
//		}
		return listener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelListener basicGetListener() {
		return listener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setListener(ChannelListener newListener) {
//		ChannelListener oldListener = listener;
		listener = newListener;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.CHANNEL__LISTENER, oldListener, listener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelPool getPool() {
		if (pool != null && pool.eIsProxy()) {
			InternalEObject oldPool = (InternalEObject)pool;
			pool = (ChannelPool)eResolveProxy(oldPool);
			if (pool != oldPool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.CHANNEL__POOL, oldPool, pool));
			}
		}
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelPool basicGetPool() {
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPool(ChannelPool newPool, NotificationChain msgs) {
		ChannelPool oldPool = pool;
		pool = newPool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.CHANNEL__POOL, oldPool, newPool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPool(ChannelPool newPool) {
		if (newPool != pool) {
			NotificationChain msgs = null;
			if (pool != null)
				msgs = ((InternalEObject)pool).eInverseRemove(this, CommunicationPackage.CHANNEL_POOL__CHANNELS, ChannelPool.class, msgs);
			if (newPool != null)
				msgs = ((InternalEObject)newPool).eInverseAdd(this, CommunicationPackage.CHANNEL_POOL__CHANNELS, ChannelPool.class, msgs);
			msgs = basicSetPool(newPool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.CHANNEL__POOL, newPool, newPool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void open() throws ChannelException {
		if (!getPool().isConnected())
			throw new ChannelException("ChannelPool not connected");
		
		if (isOpen())
			return;
		
		try {
			getPool().getProvider().doOpenChannel(this);			
			open = true;
		} catch (Exception e) {
			throw new ChannelException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void close() throws ChannelException {
		if (!isOpen())
			return;
		
		try {
			getPool().getProvider().doCloseChannel(this);			
			open = false;
		} catch (Exception e) {
			throw new ChannelException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpen() {
		return open;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQueued() {
		return queued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueued(boolean newQueued) {
		boolean oldQueued = queued;
		queued = newQueued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.CHANNEL__QUEUED, oldQueued, queued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void sendMessage(String msg) throws ChannelException {
		if (!isOpen())
			throw new ChannelException("Channel not open");
		
		try {
			getPool().getProvider().doSendMessage(this, msg);		
		} catch (Exception e) {
			throw new ChannelException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void sendNotification(de.dfki.iui.basys.model.runtime.communication.Notification not) throws ChannelException {
		if (!isOpen())
			throw new ChannelException("Channel not open");
		
		try {
			getPool().getProvider().doSendNotification(this, not);			
		} catch (Exception e) {
			throw new ChannelException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Response sendRequest(Request req) throws ChannelException {
		if (!isOpen())
			throw new ChannelException("Channel not open");
		
		try {
			return getPool().getProvider().doSendRequest(this, req);			
		} catch (Exception e) {
			throw new ChannelException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void sendRequest(Request req, ResponseCallback cb) throws ChannelException {
		if (!isOpen())
			throw new ChannelException("Channel not open");
		
		try {
			getPool().getProvider().doSendRequest(this, req, cb);			
		} catch (Exception e) {
			throw new ChannelException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.CHANNEL__POOL:
				if (pool != null)
					msgs = ((InternalEObject)pool).eInverseRemove(this, CommunicationPackage.CHANNEL_POOL__CHANNELS, ChannelPool.class, msgs);
				return basicSetPool((ChannelPool)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.CHANNEL__POOL:
				return basicSetPool(null, msgs);
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
			case CommunicationPackage.CHANNEL__LISTENER:
				if (resolve) return getListener();
				return basicGetListener();
			case CommunicationPackage.CHANNEL__POOL:
				if (resolve) return getPool();
				return basicGetPool();
			case CommunicationPackage.CHANNEL__OPEN:
				return isOpen();
			case CommunicationPackage.CHANNEL__QUEUED:
				return isQueued();
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
			case CommunicationPackage.CHANNEL__LISTENER:
				setListener((ChannelListener)newValue);
				return;
			case CommunicationPackage.CHANNEL__POOL:
				setPool((ChannelPool)newValue);
				return;
			case CommunicationPackage.CHANNEL__QUEUED:
				setQueued((Boolean)newValue);
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
			case CommunicationPackage.CHANNEL__LISTENER:
				setListener((ChannelListener)null);
				return;
			case CommunicationPackage.CHANNEL__POOL:
				setPool((ChannelPool)null);
				return;
			case CommunicationPackage.CHANNEL__QUEUED:
				setQueued(QUEUED_EDEFAULT);
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
			case CommunicationPackage.CHANNEL__LISTENER:
				return listener != null;
			case CommunicationPackage.CHANNEL__POOL:
				return pool != null;
			case CommunicationPackage.CHANNEL__OPEN:
				return open != OPEN_EDEFAULT;
			case CommunicationPackage.CHANNEL__QUEUED:
				return queued != QUEUED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CommunicationPackage.CHANNEL___OPEN:
				try {
					open();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CHANNEL___CLOSE:
				try {
					close();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CHANNEL___SEND_MESSAGE__STRING:
				try {
					sendMessage((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CHANNEL___SEND_NOTIFICATION__NOTIFICATION:
				try {
					sendNotification((de.dfki.iui.basys.model.runtime.communication.Notification)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CHANNEL___SEND_REQUEST__REQUEST:
				try {
					return sendRequest((Request)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CHANNEL___SEND_REQUEST__REQUEST_RESPONSECALLBACK:
				try {
					sendRequest((Request)arguments.get(0), (ResponseCallback)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (open: ");
		result.append(open);
		result.append(", queued: ");
		result.append(queued);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
