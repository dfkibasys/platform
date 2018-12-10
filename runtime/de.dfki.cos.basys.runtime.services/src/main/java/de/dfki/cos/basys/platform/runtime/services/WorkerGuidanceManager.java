package de.dfki.cos.basys.platform.runtime.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/workerguidance")
public interface WorkerGuidanceManager {

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/{entityId}")
	Response presentWorkerGuidance(@PathParam("entityId") String id, @QueryParam("orderNr") int order, @QueryParam("serialNr") int serial, @QueryParam("matNr") int matNr, @QueryParam("errorCode") int errorCode);

}
