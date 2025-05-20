package Bai4;

public class CarFactory implements AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Fuel createFuel() {
        return new Gasoline();
    }
}

