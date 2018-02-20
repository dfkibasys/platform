/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.basys.model.pattern.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.basys.model.base.datatypes.BDataType;
import de.dfki.iui.basys.model.pattern.PRestriction;
import de.dfki.iui.basys.model.pattern.PRestrictions;
import de.dfki.iui.basys.model.pattern.PRestrictionsEnum;
import de.dfki.iui.basys.model.pattern.PValueGen;
import de.dfki.iui.basys.model.pattern.PatternFactory;
import de.dfki.iui.basys.model.pattern.PatternPackage;
import de.dfki.iui.basys.model.util.BasysEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PRestrictions</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PRestrictionsImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PRestrictionsImpl#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PRestrictionsImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRestrictionsImpl extends BasysEObjectImpl implements PRestrictions {
	/**
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected EList<PRestriction<?, ?>> restriction;

	/**
	 * The cached value of the '{@link #getRestrictions() <em>Restrictions</em>}
	 * ' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getRestrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<PRestrictions> restrictions;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final PRestrictionsEnum FUNCTION_EDEFAULT = PRestrictionsEnum.AND;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected PRestrictionsEnum function = FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PRestrictionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PRESTRICTIONS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PRestriction<?, ?>> getRestriction() {
		if (restriction == null) {
			restriction = new EObjectContainmentEList<PRestriction<?, ?>>(PRestriction.class, this, PatternPackage.PRESTRICTIONS__RESTRICTION);
		}
		return restriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PRestrictions> getRestrictions() {
		if (restrictions == null) {
			restrictions = new EObjectContainmentEList<PRestrictions>(PRestrictions.class, this, PatternPackage.PRESTRICTIONS__RESTRICTIONS);
		}
		return restrictions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRestrictionsEnum getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(PRestrictionsEnum newFunction) {
		PRestrictionsEnum oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PRESTRICTIONS__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDefaultValue(final Object defVal_) {
		Object defVal = defVal_;
				PRestrictionsEnum f = getFunction();
				List<PValueGen> gens = new ArrayList<PValueGen>(getRestriction());
				gens.addAll(getRestrictions());
				for (PValueGen gen : gens) {
					defVal = gen.getDefaultValue(defVal);
					Class<?> instanceClass = ((PValueImpl) gen.eContainer().eContainer()).getType().getInstanceClass();
					if (instanceClass != null && instanceClass.getSuperclass() == BDataType.class) {
						try {
							BDataType<?> newInstance = (BDataType<?>) instanceClass.newInstance();
							newInstance.setValue(defVal.toString());
							defVal = newInstance;
						} catch (SecurityException | InstantiationException | IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
		
					if (defVal == null) {
						switch (f) {
						case AND:
							// in this case all values have to be non null
							return null;
						default:
							break;
						}
					} else {
						switch (f) {
						case OR:
							// in this case only the first value can be used
							return defVal;
						default:
							break;
						}
					}
				}
				return defVal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRestrictions unify(final PRestrictions bg) {
		PRestrictions co = this;
		
		PRestriction< ?, ? > urest = null,
							 tmp;
		PRestrictions urests = null,
					  tmp2;
		boolean broken = false;
		switch ( co.getFunction() ) {
			case AND:
				switch ( bg.getFunction() ) {
					case AND:
						// unify all restrictions to get only one restriction
						loop1 : for ( List<?> rlist : new List<?>[]{ co.getRestriction(), bg.getRestriction() } ) {
							for ( Object r : rlist ) {
								tmp = (PRestriction< ?, ? >) r;
								if ( urest == null ) {
									urest = tmp;
								} else {
									urest = urest.unify( tmp );
									if ( urest == null ) {
										co = null;
										broken = true;
										break loop1;
									}
								}
							}
						}
						if ( !broken ) {
							loop1 : for ( List<?> rlist : new List<?>[]{ co.getRestrictions(), bg.getRestrictions() } ) {
								for ( Object r : rlist ) {
									tmp2 = (PRestrictions) r;
									if ( urests == null ) {
										urests = tmp2;
									} else {
										urests = urests.unify( tmp2 );
										if ( urests == null ) {
											co = null;
											broken = true;
											break loop1;
										}
									}
								}
							}
						}
						if ( !broken ) {
							if ( urest != null ) {
								co.getRestriction().clear();
								co.getRestriction().add( urest );
							}
							if ( urests != null ) {
								co.getRestrictions().clear();
								co.getRestrictions().add( urests );
							}
						}
						break;
					case OR:
						// TODO: implement a distribution of AND over OR restrictions 
						break;
					default:
						break;
				}
				break;
			case OR:
				switch ( bg.getFunction() ) {
					case AND:
						// TODO: implement a distribution of OR over AND restrictions
						break;
					case OR:
						co.getRestriction().addAll( bg.getRestriction() );
						co.getRestrictions().addAll( bg.getRestrictions() );
						break;
					default:
						break;
				}
				break;
			default:
				break;
		}
		
		if ( co == null ) {
			// some unification did not work -> provide general result
			PRestrictions newRests = PatternFactory.eINSTANCE.createPRestrictions();
			newRests.setFunction( PRestrictionsEnum.AND );
			for (PRestrictions prests : new PRestrictions[]{ co, bg }) {
				if ( prests != null ) {
					newRests.getRestrictions().add( prests );
				}
			}
			return newRests;
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
			case PatternPackage.PRESTRICTIONS__RESTRICTION:
				return ((InternalEList<?>)getRestriction()).basicRemove(otherEnd, msgs);
			case PatternPackage.PRESTRICTIONS__RESTRICTIONS:
				return ((InternalEList<?>)getRestrictions()).basicRemove(otherEnd, msgs);
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
			case PatternPackage.PRESTRICTIONS__RESTRICTION:
				return getRestriction();
			case PatternPackage.PRESTRICTIONS__RESTRICTIONS:
				return getRestrictions();
			case PatternPackage.PRESTRICTIONS__FUNCTION:
				return getFunction();
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
			case PatternPackage.PRESTRICTIONS__RESTRICTION:
				getRestriction().clear();
				getRestriction().addAll((Collection<? extends PRestriction<?, ?>>)newValue);
				return;
			case PatternPackage.PRESTRICTIONS__RESTRICTIONS:
				getRestrictions().clear();
				getRestrictions().addAll((Collection<? extends PRestrictions>)newValue);
				return;
			case PatternPackage.PRESTRICTIONS__FUNCTION:
				setFunction((PRestrictionsEnum)newValue);
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
			case PatternPackage.PRESTRICTIONS__RESTRICTION:
				getRestriction().clear();
				return;
			case PatternPackage.PRESTRICTIONS__RESTRICTIONS:
				getRestrictions().clear();
				return;
			case PatternPackage.PRESTRICTIONS__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
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
			case PatternPackage.PRESTRICTIONS__RESTRICTION:
				return restriction != null && !restriction.isEmpty();
			case PatternPackage.PRESTRICTIONS__RESTRICTIONS:
				return restrictions != null && !restrictions.isEmpty();
			case PatternPackage.PRESTRICTIONS__FUNCTION:
				return function != FUNCTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PatternPackage.PRESTRICTIONS___GET_DEFAULT_VALUE__OBJECT:
				return getDefaultValue(arguments.get(0));
			case PatternPackage.PRESTRICTIONS___UNIFY__PRESTRICTIONS:
				return unify((PRestrictions)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (function: ");
		result.append(function);
		result.append(')');
		return result.toString();
	}

} // PRestrictionsImpl
