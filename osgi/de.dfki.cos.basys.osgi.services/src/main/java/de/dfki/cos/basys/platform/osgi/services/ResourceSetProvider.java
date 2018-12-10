package de.dfki.cos.basys.platform.osgi.services;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface ResourceSetProvider {
	ResourceSet getSharedResourceSet();
}
