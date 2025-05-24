package Bai6;

public class BicycleAdapter implements IVehicle {
    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public int getMaxSpeed() {
        return bicycle.getMaxSpeed();
    }
}