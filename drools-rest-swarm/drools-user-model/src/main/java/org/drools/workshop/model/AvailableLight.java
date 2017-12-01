package org.drools.workshop.model;

public class AvailableLight {

	private int outputLights;
	private int outputDaylight;
	
	public AvailableLight()
	{
		
	}
	
	public int getOutputLights()
	{
		return outputLights;
	}
	
	public void setOutputLights(int newOutputL)
	{
		this.outputLights = newOutputL;
	}
	
	public int getOutputDaylight()
	{
		return outputDaylight;
	}
	
	public void setOutputDaylight(int newOutputD)
	{
		this.outputDaylight = newOutputD;
	}
	
}
