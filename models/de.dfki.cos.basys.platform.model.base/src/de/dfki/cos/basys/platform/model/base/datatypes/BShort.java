package de.dfki.cos.basys.platform.model.base.datatypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BShort extends BDataType<Short> {

	public BShort() {
	};

	public BShort(String input) {
		Matcher matcher = Pattern.compile("\\$expr\\((.*)\\)").matcher(input);
		if (matcher.matches()) {
			expression = matcher.toMatchResult().group(1);
		} else {
			value = Short.valueOf(input);
			resolved = true;
		}
	}

	public BShort(short input) {
		value = input;
		resolved = true;
	}

	static public BShort valueOf(String input) {
		return new BShort(input);
	}

	@Override
	public void setValue(String value) {
		{
			BShort rhs = BShort.valueOf(value);
			this.value = rhs.value;
			this.expression = rhs.expression;
			this.resolved = rhs.resolved;
		}
	}
}
