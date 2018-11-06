package de.dfki.iui.basys.runtime.component.device.ros;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import edu.wpi.rail.jrosbridge.ActionClient;
import edu.wpi.rail.jrosbridge.Goal;
import edu.wpi.rail.jrosbridge.callback.ActionCallback;
import edu.wpi.rail.jrosbridge.messages.actionlib.GoalStatus;

public class FibonacciComponent extends RosDeviceComponent {

	private ActionClient client;
	private Goal goal;
	
	public FibonacciComponent(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {	
		super.activate(context);
		
		client = new ActionClient(ros, "/fibonacci", "actionlib_tutorials/FibonacciAction");
		client.initialize();		
	}
	
	@Override
	public void deactivate() throws ComponentException {	
		super.deactivate();
		
		client.dispose();
	}
	
	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		// TODO Auto-generated method stub
		
		String goalString = "{ \"order\" : 7 }"; 
		
		JsonReader jsonReader = Json.createReader(new StringReader(goalString));
		JsonObject goalObject = jsonReader.readObject();
		jsonReader.close();
		
		getUnitConfig().setPayload(goalObject);
		return null;
	}	

	

	
	@Override
	public void onStarting() {

//		Service addTwoInts = new Service(ros, "/add_two_ints", "roscpp_tutorials/AddTwoInts");
//
//		ServiceRequest request = new ServiceRequest("{\"a\": 10, \"b\": 20}");
//		ServiceResponse response = addTwoInts.callServiceAndWait(request);
//		
//		int sum = response.toJsonObject().getInt("sum");
//		System.out.println(String.format("The sum is %s", sum));
		
		// see http://wiki.ros.org/actionlib/DetailedDescription, Chapter 3.5.2
		goal = client.createGoal(new ActionCallback() {
			
			@Override
			public void handleStatus(GoalStatus status) {
				System.out.println("STATUS: " + status.toString());	
				switch (status.getStatus()) {
				case GoalStatus.ABORTED:
					setErrorCode(4);
					break;
				case GoalStatus.ACTIVE:
					break;
				case GoalStatus.LOST:
					setErrorCode(9);
					break;
				case GoalStatus.PENDING:
					break;
				case GoalStatus.PREEMPTED:
					setErrorCode(2);
					break;
				case GoalStatus.PREEMPTING:
					break;
				case GoalStatus.RECALLED:
					setErrorCode(8);
					break;
				case GoalStatus.RECALLING:
					break;
				case GoalStatus.REJECTED:
					setErrorCode(5);
					break;
				case GoalStatus.SUCCEEDED:
					break;
				default:
					break;
				}
				
			}
			
			@Override
			public void handleResult(JsonObject result) {
				System.out.println("RESULT: " + result.toString());
				signalExecuteComplete();
			}
			
			@Override
			public void handleFeedback(JsonObject feedback) {
				System.out.println("FEEDBK: " + feedback.toString());				
			}
		});
		
		JsonObject goalObject = (JsonObject) getUnitConfig().getPayload();		
		goal.submit(goalObject);
				
	}
	
	@Override
	public void onExecute() {
		awaitExecuteComplete();
		if (getErrorCode() > 0) {
			stop();
		}
	}

	@Override
	public void onCompleting() {
		sendComponentResponse(ResponseStatus.OK, 0);
	}

	@Override
	public void onStopping() {
		//TODO: handle cancellation from user
		sendComponentResponse(ResponseStatus.NOT_OK, getErrorCode());
	}

	

	
}
