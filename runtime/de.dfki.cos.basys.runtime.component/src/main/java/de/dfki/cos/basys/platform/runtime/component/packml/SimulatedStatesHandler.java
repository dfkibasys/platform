package de.dfki.cos.basys.platform.runtime.component.packml;

import java.util.concurrent.TimeUnit;

import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration;
import de.dfki.cos.basys.platform.runtime.component.BaseComponent;

public class SimulatedStatesHandler implements ActiveStatesHandler {

	private PackMLComponent component;
	private SimulationConfiguration config;
	private double speedFactor = 1.0;
	
	public SimulatedStatesHandler(PackMLComponent component) {
		this.component = component;
		this.config = component.getConfig().getSimulationConfiguration();
	}

	private void sleep(long millis) {
		try {
			long duration = (long) (speedFactor * millis);
			TimeUnit.MILLISECONDS.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onResetting() {
		sleep(config.getOnResettingDuration());
	}

	@Override
	public void onStarting() {
		sleep(config.getOnStartingDuration());
	}

	@Override
	public void onExecute() {
		sleep(config.getOnExecuteDuration());
	}

	@Override
	public void onCompleting() {
		sleep(config.getOnCompletingDuration());
		if (config.getOnCompletingVariables().size() > 0) {
			component.handleCapabilityResponse(ResponseStatus.OK, config.getOnCompletingStatusCode(), config.getOnCompletingVariables());					
		} else {
			component.handleCapabilityResponse(ResponseStatus.OK, config.getOnCompletingStatusCode());
		}
	}

	@Override
	public void onHolding() {
		sleep(config.getOnHoldingDuration());
	}

	@Override
	public void onUnholding() {
		sleep(config.getOnUnholdingDuration());
	}

	@Override
	public void onSuspending() {
		sleep(config.getOnSuspendingDuration());
	}

	@Override
	public void onUnsuspending() {
		sleep(config.getOnUnsuspendingDuration());
	}

	@Override
	public void onAborting() {
		sleep(config.getOnAbortingDuration());
	}

	@Override
	public void onClearing() {
		sleep(config.getOnClearingDuration());
	}

	@Override
	public void onStopping() {
		sleep(config.getOnStoppingDuration());
		component.handleCapabilityResponse(ResponseStatus.NOT_OK, config.getOnStoppingStatusCode());
	}

}
