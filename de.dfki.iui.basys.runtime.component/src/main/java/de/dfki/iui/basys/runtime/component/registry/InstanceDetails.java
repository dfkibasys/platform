package de.dfki.iui.basys.runtime.component.registry;

public class InstanceDetails {
	private String		  productName;
    private String        description;
    private int 		  drillPower;

    public InstanceDetails()
    {
        this("", " ", 0);
    }

    public InstanceDetails(String productName, String description, int drillPower)
    {
    	this.productName = productName;
        this.description = description;
        this.drillPower = drillPower;
    }
    
    public void setProductName(String productName)
    {
    	this.productName = productName;
    }
    
    public String getProductName()
    {
    	return productName;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    
    public void setDrillPower(int drillPower)
    {
    	this.drillPower = drillPower;
    }
    
    public int getDrillPower()
    {
    	return this.drillPower;
    }
}
