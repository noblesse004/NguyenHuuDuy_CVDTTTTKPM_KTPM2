package Bai6;

public class Main {
    public static void main(String[] args) {
       
        Client client = new Client();
        client.addVehicle(new CarAdapter(new Car()));
        client.addVehicle(new BicycleAdapter(new Bicycle()));
        client.displayMaxSpeeds();
    }
}
