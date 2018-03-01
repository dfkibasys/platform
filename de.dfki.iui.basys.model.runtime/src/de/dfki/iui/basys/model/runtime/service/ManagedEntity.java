/**
 */
package de.dfki.iui.basys.model.runtime.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Managed Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.service.ManagedEntity#getSupportedOperations <em>Supported Operations</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.runtime.service.ServicePackage#getManagedEntity()
 * @model
 * @generated
 */
public interface ManagedEntity extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>Supported Operations</b></em>' attribute list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.runtime.service.EntityOperationEnum}.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.runtime.service.EntityOperationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Operations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Operations</em>' attribute list.
	 * @see de.dfki.iui.basys.model.runtime.service.EntityOperationEnum
	 * @see de.dfki.iui.basys.model.runtime.service.ServicePackage#getManagedEntity_SupportedOperations()
	 * @model
	 * @generated
	 */
	EList<EntityOperationEnum> getSupportedOperations();

} // ManagedEntity
