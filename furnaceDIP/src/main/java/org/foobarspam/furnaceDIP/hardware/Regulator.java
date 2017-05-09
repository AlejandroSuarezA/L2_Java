package org.foobarspam.furnaceDIP.hardware;

import com.google.inject.Inject;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Regulate;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.types.RegulatorDisplayCodes;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

public class Regulator implements Regulate {

	Thermometer t = null;
	Heater h = null;
    double minTemp;
	double maxTemp;
	RoomTemperature temperature = null;
	RegulatorDisplayCodes code;

	@Inject
	public Regulator (Thermometer t, Heater h)
	{
		this.t = t;
		this.h = h;
	}

	@Inject
    public void setRoomTemperature(RoomTemperature rt)
    {
        this.temperature = rt;
    }

	public void regulate(){
			while(t.read(temperature) < maxTemp){
				code = RegulatorDisplayCodes.HEATING;				
				h.engage(temperature);
				message();
			}
			while (t.read(temperature) > minTemp){
				code = RegulatorDisplayCodes.WAITING;
				h.disengage(temperature);			
				message();
			}
	}

	private void message(){
		switch(code){
			case HEATING:
				System.out.println("Calentando => temperatura "+ temperature.getTemperature());
				break;
			case WAITING:
				System.out.println("Apagado => temperatura " + temperature.getTemperature());
				break;
			default:
				System.out.println("Algo raro sucede...");
				break;
		}
	}

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

}
