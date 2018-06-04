package de.dfki.iui.basys.runtime.services.impl;

import javax.ws.rs.core.Response;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.WorkerGuidanceManager;

public class WorkerGuidanceManagerImpl extends EmfServiceComponent implements WorkerGuidanceManager {

	public WorkerGuidanceManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	private String createBody(String id, int order, int serial, int matNr, int errorCode) {
		return "Hier steht Inhalt zu: " + id + ", OrderNr " + order + ", SerialNr " + serial + ", MatNr  " + matNr + ", ErrorCode " + errorCode;
	}

	@Override
	public Response presentWorkerGuidance(String id, int order, int serial, int matNr, int errorCode) {
		String html = ""
				+ "<html>"
				+ "<head></head>"
				+ "<body>"
				+ createBody(id,order,serial,matNr, errorCode)
				+ "</body>"
				+ "</html>";
		
		Response response = Response.ok(html).build();
		return response;
	}

}
