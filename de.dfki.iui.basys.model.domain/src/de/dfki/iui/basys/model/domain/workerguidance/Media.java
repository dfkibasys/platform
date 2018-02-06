/**
 */
package de.dfki.iui.basys.model.domain.workerguidance;

import de.dfki.iui.basys.model.base.Entity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abgleich mit Standardmodellierungen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getFileSize <em>File Size</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getLocation <em>Location</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getEntityIds <em>Entity Ids</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getTags <em>Tags</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getLocale <em>Locale</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getMedia()
 * @model
 * @generated
 */
public interface Media extends Entity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MimeTypeEnum?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getMedia_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einheit?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Size</em>' attribute.
	 * @see #setFileSize(int)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getMedia_FileSize()
	 * @model
	 * @generated
	 */
	int getFileSize();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getFileSize <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size</em>' attribute.
	 * @see #getFileSize()
	 * @generated
	 */
	void setFileSize(int value);

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * macht nur Sinn, wenn Media-Instanz auf genau eine physische Datei zeigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Checksum</em>' attribute.
	 * @see #setChecksum(String)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getMedia_Checksum()
	 * @model
	 * @generated
	 */
	String getChecksum();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getChecksum <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum</em>' attribute.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getMedia_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestimmt, auf welche Art Entity sich der Content bezieht: Resource, Material, Instruction, ..., ggf. über entityIds regeln
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity Type</em>' attribute.
	 * @see #setEntityType(String)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getMedia_EntityType()
	 * @model
	 * @generated
	 */
	String getEntityType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getEntityType <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' attribute.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(String value);

	/**
	 * Returns the value of the '<em><b>Entity Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestimmt, auf welchen Typ sich der Content bezieht, z.B. Ressource vom Typ Nexo Schrauber, ggf. Attributnamen anpassen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity Ids</em>' attribute list.
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getMedia_EntityIds()
	 * @model
	 * @generated
	 */
	EList<String> getEntityIds();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * evtl. braucht man noch zusätzliche Informationen, um den Inhalt näher zu charakterisieren und einen Mechanismus zur Präsentationsplanung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getMedia_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(String)
	 * @see de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage#getMedia_Locale()
	 * @model
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.workerguidance.Media#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

} // Media
