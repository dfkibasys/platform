package de.dfki.iui.basys.runtime.component.device.opcua;

import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaMonitoredItem;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

public class FestoComponent extends OpcUaDeviceComponent {

	final NodeId NODE_VARIABLE_JOB_STATUS = new NodeId(1, 320);
	final NodeId NODE_VARIABLE_JOB_ERRORCODE = new NodeId(1, 318);

	final NodeId NODE_SERVICES = new NodeId(1, 52);
	final NodeId NODE_EXECUTE_PP_JOB = new NodeId(1, 242);
	final NodeId NODE_CANCEL_PP_JOB = new NodeId(1, 119);
	final NodeId NODE_ACK = new NodeId(1, 314);

	// private CountDownLatch completeLatch;
	// private CountDownLatch cancelLatch;

	private short oldJobStatus = 0;
	private short jobStatus = 0;
	private short jobErrorCode = 0;

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
			subscribeToValue(NODE_VARIABLE_JOB_ERRORCODE);

		} catch (Exception e) {
			throw new ComponentException(new OpcUaException(e));
		}
	}

	@Override
	public void onResetting() {
		super.onResetting();
		oldJobStatus = 0;
		jobStatus = 0;
		ackn();
	}

	@Override
	public void onStarting() {
		try {
			int lidNumber = getUnitConfig().getRecipe();
			Void v = invokeMethod(NODE_SERVICES, NODE_EXECUTE_PP_JOB, (short) lidNumber);
		} catch (OpcUaException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onCompleting() {
		super.onCompleting();

		sendComponentResponse(ResponseStatus.OK, 0);
	}

	@Override
	public void onStopping() {
		try {
			short jobErrorCode = readValue(NODE_VARIABLE_JOB_ERRORCODE);
			if (jobErrorCode != 0) {
				// internal error report
				// do nothing
			} else {
				// external stop
				int lidNumber = getUnitConfig().getRecipe();
				cancelJob((short) lidNumber);
			}

			sendComponentResponse(ResponseStatus.NOT_OK, jobErrorCode);
		} catch (OpcUaException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	protected void onSubscriptionValue(UaMonitoredItem item, DataValue value) {
		super.onSubscriptionValue(item, value);

		if (item.getReadValueId().getNodeId() == NODE_VARIABLE_JOB_ERRORCODE) {
			jobErrorCode = (short) (value.getValue().getValue());
		}

		if (item.getReadValueId().getNodeId() == NODE_VARIABLE_JOB_STATUS) {
			short newJobStatus = (short) (value.getValue().getValue());
			oldJobStatus = jobStatus;
			jobErrorCode = newJobStatus;
		}

		updateState();

	}

	private void updateState() {

		switch (jobStatus) {
		case 0: // IDLE
			// if (getState() == State.STOPPED) {
			// reset();
			// } else if (getState() == State.EXECUTE) {
			// signalComplete();
			// } else if (getState() == State.STOPPING) {
			// signalComplete();
			// } else if (getState() == State.RESETTING) {
			// signalComplete();
			// }
			break;
		case 1: // RUNNING
			// ignore
			break;
		case 2: // RESETTING
			// ignore
			break;
		case 3: // ERROR
			stop();
			break;
		default:
			break;
		}

	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	public void ackn() {
		try {
			Short v = invokeMethod(NODE_SERVICES, NODE_ACK);
		} catch (OpcUaException e) {
			e.printStackTrace();
		}
	}

	public void executeJob(short lidNumber) {
		try {
			invokeMethod(NODE_SERVICES, NODE_EXECUTE_PP_JOB, lidNumber);
		} catch (OpcUaException e) {
			e.printStackTrace();
		}
	}

	public void cancelJob(short lidNumber) {
		try {
			invokeMethod(NODE_SERVICES, NODE_CANCEL_PP_JOB, lidNumber);
		} catch (OpcUaException e) {
			e.printStackTrace();
		}
	}

}
