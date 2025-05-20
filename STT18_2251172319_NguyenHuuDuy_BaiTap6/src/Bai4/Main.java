package Bai4;


public class Main {
    public static void main(String[] args) {
        Client carClient = new Client(new CarFactory());
        carClient.go();

        Client bicycleClient = new Client(new BicycleFactory());
        bicycleClient.go();
    }
}
