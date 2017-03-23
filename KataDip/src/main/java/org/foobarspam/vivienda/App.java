package org.foobarspam.vivienda;

import org.foobarspam.*;
import org.foobarspam.ambient.AmbientTemperature;
import org.foobarspam.heater.GasHeater;
import org.foobarspam.heater.Heater;
import org.foobarspam.regulator.Regulator;
import org.foobarspam.thermometer.RemoteCommandSensor;
import org.foobarspam.thermometer.Thermometer;

public class App {

	public static void main(String[] args) {
		final double minTemp = 15.0;
		final double maxTemp = 21.5;
		AmbientTemperature ambient = new AmbientTemperature(15.3);
		Heater gasHeater = new GasHeater();
		Thermometer remote = new RemoteCommandSensor();
		Regulator regulador = new Regulator();
		regulador.regulate(remote, gasHeater, minTemp, maxTemp, ambient);
	}

}
