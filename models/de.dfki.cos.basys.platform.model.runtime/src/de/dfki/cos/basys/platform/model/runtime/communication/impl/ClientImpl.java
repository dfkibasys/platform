/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication.impl;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.runtime.communication.Authentication;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.communication.ResponseCallback;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ClientException;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.ClientImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.ClientImpl#getPools <em>Pools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends EntityImpl implements Client {
	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected Authentication authentication;

	/**
	 * The cached value of the '{@link #getPools() <em>Pools</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPools()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelPool> pools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelPool> getPools() {
		if (pools == null) {
			pools = new EObjectWithInverseResolvingEList<ChannelPool>(ChannelPool.class, this, CommunicationPackage.CLIENT__POOLS, CommunicationPackage.CHANNEL_POOL__CLIENT);
		}
		return pools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication getAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthentication(Authentication newAuthentication, NotificationChain msgs) {
		Authentication oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, CommunicationPackage.CLIENT__AUTHENTICATION, oldAuthentication, newAuthentication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(Authentication newAuthentication) {
		if (newAuthentication != authentication) {
			NotificationChain msgs = null;
			if (authentication != null)
				msgs = ((InternalEObject)authentication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.CLIENT__AUTHENTICATION, null, msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.CLIENT__AUTHENTICATION, null, msgs);
			msgs = basicSetAuthentication(newAuthentication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, CommunicationPackage.CLIENT__AUTHENTICATION, newAuthentication, newAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void connect() throws ClientException {
		try {
			getPools().forEach(pool -> pool.connect());
		} catch (Exception e) {
			throw new ClientException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void disconnect() throws ClientException {
		try {
			getPools().forEach(pool -> pool.disconnect());
		} catch (Exception e) {
			throw new ClientException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isConnected() {
		Iterator<ChannelPool> it = getPools().iterator();
		while (it.hasNext()) {
			ChannelPool pool = (ChannelPool) it.next();			
			if (!pool.isConnected())
				return false;			
		}		
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Channel getChannel(String id) {			
		Iterator<ChannelPool> it = getPools().iterator();
		while (it.hasNext()) {
			ChannelPool pool = (ChannelPool) it.next();
			Channel channel = pool.getChannel(id);
			if (channel != null)
				return channel;			
		}		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void sendMessage(String channelId, String msg) throws ClientException {
		try {
			getChannel(channelId).sendMessage(msg);
		} catch (Exception e) {
			throw new ClientException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void sendRequest(String channelId, Request req, ResponseCallback cb) throws ClientException {
		try {
			getChannel(channelId).sendRequest(req,cb);
		} catch (Exception e) {
			throw new ClientException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Response sendRequest(String channelId, Request req) throws ClientException {
		try {
			return getChannel(channelId).sendRequest(req);
		} catch (Exception e) {
			throw new ClientException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void sendNotification(String channelId, Notification not) throws ClientException {
		try {
			getChannel(channelId).sendNotification(not);
		} catch (Exception e) {
			throw new ClientException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ChannelPool getPool(String id) {
		Iterator<ChannelPool> it = getPools().iterator();
		while (it.hasNext()) {
			ChannelPool pool = (ChannelPool) it.next();			
			if (pool.getId().equals(id))
				return pool;			
		}		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.CLIENT__POOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPools()).basicAdd(otherEnd, msgs);
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
			case CommunicationPackage.CLIENT__AUTHENTICATION:
				return basicSetAuthentication(null, msgs);
			case CommunicationPackage.CLIENT__POOLS:
				return ((InternalEList<?>)getPools()).basicRemove(otherEnd, msgs);
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
			case CommunicationPackage.CLIENT__AUTHENTICATION:
				return getAuthentication();
			case CommunicationPackage.CLIENT__POOLS:
				return getPools();
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
			case CommunicationPackage.CLIENT__AUTHENTICATION:
				setAuthentication((Authentication)newValue);
				return;
			case CommunicationPackage.CLIENT__POOLS:
				getPools().clear();
				getPools().addAll((Collection<? extends ChannelPool>)newValue);
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
			case CommunicationPackage.CLIENT__AUTHENTICATION:
				setAuthentication((Authentication)null);
				return;
			case CommunicationPackage.CLIENT__POOLS:
				getPools().clear();
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
			case CommunicationPackage.CLIENT__AUTHENTICATION:
				return authentication != null;
			case CommunicationPackage.CLIENT__POOLS:
				return pools != null && !pools.isEmpty();
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
			case CommunicationPackage.CLIENT___CONNECT:
				try {
					connect();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CLIENT___DISCONNECT:
				try {
					disconnect();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CLIENT___IS_CONNECTED:
				return isConnected();
			case CommunicationPackage.CLIENT___GET_CHANNEL__STRING:
				return getChannel((String)arguments.get(0));
			case CommunicationPackage.CLIENT___SEND_MESSAGE__STRING_STRING:
				try {
					sendMessage((String)arguments.get(0), (String)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CLIENT___SEND_REQUEST__STRING_REQUEST_RESPONSECALLBACK:
				try {
					sendRequest((String)arguments.get(0), (Request)arguments.get(1), (ResponseCallback)arguments.get(2));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CLIENT___SEND_REQUEST__STRING_REQUEST:
				try {
					return sendRequest((String)arguments.get(0), (Request)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CLIENT___SEND_NOTIFICATION__STRING_NOTIFICATION:
				try {
					sendNotification((String)arguments.get(0), (Notification)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CLIENT___GET_POOL__STRING:
				return getPool((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClientImpl
