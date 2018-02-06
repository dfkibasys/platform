/**
 */
package de.dfki.iui.basys.model.service.impl;

import de.dfki.iui.basys.model.base.BObject;
import de.dfki.iui.basys.model.base.BasePackage;
import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.base.Metadata;

import de.dfki.iui.basys.model.service.Operation;
import de.dfki.iui.basys.model.service.Property;
import de.dfki.iui.basys.model.service.Publication;
import de.dfki.iui.basys.model.service.ServiceDescription;
import de.dfki.iui.basys.model.service.ServicePackage;
import de.dfki.iui.basys.model.service.ServiceTypeEnum;
import de.dfki.iui.basys.model.service.Subscription;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENamedElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionImpl#getPublications <em>Publications</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionImpl#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDescriptionImpl extends ENamedElementImpl implements ServiceDescription {
	/**
	 * The default value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected String binding = BINDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceTypeEnum SERVICE_TYPE_EDEFAULT = ServiceTypeEnum.DIGITAL_SERVICE;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected ServiceTypeEnum serviceType = SERVICE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getPublications() <em>Publications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublications()
	 * @generated
	 * @ordered
	 */
	protected EList<Publication> publications;

	/**
	 * The cached value of the '{@link #getSubscriptions() <em>Subscriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscription> subscriptions;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDescription> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ServiceDescriptionImpl() {
		super();
		setId(EcoreUtil.generateUUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(String newBinding) {
		String oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE_DESCRIPTION__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE_DESCRIPTION__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTypeEnum getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(ServiceTypeEnum newServiceType) {
		ServiceTypeEnum oldServiceType = serviceType;
		serviceType = newServiceType == null ? SERVICE_TYPE_EDEFAULT : newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ServicePackage.SERVICE_DESCRIPTION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, ServicePackage.SERVICE_DESCRIPTION__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publication> getPublications() {
		if (publications == null) {
			publications = new EObjectContainmentEList<Publication>(Publication.class, this, ServicePackage.SERVICE_DESCRIPTION__PUBLICATIONS);
		}
		return publications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subscription> getSubscriptions() {
		if (subscriptions == null) {
			subscriptions = new EObjectContainmentEList<Subscription>(Subscription.class, this, ServicePackage.SERVICE_DESCRIPTION__SUBSCRIPTIONS);
		}
		return subscriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDescription> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<ServiceDescription>(ServiceDescription.class, this, ServicePackage.SERVICE_DESCRIPTION__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SERVICE_DESCRIPTION__METADATA:
				return basicSetMetadata(null, msgs);
			case ServicePackage.SERVICE_DESCRIPTION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE_DESCRIPTION__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE_DESCRIPTION__PUBLICATIONS:
				return ((InternalEList<?>)getPublications()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE_DESCRIPTION__SUBSCRIPTIONS:
				return ((InternalEList<?>)getSubscriptions()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.SERVICE_DESCRIPTION__BINDING:
				return getBinding();
			case ServicePackage.SERVICE_DESCRIPTION__ID:
				return getId();
			case ServicePackage.SERVICE_DESCRIPTION__METADATA:
				return getMetadata();
			case ServicePackage.SERVICE_DESCRIPTION__VERSION:
				return getVersion();
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE:
				return getServiceType();
			case ServicePackage.SERVICE_DESCRIPTION__PROPERTIES:
				return getProperties();
			case ServicePackage.SERVICE_DESCRIPTION__OPERATIONS:
				return getOperations();
			case ServicePackage.SERVICE_DESCRIPTION__PUBLICATIONS:
				return getPublications();
			case ServicePackage.SERVICE_DESCRIPTION__SUBSCRIPTIONS:
				return getSubscriptions();
			case ServicePackage.SERVICE_DESCRIPTION__DEPENDENCIES:
				return getDependencies();
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
			case ServicePackage.SERVICE_DESCRIPTION__BINDING:
				setBinding((String)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__ID:
				setId((String)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__VERSION:
				setVersion((String)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE:
				setServiceType((ServiceTypeEnum)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__PUBLICATIONS:
				getPublications().clear();
				getPublications().addAll((Collection<? extends Publication>)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__SUBSCRIPTIONS:
				getSubscriptions().clear();
				getSubscriptions().addAll((Collection<? extends Subscription>)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends ServiceDescription>)newValue);
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
			case ServicePackage.SERVICE_DESCRIPTION__BINDING:
				setBinding(BINDING_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__ID:
				setId(ID_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__METADATA:
				setMetadata((Metadata)null);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE:
				setServiceType(SERVICE_TYPE_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__PROPERTIES:
				getProperties().clear();
				return;
			case ServicePackage.SERVICE_DESCRIPTION__OPERATIONS:
				getOperations().clear();
				return;
			case ServicePackage.SERVICE_DESCRIPTION__PUBLICATIONS:
				getPublications().clear();
				return;
			case ServicePackage.SERVICE_DESCRIPTION__SUBSCRIPTIONS:
				getSubscriptions().clear();
				return;
			case ServicePackage.SERVICE_DESCRIPTION__DEPENDENCIES:
				getDependencies().clear();
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
			case ServicePackage.SERVICE_DESCRIPTION__BINDING:
				return BINDING_EDEFAULT == null ? binding != null : !BINDING_EDEFAULT.equals(binding);
			case ServicePackage.SERVICE_DESCRIPTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ServicePackage.SERVICE_DESCRIPTION__METADATA:
				return metadata != null;
			case ServicePackage.SERVICE_DESCRIPTION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE:
				return serviceType != SERVICE_TYPE_EDEFAULT;
			case ServicePackage.SERVICE_DESCRIPTION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ServicePackage.SERVICE_DESCRIPTION__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ServicePackage.SERVICE_DESCRIPTION__PUBLICATIONS:
				return publications != null && !publications.isEmpty();
			case ServicePackage.SERVICE_DESCRIPTION__SUBSCRIPTIONS:
				return subscriptions != null && !subscriptions.isEmpty();
			case ServicePackage.SERVICE_DESCRIPTION__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BObject.class) {
			switch (derivedFeatureID) {
				case ServicePackage.SERVICE_DESCRIPTION__BINDING: return BasePackage.BOBJECT__BINDING;
				default: return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
				case ServicePackage.SERVICE_DESCRIPTION__ID: return BasePackage.ENTITY__ID;
				case ServicePackage.SERVICE_DESCRIPTION__METADATA: return BasePackage.ENTITY__METADATA;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BObject.class) {
			switch (baseFeatureID) {
				case BasePackage.BOBJECT__BINDING: return ServicePackage.SERVICE_DESCRIPTION__BINDING;
				default: return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
				case BasePackage.ENTITY__ID: return ServicePackage.SERVICE_DESCRIPTION__ID;
				case BasePackage.ENTITY__METADATA: return ServicePackage.SERVICE_DESCRIPTION__METADATA;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (binding: ");
		result.append(binding);
		result.append(", id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(", serviceType: ");
		result.append(serviceType);
		result.append(')');
		return result.toString();
	}

} //ServiceDescriptionImpl
