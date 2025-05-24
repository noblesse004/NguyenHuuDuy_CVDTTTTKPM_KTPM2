package Bai6;

public class CarAdapter implements IVehicle {
    private Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public int getMaxSpeed() {
        return car.getMaxSpeed();
    }
}