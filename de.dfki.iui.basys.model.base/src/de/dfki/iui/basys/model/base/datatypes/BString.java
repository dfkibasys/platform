package de.dfki.iui.basys.model.base.datatypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BString extends BDataType<String> {

	public BString() {
	};

	public BString(String input) {
		Matcher matcher = Pattern.compile("\\$expr\\((.*)\\)").matcher(input);
		if (matcher.matches()) {
			expression = matcher.toMatchResult().group(1);
		} else {
			value = input;
			resolved = true;
		}
	}

	static public BString valueOf(String input) {
		return new BString(input);
	}

	@Override
	public void setValue(String value) {
		{
			BString rhs = BString.valueOf(value);
			this.value = rhs.value;
			this.expression = rhs.expression;
			this.resolved = rhs.resolved;
		}
	}

	public String toLowerCase() {
		return this.getValue().toLowerCase();
	}

	public String toUpperCase() {
		return this.getValue().toUpperCase();
	}

	public boolean isEmpty() {
		return getValue() == null || getValue().isEmpty();
	}

	public static boolean isNullOrEmpty(BString device) {
		return device == null || device.isEmpty();
	}

	public boolean equalsIgnoreCase(BString rhs) {
		if (resolved)
			return value.equalsIgnoreCase(rhs.toString());
		else
			return this.equals(rhs);
	}

	public boolean equalsIgnoreCase(String rhs) {
		if (resolved)
			return value.equalsIgnoreCase(rhs);
		else
			return false;
	}
}
