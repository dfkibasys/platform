package de.dfki.iui.basys.model.base.computation;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import de.dfki.cos.basys.common.emf.EmfPersistence;
import de.dfki.iui.basys.model.pattern.PPattern;

public class SubsumeReport {
	public PPattern pattern1;
	public PPattern pattern2;
	public SubsumeResult result;
	String reason;

	public String getReason() {
		String result = reason;
		// try {
		// if (result.contains("$object")) {
		// if (instance instanceof EObject) {
		// result = result.replaceAll("\\$object", EmfPersistence.writeToString((EObject) instance));
		// } else {
		// result = result.replaceAll("\\$object", instance.toString());
		// }
		// }
		// if (result.contains("$pattern")) {
		// result = result.replaceAll("\\$pattern", EmfPersistence.writeToString(pattern));
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		return result;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public HashMap<String, Object> variables = new HashMap<String, Object>();

	public SubsumeReport(PPattern pattern1, PPattern pattern2) {
		this.pattern1 = pattern1;
		this.pattern2 = pattern2;
	}

	public SubsumeReport(PPattern pattern1, PPattern pattern2, SubsumeResult result) {
		this.pattern1 = pattern1;
		this.pattern2 = pattern2;
		this.result = result;
	}

	public SubsumeReport setResult(SubsumeResult result) {
		this.result = result;
		return this;
	}

	public enum SubsumeResult {
		NOT_VALIDATED,
		MATCH_SUCCESS,
		NO_COMMON_LEAST_UPPER_BOUND,
		FEATURE_NOT_SET,
		VALUE_MATCH_FAILED,
		MULTI_FEATURE_MATCH_FAILED,
		ILLEGAL_PATTERN,
		FEATURE_NOT_EMPTY,
		NOT_EXISTS_FAILED,
		FOR_ALL_FAILED,
		PATTERN_TYPE_CONFLICT
	}

}
