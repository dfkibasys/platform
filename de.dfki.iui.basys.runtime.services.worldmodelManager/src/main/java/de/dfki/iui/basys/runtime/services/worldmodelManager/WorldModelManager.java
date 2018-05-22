package de.dfki.iui.basys.runtime.services.worldmodelManager;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication;

@Path("/worldmodel")
public interface WorldModelManager {

	public class WorldModel {

		public class WMProductInstance {

			@JsonProperty
			private String serialId;
			@JsonProperty
			private String position;
			@JsonProperty
			private boolean in_transit;
			@JsonProperty
			private long eta;
			@JsonProperty
			private String variant;

			public WMProductInstance(String serialId, String position, boolean in_transit, long eta, String variant) {
				this.serialId = serialId;
				this.position = position;
				this.in_transit = in_transit;
				this.eta = eta;
				this.variant = variant;
			}

		}

		/*
		 * public class WMCapability {
		 * 
		 * @JsonProperty private String id; }
		 */

		public class WMResourceInstance {
			@JsonProperty
			private String serialId;
			@JsonProperty
			private String from_position;
			@JsonProperty
			private String to_position;
			@JsonProperty
			private long eta;
			@JsonProperty
			private List<CapabilityApplication> capabilities;

			public WMResourceInstance(String serialId, String from_position, String to_position, long eta,
					List<CapabilityApplication> capabilities) {
				this.serialId = serialId;
				this.from_position = from_position;
				this.to_position = to_position;
				this.eta = eta;
				this.capabilities = capabilities;
			}

		}

		@JsonProperty
		private List<WMProductInstance> mProductInstances;

		@JsonProperty
		private List<WMResourceInstance> mResourceInstances;

		public void setProductInstances(List<WMProductInstance> wpis) {
			mProductInstances = wpis;
		}

		public void setResourceInstances(List<WMResourceInstance> wris) {
			mResourceInstances = wris;
		}
	}

	public class StaticWorldModel {

		public class WMPathTimes {

			public class WMPathTime {

				@JsonProperty
				private String name;
				@JsonProperty
				private long time;

				public WMPathTime(String name, long time) {
					this.name = name;
					this.time = time;
				}

			}

			@JsonProperty
			private String from;
			@JsonProperty
			private List<WMPathTime> to;

			public WMPathTimes(String name) {
				from = name;
			}

			public void setPathTimes(List<WMPathTime> times) {
				to = times;
			}
		}

		@JsonProperty
		private List<WMPathTimes> pathstimes;

		public void setPathTimes(List<WMPathTimes> pathTimes) {
			pathstimes = pathTimes;
		}

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/static")
	StaticWorldModel getStaticWorld();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/dynamic")
	WorldModel getCurrentWorld();

}
