package Bai7;

public class VehicleManager {
    protected IVehicle vehicle;

    public VehicleManager(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int feature0() {
        return vehicle.GetMaxSpeed();
    }

    public int feature1() {
        return vehicle.GetFuelEfficiency();
    }

    public int feature2() {
        return vehicle.GetWeight();
    }
}
