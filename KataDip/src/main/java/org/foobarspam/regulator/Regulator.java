package org.foobarspam.regulator;

import org.foobarspam.ambient.AmbientTemperature;
import org.foobarspam.heater.Heater;
import org.foobarspam.thermometer.*;

public class Regulator {
	public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, AmbientTemperature temperature) {
		RegulatorDisplayCodes code;
		while (t.read(temperature) < maxTemp) {
			code = RegulatorDisplayCodes.HEATING;
			h.engage(temperature);
			message(code, temperature);
		}
		while (t.read(temperature) > minTemp) {
			code = RegulatorDisplayCodes.WAITING;
			h.disengage(temperature);
			message(code, temperature);
		}
	}

	private void message(RegulatorDisplayCodes code, AmbientTemperature temperature) {
		switch(code){
		case HEATING:
			System.out.println("Calentando => temperatura + 1: " + temperature.getTemperature());
			break;
			
		case WAITING:
			System.out.println("Apagado => temperatura -1: " + temperature.getTemperature());
		}
	}
}
