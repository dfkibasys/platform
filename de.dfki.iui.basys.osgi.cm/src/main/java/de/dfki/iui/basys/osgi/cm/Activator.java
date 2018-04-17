package de.dfki.iui.basys.osgi.cm;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

public class Activator implements BundleActivator {
	private static final String LOCPROPERTY = "basys.configuration.location";
	private ServiceTracker tracker;
	private WatchService watcher;
	private boolean isRunning = false;

	@Override
	public void start(final BundleContext context) throws Exception {
		isRunning = true;
		String dir = context.getProperty(LOCPROPERTY);
		if (dir == null)
			return;

		watcher = FileSystems.getDefault().newWatchService();
		Path path = FileSystems.getDefault().getPath(dir);

		final Map<String, PropertyFileHandler> persisters = new HashMap<String, PropertyFileHandler>();
		File file = path.toFile();
		if (!file.isDirectory()) {
			if (PropertyFileHandler.filter().accept(file)) {
				persisters.put(file.toString(), new PropertyFileHandler(file));
			}
		} else {
			for (File entry : file.listFiles()) {
				if (entry.isDirectory()) {
					continue;
				}
				if (PropertyFileHandler.filter().accept(entry)) {
					persisters.put(entry.getName().toString(), new PropertyFileHandler(entry));
				}
			}
		}
		path.register(watcher, StandardWatchEventKinds.ENTRY_MODIFY);

		// Do the tracking.
		tracker = new ServiceTracker(context, ConfigurationAdmin.class.getName(), new ServiceTrackerCustomizer() {
			@Override
			public void removedService(ServiceReference ref, Object admin) {
				context.ungetService(ref);
				update(null, persisters);
			}

			@Override
			public void modifiedService(ServiceReference ref, Object admin) {
			}

			@Override
			public Object addingService(ServiceReference ref) {
				Object obj = context.getService(ref);
				update((ConfigurationAdmin) obj, persisters);
				return obj;
			}
		});

		tracker.open();

		update((ConfigurationAdmin) tracker.getService(), persisters);

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				while (isRunning) {
					WatchKey key;
					try {
						key = watcher.take();
					} catch (InterruptedException x) {
						return;
					}
					for (WatchEvent<?> event : key.pollEvents()) {
						WatchEvent.Kind<?> kind = event.kind();
						if (kind == StandardWatchEventKinds.OVERFLOW) {
							continue;
						}

						// The filename is the context of the event.
						WatchEvent<Path> ev = (WatchEvent<Path>) event;
						Path filename = ev.context();
						PropertyFileHandler fileHandler = persisters.get(filename.toString());
						try {
							if (fileHandler != null) {
								fileHandler.checkConfiguration((ConfigurationAdmin) tracker.getService());
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					key.reset();
				}

			}
		});
		thread.start();

	}

	private void update(ConfigurationAdmin admin, Map<String, PropertyFileHandler> persisters) {
		try {
			for (PropertyFileHandler s : persisters.values()) {
				s.checkConfiguration(admin);
			}
		} catch (Exception exc) {
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		isRunning = false;
		tracker.close();
	}
}
