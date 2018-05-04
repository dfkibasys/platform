package de.dfki.iui.basys.runtime.component.device.opcua;

import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaMonitoredItem;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;

public class FestoComponent extends OpcUaDeviceComponent {

	final NodeId NODE_VARIABLE_JOB_STATUS = new NodeId(1, 50195);
	final NodeId NODE_VARIABLE_JOB_ERRORCODE = new NodeId(1, 50196);

	final NodeId NODE_SERVICES = new NodeId(1, 50208);
	final NodeId NODE_EXECUTE_PP_JOB = new NodeId(1, 50209);
	final NodeId NODE_CANCEL_PP_JOB = new NodeId(1, 50211);

	// private CountDownLatch completeLatch;
	// private CountDownLatch cancelLatch;

	private short oldJobStatus = 0;
	private short jobStatus = 0;

	public FestoComponent(ComponentConfiguration config) {
		super(config);

		resetOnComplete = true;
		// resetOnStopped = true;
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		super.activate(context);

		try {
			subscribeToValue(NODE_VARIABLE_JOB_STATUS);
			// subscribeToValue(NODE_VARIABLE_JOB_ERRORCODE);

		} catch (Exception e) {
			throw new ComponentException(new OpcUaException(e));
		}
	}

	@Override
	public void onResetting() {
		super.onResetting();

		oldJobStatus = 0;
		jobStatus = 0;
		// TODO: setze Variable zum Zurücksetzten, z.B. nach Fehlerquittierung (=reset())
		// try {
		// writeValue(NODE_VARIABLE_JOB_ERRORCODE, (short) 0);
		// } catch (OpcUaException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
	}

	@Override
	public void onExecuteAsync() {	
	//public void onStarting() {
		try {
			FestoUnitConfiguration config = (FestoUnitConfiguration) getUnitConfig();
			Void v = invokeMethod(NODE_SERVICES, NODE_EXECUTE_PP_JOB, config.getLidNumber());
		} catch (OpcUaException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onCompleting() {
		super.onCompleting();
		// report Job IO

	}

	@Override
	public void onStoppingAsync() {

		//In case of an error the particular machine stops immediately. 
		//An explicit stop command has only to be sent in case of an external stop/cancel request 
		if (!internalStop) {
			try {
				FestoUnitConfiguration config = (FestoUnitConfiguration) getUnitConfig();
				Void v = invokeMethod(NODE_SERVICES, NODE_CANCEL_PP_JOB, config.getLidNumber());
			} catch (OpcUaException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void onSubscriptionValue(UaMonitoredItem item, DataValue value) {
		super.onSubscriptionValue(item, value);

		// if (item.getReadValueId().getNodeId() == NODE_VARIABLE_JOB_ERRORCODE) {
		// setErrorCode((short) (value.getValue().getValue()));
		// switch (getErrorCode()) {
		// case 0:
		// case 123:
		// // do nothing, happens also during reset()
		// break;
		// // case 11:
		// // according to Excel sheet
		// // abort(); // already aborted.
		// default:
		// // internal error
		// internalStop();
		// break;
		// }
		// return;
		// }

		if (item.getReadValueId().getNodeId() == NODE_VARIABLE_JOB_STATUS) {
			oldJobStatus = jobStatus;
			jobStatus = (short) (value.getValue().getValue());

			switch (jobStatus) {
			case 0: // IDLE
				if (getState() == State.STOPPED) {
					reset();
				} else if (getState() == State.EXECUTE) {
					signalComplete();
				} else if (getState() == State.STOPPING) {
					signalComplete();
				} else if (getState() == State.RESETTING) {
					signalComplete();
				}
				break;
			case 1:
				// machine started execution, ignore or notify basys
				break;
			case 2:
				// cancel

				break;
			case 3:
				// error
				// try {
				// short code = readValue(NODE_VARIABLE_JOB_ERRORCODE);
				// } catch (OpcUaException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				//
				// if (oldJobStatus == 2) {
				// //notify CAA: cancel failed
				// }
				// internalStop();
				break;
			default:
				break;
			}
			return;
		}
	}

}
