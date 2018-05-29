package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import hue.gen.Color;
import hue.gen.HueError;
import hue.gen.HueService;
import hue.gen.HueService.Client;

public class HueLightsNotifier {

	private static final Color HUE_RED = new Color(255, 0, 255);
    private static final Color HUE_GREEN = new Color(255, 25500, 255);
	
    private Client client;
    private final String lid;
    
    public HueLightsNotifier(TProtocol prot, String lid) {
    	client = new HueService.Client(prot);
    	this.lid = lid;
    }
    
    public void enableForTime(boolean green, long ms) throws HueError, TException, InterruptedException {
    	client.setState(lid, true);
    	client.setColor(lid, green ? HUE_GREEN : HUE_RED);
    	Thread.sleep(ms);
    	client.setState(lid, false);
    }
    
    public void enable(boolean green) throws HueError, TException {
    	client.setState(lid, true);
    	client.setColor(lid, green ? HUE_GREEN : HUE_RED);
    }
    
    public void disable() throws HueError, TException {
    	client.setState(lid, false);
    }
	
}
