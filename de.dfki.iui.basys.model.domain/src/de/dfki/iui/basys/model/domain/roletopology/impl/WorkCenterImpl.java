/**
 */
package de.dfki.iui.basys.model.domain.roletopology.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage;
import de.dfki.iui.basys.model.domain.roletopology.WorkCenter;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class WorkCenterImpl extends EntityImpl implements WorkCenter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkCenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoletopologyPackage.Literals.WORK_CENTER;
	}

} //WorkCenterImpl
