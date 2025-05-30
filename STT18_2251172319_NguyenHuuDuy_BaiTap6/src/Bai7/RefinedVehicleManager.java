package Bai7;

public class RefinedVehicleManager extends VehicleManager {
    public RefinedVehicleManager(IVehicle vehicle) {
        super(vehicle);
    }
    public double featureN0() {
        int efficiency = feature1(); 
        int speed = feature0(); 
        if (efficiency > 0) {
           
            return efficiency * 50.0;
        } else {
            
            return speed * 2.0;
        }
    }
}
