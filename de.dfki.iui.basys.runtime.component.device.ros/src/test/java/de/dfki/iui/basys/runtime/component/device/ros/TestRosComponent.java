package de.dfki.iui.basys.runtime.component.device.ros;

import javax.json.Json;
import javax.json.JsonObject;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import edu.wpi.rail.jrosbridge.ActionClient;
import edu.wpi.rail.jrosbridge.Goal;
import edu.wpi.rail.jrosbridge.callback.ActionCallback;
import edu.wpi.rail.jrosbridge.messages.actionlib.GoalStatus;

public class TestRosComponent extends RosDeviceComponent {

	public TestRosComponent(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		// TODO Auto-generated method stub
		return null;
	}
	
	ActionClient client;
	private Goal goal;
	
	@Override
	public void onExecute() {

//		Service addTwoInts = new Service(ros, "/add_two_ints", "roscpp_tutorials/AddTwoInts");
//
//		ServiceRequest request = new ServiceRequest("{\"a\": 10, \"b\": 20}");
//		ServiceResponse response = addTwoInts.callServiceAndWait(request);
//		
//		int sum = response.toJsonObject().getInt("sum");
//		System.out.println(String.format("The sum is %s", sum));
		
		client = new ActionClient(ros, "/fibonacci", "actionlib_tutorials/FibonacciAction");
		client.initialize();
		goal = client.createGoal(new ActionCallback() {
			
			@Override
			public void handleStatus(GoalStatus status) {
				System.out.println("STATUS: " + status.toString());				
			}
			
			@Override
			public void handleResult(JsonObject result) {
				System.out.println("RESULT: " + result.toString());				
			}
			
			@Override
			public void handleFeedback(JsonObject feedback) {
				System.out.println("FEEDBK: " + feedback.toString());				
			}
		});
		
		JsonObject goalMessage = Json.createObjectBuilder().add("order", 7).build();		
		
		goal.submit(goalMessage);
				
		sleep(30);
	}
	
	@Override
	public void onStopping() {		
		goal.cancel();
		client.dispose();
	}
	
	@Override
	public void onCompleting() {
		client.dispose();
	}

	
}
