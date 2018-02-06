package de.dfki.iui.basys.model.base.datatypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BFloat extends BDataType<Float> {

	public BFloat() {
	}

	public BFloat(String input) {
		Matcher matcher = Pattern.compile("\\$expr\\((.*)\\)").matcher(input);
		if (matcher.matches()) {
			expression = matcher.toMatchResult().group(1);
		} else {
			value = Float.valueOf(input);
			resolved = true;
		}
	}

	public BFloat(float input) {
		value = input;
		resolved = true;
	}

	static public BFloat valueOf(String input) {
		return new BFloat(input);
	}

	@Override
	public void setValue(String value) {
		{
			BFloat rhs = BFloat.valueOf(value);
			this.value = rhs.value;
			this.expression = rhs.expression;
			this.resolved = rhs.resolved;
		}
	}
}
