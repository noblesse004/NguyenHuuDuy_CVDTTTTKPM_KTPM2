package Bai3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<VehicleFactory> factories = new ArrayList<>();
        factories.add(new CarFactory());
        factories.add(new BicycleFactory());

        for (VehicleFactory factory : factories) {
            Vehicle v = factory.createVehicle();
            System.out.println("Tốc độ tối đa: " + v.GetMaxSpeed());
        }
    }
}