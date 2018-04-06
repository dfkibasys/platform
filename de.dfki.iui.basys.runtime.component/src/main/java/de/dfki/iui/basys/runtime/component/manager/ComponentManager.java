/**
 */
package de.dfki.iui.basys.runtime.component.manager;

import de.dfki.iui.basys.runtime.component.Component;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ComponentManager extends Component {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	List<Component> getLocalComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Component getLocalComponentById(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Component getLocalComponentByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.iui.basys.model.runtime.component.ComponentManagerException"
	 * @generated
	 */
	void createLocalComponent(ComponentConfiguration config) throws ComponentManagerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.iui.basys.model.runtime.component.ComponentManagerException"
	 * @generated
	 */
	void deleteLocalComponent(String id) throws ComponentManagerException;

} // ComponentManager
