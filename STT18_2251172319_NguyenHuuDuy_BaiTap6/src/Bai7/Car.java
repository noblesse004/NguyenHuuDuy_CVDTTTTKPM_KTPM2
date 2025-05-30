package Bai7;

public class Car implements IVehicle {
    @Override
    public int GetMaxSpeed() {
        return 200;
    }

    @Override
    public int GetFuelEfficiency() {
        return 15; 
    }

    @Override
    public int GetWeight() {
        return 1500; 
    }
}
