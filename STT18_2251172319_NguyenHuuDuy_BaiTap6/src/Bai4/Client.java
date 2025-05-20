package Bai4;

public class Client {
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void go() {
        Vehicle vehicle = factory.createVehicle();
        Fuel fuel = factory.createFuel();

        System.out.println("Tốc độ tối đa: " + vehicle.GetMaxSpeed());
        System.out.println("Nhiên liệu: " + fuel.getType());
        System.out.println("--------------------------");
    }
}
