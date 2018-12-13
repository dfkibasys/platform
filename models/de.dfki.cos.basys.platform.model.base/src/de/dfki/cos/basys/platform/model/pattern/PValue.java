/**
 */
package de.dfki.cos.basys.platform.model.pattern;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PValue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PValue#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PValue#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPValue()
 * @model
 * @generated
 */
public interface PValue extends PPattern {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDataType)
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPValue_Type()
	 * @model required="true"
	 * @generated
	 */
	EDataType getType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PValue#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDataType value);

	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions</em>' containment reference.
	 * @see #setRestrictions(PRestrictions)
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPValue_Restrictions()
	 * @model containment="true"
	 * @generated
	 */
	PRestrictions getRestrictions();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PValue#getRestrictions <em>Restrictions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restrictions</em>' containment reference.
	 * @see #getRestrictions()
	 * @generated
	 */
	void setRestrictions(PRestrictions value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Object value = null;\r\n\t\tif (getRestrictions() != null) {\r\n\t\t\tvalue = getRestrictions().getDefaultValue(null);\r\n\t\t} else {\r\n\t\t\ttry {\r\n\t\t\t\tvalue = this.getType().getInstanceClass().newInstance();\r\n\t\t\t} catch (InstantiationException | IllegalAccessException e) {\r\n\t\t\t\t// TODO Auto-generated catch block\r\n\t\t\t\te.printStackTrace();\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (value != null) {\r\n\t\t\tPValueObject obj = PatternFactory.eINSTANCE.createPValueObject();\r\n\t\t\tobj.setValue(value);\r\n\t\t\treturn obj;\r\n\t\t}\r\n\t\treturn null;'"
	 * @generated
	 */
	EObject createSkeleton();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ppattAnnotation="http://www.eclipse.org/emf/2002/GenModel body='PObject co = EcoreUtil.copy( this );\r\n\r\n// 1) compare the types\r\nEClass eclCo = getType(),\r\n\t   eclBg = bg.getType();\r\nEPackage pCo = eclCo.getEPackage();\r\nEPackage pBg = eclBg.getEPackage();\r\n\r\nif ( !(eclCo.equals( eclBg ) || pCo.getName().equals( pBg.getName() ) || pCo.getNsPrefix().equals( pBg.getNsPrefix() ) || pCo.getNsURI().equals( pBg.getNsURI() )) ) {\r\n\treturn null;\r\n}\r\n\r\n// 2) collect the slots\r\nMap&lt;EStructuralFeature, List&lt; PSlot &gt;&gt; allSlots = new HashMap&lt;&gt;();\r\nEStructuralFeature feat;\r\nPSlot slot;\r\nfor ( EList&lt; ? &gt; slotList : new EList&lt;?&gt;[]{ co.getSlot(), bg.getSlot()} ) {\r\n\tfor ( Object obj : slotList ) {\r\n\t\tslot = (PSlot) obj;\r\n\t\tfeat = slot.getFeature();\r\n\t\tif ( !allSlots.containsKey( feat )) {\r\n\t\t\tallSlots.put( feat, new ArrayList&lt; PSlot &gt;( 2 ));\r\n\t\t}\r\n\t\tallSlots.get( feat ).add( slot );\r\n\t}\r\n}\r\n\r\n// 3) unify all slots with the same feature\r\nco.getSlot().clear();\r\nList&lt; PSlot &gt; slots;\r\nfor ( EStructuralFeature f : allSlots.keySet() ) {\r\n\tslots = allSlots.get( f );\r\n\tslot = slots.get( 0 );\r\n\tfor ( int i = 1, size = slots.size(); i &lt; size; i++ ) {\r\n\t\tslot = slot.unify( slots.get( i ));\r\n\t\tif ( slot == null ) {\r\n\t\t\treturn null;\r\n\t\t}\r\n\t}\r\n\tco.getSlot().add( slot );\r\n}\r\nreturn co;'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return unify( (PValue) ppatt );'"
	 * @generated
	 */
	PPattern unify(PPattern ppatt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='PValue co = this;\r\n\r\n// 1) compare types; they must be equal\r\nEDataType dtCo = co.getType(),\r\n\t\t  dtBg = bg.getType();\r\nEPackage pCo = dtCo.getEPackage();\r\nEPackage pBg = dtBg.getEPackage();\r\nif ( !(dtCo.equals( dtBg ) || pCo.getName().equals( pBg.getName() ) || pCo.getNsPrefix().equals( pBg.getNsPrefix() ) || pCo.getNsURI().equals( pBg.getNsURI() )) ) {\r\n\treturn null;\r\n}\r\n\r\n// 2) add the restrictions of the background to the restrictions of the covering\r\nco.setRestrictions( co.getRestrictions().unify( bg.getRestrictions() ));\r\n\r\nreturn co;'"
	 * @generated
	 */
	PValue unify(PValue bg);

} // PValue
