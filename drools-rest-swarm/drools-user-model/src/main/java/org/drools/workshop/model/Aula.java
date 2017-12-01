package org.drools.workshop.model;

public class Aula {

	private String name;
	private int numPersonas;
	private Lightswitch lightswitch;
	private AvailableLight availableLight;
	private AbsenceSensor absenceSensor;

  public Aula() {

  }

	public String getName()
	{
		return name;
	}

	public void setName(String newName)
	{
		this.name = newName;
	}

	public int getNumPersonas()
	{
		return numPersonas;
	}

	public void setNumPersonas(int newNumPersonas)
	{
		this.numPersonas = newNumPersonas;
	}

	public Lightswitch getLightswitch()
	{
		return lightswitch;
	}

	public void setLightswitch(Lightswitch newLight)
	{
		this.lightswitch = newLight;
	}

	public AvailableLight getAvailableLight()
	{
		return availableLight;
	}

	public void setAvailableLight(AvailableLight newAvailableLight)
	{
		this.availableLight = newAvailableLight;
	}

	public AbsenceSensor getAbsenceSensor()
	{
		return absenceSensor;
	}

	public void setnewAbsenceSensor(AbsenceSensor newAbsenceSensor)
	{
		this.absenceSensor = newAbsenceSensor;
	}





}
