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

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.BaseComponent;
import de.dfki.iui.basys.runtime.component.Component;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.manager.ComponentManager;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;

public class ComponentManagerImpl extends BaseComponent implements ComponentManager {

	private Map<String, Component> components = new HashMap<>();

	public ComponentManagerImpl(ComponentConfiguration config) {
		super(config);
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
			c = Class.forName(config.getComponentImplementationJavaClass());
		} catch (ClassNotFoundException e) {
			throw new ComponentManagerException(e);
		}

		Component component = null;

		try {
			Constructor<Component> constructor = c.getConstructor(ComponentConfiguration.class);
			component = constructor.newInstance(config);
			addLocalComponent(component);

		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
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

		FileFilter filter = new SuffixFileFilter("json");
		
		for (File entry : configFolder.listFiles(filter)) {
			if (entry.isDirectory() && recursive) {
				createLocalComponents(entry, recursive);
			} else {
				createLocalComponent(entry);
			}
		}
	}

}
