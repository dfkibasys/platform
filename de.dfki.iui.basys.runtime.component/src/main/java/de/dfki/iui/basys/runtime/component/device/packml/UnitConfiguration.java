package de.dfki.iui.basys.runtime.component.device.packml;

import java.util.HashMap;

public class UnitConfiguration extends HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -899905783703657402L;
	
	
	public static final String[] KEYS = {"RECIPE","PAYLOAD"};
	
	public int getRecipe() {
		if (containsKey(KEYS[0]))
			return (int) get(KEYS[0]);
		else return -1;
	}
	
	public void setRecipe(int recipe) {
		put(KEYS[0],recipe);
	}
	
	public Object getPayload() {
		if (containsKey(KEYS[1]))
			return get(KEYS[1]);
		else return -1;
	}
	
	public void setPayload(Object payload) {
		put(KEYS[1],payload);
	}
	
	
	// 
	
	
}
