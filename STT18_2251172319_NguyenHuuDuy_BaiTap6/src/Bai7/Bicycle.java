package Bai7;

public class Bicycle implements IVehicle {
    @Override
    public int GetMaxSpeed() {
        return 30; 
    }

    @Override
    public int GetFuelEfficiency() {
        return 0; 
    }

    @Override
    public int GetWeight() {
        return 15; 
    }
}
