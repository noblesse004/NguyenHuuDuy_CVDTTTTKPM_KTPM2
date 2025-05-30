package Bai7;

import java.util.ArrayList;

public class Client {
    public void displayVehicleDetails() {
        ArrayList<VehicleManager> managers = new ArrayList<>();
        managers.add(new RefinedVehicleManager(new Car()));
        managers.add(new RefinedVehicleManager(new Bicycle()));
        
        for (VehicleManager manager : managers) {
            System.out.println("Max Speed: " + manager.feature0() + " km/h");
            System.out.println("Fuel Efficiency: " + manager.feature1() + " km/l");
            System.out.println("Weight: " + manager.feature2() + " kg");
            System.out.println("Estimated Travel Range: " + ((RefinedVehicleManager) manager).featureN0() + " km");
            System.out.println();
        }
    }
}
