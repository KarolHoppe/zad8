import java.util.ArrayList;

public class Main {
    public static ArrayList<Vehicle>vehicles = new ArrayList<>();

    public static void main(String[] args){

        System.out.println(vehicles);

        CAR car = new CAR("xyz", "BMW", 1980, 155, 15);
        System.out.println(car.calculateFuelEfficiency());

        Truck truck = new Truck("xyz1", "IVECO", 2020, 234, 30, 222);
        System.out.println(truck.calculateFuelEfficiency());

        Truck truck2 = new Truck("xyz2", "MAN", 2022, 123, 25, 345);
        System.out.println(truck2.calculateFuelEfficiency());
    }
}