package de.dfki.cos.basys.platform.runtime.webapp;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletContext;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.eclipse.emf.common.util.URI;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ServiceConnection;
import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.manager.ComponentConfigurationProvider;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;

public class ServletComponentConfigurationProviderImpl implements ComponentConfigurationProvider, ServiceConnection {

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
		resourcePaths = servletContext.getResourcePaths(connectionString);
		return resourcePaths != null;
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
	public List<String> getComponentConfigurationPaths() {
		List<String> result = new LinkedList<String>();
		resourcePaths.stream().filter(path -> path.endsWith(".properties") || path.endsWith(".json")).forEach(result::add);
		return result;
	}

	@Override
	public Properties getComponentConfiguration(String path) {
		try {
			if (path.endsWith(".properties")) {
				InputStream input = servletContext.getResourceAsStream(path);
				Properties config = new Properties();		
				config.load(input);
				return config;
			} else if (path.endsWith(".json")) {
				JsonReader reader = new JsonReader(new FileReader(path));
				Properties config = gson.fromJson(reader, Properties.class);
				return config;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
