package de.dfki.cos.basys.platform.runtime.processcontrol.deployment.impl;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.platform.runtime.processcontrol.deployment.impl.FileWatcherEvent.Type;

public class FileWatcherImpl implements ServiceProvider<FileWatcherImpl> {

	public final Logger LOGGER = LoggerFactory.getLogger(getClass());
	private String rootFolder = null;
	private boolean recursive, watchFolder = false;
	private String[] suffixes = { ".json", ".properties" };

	public FileWatcherImpl() {
	}

	public FileWatcherImpl(Properties config) {
		if (config.containsKey("recursive")) {
			recursive = Boolean.parseBoolean(config.getProperty("recursive"));
		}
		if (config.containsKey("watchFolder")) {
			watchFolder = Boolean.parseBoolean(config.getProperty("watchFolder"));
		}
		if (config.containsKey("suffixes")) {
			suffixes = config.getProperty("suffixes").split(" ");
		}
	}

	@Override
	public boolean connect(ComponentContext context, String rootFolder) {
		this.rootFolder = rootFolder;
		if (watchFolder) {
			try {
				WatchService watcher = FileSystems.getDefault().newWatchService();
				//Path path = Paths.get(uri.toFileString());
				Path path = Paths.get(rootFolder);
				WatchKey key = path.register(watcher, StandardWatchEventKinds.ENTRY_CREATE,
						StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
				Runnable run = new Runnable() {

					@Override
					public void run() {
						while (isConnected()) {
							try {
								WatchKey key = watcher.take();
								List<WatchEvent<?>> eventList = key.pollEvents();
								LOGGER.debug("size = " + eventList.size());
								for (WatchEvent<?> e : eventList) {
									Path name = (Path) e.context();
									Path filePath = path.resolve(name);
									
									if (Files.isDirectory(filePath)) {
										LOGGER.debug(e.kind() + " -> " + filePath.toString() + " <dir>");
									} else {
										LOGGER.debug(e.kind() + " -> " + filePath.toString() + " <file>");
										if (e.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
											context.getEventBus().post(new FileWatcherEvent(Type.FILE_CREATED, filePath.toString()));											
										}
										else if (e.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
											context.getEventBus().post(new FileWatcherEvent(Type.FILE_DELETED, filePath.toString()));
										} 
										else if (e.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
											context.getEventBus().post(new FileWatcherEvent(Type.FILE_MODIFIED, filePath.toString()));
										} 
										else {
											//unknown
										}							

									}
								}
								boolean valid = key.reset();
								if (!valid) {
									break;
								}
							} catch (InterruptedException ex) {
								// TODO Auto-generated catch block
								ex.printStackTrace();
							}
						}
					}
				};
//				CompletableFuture<Void> cf = CompletableFuture.runAsync(run, context.getScheduledExecutorService()).exceptionally(e-> {		    
//					e.printStackTrace();
//					//LOGGER.error(e.getMessage(), e);
//				    return null;
//				});

				context.getScheduledExecutorService().execute(run);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File file = new File(rootFolder);
		return file.exists();

	}

	@Override
	public void disconnect() {
		this.rootFolder = null;
	}

	@Override
	public boolean isConnected() {
		return rootFolder != null;
	}
	
	@Override
	public FileWatcherImpl getService() {
		return this;
	}
	
	public List<String> getFilePaths() {

		FileFilter filter = new SuffixFileFilter(suffixes);

		List<String> paths = new LinkedList<String>();

		int depth = 1;
		if (recursive)
			depth = Integer.MAX_VALUE;

		try {
			Files.find(Paths.get(rootFolder), depth, (filePath, fileAttr) -> filter.accept(filePath.toFile())).map(p -> p.toString()).forEach(paths::add);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return paths;
	}

}
