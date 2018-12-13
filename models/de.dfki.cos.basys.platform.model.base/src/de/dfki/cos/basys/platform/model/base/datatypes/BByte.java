package de.dfki.cos.basys.platform.model.base.datatypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BByte extends BDataType<Byte> {

	public BByte() {
	}

	public BByte(String input) {
		Matcher matcher = Pattern.compile("\\$expr\\((.*)\\)").matcher(input);
		if (matcher.matches()) {
			expression = matcher.toMatchResult().group(1);
		} else {
			value = Byte.valueOf(input);
			resolved = true;
		}
	}

	public BByte(byte input) {
		value = input;
		resolved = true;
	}

	static public BByte valueOf(String input) {
		return new BByte(input);
	}

	@Override
	public void setValue(String value) {
		{
			BByte rhs = BByte.valueOf(value);
			this.value = rhs.value;
			this.expression = rhs.expression;
			this.resolved = rhs.resolved;
		}
	}
}
