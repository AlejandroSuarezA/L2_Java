package org.foobarspam.heater;

import org.foobarspam.ambient.*;

public interface Heater {
	void engage(AmbientTemperature temperature);
	
	void disengage(AmbientTemperature temperature);
}
