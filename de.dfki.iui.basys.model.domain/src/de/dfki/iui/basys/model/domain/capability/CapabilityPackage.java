/**
 */
package de.dfki.iui.basys.model.domain.capability;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.dfki.iui.basys.model.domain.capability.CapabilityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface CapabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "capability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/capability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "capability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapabilityPackage eINSTANCE = de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.CapabilityAssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityAssertionImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getCapabilityAssertion()
	 * @generated
	 */
	int CAPABILITY_ASSERTION = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSERTION__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSERTION__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSERTION__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSERTION__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSERTION__PATTERN = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSERTION__PREREQUISITES = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSERTION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSERTION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.CapabilityRequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityRequestImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getCapabilityRequest()
	 * @generated
	 */
	int CAPABILITY_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__WHO = 0;

	/**
	 * The feature id for the '<em><b>What</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__WHAT = 1;

	/**
	 * The feature id for the '<em><b>Whom</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__WHOM = 2;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__WHERE = 3;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__WHEN = 4;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__HOW = 5;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.HandlingCapabilityImpl <em>Handling Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.HandlingCapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getHandlingCapability()
	 * @generated
	 */
	int HANDLING_CAPABILITY = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLING_CAPABILITY__BINDING = CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLING_CAPABILITY__ID = CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLING_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLING_CAPABILITY__METADATA = CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Handling Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLING_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Handling Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLING_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.ProductionCapabilityImpl <em>Production Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.ProductionCapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getProductionCapability()
	 * @generated
	 */
	int PRODUCTION_CAPABILITY = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CAPABILITY__BINDING = CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CAPABILITY__ID = CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CAPABILITY__METADATA = CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Production Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Production Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.ManufacturingCapabilityImpl <em>Manufacturing Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.ManufacturingCapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getManufacturingCapability()
	 * @generated
	 */
	int MANUFACTURING_CAPABILITY = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY__BINDING = PRODUCTION_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY__ID = PRODUCTION_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY__NAME = PRODUCTION_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY__METADATA = PRODUCTION_CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Manufacturing Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_FEATURE_COUNT = PRODUCTION_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manufacturing Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_OPERATION_COUNT = PRODUCTION_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.FügenImpl <em>Fügen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.FügenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getFügen()
	 * @generated
	 */
	int FÜGEN = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FÜGEN__BINDING = MANUFACTURING_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FÜGEN__ID = MANUFACTURING_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FÜGEN__NAME = MANUFACTURING_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FÜGEN__METADATA = MANUFACTURING_CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Fügen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FÜGEN_FEATURE_COUNT = MANUFACTURING_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fügen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FÜGEN_OPERATION_COUNT = MANUFACTURING_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.AnEinpressenImpl <em>An Einpressen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.AnEinpressenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getAnEinpressen()
	 * @generated
	 */
	int AN_EINPRESSEN = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_EINPRESSEN__BINDING = FÜGEN__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_EINPRESSEN__ID = FÜGEN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_EINPRESSEN__NAME = FÜGEN__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_EINPRESSEN__METADATA = FÜGEN__METADATA;

	/**
	 * The number of structural features of the '<em>An Einpressen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_EINPRESSEN_FEATURE_COUNT = FÜGEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>An Einpressen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_EINPRESSEN_OPERATION_COUNT = FÜGEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.PressingImpl <em>Pressing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.PressingImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getPressing()
	 * @generated
	 */
	int PRESSING = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSING__BINDING = AN_EINPRESSEN__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSING__ID = AN_EINPRESSEN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSING__NAME = AN_EINPRESSEN__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSING__METADATA = AN_EINPRESSEN__METADATA;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSING__PRESSURE = AN_EINPRESSEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSING__STROKE = AN_EINPRESSEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pressing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSING_FEATURE_COUNT = AN_EINPRESSEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pressing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSING_OPERATION_COUNT = AN_EINPRESSEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.QoSCapabilityImpl <em>Qo SCapability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.QoSCapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getQoSCapability()
	 * @generated
	 */
	int QO_SCAPABILITY = 19;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.InspectImpl <em>Inspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.InspectImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getInspect()
	 * @generated
	 */
	int INSPECT = 20;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum <em>Load Carrier Unit Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getLoadCarrierUnitEnum()
	 * @generated
	 */
	int LOAD_CARRIER_UNIT_ENUM = 24;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.UrformenImpl <em>Urformen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.UrformenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getUrformen()
	 * @generated
	 */
	int URFORMEN = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URFORMEN__BINDING = MANUFACTURING_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URFORMEN__ID = MANUFACTURING_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URFORMEN__NAME = MANUFACTURING_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URFORMEN__METADATA = MANUFACTURING_CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Urformen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URFORMEN_FEATURE_COUNT = MANUFACTURING_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Urformen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URFORMEN_OPERATION_COUNT = MANUFACTURING_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.UmformenImpl <em>Umformen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.UmformenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getUmformen()
	 * @generated
	 */
	int UMFORMEN = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMFORMEN__BINDING = MANUFACTURING_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMFORMEN__ID = MANUFACTURING_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMFORMEN__NAME = MANUFACTURING_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMFORMEN__METADATA = MANUFACTURING_CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Umformen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMFORMEN_FEATURE_COUNT = MANUFACTURING_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Umformen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMFORMEN_OPERATION_COUNT = MANUFACTURING_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.TrennenImpl <em>Trennen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.TrennenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getTrennen()
	 * @generated
	 */
	int TRENNEN = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENNEN__BINDING = MANUFACTURING_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENNEN__ID = MANUFACTURING_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENNEN__NAME = MANUFACTURING_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENNEN__METADATA = MANUFACTURING_CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Trennen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENNEN_FEATURE_COUNT = MANUFACTURING_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trennen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENNEN_OPERATION_COUNT = MANUFACTURING_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.BeschichtenImpl <em>Beschichten</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.BeschichtenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getBeschichten()
	 * @generated
	 */
	int BESCHICHTEN = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHICHTEN__BINDING = MANUFACTURING_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHICHTEN__ID = MANUFACTURING_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHICHTEN__NAME = MANUFACTURING_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHICHTEN__METADATA = MANUFACTURING_CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Beschichten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHICHTEN_FEATURE_COUNT = MANUFACTURING_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Beschichten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHICHTEN_OPERATION_COUNT = MANUFACTURING_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.StoffeigenschaftenImpl <em>Stoffeigenschaften</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.StoffeigenschaftenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getStoffeigenschaften()
	 * @generated
	 */
	int STOFFEIGENSCHAFTEN = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOFFEIGENSCHAFTEN__BINDING = MANUFACTURING_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOFFEIGENSCHAFTEN__ID = MANUFACTURING_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOFFEIGENSCHAFTEN__NAME = MANUFACTURING_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOFFEIGENSCHAFTEN__METADATA = MANUFACTURING_CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Stoffeigenschaften</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOFFEIGENSCHAFTEN_FEATURE_COUNT = MANUFACTURING_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stoffeigenschaften</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOFFEIGENSCHAFTEN_OPERATION_COUNT = MANUFACTURING_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.ScrewingImpl <em>Screwing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.ScrewingImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getScrewing()
	 * @generated
	 */
	int SCREWING = 13;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__BINDING = AN_EINPRESSEN__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__ID = AN_EINPRESSEN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__NAME = AN_EINPRESSEN__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__METADATA = AN_EINPRESSEN__METADATA;

	/**
	 * The feature id for the '<em><b>Torque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__TORQUE = AN_EINPRESSEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Screwing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FEATURE_COUNT = AN_EINPRESSEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Screwing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_OPERATION_COUNT = AN_EINPRESSEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.LogisticsCapabilityImpl <em>Logistics Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.LogisticsCapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getLogisticsCapability()
	 * @generated
	 */
	int LOGISTICS_CAPABILITY = 15;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY__BINDING = CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY__ID = CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY__METADATA = CAPABILITY__METADATA;

	/**
	 * The feature id for the '<em><b>Load Carrier Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY__CAPACITY = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY__PAYLOAD = CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Logistics Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Logistics Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTICS_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.PickAndPlaceImpl <em>Pick And Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.PickAndPlaceImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getPickAndPlace()
	 * @generated
	 */
	int PICK_AND_PLACE = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE__BINDING = LOGISTICS_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE__ID = LOGISTICS_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE__NAME = LOGISTICS_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE__METADATA = LOGISTICS_CAPABILITY__METADATA;

	/**
	 * The feature id for the '<em><b>Load Carrier Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE__LOAD_CARRIER_UNIT = LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE__CAPACITY = LOGISTICS_CAPABILITY__CAPACITY;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE__PAYLOAD = LOGISTICS_CAPABILITY__PAYLOAD;

	/**
	 * The feature id for the '<em><b>Reach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE__REACH = LOGISTICS_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position Repeatability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE__POSITION_REPEATABILITY = LOGISTICS_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pick And Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_FEATURE_COUNT = LOGISTICS_CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pick And Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_OPERATION_COUNT = LOGISTICS_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.TransportImpl <em>Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.TransportImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getTransport()
	 * @generated
	 */
	int TRANSPORT = 17;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__BINDING = LOGISTICS_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__ID = LOGISTICS_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__NAME = LOGISTICS_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__METADATA = LOGISTICS_CAPABILITY__METADATA;

	/**
	 * The feature id for the '<em><b>Load Carrier Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__LOAD_CARRIER_UNIT = LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__CAPACITY = LOGISTICS_CAPABILITY__CAPACITY;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__PAYLOAD = LOGISTICS_CAPABILITY__PAYLOAD;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__DISTANCE = LOGISTICS_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_FEATURE_COUNT = LOGISTICS_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_OPERATION_COUNT = LOGISTICS_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.StoreImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 18;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__BINDING = LOGISTICS_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ID = LOGISTICS_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NAME = LOGISTICS_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__METADATA = LOGISTICS_CAPABILITY__METADATA;

	/**
	 * The feature id for the '<em><b>Load Carrier Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__LOAD_CARRIER_UNIT = LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__CAPACITY = LOGISTICS_CAPABILITY__CAPACITY;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__PAYLOAD = LOGISTICS_CAPABILITY__PAYLOAD;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = LOGISTICS_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = LOGISTICS_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCAPABILITY__BINDING = CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCAPABILITY__ID = CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCAPABILITY__METADATA = CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Qo SCapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qo SCapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT__BINDING = QO_SCAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT__ID = QO_SCAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT__NAME = QO_SCAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT__METADATA = QO_SCAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Inspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT_FEATURE_COUNT = QO_SCAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT_OPERATION_COUNT = QO_SCAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.WorkerAssistenceCapabilityImpl <em>Worker Assistence Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.WorkerAssistenceCapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getWorkerAssistenceCapability()
	 * @generated
	 */
	int WORKER_ASSISTENCE_CAPABILITY = 21;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ASSISTENCE_CAPABILITY__BINDING = CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ASSISTENCE_CAPABILITY__ID = CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ASSISTENCE_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ASSISTENCE_CAPABILITY__METADATA = CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Worker Assistence Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ASSISTENCE_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Worker Assistence Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ASSISTENCE_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.GeneralCapabilityImpl <em>General Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.GeneralCapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getGeneralCapability()
	 * @generated
	 */
	int GENERAL_CAPABILITY = 22;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY__BINDING = CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY__ID = CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY__METADATA = CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>General Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.MoveToLocationImpl <em>Move To Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.MoveToLocationImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getMoveToLocation()
	 * @generated
	 */
	int MOVE_TO_LOCATION = 23;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_LOCATION__BINDING = GENERAL_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_LOCATION__ID = GENERAL_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_LOCATION__NAME = GENERAL_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_LOCATION__METADATA = GENERAL_CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Move To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_LOCATION_FEATURE_COUNT = GENERAL_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_LOCATION_OPERATION_COUNT = GENERAL_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.CapabilityAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityAssertion
	 * @generated
	 */
	EClass getCapabilityAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.capability.CapabilityAssertion#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityAssertion#getPattern()
	 * @see #getCapabilityAssertion()
	 * @generated
	 */
	EReference getCapabilityAssertion_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.capability.CapabilityAssertion#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prerequisites</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityAssertion#getPrerequisites()
	 * @see #getCapabilityAssertion()
	 * @generated
	 */
	EReference getCapabilityAssertion_Prerequisites();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.CapabilityRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityRequest
	 * @generated
	 */
	EClass getCapabilityRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Who</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getWho()
	 * @see #getCapabilityRequest()
	 * @generated
	 */
	EReference getCapabilityRequest_Who();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getWhat <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>What</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getWhat()
	 * @see #getCapabilityRequest()
	 * @generated
	 */
	EReference getCapabilityRequest_What();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getWhom <em>Whom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Whom</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getWhom()
	 * @see #getCapabilityRequest()
	 * @generated
	 */
	EReference getCapabilityRequest_Whom();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Where</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getWhere()
	 * @see #getCapabilityRequest()
	 * @generated
	 */
	EReference getCapabilityRequest_Where();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getWhen()
	 * @see #getCapabilityRequest()
	 * @generated
	 */
	EAttribute getCapabilityRequest_When();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getHow <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>How</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityRequest#getHow()
	 * @see #getCapabilityRequest()
	 * @generated
	 */
	EReference getCapabilityRequest_How();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.HandlingCapability <em>Handling Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handling Capability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.HandlingCapability
	 * @generated
	 */
	EClass getHandlingCapability();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.ManufacturingCapability <em>Manufacturing Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manufacturing Capability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.ManufacturingCapability
	 * @generated
	 */
	EClass getManufacturingCapability();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Fügen <em>Fügen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fügen</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Fügen
	 * @generated
	 */
	EClass getFügen();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Pressing <em>Pressing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressing</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Pressing
	 * @generated
	 */
	EClass getPressing();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.Pressing#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Pressing#getPressure()
	 * @see #getPressing()
	 * @generated
	 */
	EAttribute getPressing_Pressure();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.Pressing#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Pressing#getStroke()
	 * @see #getPressing()
	 * @generated
	 */
	EAttribute getPressing_Stroke();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.QoSCapability <em>Qo SCapability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SCapability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.QoSCapability
	 * @generated
	 */
	EClass getQoSCapability();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Inspect <em>Inspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspect</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Inspect
	 * @generated
	 */
	EClass getInspect();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.WorkerAssistenceCapability <em>Worker Assistence Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker Assistence Capability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.WorkerAssistenceCapability
	 * @generated
	 */
	EClass getWorkerAssistenceCapability();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.GeneralCapability <em>General Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Capability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.GeneralCapability
	 * @generated
	 */
	EClass getGeneralCapability();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.MoveToLocation <em>Move To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move To Location</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.MoveToLocation
	 * @generated
	 */
	EClass getMoveToLocation();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum <em>Load Carrier Unit Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Load Carrier Unit Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum
	 * @generated
	 */
	EEnum getLoadCarrierUnitEnum();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Urformen <em>Urformen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Urformen</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Urformen
	 * @generated
	 */
	EClass getUrformen();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Umformen <em>Umformen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Umformen</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Umformen
	 * @generated
	 */
	EClass getUmformen();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Trennen <em>Trennen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trennen</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Trennen
	 * @generated
	 */
	EClass getTrennen();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Beschichten <em>Beschichten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beschichten</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Beschichten
	 * @generated
	 */
	EClass getBeschichten();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Stoffeigenschaften <em>Stoffeigenschaften</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stoffeigenschaften</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Stoffeigenschaften
	 * @generated
	 */
	EClass getStoffeigenschaften();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.AnEinpressen <em>An Einpressen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>An Einpressen</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.AnEinpressen
	 * @generated
	 */
	EClass getAnEinpressen();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Screwing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Screwing
	 * @generated
	 */
	EClass getScrewing();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.Screwing#getTorque <em>Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Torque</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Screwing#getTorque()
	 * @see #getScrewing()
	 * @generated
	 */
	EAttribute getScrewing_Torque();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.ProductionCapability <em>Production Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Capability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.ProductionCapability
	 * @generated
	 */
	EClass getProductionCapability();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.LogisticsCapability <em>Logistics Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistics Capability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.LogisticsCapability
	 * @generated
	 */
	EClass getLogisticsCapability();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getLoadCarrierUnit <em>Load Carrier Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Carrier Unit</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getLoadCarrierUnit()
	 * @see #getLogisticsCapability()
	 * @generated
	 */
	EAttribute getLogisticsCapability_LoadCarrierUnit();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getCapacity()
	 * @see #getLogisticsCapability()
	 * @generated
	 */
	EAttribute getLogisticsCapability_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.LogisticsCapability#getPayload()
	 * @see #getLogisticsCapability()
	 * @generated
	 */
	EAttribute getLogisticsCapability_Payload();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.PickAndPlace <em>Pick And Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick And Place</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.PickAndPlace
	 * @generated
	 */
	EClass getPickAndPlace();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.PickAndPlace#getReach <em>Reach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reach</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.PickAndPlace#getReach()
	 * @see #getPickAndPlace()
	 * @generated
	 */
	EAttribute getPickAndPlace_Reach();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.PickAndPlace#getPositionRepeatability <em>Position Repeatability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Repeatability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.PickAndPlace#getPositionRepeatability()
	 * @see #getPickAndPlace()
	 * @generated
	 */
	EAttribute getPickAndPlace_PositionRepeatability();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Transport
	 * @generated
	 */
	EClass getTransport();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.Transport#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Transport#getDistance()
	 * @see #getTransport()
	 * @generated
	 */
	EAttribute getTransport_Distance();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CapabilityFactory getCapabilityFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.CapabilityAssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityAssertionImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getCapabilityAssertion()
		 * @generated
		 */
		EClass CAPABILITY_ASSERTION = eINSTANCE.getCapabilityAssertion();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_ASSERTION__PATTERN = eINSTANCE.getCapabilityAssertion_Pattern();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_ASSERTION__PREREQUISITES = eINSTANCE.getCapabilityAssertion_Prerequisites();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.CapabilityRequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityRequestImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getCapabilityRequest()
		 * @generated
		 */
		EClass CAPABILITY_REQUEST = eINSTANCE.getCapabilityRequest();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REQUEST__WHO = eINSTANCE.getCapabilityRequest_Who();

		/**
		 * The meta object literal for the '<em><b>What</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REQUEST__WHAT = eINSTANCE.getCapabilityRequest_What();

		/**
		 * The meta object literal for the '<em><b>Whom</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REQUEST__WHOM = eINSTANCE.getCapabilityRequest_Whom();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REQUEST__WHERE = eINSTANCE.getCapabilityRequest_Where();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_REQUEST__WHEN = eINSTANCE.getCapabilityRequest_When();

		/**
		 * The meta object literal for the '<em><b>How</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REQUEST__HOW = eINSTANCE.getCapabilityRequest_How();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.HandlingCapabilityImpl <em>Handling Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.HandlingCapabilityImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getHandlingCapability()
		 * @generated
		 */
		EClass HANDLING_CAPABILITY = eINSTANCE.getHandlingCapability();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.ManufacturingCapabilityImpl <em>Manufacturing Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.ManufacturingCapabilityImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getManufacturingCapability()
		 * @generated
		 */
		EClass MANUFACTURING_CAPABILITY = eINSTANCE.getManufacturingCapability();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.FügenImpl <em>Fügen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.FügenImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getFügen()
		 * @generated
		 */
		EClass FÜGEN = eINSTANCE.getFügen();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.PressingImpl <em>Pressing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.PressingImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getPressing()
		 * @generated
		 */
		EClass PRESSING = eINSTANCE.getPressing();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSING__PRESSURE = eINSTANCE.getPressing_Pressure();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSING__STROKE = eINSTANCE.getPressing_Stroke();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.QoSCapabilityImpl <em>Qo SCapability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.QoSCapabilityImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getQoSCapability()
		 * @generated
		 */
		EClass QO_SCAPABILITY = eINSTANCE.getQoSCapability();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.InspectImpl <em>Inspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.InspectImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getInspect()
		 * @generated
		 */
		EClass INSPECT = eINSTANCE.getInspect();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.WorkerAssistenceCapabilityImpl <em>Worker Assistence Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.WorkerAssistenceCapabilityImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getWorkerAssistenceCapability()
		 * @generated
		 */
		EClass WORKER_ASSISTENCE_CAPABILITY = eINSTANCE.getWorkerAssistenceCapability();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.GeneralCapabilityImpl <em>General Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.GeneralCapabilityImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getGeneralCapability()
		 * @generated
		 */
		EClass GENERAL_CAPABILITY = eINSTANCE.getGeneralCapability();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.MoveToLocationImpl <em>Move To Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.MoveToLocationImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getMoveToLocation()
		 * @generated
		 */
		EClass MOVE_TO_LOCATION = eINSTANCE.getMoveToLocation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum <em>Load Carrier Unit Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getLoadCarrierUnitEnum()
		 * @generated
		 */
		EEnum LOAD_CARRIER_UNIT_ENUM = eINSTANCE.getLoadCarrierUnitEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.UrformenImpl <em>Urformen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.UrformenImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getUrformen()
		 * @generated
		 */
		EClass URFORMEN = eINSTANCE.getUrformen();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.UmformenImpl <em>Umformen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.UmformenImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getUmformen()
		 * @generated
		 */
		EClass UMFORMEN = eINSTANCE.getUmformen();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.TrennenImpl <em>Trennen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.TrennenImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getTrennen()
		 * @generated
		 */
		EClass TRENNEN = eINSTANCE.getTrennen();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.BeschichtenImpl <em>Beschichten</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.BeschichtenImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getBeschichten()
		 * @generated
		 */
		EClass BESCHICHTEN = eINSTANCE.getBeschichten();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.StoffeigenschaftenImpl <em>Stoffeigenschaften</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.StoffeigenschaftenImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getStoffeigenschaften()
		 * @generated
		 */
		EClass STOFFEIGENSCHAFTEN = eINSTANCE.getStoffeigenschaften();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.AnEinpressenImpl <em>An Einpressen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.AnEinpressenImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getAnEinpressen()
		 * @generated
		 */
		EClass AN_EINPRESSEN = eINSTANCE.getAnEinpressen();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.ScrewingImpl <em>Screwing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.ScrewingImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getScrewing()
		 * @generated
		 */
		EClass SCREWING = eINSTANCE.getScrewing();

		/**
		 * The meta object literal for the '<em><b>Torque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREWING__TORQUE = eINSTANCE.getScrewing_Torque();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.ProductionCapabilityImpl <em>Production Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.ProductionCapabilityImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getProductionCapability()
		 * @generated
		 */
		EClass PRODUCTION_CAPABILITY = eINSTANCE.getProductionCapability();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.LogisticsCapabilityImpl <em>Logistics Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.LogisticsCapabilityImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getLogisticsCapability()
		 * @generated
		 */
		EClass LOGISTICS_CAPABILITY = eINSTANCE.getLogisticsCapability();

		/**
		 * The meta object literal for the '<em><b>Load Carrier Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT = eINSTANCE.getLogisticsCapability_LoadCarrierUnit();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGISTICS_CAPABILITY__CAPACITY = eINSTANCE.getLogisticsCapability_Capacity();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGISTICS_CAPABILITY__PAYLOAD = eINSTANCE.getLogisticsCapability_Payload();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.PickAndPlaceImpl <em>Pick And Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.PickAndPlaceImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getPickAndPlace()
		 * @generated
		 */
		EClass PICK_AND_PLACE = eINSTANCE.getPickAndPlace();

		/**
		 * The meta object literal for the '<em><b>Reach</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICK_AND_PLACE__REACH = eINSTANCE.getPickAndPlace_Reach();

		/**
		 * The meta object literal for the '<em><b>Position Repeatability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICK_AND_PLACE__POSITION_REPEATABILITY = eINSTANCE.getPickAndPlace_PositionRepeatability();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.TransportImpl <em>Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.TransportImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getTransport()
		 * @generated
		 */
		EClass TRANSPORT = eINSTANCE.getTransport();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT__DISTANCE = eINSTANCE.getTransport_Distance();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.StoreImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

	}

} //CapabilityPackage
