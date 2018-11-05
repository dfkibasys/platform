/**
 */
package de.dfki.iui.basys.runtime.component.manager;

import java.io.File;
import java.util.List;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.Component;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ComponentManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated NOT
	 */
	List<Component> getLocalComponents();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	Component getLocalComponentById(String id);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	Component getLocalComponentByName(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions="de.dfki.iui.basys.model.runtime.component.ComponentManagerException"
	 * @generated
	 */
	Component createLocalComponent(ComponentConfiguration config) throws ComponentManagerException;
	Component createLocalComponent(File configFile) throws ComponentManagerException;
	void createLocalComponents(File configFolder, boolean recursive) throws ComponentManagerException;

	void addLocalComponent(Component component) throws ComponentManagerException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions="de.dfki.iui.basys.model.runtime.component.ComponentManagerException"
	 * @generated
	 */
	void deleteLocalComponent(String id) throws ComponentManagerException;
	
	

} // ComponentManager
