/**
 */
package de.dfki.iui.basys.model.domain.linebalancing.impl;

import de.dfki.iui.basys.model.domain.linebalancing.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinebalancingFactoryImpl extends EFactoryImpl implements LinebalancingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LinebalancingFactory init() {
		try {
			LinebalancingFactory theLinebalancingFactory = (LinebalancingFactory)EPackage.Registry.INSTANCE.getEFactory(LinebalancingPackage.eNS_URI);
			if (theLinebalancingFactory != null) {
				return theLinebalancingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LinebalancingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebalancingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LinebalancingPackage.LB_PRODUCT_INSTANCE: return createLBProductInstance();
			case LinebalancingPackage.LB_STAFF: return createLBStaff();
			case LinebalancingPackage.LB_LOCATIONS: return createLBLocations();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LBProductInstance createLBProductInstance() {
		LBProductInstanceImpl lbProductInstance = new LBProductInstanceImpl();
		return lbProductInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LBStaff createLBStaff() {
		LBStaffImpl lbStaff = new LBStaffImpl();
		return lbStaff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LBLocations createLBLocations() {
		LBLocationsImpl lbLocations = new LBLocationsImpl();
		return lbLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebalancingPackage getLinebalancingPackage() {
		return (LinebalancingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LinebalancingPackage getPackage() {
		return LinebalancingPackage.eINSTANCE;
	}

} //LinebalancingFactoryImpl
