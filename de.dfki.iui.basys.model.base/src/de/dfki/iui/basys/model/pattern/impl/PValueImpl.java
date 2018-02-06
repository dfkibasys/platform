/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.basys.model.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.basys.model.pattern.PPattern;
import de.dfki.iui.basys.model.pattern.PRestrictions;
import de.dfki.iui.basys.model.pattern.PValue;
import de.dfki.iui.basys.model.pattern.PValueObject;
import de.dfki.iui.basys.model.pattern.PatternFactory;
import de.dfki.iui.basys.model.pattern.PatternPackage;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PValue</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.dfki.iui.basys.model.pattern.impl.PValueImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link de.dfki.iui.basys.model.pattern.impl.PValueImpl#getRestrictions
 * <em>Restrictions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PValueImpl extends PPatternImpl implements PValue {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EDataType type;

	/**
	 * The cached value of the '{@link #getRestrictions()
	 * <em>Restrictions</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRestrictions()
	 * @generated
	 * @ordered
	 */
	protected PRestrictions restrictions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PVALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EDataType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.PVALUE__TYPE, oldType,
							type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setType(EDataType newType) {
		EDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PVALUE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PRestrictions getRestrictions() {
		return restrictions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRestrictions(PRestrictions newRestrictions, NotificationChain msgs) {
		PRestrictions oldRestrictions = restrictions;
		restrictions = newRestrictions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternPackage.PVALUE__RESTRICTIONS, oldRestrictions, newRestrictions);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setRestrictions(PRestrictions newRestrictions) {
		if (newRestrictions != restrictions) {
			NotificationChain msgs = null;
			if (restrictions != null)
				msgs = ((InternalEObject) restrictions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PatternPackage.PVALUE__RESTRICTIONS, null, msgs);
			if (newRestrictions != null)
				msgs = ((InternalEObject) newRestrictions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PatternPackage.PVALUE__RESTRICTIONS, null, msgs);
			msgs = basicSetRestrictions(newRestrictions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PVALUE__RESTRICTIONS, newRestrictions,
					newRestrictions));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EObject createSkeleton() {
		Object value = null;
		if (getRestrictions() != null) {
			value = getRestrictions().getDefaultValue(null);
		} else {
			try {
				String cls = this.getType().getInstanceClass().getCanonicalName();

				if (cls.equals("int")) {
					value = new Integer(0);
				} else if (cls.equals("boolean")) {
					value = new Boolean(false);
				} else {
					value = this.getType().getInstanceClass().newInstance();
				}

			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block

				System.out.println(this.getType().getName());
				System.out.println(this.getType().getInstanceClass().getCanonicalName());
				e.printStackTrace();
			}
		}
		if (value != null) {
			PValueObject obj = PatternFactory.eINSTANCE.createPValueObject();
			obj.setValue(value);
			return obj;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PPattern unify(final PPattern ppatt) {
		return unify((PValue) ppatt);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PValue unify(final PValue bg) {
		PValue co = this;

		// 1) compare types; they must be equal
		EDataType dtCo = co.getType(), dtBg = bg.getType();
		EPackage pCo = dtCo.getEPackage();
		EPackage pBg = dtBg.getEPackage();
		if (!(dtCo.equals(dtBg) || pCo.getName().equals(pBg.getName()) || pCo.getNsPrefix().equals(pBg.getNsPrefix())
				|| pCo.getNsURI().equals(pBg.getNsURI()))) {
			return null;
		}

		// 2) add the restrictions of the background to the restrictions of the
		// covering
		co.setRestrictions(co.getRestrictions().unify(bg.getRestrictions()));

		return co;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PatternPackage.PVALUE__RESTRICTIONS:
			return basicSetRestrictions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PatternPackage.PVALUE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case PatternPackage.PVALUE__RESTRICTIONS:
			return getRestrictions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PatternPackage.PVALUE__TYPE:
			setType((EDataType) newValue);
			return;
		case PatternPackage.PVALUE__RESTRICTIONS:
			setRestrictions((PRestrictions) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PatternPackage.PVALUE__TYPE:
			setType((EDataType) null);
			return;
		case PatternPackage.PVALUE__RESTRICTIONS:
			setRestrictions((PRestrictions) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PatternPackage.PVALUE__TYPE:
			return type != null;
		case PatternPackage.PVALUE__RESTRICTIONS:
			return restrictions != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PatternPackage.PVALUE___CREATE_SKELETON:
			return createSkeleton();
		case PatternPackage.PVALUE___UNIFY__PPATTERN:
			return unify((PPattern) arguments.get(0));
		case PatternPackage.PVALUE___UNIFY__PVALUE:
			return unify((PValue) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // PValueImpl
