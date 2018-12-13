/**
 */
package de.dfki.cos.basys.platform.model.pattern;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSlot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getFeature <em>Feature</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getRange <em>Range</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPSlot()
 * @model
 * @generated
 */
public interface PSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPSlot_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PSlot#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.pattern.PPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPSlot_Range()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PPattern> getRange();

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPSlot_FeatureName()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	PValue getRangeValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<PValue> getRangeValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	PObject getRangeObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<PObject> getRangeObjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='PSlot co = this;\r\n\r\n// 1) compare the features\r\nEStructuralFeature fCo = getFeature(),\r\n\t\t\t\t   fBg = bg.getFeature();\r\nEPackage pCo = fCo.getEContainingClass().getEPackage();\r\nEPackage pBg = fBg.getEContainingClass().getEPackage();\r\nif ( !(fCo.equals( fBg ) || pCo.getName().equals( pBg.getName() ) || pCo.getNsPrefix().equals( pBg.getNsPrefix() ) || pCo.getNsURI().equals( pBg.getNsURI() )) ) {\r\n\treturn null;\r\n}\r\n\r\n// 2) unify all range patterns dependent on the feature \'type\'\r\nif ( fCo.isMany() ) {\r\n\t// In this case the semantics of many-feature slots is considered to be an existential manner:\r\n\t// Assume the PSlot has n many range patterns: p1, p2, .., pn. Then the semantics for an instance is considered to be: p1 or p2 or .. or pn\r\n\t// If there is another PSlot with m many range patterns: q1, q2, .., qm and the second PSlot has to be satisfied as well then\r\n\t// all patterns of the first PSLot can be distributed over the patterns of the second PSlot.\r\n\tList&lt; PPattern &gt; unifiedRange = new ArrayList&lt;&gt;( bg.getRange().size() * co.getRange().size() );\r\n\tif ( bg.getRange().isEmpty() ) {\r\n\t\tunifiedRange.addAll( co.getRange() );\r\n\t} else if ( co.getRange().isEmpty() ) {\r\n\t\tunifiedRange.addAll( bg.getRange() );\r\n\t} else {\r\n\t\tPPattern tmp;\r\n\t\tfor ( PPattern pattBg : bg.getRange() ) {\r\n\t\t\tfor ( PPattern pattCo : co.getRange() ) {\r\n\t\t\t\tif ( (tmp = pattCo.unify( pattBg )) != null ) {\r\n\t\t\t\t\tunifiedRange.add( tmp );\r\n\t\t\t\t} else {\r\n\t\t\t\t\t// some range pattern did not unify -&gt; it is ok since it was only one alternative\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t\tif ( unifiedRange.isEmpty() ) {\r\n\t\t\treturn null;\t// there is no alternative which could be true -&gt; stop unification\r\n\t\t}\r\n\t}\r\n\t\r\n\tco.getRange().clear();\r\n\tco.getRange().addAll( unifiedRange );\r\n} else {\r\n\t// In case of a non-many feature only the range patterns are considered to be conjuncted and have to be unified to one single pattern.\r\n\tPPattern range = null;\r\n\tfor ( PPattern pattBg : bg.getRange() ) {\r\n\t\tif ( range == null ) {\r\n\t\t\trange = pattBg;\r\n\t\t} else {\r\n\t\t\tif ( (range = range.unify( pattBg )) == null ) {\r\n\t\t\t\treturn null;\t\t// some range pattern did not unify -&gt; stop unification\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\tfor ( PPattern pattCo : co.getRange() ) {\r\n\t\tif ( range == null ) {\r\n\t\t\trange = pattCo;\r\n\t\t} else {\r\n\t\t\tif ( (range = range.unify( pattCo )) == null ) {\r\n\t\t\t\treturn null;\t\t// some range pattern did not unify -&gt; stop unification\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\tif ( range != null ) {\r\n\t\tco.getRange().clear();\r\n\t\tco.getRange().add( range );\r\n\t}\r\n}\r\n\r\nreturn co;'"
	 * @generated
	 */
	PSlot unify(PSlot bg);

} // PSlot
