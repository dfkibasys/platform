package de.dfki.iui.basys.model.base.datatypes;

public abstract class BDataType<T> {

	protected T value;
	protected boolean resolved = false;
	protected String expression = "";

	public BDataType(BDataType<T> rhs) {
		this.value = rhs.value;
		this.expression = rhs.expression;
		this.resolved = rhs.resolved;
	}

	public BDataType(T value) {
		this.value = value;
		this.resolved = true;
	}

	public BDataType() {
		expression = "";
		resolved = false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (resolved ? 1231 : 1237);
		if (resolved) {
			result = prime * result + ((value == null) ? 0 : value.hashCode());
		} else {
			result = prime * result + ((expression == null) ? 0 : expression.hashCode());
		}
		return result;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0.getClass() == this.getClass()) {
			BDataType<?> rhs = (BDataType<?>) arg0;
			if (this.resolved == rhs.resolved)
				if (this.resolved)
					return this.value.equals(rhs.value);
				else
					return this.expression.equals(rhs.expression);
			else
				return false;
		} else
			return value.equals(arg0);
	}

	public String getExpression() {
		return expression;
	}

	public boolean isResolved() {
		return resolved;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
		this.resolved = true;
	}

	@Override
	public String toString() {
		if (resolved)
			if (value != null)
				return value.toString();
			else
				return "";
		else if (expression == "")
			return expression;
		else
			return String.format("$expr(%s)", expression);
	}

	abstract public void setValue(String string);
}
