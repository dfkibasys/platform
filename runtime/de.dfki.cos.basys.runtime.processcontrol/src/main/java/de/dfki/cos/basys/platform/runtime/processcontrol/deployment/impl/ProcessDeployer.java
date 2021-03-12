package de.dfki.cos.basys.platform.runtime.processcontrol.deployment.impl;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import com.google.common.eventbus.Subscribe;

import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.impl.ServiceComponent;
import de.dfki.cos.basys.platform.runtime.processcontrol.deployment.DeploymentService;
import de.dfki.cos.basys.platform.runtime.processcontrol.deployment.impl.FileWatcherEvent.Type;

public class ProcessDeployer extends ServiceComponent<DeploymentService> {

	FileWatcherImpl fileWatcher = null;
	Map<String,String> fileToIdMap = new HashMap<>();
	
	public ProcessDeployer(Properties config) {
		super(config);

		fileWatcher = new FileWatcherImpl(config);
	}

	@Override
	protected void doActivate() throws ComponentException {
		if (this.isConnected()) {	
			fileWatcher.connect(context, config.getProperty("rootFolder"));
			
			context.getScheduledExecutorService().schedule(new Runnable() {
				@Override
				public void run() {
					
					getService().clearDeployments();
					
					for (String filePath : fileWatcher.getFilePaths()) {
						String id = getService().createDeployment(filePath);	
						if (id != null) {
							fileToIdMap.put(filePath, id);
						}
					}
					
				}
			}, 2000, TimeUnit.MILLISECONDS);		
		
		}
		
	}
	

	@Subscribe
	public void onFileWatcherEvent(FileWatcherEvent ev) {
		LOGGER.info("onFileWatcherEvent " + ev);
		if (ev.getType() == Type.FILE_CREATED) {
			String id = getService().createDeployment(ev.getValue());	
			if (id != null) {
				fileToIdMap.put(ev.getValue(), id);
			}
		}
		else if (ev.getType() == Type.FILE_DELETED) {
			String id = fileToIdMap.remove(ev.getValue());
			if (id != null) {
				getService().deleteDeployment(id);
			}
		}
		else if (ev.getType() == Type.FILE_MODIFIED) {
			// do nothing
		}
	}
}
