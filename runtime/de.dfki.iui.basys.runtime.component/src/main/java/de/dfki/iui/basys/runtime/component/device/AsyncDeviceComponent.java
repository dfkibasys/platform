package de.dfki.iui.basys.runtime.component.device;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;


public abstract class AsyncDeviceComponent extends DeviceComponent {


	protected boolean stopping = false;
	
	private Lock lock;
	private Condition executeCondition;
	private Condition stoppingCondition;

	public AsyncDeviceComponent(ComponentConfiguration config) {
		super(config);
		lock = new ReentrantLock();
		executeCondition = lock.newCondition();
		stoppingCondition = lock.newCondition();
	}


	public void onExecuteAsync() {
		
	}
	
	public void afterExecuteComplete() {
		
	}

	public void onStoppingAsync() {
		
	}
	
	public void afterStoppingComplete() {
		
	}
	
	
	
	public void signalExecuteComplete() {
		lock.lock();
		executeCondition.signalAll();
		lock.unlock();
	}
	
	public void signalStoppingComplete() {
		lock.lock();
		stoppingCondition.signalAll();
		lock.unlock();
	}
	
	

	/*
	 * default ActiveStatesHandler implementation -> trigger logic on device
	 */


	@Override
	public void onExecute() {
		System.out.println("onExecute");

		onExecuteAsync();
		
		lock.lock();
		try {
			executeCondition.await();
			
			if (stopping) {
				System.out.println("onExecute - stopping");
				stopping = false;
				return;
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		} finally {
			lock.unlock();
		}

		afterExecuteComplete();
		
		System.out.println("onExecute - completing");
	}



	@Override
	public void onStopping() {
		LOGGER.info("onStopping");
		System.out.println("onStopping");
		
		stopping = true; // for leaving onExecute without invoking afterExecuteComplete()
		onStoppingAsync();
		
		lock.lock();
		try {
			stoppingCondition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
		afterStoppingComplete();
		
		System.out.println("onStopping - stopped");
	}
	
}
