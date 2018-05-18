package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Path("/worldmodel")
public interface WorldModelManager {

	public class WorldModel {

		public class WMProductInstance {

			@JsonProperty
			private String serialId;
			@JsonProperty
			private String from_position;
			@JsonProperty
			private String to_position;
			@JsonProperty
			private boolean in_transit;
			@JsonProperty
			private long eta;
			@JsonProperty
			private String variant;
		}

		public class WMCapability {
			@JsonProperty
			private String id;
		}

		public class WMResourceInstance {
			@JsonProperty
			private String id;
			@JsonProperty
			private String from_position;
			@JsonProperty
			private String to_position;
			@JsonProperty
			private List<WMCapability> capabilities;
		}

		@JsonProperty
		private List<WMProductInstance> mProductInstances;

		@JsonProperty
		private List<WMResourceInstance> mResourceInstances;
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
