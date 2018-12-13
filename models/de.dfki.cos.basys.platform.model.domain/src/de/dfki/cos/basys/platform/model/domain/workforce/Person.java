/**
 */
package de.dfki.cos.basys.platform.model.domain.workforce;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getBirthday <em>Birthday</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends Agent {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage#getPerson_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #setGivenName(String)
	 * @see de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage#getPerson_GivenName()
	 * @model
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see #setFamilyName(String)
	 * @see de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage#getPerson_FamilyName()
	 * @model
	 * @generated
	 */
	String getFamilyName();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' attribute.
	 * @see #getFamilyName()
	 * @generated
	 */
	void setFamilyName(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(String)
	 * @see de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage#getPerson_Gender()
	 * @model
	 * @generated
	 */
	String getGender();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(String value);

	/**
	 * Returns the value of the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthday</em>' attribute.
	 * @see #setBirthday(Date)
	 * @see de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage#getPerson_Birthday()
	 * @model
	 * @generated
	 */
	Date getBirthday();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getBirthday <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthday</em>' attribute.
	 * @see #getBirthday()
	 * @generated
	 */
	void setBirthday(Date value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage#getPerson_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.workforce.Person#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // Person
