package de.dfki.iui.basys.runtime.unit;

public interface WaitStatesHandler {

	void onStopped();

	void onIdle();

	void onComplete();

	void onHold();

	void onSuspend();

	void onAborted();

}
