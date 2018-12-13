package de.dfki.cos.basys.platform.model.base.datatypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BInteger extends BDataType<Integer> {

	public BInteger() {
	}

	public BInteger(String input) {
		Matcher matcher = Pattern.compile("\\$expr\\((.*)\\)").matcher(input);
		if (matcher.matches()) {
			expression = matcher.toMatchResult().group(1);
		} else {
			value = Integer.valueOf(input);
			resolved = true;
		}
	}

	public BInteger(int input) {
		value = input;
		resolved = true;
	}

	static public BInteger valueOf(String input) {
		return new BInteger(input);
	}

	@Override
	public void setValue(String value) {
		{
			BInteger rhs = BInteger.valueOf(value);
			this.value = rhs.value;
			this.expression = rhs.expression;
			this.resolved = rhs.resolved;
		}
	}
}
