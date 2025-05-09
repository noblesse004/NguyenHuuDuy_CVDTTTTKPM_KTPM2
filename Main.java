package PhuongTien;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bicycle());
        for (Vehicle v : vehicles) {
            System.out.println("Tốc độ tối đa: " + v.GetMaxSpeed());
        }
    }
}