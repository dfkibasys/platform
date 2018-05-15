package de.dfki.iui.basys.runtime.component.manager.impl;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.eclipse.emf.common.util.URI;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl;
import de.dfki.iui.basys.runtime.component.BaseComponent;
import de.dfki.iui.basys.runtime.component.Component;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.manager.ComponentManager;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;

public class ComponentManagerImpl extends BaseComponent implements ComponentManager {

	private Map<String, Component> components = new HashMap<>();

	public ComponentManagerImpl(ComponentConfiguration config) {
		super(config);
		ComponentPackageImpl.init();
	}

	@Override
	public void connectToExternal() throws ComponentException {

		URI uri = URI.createURI(getConfig().getExternalConnectionString());
		if (uri.isFile()) {
			String fileString = uri.toFileString();

			File file = new File(fileString);
			try {
				if (file.isDirectory()) {
					createLocalComponents(file, true);
				} else {
					createLocalComponent(file);
				}
			} catch (ComponentManagerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void deactivate() throws ComponentException {
		for (Component c : components.values()) {
			c.deactivate();
		}
		super.deactivate();
	}

	@Override
	public List<Component> getLocalComponents() {
		return new ArrayList<Component>(components.values());
	}

	@Override
	public Component getLocalComponentById(String id) {
		return components.get(id);
	}

	@Override
	public Component getLocalComponentByName(String name) {
		for (Component component : components.values()) {
			if (component.getName().equals(name))
				return component;
		}
		return null;
	}

	@Override
	public void createLocalComponent(ComponentConfiguration config) throws ComponentManagerException {
		Class c = null;
		try {
			
			//ClassLoader cl1 = Thread.currentThread().getContextClassLoader();
			//c = cl1.loadClass(config.getComponentImplementationJavaClass());
			
			ClassLoader cl2 = getClass().getClassLoader();
			c = cl2.loadClass(config.getComponentImplementationJavaClass());
			
			//c = Class.forName(config.getComponentImplementationJavaClass());
		} catch (ClassNotFoundException e) {
			throw new ComponentManagerException(e);
		}

		Component component = null;

		try {
			Constructor<Component> constructor = c.getConstructor(ComponentConfiguration.class);
			component = constructor.newInstance(config);
			addLocalComponent(component);

		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			throw new ComponentManagerException(e);
		}
	}

	@Override
	public void addLocalComponent(Component component) throws ComponentManagerException {
		components.put(component.getId(), component);
		try {
			component.activate(context);
		} catch (ComponentException e) {
			throw new ComponentManagerException(e);
		}
	}

	@Override
	public void deleteLocalComponent(String id) throws ComponentManagerException {
		Component c = components.remove(id);
		if (c == null)
			throw new ComponentManagerException(String.format("No component registered with id %s", id));

		try {
			c.deactivate();
		} catch (ComponentException e) {
			throw new ComponentManagerException(e);
		}

	}

	@Override
	public void createLocalComponent(File configFile) throws ComponentManagerException {
		try {
			ComponentConfiguration config = JsonUtils.fromFile(configFile, ComponentConfiguration.class);
			createLocalComponent(config);
		} catch (IOException e) {
			throw new ComponentManagerException(e);
		}
	}

	@Override
	public void createLocalComponents(File configFolder, boolean recursive) throws ComponentManagerException {

		FileFilter filter = new SuffixFileFilter(".json");

		for (File entry : configFolder.listFiles(filter)) {
			createLocalComponent(entry);
		}
		if (recursive) {
			for (File entry : configFolder.listFiles(File::isDirectory)) {
				createLocalComponents(entry ,recursive);
			}		
		}
	}

}
