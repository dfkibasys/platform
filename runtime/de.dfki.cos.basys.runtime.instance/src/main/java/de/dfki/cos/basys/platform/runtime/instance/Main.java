package de.dfki.cos.basys.platform.runtime.instance;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.basyx.aas.registration.api.IAASRegistryService;
import org.eclipse.basyx.aas.registration.proxy.AASRegistryProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.aas.services.ServletContainerComponent;
import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerImpl;
import de.dfki.cos.basys.common.component.registry.ComponentRegistry;
import de.dfki.cos.basys.platform.model.runtime.communication.Authentication;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.BasysComponentContext;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger("basys");

	private static BasysComponentContext context = BasysComponentContext.getStaticContext();
	
	private static Client communicationClient;
	private static ChannelPool channelPool;
	private static ComponentManagerImpl componentManager;

	private static Properties channelPoolConfig = new Properties();
	private static Properties componentRegistryConfig = new Properties();
	private static Properties componentManagerConfig = new Properties();
	private static Properties servletContainerConfig = new Properties(ServletContainerComponent.getDefaultConfig());

	private static String aasRegistryEndpoint = "http://localhost:4999";
	
	private static String configFolderPath = "config/";

	public static void main(String[] args) throws Exception {
		Options options = new Options();

		Option configFileOption = new Option("c", "config", true, "path to a config folder");
		configFileOption.setRequired(false);
		options.addOption(configFileOption);

		Option certsFolderOption = new Option("xf", "certsFolder", true, "folder containing server and client certificates");
		certsFolderOption.setRequired(false);
		options.addOption(certsFolderOption);

		Option componentsFolderOption = new Option("cf", "componentConfigFolder", true, "folder containing component configurations");
		componentsFolderOption.setRequired(false);
		options.addOption(componentsFolderOption);
		
		Option zkOption = new Option("zk", "zookeeper", true, "the Zookeeper connection string for the registry service, default 'localhost:2181'");
		zkOption.setRequired(false);		
		options.addOption(zkOption);
		
		Option aarRegistryOption = new Option("r", "aas-registry", true, "aas registry rest endpoint");
		aarRegistryOption.setRequired(false);
		options.addOption(aarRegistryOption);
		
		Option middlewareOption = new Option("cs", "connectionString", true, "connection string to connect to communication middleware");
		aarRegistryOption.setRequired(false);
		options.addOption(aarRegistryOption);

		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;

		try {
			cmd = parser.parse(options, args);
			if (cmd.hasOption("c")) {
				configFolderPath = cmd.getOptionValue("c");
			}

			Path channelPoolConfigPath = Paths.get(configFolderPath, "channel-pool.properties");
			if (channelPoolConfigPath.toFile().exists()) {
				channelPoolConfig.load(new FileInputStream(channelPoolConfigPath.toFile()));
				LOGGER.info("channel-pool.properties loaded: " + channelPoolConfigPath.toFile());
			} else {
				LOGGER.warn("channel-pool.properties not found in " + channelPoolConfigPath.toFile() + ". Using defaults.");
			}			
			
			Path componentRegistryConfigPath = Paths.get(configFolderPath, "component-registry.properties");
			if (componentRegistryConfigPath.toFile().exists()) {
				componentRegistryConfig.load(new FileInputStream(componentRegistryConfigPath.toFile()));
				LOGGER.info("component-registry.properties loaded: " + componentRegistryConfigPath.toFile());
			} else {
				LOGGER.warn("component-registry.properties not found in " + componentRegistryConfigPath.toFile() + ". Using defaults.");
			}			
			
			Path componentManagerConfigPath = Paths.get(configFolderPath, "component-manager.properties");		
			if (componentManagerConfigPath.toFile().exists()) {
				componentManagerConfig.load(new FileInputStream(componentManagerConfigPath.toFile()));
				LOGGER.info("component-manager.properties loaded: " + componentManagerConfigPath.toFile());
			} else {
				LOGGER.warn("component-manager.properties not found in " + componentManagerConfigPath.toFile() + ". Using defaults.");
			}
			
			Path servletContainerConfigPath = Paths.get(configFolderPath, "servlet-container.properties");
			if (servletContainerConfigPath.toFile().exists()) {
				servletContainerConfig.load(new FileInputStream(servletContainerConfigPath.toFile()));
				LOGGER.info("servlet-container.properties loaded: " + servletContainerConfigPath.toFile());
			} else {
				LOGGER.warn("servlet-container.properties not found in " + servletContainerConfigPath.toFile() + ". Using defaults.");
			}

			if (cmd.hasOption("cf")) {
				componentManagerConfig.setProperty(StringConstants.serviceConnectionString, cmd.getOptionValue("cf"));
			} else {
				componentManagerConfig.setProperty(StringConstants.serviceConnectionString, "components/");
			}
			
			if (cmd.hasOption("cs")) {
				channelPoolConfig.setProperty(StringConstants.serviceConnectionString, cmd.getOptionValue("cs"));	
			}
			
			if (cmd.hasOption("zk")) {
				componentRegistryConfig.setProperty(StringConstants.serviceConnectionString, cmd.getOptionValue("zk"));			
			}
			
			if (cmd.hasOption("r")) {
				aasRegistryEndpoint = cmd.getOptionValue("r");
			}
			
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("utility-name", options);

			System.exit(1);
		}
		
		// 0. create AAS registry client
		IAASRegistryService aasRegistry = new AASRegistryProxy(aasRegistryEndpoint);
		context.setAasRegistry(aasRegistry);
		
		ServletContainerComponent servletContainer = new ServletContainerComponent(servletContainerConfig);
		servletContainer.activate(context);	
		
		// 1. establish communication
		if (channelPoolConfig.containsKey("clientId")) {
			String clientId = channelPoolConfig.getProperty("clientId");
			if (channelPoolConfig.containsKey("username") && channelPoolConfig.containsKey("password")) {
				String username = channelPoolConfig.getProperty("username");
				String password = channelPoolConfig.getProperty("password");
				Authentication auth = CommFactory.getInstance().createAuthentication(username, password, null);
				communicationClient = CommFactory.getInstance().createClient(clientId, auth);
			} else {
				communicationClient = CommFactory.getInstance().createClient(clientId, null);
			}
		}

		if (channelPoolConfig.containsKey(StringConstants.serviceImplementationJavaClass) ) {
			String providerImplementationJavaClass = channelPoolConfig.getProperty(StringConstants.serviceImplementationJavaClass);			
			//if connectionString is null, defaultConnectionString will be used later
			String connectionString = channelPoolConfig.getProperty(StringConstants.serviceConnectionString);
			channelPool = CommFactory.getInstance().connectChannelPool(communicationClient, connectionString, providerImplementationJavaClass);
		}
		context.setSharedChannelPool(channelPool);
		
		// 2. create component manager	
		componentManager = new ComponentManagerImpl(componentManagerConfig);
		context.setComponentManager(componentManager);
		
		// 3. create component registry		
		Component componentRegistry = componentManager.createComponent(componentRegistryConfig);
		context.setComponentRegistry( (ComponentRegistry) componentRegistry);
		componentRegistry.activate(context);
		
		// 4. activate component manager
		componentManager.activate(context);
		
		if (servletContainer != null)
			componentManager.addComponent(servletContainer);
		
		// 5. define graceful shutdown		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				LOGGER.info("Shutdown BaSys platform instance");
				try {
					componentManager.deactivate();
					if (communicationClient != null) {
						communicationClient.disconnect();
						communicationClient = null;
						channelPool = null;
					}
				} catch (ComponentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}
