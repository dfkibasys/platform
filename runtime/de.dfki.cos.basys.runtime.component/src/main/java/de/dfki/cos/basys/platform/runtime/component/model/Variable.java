/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

import java.text.DateFormat;
import java.text.ParseException;

public class Variable {

	String name;
	String valueString;
	VariableType type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValueString() {
		return valueString;
	}

	public void setValueString(String valueString) {
		this.valueString = valueString;
	}

	public VariableType getType() {
		return type;
	}

	public void setType(VariableType type) {
		this.type = type;
	}

	public Object getValue() {
		Object value = null;

		switch (getType()) {
		case BOOLEAN:
			value = Boolean.parseBoolean(getValueString());
			break;
		case DATE:
			try {
				value = DateFormat.getDateInstance().parse(getValueString());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case DOUBLE:
			value = Double.parseDouble(getValueString());
			break;
		case INTEGER:
			value = Integer.parseInt(getValueString());
			break;
		case LONG:
			value = Long.parseLong(getValueString());
			break;
		default:
			value = getValueString();
			break;
		}

		return value;
	}

	public static class Builder {
		private String name;
		private String valueString;
		private VariableType type;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder valueString(String valueString) {
			this.valueString = valueString;
			return this;
		}

		public Builder type(VariableType type) {
			this.type = type;
			return this;
		}

		public Variable build() {
			return new Variable(this);
		}
	}

	private Variable(Builder builder) {
		this.name = builder.name;
		this.valueString = builder.valueString;
		this.type = builder.type;
	}
}
