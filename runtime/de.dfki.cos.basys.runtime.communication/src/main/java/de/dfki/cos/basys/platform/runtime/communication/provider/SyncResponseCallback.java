package de.dfki.cos.basys.platform.runtime.communication.provider;

import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.communication.ResponseCallback;

class SyncResponseCallback implements ResponseCallback {

	public Response response;

	@Override
	public synchronized void handleResponse(Response res) {
		response = res;
		notifyAll();
	}

}