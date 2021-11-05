package facade;

public class WifiService implements MobileServices{
    @Override
    public void start() {
        System.out.println("WifiService started");
    }

    @Override
    public void close() {
        System.out.println("WifiService closed");
    }
}
