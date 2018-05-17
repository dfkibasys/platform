package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.productdefinition.ProductVariant;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.staff.Staff;
import de.dfki.iui.basys.model.domain.topology.TopologyElement;

@Path("/worldmodel")
public interface WorldModelManager {

	public class WorldModel {

		List<Order> mOrders;
		List<ProductInstance> mProductInstances;
		List<Staff> mStaffs;
		List<ResourceInstance> mResourceInstances;
	}

	public class StaticWorldModel {
		List<ProductVariant> mProductVariants;
		TopologyElement mRootTopologyElement;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	StaticWorldModel getStaticWorld(); // TODO

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	WorldModel getCurrentWorld(); // TODO

}
