/**
 */
package de.dfki.cos.basys.platform.model.domain.productinstance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.cos.basys.platform.model.domain.productinstance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductinstanceFactoryImpl extends EFactoryImpl implements ProductinstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductinstanceFactory init() {
		try {
			ProductinstanceFactory theProductinstanceFactory = (ProductinstanceFactory)EPackage.Registry.INSTANCE.getEFactory(ProductinstancePackage.eNS_URI);
			if (theProductinstanceFactory != null) {
				return theProductinstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductinstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductinstanceFactoryImpl() {
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
			case ProductinstancePackage.PRODUCT_INSTANCE: return createProductInstance();
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS: return createProductInstanceStatus();
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS_CHANGE_EVENT: return createProductInstanceStatusChangeEvent();
			case ProductinstancePackage.PRODUCT_INSTANCE_LOCATION: return createProductInstanceLocation();
			case ProductinstancePackage.PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT: return createProductInstanceLocationChangeEvent();
			case ProductinstancePackage.PRODUCT_INSTANCE_STORE: return createProductInstanceStore();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProductinstancePackage.PRODUCT_INSTANCE_DETECTION_ENUM:
				return createProductInstanceDetectionEnumFromString(eDataType, initialValue);
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS_ENUM:
				return createProductInstanceStatusEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProductinstancePackage.PRODUCT_INSTANCE_DETECTION_ENUM:
				return convertProductInstanceDetectionEnumToString(eDataType, instanceValue);
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS_ENUM:
				return convertProductInstanceStatusEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance createProductInstance() {
		ProductInstanceImpl productInstance = new ProductInstanceImpl();
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceStatus createProductInstanceStatus() {
		ProductInstanceStatusImpl productInstanceStatus = new ProductInstanceStatusImpl();
		return productInstanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceStatusChangeEvent createProductInstanceStatusChangeEvent() {
		ProductInstanceStatusChangeEventImpl productInstanceStatusChangeEvent = new ProductInstanceStatusChangeEventImpl();
		return productInstanceStatusChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceLocation createProductInstanceLocation() {
		ProductInstanceLocationImpl productInstanceLocation = new ProductInstanceLocationImpl();
		return productInstanceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceLocationChangeEvent createProductInstanceLocationChangeEvent() {
		ProductInstanceLocationChangeEventImpl productInstanceLocationChangeEvent = new ProductInstanceLocationChangeEventImpl();
		return productInstanceLocationChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceStore createProductInstanceStore() {
		ProductInstanceStoreImpl productInstanceStore = new ProductInstanceStoreImpl();
		return productInstanceStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceDetectionEnum createProductInstanceDetectionEnumFromString(EDataType eDataType, String initialValue) {
		ProductInstanceDetectionEnum result = ProductInstanceDetectionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductInstanceDetectionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceStatusEnum createProductInstanceStatusEnumFromString(EDataType eDataType, String initialValue) {
		ProductInstanceStatusEnum result = ProductInstanceStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductInstanceStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductinstancePackage getProductinstancePackage() {
		return (ProductinstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductinstancePackage getPackage() {
		return ProductinstancePackage.eINSTANCE;
	}

} //ProductinstanceFactoryImpl
