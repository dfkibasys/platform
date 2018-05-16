package de.dfki.iui.basys.runtime.connector;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Message")
public class CaaMessage {

	public CaaMessage() {
		// TODO Auto-generated constructor stub
	}

	 @XmlElement(name="Parameter")
	List<Parameter> parameters = new ArrayList<>();
	
	public List<Parameter> getParameters() {
		return parameters;
	}
	
	public String getParameter(String key) {
		for (Parameter p : parameters) {
			if (p.getName().equals(key))
				return p.getValue();
		}
		return null;
	}
	
	public int getFunctionId() {
		String value = getParameter("functionID");
		return Integer.parseInt(value);
	}
	
	public int getSerialNr() {
		String value = getParameter("serialNr");
		return Integer.parseInt(value);
	}	
	
	public int getMatNr() {
		String value = getParameter("matNr");
		return Integer.parseInt(value);
	}

	public int getCapType() {
		String value = getParameter("capType");
		return Integer.parseInt(value);
	}

	public int getOrderNr() {
		String value = getParameter("orderNr");
		return Integer.parseInt(value);
	}
}
