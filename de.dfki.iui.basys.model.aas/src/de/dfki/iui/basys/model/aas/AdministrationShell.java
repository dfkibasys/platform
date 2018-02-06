/**
 */
package de.dfki.iui.basys.model.aas;

import de.dfki.iui.basys.model.base.Entity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administration Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.aas.AdministrationShell#getAssetId <em>Asset Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.aas.AdministrationShell#getMappings <em>Mappings</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.aas.AdministrationShell#getOperationalServiceMappings <em>Operational Service Mappings</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.aas.AasPackage#getAdministrationShell()
 * @model
 * @generated
 */
public interface AdministrationShell extends Entity {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.aas.InformationMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.aas.AasPackage#getAdministrationShell_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<InformationMapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Operational Service Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.aas.OperationalServiceMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Service Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Service Mappings</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.aas.AasPackage#getAdministrationShell_OperationalServiceMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationalServiceMapping> getOperationalServiceMappings();

	/**
	 * Returns the value of the '<em><b>Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Id</em>' attribute.
	 * @see #setAssetId(String)
	 * @see de.dfki.iui.basys.model.aas.AasPackage#getAdministrationShell_AssetId()
	 * @model
	 * @generated
	 */
	String getAssetId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.aas.AdministrationShell#getAssetId <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Id</em>' attribute.
	 * @see #getAssetId()
	 * @generated
	 */
	void setAssetId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Entity> T get();

} // AdministrationShell
