package de.dfki.iui.basys.runtime.component.device.packml;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.scxml2.model.Raise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackMLUnit implements StatusInterface, CommandInterface, ActiveStatesHandler, WaitStatesHandler {

	protected final Logger LOGGER = LoggerFactory.getLogger(PackMLUnit.class.getName());
	
	private String id;

	private boolean initialized = false;
	private boolean wait = false;

	private PackML packml = null;

	private Mode mode = Mode.PRODUCTION;	
	
	private UnitConfiguration config;	

	private ActiveStatesHandler actHandler = null;
	private WaitStatesHandler waitHandler = null;
	
	ExecutorService executor;
	CompletableFuture<Boolean> currentTask;
	
	public PackMLUnit(String id) {
		this.id = id;		
		packml = new PackML(this);
		
	}
	
	public void initialize() {
		executor =  Executors.newCachedThreadPool();
		//executor =  Executors.newFixedThreadPool(2);
		//executor =  Executors.newSingleThreadExecutor();
		
		packml.initialize();
	}

	public void dispose() {
		packml.dispose();
		
		try {
		    System.out.println("attempt to shutdown executor");
		    executor.shutdown();
		    executor.awaitTermination(5, TimeUnit.SECONDS);
		}
		catch (InterruptedException e) {
		    System.err.println("tasks interrupted");
		}
		finally {
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
				currentTask.completeExceptionally(new PackMLException("Execution aborted"));
				//currentTask.cancel(immediately);
			}
		} 
		return true;
	}
	
	private void waitForCompletion(CompletableFuture<Boolean> cf) {
		currentTask = cf;
		currentTask.thenCompose((result) -> {
			packml.raiseLifecycleEvent("done");
			return CompletableFuture.completedFuture(true);
		});
		if (!wait) return;
		
		try {
			currentTask.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//throw new PackMLException(e);
		}
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
	public Mode getMode() {
		return mode;
	}

	@Override
	public UnitConfiguration getUnitConfig() {
		return config;
	}

	/*
	 * CommandInterface
	 */

	public void setMode(Mode mode) throws PackMLException {
		State state = getState();
		if (mode == Mode.MANUAL && state == State.ABORTED) {
			this.mode = mode;
		} else if (state == State.STOPPED) {
			this.mode = mode;
		} else {
			// illegal state
			LOGGER.error(String.format("Cannot change to mode %s in state %s", mode, state));
			throw new PackMLException(String.format("Cannot change to mode %s in state %s", mode, state));
		}
	}

	@Override
	public synchronized void setUnitConfig(UnitConfiguration config) throws PackMLException {
		if (getState() == State.IDLE) {
			this.config = config;
		} else {
			// illegal state
			LOGGER.error(String.format("Cannot set config in state %s", getState()));
			throw new PackMLException(String.format("Cannot set config in state %s", getState()));
		}	
	}
	
	@Override
	public void reset() {
		LOGGER.info("reset");
		packml.raiseLifecycleEvent("reset");
	}

	@Override
	public void start() {
		LOGGER.info("start");
		packml.raiseLifecycleEvent("start");
	}

	@Override
	public void stop() {
		LOGGER.info("stop");
		packml.raiseLifecycleEvent("stop");
	}

	@Override
	public void hold() {
		LOGGER.info("hold");
		packml.raiseLifecycleEvent("hold");
	}

	@Override
	public void unhold() {
		LOGGER.info("unhold");
		packml.raiseLifecycleEvent("unhold");
	}

	@Override
	public void suspend() {
		LOGGER.info("suspend");
		packml.raiseLifecycleEvent("suspend");
	}

	@Override
	public void unsuspend() {
		LOGGER.info("unsuspend");
		packml.raiseLifecycleEvent("unsuspend");
	}

	@Override
	public void abort() {
		LOGGER.info("abort");
		packml.raiseLifecycleEvent("abort");
	}

	@Override
	public void clear() {
		LOGGER.info("clear");
		packml.raiseLifecycleEvent("clear");
	}
	
	/*
	 * ActiveStatesHandler facade
	 */
	
	@Override
	public void onResetting() {
		LOGGER.info("onResetting");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
				actHandler.onResetting();
				cf.complete(true);
				return null;
			});		
			
			waitForCompletion(cf);
		}
			
	}

	@Override
	public void onStarting() {
		LOGGER.info("onStarting");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
				actHandler.onStarting();
				cf.complete(true);
				return null;
			});
			
			waitForCompletion(cf);
		}
	}

	@Override
	public void onExecute() {
		LOGGER.info("onExecute");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
				actHandler.onExecute();
				cf.complete(true);
				return null;
			});
			
			waitForCompletion(cf);
		}
	}

	@Override
	public void onCompleting() {
		LOGGER.info("onCompleting");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
				actHandler.onCompleting();
				cf.complete(true);
				return null;
			});
			
			waitForCompletion(cf);
		}
	}

	@Override
	public void onHolding() {
		LOGGER.info("onHolding");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
				actHandler.onHolding();
				cf.complete(true);
				return null;
			});
			
			waitForCompletion(cf);
		}
	}

	@Override
	public void onUnholding() {
		LOGGER.info("onUnholding");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
				actHandler.onUnholding();
				cf.complete(true);
				return null;
			});

			waitForCompletion(cf);
		}
	}

	@Override
	public void onSuspending() {
		LOGGER.info("onSuspending");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
				actHandler.onSuspending();
				cf.complete(true);
				return null;
			});
			
			waitForCompletion(cf);
		}
	}

	@Override
	public void onUnsuspending() {
		LOGGER.info("onUnsuspending");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
				actHandler.onUnsuspending();
				cf.complete(true);
				return null;
			});
			
			waitForCompletion(cf);
		}
	}

	@Override
	public void onAborting() {
		LOGGER.info("onAborting");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
				actHandler.onAborting();
				cf.complete(true);
				return null;
			});
			
			waitForCompletion(cf);
		}
	}

	@Override
	public void onClearing() {
		LOGGER.info("onClearing");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
				actHandler.onClearing();
				cf.complete(true);
				return null;
			});
			
			waitForCompletion(cf);
		}
	}

	@Override
	public void onStopping() {
		LOGGER.info("onStopping");
		if (actHandler != null) {
			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
			
			executor.submit(()-> {
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
		LOGGER.info("onStopped");	
		if (waitHandler != null) {
			waitHandler.onStopped();
			
//			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
//			
//			executor.submit(()-> {
//				waitHandler.onStopped();
//				cf.complete(true);
//				return null;
//			});
//			
//			waitForCompletion(cf);
		}			
	};

	@Override
	public void onIdle() {
		LOGGER.info("onIdle");	
		if (waitHandler != null) {
			waitHandler.onIdle();
			
//			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
//			
//			executor.submit(()-> {
//				waitHandler.onIdle();
//				cf.complete(true);
//				return null;
//			});
//			
//			waitForCompletion(cf);
		}	
	};

	@Override
	public void onComplete() {
		LOGGER.info("onComplete");
		if (waitHandler != null) {
			waitHandler.onComplete();
			
//			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
//			
//			executor.submit(()-> {
//				waitHandler.onComplete();
//				cf.complete(true);
//				return null;
//			});
//			
//			waitForCompletion(cf);
		}	
	};
	
	@Override
	public void onHeld() {
		LOGGER.info("onHeld");		
		if (waitHandler != null) {
			waitHandler.onHeld();
			
//			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
//			
//			executor.submit(()-> {
//				waitHandler.onHeld();
//				cf.complete(true);
//				return null;
//			});
//			
//			waitForCompletion(cf);
		}	
	};

	@Override
	public void onSuspended() {
		LOGGER.info("onSuspended");
		if (waitHandler != null) {
			waitHandler.onSuspended();
			
//			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
//			
//			executor.submit(()-> {
//				waitHandler.onSuspended();
//				cf.complete(true);
//				return null;
//			});
//			
//			waitForCompletion(cf);
		}	
	};

	@Override
	public void onAborted() {
		LOGGER.info("onAborted");		
		if (waitHandler != null) {
			waitHandler.onAborted();
			
//			CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
//			
//			executor.submit(()-> {
//				waitHandler.onAborted();
//				cf.complete(true);
//				return null;
//			});
//			
//			waitForCompletion(cf);
		}	
	};

}
