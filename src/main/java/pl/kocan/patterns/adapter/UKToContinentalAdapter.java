package pl.kocan.patterns.adapter;

public class UKToContinentalAdapter implements ContinentalDevice {

    private UKDevice device;

    public UKToContinentalAdapter(UKDevice device) {
        this.device = device;
    }

    @Override
    public void on() {
        device.powerOn();
    }
}
