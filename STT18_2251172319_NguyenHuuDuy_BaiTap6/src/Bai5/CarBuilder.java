package Bai5;

class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = null;
    }

    public void buildCar() {
        car = new Car();
    }

    @Override
    public Vehicle getResult() {
        return car;
    }
}