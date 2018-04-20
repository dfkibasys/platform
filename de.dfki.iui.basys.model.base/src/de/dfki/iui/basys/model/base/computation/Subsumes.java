package de.dfki.iui.basys.model.base.computation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.common.emf.EmfPersistence;
import de.dfki.iui.basys.model.base.computation.MatchReport.MatchResult;
import de.dfki.iui.basys.model.base.computation.SubsumeReport.SubsumeResult;
import de.dfki.iui.basys.model.pattern.PEmptySlot;
import de.dfki.iui.basys.model.pattern.PObject;
import de.dfki.iui.basys.model.pattern.PPattern;
import de.dfki.iui.basys.model.pattern.PQuantorEnum;
import de.dfki.iui.basys.model.pattern.PRestriction;
import de.dfki.iui.basys.model.pattern.PRestrictions;
import de.dfki.iui.basys.model.pattern.PRestrictionsEnum;
import de.dfki.iui.basys.model.pattern.PSlot;
import de.dfki.iui.basys.model.pattern.PValue;

public class Subsumes {

	static Logger logger = LoggerFactory.getLogger(Subsumes.class);

	// public Matches(Object instance, Object pattern) {
	// super(instance, pattern);
	// }
	//
	// @Override
	// public Object compute(Object instance, Object pattern) {
	// if (pattern instanceof PPattern && instance instanceof EObject)
	// return matches((EObject) instance, (PPattern) pattern);
	// else
	// return null;
	// }

	public static SubsumeReport subsumes(PPattern pattern1, PPattern pattern2) {
		SubsumeReport report;
		if (pattern1 instanceof PObject && pattern2 instanceof PObject) {
			report = _subsumesPObject((PObject) pattern1, (PObject) pattern2);
		} else if (pattern1 instanceof PValue && pattern2 instanceof PValue) {
			report = _subsumesPValue((PValue) pattern1, (PValue) pattern2);
		} else {
			report = new SubsumeReport(pattern1, pattern2, SubsumeResult.PATTERN_TYPE_CONFLICT);
		}
		return report;
	}

	private static MatchReport _matchesPValue(Object instance, PValue pattern) {
		// logger.info("[MATCHES] object = " + instance + " value = " +
		// pattern);
		MatchReport matchReport = new MatchReport(instance, pattern);
		if (satisfiesRestrictions(instance, pattern.getRestrictions())) {
			matchReport.result = MatchResult.MATCH_SUCCESS;
			if (!isNullOrBlank(pattern.getVarName())) {
				matchReport.variables.put(pattern.getVarName(), instance);
			}
		} else {
			matchReport.result = MatchResult.VALUE_MATCH_FAILED;
		}
		return matchReport;
	}

	private static SubsumeReport _subsumesPValue(PValue pattern1, PValue pattern2) {
		SubsumeReport report = new SubsumeReport(pattern1, pattern2);
		if (pattern1.getType() != pattern2.getType())
			return report.setResult(SubsumeResult.PATTERN_TYPE_CONFLICT);

		return report;
	}

	private static SubsumeReport _subsumesPObject(PObject pattern1, PObject pattern2) {
		SubsumeReport report = new SubsumeReport(pattern1, pattern2);

		return report;
	}

	static boolean isFeatureSet(EObject instance, EStructuralFeature feature) {
		if (feature instanceof EAttribute && !feature.isUnsettable())
			return true;
		return instance.eIsSet(feature);
	}

	/*
	 * private static MatchReport _matchesPObject(EObject instance, PObject pattern) {
	 * 
	 * MatchReport report = new MatchReport(instance, pattern); // logger.debug("[MATCHES] instance = " + instance + " pattern = " + // pattern);
	 * 
	 * Set<EStructuralFeature> features = Computation.getLeastUpperBoundFeatures(instance.eClass(), pattern.getType(), true);
	 * 
	 * if (!pattern.getType().getInstanceClass().isInstance(instance)) { report.result = MatchResult.NO_COMMON_LEAST_UPPER_BOUND; report.reason = String.format("%s is no instance of type %s.",
	 * instance.eClass().getName(), pattern.getType().getName()); return report; }
	 * 
	 * if (features.isEmpty()) { report.result = MatchResult.NO_COMMON_LEAST_UPPER_BOUND; report.reason = "getLeastUpperBoundFeatures returned empty set"; return report; }
	 * 
	 * for (EStructuralFeature feature : features) { PSlot slot = pattern.getSlot(feature); if (slot != null) { if (slot.getRange() != null && slot.getRange().size() > 0 && slot.getRange().get(0)
	 * instanceof PEmptySlot) { if (instance.eIsSet(feature)) { report.result = MatchResult.FEATURE_NOT_EMPTY; report.reason = String.format("instance feature \"%s\" must be empty",
	 * feature.getName()); return report; } else { continue; } }
	 * 
	 * else if (!isFeatureSet(instance, feature) && !(feature.getEType() instanceof EEnum)) { report.result = MatchResult.FEATURE_NOT_SET; report.reason = String.format("instance feature %s not set",
	 * feature.getName()); return report; } if (feature instanceof EReference) { if (feature.isMany()) { // logger.debug(" [Case mult reference] " + // instance.eClass().getName() + "." + //
	 * feature.getName()); if (slot.getRange().size() > 0) { MatchReport tmp = _matchesPatterns((List<? extends EObject>) instance.eGet(feature), slot.getRange());
	 * 
	 * if (tmp.result != MatchResult.MATCH_SUCCESS) { report.result = tmp.result; report.reason = tmp.reason; // logger.debug("return null 1"); return report; } else {
	 * report.variables.putAll(tmp.variables); } } } else { // logger.debug(" [Case sing reference] " + // instance.eClass().getName() + "." + // feature.getName()); PObject pobject =
	 * slot.getRangeObject();
	 * 
	 * MatchReport tmp = _matchesPObject((EObject) instance.eGet(feature), pobject); if (pobject.getQuantor() == PQuantorEnum.EXISTS || pobject.getQuantor() == PQuantorEnum.FOR_ALL) { if (tmp.result
	 * != MatchResult.MATCH_SUCCESS) return tmp; else { report.variables.putAll(tmp.variables); } } else if (pobject.getQuantor() == PQuantorEnum.NOT_EXISTS) { if (tmp.result ==
	 * MatchResult.MATCH_SUCCESS) return tmp; else { report.variables.putAll(tmp.variables); } } }
	 * 
	 * } // feature is an attribute else if (feature.isMany()) { // logger.debug(" [Case mult attribute] " + // instance.eClass().getName() + "." + // feature.getName()); MatchReport tmp =
	 * _matchesPatterns((List<? extends EObject>) instance.eGet(feature), slot.getRange());
	 * 
	 * if (tmp.result != MatchResult.MATCH_SUCCESS) { report.result = tmp.result; report.reason = tmp.reason; // logger.debug("return null 1"); return report; } else {
	 * report.variables.putAll(tmp.variables); } } else { // logger.debug(" [Case sing attribute] " + // instance.eClass().getName() + "." + // feature.getName()); // logger.debug("instance: " +
	 * instance.eGet(feature) + // "; pattern: " + slot.getRange());
	 * 
	 * PValue pvalue = slot.getRangeValue(); Object value = instance.eGet(feature); // TODO Exception model für pattern matching einführen if (pvalue == null) {
	 * logger.error(String.format("Error in pattern. No value defined for slot %s in pattern with type %s.", slot.getFeatureName(), pattern.getType().getName())); }
	 * 
	 * if (pvalue.getQuantor() == PQuantorEnum.EXISTS || pvalue.getQuantor() == PQuantorEnum.FOR_ALL) { if (value == null) { report.result = MatchResult.FEATURE_NOT_SET; report.reason =
	 * String.format("Feature %s is not set in $object.", feature.getName()); return report; } MatchReport tmp = _matchesPValue(value, pvalue); if (tmp.result != MatchResult.MATCH_SUCCESS) {
	 * report.result = tmp.result; report.reason = String.format("%s not matches:\n $pattern", instance.eGet(feature)); report.instance = instance.eGet(feature); report.pattern =
	 * EcoreUtil.copy((PPattern) pvalue); return report; } else { report.variables.putAll(tmp.variables); } } else if (pvalue.getQuantor() == PQuantorEnum.NOT_EXISTS) { if (value == null) {
	 * report.result = MatchResult.MATCH_SUCCESS; report.reason = "Success!"; return report; } MatchReport tmp = _matchesPValue(value, pvalue); if (tmp.result == MatchResult.MATCH_SUCCESS) {
	 * report.result = MatchResult.NOT_EXISTS_FAILED; report.reason = "$object matches:\n $pattern"; report.instance = instance.eGet(feature); report.pattern = EcoreUtil.copy((PPattern) pvalue);
	 * return report; } }
	 * 
	 * } } else { // logger.debug("ignoring feature " + feature.getName()); } } report.result = MatchResult.MATCH_SUCCESS; report.reason = "Success!"; if (!isNullOrBlank(pattern.getVarName())) {
	 * String varName = pattern.getVarName(); if (varName.endsWith("[]")) { String old_varName = pattern.getVarName(); pattern.setVarName(pattern.getVarName().substring(0, varName.length() - 2));
	 * ArrayList list = new ArrayList<Object>(); EStructuralFeature containingFeature = instance.eContainingFeature(); if (containingFeature.isMany()) { Object eGet =
	 * instance.eContainer().eGet(containingFeature); for (Object content : (Iterable) eGet) if (matches(content, pattern).result == MatchResult.MATCH_SUCCESS) { list.add(content); } } else {
	 * list.add(instance); } report.variables.put(pattern.getVarName(), list); pattern.setVarName(old_varName); } else { report.variables.put(pattern.getVarName(), instance); }
	 * 
	 * } return report; }
	 */
	public static boolean isNullOrBlank(String param) {
		return param == null || param.trim().length() == 0;
	}

	/**
	 * Checks whether the given list of patterns matches some instances in the given list. The number of given patterns must be less or equal to the number of given instances, i.e.
	 * <CODE>patterns.size() <= instances.size()</CODE>, to be able to perform the validation. <BR>
	 * Otherwise <CODE>null</CODE> is returned.
	 * 
	 * 
	 * @param instances
	 * @param existsPatterns
	 * @return the list of matching instances if for each pattern there is a different instance, otherwise false.
	 */
	/*
	 * private static MatchReport _matchesPatterns(List<? extends EObject> instances, List<PPattern> patterns) {
	 * 
	 * // check NOT_EXISTS patterns for (PPattern pattern : patterns) if (pattern.getQuantor() == PQuantorEnum.NOT_EXISTS) { if (pattern.getInstIdx() != -1) { try {
	 * logger.warn(String.format("Pattern %s with quantor NOT_EXISTS contains a value for InstIdx. This is ignored!", EmfPersistence.writeToString(pattern))); } catch (IOException e) {
	 * e.printStackTrace(); } } for (Object object : instances) { if (pattern.matches(object)) { MatchReport matchReport = new MatchReport(object, pattern); matchReport.result =
	 * MatchResult.NOT_EXISTS_FAILED; matchReport.reason = "$object not matches:\n $pattern"; return matchReport; } } }
	 * 
	 * // check FOR_ALL patterns for (PPattern pattern : patterns) if (pattern.getQuantor() == PQuantorEnum.FOR_ALL) { if (pattern.getInstIdx() != -1) { try {
	 * logger.warn(String.format("Pattern %s with quantor FOR_ALL contains a value for InstIdx. This is ignored!", EmfPersistence.writeToString(pattern))); } catch (IOException e) {
	 * e.printStackTrace(); } } for (Object object : instances) { if (!pattern.matches(object)) { MatchReport matchReport = new MatchReport(object, pattern); matchReport.result =
	 * MatchResult.FOR_ALL_FAILED; matchReport.reason = "$object not matches:\n $pattern"; return matchReport; } } }
	 * 
	 * // check EXISTS patterns List<PPattern> existsPatterns = new ArrayList<PPattern>(); for (PPattern pattern : patterns) if (pattern.getQuantor() == PQuantorEnum.EXISTS) {
	 * existsPatterns.add(pattern); }
	 * 
	 * // no exists pattern available MatchReport matchReport = new MatchReport(null, null); int size = existsPatterns.size(); if (size == 0) { matchReport.result = MatchResult.MATCH_SUCCESS;
	 * matchReport.reason = "Success!"; return matchReport; } // 'matchTable' is used to store the intermediate match results. // matchTable[i][j] is match result of matches(instances.get( j ), //
	 * patterns.get( i )) MatchReport[][] matchTable = new MatchReport[size][instances.size()];
	 * 
	 * if (size > instances.size()) { matchReport.result = MatchResult.MULTI_FEATURE_MATCH_FAILED; matchReport.reason = "less instances than patterns"; return matchReport; } else if (instances.size()
	 * == 0 && size == 0) { matchReport.result = MatchResult.MULTI_FEATURE_MATCH_FAILED; matchReport.reason = "instance list and pattern list are empty"; return matchReport; } else { MatchReport
	 * notValidated = new MatchReport(null, null); notValidated.result = MatchResult.NOT_VALIDATED; for (int i = 0; i < size; ++i) { for (int j = 0; j < instances.size(); j++) { matchTable[i][j] =
	 * notValidated; } } Integer[] tmp = new Integer[size]; Arrays.fill(tmp, -1);
	 * 
	 * // analyze patterns with fix index for (int i = 0; i < existsPatterns.size(); ++i) { PPattern pattern = existsPatterns.get(i); if (pattern.getInstIdx() != -1) { if
	 * (matchTable[i][pattern.getInstIdx()].result == MatchResult.MULTI_FEATURE_MATCH_FAILED) { matchReport.result = MatchResult.MULTI_FEATURE_MATCH_FAILED; matchReport.reason =
	 * String.format("There exists already a fixed index pattern for pattern %d with fix index %d", i, pattern.getInstIdx()); return matchReport; } if (pattern.getInstIdx() < instances.size()) {
	 * MatchReport m = matches(instances.get(pattern.getInstIdx()), pattern); if (m.result == MatchResult.MATCH_SUCCESS) { matchTable[i][pattern.getInstIdx()] = m; for (int j = 0; j <
	 * existsPatterns.size(); ++j) { if (j != i) { MatchReport report = new MatchReport(null, null); report.result = MatchResult.MULTI_FEATURE_MATCH_FAILED; matchTable[j][pattern.getInstIdx()] =
	 * report; } } for (int j = 0; j < instances.size(); ++j) { if (j != pattern.getInstIdx()) { MatchReport report = new MatchReport(null, null); report.result =
	 * MatchResult.MULTI_FEATURE_MATCH_FAILED; matchTable[i][j] = report; } } } else { matchReport.result = MatchResult.MULTI_FEATURE_MATCH_FAILED; matchReport.reason =
	 * String.format("No match for pattern %d with fix index %d", i, pattern.getInstIdx()); return matchReport; } } else { matchReport.result = MatchResult.MULTI_FEATURE_MATCH_FAILED;
	 * matchReport.reason = String.format("There exists no instance (ArrayOutOufBound) for pattern %d with fix index %d", i, pattern.getInstIdx()); return matchReport; } } }
	 * 
	 * List<Integer> curPos = new ArrayList<Integer>(); curPos.addAll(Arrays.asList(tmp));
	 * 
	 * // each subset contains the 'real positions' of instances for (SubS subset : new PowS(size, instances.size())) { if (subset.numbers.length == 2 && subset.numbers[0] == 0 && subset.numbers[1] ==
	 * 2) { System.err.println(); } for (int pattPos = 0; pattPos < size;) { int cp = curPos.get(pattPos); for (int j = cp + 1; j < size;) { int instPos = subset.numbers[j]; switch
	 * (matchTable[pattPos][instPos].result) { case NOT_VALIDATED: matchTable[pattPos][instPos] = matches(instances.get(instPos), existsPatterns.get(pattPos)); break; case MATCH_SUCCESS: if
	 * (curPos.contains(j)) { // it is already used by another pattern j++; } else { curPos.set(pattPos, j); j = size; // stop the looping } break; default: // match failed by any reason j++; break; }
	 * }
	 * 
	 * if (curPos.get(pattPos) == cp) { // nothing changed, backtracking needed: if (--pattPos == -1) { // try the next subset curPos.clear(); curPos.addAll(Arrays.asList(tmp)); break; } } else if
	 * (++pattPos == size) { // solution found at the last pattern for (int i = 0, pos; i < size; i++) { pos = subset.numbers[curPos.get(i)];
	 * matchReport.variables.putAll(matchTable[i][pos].variables); } matchReport.result = MatchResult.MATCH_SUCCESS; matchReport.reason = "Success!"; return matchReport; } } } } matchReport.result =
	 * MatchResult.MULTI_FEATURE_MATCH_FAILED; matchReport.reason = ""; for (int i = 0; i < size; ++i) { boolean foundMatch = false; for (int j = 0; j < instances.size(); ++j) { if
	 * (matchTable[i][j].result == MatchResult.MATCH_SUCCESS) { foundMatch = true; break; } } if (!foundMatch) { try { matchReport.reason += "No match found for pattern " +
	 * EmfPersistence.writeToString(existsPatterns.get(i)) + "\n"; } catch (Exception ex) { System.err.println(ex.getLocalizedMessage()); } } } return matchReport; }
	 */
	public static boolean satisfiesRestrictions(Object value, PRestrictions constraints) {
		boolean result = true;
		if (constraints != null) {
			boolean and = constraints.getFunction() == PRestrictionsEnum.AND ? true : false;
			// logger.debug("and: " + and);
			EList<PRestriction<?, ?>> cs = constraints.getRestriction();
			// TODO prüfen ob das hier noch funktioniert
			for (PRestriction<?, ?> c : cs) {
				result = satisfiesRestriction(value, c);
				// logger.debug("result: " + result);
				if ((result && !and) || (!result && and))
					return result;
			}

			EList<PRestrictions> css = constraints.getRestrictions();
			for (PRestrictions c : css) {
				result = satisfiesRestrictions(value, c);
				if ((result && !and) || (!result && and))
					return result;
			}
		}
		return result;
	}

	public static boolean satisfiesRestriction(Object value, PRestriction<?, ?> constraint) {
		return constraint.isSatisfiedBy(value);
	}

	static class PowS implements Iterable<SubS>, Iterator<SubS> {
		private int n = 0, m = 0, cur = 0;
		private String ss = "";

		public PowS(int n, int m) {
			this.n = n;
			this.m = m;
			for (int i = 0; i < n; i++) {
				ss += "1";
			}
			cur = Integer.parseInt(ss, 2);
		}

		@Override
		public boolean hasNext() {
			return ss != null && ss.length() <= m;
		}

		@Override
		public SubS next() {
			if (ss == null || ss.length() > m)
				throw new RuntimeException("No further elements available.");
			SubS res = new SubS(ss, n);
			boolean found = false;
			while (ss.length() <= m) {
				ss = new StringBuffer(Integer.toBinaryString(++cur)).reverse().toString();
				if (ss.length() <= m) {
					int num = 0;
					for (char c : ss.toCharArray())
						if (c == '1') {
							num++;
						}

					// the following addition of a suffix must not be in the
					// next if-conditional since
					// the length
					char[] sfx = new char[m - ss.length()];
					Arrays.fill(sfx, '0');
					ss += new String(sfx);

					if (found = num == n) {
						break;
					}
				}
			}
			if (!found) {
				ss = null;
			}
			return res;
		}

		@Override
		public void remove() {
			throw new RuntimeException("The iterator class 'PS' does not implement the iterator method 'public void remove()' yet.");
		}

		@Override
		public Iterator<SubS> iterator() {
			return this;
		}

	}

	static class SubS implements Iterable<Integer>, Iterator<Integer> {
		public int[] numbers;
		public int pos = 0;
		private final int n;

		public SubS(String ss, int n) {
			this.n = n;
			numbers = new int[n];
			for (int j = 0, i = 0, l = ss.length(); i < l; i++)
				if (ss.charAt(i) == '1') {
					numbers[j++] = i;
				}
		}

		@Override
		public boolean hasNext() {
			return pos < n;
		}

		@Override
		public Integer next() {
			return numbers[pos++];
		}

		@Override
		public void remove() {
			throw new RuntimeException("The iterator class 'SS' does not implement the iterator method 'public void remove()' yet.");
		}

		@Override
		public Iterator<Integer> iterator() {
			return SubS.this;
		}

	}
}
