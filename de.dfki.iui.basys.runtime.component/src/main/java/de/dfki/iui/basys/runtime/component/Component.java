package de.dfki.iui.basys.runtime.component;

public interface Component {
	
	String getId();
	String getName();	
	ComponentCategory getCategory();
	ComponentConfiguration getConfig();

	void activate(ComponentContext context);
	void deactivate();

} 
