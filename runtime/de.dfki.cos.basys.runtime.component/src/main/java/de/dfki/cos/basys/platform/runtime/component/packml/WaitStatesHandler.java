package de.dfki.cos.basys.platform.runtime.component.packml;

public interface WaitStatesHandler {

	void onStopped();

	void onIdle();

	void onComplete();

	void onHeld();

	void onSuspended();

	void onAborted();

}
