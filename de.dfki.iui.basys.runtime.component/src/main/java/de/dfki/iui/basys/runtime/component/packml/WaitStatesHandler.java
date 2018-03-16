package de.dfki.iui.basys.runtime.component.packml;

public interface WaitStatesHandler {

	void onStopped();

	void onIdle();

	void onComplete();

	void onHeld();

	void onSuspended();

	void onAborted();

}
