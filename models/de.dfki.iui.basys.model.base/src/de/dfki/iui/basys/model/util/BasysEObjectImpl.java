package de.dfki.iui.basys.model.util;

import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container;

import de.dfki.iui.basys.model.base.BaseFactory;
import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.base.Metadata;

public class BasysEObjectImpl extends Container {
	
	protected URI cachedProxyURI = null;
	
	@Override
	public boolean eIsProxy() {
		return super.eIsProxy() || eNeedsRefresh(); 
	}
		
	public boolean eNeedsRefresh() {
		if (cachedProxyURI == null)
			return false;
		if (this instanceof Entity) {
			Entity e = (Entity)this;
			if (e.getMetadata() != null) {
				Date expires = e.getMetadata().getExpiryDate();
				if (expires.before(new Date())) {	
					this.eSetProxyURI(cachedProxyURI);
					return true;
				}				
			}				
		}	
		
		return false;
	}	
	
	@Override	
	public EObject eResolveProxy(InternalEObject proxy) {
		
		//FIXME: Methode kann entfallen, Logik in BasysResourceImpl.getEObject(uriFragment) verschieben.
		
		//TODO: hier ggf. die ProxyURL überschreiben -> URIConverter?
				
		EObject resolved = super.eResolveProxy(proxy);
		
//		if (resolved == proxy) {			
//			EClass eClass = proxy.eClass();
//			String id = proxy.eProxyURI().fragment();		
//					
//			//TODO: query a webservice for instance with ID id; for now, simulate answer
//			resolved = eClass.getEPackage().getEFactoryInstance().create(eClass);
//			
//			((BasysEObjectImpl)resolved).cachedProxyURI = proxy.eProxyURI();
//			
//			Metadata metadata = BaseFactory.eINSTANCE.createMetadata();
//			metadata.setCreator("Daniel");
//			metadata.setCreationDate(new Date());
//			//20 seconds 
//			metadata.setExpiryDate(new Date(metadata.getCreationDate().getTime() + 20 * 1000L));
//			
//
//			resolved.eSet(eClass.getEStructuralFeature("id"), id);
//			resolved.eSet(eClass.getEStructuralFeature("name"), id + " " + metadata.getExpiryDate().toString());
//			resolved.eSet(eClass.getEStructuralFeature("metadata"), metadata);
//			
//		}
		
		return resolved;
	}
	
}
