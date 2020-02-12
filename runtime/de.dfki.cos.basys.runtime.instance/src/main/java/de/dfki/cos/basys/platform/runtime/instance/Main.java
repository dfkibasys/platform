package de.dfki.cos.basys.platform.runtime.instance;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

	private static Client communicationClient;
	private static ChannelPool channelPool;
	private static ComponentManagerImpl componentManager;
	private static BasysComponentContext context;

	boolean debug = false;

	public static void main(String[] args) throws Exception {

		Options options = new Options();

		Option configFileOption = new Option("c", "config", true, "path to a config.properties file");
		configFileOption.setRequired(false);
		options.addOption(configFileOption);

		Option certsFolderOption = new Option("x", "certsFolder", true,
				"folder containing server and client certificates");
		certsFolderOption.setRequired(false);
		options.addOption(certsFolderOption);

		Option componentsFolderOption = new Option("cf", "componentConfigFolder", true,
				"folder containing component configurations");
		componentsFolderOption.setRequired(false);
		options.addOption(componentsFolderOption);

		Option recursiveOption = new Option("r", "recursive", false, "scan folder recursively");
		recursiveOption.setRequired(false);
		options.addOption(recursiveOption);

		Option watchFolderOption = new Option("w", "watchFolder", false, "watch folder for new and deleted files");
		watchFolderOption.setRequired(false);
		options.addOption(watchFolderOption);

		Option asyncOption = new Option("a", "async", false, "create components asynchronously");
		asyncOption.setRequired(false);
		options.addOption(asyncOption);
//
//		Option tpcPortOption = new Option("tcp", "tpcPort", true, "the server's TCP port");
//		tpcPortOption.setRequired(false);
//		options.addOption(tpcPortOption);
//
//		Option httpsPortOption = new Option("https", "httpsPort", true, "the server's HTTPS port");
//		httpsPortOption.setRequired(false);
//		options.addOption(httpsPortOption);

		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;

		Properties config = new Properties(getDefaultConfig());

		try {
			cmd = parser.parse(options, args);
			if (cmd.hasOption("c")) {
				File configFile = new File(cmd.getOptionValue("c"));
				config.load(new FileInputStream(configFile));
			}

			if (cmd.hasOption("cf")) {
				config.setProperty("componentConfigFolder", cmd.getOptionValue("cf"));
			}
			if (cmd.hasOption("r")) {
				config.setProperty("recursive", cmd.getOptionValue("r"));
			}
			if (cmd.hasOption("w")) {
				config.setProperty("watchFolder", cmd.getOptionValue("w"));
			}
			if (cmd.hasOption("a")) {
				config.setProperty("async", cmd.getOptionValue("a"));
			}

		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("utility-name", options);

			System.exit(1);
		}


		// 1. create context

		context = BasysComponentContext.getStaticContext();
		
		// 2. establish communication
		
		Properties channelPoolConfig = new Properties();
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
			String connectionString = channelPoolConfig.getProperty(StringConstants.serviceConnectionString);
			channelPool = CommFactory.getInstance().connectChannelPool(communicationClient, connectionString, providerImplementationJavaClass);
		}
		context.setSharedChannelPool(channelPool);
		
		// 3. create component manager		
		
		Properties componentManagerConfig = new Properties(config);
		componentManagerConfig.put(StringConstants.id, "component-manager");
		componentManagerConfig.put(StringConstants.name, "component-manager");
		componentManagerConfig.put(StringConstants.serviceConnectionString,	config.getProperty("componentConfigFolder"));
		componentManagerConfig.put("recursive", config.getProperty("recursive"));
		componentManagerConfig.put("watchFolder", config.getProperty("watchFolder"));
		componentManagerConfig.put("async", config.getProperty("async"));
		
		componentManager = new ComponentManagerImpl(componentManagerConfig);
		context.setComponentManager(componentManager);
		
		// 4. create component registry		
		
		Properties componentRegistryConfig = new Properties(config);

		Component componentRegistry = componentManager.createComponent(componentRegistryConfig);
		context.setComponentRegistry( (ComponentRegistry) componentRegistry);
		componentRegistry.activate(context);
		
		// 5. activate component manager

		componentManager.activate(ComponentContext.getStaticContext());
		
		// 6. define graceful shutdown
		
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
	
    public static Properties getDefaultConfig() {
    	Properties defaultConfig = new Properties();
        defaultConfig.setProperty("componentConfigFolder", "src/test/resources/components");
        defaultConfig.setProperty("recursive", "false");
        defaultConfig.setProperty("watchFolder", "true");
        defaultConfig.setProperty("async", "false");
    	return defaultConfig;
    }
}
