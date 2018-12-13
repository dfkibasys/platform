/**
 */
package de.dfki.cos.basys.platform.model.pattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRestrictions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPRestrictions()
 * @model
 * @generated
 */
public interface PRestrictions extends PValueGen {
	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.pattern.PRestriction}<code>&lt;?, ?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPRestrictions_Restriction()
	 * @model containment="true"
	 * @generated
	 */
	EList<PRestriction<?, ?>> getRestriction();

	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.pattern.PRestrictions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPRestrictions_Restrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PRestrictions> getRestrictions();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.pattern.PRestrictionsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictionsEnum
	 * @see #setFunction(PRestrictionsEnum)
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPRestrictions_Function()
	 * @model required="true"
	 * @generated
	 */
	PRestrictionsEnum getFunction();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PRestrictions#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.pattern.PRestrictionsEnum
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PRestrictionsEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a default value for this set of restrictions. If the given result is not null then it satisfies all restrictions. Otherwise no value could be found
	 * although there could exist one.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Object defVal = defVal_;\r\n\t\tPRestrictionsEnum f = getFunction();\r\n\t\tList&lt;PValueGen&gt; gens = new ArrayList&lt;PValueGen&gt;(getRestriction());\r\n\t\tgens.addAll(getRestrictions());\r\n\t\tfor (PValueGen gen : gens) {\r\n\t\t\tdefVal = gen.getDefaultValue(defVal);\r\n\t\t\tClass&lt;?&gt; instanceClass = ((PValueImpl) gen.eContainer().eContainer()).getType().getInstanceClass();\r\n\t\t\tif (instanceClass != null &amp;&amp; instanceClass.getSuperclass() == BDataType.class) {\r\n\t\t\t\ttry {\r\n\t\t\t\t\tBDataType&lt;?&gt; newInstance = (BDataType&lt;?&gt;) instanceClass.newInstance();\r\n\t\t\t\t\tnewInstance.setValue(defVal.toString());\r\n\t\t\t\t\tdefVal = newInstance;\r\n\t\t\t\t} catch (SecurityException | InstantiationException | IllegalAccessException e) {\r\n\t\t\t\t\t// TODO Auto-generated catch block\r\n\t\t\t\t\te.printStackTrace();\r\n\t\t\t\t}\r\n\t\t\t}\r\n\r\n\t\t\tif (defVal == null) {\r\n\t\t\t\tswitch (f) {\r\n\t\t\t\tcase AND:\r\n\t\t\t\t\t// in this case all values have to be non null\r\n\t\t\t\t\treturn null;\r\n\t\t\t\tdefault:\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t} else {\r\n\t\t\t\tswitch (f) {\r\n\t\t\t\tcase OR:\r\n\t\t\t\t\t// in this case only the first value can be used\r\n\t\t\t\t\treturn defVal;\r\n\t\t\t\tdefault:\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn defVal;'"
	 * @generated
	 */
	Object getDefaultValue(Object defVal_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='PRestrictions co = this;\r\n\r\nPRestriction&lt; ?, ? &gt; urest = null,\r\n\t\t\t\t\t tmp;\r\nPRestrictions urests = null,\r\n\t\t\t  tmp2;\r\nboolean broken = false;\r\nswitch ( co.getFunction() ) {\r\n\tcase AND:\r\n\t\tswitch ( bg.getFunction() ) {\r\n\t\t\tcase AND:\r\n\t\t\t\t// unify all restrictions to get only one restriction\r\n\t\t\t\tloop1 : for ( List&lt;?&gt; rlist : new List&lt;?&gt;[]{ co.getRestriction(), bg.getRestriction() } ) {\r\n\t\t\t\t\tfor ( Object r : rlist ) {\r\n\t\t\t\t\t\ttmp = (PRestriction&lt; ?, ? &gt;) r;\r\n\t\t\t\t\t\tif ( urest == null ) {\r\n\t\t\t\t\t\t\turest = tmp;\r\n\t\t\t\t\t\t} else {\r\n\t\t\t\t\t\t\turest = urest.unify( tmp );\r\n\t\t\t\t\t\t\tif ( urest == null ) {\r\n\t\t\t\t\t\t\t\tco = null;\r\n\t\t\t\t\t\t\t\tbroken = true;\r\n\t\t\t\t\t\t\t\tbreak loop1;\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\tif ( !broken ) {\r\n\t\t\t\t\tloop1 : for ( List&lt;?&gt; rlist : new List&lt;?&gt;[]{ co.getRestrictions(), bg.getRestrictions() } ) {\r\n\t\t\t\t\t\tfor ( Object r : rlist ) {\r\n\t\t\t\t\t\t\ttmp2 = (PRestrictions) r;\r\n\t\t\t\t\t\t\tif ( urests == null ) {\r\n\t\t\t\t\t\t\t\turests = tmp2;\r\n\t\t\t\t\t\t\t} else {\r\n\t\t\t\t\t\t\t\turests = urests.unify( tmp2 );\r\n\t\t\t\t\t\t\t\tif ( urests == null ) {\r\n\t\t\t\t\t\t\t\t\tco = null;\r\n\t\t\t\t\t\t\t\t\tbroken = true;\r\n\t\t\t\t\t\t\t\t\tbreak loop1;\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\tif ( !broken ) {\r\n\t\t\t\t\tif ( urest != null ) {\r\n\t\t\t\t\t\tco.getRestriction().clear();\r\n\t\t\t\t\t\tco.getRestriction().add( urest );\r\n\t\t\t\t\t}\r\n\t\t\t\t\tif ( urests != null ) {\r\n\t\t\t\t\t\tco.getRestrictions().clear();\r\n\t\t\t\t\t\tco.getRestrictions().add( urests );\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\tbreak;\r\n\t\t\tcase OR:\r\n\t\t\t\t// TODO: implement a distribution of AND over OR restrictions \r\n\t\t\t\tbreak;\r\n\t\t\tdefault:\r\n\t\t\t\tbreak;\r\n\t\t}\r\n\t\tbreak;\r\n\tcase OR:\r\n\t\tswitch ( bg.getFunction() ) {\r\n\t\t\tcase AND:\r\n\t\t\t\t// TODO: implement a distribution of OR over AND restrictions\r\n\t\t\t\tbreak;\r\n\t\t\tcase OR:\r\n\t\t\t\tco.getRestriction().addAll( bg.getRestriction() );\r\n\t\t\t\tco.getRestrictions().addAll( bg.getRestrictions() );\r\n\t\t\t\tbreak;\r\n\t\t\tdefault:\r\n\t\t\t\tbreak;\r\n\t\t}\r\n\t\tbreak;\r\n\tdefault:\r\n\t\tbreak;\r\n}\r\n\r\nif ( co == null ) {\r\n\t// some unification did not work -&gt; provide general result\r\n\tPRestrictions newRests = PatternFactory.eINSTANCE.createPRestrictions();\r\n\tnewRests.setFunction( PRestrictionsEnum.AND );\r\n\tfor (PRestrictions prests : new PRestrictions[]{ co, bg }) {\r\n\t\tif ( prests != null ) {\r\n\t\t\tnewRests.getRestrictions().add( prests );\r\n\t\t}\r\n\t}\r\n\treturn newRests;\r\n}\r\nreturn co;'"
	 * @generated
	 */
	PRestrictions unify(PRestrictions bg);

} // PRestrictions
