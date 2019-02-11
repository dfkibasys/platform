package de.dfki.cos.basys.platform.runtime.component.manager.impl;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.eclipse.emf.common.util.URI;

import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl;
import de.dfki.cos.basys.platform.runtime.component.BaseComponent;
import de.dfki.cos.basys.platform.runtime.component.Component;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManager;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManagerException;

public class ComponentManagerImpl extends BaseComponent implements ComponentManager {

	private Map<String, Component> components = new HashMap<>();
	
	private ScheduledExecutorService scheduledExecutorService =  Executors.newScheduledThreadPool(1);
	
	public ComponentManagerImpl(ComponentConfiguration config) {
		super(config);
		ComponentPackageImpl.init();
	}

	@Override
	public void connectToExternal() throws ComponentException {

		Runnable r = new Runnable() {				
			@Override
			public void run() {
				URI uri = URI.createFileURI(getConfig().getExternalConnectionString());
				if (uri.isFile()) {
					String fileString = uri.toFileString();

					File file = new File(fileString);
					try {
						if (file.isDirectory()) {
							createLocalComponents(file, true);
						} else {
							createLocalComponent(file);
						}
					} 
					catch (ComponentManagerException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						throw new RuntimeException(e);
					}
				}
				LOGGER.info("connectToExternal complete");
				
			}
		};
		
		
		//scheduledExecutorService.schedule(r, 10, TimeUnit.SECONDS);
		
	
		
		
		CompletableFuture<Void> cf = CompletableFuture.runAsync(r, scheduledExecutorService).exceptionally(e-> {		    
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		    return null;
		});
		

		

	}

	@Override
	public void deactivate() throws ComponentException {
		for (Component c : components.values()) {
			c.deactivate();
		}
		try {
			if (!scheduledExecutorService.awaitTermination(5,TimeUnit.SECONDS)) {
				scheduledExecutorService.shutdownNow();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	public Component createLocalComponent(ComponentConfiguration config) throws ComponentManagerException {
		
		if (components.containsKey(config.getComponentId())) {
			Component old = components.get(config.getComponentId());
			LOGGER.error("Duplicate component with Id: " + config.getComponentId());
			LOGGER.error("Name of 1st component: " + old.getConfig().getComponentName());
			LOGGER.error("Name of 2nd component: " + config.getComponentName());
			throw new ComponentManagerException("Duplicate component with Id " + config.getComponentId());
		}
		
		Class c = null;
		try {
			
//			ClassLoader cl1 = Thread.currentThread().getContextClassLoader();
//			c = cl1.loadClass(config.getComponentImplementationJavaClass());
//			
//			ClassLoader cl2 = getClass().getClassLoader();
//			c = cl2.loadClass(config.getComponentImplementationJavaClass());
//			
//			c = componentCreationClassLoader.loadClass(config.getComponentImplementationJavaClass());
			
			c = Class.forName(config.getComponentImplementationJavaClass());
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
		return component;
	}

	@Override
	public void addLocalComponent(Component component) throws ComponentManagerException {	

		LOGGER.debug("addLocalComponent " + component.getName());
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
	public Component createLocalComponent(File configFile) throws ComponentManagerException {
		Component component = null;
		try {
			ComponentConfiguration config = JsonUtils.fromFile(configFile, ComponentConfiguration.class);
			component = createLocalComponent(config);
		} catch (IOException e) {
			throw new ComponentManagerException(e);
		}
		return component;
	}

	@Override
	public void createLocalComponents(File configFolder, boolean recursive) throws ComponentManagerException {

		FileFilter filter = new SuffixFileFilter(".json");

		for (File entry : configFolder.listFiles(filter)) {
			createLocalComponent(entry);
		}
		if (recursive) {
			File[] files = configFolder.listFiles(File::isDirectory);
			for (File entry : configFolder.listFiles(File::isDirectory)) {
				createLocalComponents(entry ,recursive);
			}		
		}
	}

}
