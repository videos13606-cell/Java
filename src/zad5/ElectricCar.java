package zad5;

public class ElectricCar extends Vehicle implements Serviceable {
    public ElectricCar(String brand, int maxSpeed) {
        super(brand, maxSpeed);
    }

    @Override
    public double calculateTripCost(double distance) {
        double kmPerKwh = 100.0 / 18.0;
        kmPerKwh = Math.round(kmPerKwh * 100.0) / 100.0;
        double distanceInKwh = distance / kmPerKwh;
        double priceOfDistance = distanceInKwh * 0.3;
        return priceOfDistance;
    }

    @Override
    public void performService() {
        System.out.println("Service is done.");
    }

    @Override
    public double getServiceCost() {
        return 150;
    }
}
