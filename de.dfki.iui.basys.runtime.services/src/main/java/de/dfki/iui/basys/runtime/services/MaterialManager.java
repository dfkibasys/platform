package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.MaterialGroup;

@Path("/material")
public interface MaterialManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<Material> getAllMaterials();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{materialId}")
	Material getMaterial(@PathParam("materialId") String id);

	@DELETE
	@Path("/{materialId}")
	void deleteMaterial(@PathParam("materialId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/group")
	List<MaterialGroup> getMaterialGroups();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/group")
	String addMaterialGroup(MaterialGroup materialGroup);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/group/{materialGroupId}")
	MaterialGroup getMaterialGroup(@PathParam("materialGroupId") String id);

	@DELETE
	@Path("/group/{materialGroupId}")
	void deleteMaterialGroup(@PathParam("materialGroupId") String id);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/group/{materialGroupId}")
	String addMaterialToGroup(Material material, @PathParam("materialGroupId") String materialGroupId);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/group/{materialGroupId}/subgroup")
	String addMaterialGroupToGroup(MaterialGroup materialGroup, @PathParam("materialGroupId") String materialGroupId);

}
