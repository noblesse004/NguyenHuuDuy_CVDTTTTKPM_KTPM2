package Bai4;

public class BicycleFactory implements AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }

    @Override
    public Fuel createFuel() {
        return new HumanPower();
    }
}
