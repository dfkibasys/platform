/**
 */
package de.dfki.iui.basys.model.domain.workerguidance.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.domain.workerguidance.Media;
import de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.MediaImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.MediaImpl#getFileSize <em>File Size</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.MediaImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.MediaImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.MediaImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.MediaImpl#getEntityIds <em>Entity Ids</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.MediaImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.impl.MediaImpl#getLocale <em>Locale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediaImpl extends IdentifiableEntityImpl implements Media {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FILE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected int fileSize = FILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKSUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected String checksum = CHECKSUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityType() <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected String entityType = ENTITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntityIds() <em>Entity Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entityIds;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected String locale = LOCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkerguidancePackage.Literals.MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkerguidancePackage.MEDIA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFileSize() {
		return fileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSize(int newFileSize) {
		int oldFileSize = fileSize;
		fileSize = newFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkerguidancePackage.MEDIA__FILE_SIZE, oldFileSize, fileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChecksum() {
		return checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecksum(String newChecksum) {
		String oldChecksum = checksum;
		checksum = newChecksum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkerguidancePackage.MEDIA__CHECKSUM, oldChecksum, checksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkerguidancePackage.MEDIA__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityType(String newEntityType) {
		String oldEntityType = entityType;
		entityType = newEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkerguidancePackage.MEDIA__ENTITY_TYPE, oldEntityType, entityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEntityIds() {
		if (entityIds == null) {
			entityIds = new EDataTypeUniqueEList<String>(String.class, this, WorkerguidancePackage.MEDIA__ENTITY_IDS);
		}
		return entityIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, WorkerguidancePackage.MEDIA__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocale(String newLocale) {
		String oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkerguidancePackage.MEDIA__LOCALE, oldLocale, locale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkerguidancePackage.MEDIA__TYPE:
				return getType();
			case WorkerguidancePackage.MEDIA__FILE_SIZE:
				return getFileSize();
			case WorkerguidancePackage.MEDIA__CHECKSUM:
				return getChecksum();
			case WorkerguidancePackage.MEDIA__LOCATION:
				return getLocation();
			case WorkerguidancePackage.MEDIA__ENTITY_TYPE:
				return getEntityType();
			case WorkerguidancePackage.MEDIA__ENTITY_IDS:
				return getEntityIds();
			case WorkerguidancePackage.MEDIA__TAGS:
				return getTags();
			case WorkerguidancePackage.MEDIA__LOCALE:
				return getLocale();
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
			case WorkerguidancePackage.MEDIA__TYPE:
				setType((String)newValue);
				return;
			case WorkerguidancePackage.MEDIA__FILE_SIZE:
				setFileSize((Integer)newValue);
				return;
			case WorkerguidancePackage.MEDIA__CHECKSUM:
				setChecksum((String)newValue);
				return;
			case WorkerguidancePackage.MEDIA__LOCATION:
				setLocation((String)newValue);
				return;
			case WorkerguidancePackage.MEDIA__ENTITY_TYPE:
				setEntityType((String)newValue);
				return;
			case WorkerguidancePackage.MEDIA__ENTITY_IDS:
				getEntityIds().clear();
				getEntityIds().addAll((Collection<? extends String>)newValue);
				return;
			case WorkerguidancePackage.MEDIA__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case WorkerguidancePackage.MEDIA__LOCALE:
				setLocale((String)newValue);
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
			case WorkerguidancePackage.MEDIA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WorkerguidancePackage.MEDIA__FILE_SIZE:
				setFileSize(FILE_SIZE_EDEFAULT);
				return;
			case WorkerguidancePackage.MEDIA__CHECKSUM:
				setChecksum(CHECKSUM_EDEFAULT);
				return;
			case WorkerguidancePackage.MEDIA__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case WorkerguidancePackage.MEDIA__ENTITY_TYPE:
				setEntityType(ENTITY_TYPE_EDEFAULT);
				return;
			case WorkerguidancePackage.MEDIA__ENTITY_IDS:
				getEntityIds().clear();
				return;
			case WorkerguidancePackage.MEDIA__TAGS:
				getTags().clear();
				return;
			case WorkerguidancePackage.MEDIA__LOCALE:
				setLocale(LOCALE_EDEFAULT);
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
			case WorkerguidancePackage.MEDIA__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case WorkerguidancePackage.MEDIA__FILE_SIZE:
				return fileSize != FILE_SIZE_EDEFAULT;
			case WorkerguidancePackage.MEDIA__CHECKSUM:
				return CHECKSUM_EDEFAULT == null ? checksum != null : !CHECKSUM_EDEFAULT.equals(checksum);
			case WorkerguidancePackage.MEDIA__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case WorkerguidancePackage.MEDIA__ENTITY_TYPE:
				return ENTITY_TYPE_EDEFAULT == null ? entityType != null : !ENTITY_TYPE_EDEFAULT.equals(entityType);
			case WorkerguidancePackage.MEDIA__ENTITY_IDS:
				return entityIds != null && !entityIds.isEmpty();
			case WorkerguidancePackage.MEDIA__TAGS:
				return tags != null && !tags.isEmpty();
			case WorkerguidancePackage.MEDIA__LOCALE:
				return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
		}
		return super.eIsSet(featureID);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", fileSize: ");
		result.append(fileSize);
		result.append(", checksum: ");
		result.append(checksum);
		result.append(", location: ");
		result.append(location);
		result.append(", entityType: ");
		result.append(entityType);
		result.append(", entityIds: ");
		result.append(entityIds);
		result.append(", tags: ");
		result.append(tags);
		result.append(", locale: ");
		result.append(locale);
		result.append(')');
		return result.toString();
	}

} //MediaImpl
