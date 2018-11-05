/**
 */
package de.dfki.iui.basys.model.domain.processdefinition.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.processdefinition.Edge;
import de.dfki.iui.basys.model.domain.processdefinition.Node;
import de.dfki.iui.basys.model.domain.processdefinition.ProcessDefinition;
import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage;

import de.dfki.iui.basys.model.domain.productdefinition.ProductVariant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.ProcessDefinitionImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.ProcessDefinitionImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.ProcessDefinitionImpl#getProductVariant <em>Product Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessDefinitionImpl extends EntityImpl implements ProcessDefinition {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getProductVariant() <em>Product Variant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVariant()
	 * @generated
	 * @ordered
	 */
	protected ProductVariant productVariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.PROCESS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, ProcessdefinitionPackage.PROCESS_DEFINITION__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, ProcessdefinitionPackage.PROCESS_DEFINITION__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductVariant getProductVariant() {
		if (productVariant != null && productVariant.eIsProxy()) {
			InternalEObject oldProductVariant = (InternalEObject)productVariant;
			productVariant = (ProductVariant)eResolveProxy(oldProductVariant);
			if (productVariant != oldProductVariant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessdefinitionPackage.PROCESS_DEFINITION__PRODUCT_VARIANT, oldProductVariant, productVariant));
			}
		}
		return productVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductVariant basicGetProductVariant() {
		return productVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVariant(ProductVariant newProductVariant) {
		ProductVariant oldProductVariant = productVariant;
		productVariant = newProductVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.PROCESS_DEFINITION__PRODUCT_VARIANT, oldProductVariant, productVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessdefinitionPackage.PROCESS_DEFINITION__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case ProcessdefinitionPackage.PROCESS_DEFINITION__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessdefinitionPackage.PROCESS_DEFINITION__NODES:
				return getNodes();
			case ProcessdefinitionPackage.PROCESS_DEFINITION__EDGES:
				return getEdges();
			case ProcessdefinitionPackage.PROCESS_DEFINITION__PRODUCT_VARIANT:
				if (resolve) return getProductVariant();
				return basicGetProductVariant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessdefinitionPackage.PROCESS_DEFINITION__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case ProcessdefinitionPackage.PROCESS_DEFINITION__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case ProcessdefinitionPackage.PROCESS_DEFINITION__PRODUCT_VARIANT:
				setProductVariant((ProductVariant)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcessdefinitionPackage.PROCESS_DEFINITION__NODES:
				getNodes().clear();
				return;
			case ProcessdefinitionPackage.PROCESS_DEFINITION__EDGES:
				getEdges().clear();
				return;
			case ProcessdefinitionPackage.PROCESS_DEFINITION__PRODUCT_VARIANT:
				setProductVariant((ProductVariant)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcessdefinitionPackage.PROCESS_DEFINITION__NODES:
				return nodes != null && !nodes.isEmpty();
			case ProcessdefinitionPackage.PROCESS_DEFINITION__EDGES:
				return edges != null && !edges.isEmpty();
			case ProcessdefinitionPackage.PROCESS_DEFINITION__PRODUCT_VARIANT:
				return productVariant != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessDefinitionImpl
