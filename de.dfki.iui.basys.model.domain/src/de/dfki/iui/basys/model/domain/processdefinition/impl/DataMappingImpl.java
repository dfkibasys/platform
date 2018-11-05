/**
 */
package de.dfki.iui.basys.model.domain.processdefinition.impl;

import de.dfki.iui.basys.model.domain.processdefinition.DataMapping;
import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage;

import de.dfki.iui.basys.model.util.BasysEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.DataMappingImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.DataMappingImpl#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.DataMappingImpl#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.DataMappingImpl#getTargetPath <em>Target Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataMappingImpl extends BasysEObjectImpl implements DataMapping {
	/**
	 * The default value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected String sourceName = SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourcePath() <em>Source Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePath()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcePath() <em>Source Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePath()
	 * @generated
	 * @ordered
	 */
	protected String sourcePath = SOURCE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected String targetName = TARGET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPath() <em>Target Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPath() <em>Target Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPath()
	 * @generated
	 * @ordered
	 */
	protected String targetPath = TARGET_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.DATA_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceName(String newSourceName) {
		String oldSourceName = sourceName;
		sourceName = newSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA_MAPPING__SOURCE_NAME, oldSourceName, sourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourcePath() {
		return sourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePath(String newSourcePath) {
		String oldSourcePath = sourcePath;
		sourcePath = newSourcePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA_MAPPING__SOURCE_PATH, oldSourcePath, sourcePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetName() {
		return targetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetName(String newTargetName) {
		String oldTargetName = targetName;
		targetName = newTargetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA_MAPPING__TARGET_NAME, oldTargetName, targetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetPath() {
		return targetPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPath(String newTargetPath) {
		String oldTargetPath = targetPath;
		targetPath = newTargetPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.DATA_MAPPING__TARGET_PATH, oldTargetPath, targetPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessdefinitionPackage.DATA_MAPPING__SOURCE_NAME:
				return getSourceName();
			case ProcessdefinitionPackage.DATA_MAPPING__SOURCE_PATH:
				return getSourcePath();
			case ProcessdefinitionPackage.DATA_MAPPING__TARGET_NAME:
				return getTargetName();
			case ProcessdefinitionPackage.DATA_MAPPING__TARGET_PATH:
				return getTargetPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessdefinitionPackage.DATA_MAPPING__SOURCE_NAME:
				setSourceName((String)newValue);
				return;
			case ProcessdefinitionPackage.DATA_MAPPING__SOURCE_PATH:
				setSourcePath((String)newValue);
				return;
			case ProcessdefinitionPackage.DATA_MAPPING__TARGET_NAME:
				setTargetName((String)newValue);
				return;
			case ProcessdefinitionPackage.DATA_MAPPING__TARGET_PATH:
				setTargetPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcessdefinitionPackage.DATA_MAPPING__SOURCE_NAME:
				setSourceName(SOURCE_NAME_EDEFAULT);
				return;
			case ProcessdefinitionPackage.DATA_MAPPING__SOURCE_PATH:
				setSourcePath(SOURCE_PATH_EDEFAULT);
				return;
			case ProcessdefinitionPackage.DATA_MAPPING__TARGET_NAME:
				setTargetName(TARGET_NAME_EDEFAULT);
				return;
			case ProcessdefinitionPackage.DATA_MAPPING__TARGET_PATH:
				setTargetPath(TARGET_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcessdefinitionPackage.DATA_MAPPING__SOURCE_NAME:
				return SOURCE_NAME_EDEFAULT == null ? sourceName != null : !SOURCE_NAME_EDEFAULT.equals(sourceName);
			case ProcessdefinitionPackage.DATA_MAPPING__SOURCE_PATH:
				return SOURCE_PATH_EDEFAULT == null ? sourcePath != null : !SOURCE_PATH_EDEFAULT.equals(sourcePath);
			case ProcessdefinitionPackage.DATA_MAPPING__TARGET_NAME:
				return TARGET_NAME_EDEFAULT == null ? targetName != null : !TARGET_NAME_EDEFAULT.equals(targetName);
			case ProcessdefinitionPackage.DATA_MAPPING__TARGET_PATH:
				return TARGET_PATH_EDEFAULT == null ? targetPath != null : !TARGET_PATH_EDEFAULT.equals(targetPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sourceName: ");
		result.append(sourceName);
		result.append(", sourcePath: ");
		result.append(sourcePath);
		result.append(", targetName: ");
		result.append(targetName);
		result.append(", targetPath: ");
		result.append(targetPath);
		result.append(')');
		return result.toString();
	}

} //DataMappingImpl
