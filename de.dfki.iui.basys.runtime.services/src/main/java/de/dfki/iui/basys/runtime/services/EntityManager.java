package de.dfki.iui.basys.runtime.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.MaterialCatalogue;
import de.dfki.iui.basys.model.domain.material.MaterialGroup;

@Path("/entity")
public interface EntityManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{entityId}")
	Entity getEntity(@PathParam("entityId") String id);

}
