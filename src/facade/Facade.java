package facade;

import java.util.Arrays;
import java.util.List;

public class Facade {
    public Mobile on(){
        Battery battery = new Battery();
        battery.on();

        CPU cpu = new CPU();
        cpu.bootLoad();

        MobileServices gps = new GPSService();
        gps.start();

        MobileServices wifi = new WifiService();
        wifi.start();

        List<MobileServices> mobileServices = Arrays.asList(gps, wifi);

        Mobile mobile  = new Mobile(battery, cpu, mobileServices);
        return mobile;
    }

    public void off(Mobile mobile) {
        for(MobileServices service : mobile.getMobileServices()){
            service.close();
        }
        mobile.getCpu().shutdown();
        mobile.getBattery().off();
    }
}
