package de.dfki.cos.basys.platform.runtime.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.MaterialCatalogue;
import de.dfki.iui.basys.model.domain.material.MaterialGroup;

@Path("/material")
public interface MaterialManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	MaterialCatalogue getMaterialCatalogue();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{materialId}")
	Material getMaterial(@PathParam("materialId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/group/{materialGroupId}")
	MaterialGroup getMaterialGroup(@PathParam("materialGroupId") String id);

}
