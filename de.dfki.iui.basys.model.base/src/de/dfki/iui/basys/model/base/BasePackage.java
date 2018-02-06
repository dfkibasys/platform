/**
 */
package de.dfki.iui.basys.model.base;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see de.dfki.iui.basys.model.base.BaseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = de.dfki.iui.basys.model.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.base.impl.BObjectImpl <em>BObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.impl.BObjectImpl
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBObject()
	 * @generated
	 */
	int BOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOBJECT__BINDING = 0;

	/**
	 * The number of structural features of the '<em>BObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.base.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.impl.MetadataImpl
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 1;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__CREATOR = 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__CREATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__EXPIRY_DATE = 2;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.base.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.impl.EntityImpl
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BINDING = BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__METADATA = BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.base.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.impl.KeyValuePairImpl
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '<em>BBoolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.datatypes.BBoolean
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBBoolean()
	 * @generated
	 */
	int BBOOLEAN = 4;

	/**
	 * The meta object id for the '<em>BByte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.datatypes.BByte
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBByte()
	 * @generated
	 */
	int BBYTE = 5;

	/**
	 * The meta object id for the '<em>BChar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.datatypes.BChar
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBChar()
	 * @generated
	 */
	int BCHAR = 6;

	/**
	 * The meta object id for the '<em>BDouble</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.datatypes.BDouble
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBDouble()
	 * @generated
	 */
	int BDOUBLE = 7;

	/**
	 * The meta object id for the '<em>BFloat</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.datatypes.BFloat
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBFloat()
	 * @generated
	 */
	int BFLOAT = 8;

	/**
	 * The meta object id for the '<em>BInteger</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.datatypes.BInteger
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBInteger()
	 * @generated
	 */
	int BINTEGER = 9;

	/**
	 * The meta object id for the '<em>BLong</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.datatypes.BLong
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBLong()
	 * @generated
	 */
	int BLONG = 10;

	/**
	 * The meta object id for the '<em>BShort</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.datatypes.BShort
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBShort()
	 * @generated
	 */
	int BSHORT = 11;

	/**
	 * The meta object id for the '<em>BString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.base.datatypes.BString
	 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBString()
	 * @generated
	 */
	int BSTRING = 12;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.base.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BObject</em>'.
	 * @see de.dfki.iui.basys.model.base.BObject
	 * @generated
	 */
	EClass getBObject();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.base.BObject#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding</em>'.
	 * @see de.dfki.iui.basys.model.base.BObject#getBinding()
	 * @see #getBObject()
	 * @generated
	 */
	EAttribute getBObject_Binding();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.base.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see de.dfki.iui.basys.model.base.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.base.Metadata#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see de.dfki.iui.basys.model.base.Metadata#getCreator()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Creator();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.base.Metadata#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see de.dfki.iui.basys.model.base.Metadata#getCreationDate()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.base.Metadata#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see de.dfki.iui.basys.model.base.Metadata#getExpiryDate()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_ExpiryDate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.dfki.iui.basys.model.base.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.base.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.basys.model.base.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.base.Entity#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see de.dfki.iui.basys.model.base.Entity#getMetadata()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Metadata();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.base.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see de.dfki.iui.basys.model.base.KeyValuePair
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.base.KeyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.dfki.iui.basys.model.base.KeyValuePair#getKey()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.base.KeyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.basys.model.base.KeyValuePair#getValue()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Value();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.base.datatypes.BBoolean <em>BBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BBoolean</em>'.
	 * @see de.dfki.iui.basys.model.base.datatypes.BBoolean
	 * @model instanceClass="de.dfki.iui.basys.model.base.datatypes.BBoolean"
	 * @generated
	 */
	EDataType getBBoolean();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.base.datatypes.BByte <em>BByte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BByte</em>'.
	 * @see de.dfki.iui.basys.model.base.datatypes.BByte
	 * @model instanceClass="de.dfki.iui.basys.model.base.datatypes.BByte"
	 * @generated
	 */
	EDataType getBByte();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.base.datatypes.BChar <em>BChar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BChar</em>'.
	 * @see de.dfki.iui.basys.model.base.datatypes.BChar
	 * @model instanceClass="de.dfki.iui.basys.model.base.datatypes.BChar"
	 * @generated
	 */
	EDataType getBChar();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.base.datatypes.BDouble <em>BDouble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BDouble</em>'.
	 * @see de.dfki.iui.basys.model.base.datatypes.BDouble
	 * @model instanceClass="de.dfki.iui.basys.model.base.datatypes.BDouble"
	 * @generated
	 */
	EDataType getBDouble();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.base.datatypes.BFloat <em>BFloat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BFloat</em>'.
	 * @see de.dfki.iui.basys.model.base.datatypes.BFloat
	 * @model instanceClass="de.dfki.iui.basys.model.base.datatypes.BFloat"
	 * @generated
	 */
	EDataType getBFloat();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.base.datatypes.BInteger <em>BInteger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BInteger</em>'.
	 * @see de.dfki.iui.basys.model.base.datatypes.BInteger
	 * @model instanceClass="de.dfki.iui.basys.model.base.datatypes.BInteger"
	 * @generated
	 */
	EDataType getBInteger();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.base.datatypes.BLong <em>BLong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BLong</em>'.
	 * @see de.dfki.iui.basys.model.base.datatypes.BLong
	 * @model instanceClass="de.dfki.iui.basys.model.base.datatypes.BLong"
	 * @generated
	 */
	EDataType getBLong();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.base.datatypes.BShort <em>BShort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BShort</em>'.
	 * @see de.dfki.iui.basys.model.base.datatypes.BShort
	 * @model instanceClass="de.dfki.iui.basys.model.base.datatypes.BShort"
	 * @generated
	 */
	EDataType getBShort();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.base.datatypes.BString <em>BString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BString</em>'.
	 * @see de.dfki.iui.basys.model.base.datatypes.BString
	 * @model instanceClass="de.dfki.iui.basys.model.base.datatypes.BString"
	 * @generated
	 */
	EDataType getBString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.base.impl.BObjectImpl <em>BObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.impl.BObjectImpl
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBObject()
		 * @generated
		 */
		EClass BOBJECT = eINSTANCE.getBObject();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOBJECT__BINDING = eINSTANCE.getBObject_Binding();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.base.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.impl.MetadataImpl
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__CREATOR = eINSTANCE.getMetadata_Creator();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__CREATION_DATE = eINSTANCE.getMetadata_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Expiry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__EXPIRY_DATE = eINSTANCE.getMetadata_ExpiryDate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.base.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.impl.EntityImpl
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__METADATA = eINSTANCE.getEntity_Metadata();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.base.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.impl.KeyValuePairImpl
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '<em>BBoolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.datatypes.BBoolean
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBBoolean()
		 * @generated
		 */
		EDataType BBOOLEAN = eINSTANCE.getBBoolean();

		/**
		 * The meta object literal for the '<em>BByte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.datatypes.BByte
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBByte()
		 * @generated
		 */
		EDataType BBYTE = eINSTANCE.getBByte();

		/**
		 * The meta object literal for the '<em>BChar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.datatypes.BChar
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBChar()
		 * @generated
		 */
		EDataType BCHAR = eINSTANCE.getBChar();

		/**
		 * The meta object literal for the '<em>BDouble</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.datatypes.BDouble
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBDouble()
		 * @generated
		 */
		EDataType BDOUBLE = eINSTANCE.getBDouble();

		/**
		 * The meta object literal for the '<em>BFloat</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.datatypes.BFloat
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBFloat()
		 * @generated
		 */
		EDataType BFLOAT = eINSTANCE.getBFloat();

		/**
		 * The meta object literal for the '<em>BInteger</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.datatypes.BInteger
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBInteger()
		 * @generated
		 */
		EDataType BINTEGER = eINSTANCE.getBInteger();

		/**
		 * The meta object literal for the '<em>BLong</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.datatypes.BLong
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBLong()
		 * @generated
		 */
		EDataType BLONG = eINSTANCE.getBLong();

		/**
		 * The meta object literal for the '<em>BShort</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.datatypes.BShort
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBShort()
		 * @generated
		 */
		EDataType BSHORT = eINSTANCE.getBShort();

		/**
		 * The meta object literal for the '<em>BString</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.base.datatypes.BString
		 * @see de.dfki.iui.basys.model.base.impl.BasePackageImpl#getBString()
		 * @generated
		 */
		EDataType BSTRING = eINSTANCE.getBString();

	}

} //BasePackage
