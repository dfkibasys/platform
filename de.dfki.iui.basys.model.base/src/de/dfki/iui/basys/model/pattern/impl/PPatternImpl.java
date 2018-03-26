/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.basys.model.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.basys.model.base.computation.Matches;
import de.dfki.iui.basys.model.base.computation.MatchReport.MatchResult;
import de.dfki.iui.basys.model.pattern.PPattern;
import de.dfki.iui.basys.model.pattern.PQuantorEnum;
import de.dfki.iui.basys.model.pattern.PatternPackage;
import de.dfki.iui.basys.model.util.BasysEObjectImpl;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PPattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PPatternImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PPatternImpl#getInstIdx <em>Inst Idx</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.pattern.impl.PPatternImpl#getQuantor <em>Quantor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PPatternImpl extends BasysEObjectImpl implements PPattern {
	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstIdx() <em>Inst Idx</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInstIdx()
	 * @generated
	 * @ordered
	 */
	protected static final int INST_IDX_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getInstIdx() <em>Inst Idx</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInstIdx()
	 * @generated
	 * @ordered
	 */
	protected int instIdx = INST_IDX_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantor() <em>Quantor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQuantor()
	 * @generated
	 * @ordered
	 */
	protected static final PQuantorEnum QUANTOR_EDEFAULT = PQuantorEnum.EXISTS;

	/**
	 * The cached value of the '{@link #getQuantor() <em>Quantor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQuantor()
	 * @generated
	 * @ordered
	 */
	protected PQuantorEnum quantor = QUANTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PPATTERN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PPATTERN__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInstIdx() {
		return instIdx;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstIdx(int newInstIdx) {
		int oldInstIdx = instIdx;
		instIdx = newInstIdx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PPATTERN__INST_IDX, oldInstIdx, instIdx));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PQuantorEnum getQuantor() {
		return quantor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantor(PQuantorEnum newQuantor) {
		PQuantorEnum oldQuantor = quantor;
		quantor = newQuantor == null ? QUANTOR_EDEFAULT : newQuantor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PPATTERN__QUANTOR, oldQuantor, quantor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean matches(final Object object) {
		return Matches.matches(object, this).result == MatchResult.MATCH_SUCCESS;
	}

	// public boolean matches(Object object, MatchReport report) {
	// return Matches.matches(object, this, report)
	// }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	abstract public EObject createSkeleton();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	abstract public PPattern unify(PPattern ppatt);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.PPATTERN__VAR_NAME:
				return getVarName();
			case PatternPackage.PPATTERN__INST_IDX:
				return getInstIdx();
			case PatternPackage.PPATTERN__QUANTOR:
				return getQuantor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternPackage.PPATTERN__VAR_NAME:
				setVarName((String)newValue);
				return;
			case PatternPackage.PPATTERN__INST_IDX:
				setInstIdx((Integer)newValue);
				return;
			case PatternPackage.PPATTERN__QUANTOR:
				setQuantor((PQuantorEnum)newValue);
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
			case PatternPackage.PPATTERN__VAR_NAME:
				setVarName(VAR_NAME_EDEFAULT);
				return;
			case PatternPackage.PPATTERN__INST_IDX:
				setInstIdx(INST_IDX_EDEFAULT);
				return;
			case PatternPackage.PPATTERN__QUANTOR:
				setQuantor(QUANTOR_EDEFAULT);
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
			case PatternPackage.PPATTERN__VAR_NAME:
				return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
			case PatternPackage.PPATTERN__INST_IDX:
				return instIdx != INST_IDX_EDEFAULT;
			case PatternPackage.PPATTERN__QUANTOR:
				return quantor != QUANTOR_EDEFAULT;
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
			case PatternPackage.PPATTERN___MATCHES__OBJECT:
				return matches(arguments.get(0));
			case PatternPackage.PPATTERN___CREATE_SKELETON:
				return createSkeleton();
			case PatternPackage.PPATTERN___UNIFY__PPATTERN:
				return unify((PPattern)arguments.get(0));
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
		result.append(" (varName: ");
		result.append(varName);
		result.append(", instIdx: ");
		result.append(instIdx);
		result.append(", quantor: ");
		result.append(quantor);
		result.append(')');
		return result.toString();
	}

} // PPatternImpl
