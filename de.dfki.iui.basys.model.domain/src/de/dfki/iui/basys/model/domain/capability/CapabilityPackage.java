/**
 */
package de.dfki.iui.basys.model.domain.capability;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSERTION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSERTION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 1;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.ManufacturingCapabilityImpl <em>Manufacturing Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.ManufacturingCapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getManufacturingCapability()
	 * @generated
	 */
	int MANUFACTURING_CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY__BINDING = CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY__ID = CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY__METADATA = CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Manufacturing Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manufacturing Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.FügenImpl <em>Fügen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.FügenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getFügen()
	 * @generated
	 */
	int FÜGEN = 3;

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
	int AN_EINPRESSEN = 11;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.PressenImpl <em>Pressen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.PressenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getPressen()
	 * @generated
	 */
	int PRESSEN = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSEN__BINDING = AN_EINPRESSEN__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSEN__ID = AN_EINPRESSEN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSEN__NAME = AN_EINPRESSEN__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSEN__METADATA = AN_EINPRESSEN__METADATA;

	/**
	 * The feature id for the '<em><b>Druck</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSEN__DRUCK = AN_EINPRESSEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSEN__HUB = AN_EINPRESSEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pressen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSEN_FEATURE_COUNT = AN_EINPRESSEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pressen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSEN_OPERATION_COUNT = AN_EINPRESSEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.QoSCapabilityImpl <em>Qo SCapability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.QoSCapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getQoSCapability()
	 * @generated
	 */
	int QO_SCAPABILITY = 5;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.UrformenImpl <em>Urformen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.UrformenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getUrformen()
	 * @generated
	 */
	int URFORMEN = 6;

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
	int UMFORMEN = 7;

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
	int TRENNEN = 8;

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
	int BESCHICHTEN = 9;

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
	int STOFFEIGENSCHAFTEN = 10;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.SchraubenImpl <em>Schrauben</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.SchraubenImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getSchrauben()
	 * @generated
	 */
	int SCHRAUBEN = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRAUBEN__BINDING = AN_EINPRESSEN__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRAUBEN__ID = AN_EINPRESSEN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRAUBEN__NAME = AN_EINPRESSEN__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRAUBEN__METADATA = AN_EINPRESSEN__METADATA;

	/**
	 * The feature id for the '<em><b>Drehmoment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRAUBEN__DREHMOMENT = AN_EINPRESSEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schrauben</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRAUBEN_FEATURE_COUNT = AN_EINPRESSEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schrauben</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRAUBEN_OPERATION_COUNT = AN_EINPRESSEN_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.InformationTransferCapabilityImpl <em>Information Transfer Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.InformationTransferCapabilityImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getInformationTransferCapability()
	 * @generated
	 */
	int INFORMATION_TRANSFER_CAPABILITY = 13;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_CAPABILITY__BINDING = CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_CAPABILITY__ID = CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_CAPABILITY__METADATA = CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Information Transfer Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Information Transfer Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.capability.impl.ProvideInformationImpl <em>Provide Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.capability.impl.ProvideInformationImpl
	 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getProvideInformation()
	 * @generated
	 */
	int PROVIDE_INFORMATION = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE_INFORMATION__BINDING = INFORMATION_TRANSFER_CAPABILITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE_INFORMATION__ID = INFORMATION_TRANSFER_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE_INFORMATION__NAME = INFORMATION_TRANSFER_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE_INFORMATION__METADATA = INFORMATION_TRANSFER_CAPABILITY__METADATA;

	/**
	 * The number of structural features of the '<em>Provide Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE_INFORMATION_FEATURE_COUNT = INFORMATION_TRANSFER_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provide Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE_INFORMATION_OPERATION_COUNT = INFORMATION_TRANSFER_CAPABILITY_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Capability
	 * @generated
	 */
	EClass getCapability();

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
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Pressen <em>Pressen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressen</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Pressen
	 * @generated
	 */
	EClass getPressen();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.Pressen#getDruck <em>Druck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Druck</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Pressen#getDruck()
	 * @see #getPressen()
	 * @generated
	 */
	EAttribute getPressen_Druck();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.Pressen#getHub <em>Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hub</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Pressen#getHub()
	 * @see #getPressen()
	 * @generated
	 */
	EAttribute getPressen_Hub();

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
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.Schrauben <em>Schrauben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schrauben</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Schrauben
	 * @generated
	 */
	EClass getSchrauben();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.capability.Schrauben#getDrehmoment <em>Drehmoment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drehmoment</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.Schrauben#getDrehmoment()
	 * @see #getSchrauben()
	 * @generated
	 */
	EAttribute getSchrauben_Drehmoment();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.InformationTransferCapability <em>Information Transfer Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Transfer Capability</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.InformationTransferCapability
	 * @generated
	 */
	EClass getInformationTransferCapability();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.capability.ProvideInformation <em>Provide Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provide Information</em>'.
	 * @see de.dfki.iui.basys.model.domain.capability.ProvideInformation
	 * @generated
	 */
	EClass getProvideInformation();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.PressenImpl <em>Pressen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.PressenImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getPressen()
		 * @generated
		 */
		EClass PRESSEN = eINSTANCE.getPressen();

		/**
		 * The meta object literal for the '<em><b>Druck</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSEN__DRUCK = eINSTANCE.getPressen_Druck();

		/**
		 * The meta object literal for the '<em><b>Hub</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSEN__HUB = eINSTANCE.getPressen_Hub();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.SchraubenImpl <em>Schrauben</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.SchraubenImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getSchrauben()
		 * @generated
		 */
		EClass SCHRAUBEN = eINSTANCE.getSchrauben();

		/**
		 * The meta object literal for the '<em><b>Drehmoment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHRAUBEN__DREHMOMENT = eINSTANCE.getSchrauben_Drehmoment();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.InformationTransferCapabilityImpl <em>Information Transfer Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.InformationTransferCapabilityImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getInformationTransferCapability()
		 * @generated
		 */
		EClass INFORMATION_TRANSFER_CAPABILITY = eINSTANCE.getInformationTransferCapability();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.capability.impl.ProvideInformationImpl <em>Provide Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.capability.impl.ProvideInformationImpl
		 * @see de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl#getProvideInformation()
		 * @generated
		 */
		EClass PROVIDE_INFORMATION = eINSTANCE.getProvideInformation();

	}

} //CapabilityPackage
