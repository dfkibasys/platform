package de.dfki.iui.basys.runtime.component.device.tecs.deprecated;

import java.io.IOException;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.siam.CeBITDialogue;

public class SiAMServiceComponent extends TecsServiceComponent{

	private SiAMTECS client;
	private final String businessKey;
	
	public SiAMServiceComponent(ComponentConfiguration config, String businessKey) {
		super(config);
		this.businessKey = businessKey;
	}
	
	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new SiAMTECS(protocol, businessKey);
	}
	
	@Override
	protected ComponentRequestStatus handleCapabilityRequest(CapabilityRequest req) {
		return null;
		
	}
	
	
	
	
	/* 
	 * Send: 'performColaDialog' to trgger the performColaDialog method.
	 * Send: 'performIntentionDialog' to trigger the performIntentionDialog method.
	 * Send: 'performDeliveryDialog' to trigger the performDeliveryDialog method.
	 */
	@Override
	public void handleMessage(Channel channel, String msg) {
		super.handleMessage(channel, msg);
		
		if (msg.equals("performColaDialog")) {
			try {
				client.performColaDialog();
			} catch (TException e) {
				e.printStackTrace();
			}
		} else if (msg.equals("performIntentionDialog")) {
			try {
				client.performIntentionDialog();
			} catch (TException e) {
				e.printStackTrace();
			}
		} else if(msg.equals("performDeliveryDialog")) {
			try {
				client.performDeliveryDialog();
			} catch (TException e) {
				e.printStackTrace();
			}
		} else {
			LOGGER.info("Message not recognized!");
		}
	}
	
	
	/* 
	 * Send 'performColaDialog' as payload to trgger the performColaDialog method.
	 * Send 'performIntentionDialog' as payload to trigger the performIntentionDialog method.
	 * Send 'performDeliveryDialog' as payload to trigger the performDeliveryDialog method.
	 */
	@Override
	public void handleNotification(Channel channel, Notification not) {
		super.handleNotification(channel, not);
		String payload = not.getPayload();
		
		if (payload.equals("performColaDialog")) {
			try {
				client.performColaDialog();
			} catch (TException e) {
				e.printStackTrace();
			}
		} else if (payload.equals("performIntentionDialog")) {
			try {
				client.performIntentionDialog();
			} catch (TException e) {
				e.printStackTrace();
			}
		} else if(payload.equals("performDeliveryDialog")) {
			try {
				client.performDeliveryDialog();
			} catch (TException e) {
				e.printStackTrace();
			}
		} else {
			LOGGER.info("Payload not recognized!");
		} 
	}
	
	/*
	 * Send 'performColaDialog' as payload to trgger the performColaDialog method.
	 * Send 'performIntentionDialog' as payload to trigger the performIntentionDialog method.
	 * Send 'performDeliveryDialog' as payload to trigger the performDeliveryDialog method.
	 * 
	 * handleRequest will wait until the triggered Method is finished to send a response back.
	 * Returns an 'Error' as payload when an error occurs.
	 * Returns "OK performColaDialog" as payload if performColaDialog is called and finished.
	 * Returns "OK performIntentionDialog" as payload if performIntentionDialog is called and finished.
	 * Returns "OK performDeliveryDialog" as payload if performDeliveryDialog is called and finished.
	 */
	@Override
	public Response handleRequest(Channel channel, Request req) {
		//super.handleRequest(channel, req);
		String payload = req.getPayload();
		try {
			EObject obj = JsonUtils.fromString(payload, EObject.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// trigger the method. and send response
		CommandResponse cr;
		if (payload.equals("performColaDialog")) {
			try {
				cr = client.performColaDialog();
				return waitUntilExecuted(cr, req.getId(), "performColaDialog");
			} catch (TException e) {
				e.printStackTrace();
				return errorResponse(req.getId());
			}
		} else if (payload.equals("performIntentionDialog")) {
			try {
				cr = client.performIntentionDialog();
				return waitUntilExecuted(cr, req.getId(), "performIntentionDialog");
			} catch (TException e) {
				e.printStackTrace();
				return errorResponse(req.getId());
			}
		} else if(payload.equals("performDeliveryDialog")) {
			try {
				cr = client.performDeliveryDialog();
				return waitUntilExecuted(cr, req.getId(), "performDeliveryDialog");
			} catch (TException e) {
				e.printStackTrace();
				return errorResponse(req.getId());
			}
		} else {
			LOGGER.info("Payload not recognized!");
			return errorResponse(req.getId());	// Error, break and return error
		}
	}
	
	// returns an error response
	private Response errorResponse(String id) {
		Response response = CommFactory.getInstance().createResponse(id, "Error");
		return response;
	}
	
	// returns a success response
	private Response successResponse(String id, String payload) {
		Response response = CommFactory.getInstance().createResponse(id, payload);
		return response;
	}
	
	// wait until the dialoge is finished. if finished return a successful response, otherwise returns an error response
	private Response waitUntilExecuted(CommandResponse cr, String id, String calledMethod) {
		boolean executing = true;
		while(executing) {
			//CommandResponse cr = client.getCommandState();
			switch(cr.state) {
			case ACCEPTED: 
				// wait
				break;
			case ABORTED: 
				executing= false;
				return errorResponse(id);
			case EXECUTING:
				// wait
				break;
			case FINISHED: 
				executing=false;
				return successResponse(id, "OK "+calledMethod);
			case PAUSED: 
				//?
				return errorResponse(id);
			case READY: 
				//?
				break;
			case REJECTED: 
				executing=false;
				return errorResponse(id);
			default: return errorResponse(id);
			}
			
			try {
				Thread.sleep(100);
				cr = client.getCommandState();
			} catch (InterruptedException | TException e) {
				e.printStackTrace();
				return errorResponse(id);
			}
		}
		
		// should never be called
		return errorResponse(id);		
	}
	
	private class SiAMTECS extends CeBITDialogue.Client{
		private final String businessKey;
		
		public SiAMTECS(TProtocol prot, String businessKey) {
			super(prot);
			this.businessKey = businessKey;
		}
	
		public CommandResponse performColaDialog() throws TException {
			return super.performColaDialog(businessKey);
		}
			
		public CommandResponse performIntentionDialog() throws TException {
			return super.performIntentionDialog(businessKey);
		}
		
		public CommandResponse performDeliveryDialog() throws TException{
			return super.performDeliveryDialog(businessKey);
		}
		
		public CommandResponse getCommandState() throws TException {
			return super.getCommandState(businessKey);
		}

	}

}
