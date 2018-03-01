/**
 */
package de.dfki.iui.basys.model.runtime.service;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.runtime.service.ServiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/runtime/service";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.service.impl.ServiceDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.service.impl.ServiceDescriptionImpl
	 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getServiceDescription()
	 * @generated
	 */
	int SERVICE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__VERSION = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_TYPE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__PROPERTIES = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__OPERATIONS = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Publications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__PUBLICATIONS = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subscriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SUBSCRIPTIONS = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__DEPENDENCIES = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Managed Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__MANAGED_ENTITIES = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION___GET_EANNOTATION__STRING = EcorePackage.ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_OPERATION_COUNT = EcorePackage.ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.service.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.service.impl.PropertyImpl
	 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EANNOTATIONS = EcorePackage.ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = EcorePackage.ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ORDERED = EcorePackage.ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UNIQUE = EcorePackage.ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_BOUND = EcorePackage.ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_BOUND = EcorePackage.ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MANY = EcorePackage.ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REQUIRED = EcorePackage.ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ETYPE = EcorePackage.ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EGENERIC_TYPE = EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CAPABILITIES = EcorePackage.ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = EcorePackage.ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_EANNOTATION__STRING = EcorePackage.ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = EcorePackage.ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.service.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.service.impl.OperationImpl
	 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EANNOTATIONS = EcorePackage.EOPERATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = EcorePackage.EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ORDERED = EcorePackage.EOPERATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UNIQUE = EcorePackage.EOPERATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LOWER_BOUND = EcorePackage.EOPERATION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UPPER_BOUND = EcorePackage.EOPERATION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MANY = EcorePackage.EOPERATION__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REQUIRED = EcorePackage.EOPERATION__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ETYPE = EcorePackage.EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EGENERIC_TYPE = EcorePackage.EOPERATION__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ECONTAINING_CLASS = EcorePackage.EOPERATION__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ETYPE_PARAMETERS = EcorePackage.EOPERATION__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EPARAMETERS = EcorePackage.EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>EExceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EEXCEPTIONS = EcorePackage.EOPERATION__EEXCEPTIONS;

	/**
	 * The feature id for the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EGENERIC_EXCEPTIONS = EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CAPABILITIES = EcorePackage.EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = EcorePackage.EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_EANNOTATION__STRING = EcorePackage.EOPERATION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_OPERATION_ID = EcorePackage.EOPERATION___GET_OPERATION_ID;

	/**
	 * The operation id for the '<em>Is Override Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_OVERRIDE_OF__EOPERATION = EcorePackage.EOPERATION___IS_OVERRIDE_OF__EOPERATION;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = EcorePackage.EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.service.impl.PublicationImpl <em>Publication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.service.impl.PublicationImpl
	 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getPublication()
	 * @generated
	 */
	int PUBLICATION = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__EANNOTATIONS = EcorePackage.ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__NAME = EcorePackage.ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__ORDERED = EcorePackage.ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__UNIQUE = EcorePackage.ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__LOWER_BOUND = EcorePackage.ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__UPPER_BOUND = EcorePackage.ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__MANY = EcorePackage.ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__REQUIRED = EcorePackage.ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__ETYPE = EcorePackage.ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__EGENERIC_TYPE = EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__CAPABILITIES = EcorePackage.ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_FEATURE_COUNT = EcorePackage.ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION___GET_EANNOTATION__STRING = EcorePackage.ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_OPERATION_COUNT = EcorePackage.ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.service.impl.SubscriptionImpl <em>Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.service.impl.SubscriptionImpl
	 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getSubscription()
	 * @generated
	 */
	int SUBSCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__EANNOTATIONS = EcorePackage.ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__NAME = EcorePackage.ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__ORDERED = EcorePackage.ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__UNIQUE = EcorePackage.ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__LOWER_BOUND = EcorePackage.ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__UPPER_BOUND = EcorePackage.ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__MANY = EcorePackage.ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__REQUIRED = EcorePackage.ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__ETYPE = EcorePackage.ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__EGENERIC_TYPE = EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__CAPABILITIES = EcorePackage.ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FEATURE_COUNT = EcorePackage.ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION___GET_EANNOTATION__STRING = EcorePackage.ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_OPERATION_COUNT = EcorePackage.ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.service.impl.ManagedEntityImpl <em>Managed Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.service.impl.ManagedEntityImpl
	 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getManagedEntity()
	 * @generated
	 */
	int MANAGED_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__EANNOTATIONS = EcorePackage.ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__NAME = EcorePackage.ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__ORDERED = EcorePackage.ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__UNIQUE = EcorePackage.ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__LOWER_BOUND = EcorePackage.ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__UPPER_BOUND = EcorePackage.ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__MANY = EcorePackage.ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__REQUIRED = EcorePackage.ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__ETYPE = EcorePackage.ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__EGENERIC_TYPE = EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Supported Operations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY__SUPPORTED_OPERATIONS = EcorePackage.ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Managed Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY_FEATURE_COUNT = EcorePackage.ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY___GET_EANNOTATION__STRING = EcorePackage.ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Managed Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ENTITY_OPERATION_COUNT = EcorePackage.ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.service.EntityOperationEnum <em>Entity Operation Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.service.EntityOperationEnum
	 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getEntityOperationEnum()
	 * @generated
	 */
	int ENTITY_OPERATION_ENUM = 6;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.service.ServiceTypeEnum <em>Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceTypeEnum
	 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getServiceTypeEnum()
	 * @generated
	 */
	int SERVICE_TYPE_ENUM = 7;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.service.ServiceDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceDescription
	 * @generated
	 */
	EClass getServiceDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.service.ServiceDescription#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceDescription#getVersion()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.service.ServiceDescription#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceDescription#getServiceType()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_ServiceType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.runtime.service.ServiceDescription#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceDescription#getProperties()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.runtime.service.ServiceDescription#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceDescription#getOperations()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.runtime.service.ServiceDescription#getPublications <em>Publications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publications</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceDescription#getPublications()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Publications();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.runtime.service.ServiceDescription#getSubscriptions <em>Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscriptions</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceDescription#getSubscriptions()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Subscriptions();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.runtime.service.ServiceDescription#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceDescription#getDependencies()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.runtime.service.ServiceDescription#getManagedEntities <em>Managed Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managed Entities</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceDescription#getManagedEntities()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ManagedEntities();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.service.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.runtime.service.Property#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.Property#getCapabilities()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Capabilities();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.service.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.runtime.service.Operation#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.Operation#getCapabilities()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Capabilities();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.service.Publication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.Publication
	 * @generated
	 */
	EClass getPublication();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.runtime.service.Publication#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.Publication#getCapabilities()
	 * @see #getPublication()
	 * @generated
	 */
	EReference getPublication_Capabilities();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.service.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.Subscription
	 * @generated
	 */
	EClass getSubscription();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.runtime.service.Subscription#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.Subscription#getCapabilities()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_Capabilities();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.service.ManagedEntity <em>Managed Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Managed Entity</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ManagedEntity
	 * @generated
	 */
	EClass getManagedEntity();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.basys.model.runtime.service.ManagedEntity#getSupportedOperations <em>Supported Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Operations</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ManagedEntity#getSupportedOperations()
	 * @see #getManagedEntity()
	 * @generated
	 */
	EAttribute getManagedEntity_SupportedOperations();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.runtime.service.EntityOperationEnum <em>Entity Operation Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Operation Enum</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.EntityOperationEnum
	 * @generated
	 */
	EEnum getEntityOperationEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.runtime.service.ServiceTypeEnum <em>Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Enum</em>'.
	 * @see de.dfki.iui.basys.model.runtime.service.ServiceTypeEnum
	 * @generated
	 */
	EEnum getServiceTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.service.impl.ServiceDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.service.impl.ServiceDescriptionImpl
		 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getServiceDescription()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION = eINSTANCE.getServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__VERSION = eINSTANCE.getServiceDescription_Version();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__SERVICE_TYPE = eINSTANCE.getServiceDescription_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__PROPERTIES = eINSTANCE.getServiceDescription_Properties();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__OPERATIONS = eINSTANCE.getServiceDescription_Operations();

		/**
		 * The meta object literal for the '<em><b>Publications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__PUBLICATIONS = eINSTANCE.getServiceDescription_Publications();

		/**
		 * The meta object literal for the '<em><b>Subscriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SUBSCRIPTIONS = eINSTANCE.getServiceDescription_Subscriptions();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__DEPENDENCIES = eINSTANCE.getServiceDescription_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Managed Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__MANAGED_ENTITIES = eINSTANCE.getServiceDescription_ManagedEntities();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.service.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.service.impl.PropertyImpl
		 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CAPABILITIES = eINSTANCE.getProperty_Capabilities();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.service.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.service.impl.OperationImpl
		 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CAPABILITIES = eINSTANCE.getOperation_Capabilities();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.service.impl.PublicationImpl <em>Publication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.service.impl.PublicationImpl
		 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getPublication()
		 * @generated
		 */
		EClass PUBLICATION = eINSTANCE.getPublication();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION__CAPABILITIES = eINSTANCE.getPublication_Capabilities();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.service.impl.SubscriptionImpl <em>Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.service.impl.SubscriptionImpl
		 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getSubscription()
		 * @generated
		 */
		EClass SUBSCRIPTION = eINSTANCE.getSubscription();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__CAPABILITIES = eINSTANCE.getSubscription_Capabilities();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.service.impl.ManagedEntityImpl <em>Managed Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.service.impl.ManagedEntityImpl
		 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getManagedEntity()
		 * @generated
		 */
		EClass MANAGED_ENTITY = eINSTANCE.getManagedEntity();

		/**
		 * The meta object literal for the '<em><b>Supported Operations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_ENTITY__SUPPORTED_OPERATIONS = eINSTANCE.getManagedEntity_SupportedOperations();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.service.EntityOperationEnum <em>Entity Operation Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.service.EntityOperationEnum
		 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getEntityOperationEnum()
		 * @generated
		 */
		EEnum ENTITY_OPERATION_ENUM = eINSTANCE.getEntityOperationEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.service.ServiceTypeEnum <em>Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.service.ServiceTypeEnum
		 * @see de.dfki.iui.basys.model.runtime.service.impl.ServicePackageImpl#getServiceTypeEnum()
		 * @generated
		 */
		EEnum SERVICE_TYPE_ENUM = eINSTANCE.getServiceTypeEnum();

	}

} //ServicePackage
