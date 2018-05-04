package de.dfki.iui.basys.runtime.component.device.packml;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.RequestStatus;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentRequestStatusImpl;


public class PackMLUnit implements StatusInterface, CommandInterface, ActiveStatesHandler, WaitStatesHandler {

	protected final Logger LOGGER = LoggerFactory.getLogger(PackMLUnit.class.getName());

	private String id;

	private boolean initialized = false;
	private boolean wait = false;

	private PackML packml = null;

	private ControlMode mode = ControlMode.PRODUCTION;

	private UnitConfiguration config;

	private ActiveStatesHandler actHandler = null;
	private WaitStatesHandler waitHandler = null;

	ExecutorService executor;
	CompletableFuture<Boolean> currentTask;

	protected int errorCode = 0;

	public PackMLUnit(String id) {
		this.id = id;
		packml = new PackML(this);

	}

	public void initialize() {
		executor = Executors.newCachedThreadPool();
		// executor = Executors.newFixedThreadPool(2);
		// executor = Executors.newSingleThreadExecutor();

		packml.initialize();
	}

	public void dispose() {
		packml.dispose();

		try {
			System.out.println("attempt to shutdown executor");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println("tasks interrupted");
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("cancel non-finished tasks");
			}
			executor.shutdownNow();
			System.out.println("shutdown finished");
		}

	}

	public void setActiveStatesHandler(ActiveStatesHandler actHandler) {
		this.actHandler = actHandler;
	}

	public void setWaitStatesHandler(WaitStatesHandler waitHandler) {
		this.waitHandler = waitHandler;
	}

	public boolean cancelCurrentTask(boolean immediately) {
		if (currentTask != null) {
			if (currentTask.isDone())
				return true;
			else {
				try {
					currentTask.completeExceptionally(new PackMLException("Execution cancelled"));
					// currentTask.cancel(immediately);
					return currentTask.join();
				} catch (Exception e) {

				}
			}
		}
		return true;
	}

	private void waitForCompletion(CompletableFuture<Boolean> cf) {

		cf.thenCompose((result) -> {
			packml.raiseLifecycleEvent("done");
			return CompletableFuture.completedFuture(true);
		});
		currentTask = cf;
		if (!wait)
			return;

		try {
			currentTask.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// throw new PackMLException(e);
		}
		int i = 0;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/*
	 * StatusInterface
	 */

	@Override
	public String getId() {
		return id;
	}

	@Override
	public State getState() {
		return packml.getState();
	}

	@Override
	public ControlMode getMode() {
		return mode;
	}

	@Override
	public UnitConfiguration getUnitConfig() {
		return config;
	}

	/*
	 * CommandInterface
	 */

	@Override
	public ComponentRequestStatus setMode(ControlMode mode) {
		State state = getState();
		if (getMode() == mode) {
			ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.REJECTED).message(String.format("already in mode %s", mode)).build();
			return status;
		}		
		if (mode == ControlMode.MANUAL && state == State.ABORTED) {
			this.mode = mode;
			ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("mode changed").build();
			return status;
		} else if (state == State.STOPPED) {
			this.mode = mode;
			ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("mode changed").build();
			return status;
		} else {
			// illegal state
			LOGGER.error(String.format("cannot change to mode %s in state %s", mode, state));
			ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.REJECTED).message(String.format("cannot change to mode %s in state %s", mode, state)).build();
			return status;
		}
	}

	@Override
	public synchronized ComponentRequestStatus setUnitConfig(UnitConfiguration config) {
		if (getState() == State.IDLE) {
			this.config = config;
			ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("config set").build();
			return status;
		} else {
			// illegal state
			LOGGER.error(String.format("cannot set config in state %s", getState()));		
			ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.REJECTED).message(String.format("cannot set config in state %s", getState())).build();
			return status;
		}
	}

	@Override
	public ComponentRequestStatus reset() {
		LOGGER.info("reset()");
		packml.raiseLifecycleEvent("reset");
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("command accepted").build();
		return status;
	}

	@Override
	public ComponentRequestStatus start() {
		LOGGER.info("start()");
		packml.raiseLifecycleEvent("start");
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("command accepted").build();
		return status;
	}

	@Override
	public ComponentRequestStatus stop() {
		LOGGER.info("stop()");
		packml.raiseLifecycleEvent("stop");
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("command accepted").build();
		return status;
	}

	@Override
	public ComponentRequestStatus hold() {
		LOGGER.info("hold()");
		packml.raiseLifecycleEvent("hold");
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("command accepted").build();
		return status;
	}

	@Override
	public ComponentRequestStatus unhold() {
		LOGGER.info("unhold()");
		packml.raiseLifecycleEvent("unhold");
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("command accepted").build();
		return status;
	}

	@Override
	public ComponentRequestStatus suspend() {
		LOGGER.info("suspend()");
		packml.raiseLifecycleEvent("suspend");
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("command accepted").build();
		return status;
	}

	@Override
	public ComponentRequestStatus unsuspend() {
		LOGGER.info("unsuspend()");
		packml.raiseLifecycleEvent("unsuspend");
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("command accepted").build();
		return status;
	}

	@Override
	public ComponentRequestStatus abort() {
		LOGGER.info("abort()");
		packml.raiseLifecycleEvent("abort");
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("command accepted").build();
		return status;
	}

	@Override
	public ComponentRequestStatus clear() {
		LOGGER.info("clear()");
		packml.raiseLifecycleEvent("clear");
		ComponentRequestStatus status = new ComponentRequestStatusImpl.Builder().status(RequestStatus.ACCEPTED).message("command accepted").build();
		return status;
	}

	/*
	 * ActiveStatesHandler facade
	 */

	@Override
	public void onResetting() {
		LOGGER.info("onResetting()");
		setErrorCode(0);

		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onResetting();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}

	}

	@Override
	public void onStarting() {
		LOGGER.info("onStarting()");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onStarting();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	@Override
	public void onExecute() {
		LOGGER.info("onExecute()");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onExecute();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	@Override
	public void onCompleting() {
		LOGGER.info("onCompleting()");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onCompleting();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	@Override
	public void onHolding() {
		LOGGER.info("onHolding()");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onHolding();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	@Override
	public void onUnholding() {
		LOGGER.info("onUnholding()");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onUnholding();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	@Override
	public void onSuspending() {
		LOGGER.info("onSuspending()");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onSuspending();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	@Override
	public void onUnsuspending() {
		LOGGER.info("onUnsuspending()");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onUnsuspending();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	@Override
	public void onAborting() {
		LOGGER.info("onAborting()");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onAborting();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	@Override
	public void onClearing() {
		LOGGER.info("onClearing()");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onClearing();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	@Override
	public void onStopping() {
		LOGGER.info("onStopping()");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

			executor.submit(() -> {
				actHandler.onStopping();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	/*
	 * WaitStatesHandler facade
	 */

	@Override
	public void onStopped() {
		LOGGER.info("onStopped()");
		if (waitHandler != null) {
			waitHandler.onStopped();

			// CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			//
			// executor.submit(()-> {
			// waitHandler.onStopped();
			// cf.complete(true);
			// return null;
			// });
			//
			// waitForCompletion(cf);
		}
	};

	@Override
	public void onIdle() {
		LOGGER.info("onIdle()");
		if (waitHandler != null) {
			waitHandler.onIdle();

			// CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			//
			// executor.submit(()-> {
			// waitHandler.onIdle();
			// cf.complete(true);
			// return null;
			// });
			//
			// waitForCompletion(cf);
		}
	};

	@Override
	public void onComplete() {
		LOGGER.info("onComplete()");
		if (waitHandler != null) {
			waitHandler.onComplete();

			// CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			//
			// executor.submit(()-> {
			// waitHandler.onComplete();
			// cf.complete(true);
			// return null;
			// });
			//
			// waitForCompletion(cf);
		}
	};

	@Override
	public void onHeld() {
		LOGGER.info("onHeld()");
		if (waitHandler != null) {
			waitHandler.onHeld();

			// CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			//
			// executor.submit(()-> {
			// waitHandler.onHeld();
			// cf.complete(true);
			// return null;
			// });
			//
			// waitForCompletion(cf);
		}
	};

	@Override
	public void onSuspended() {
		LOGGER.info("onSuspended()");
		if (waitHandler != null) {
			waitHandler.onSuspended();

			// CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			//
			// executor.submit(()-> {
			// waitHandler.onSuspended();
			// cf.complete(true);
			// return null;
			// });
			//
			// waitForCompletion(cf);
		}
	};

	@Override
	public void onAborted() {
		LOGGER.info("onAborted()");
		if (waitHandler != null) {
			waitHandler.onAborted();

			// CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			//
			// executor.submit(()-> {
			// waitHandler.onAborted();
			// cf.complete(true);
			// return null;
			// });
			//
			// waitForCompletion(cf);
		}
	};

}
