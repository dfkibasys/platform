/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.domain.product.ProductGroup;
import de.dfki.iui.basys.model.domain.product.ProductPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProductGroupImpl extends IdentifiableEntityImpl implements ProductGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_GROUP;
	}

} //ProductGroupImpl
