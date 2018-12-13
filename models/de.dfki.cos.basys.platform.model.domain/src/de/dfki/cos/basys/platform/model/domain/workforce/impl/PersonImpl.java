/**
 */
package de.dfki.cos.basys.platform.model.domain.workforce.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.cos.basys.platform.model.domain.workforce.Person;
import de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.impl.PersonImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.impl.PersonImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.impl.PersonImpl#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.impl.PersonImpl#getBirthday <em>Birthday</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.impl.PersonImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends AgentImpl implements Person {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected String givenName = GIVEN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected String familyName = FAMILY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final String GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected String gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTHDAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
	protected Date birthday = BIRTHDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkforcePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkforcePackage.PERSON__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGivenName(String newGivenName) {
		String oldGivenName = givenName;
		givenName = newGivenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkforcePackage.PERSON__GIVEN_NAME, oldGivenName, givenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamilyName(String newFamilyName) {
		String oldFamilyName = familyName;
		familyName = newFamilyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkforcePackage.PERSON__FAMILY_NAME, oldFamilyName, familyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(String newGender) {
		String oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkforcePackage.PERSON__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthday(Date newBirthday) {
		Date oldBirthday = birthday;
		birthday = newBirthday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkforcePackage.PERSON__BIRTHDAY, oldBirthday, birthday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkforcePackage.PERSON__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkforcePackage.PERSON__TITLE:
				return getTitle();
			case WorkforcePackage.PERSON__GIVEN_NAME:
				return getGivenName();
			case WorkforcePackage.PERSON__FAMILY_NAME:
				return getFamilyName();
			case WorkforcePackage.PERSON__GENDER:
				return getGender();
			case WorkforcePackage.PERSON__BIRTHDAY:
				return getBirthday();
			case WorkforcePackage.PERSON__LANGUAGE:
				return getLanguage();
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
			case WorkforcePackage.PERSON__TITLE:
				setTitle((String)newValue);
				return;
			case WorkforcePackage.PERSON__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case WorkforcePackage.PERSON__FAMILY_NAME:
				setFamilyName((String)newValue);
				return;
			case WorkforcePackage.PERSON__GENDER:
				setGender((String)newValue);
				return;
			case WorkforcePackage.PERSON__BIRTHDAY:
				setBirthday((Date)newValue);
				return;
			case WorkforcePackage.PERSON__LANGUAGE:
				setLanguage((String)newValue);
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
			case WorkforcePackage.PERSON__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WorkforcePackage.PERSON__GIVEN_NAME:
				setGivenName(GIVEN_NAME_EDEFAULT);
				return;
			case WorkforcePackage.PERSON__FAMILY_NAME:
				setFamilyName(FAMILY_NAME_EDEFAULT);
				return;
			case WorkforcePackage.PERSON__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case WorkforcePackage.PERSON__BIRTHDAY:
				setBirthday(BIRTHDAY_EDEFAULT);
				return;
			case WorkforcePackage.PERSON__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
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
			case WorkforcePackage.PERSON__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WorkforcePackage.PERSON__GIVEN_NAME:
				return GIVEN_NAME_EDEFAULT == null ? givenName != null : !GIVEN_NAME_EDEFAULT.equals(givenName);
			case WorkforcePackage.PERSON__FAMILY_NAME:
				return FAMILY_NAME_EDEFAULT == null ? familyName != null : !FAMILY_NAME_EDEFAULT.equals(familyName);
			case WorkforcePackage.PERSON__GENDER:
				return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
			case WorkforcePackage.PERSON__BIRTHDAY:
				return BIRTHDAY_EDEFAULT == null ? birthday != null : !BIRTHDAY_EDEFAULT.equals(birthday);
			case WorkforcePackage.PERSON__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", givenName: ");
		result.append(givenName);
		result.append(", familyName: ");
		result.append(familyName);
		result.append(", gender: ");
		result.append(gender);
		result.append(", birthday: ");
		result.append(birthday);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
