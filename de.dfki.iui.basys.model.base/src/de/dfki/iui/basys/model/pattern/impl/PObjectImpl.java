/**
 */
package de.dfki.iui.basys.model.pattern.impl;

import de.dfki.iui.basys.model.pattern.PObject;
import de.dfki.iui.basys.model.pattern.PPattern;
import de.dfki.iui.basys.model.pattern.PSlot;
import de.dfki.iui.basys.model.pattern.PatternPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PObjectImpl#getSlot <em>Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PObjectImpl extends PPatternImpl implements PObject {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClass type;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<PSlot> slot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.POBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.POBJECT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClass newType) {
		EClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.POBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSlot> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<PSlot>(PSlot.class, this, PatternPackage.POBJECT__SLOT);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSlot getSlot(EStructuralFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPattern unify(final PPattern ppatt) {
		return unify( (PObject) ppatt );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PObject unify(final PObject bg) {
		PObject co = this;
		
		// 1) compare the types
		EClass eclCo = getType(),
			   eclBg = bg.getType();
		EPackage pCo = eclCo.getEPackage();
		EPackage pBg = eclBg.getEPackage();
		
		if ( !(eclCo.equals( eclBg ) || pCo.getName().equals( pBg.getName() ) || pCo.getNsPrefix().equals( pBg.getNsPrefix() ) || pCo.getNsURI().equals( pBg.getNsURI() )) ) {
			return null;
		}
		
		// 2) collect the slots
		Map<EStructuralFeature, List< PSlot >> allSlots = new HashMap<>();
		EStructuralFeature feat;
		PSlot slot;
		for ( EList< ? > slotList : new EList<?>[]{ co.getSlot(), bg.getSlot()} ) {
			for ( Object obj : slotList ) {
				slot = (PSlot) obj;
				feat = slot.getFeature();
				if ( !allSlots.containsKey( feat )) {
					allSlots.put( feat, new ArrayList< PSlot >( 2 ));
				}
				allSlots.get( feat ).add( slot );
			}
		}
		
		// 3) unify all slots with the same feature
		co.getSlot().clear();
		List< PSlot > slots;
		for ( EStructuralFeature f : allSlots.keySet() ) {
			slots = allSlots.get( f );
			slot = slots.get( 0 );
			for ( int i = 1, size = slots.size(); i < size; i++ ) {
				slot = slot.unify( slots.get( i ));
				if ( slot == null ) {
					return null;
				}
			}
			co.getSlot().add( slot );
		}
		return co;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.POBJECT__SLOT:
				return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
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
			case PatternPackage.POBJECT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PatternPackage.POBJECT__SLOT:
				return getSlot();
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
			case PatternPackage.POBJECT__TYPE:
				setType((EClass)newValue);
				return;
			case PatternPackage.POBJECT__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends PSlot>)newValue);
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
			case PatternPackage.POBJECT__TYPE:
				setType((EClass)null);
				return;
			case PatternPackage.POBJECT__SLOT:
				getSlot().clear();
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
			case PatternPackage.POBJECT__TYPE:
				return type != null;
			case PatternPackage.POBJECT__SLOT:
				return slot != null && !slot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PatternPackage.POBJECT___GET_SLOT__ESTRUCTURALFEATURE:
				return getSlot((EStructuralFeature)arguments.get(0));
			case PatternPackage.POBJECT___UNIFY__PPATTERN:
				return unify((PPattern)arguments.get(0));
			case PatternPackage.POBJECT___UNIFY__POBJECT:
				return unify((PObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PObjectImpl
