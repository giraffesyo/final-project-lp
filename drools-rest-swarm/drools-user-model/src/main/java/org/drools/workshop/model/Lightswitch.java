package org.drools.workshop.model;

public class Lightswitch {

	private boolean onStatus;
	private int threshold;
	private int timeThreshold;
	
	public Lightswitch()
	{
		
	}
	
	public boolean getOnStatus()
	{
		return onStatus;
	}
	
	public void setOnStatus(boolean newStatus)
	{
		this.onStatus = newStatus;
	}
	
	public int getThreshold()
	{
		return threshold;
	}
	
	public void setThreshold(int newThreshold)
	{
		this.threshold = newThreshold;
	}
	
	public int getTimeThreshold()
	{
		return timeThreshold;
	}
	
	public void setTimeThreshold(int newTimeThreshold)
	{
		this.timeThreshold = newTimeThreshold;
	}
	
}


