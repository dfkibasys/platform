/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.domain.product.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ProductFactoryImpl extends EFactoryImpl implements ProductFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductFactory init() {
		try {
			ProductFactory theProductFactory = (ProductFactory)EPackage.Registry.INSTANCE.getEFactory(ProductPackage.eNS_URI);
			if (theProductFactory != null) {
				return theProductFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactoryImpl() {
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
			case ProductPackage.PRODUCT_GROUP: return createProductGroup();
			case ProductPackage.PRODUCT_VARIANT: return createProductVariant();
			case ProductPackage.PRODUCT_INSTANCE: return createProductInstance();
			case ProductPackage.PRODUCT_INSTANCE_STATUS: return createProductInstanceStatus();
			case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT: return createProductInstanceStatusEvent();
			case ProductPackage.PRODUCT_INSTANCE_LOCATION: return createProductInstanceLocation();
			case ProductPackage.PRODUCT_INSTANCE_LOCATION_EVENT: return createProductInstanceLocationEvent();
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
			case ProductPackage.PRODUCT_INSTANCE_DETECTION_ENUM:
				return createProductInstanceDetectionEnumFromString(eDataType, initialValue);
			case ProductPackage.PRODUCT_INSTANCE_STATUS_ENUM:
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
			case ProductPackage.PRODUCT_INSTANCE_DETECTION_ENUM:
				return convertProductInstanceDetectionEnumToString(eDataType, instanceValue);
			case ProductPackage.PRODUCT_INSTANCE_STATUS_ENUM:
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
	public ProductGroup createProductGroup() {
		ProductGroupImpl productGroup = new ProductGroupImpl();
		return productGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductVariant createProductVariant() {
		ProductVariantImpl productVariant = new ProductVariantImpl();
		return productVariant;
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
	public ProductInstanceStatusEvent createProductInstanceStatusEvent() {
		ProductInstanceStatusEventImpl productInstanceStatusEvent = new ProductInstanceStatusEventImpl();
		return productInstanceStatusEvent;
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
	public ProductInstanceLocationEvent createProductInstanceLocationEvent() {
		ProductInstanceLocationEventImpl productInstanceLocationEvent = new ProductInstanceLocationEventImpl();
		return productInstanceLocationEvent;
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
	public ProductPackage getProductPackage() {
		return (ProductPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductPackage getPackage() {
		return ProductPackage.eINSTANCE;
	}

} //ProductFactoryImpl
