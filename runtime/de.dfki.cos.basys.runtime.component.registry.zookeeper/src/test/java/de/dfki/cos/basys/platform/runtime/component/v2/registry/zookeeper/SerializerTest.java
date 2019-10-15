package de.dfki.cos.basys.platform.runtime.component.v2.registry.zookeeper;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Properties;

import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.details.InstanceSerializer;
import org.apache.curator.x.discovery.details.JsonInstanceSerializer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.common.component.ComponentInfo;

public class SerializerTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		try {

			ComponentInfo p = new ComponentInfo();
			p.setProperty("p1", "p1");

			ServiceInstance<ComponentInfo> inst = ServiceInstance.<ComponentInfo>builder().name("name").id("id").payload(p)
					.port((int) (65535 * Math.random())).build();

			InstanceSerializer<ComponentInfo> serializer = new JsonInstanceSerializer<ComponentInfo>(ComponentInfo.class);

			byte[] bytes = serializer.serialize(inst);
			String s = new String(bytes, StandardCharsets.UTF_8);
			System.out.println(s);
			ServiceInstance<ComponentInfo> inst2 = serializer.deserialize(bytes);
			System.out.println(inst2.getPayload());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
