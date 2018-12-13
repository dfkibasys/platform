/**
 */
package de.dfki.cos.basys.platform.model.domain.capability.impl;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.capability.Capability;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest;
import de.dfki.cos.basys.platform.model.util.BasysEObjectImpl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.CapabilityRequestImpl#getWho <em>Who</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.CapabilityRequestImpl#getWhat <em>What</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.CapabilityRequestImpl#getWhom <em>Whom</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.CapabilityRequestImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.CapabilityRequestImpl#getWhen <em>When</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.CapabilityRequestImpl#getHow <em>How</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityRequestImpl extends BasysEObjectImpl implements CapabilityRequest {
	/**
	 * The cached value of the '{@link #getWho() <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected Entity who;

	/**
	 * The cached value of the '{@link #getWhat() <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected Capability what;

	/**
	 * The cached value of the '{@link #getWhom() <em>Whom</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhom()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> whom;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> where;

	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final Date WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Date when = WHEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHow() <em>How</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHow()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> how;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWho(Entity newWho, NotificationChain msgs) {
		Entity oldWho = who;
		who = newWho;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY_REQUEST__WHO, oldWho, newWho);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWho(Entity newWho) {
		if (newWho != who) {
			NotificationChain msgs = null;
			if (who != null)
				msgs = ((InternalEObject)who).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.CAPABILITY_REQUEST__WHO, null, msgs);
			if (newWho != null)
				msgs = ((InternalEObject)newWho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.CAPABILITY_REQUEST__WHO, null, msgs);
			msgs = basicSetWho(newWho, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY_REQUEST__WHO, newWho, newWho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getWhat() {
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhat(Capability newWhat, NotificationChain msgs) {
		Capability oldWhat = what;
		what = newWhat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY_REQUEST__WHAT, oldWhat, newWhat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhat(Capability newWhat) {
		if (newWhat != what) {
			NotificationChain msgs = null;
			if (what != null)
				msgs = ((InternalEObject)what).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.CAPABILITY_REQUEST__WHAT, null, msgs);
			if (newWhat != null)
				msgs = ((InternalEObject)newWhat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.CAPABILITY_REQUEST__WHAT, null, msgs);
			msgs = basicSetWhat(newWhat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY_REQUEST__WHAT, newWhat, newWhat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getWhom() {
		if (whom == null) {
			whom = new EObjectResolvingEList<Entity>(Entity.class, this, CapabilityPackage.CAPABILITY_REQUEST__WHOM);
		}
		return whom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getWhere() {
		if (where == null) {
			where = new EObjectResolvingEList<Entity>(Entity.class, this, CapabilityPackage.CAPABILITY_REQUEST__WHERE);
		}
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Date newWhen) {
		Date oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY_REQUEST__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getHow() {
		if (how == null) {
			how = new EObjectResolvingEList<Entity>(Entity.class, this, CapabilityPackage.CAPABILITY_REQUEST__HOW);
		}
		return how;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_REQUEST__WHO:
				return basicSetWho(null, msgs);
			case CapabilityPackage.CAPABILITY_REQUEST__WHAT:
				return basicSetWhat(null, msgs);
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
			case CapabilityPackage.CAPABILITY_REQUEST__WHO:
				return getWho();
			case CapabilityPackage.CAPABILITY_REQUEST__WHAT:
				return getWhat();
			case CapabilityPackage.CAPABILITY_REQUEST__WHOM:
				return getWhom();
			case CapabilityPackage.CAPABILITY_REQUEST__WHERE:
				return getWhere();
			case CapabilityPackage.CAPABILITY_REQUEST__WHEN:
				return getWhen();
			case CapabilityPackage.CAPABILITY_REQUEST__HOW:
				return getHow();
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
			case CapabilityPackage.CAPABILITY_REQUEST__WHO:
				setWho((Entity)newValue);
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__WHAT:
				setWhat((Capability)newValue);
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__WHOM:
				getWhom().clear();
				getWhom().addAll((Collection<? extends Entity>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__WHERE:
				getWhere().clear();
				getWhere().addAll((Collection<? extends Entity>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__WHEN:
				setWhen((Date)newValue);
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__HOW:
				getHow().clear();
				getHow().addAll((Collection<? extends Entity>)newValue);
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
			case CapabilityPackage.CAPABILITY_REQUEST__WHO:
				setWho((Entity)null);
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__WHAT:
				setWhat((Capability)null);
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__WHOM:
				getWhom().clear();
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__WHERE:
				getWhere().clear();
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__WHEN:
				setWhen(WHEN_EDEFAULT);
				return;
			case CapabilityPackage.CAPABILITY_REQUEST__HOW:
				getHow().clear();
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
			case CapabilityPackage.CAPABILITY_REQUEST__WHO:
				return who != null;
			case CapabilityPackage.CAPABILITY_REQUEST__WHAT:
				return what != null;
			case CapabilityPackage.CAPABILITY_REQUEST__WHOM:
				return whom != null && !whom.isEmpty();
			case CapabilityPackage.CAPABILITY_REQUEST__WHERE:
				return where != null && !where.isEmpty();
			case CapabilityPackage.CAPABILITY_REQUEST__WHEN:
				return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
			case CapabilityPackage.CAPABILITY_REQUEST__HOW:
				return how != null && !how.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (when: ");
		result.append(when);
		result.append(')');
		return result.toString();
	}

} //CapabilityRequestImpl
