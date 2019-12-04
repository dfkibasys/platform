package de.dfki.cos.basys.platform.runtime.webapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerImpl;
import de.dfki.cos.basys.platform.model.runtime.communication.Authentication;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.BasysComponentContext;
import de.dfki.cos.basys.platform.runtime.component.registry.zookeeper.ZookeeperComponentRegistry;

public class PlatformServlet extends HttpServlet {

	private static final long serialVersionUID = -7909626257191251148L;
	private final Logger LOGGER;
	
	Client communicationClient;
	ChannelPool channelPool;
	ZookeeperComponentRegistry componentRegistry;
	ComponentManagerImpl componentManager;
	BasysComponentContext context;
	
	boolean debug = false;
	
	public PlatformServlet() {
		LOGGER = LoggerFactory.getLogger("basys.servlet");
	}

	@Override
	public void init() throws ServletException {
		LOGGER.info("Servlet " + this.getServletName() + " has started");		
		LOGGER.info("Servlet-ClassLoader: " + getServletContext().getClassLoader().toString());
		
		if (debug) return;
		
		try {						
			createChannelPool();
			createComponentRegistry();
			createComponentManager();
			
			context = BasysComponentContext.getStaticContext();
			context.setSharedChannelPool(channelPool);
			context.setComponentRegistry(componentRegistry);
			context.setComponentManager(componentManager);

			componentRegistry.activate(context);
			componentManager.activate(context);
			componentManager.addComponent(componentRegistry);			
			
		} catch (IOException | de.dfki.cos.basys.common.component.ComponentException | ComponentManagerException e) {
			//throw new ServletException(e);
			e.printStackTrace();
		}
		
	}

	@Override
	public void destroy() {

		if (debug) return;
		
		try {
			componentManager.deactivate();
			if (communicationClient != null) {
				communicationClient.disconnect();
				communicationClient = null;
				channelPool = null;
			}
		} catch (de.dfki.cos.basys.common.component.ComponentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		LOGGER.info("Servlet " + this.getServletName() + " has stopped");
	}
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		writer.println("Hello BaSys!");
		Set<String> paths = getServletContext().getResourcePaths("/WEB-INF/lib");
		for (String path : paths) {
			writer.println(path);
		}
		
		writer.flush();
	}

	private void createChannelPool() throws IOException {
		String fileName = getServletConfig().getInitParameter("channelPoolConfigFile");
		InputStream input = getServletContext().getResourceAsStream(fileName);
		Properties config = new Properties();		
		config.load(input);
		
		if (config.containsKey("clientId")) {
			String clientId = config.getProperty("clientId");
			if (config.containsKey("username") && config.containsKey("password")) {
				String username = config.getProperty("username");
				String password = config.getProperty("password");
				Authentication auth = CommFactory.getInstance().createAuthentication(username, password, null);
				communicationClient = CommFactory.getInstance().createClient(clientId, auth);
			} else {
				communicationClient = CommFactory.getInstance().createClient(clientId, null);
			}
		}

		if (config.containsKey(StringConstants.serviceImplementationJavaClass) ) {
			String providerImplementationJavaClass = config.getProperty(StringConstants.serviceImplementationJavaClass);			
			String connectionString = config.getProperty(StringConstants.serviceConnectionString);
			channelPool = CommFactory.getInstance().connectChannelPool(communicationClient, connectionString, providerImplementationJavaClass);
		}
	}
	
	private void createComponentRegistry() throws IOException {
		String fileName = getServletConfig().getInitParameter("componentRegistryConfigFile");
		InputStream input = getServletContext().getResourceAsStream(fileName);
		Properties config = new Properties();		
		config.load(input);
		
		componentRegistry = new ZookeeperComponentRegistry(config);		
	}
	
	private void createComponentManager() throws IOException {
		String fileName = getServletConfig().getInitParameter("componentManagerConfigFile");
		InputStream input = getServletContext().getResourceAsStream(fileName);
		Properties config = new Properties();		
		config.load(input);
		
		ServletComponentConfigurationProviderImpl configurationProvider = new ServletComponentConfigurationProviderImpl(config, getServletContext());		
		componentManager = new ComponentManagerImpl(config, configurationProvider);		
	}
}
