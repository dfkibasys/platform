package de.dfki.iui.basys.osgi.services;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface ResourceSetProvider {
	ResourceSet getSharedResourceSet();
}
