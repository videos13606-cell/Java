package zad5;

import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = new Car("Toyota", 120);
        vehicles[1] = new Car("Ford", 180);
        vehicles[2] = new Car("Volkswagen", 120);
        vehicles[3] = new ElectricCar("Tesla", 160);
        vehicles[4] = new ElectricCar("Nissan", 140);
        vehicles[5] = new ElectricCar("Hyundai", 177);

        for (Vehicle v : vehicles) {
            System.out.printf("%s : %.2f \n", v.brand, v.calculateTripCost(200));
        }

        double lowestCost = vehicles[0].calculateTripCost(200);
        String lowestName = vehicles[0].brand;
        for (Vehicle v : vehicles) {
            if (lowestCost > v.calculateTripCost(200)) {
                lowestCost = v.calculateTripCost(200);
                lowestName = v.brand;
            }
        }
        System.out.printf("\nLowest cost is %.2f from the vehicle %s. \n\n", lowestCost, lowestName);

        Serviceable[] serviceableVehicles = new Serviceable[6];
        int count = 0;
        for (Vehicle v : vehicles) {
            serviceableVehicles[count] = (Serviceable) v;
            count++;
        }

        count = 0;
        for (Serviceable v : serviceableVehicles) {
            System.out.printf("Service cost of vehicle number %d : %.2f %n", count, v.getServiceCost());
            v.performService();
            count++;
        }

    }
}
