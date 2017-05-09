package org.foobarspam.furnaceDIP.inyector;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import org.foobarspam.furnaceDIP.hardware.GasHeater;
import org.foobarspam.furnaceDIP.hardware.Regulator;
import org.foobarspam.furnaceDIP.hardware.RemoteCommandSensor;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Regulate;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.types.RoomTemperature;


/**
 * Created by jander on 09/05/17.
 */
public class ReguladorModule extends AbstractModule{

    @Override
    protected void configure()
    {
        bind(Heater.class).to(GasHeater.class);
        bind(Thermometer.class).to(RemoteCommandSensor.class);
        bind(Regulate.class).to(Regulator.class);
    }
    
    @Provides
    RoomTemperature provideRoomTemperature() {
    	RoomTemperature roomTemperature = new RoomTemperature();
    	roomTemperature.setTemperature(15);
    	return roomTemperature;
    	}
}
