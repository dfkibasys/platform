package de.dfki.cos.basys.platform.runtime.webapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletContext;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.common.component.manager.ComponentConfigurationProvider;

public class ServletComponentConfigurationProviderImpl implements ComponentConfigurationProvider, ServiceProvider<ComponentConfigurationProvider> {

	private boolean recursive = false;
	private Gson gson = new Gson();
	private ServletContext servletContext = null;
	private Set<String> resourcePaths = null;
	
	public ServletComponentConfigurationProviderImpl(Properties config, ServletContext servletContext) {
		this.servletContext = servletContext;
		if (config.containsKey("recursive")) {
			recursive = Boolean.parseBoolean(config.getProperty("recursive"));
		}
	}

	public void setRecursive(boolean recursive) {
		this.recursive = recursive;
	}
	
	public boolean isRecursive() {
		return recursive;
	}
	
	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		resourcePaths = new HashSet<>();
		try {
			doRetrieveMatchingServletContextResources(servletContext, connectionString, resourcePaths);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//resourcePaths = servletContext.getResourcePaths(connectionString);		
		return resourcePaths.size() > 0;
	}

	@Override
	public void disconnect() {
		this.resourcePaths = null;
	}

	@Override
	public boolean isConnected() {
		return resourcePaths != null;
	}

	@Override
	public ComponentConfigurationProvider getService() {
		return this;
	}

	
	@Override
	public List<String> getComponentConfigurationPaths() {
		List<String> result = new LinkedList<String>();
		resourcePaths.stream().filter(path -> path.endsWith(".properties") || path.endsWith(".json")).forEach(result::add);
		return result;
	}

	@Override
	public Properties getComponentConfigurationForPath(String path) {		
		try (InputStream input = servletContext.getResourceAsStream(path)) {
			if (path.endsWith(".properties")) {
				Properties config = new Properties();
				config.load(input);
				return config;
			} else if (path.endsWith(".json")) {
				InputStreamReader isreader = new InputStreamReader(input);
				JsonReader reader = new JsonReader(isreader);
				Properties config = gson.fromJson(reader, Properties.class);
				return config;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	protected void doRetrieveMatchingServletContextResources(
			ServletContext servletContext, String dir, Set<String> result)
			throws IOException {

		Set<String> candidates = servletContext.getResourcePaths(dir);
		if (candidates != null) {
		
			for (String currPath : candidates) {				
				if (currPath.endsWith("/") && recursive) {
					doRetrieveMatchingServletContextResources(servletContext, currPath, result);
				}
				
				if (currPath.endsWith(".properties") || currPath.endsWith(".json")) {
					result.add(currPath);
				}
				
			}
		}
	}

	
}
