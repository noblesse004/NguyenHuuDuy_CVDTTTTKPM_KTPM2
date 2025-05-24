package Bai5;
import java.util.ArrayList;
class Client {
    private ArrayList<Vehicle> vehicles;

    public Client() {
        this.vehicles = new ArrayList<>();
    }

    public void constructVehicles() {
        // Xây dựng Car
        Director carDirector = new Director(new CarBuilder());
        carDirector.constructCar();
        vehicles.add(carDirector.builder.getResult());

        // Xây dựng Bicycle
        Director bicycleDirector = new Director(new BicycleBuilder());
        bicycleDirector.constructBicycle();
        vehicles.add(bicycleDirector.builder.getResult());
    }

    public void displayMaxSpeeds() {
        for (Vehicle v : vehicles) {
            System.out.println("Tốc độ tối đa: " + v.GetMaxSpeed());
        }
    }
}
