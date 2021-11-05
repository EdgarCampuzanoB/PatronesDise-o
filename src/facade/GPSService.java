package facade;

public class GPSService implements MobileServices{

    @Override
    public void start() {
        System.out.println("GPSService started");
    }

    @Override
    public void close() {
        System.out.println("GPSService Closed");
    }
}
