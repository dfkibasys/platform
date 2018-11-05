package de.dfki.iui.basys.model.base.datatypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BDouble extends BDataType<Double> {

	public BDouble() {
	}

	public BDouble(String input) {
		Matcher matcher = Pattern.compile("\\$expr\\((.*)\\)").matcher(input);
		if (matcher.matches()) {
			expression = matcher.toMatchResult().group(1);
		} else {
			value = Double.valueOf(input);
			resolved = true;
		}
	}

	public BDouble(double input) {
		value = input;
		resolved = true;
	}

	static public BDouble valueOf(String input) {
		return new BDouble(input);
	}

	@Override
	public void setValue(String value) {
		{
			BDouble rhs = BDouble.valueOf(value);
			this.value = rhs.value;
			this.expression = rhs.expression;
			this.resolved = rhs.resolved;
		}
	}
}
