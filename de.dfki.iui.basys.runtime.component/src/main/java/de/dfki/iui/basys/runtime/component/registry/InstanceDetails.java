package de.dfki.iui.basys.runtime.component.registry;

public class InstanceDetails {
	
	private String		  inChannel;
	private String		  outChannel;

    public InstanceDetails()
    {
        this("", "");
    }

    public InstanceDetails(String inChannel, String outChannel)
    {
    	this.inChannel = inChannel;
        this.outChannel = outChannel;
    }
    
    public String getInChannel() {
		return inChannel;
	}
    
    public void setInChannel(String inChannel) {
		this.inChannel = inChannel;
	}
    
    public String getOutChannel() {
		return outChannel;
	}
    
    public void setOutChannel(String outChannel) {
		this.outChannel = outChannel;
	}
}
