/**
 */
package de.dfki.iui.basys.model.domain.util;

import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.base.IdentifiableEntity;

import de.dfki.iui.basys.model.domain.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.DomainPackage
 * @generated
 */
public class DomainSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomainPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSwitch() {
		if (modelPackage == null) {
			modelPackage = DomainPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DomainPackage.DYNAMIC_LINE_BALANCING_RESULT: {
				DynamicLineBalancingResult dynamicLineBalancingResult = (DynamicLineBalancingResult)theEObject;
				T result = caseDynamicLineBalancingResult(dynamicLineBalancingResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = caseIdentifiableEntity(instruction);
				if (result == null) result = caseEntity(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.MATERIAL: {
				Material material = (Material)theEObject;
				T result = caseMaterial(material);
				if (result == null) result = caseIdentifiableEntity(material);
				if (result == null) result = caseEntity(material);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.MEDIA: {
				Media media = (Media)theEObject;
				T result = caseMedia(media);
				if (result == null) result = caseIdentifiableEntity(media);
				if (result == null) result = caseEntity(media);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.AUDIO: {
				Audio audio = (Audio)theEObject;
				T result = caseAudio(audio);
				if (result == null) result = caseMedia(audio);
				if (result == null) result = caseIdentifiableEntity(audio);
				if (result == null) result = caseEntity(audio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.VIDEO: {
				Video video = (Video)theEObject;
				T result = caseVideo(video);
				if (result == null) result = caseMedia(video);
				if (result == null) result = caseIdentifiableEntity(video);
				if (result == null) result = caseEntity(video);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseMedia(image);
				if (result == null) result = caseIdentifiableEntity(image);
				if (result == null) result = caseEntity(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ORDER: {
				Order order = (Order)theEObject;
				T result = caseOrder(order);
				if (result == null) result = caseIdentifiableEntity(order);
				if (result == null) result = caseEntity(order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ORDER_STATUS: {
				OrderStatus orderStatus = (OrderStatus)theEObject;
				T result = caseOrderStatus(orderStatus);
				if (result == null) result = caseEntity(orderStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.PRODUCT_GROUP: {
				ProductGroup productGroup = (ProductGroup)theEObject;
				T result = caseProductGroup(productGroup);
				if (result == null) result = caseIdentifiableEntity(productGroup);
				if (result == null) result = caseEntity(productGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.PRODUCT_VARIANT: {
				ProductVariant productVariant = (ProductVariant)theEObject;
				T result = caseProductVariant(productVariant);
				if (result == null) result = caseIdentifiableEntity(productVariant);
				if (result == null) result = caseEntity(productVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.PRODUCT_INSTANCE: {
				ProductInstance productInstance = (ProductInstance)theEObject;
				T result = caseProductInstance(productInstance);
				if (result == null) result = caseIdentifiableEntity(productInstance);
				if (result == null) result = caseEntity(productInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.PRODUCT_INSTANCE_STATUS: {
				ProductInstanceStatus productInstanceStatus = (ProductInstanceStatus)theEObject;
				T result = caseProductInstanceStatus(productInstanceStatus);
				if (result == null) result = caseEntity(productInstanceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.PRODUCT_RECOGNITION: {
				ProductRecognition productRecognition = (ProductRecognition)theEObject;
				T result = caseProductRecognition(productRecognition);
				if (result == null) result = caseEntity(productRecognition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.RESOURCE_INSTANCE: {
				ResourceInstance resourceInstance = (ResourceInstance)theEObject;
				T result = caseResourceInstance(resourceInstance);
				if (result == null) result = caseIdentifiableEntity(resourceInstance);
				if (result == null) result = caseEntity(resourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.STAFF: {
				Staff staff = (Staff)theEObject;
				T result = caseStaff(staff);
				if (result == null) result = caseIdentifiableEntity(staff);
				if (result == null) result = caseEntity(staff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.STAFF_RECOGNITION: {
				StaffRecognition staffRecognition = (StaffRecognition)theEObject;
				T result = caseStaffRecognition(staffRecognition);
				if (result == null) result = caseEntity(staffRecognition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.STAFF_SKILLS: {
				StaffSkills staffSkills = (StaffSkills)theEObject;
				T result = caseStaffSkills(staffSkills);
				if (result == null) result = caseEntity(staffSkills);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.STAFF_SKILL: {
				StaffSkill staffSkill = (StaffSkill)theEObject;
				T result = caseStaffSkill(staffSkill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.WORKPLAN: {
				Workplan workplan = (Workplan)theEObject;
				T result = caseWorkplan(workplan);
				if (result == null) result = caseIdentifiableEntity(workplan);
				if (result == null) result = caseEntity(workplan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.WORKSTEP: {
				Workstep workstep = (Workstep)theEObject;
				T result = caseWorkstep(workstep);
				if (result == null) result = caseIdentifiableEntity(workstep);
				if (result == null) result = caseEntity(workstep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.CAPABILITY_REQUIREMENT: {
				CapabilityRequirement capabilityRequirement = (CapabilityRequirement)theEObject;
				T result = caseCapabilityRequirement(capabilityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.BOM: {
				BOM bom = (BOM)theEObject;
				T result = caseBOM(bom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.BOM_ENTRY: {
				BOMEntry bomEntry = (BOMEntry)theEObject;
				T result = caseBOMEntry(bomEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.WORKSTEP_INSTANCE: {
				WorkstepInstance workstepInstance = (WorkstepInstance)theEObject;
				T result = caseWorkstepInstance(workstepInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.TEMPERATURE_READING: {
				TemperatureReading temperatureReading = (TemperatureReading)theEObject;
				T result = caseTemperatureReading(temperatureReading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Line Balancing Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Line Balancing Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicLineBalancingResult(DynamicLineBalancingResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterial(Material object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedia(Media object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudio(Audio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderStatus(OrderStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductGroup(ProductGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductVariant(ProductVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstance(ProductInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstanceStatus(ProductInstanceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Recognition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Recognition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductRecognition(ProductRecognition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInstance(ResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaff(Staff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Recognition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Recognition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffRecognition(StaffRecognition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Skills</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Skills</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffSkills(StaffSkills object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Skill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Skill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffSkill(StaffSkill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workplan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workplan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkplan(Workplan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workstep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workstep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkstep(Workstep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityRequirement(CapabilityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOM(BOM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOM Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOM Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOMEntry(BOMEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workstep Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workstep Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkstepInstance(WorkstepInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperature Reading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperature Reading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperatureReading(TemperatureReading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiableEntity(IdentifiableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DomainSwitch
