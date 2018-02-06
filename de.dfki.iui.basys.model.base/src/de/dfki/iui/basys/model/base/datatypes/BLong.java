package de.dfki.iui.basys.model.base.datatypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BLong extends BDataType<Long> {

	public BLong() {
	};

	public BLong(String input) {
		Matcher matcher = Pattern.compile("\\$expr\\((.*)\\)").matcher(input);
		if (matcher.matches()) {
			expression = matcher.toMatchResult().group(1);
		} else {
			value = Long.valueOf(input);
			resolved = true;
		}
	}

	public BLong(long input) {
		value = input;
		resolved = true;
	}

	static public BLong valueOf(String input) {
		return new BLong(input);
	}

	@Override
	public void setValue(String value) {
		{
			BLong rhs = BLong.valueOf(value);
			this.value = rhs.value;
			this.expression = rhs.expression;
			this.resolved = rhs.resolved;
		}
	}
}
