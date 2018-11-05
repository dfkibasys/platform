/**
 */
package de.dfki.iui.basys.model.domain.workplan;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage
 * @generated
 */
public interface WorkplanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkplanFactory eINSTANCE = de.dfki.iui.basys.model.domain.workplan.impl.WorkplanFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	WorkplanInstance createWorkplanInstance();

	/**
	 * Returns a new object of class '<em>Workstep Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workstep Instance</em>'.
	 * @generated
	 */
	WorkstepInstance createWorkstepInstance();

	/**
	 * Returns a new object of class '<em>Workstep Instance Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workstep Instance Status</em>'.
	 * @generated
	 */
	WorkstepInstanceStatus createWorkstepInstanceStatus();

	/**
	 * Returns a new object of class '<em>Workstep Instance Status Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workstep Instance Status Change Event</em>'.
	 * @generated
	 */
	WorkstepInstanceStatusChangeEvent createWorkstepInstanceStatusChangeEvent();

	/**
	 * Returns a new object of class '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration</em>'.
	 * @generated
	 */
	Duration createDuration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkplanPackage getWorkplanPackage();

} //WorkplanFactory
