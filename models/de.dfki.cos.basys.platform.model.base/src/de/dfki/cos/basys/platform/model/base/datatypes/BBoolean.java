package de.dfki.cos.basys.platform.model.base.datatypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BBoolean extends BDataType<Boolean> {

	public BBoolean() {
	}

	public BBoolean(String input) {
		Matcher matcher = Pattern.compile("\\$expr\\((.*)\\)").matcher(input);
		if (matcher.matches()) {
			expression = matcher.toMatchResult().group(1);
		} else {
			value = Boolean.valueOf(input);
			resolved = true;
		}
	}

	static public BBoolean valueOf(String input) {
		return new BBoolean(input);
	}

	public BBoolean(boolean input) {
		value = input;
		resolved = true;
	}

	@Override
	public void setValue(String value) {
		{
			BBoolean rhs = BBoolean.valueOf(value);
			this.value = rhs.value;
			this.expression = rhs.expression;
			this.resolved = rhs.resolved;
		}
	}
}
