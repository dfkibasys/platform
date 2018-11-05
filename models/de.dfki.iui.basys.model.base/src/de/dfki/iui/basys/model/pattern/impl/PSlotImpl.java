/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.basys.model.pattern.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.basys.model.pattern.PEmptySlot;
import de.dfki.iui.basys.model.pattern.PObject;
import de.dfki.iui.basys.model.pattern.PPattern;
import de.dfki.iui.basys.model.pattern.PSlot;
import de.dfki.iui.basys.model.pattern.PValue;
import de.dfki.iui.basys.model.pattern.PatternPackage;
import de.dfki.iui.basys.model.util.BasysEObjectImpl;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PSlot</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PSlotImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PSlotImpl#getRange <em>Range</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PSlotImpl#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSlotImpl extends BasysEObjectImpl implements PSlot {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<PPattern> range;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PSLOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.PSLOT__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PSLOT__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PPattern> getRange() {
		if (range == null) {
			range = new EObjectContainmentEList<PPattern>(PPattern.class, this, PatternPackage.PSLOT__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getFeatureName() {
		if (getFeature() != null)
			return getFeature().getName();
		else
			return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public PValue getRangeValue() {
		if (getFeature() instanceof EAttribute && !getRange().isEmpty() && !(getRange().get(0) instanceof PEmptySlot))
			return (PValue) (getRange().get(0));
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<PValue> getRangeValues() {
		if (getFeature() instanceof EAttribute) {
			EList result = new BasicEList<PValue>();
			result.addAll(getRange());
			return result;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public PObject getRangeObject() {
		if (getFeature() instanceof EReference && !getRange().isEmpty())
			return (PObject) (getRange().get(0));
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<PObject> getRangeObjects() {
		if (getFeature() instanceof EReference) {
			EList result = new BasicEList<PObject>();
			result.addAll(getRange());
			return result;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSlot unify(final PSlot bg) {
		PSlot co = this;
		
		// 1) compare the features
		EStructuralFeature fCo = getFeature(),
						   fBg = bg.getFeature();
		EPackage pCo = fCo.getEContainingClass().getEPackage();
		EPackage pBg = fBg.getEContainingClass().getEPackage();
		if ( !(fCo.equals( fBg ) || pCo.getName().equals( pBg.getName() ) || pCo.getNsPrefix().equals( pBg.getNsPrefix() ) || pCo.getNsURI().equals( pBg.getNsURI() )) ) {
			return null;
		}
		
		// 2) unify all range patterns dependent on the feature 'type'
		if ( fCo.isMany() ) {
			// In this case the semantics of many-feature slots is considered to be an existential manner:
			// Assume the PSlot has n many range patterns: p1, p2, .., pn. Then the semantics for an instance is considered to be: p1 or p2 or .. or pn
			// If there is another PSlot with m many range patterns: q1, q2, .., qm and the second PSlot has to be satisfied as well then
			// all patterns of the first PSLot can be distributed over the patterns of the second PSlot.
			List< PPattern > unifiedRange = new ArrayList<>( bg.getRange().size() * co.getRange().size() );
			if ( bg.getRange().isEmpty() ) {
				unifiedRange.addAll( co.getRange() );
			} else if ( co.getRange().isEmpty() ) {
				unifiedRange.addAll( bg.getRange() );
			} else {
				PPattern tmp;
				for ( PPattern pattBg : bg.getRange() ) {
					for ( PPattern pattCo : co.getRange() ) {
						if ( (tmp = pattCo.unify( pattBg )) != null ) {
							unifiedRange.add( tmp );
						} else {
							// some range pattern did not unify -> it is ok since it was only one alternative
						}
					}
				}
				if ( unifiedRange.isEmpty() ) {
					return null;	// there is no alternative which could be true -> stop unification
				}
			}
			
			co.getRange().clear();
			co.getRange().addAll( unifiedRange );
		} else {
			// In case of a non-many feature only the range patterns are considered to be conjuncted and have to be unified to one single pattern.
			PPattern range = null;
			for ( PPattern pattBg : bg.getRange() ) {
				if ( range == null ) {
					range = pattBg;
				} else {
					if ( (range = range.unify( pattBg )) == null ) {
						return null;		// some range pattern did not unify -> stop unification
					}
				}
			}
			for ( PPattern pattCo : co.getRange() ) {
				if ( range == null ) {
					range = pattCo;
				} else {
					if ( (range = range.unify( pattCo )) == null ) {
						return null;		// some range pattern did not unify -> stop unification
					}
				}
			}
			if ( range != null ) {
				co.getRange().clear();
				co.getRange().add( range );
			}
		}
		
		return co;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.PSLOT__RANGE:
				return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.PSLOT__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case PatternPackage.PSLOT__RANGE:
				return getRange();
			case PatternPackage.PSLOT__FEATURE_NAME:
				return getFeatureName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternPackage.PSLOT__FEATURE:
				setFeature((EStructuralFeature)newValue);
				return;
			case PatternPackage.PSLOT__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends PPattern>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternPackage.PSLOT__FEATURE:
				setFeature((EStructuralFeature)null);
				return;
			case PatternPackage.PSLOT__RANGE:
				getRange().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternPackage.PSLOT__FEATURE:
				return feature != null;
			case PatternPackage.PSLOT__RANGE:
				return range != null && !range.isEmpty();
			case PatternPackage.PSLOT__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? getFeatureName() != null : !FEATURE_NAME_EDEFAULT.equals(getFeatureName());
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
			case PatternPackage.PSLOT___GET_RANGE_VALUE:
				return getRangeValue();
			case PatternPackage.PSLOT___GET_RANGE_VALUES:
				return getRangeValues();
			case PatternPackage.PSLOT___GET_RANGE_OBJECT:
				return getRangeObject();
			case PatternPackage.PSLOT___GET_RANGE_OBJECTS:
				return getRangeObjects();
			case PatternPackage.PSLOT___UNIFY__PSLOT:
				return unify((PSlot)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // PSlotImpl
