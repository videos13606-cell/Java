package zad5;

public abstract class Vehicle {
    protected String brand;
    protected int maxSpeed;
    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    public abstract double calculateTripCost(double distance);
}
