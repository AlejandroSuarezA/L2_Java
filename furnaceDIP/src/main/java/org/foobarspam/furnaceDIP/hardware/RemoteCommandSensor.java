package org.foobarspam.furnaceDIP.hardware;

import com.google.inject.Singleton;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.types.RoomTemperature;
@Singleton
public class RemoteCommandSensor implements Thermometer {
	
	public double read(RoomTemperature temperature){
		return temperature.getTemperature();
	}

}
