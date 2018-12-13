package de.dfki.cos.basys.platform.model.base.datatypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BChar extends BDataType<Character> {

	public BChar() {
	}

	public BChar(String input) {
		Matcher matcher = Pattern.compile("\\$expr\\((.*)\\)").matcher(input);
		if (matcher.matches()) {
			expression = matcher.toMatchResult().group(1);
		} else {
			value = input.charAt(0);
			resolved = true;
		}
	}

	public BChar(char input) {
		value = input;
		resolved = true;
	}

	static public BChar valueOf(String input) {
		return new BChar(input);
	}

	@Override
	public void setValue(String value) {
		{
			BChar rhs = BChar.valueOf(value);
			this.value = rhs.value;
			this.expression = rhs.expression;
			this.resolved = rhs.resolved;
		}
	}
}
