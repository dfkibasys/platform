package de.dfki.cos.basys.platform.osgi.services.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Extension of the default OSGi bundle activator
 */
public final class Activator implements BundleActivator {

	/**
	 * Called whenever the OSGi framework starts our bundle
	 */
	@Override
	public void start(BundleContext bc) throws Exception {
		System.out.println("******************************************************");
		System.out.println("STARTING de.dfki.iui.basys.osgi.services (BundleID: " + bc.getBundle().getBundleId() + ")");
		System.out.println("******************************************************");
	}

	/**
	 * Called whenever the OSGi framework stops our bundle
	 */
	@Override
	public void stop(BundleContext bc) throws Exception {
		System.out.println("STOPPING de.dfki.iui.basys.osgi.services");
	}
}
