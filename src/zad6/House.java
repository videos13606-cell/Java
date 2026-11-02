package zad6;

public class House extends Property implements Rentable {
    private double yardArea;

    public House(String address, double area, double yardArea) {
        super(address, area);
        this.yardArea = yardArea;
    }

    @Override
    public double calculateTax(double taxRate) {
        return (area + yardArea) * taxRate;
    }

    @Override
    public void rentOut() {
        this.isRented = true;
    }

    @Override
    public void freeUp() {
        this.isRented = false;
    }

    @Override
    public boolean isRented() {
        return this.isRented;
    }
}