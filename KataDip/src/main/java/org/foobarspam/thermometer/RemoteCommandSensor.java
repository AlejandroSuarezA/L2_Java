package org.foobarspam.thermometer;

import org.foobarspam.ambient.AmbientTemperature;

public class RemoteCommandSensor implements Thermometer {

	public double read(AmbientTemperature temperature) {
		double t = temperature.getTemperature();
		return t;
	}

}
