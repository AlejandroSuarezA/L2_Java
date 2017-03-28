package org.foobarspam.ambient;

public class AmbientTemperature {
	private double temperature;
	
	public AmbientTemperature(double temperature){
		this.temperature = temperature;
	}
	
	public void setTemperature(double temperature){
		this.temperature += temperature;
	}
	
	public double getTemperature(){
		return this.temperature;
	}
}
