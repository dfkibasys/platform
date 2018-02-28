/**
 */
package de.dfki.iui.basys.model.util;

import java.util.Date;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.product.util.ProductResourceFactoryImpl
 * @generated NOT
 */
public class BasysResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated NOT
	 */
	public BasysResourceImpl(URI uri) {
		super(uri);
		setIntrinsicIDToEObjectMap(new HashMap<String,EObject>());
	}
	
	@Override
	public EObject getEObject(String uriFragment) {
		/*
		 *  TODO 
		 *  1. Prüfe, ob Objekt lokal verfügbar und Haltbarkeitsdatum noch gültig
		 *  2. falls ja: gebe Objekt zurück => super.getEObject(uriFragment);
		 *  3. falls nein: Frage Objekt von REST-Schnittstelle (erneut) ab
		 */
		
		EObject result = super.getEObject(uriFragment);
//		if (result != null) {
//			if (result instanceof Entity) {
//				Entity e = (Entity)result;
//				if (e.getMetadata() != null) {
//					Date expires = e.getMetadata().getExpiryDate();
//					if (expires.before(new Date())) {	
//						//this.eSetProxyURI(cachedProxyURI);
//						//return true;
//						return result;
//					} else {
//						unloaded((InternalEObject)result);
//					}
//				}				
//			}	
//		}

		return result;			
		
	}
	

} //ProductResourceImpl
