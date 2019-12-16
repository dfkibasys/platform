/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

import java.text.DateFormat;
import java.text.ParseException;

public class Variable {

	String name;
	Object value;
	VariableType type;

	public Variable() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public VariableType getType() {
		return type;
	}

	public void setType(VariableType type) {
		this.type = type;
	}

	public Object castValue() {
		Object result = null;
		if (value == null)
			return result;
		

		switch (getType()) {
		case BOOLEAN:
			result = Boolean.parseBoolean(value.toString());
			break;
		case DATE:
			try {
				result = DateFormat.getDateInstance().parse(value.toString());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case DOUBLE:
			result = Double.parseDouble(value.toString());
			break;
		case INTEGER:
			result = Integer.parseInt(value.toString());
			break;
		case LONG:
			result = Long.parseLong(value.toString());
			break;
		default:
			result = value.toString();
			break;
		}

		return result;
	}

	public static class Builder {
		private String name;
		private Object value;
		private VariableType type;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder value(Object value) {
			this.value = value;
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
		this.value = builder.value;
		this.type = builder.type;
	}
}
