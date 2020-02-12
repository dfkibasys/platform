package de.dfki.cos.basys.platform.runtime.processcontrol.impl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;
import de.dfki.cos.basys.platform.runtime.component.model.RequestStatus;
import de.dfki.cos.basys.platform.runtime.processcontrol.ComponentRequestIssuer;

public abstract class AbstractComponentRequestIssuer
		implements ServiceProvider<ComponentRequestIssuer>, ComponentRequestIssuer {

	protected Logger LOGGER = LoggerFactory.getLogger(this.getClass().getName());

	protected BlockingQueue<ComponentRequest> requestQueue = new LinkedBlockingQueue<ComponentRequest>();
	protected BlockingQueue<ComponentResponse> responseQueue = new LinkedBlockingQueue<ComponentResponse>();

	protected boolean connected = false;
	private boolean pollResponseQueue = true;
	
	protected ComponentContext context;

	@Override
	public ComponentRequest pollNewComponentRequest() {
		try {
			return requestQueue.poll(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		return null;
	}

	@Override
	public void handleComponentResponse(ComponentResponse response) {
		try {
			responseQueue.put(response);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean connect(ComponentContext context, String connectionString) {

		this.context = context;

		this.context.getScheduledExecutorService().schedule(new Runnable() {

			@Override
			public void run() {
				while (pollResponseQueue) {
					try {
						ComponentResponse response = responseQueue.poll(1000, TimeUnit.MILLISECONDS);
						if (response != null) {
							doHandleComponentResponse(response);
							Thread.sleep(200);
						}
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}

		}, 5000, TimeUnit.MILLISECONDS);
		
		return false;
	}

	protected abstract void doHandleComponentResponse(ComponentResponse response);

	@Override
	public void disconnect() {
		pollResponseQueue = false;
	}

	@Override
	public boolean isConnected() {
		return connected;
	}

	@Override
	public ComponentRequestIssuer getService() {
		return this;
	}

}
