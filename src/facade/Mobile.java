package facade;

import java.util.List;

public class Mobile {
    private final Battery battery;
    private final CPU cpu;
    private final List<MobileServices> mobileServices;

    public Mobile(Battery battery, CPU cpu, List<MobileServices> mobileServices) {
        this.battery = battery;
        this.cpu = cpu;
        this.mobileServices = mobileServices;
    }

    public Battery getBattery() {
        return battery;
    }

    public CPU getCpu() {
        return cpu;
    }

    public List<MobileServices> getMobileServices() {
        return mobileServices;
    }
}
