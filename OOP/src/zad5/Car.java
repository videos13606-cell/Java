package zad5;

public class Car extends Vehicle implements Serviceable {
    public Car(String brand, int maxSpeed) {
        super(brand, maxSpeed);
    }

    @Override
    public double calculateTripCost(double distance) {
        double kmPerLiter = 100 / 7;
        kmPerLiter = Math.round(kmPerLiter * 100) / 100;
        double distanceInLiter = distance / kmPerLiter;
        double priceOfDistance = distanceInLiter * 2.6;
        return priceOfDistance;
    }

    @Override
    public void performService() {
        System.out.println("Service is done.");
    }

    @Override
    public double getServiceCost() {
        return 250;
    }
}
