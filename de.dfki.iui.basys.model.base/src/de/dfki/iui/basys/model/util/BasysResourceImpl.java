/**
 */
package de.dfki.iui.basys.model.util;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

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
		// TODO Auto-generated method stub
		return super.getEObject(uriFragment);
	}
	
	
	@Override
	protected EObject getEObjectByID(String id) {
		// TODO Auto-generated method stub
		return super.getEObjectByID(id);
	}

} //ProductResourceImpl
