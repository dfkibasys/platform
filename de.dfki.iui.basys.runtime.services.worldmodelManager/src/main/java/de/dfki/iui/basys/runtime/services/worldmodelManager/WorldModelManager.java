package de.dfki.iui.basys.runtime.services.worldmodelManager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.linebalancing.StaticWorldModel;
import de.dfki.iui.basys.model.domain.linebalancing.WorldModel;

@Path("/worldmodel")
public interface WorldModelManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/static")
	StaticWorldModel getStaticWorld();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/dynamic")
	WorldModel getCurrentWorld();

}
