package de.dfki.cos.basys.platform.osgi.cm;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;

public class PropertyFileHandler {
	private static final String EXTENSION = ".properties";
	private final File file;
	private ConfigurationAdmin admin;
	private long lastRead;

	PropertyFileHandler(File file) {
		this.file = file;
	}

	static FileFilter filter() {
		FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(EXTENSION) && pathname.canRead() && pathname.canWrite();
			}
		};
		return filter;
	}

	private String getPid() {
		String name = file.getName();
		int index = name.indexOf(EXTENSION);
		name = name.substring(0, index);
		return name;
	}

	private synchronized Dictionary<String, Object> loadProperties() {
		Dictionary<String, Object> dict = new Hashtable<String, Object>();
		if (!file.exists())
			return dict;
		Properties props = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			Thread.sleep(100);
			props.load(in);
			for (Map.Entry<Object, Object> entry : props.entrySet()) {
				String key = entry.getKey().toString();
				String value = entry.getValue().toString();
				dict.put(key, value);

			}
		} catch (Exception exc) {
			System.err.println();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception exc) {
				}
			}
		}
		return dict;
	}

	private synchronized void update(ConfigurationAdmin admin) throws IOException {
		if (admin == null)
			return;
		// Load the properties.
		Dictionary<String, Object> properties = loadProperties();
		Configuration config;
		String factory = (String) properties.get(ConfigurationAdmin.SERVICE_FACTORYPID);
		if (factory != null) {
			config = admin.createFactoryConfiguration(factory, null);
		} else {
			config = admin.getConfiguration(getPid(), null);
		}
		config.update(properties);

	}

	public void checkConfiguration(ConfigurationAdmin admin) throws IOException {
		if (this.admin == admin && lastRead >= file.lastModified())
			return;
		update(admin);
		this.admin = admin;
		this.lastRead = System.currentTimeMillis();
	}
}
