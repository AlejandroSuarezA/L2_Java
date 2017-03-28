package org.foobarspam.heater;

import org.foobarspam.ambient.AmbientTemperature;

public class GasHeater implements Heater {

	public void engage(AmbientTemperature temperature) {
		temperature.setTemperature(1);
	}
	
	public void disengage(AmbientTemperature temperature){
		temperature.setTemperature(-1);
	}
	
}
