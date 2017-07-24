/**
 */
package de.dfki.iui.basys.model.domain;

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
 * @see de.dfki.iui.basys.model.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = de.dfki.iui.basys.model.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.DynamicLineBalancingResultImpl <em>Dynamic Line Balancing Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.DynamicLineBalancingResultImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getDynamicLineBalancingResult()
	 * @generated
	 */
	int DYNAMIC_LINE_BALANCING_RESULT = 0;

	/**
	 * The number of structural features of the '<em>Dynamic Line Balancing Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LINE_BALANCING_RESULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dynamic Line Balancing Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LINE_BALANCING_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.InstructionImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__DESCRIPTION = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__PARAMETERS = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Workstep Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__WORKSTEP_IDS = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.MaterialImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__NAME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.MediaImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__TYPE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__FILE_SIZE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__CHECKSUM = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__LOCATION = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__ENTITY_TYPE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entity Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__ENTITY_IDS = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__TAGS = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__LOCALE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.AudioImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 4;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__METADATA = MEDIA__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__ID = MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__TYPE = MEDIA__TYPE;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__FILE_SIZE = MEDIA__FILE_SIZE;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__CHECKSUM = MEDIA__CHECKSUM;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__LOCATION = MEDIA__LOCATION;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__ENTITY_TYPE = MEDIA__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Entity Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__ENTITY_IDS = MEDIA__ENTITY_IDS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__TAGS = MEDIA__TAGS;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__LOCALE = MEDIA__LOCALE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__DURATION = MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OPERATION_COUNT = MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.VideoImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__METADATA = MEDIA__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ID = MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TYPE = MEDIA__TYPE;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__FILE_SIZE = MEDIA__FILE_SIZE;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__CHECKSUM = MEDIA__CHECKSUM;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__LOCATION = MEDIA__LOCATION;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ENTITY_TYPE = MEDIA__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Entity Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ENTITY_IDS = MEDIA__ENTITY_IDS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TAGS = MEDIA__TAGS;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__LOCALE = MEDIA__LOCALE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DURATION = MEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__WIDTH = MEDIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__HEIGHT = MEDIA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = MEDIA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.ImageImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 6;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__METADATA = MEDIA__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TYPE = MEDIA__TYPE;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FILE_SIZE = MEDIA__FILE_SIZE;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CHECKSUM = MEDIA__CHECKSUM;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LOCATION = MEDIA__LOCATION;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ENTITY_TYPE = MEDIA__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Entity Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ENTITY_IDS = MEDIA__ENTITY_IDS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TAGS = MEDIA__TAGS;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LOCALE = MEDIA__LOCALE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = MEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = MEDIA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.OrderImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 7;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Variant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__VARIANT_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__START_DATE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__END_DATE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PIECES = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRIORITY = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.OrderStatusImpl <em>Order Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.OrderStatusImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getOrderStatus()
	 * @generated
	 */
	int ORDER_STATUS = 8;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__ORDER_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__STATUS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Piece Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__PIECE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Order Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Order Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.ProductGroupImpl <em>Product Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.ProductGroupImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductGroup()
	 * @generated
	 */
	int PRODUCT_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The number of structural features of the '<em>Product Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.ProductVariantImpl <em>Product Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.ProductVariantImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductVariant()
	 * @generated
	 */
	int PRODUCT_VARIANT = 10;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__NAME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__PRODUCT_GROUP_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Product Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.ProductInstanceImpl <em>Product Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.ProductInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductInstance()
	 * @generated
	 */
	int PRODUCT_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Product Variant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__PRODUCT_VARIANT_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__ORDER_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__SERIAL_NUMBER = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.ProductInstanceStatusImpl <em>Product Instance Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.ProductInstanceStatusImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductInstanceStatus()
	 * @generated
	 */
	int PRODUCT_INSTANCE_STATUS = 12;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__STATUS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Workstep Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.ProductRecognitionImpl <em>Product Recognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.ProductRecognitionImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductRecognition()
	 * @generated
	 */
	int PRODUCT_RECOGNITION = 13;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION__TYPE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION__PRODUCT_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION__COMPONENT_ID = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.ResourceInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getResourceInstance()
	 * @generated
	 */
	int RESOURCE_INSTANCE = 14;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__NAME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__TYPE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__PROPERTIES = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.StaffImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 15;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__FIRSTNAME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__LASTNAME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__BIRTHDATE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__LANGUAGE = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.StaffRecognitionImpl <em>Staff Recognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.StaffRecognitionImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getStaffRecognition()
	 * @generated
	 */
	int STAFF_RECOGNITION = 16;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION__TYPE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worker Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION__WORKER_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION__COMPONENT_ID = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Staff Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Staff Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_RECOGNITION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.StaffSkillsImpl <em>Staff Skills</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.StaffSkillsImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getStaffSkills()
	 * @generated
	 */
	int STAFF_SKILLS = 17;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Worker Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__WORKER_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS__SKILLS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Staff Skills</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Staff Skills</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILLS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.StaffSkillImpl <em>Staff Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.StaffSkillImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getStaffSkill()
	 * @generated
	 */
	int STAFF_SKILL = 18;

	/**
	 * The feature id for the '<em><b>Workstep Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILL__WORKSTEP_ID = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILL__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Preference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILL__PREFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Staff Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Staff Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.WorkplanImpl <em>Workplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.WorkplanImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getWorkplan()
	 * @generated
	 */
	int WORKPLAN = 19;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Product Variant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN__PRODUCT_VARIANT_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workstep Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN__WORKSTEP_IDS = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Workplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKPLAN_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.WorkstepImpl <em>Workstep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.WorkstepImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getWorkstep()
	 * @generated
	 */
	int WORKSTEP = 20;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__NAME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__DURATION = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__BOM = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__REQUIREMENTS = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Workstep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Workstep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.CapabilityRequirementImpl <em>Capability Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.CapabilityRequirementImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getCapabilityRequirement()
	 * @generated
	 */
	int CAPABILITY_REQUIREMENT = 21;

	/**
	 * The number of structural features of the '<em>Capability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUIREMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Capability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.BOMImpl <em>BOM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.BOMImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getBOM()
	 * @generated
	 */
	int BOM = 22;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>BOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.BOMEntryImpl <em>BOM Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.BOMEntryImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getBOMEntry()
	 * @generated
	 */
	int BOM_ENTRY = 23;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_ENTRY__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Material Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_ENTRY__MATERIAL_ID = 1;

	/**
	 * The number of structural features of the '<em>BOM Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BOM Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.WorkstepInstanceImpl <em>Workstep Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.WorkstepInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getWorkstepInstance()
	 * @generated
	 */
	int WORKSTEP_INSTANCE = 24;

	/**
	 * The feature id for the '<em><b>Workstep Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__WORKSTEP_ID = 0;

	/**
	 * The feature id for the '<em><b>Resource Instance Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE__RESOURCE_INSTANCE_IDS = 1;

	/**
	 * The number of structural features of the '<em>Workstep Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Workstep Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.impl.TemperatureReadingImpl <em>Temperature Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.impl.TemperatureReadingImpl
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getTemperatureReading()
	 * @generated
	 */
	int TEMPERATURE_READING = 25;

	/**
	 * The feature id for the '<em><b>Measured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_READING__MEASURED_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Temperature Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_READING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Temperature Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_READING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.RecognitionEnum <em>Recognition Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.RecognitionEnum
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getRecognitionEnum()
	 * @generated
	 */
	int RECOGNITION_ENUM = 26;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.PreferenceEnum <em>Preference Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.PreferenceEnum
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getPreferenceEnum()
	 * @generated
	 */
	int PREFERENCE_ENUM = 27;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.OrderStatusEnum <em>Order Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.OrderStatusEnum
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getOrderStatusEnum()
	 * @generated
	 */
	int ORDER_STATUS_ENUM = 28;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.ProductInstanceStatusEnum <em>Product Instance Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.ProductInstanceStatusEnum
	 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductInstanceStatusEnum()
	 * @generated
	 */
	int PRODUCT_INSTANCE_STATUS_ENUM = 29;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.DynamicLineBalancingResult <em>Dynamic Line Balancing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Line Balancing Result</em>'.
	 * @see de.dfki.iui.basys.model.domain.DynamicLineBalancingResult
	 * @generated
	 */
	EClass getDynamicLineBalancingResult();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see de.dfki.iui.basys.model.domain.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Instruction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dfki.iui.basys.model.domain.Instruction#getDescription()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Description();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.basys.model.domain.Instruction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see de.dfki.iui.basys.model.domain.Instruction#getParameters()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Parameters();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.basys.model.domain.Instruction#getWorkstepIds <em>Workstep Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Workstep Ids</em>'.
	 * @see de.dfki.iui.basys.model.domain.Instruction#getWorkstepIds()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_WorkstepIds();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see de.dfki.iui.basys.model.domain.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Material#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.basys.model.domain.Material#getName()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Name();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see de.dfki.iui.basys.model.domain.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Media#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.Media#getType()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Media#getFileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Size</em>'.
	 * @see de.dfki.iui.basys.model.domain.Media#getFileSize()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_FileSize();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Media#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum</em>'.
	 * @see de.dfki.iui.basys.model.domain.Media#getChecksum()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Media#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.dfki.iui.basys.model.domain.Media#getLocation()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Media#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.Media#getEntityType()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_EntityType();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.basys.model.domain.Media#getEntityIds <em>Entity Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entity Ids</em>'.
	 * @see de.dfki.iui.basys.model.domain.Media#getEntityIds()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_EntityIds();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.basys.model.domain.Media#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see de.dfki.iui.basys.model.domain.Media#getTags()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Tags();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Media#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see de.dfki.iui.basys.model.domain.Media#getLocale()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Locale();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see de.dfki.iui.basys.model.domain.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Audio#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dfki.iui.basys.model.domain.Audio#getDuration()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Duration();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see de.dfki.iui.basys.model.domain.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Video#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dfki.iui.basys.model.domain.Video#getDuration()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Video#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dfki.iui.basys.model.domain.Video#getWidth()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Video#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dfki.iui.basys.model.domain.Video#getHeight()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Height();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see de.dfki.iui.basys.model.domain.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Image#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dfki.iui.basys.model.domain.Image#getWidth()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Image#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dfki.iui.basys.model.domain.Image#getHeight()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Height();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see de.dfki.iui.basys.model.domain.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Order#getVariantId <em>Variant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.Order#getVariantId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_VariantId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Order#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see de.dfki.iui.basys.model.domain.Order#getStartDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Order#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see de.dfki.iui.basys.model.domain.Order#getEndDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Order#getPieces <em>Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pieces</em>'.
	 * @see de.dfki.iui.basys.model.domain.Order#getPieces()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Pieces();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Order#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.dfki.iui.basys.model.domain.Order#getPriority()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Priority();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.OrderStatus <em>Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.OrderStatus
	 * @generated
	 */
	EClass getOrderStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.OrderStatus#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.OrderStatus#getOrderId()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EAttribute getOrderStatus_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.OrderStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.OrderStatus#getStatus()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EAttribute getOrderStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.OrderStatus#getPieceCount <em>Piece Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Piece Count</em>'.
	 * @see de.dfki.iui.basys.model.domain.OrderStatus#getPieceCount()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EAttribute getOrderStatus_PieceCount();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.ProductGroup <em>Product Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Group</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductGroup
	 * @generated
	 */
	EClass getProductGroup();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.ProductVariant <em>Product Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Variant</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductVariant
	 * @generated
	 */
	EClass getProductVariant();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductVariant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductVariant#getName()
	 * @see #getProductVariant()
	 * @generated
	 */
	EAttribute getProductVariant_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductVariant#getProductGroupId <em>Product Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Group Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductVariant#getProductGroupId()
	 * @see #getProductVariant()
	 * @generated
	 */
	EAttribute getProductVariant_ProductGroupId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.ProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductInstance
	 * @generated
	 */
	EClass getProductInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductInstance#getProductVariantId <em>Product Variant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Variant Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductInstance#getProductVariantId()
	 * @see #getProductInstance()
	 * @generated
	 */
	EAttribute getProductInstance_ProductVariantId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductInstance#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductInstance#getOrderId()
	 * @see #getProductInstance()
	 * @generated
	 */
	EAttribute getProductInstance_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductInstance#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductInstance#getSerialNumber()
	 * @see #getProductInstance()
	 * @generated
	 */
	EAttribute getProductInstance_SerialNumber();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.ProductInstanceStatus <em>Product Instance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductInstanceStatus
	 * @generated
	 */
	EClass getProductInstanceStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductInstanceStatus#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductInstanceStatus#getProductInstanceId()
	 * @see #getProductInstanceStatus()
	 * @generated
	 */
	EAttribute getProductInstanceStatus_ProductInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductInstanceStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductInstanceStatus#getStatus()
	 * @see #getProductInstanceStatus()
	 * @generated
	 */
	EAttribute getProductInstanceStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductInstanceStatus#getWorkstepInstanceId <em>Workstep Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductInstanceStatus#getWorkstepInstanceId()
	 * @see #getProductInstanceStatus()
	 * @generated
	 */
	EAttribute getProductInstanceStatus_WorkstepInstanceId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.ProductRecognition <em>Product Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Recognition</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductRecognition
	 * @generated
	 */
	EClass getProductRecognition();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductRecognition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductRecognition#getType()
	 * @see #getProductRecognition()
	 * @generated
	 */
	EAttribute getProductRecognition_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductRecognition#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductRecognition#getProductInstanceId()
	 * @see #getProductRecognition()
	 * @generated
	 */
	EAttribute getProductRecognition_ProductInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ProductRecognition#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductRecognition#getComponentId()
	 * @see #getProductRecognition()
	 * @generated
	 */
	EAttribute getProductRecognition_ComponentId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.ResourceInstance
	 * @generated
	 */
	EClass getResourceInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ResourceInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.basys.model.domain.ResourceInstance#getName()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ResourceInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.ResourceInstance#getType()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.ResourceInstance#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see de.dfki.iui.basys.model.domain.ResourceInstance#getProperties()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_Properties();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see de.dfki.iui.basys.model.domain.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Staff#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see de.dfki.iui.basys.model.domain.Staff#getFirstname()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Staff#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see de.dfki.iui.basys.model.domain.Staff#getLastname()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Staff#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see de.dfki.iui.basys.model.domain.Staff#getBirthdate()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Staff#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.dfki.iui.basys.model.domain.Staff#getLanguage()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Language();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.StaffRecognition <em>Staff Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Recognition</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffRecognition
	 * @generated
	 */
	EClass getStaffRecognition();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.StaffRecognition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffRecognition#getType()
	 * @see #getStaffRecognition()
	 * @generated
	 */
	EAttribute getStaffRecognition_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.StaffRecognition#getWorkerId <em>Worker Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffRecognition#getWorkerId()
	 * @see #getStaffRecognition()
	 * @generated
	 */
	EAttribute getStaffRecognition_WorkerId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.StaffRecognition#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffRecognition#getComponentId()
	 * @see #getStaffRecognition()
	 * @generated
	 */
	EAttribute getStaffRecognition_ComponentId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.StaffSkills <em>Staff Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Skills</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffSkills
	 * @generated
	 */
	EClass getStaffSkills();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.StaffSkills#getWorkerId <em>Worker Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffSkills#getWorkerId()
	 * @see #getStaffSkills()
	 * @generated
	 */
	EAttribute getStaffSkills_WorkerId();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.StaffSkills#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffSkills#getSkills()
	 * @see #getStaffSkills()
	 * @generated
	 */
	EReference getStaffSkills_Skills();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.StaffSkill <em>Staff Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Skill</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffSkill
	 * @generated
	 */
	EClass getStaffSkill();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.StaffSkill#getWorkstepId <em>Workstep Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffSkill#getWorkstepId()
	 * @see #getStaffSkill()
	 * @generated
	 */
	EAttribute getStaffSkill_WorkstepId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.StaffSkill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffSkill#getLevel()
	 * @see #getStaffSkill()
	 * @generated
	 */
	EAttribute getStaffSkill_Level();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.StaffSkill#getPreference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preference</em>'.
	 * @see de.dfki.iui.basys.model.domain.StaffSkill#getPreference()
	 * @see #getStaffSkill()
	 * @generated
	 */
	EAttribute getStaffSkill_Preference();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.Workplan <em>Workplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workplan</em>'.
	 * @see de.dfki.iui.basys.model.domain.Workplan
	 * @generated
	 */
	EClass getWorkplan();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Workplan#getProductVariantId <em>Product Variant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Variant Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.Workplan#getProductVariantId()
	 * @see #getWorkplan()
	 * @generated
	 */
	EAttribute getWorkplan_ProductVariantId();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.basys.model.domain.Workplan#getWorkstepIds <em>Workstep Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Workstep Ids</em>'.
	 * @see de.dfki.iui.basys.model.domain.Workplan#getWorkstepIds()
	 * @see #getWorkplan()
	 * @generated
	 */
	EAttribute getWorkplan_WorkstepIds();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.Workstep <em>Workstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstep</em>'.
	 * @see de.dfki.iui.basys.model.domain.Workstep
	 * @generated
	 */
	EClass getWorkstep();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Workstep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.basys.model.domain.Workstep#getName()
	 * @see #getWorkstep()
	 * @generated
	 */
	EAttribute getWorkstep_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.Workstep#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dfki.iui.basys.model.domain.Workstep#getDuration()
	 * @see #getWorkstep()
	 * @generated
	 */
	EAttribute getWorkstep_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.Workstep#getBom <em>Bom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bom</em>'.
	 * @see de.dfki.iui.basys.model.domain.Workstep#getBom()
	 * @see #getWorkstep()
	 * @generated
	 */
	EReference getWorkstep_Bom();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.Workstep#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see de.dfki.iui.basys.model.domain.Workstep#getRequirements()
	 * @see #getWorkstep()
	 * @generated
	 */
	EReference getWorkstep_Requirements();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.CapabilityRequirement <em>Capability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Requirement</em>'.
	 * @see de.dfki.iui.basys.model.domain.CapabilityRequirement
	 * @generated
	 */
	EClass getCapabilityRequirement();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.BOM <em>BOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOM</em>'.
	 * @see de.dfki.iui.basys.model.domain.BOM
	 * @generated
	 */
	EClass getBOM();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.BOM#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see de.dfki.iui.basys.model.domain.BOM#getEntries()
	 * @see #getBOM()
	 * @generated
	 */
	EReference getBOM_Entries();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.BOMEntry <em>BOM Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOM Entry</em>'.
	 * @see de.dfki.iui.basys.model.domain.BOMEntry
	 * @generated
	 */
	EClass getBOMEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.BOMEntry#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see de.dfki.iui.basys.model.domain.BOMEntry#getAmount()
	 * @see #getBOMEntry()
	 * @generated
	 */
	EAttribute getBOMEntry_Amount();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.BOMEntry#getMaterialId <em>Material Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.BOMEntry#getMaterialId()
	 * @see #getBOMEntry()
	 * @generated
	 */
	EAttribute getBOMEntry_MaterialId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.WorkstepInstance <em>Workstep Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstep Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.WorkstepInstance
	 * @generated
	 */
	EClass getWorkstepInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.WorkstepInstance#getWorkstepId <em>Workstep Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.WorkstepInstance#getWorkstepId()
	 * @see #getWorkstepInstance()
	 * @generated
	 */
	EAttribute getWorkstepInstance_WorkstepId();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.basys.model.domain.WorkstepInstance#getResourceInstanceIds <em>Resource Instance Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Instance Ids</em>'.
	 * @see de.dfki.iui.basys.model.domain.WorkstepInstance#getResourceInstanceIds()
	 * @see #getWorkstepInstance()
	 * @generated
	 */
	EAttribute getWorkstepInstance_ResourceInstanceIds();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.TemperatureReading <em>Temperature Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Reading</em>'.
	 * @see de.dfki.iui.basys.model.domain.TemperatureReading
	 * @generated
	 */
	EClass getTemperatureReading();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.TemperatureReading#getMeasuredValue <em>Measured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measured Value</em>'.
	 * @see de.dfki.iui.basys.model.domain.TemperatureReading#getMeasuredValue()
	 * @see #getTemperatureReading()
	 * @generated
	 */
	EAttribute getTemperatureReading_MeasuredValue();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.RecognitionEnum <em>Recognition Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recognition Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.RecognitionEnum
	 * @generated
	 */
	EEnum getRecognitionEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.PreferenceEnum <em>Preference Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Preference Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.PreferenceEnum
	 * @generated
	 */
	EEnum getPreferenceEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.OrderStatusEnum <em>Order Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Status Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.OrderStatusEnum
	 * @generated
	 */
	EEnum getOrderStatusEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.ProductInstanceStatusEnum <em>Product Instance Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Instance Status Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.ProductInstanceStatusEnum
	 * @generated
	 */
	EEnum getProductInstanceStatusEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.DynamicLineBalancingResultImpl <em>Dynamic Line Balancing Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.DynamicLineBalancingResultImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getDynamicLineBalancingResult()
		 * @generated
		 */
		EClass DYNAMIC_LINE_BALANCING_RESULT = eINSTANCE.getDynamicLineBalancingResult();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.InstructionImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__DESCRIPTION = eINSTANCE.getInstruction_Description();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__PARAMETERS = eINSTANCE.getInstruction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Workstep Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__WORKSTEP_IDS = eINSTANCE.getInstruction_WorkstepIds();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.MaterialImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getMaterial()
		 * @generated
		 */
		EClass MATERIAL = eINSTANCE.getMaterial();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__NAME = eINSTANCE.getMaterial_Name();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.MediaImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__TYPE = eINSTANCE.getMedia_Type();

		/**
		 * The meta object literal for the '<em><b>File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__FILE_SIZE = eINSTANCE.getMedia_FileSize();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__CHECKSUM = eINSTANCE.getMedia_Checksum();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__LOCATION = eINSTANCE.getMedia_Location();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__ENTITY_TYPE = eINSTANCE.getMedia_EntityType();

		/**
		 * The meta object literal for the '<em><b>Entity Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__ENTITY_IDS = eINSTANCE.getMedia_EntityIds();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__TAGS = eINSTANCE.getMedia_Tags();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__LOCALE = eINSTANCE.getMedia_Locale();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.AudioImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__DURATION = eINSTANCE.getAudio_Duration();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.VideoImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DURATION = eINSTANCE.getVideo_Duration();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__WIDTH = eINSTANCE.getVideo_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__HEIGHT = eINSTANCE.getVideo_Height();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.ImageImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__WIDTH = eINSTANCE.getImage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__HEIGHT = eINSTANCE.getImage_Height();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.OrderImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Variant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__VARIANT_ID = eINSTANCE.getOrder_VariantId();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__START_DATE = eINSTANCE.getOrder_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__END_DATE = eINSTANCE.getOrder_EndDate();

		/**
		 * The meta object literal for the '<em><b>Pieces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PIECES = eINSTANCE.getOrder_Pieces();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRIORITY = eINSTANCE.getOrder_Priority();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.OrderStatusImpl <em>Order Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.OrderStatusImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getOrderStatus()
		 * @generated
		 */
		EClass ORDER_STATUS = eINSTANCE.getOrderStatus();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS__ORDER_ID = eINSTANCE.getOrderStatus_OrderId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS__STATUS = eINSTANCE.getOrderStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Piece Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS__PIECE_COUNT = eINSTANCE.getOrderStatus_PieceCount();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.ProductGroupImpl <em>Product Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.ProductGroupImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductGroup()
		 * @generated
		 */
		EClass PRODUCT_GROUP = eINSTANCE.getProductGroup();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.ProductVariantImpl <em>Product Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.ProductVariantImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductVariant()
		 * @generated
		 */
		EClass PRODUCT_VARIANT = eINSTANCE.getProductVariant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VARIANT__NAME = eINSTANCE.getProductVariant_Name();

		/**
		 * The meta object literal for the '<em><b>Product Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VARIANT__PRODUCT_GROUP_ID = eINSTANCE.getProductVariant_ProductGroupId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.ProductInstanceImpl <em>Product Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.ProductInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductInstance()
		 * @generated
		 */
		EClass PRODUCT_INSTANCE = eINSTANCE.getProductInstance();

		/**
		 * The meta object literal for the '<em><b>Product Variant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE__PRODUCT_VARIANT_ID = eINSTANCE.getProductInstance_ProductVariantId();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE__ORDER_ID = eINSTANCE.getProductInstance_OrderId();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE__SERIAL_NUMBER = eINSTANCE.getProductInstance_SerialNumber();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.ProductInstanceStatusImpl <em>Product Instance Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.ProductInstanceStatusImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductInstanceStatus()
		 * @generated
		 */
		EClass PRODUCT_INSTANCE_STATUS = eINSTANCE.getProductInstanceStatus();

		/**
		 * The meta object literal for the '<em><b>Product Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID = eINSTANCE.getProductInstanceStatus_ProductInstanceId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_STATUS__STATUS = eINSTANCE.getProductInstanceStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Workstep Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID = eINSTANCE.getProductInstanceStatus_WorkstepInstanceId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.ProductRecognitionImpl <em>Product Recognition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.ProductRecognitionImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductRecognition()
		 * @generated
		 */
		EClass PRODUCT_RECOGNITION = eINSTANCE.getProductRecognition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_RECOGNITION__TYPE = eINSTANCE.getProductRecognition_Type();

		/**
		 * The meta object literal for the '<em><b>Product Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_RECOGNITION__PRODUCT_INSTANCE_ID = eINSTANCE.getProductRecognition_ProductInstanceId();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_RECOGNITION__COMPONENT_ID = eINSTANCE.getProductRecognition_ComponentId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.ResourceInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getResourceInstance()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE = eINSTANCE.getResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__NAME = eINSTANCE.getResourceInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__TYPE = eINSTANCE.getResourceInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__PROPERTIES = eINSTANCE.getResourceInstance_Properties();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.StaffImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__FIRSTNAME = eINSTANCE.getStaff_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__LASTNAME = eINSTANCE.getStaff_Lastname();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__BIRTHDATE = eINSTANCE.getStaff_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__LANGUAGE = eINSTANCE.getStaff_Language();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.StaffRecognitionImpl <em>Staff Recognition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.StaffRecognitionImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getStaffRecognition()
		 * @generated
		 */
		EClass STAFF_RECOGNITION = eINSTANCE.getStaffRecognition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_RECOGNITION__TYPE = eINSTANCE.getStaffRecognition_Type();

		/**
		 * The meta object literal for the '<em><b>Worker Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_RECOGNITION__WORKER_ID = eINSTANCE.getStaffRecognition_WorkerId();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_RECOGNITION__COMPONENT_ID = eINSTANCE.getStaffRecognition_ComponentId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.StaffSkillsImpl <em>Staff Skills</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.StaffSkillsImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getStaffSkills()
		 * @generated
		 */
		EClass STAFF_SKILLS = eINSTANCE.getStaffSkills();

		/**
		 * The meta object literal for the '<em><b>Worker Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_SKILLS__WORKER_ID = eINSTANCE.getStaffSkills_WorkerId();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SKILLS__SKILLS = eINSTANCE.getStaffSkills_Skills();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.StaffSkillImpl <em>Staff Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.StaffSkillImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getStaffSkill()
		 * @generated
		 */
		EClass STAFF_SKILL = eINSTANCE.getStaffSkill();

		/**
		 * The meta object literal for the '<em><b>Workstep Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_SKILL__WORKSTEP_ID = eINSTANCE.getStaffSkill_WorkstepId();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_SKILL__LEVEL = eINSTANCE.getStaffSkill_Level();

		/**
		 * The meta object literal for the '<em><b>Preference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_SKILL__PREFERENCE = eINSTANCE.getStaffSkill_Preference();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.WorkplanImpl <em>Workplan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.WorkplanImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getWorkplan()
		 * @generated
		 */
		EClass WORKPLAN = eINSTANCE.getWorkplan();

		/**
		 * The meta object literal for the '<em><b>Product Variant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKPLAN__PRODUCT_VARIANT_ID = eINSTANCE.getWorkplan_ProductVariantId();

		/**
		 * The meta object literal for the '<em><b>Workstep Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKPLAN__WORKSTEP_IDS = eINSTANCE.getWorkplan_WorkstepIds();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.WorkstepImpl <em>Workstep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.WorkstepImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getWorkstep()
		 * @generated
		 */
		EClass WORKSTEP = eINSTANCE.getWorkstep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP__NAME = eINSTANCE.getWorkstep_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP__DURATION = eINSTANCE.getWorkstep_Duration();

		/**
		 * The meta object literal for the '<em><b>Bom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSTEP__BOM = eINSTANCE.getWorkstep_Bom();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSTEP__REQUIREMENTS = eINSTANCE.getWorkstep_Requirements();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.CapabilityRequirementImpl <em>Capability Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.CapabilityRequirementImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getCapabilityRequirement()
		 * @generated
		 */
		EClass CAPABILITY_REQUIREMENT = eINSTANCE.getCapabilityRequirement();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.BOMImpl <em>BOM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.BOMImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getBOM()
		 * @generated
		 */
		EClass BOM = eINSTANCE.getBOM();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOM__ENTRIES = eINSTANCE.getBOM_Entries();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.BOMEntryImpl <em>BOM Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.BOMEntryImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getBOMEntry()
		 * @generated
		 */
		EClass BOM_ENTRY = eINSTANCE.getBOMEntry();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOM_ENTRY__AMOUNT = eINSTANCE.getBOMEntry_Amount();

		/**
		 * The meta object literal for the '<em><b>Material Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOM_ENTRY__MATERIAL_ID = eINSTANCE.getBOMEntry_MaterialId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.WorkstepInstanceImpl <em>Workstep Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.WorkstepInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getWorkstepInstance()
		 * @generated
		 */
		EClass WORKSTEP_INSTANCE = eINSTANCE.getWorkstepInstance();

		/**
		 * The meta object literal for the '<em><b>Workstep Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE__WORKSTEP_ID = eINSTANCE.getWorkstepInstance_WorkstepId();

		/**
		 * The meta object literal for the '<em><b>Resource Instance Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP_INSTANCE__RESOURCE_INSTANCE_IDS = eINSTANCE.getWorkstepInstance_ResourceInstanceIds();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.impl.TemperatureReadingImpl <em>Temperature Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.impl.TemperatureReadingImpl
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getTemperatureReading()
		 * @generated
		 */
		EClass TEMPERATURE_READING = eINSTANCE.getTemperatureReading();

		/**
		 * The meta object literal for the '<em><b>Measured Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURE_READING__MEASURED_VALUE = eINSTANCE.getTemperatureReading_MeasuredValue();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.RecognitionEnum <em>Recognition Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.RecognitionEnum
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getRecognitionEnum()
		 * @generated
		 */
		EEnum RECOGNITION_ENUM = eINSTANCE.getRecognitionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.PreferenceEnum <em>Preference Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.PreferenceEnum
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getPreferenceEnum()
		 * @generated
		 */
		EEnum PREFERENCE_ENUM = eINSTANCE.getPreferenceEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.OrderStatusEnum <em>Order Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.OrderStatusEnum
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getOrderStatusEnum()
		 * @generated
		 */
		EEnum ORDER_STATUS_ENUM = eINSTANCE.getOrderStatusEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.ProductInstanceStatusEnum <em>Product Instance Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.ProductInstanceStatusEnum
		 * @see de.dfki.iui.basys.model.domain.impl.DomainPackageImpl#getProductInstanceStatusEnum()
		 * @generated
		 */
		EEnum PRODUCT_INSTANCE_STATUS_ENUM = eINSTANCE.getProductInstanceStatusEnum();

	}

} //DomainPackage
