package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.material.Material;

@Path("/material")
public interface MaterialManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{materialId}")
	Material getMaterial(@PathParam("materialId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<Material> getAllMaterials();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	void addMaterial(Material material);
}
