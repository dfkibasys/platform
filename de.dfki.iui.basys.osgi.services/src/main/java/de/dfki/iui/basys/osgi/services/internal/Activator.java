package de.dfki.iui.basys.osgi.services.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Extension of the default OSGi bundle activator
 */
public final class Activator implements BundleActivator {

	/**
	 * Called whenever the OSGi framework starts our bundle
	 */
	public void start(BundleContext bc) throws Exception {
		System.out.println("STARTING de.dfki.iui.basys.service.catalogue");
	}

	/**
	 * Called whenever the OSGi framework stops our bundle
	 */
	public void stop(BundleContext bc) throws Exception {
		System.out.println("STOPPING de.dfki.iui.basys.service.catalogue");
	}
}
