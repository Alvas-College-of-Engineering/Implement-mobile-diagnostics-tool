package model;

public class Device {

    private String deviceName;
    private int battery;
    private int storage;
    private String connectivity;

    public Device(String deviceName,
                  int battery,
                  int storage,
                  String connectivity) {

        this.deviceName = deviceName;
        this.battery = battery;
        this.storage = storage;
        this.connectivity = connectivity;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public int getBattery() {
        return battery;
    }

    public int getStorage() {
        return storage;
    }

    public String getConnectivity() {
        return connectivity;
    }
}