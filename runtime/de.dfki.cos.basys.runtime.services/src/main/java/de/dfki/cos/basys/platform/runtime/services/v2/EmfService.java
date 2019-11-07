package de.dfki.cos.basys.platform.runtime.services.v2;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface EmfService {

	<T extends EObject> T getEntity(String id);

	void deleteEntity(String id);

	<T extends EObject> List<T> getAllEntities(EClass type, boolean pruneSearchOnMatch);

	<T extends EObject> T getFirstEntity(EClass type);

	EObject findEntity(String property, String value);

}