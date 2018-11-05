package de.dfki.iui.basys.runtime.connector;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Parameter {

	@XmlAttribute
	private String name;
	
	@XmlAttribute
	private String value;

	public Parameter() {
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

}
