package de.dfki.iui.basys.runtime.unit.packml;

public interface WaitStatesHandler {

	void onStopped();

	void onIdle();

	void onComplete();

	void onHold();

	void onSuspend();

	void onAborted();

}
