/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationProvider;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ChannelPoolException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.ChannelPoolImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.ChannelPoolImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.ChannelPoolImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.ChannelPoolImpl#getClient <em>Client</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.ChannelPoolImpl#isConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelPoolImpl extends EntityImpl implements ChannelPool {
	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected CommunicationProvider provider;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelPoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.CHANNEL_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, CommunicationPackage.CHANNEL_POOL__CHANNELS, CommunicationPackage.CHANNEL__POOL);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public CommunicationProvider getProvider() {
//		if (provider != null && provider.eIsProxy()) {
//			InternalEObject oldProvider = (InternalEObject)provider;
//			provider = (CommunicationProvider)eResolveProxy(oldProvider);
//			if (provider != oldProvider) {
//				if (eNotificationRequired())
//					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.CHANNEL_POOL__PROVIDER, oldProvider, provider));
//			}
//		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProvider basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setProvider(CommunicationProvider newProvider) {
//		CommunicationProvider oldProvider = provider;
		provider = newProvider;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.CHANNEL_POOL__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.CHANNEL_POOL__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Client getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (Client)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.CHANNEL_POOL__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(Client newClient, NotificationChain msgs) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.CHANNEL_POOL__CLIENT, oldClient, newClient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClient(Client newClient) {
		if (newClient != client) {
			NotificationChain msgs = null;
			if (client != null)
				msgs = ((InternalEObject)client).eInverseRemove(this, CommunicationPackage.CLIENT__POOLS, Client.class, msgs);
			if (newClient != null)
				msgs = ((InternalEObject)newClient).eInverseAdd(this, CommunicationPackage.CLIENT__POOLS, Client.class, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.CHANNEL_POOL__CLIENT, newClient, newClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void connect() throws ChannelPoolException {
		if (isConnected())
			return;
		
		try {
			getProvider().doConnect(this);			
			connected = true;
			getChannels().forEach(channel -> channel.open());
		} catch (Exception e) {
			throw new ChannelPoolException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void disconnect() throws ChannelPoolException {
		if (!isConnected())
			return;
		
		try {
			getChannels().forEach(channel -> channel.close());
			getProvider().doDisconnect(this);
			connected = false;
		} catch (Exception e) {
			throw new ChannelPoolException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Channel getChannel(String id) {
		if (!isConnected())
			return null;
		
		Iterator<Channel> it = getChannels().iterator();
		while (it.hasNext()) {
			Channel channel = it.next();
			if (channel.getId().equals(id))
				return channel;			
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Channel getChannelByName(String name) {
		if (!isConnected())
			return null;
		
		Iterator<Channel> it = getChannels().iterator();
		while (it.hasNext()) {
			Channel channel = it.next();
			if (channel.getName().equals(name))
				return channel;			
		}
		
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConnected() {
		return connected;
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
			case CommunicationPackage.CHANNEL_POOL__CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannels()).basicAdd(otherEnd, msgs);
			case CommunicationPackage.CHANNEL_POOL__CLIENT:
				if (client != null)
					msgs = ((InternalEObject)client).eInverseRemove(this, CommunicationPackage.CLIENT__POOLS, Client.class, msgs);
				return basicSetClient((Client)otherEnd, msgs);
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
			case CommunicationPackage.CHANNEL_POOL__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case CommunicationPackage.CHANNEL_POOL__CLIENT:
				return basicSetClient(null, msgs);
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
			case CommunicationPackage.CHANNEL_POOL__CHANNELS:
				return getChannels();
			case CommunicationPackage.CHANNEL_POOL__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case CommunicationPackage.CHANNEL_POOL__URI:
				return getUri();
			case CommunicationPackage.CHANNEL_POOL__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case CommunicationPackage.CHANNEL_POOL__CONNECTED:
				return isConnected();
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
			case CommunicationPackage.CHANNEL_POOL__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case CommunicationPackage.CHANNEL_POOL__PROVIDER:
				setProvider((CommunicationProvider)newValue);
				return;
			case CommunicationPackage.CHANNEL_POOL__URI:
				setUri((String)newValue);
				return;
			case CommunicationPackage.CHANNEL_POOL__CLIENT:
				setClient((Client)newValue);
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
			case CommunicationPackage.CHANNEL_POOL__CHANNELS:
				getChannels().clear();
				return;
			case CommunicationPackage.CHANNEL_POOL__PROVIDER:
				setProvider((CommunicationProvider)null);
				return;
			case CommunicationPackage.CHANNEL_POOL__URI:
				setUri(URI_EDEFAULT);
				return;
			case CommunicationPackage.CHANNEL_POOL__CLIENT:
				setClient((Client)null);
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
			case CommunicationPackage.CHANNEL_POOL__CHANNELS:
				return channels != null && !channels.isEmpty();
			case CommunicationPackage.CHANNEL_POOL__PROVIDER:
				return provider != null;
			case CommunicationPackage.CHANNEL_POOL__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case CommunicationPackage.CHANNEL_POOL__CLIENT:
				return client != null;
			case CommunicationPackage.CHANNEL_POOL__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
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
			case CommunicationPackage.CHANNEL_POOL___CONNECT:
				try {
					connect();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CHANNEL_POOL___DISCONNECT:
				try {
					disconnect();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.CHANNEL_POOL___GET_CHANNEL__STRING:
				return getChannel((String)arguments.get(0));
			case CommunicationPackage.CHANNEL_POOL___GET_CHANNEL_BY_NAME__STRING:
				return getChannelByName((String)arguments.get(0));
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(", connected: ");
		result.append(connected);
		result.append(')');
		return result.toString();
	}

} //ChannelPoolImpl
