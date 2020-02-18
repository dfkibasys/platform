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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	
	boolean debug = false;

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

		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;

		try {
			cmd = parser.parse(options, args);
			if (cmd.hasOption("c")) {
				String configFolderPath = cmd.getOptionValue("c");
		
				Path channelPoolConfigPath = Paths.get(configFolderPath, "channel-pool.properties");
				channelPoolConfig.load(new FileInputStream(channelPoolConfigPath.toFile()));

				Path componentRegistryConfigPath = Paths.get(configFolderPath, "component-registry.properties");
				componentRegistryConfig.load(new FileInputStream(componentRegistryConfigPath.toFile()));

				Path componentManagerConfigPath = Paths.get(configFolderPath, "component-manager.properties");
				componentManagerConfig.load(new FileInputStream(componentManagerConfigPath.toFile()));							
			}			

			if (cmd.hasOption("cf")) {
				componentManagerConfig.setProperty("serviceConnectionString", cmd.getOptionValue("cf"));
			}

		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("utility-name", options);

			System.exit(1);
		}
		
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
