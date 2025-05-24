package Bai6;

import java.util.ArrayList;

public class Client {
    private ArrayList<IVehicle> vehicles;

    public Client() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(IVehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void displayMaxSpeeds() {
        for (IVehicle v : vehicles) {
            System.out.println("Tốc độ tối đa: " + v.getMaxSpeed());
        }
    }
}
