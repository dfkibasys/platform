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
			case LinebalancingPackage.WM_PATH_TIME: return createWMPathTime();
			case LinebalancingPackage.STATIC_WORLD_MODEL: return createStaticWorldModel();
			case LinebalancingPackage.WM_PRODUCT_INSTANCE: return createWMProductInstance();
			case LinebalancingPackage.WM_RESOURCE_INSTANCE: return createWMResourceInstance();
			case LinebalancingPackage.WORLD_MODEL: return createWorldModel();
			case LinebalancingPackage.WM_PATH_TIMES: return createWMPathTimes();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMPathTime createWMPathTime() {
		WMPathTimeImpl wmPathTime = new WMPathTimeImpl();
		return wmPathTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticWorldModel createStaticWorldModel() {
		StaticWorldModelImpl staticWorldModel = new StaticWorldModelImpl();
		return staticWorldModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMProductInstance createWMProductInstance() {
		WMProductInstanceImpl wmProductInstance = new WMProductInstanceImpl();
		return wmProductInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMResourceInstance createWMResourceInstance() {
		WMResourceInstanceImpl wmResourceInstance = new WMResourceInstanceImpl();
		return wmResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldModel createWorldModel() {
		WorldModelImpl worldModel = new WorldModelImpl();
		return worldModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMPathTimes createWMPathTimes() {
		WMPathTimesImpl wmPathTimes = new WMPathTimesImpl();
		return wmPathTimes;
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
