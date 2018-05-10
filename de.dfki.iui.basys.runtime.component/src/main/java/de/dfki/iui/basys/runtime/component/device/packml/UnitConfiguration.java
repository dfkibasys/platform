package de.dfki.iui.basys.runtime.component.device.packml;

import java.util.HashMap;

public class UnitConfiguration extends HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -899905783703657402L;
	
	
	public static final String[] KEYS = {"RECIPE"};
	
	public int getRecipe() {
		if (containsKey(KEYS[0]))
			return (int) get(KEYS[0]);
		else return -1;
	}
	
	public void setRecipe(int recipe) {
		put(KEYS[0],recipe);
	}
	
}
